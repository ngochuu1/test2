package murach.survey;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServlet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import murach.business.User;

public class SurveyListServlet extends HttpServlet  {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
                // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dobString = request.getParameter("dob");
            System.out.println("DOB String: " + dobString);
            String heardFrom = request.getParameter("heardFrom");
            boolean wantsUpdates = request.getParameter("wantsUpdates") != null;
            String contactVia = request.getParameter("contactVia");
            
            // store data in User object and save User object in db
            Date dob = null;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
             try {
                dob = sdf.parse(dobString); // Chuyển đổi chuỗi thành Date
                } catch (ParseException e) {
                    e.printStackTrace(); // In ra lỗi nếu có
                }

            User user = new User(email, firstName, lastName, dob, heardFrom, wantsUpdates, contactVia);
            // set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/thanks.jsp";   // the "thanks" page
        }
        
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }    
            @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }    
}
