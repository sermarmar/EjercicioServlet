package com.cice.servlet;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebService(name = "")
public class ServicioLogin extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Llamando a POST");
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");

        System.out.println("Usuario: "+user+ "Contraseña: "+pass);

    }
}
