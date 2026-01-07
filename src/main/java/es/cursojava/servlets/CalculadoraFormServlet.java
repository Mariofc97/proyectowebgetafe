package es.cursojava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculadora-form")
public class CalculadoraFormServlet {

	public CalculadoraFormServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

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

		// Validación
		if (num1Str == null || num2Str == null || op == null) {
			out.println("<p>Error: faltan datos.</p>");
			out.println("<p><a href='form-calculadora.html'>Volver</a></p>");
			out.println("</body></html>");
			return;
		}

		double num1, num2;
		try {
			num1 = Double.parseDouble(num1Str);
			num2 = Double.parseDouble(num2Str);
		} catch (NumberFormatException e) {
			out.println("<p>Error: números inválidos.</p>");
			out.println("<p><a href='form-calculadora.html'>Volver</a></p>");
			out.println("</body></html>");
			return;
		}

		double resultado;
		String simbolo;

	}
}
