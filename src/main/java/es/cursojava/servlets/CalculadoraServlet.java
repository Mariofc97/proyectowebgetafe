package es.cursojava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculadora")
public class CalculadoraServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public CalculadoraServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
			    response.setContentType("text/html; charset=UTF-8");
			    
	PrintWriter out = response.getWriter();
	
	String op = request.getParameter("op");
	String aStr = request.getParameter("a");
	String bStr = request.getParameter("b");
	
	out.println("<!doctype html>");
	out.println("<html lang='es'>");
	out.println("<head><meta charset='UTF-8'><title>Calculadora</title></head>");
	out.println("<body>");
	out.println("<h1>Calculadora por GET</h1>");

	if (op == null || aStr == null || bStr == null) {
		out.println("<h2>Error: Faltan parámetros.</h2>");
		out.println("</body></html>");
		return;
	}
	
	int a, b;
	try {
		a = Integer.parseInt(aStr);
		b = Integer.parseInt(bStr);
	} catch (NumberFormatException e) {
		out.println("<h2>Error: Parámetros no son números válidos.</h2>");
		out.println("</body></html>");
		return;
	}
	
	switch (op) {
		case "suma":
			out.println("<h2>Resultado: " + (a + b) + "</h2>");
			break;
		case "resta":
			out.println("<h2>Resultado: " + (a - b) + "</h2>");
			break;
		case "multiplicacion":
			out.println("<h2>Resultado: " + (a * b) + "</h2>");
			break;
		default:
			out.println("<h2>Error: Operación no válida.</h2>");
			break;
	}
	out.println(op);
	
    out.println("</body>");
    out.println("</html>");
    }

}
