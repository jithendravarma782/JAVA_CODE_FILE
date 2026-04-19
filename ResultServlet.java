/*10.b Build an Application to get Rollno, Studentname, Sub1, Sub2, Sub3, Sub4 and
 *  Sub5 through JSP called index.jsp with client sided validation and submit to
 *   the servlet called ResultServlet and process all the fields with server sided
 *    validation and display all the data along with result ( Pass if all subjects
 *     greater than 40%) and Average marks through result.jsp with a link to move to 
 *     the client side*/
package TEN;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String rollno = request.getParameter("rollno");
            String name = request.getParameter("name");

            int sub1 = Integer.parseInt(request.getParameter("sub1"));
            int sub2 = Integer.parseInt(request.getParameter("sub2"));
            int sub3 = Integer.parseInt(request.getParameter("sub3"));
            int sub4 = Integer.parseInt(request.getParameter("sub4"));
            int sub5 = Integer.parseInt(request.getParameter("sub5"));

            // Server-side validation
            if (rollno.isEmpty() || name.isEmpty()) {
                response.getWriter().println("All fields required!");
                return;
            }

            int[] marks = {sub1, sub2, sub3, sub4, sub5};

            for (int m : marks) {
                if (m < 0 || m > 100) {
                    response.getWriter().println("Marks must be between 0 and 100");
                    return;
                }
            }

            // Calculate result
            int total = sub1 + sub2 + sub3 + sub4 + sub5;
            double average = total / 5.0;

            boolean pass = true;
            for (int m : marks) {
                if (m < 40) {
                    pass = false;
                    break;
                }
            }

            String result = pass ? "Pass" : "Fail";

            // Set attributes
            request.setAttribute("rollno", rollno);
            request.setAttribute("name", name);
            request.setAttribute("sub1", sub1);
            request.setAttribute("sub2", sub2);
            request.setAttribute("sub3", sub3);
            request.setAttribute("sub4", sub4);
            request.setAttribute("sub5", sub5);
            request.setAttribute("average", average);
            request.setAttribute("result", result);

            // Forward to JSP
            RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            response.getWriter().println("Invalid Input!");
        }
    }
}