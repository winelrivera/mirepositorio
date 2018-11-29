package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MiServlet
 */
@WebServlet("/miservlet")
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("num1"));
		int id1=Integer.parseInt(request.getParameter("num2"));
		
		MiClase operacion = new MiClase();
		int resultado = operacion.suma(id, id1);

		//Guardo la lista de contactos como atributo de la peticion
		
		request.setAttribute("total",resultado);
		//Elegir la vista que mostrara el resultado
		RequestDispatcher rd2= request.getRequestDispatcher("/resultado.jsp");
		
		//Redigirimos la peticion hacia ella
		rd2.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
