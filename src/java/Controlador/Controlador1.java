/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Horarios;
import ModeloDAO.HorariosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Time;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Franklin
 */
@WebServlet(name = "Controlador1", urlPatterns = {"/Controlador1"})
public class Controlador1 extends HttpServlet {
    String listarHorarios="vistasHorarios/listarHorarios.jsp";
    String addHorarios="vistasHorarios/addHorarios.jsp";
    String editHorarios="vistasHorarios/editHorarios.jsp";
    Horarios h=new Horarios();
    HorariosDAO dao=new HorariosDAO();
    int id;
    Date fecha;
    Time hora;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listarHorarios")){
            acceso=listarHorarios;            
        }else if(action.equalsIgnoreCase("addHorarios")){
            acceso=addHorarios;
        }
        else if(action.equalsIgnoreCase("Agregar")){
            String nom=request.getParameter("txtNom");
            String ape=request.getParameter("txtApe");
            fecha = Date.valueOf(request.getParameter("txtFecha"));
            hora = Time.valueOf(request.getParameter("txtHora"));
            h.setNom(nom);
            h.setApe(ape);
            h.setFecha(fecha);
            h.setHora(hora);
            dao.add(h);
            acceso=listarHorarios;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idhor",request.getParameter("id"));
            acceso=editHorarios;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("txtid"));
            String nom=request.getParameter("txtNom");
            String ape=request.getParameter("txtApe");
            fecha =Date.valueOf(request.getParameter("txtFecha"));
            hora = Time.valueOf(request.getParameter("txtHora"));
            h.setId(id);
            h.setNom(nom);
            h.setApe(ape);
            h.setFecha(fecha);
            h.setHora(hora);
            dao.edit(h);
            acceso=listarHorarios;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            id=Integer.parseInt(request.getParameter("id"));
            h.setId(id);
            dao.eliminar(id);
            acceso=listarHorarios;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
