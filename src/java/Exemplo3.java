/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Silvia
 */
@WebServlet(urlPatterns = {"/Exemplo3"})
public class Exemplo3 extends HttpServlet {

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
            out.println("<title>Servlet Exemplo3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Exemplo3 </h1>");
            out.println("<h2>Num1 = " + request.getParameter("num1")+ " </h2>");
            out.println("<h2>Num2 = " + request.getParameter("num2")+ " </h2>");
            
            Enumeration enumera = request.getHeaderNames();
            while (enumera.hasMoreElements()){
                String nome = enumera.nextElement().toString();
            out.println("<h1>"+ nome +"<h1/>");
            out.println("<h1>" + request.getHeader(nome) + "<h1/>");
        }
            out.println("<h2>Cabeçalho = " + request.getHeader("cookie")+ " </h2>");
            out.println("<h2>Endereço IP = " + request.getRemoteAddr()+ " </h2>");
            out.println("<h2>Número da Porta = " + request.getServerPort()+ " </h2>");
            out.println("<h2>Nome do Host = " + request.getServerName()+ " </h2>");
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
