package es.cursojava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculadora-form")
public class CalculadoraFormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CalculadoraFormServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String op = request.getParameter("op");

        out.println("<!doctype html>");
        out.println("<html lang='es'>");
        out.println("<head><meta charset='UTF-8'><title>Resultado</title></head>");
        out.println("<body>");
        out.println("<h1>Resultado</h1>");

        if (num1Str == null || num2Str == null || op == null) {
            out.println("<p>Error: faltan datos.</p>");
            out.println("<p><a href='EjercicioCalculadora/form-calculadora.html'>Volver</a></p>");
            out.println("</body></html>");
            return;
        }

        double num1, num2;
        try {
            num1 = Double.parseDouble(num1Str);
            num2 = Double.parseDouble(num2Str);
        } catch (NumberFormatException e) {
            out.println("<p>Error: números inválidos.</p>");
            out.println("<p><a href='EjercicioCalculadora/form-calculadora.html'>Volver</a></p>");
            out.println("</body></html>");
            return;
        }

        double resultado;
        String simbolo;

        switch (op) {
            case "suma":
                resultado = num1 + num2;
                simbolo = "+";
                break;
            case "resta":
                resultado = num1 - num2;
                simbolo = "-";
                break;
            case "multi":
                resultado = num1 * num2;
                simbolo = "*";
                break;
            case "div":
                if (num2 == 0) {
                    out.println("<p>Error: no se puede dividir entre 0.</p>");
                    out.println("<p><a href='EjercicioCalculadora/form-calculadora.html'>Volver</a></p>");
                    out.println("</body></html>");
                    return;
                }
                resultado = num1 / num2;
                simbolo = "/";
                break;
            default:
                out.println("<p>Error: operación no válida.</p>");
                out.println("<p><a href='EjercicioCalculadora/form-calculadora.html'>Volver</a></p>");
                out.println("</body></html>");
                return;
        }

        out.println("<p>" + num1 + " " + simbolo + " " + num2 + " = <b>" + resultado + "</b></p>");
        out.println("<p><a href='EjercicioCalculadora/form-calculadora.html'>Hacer otra operación</a></p>");

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
