/*9.a Build a Session Management using Servlet program set with one minute
 *  session to show Session Tracking Information, Session ID,Session Creation
 *   Time,Last Access Time,Visit Count*/
package NIN;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.Date;

@WebServlet("/sessionDemo")
public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get session
        HttpSession session = request.getSession(true);

        // Set session timeout (1 minute = 60 seconds)
        session.setMaxInactiveInterval(60);

        // Visit count logic
        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }

        session.setAttribute("visitCount", visitCount);

        // Get session details
        String sessionId = session.getId();
        Date creationTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());

        // Display output
        out.println("<html><body>");

        out.println("<h2>Session Tracking Information</h2>");
        out.println("<p><b>Session ID:</b> " + sessionId + "</p>");
        out.println("<p><b>Creation Time:</b> " + creationTime + "</p>");
        out.println("<p><b>Last Access Time:</b> " + lastAccessTime + "</p>");
        out.println("<p><b>Visit Count:</b> " + visitCount + "</p>");

        out.println("<p>(Session expires after 1 minute of inactivity)</p>");

        out.println("</body></html>");
    }
}