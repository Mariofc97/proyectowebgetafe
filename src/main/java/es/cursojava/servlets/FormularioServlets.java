package es.cursojava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormularioServlets
 */
@WebServlet("/formulariogetafe")
public class FormularioServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FormularioServlets() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!doctype html>");
        out.println("<html lang='es'>");
        out.println("<head><meta charset='UTF-8'><title>Formulario</title></head>");
        out.println("<body>");

        out.println("<h1>Formulario por GET</h1>");

        // action = a este mismo servlet (misma URL)
        out.println("<form method='get' action='" + request.getRequestURI() + "'>");
        out.println("  <label>Nombre: <input type='text' name='nombre'></label><br><br>");
        out.println("  <label>Edad: <input type='number' name='edad'></label><br><br>");
        out.println("  <button type='submit'>Enviar</button>");
        out.println("</form>");

        // Mostrar lo que llega por GET (aparecerá en la URL)
        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        if (nombre != null || edad != null) {
            out.println("<hr>");
            out.println("<h2>Parámetros recibidos (GET)</h2>");
            out.println("<p>nombre = " + (nombre == null ? "" : nombre) + "</p>");
            out.println("<p>edad = " + (edad == null ? "" : edad) + "</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
