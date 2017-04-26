/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Silvia
 */
public class Exemplo1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Exemplo1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Exemplo1 at " + request.getContextPath() + 
                    "</h1>");
            //GetServerInfo é herdado e pode ser chamado diretamente.
            out.println("<h2>3.1 Informações Gerais sobre o Servlet: <br/>" + 
                    "Informações Gerais: " + getServletInfo() + "</h2>");
            //GetServletConfig é herdado e pode ser chamado diretamente.
            out.println("<h2>3.2 Contexto e nome do Servlet:<br/> "
                    + "Nome: " + getServletConfig().getServletName() + "<br/>"
                    + "Contexto: " + getServletConfig().getServletContext() + "<br/></h2>");
            //GetServerInfo é herdado e pode ser chamado diretamente.
            out.println("<h2>3.3 Nome e versão do container:<br/> "
                    + "Possibilidade 1: " + getServletContext().getServerInfo() + "<br/>"
                    + "Possibilidade 2: " + request.getServletContext().getServerInfo() + "<br/></h2>");
            //GetServerInfo é herdado e pode ser chamado diretamente.
            out.println("<h2>3.4 Nome da aplicação do Servlet:<br/> "
                    + "Nome: " + getServletName() + "<br/>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
