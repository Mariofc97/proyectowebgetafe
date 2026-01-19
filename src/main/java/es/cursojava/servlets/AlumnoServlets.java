package es.cursojava.servlets;

import java.io.IOException;

import es.cursojava.hibernate.ejercicios.ejercicio1correccion.dto.AlumnoDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AlumnoServlets extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = req.getParameter("nombre");
		String email = req.getParameter("email");
		Integer edad = Integer.parseInt(req.getParameter("edad"));
		
		AlumnoDTO alumnoDTO = new AlumnoDTO(nombre, email, edad);
		AlumnoService 
	}

	
	
}
