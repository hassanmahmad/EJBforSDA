/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Pack.CalBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hassan
 */
@WebServlet(urlPatterns = {"/CalServlet"})
public class CalServlet extends HttpServlet {

    @EJB
    private CalBean calBean;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        PrintWriter out = res.getWriter();
        
        int i = Integer.parseInt(req.getParameter("t1"));
        int j = Integer.parseInt(req.getParameter("t2"));
        String l = req.getParameter("t3");
          
        int k = calBean.calAdd(i,j);
        List<String> lis = calBean.calAdList(l); 
        ListIterator<String> itr=lis.listIterator();
        out.println("Addition is: " + k + "\n");
        
        out.println("\nAddition done by following people: ");
        while (itr.hasNext())
        {
            out.println("\n" + itr.next());
        }
    }
}
