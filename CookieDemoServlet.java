
package EIG;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.net.URLEncoder;
import java.net.URLDecoder;

@WebServlet("/cookieDemo")  // ← This makes it available at /cookieDemo
public class CookieDemoServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Show the HTML form when accessed directly via GET
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cookie Demo</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 50px; background-color: #f0f0f0; }");
        out.println(".container { background-color: white; padding: 30px; border-radius: 10px; width: 400px; margin: auto; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
        out.println("input[type='text'] { width: 100%; padding: 10px; margin: 10px 0; border: 1px solid #ddd; border-radius: 5px; }");
        out.println("input[type='submit'] { background-color: #4CAF50; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer; }");
        out.println("input[type='submit']:hover { background-color: #45a049; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h2>Cookie Demo Application</h2>");
        out.println("<form action='cookieDemo' method='post'>");
        out.println("<label for='name'>Enter your name:</label>");
        out.println("<input type='text' name='username' id='name' required>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Get username from form
        String username = request.getParameter("username");
        
        if (username == null || username.trim().isEmpty()) {
            out.println("<h3>Error: Please enter a name!</h3>");
            out.println("<a href='cookieDemo'>Go Back</a>");
            return;
        }
        
        // Get existing cookies
        Cookie[] cookies = request.getCookies();
        int visitCount = 1;
        boolean isExistingUser = false;
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("userName")) {
                    String existingName = URLDecoder.decode(cookie.getValue(), "UTF-8");
                    if (existingName.equals(username)) {
                        isExistingUser = true;
                    }
                }
                if (cookie.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(cookie.getValue()) + 1;
                }
            }
        }
        
        // Create cookies
        Cookie userCookie = new Cookie("userName", URLEncoder.encode(username, "UTF-8"));
        userCookie.setMaxAge(30 * 24 * 60 * 60); // 30 days
        userCookie.setPath("/");
        
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
        visitCookie.setMaxAge(30 * 24 * 60 * 60); // 30 days
        visitCookie.setPath("/");
        
        // Demo expiring cookie (expires in 15 seconds)
        Cookie expiringCookie = new Cookie("demoExpiring", "ThisWillExpireIn15Seconds");
        expiringCookie.setMaxAge(15); // 15 seconds
        expiringCookie.setPath("/");
        
        response.addCookie(userCookie);
        response.addCookie(visitCookie);
        response.addCookie(expiringCookie);
        
        // Generate HTML Response
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Welcome</title>");
        out.println("<style>");
        out.println("body { font-family: Arial; margin: 50px; background: #f0f0f0; }");
        out.println(".container { background: white; padding: 30px; border-radius: 10px; max-width: 900px; margin: auto; }");
        out.println(".greeting { background: #4CAF50; color: white; padding: 20px; border-radius: 5px; }");
        out.println("table { width: 100%; border-collapse: collapse; margin-top: 20px; }");
        out.println("th, td { border: 1px solid #ddd; padding: 10px; text-align: left; }");
        out.println("th { background: #4CAF50; color: white; }");
        out.println(".info { background: #e7f3ff; padding: 15px; margin-top: 20px; border-left: 4px solid #2196F3; }");
        out.println(".expiry-box { background: #fff3e0; padding: 15px; margin-top: 20px; border-left: 4px solid #ff9800; }");
        out.println(".button { display: inline-block; padding: 10px 15px; margin: 5px; background: #4CAF50; color: white; text-decoration: none; border-radius: 5px; }");
        out.println("</style>");
        out.println("</head><body>");
        out.println("<div class='container'>");
        
        // Welcome message
        out.println("<div class='greeting'>");
        if (isExistingUser) {
            out.println("<h2>Welcome back " + username + "!</h2>");
        } else {
            out.println("<h2>Welcome " + username + "!</h2>");
        }
        out.println("<p>You have visited this page <strong>" + visitCount + "</strong> time(s).</p>");
        out.println("</div>");
        
        // Display all cookies
        out.println("<h3>📋 All Cookies Information:</h3>");
        out.println("<table>");
        out.println(" hilab<th>Cookie Name</th><th>Cookie Value</th><th>Max Age (seconds)</th><th>Path</th></tr>");
        
        Cookie[] allCookies = request.getCookies();
        if (allCookies != null && allCookies.length > 0) {
            for (Cookie c : allCookies) {
                out.println("<tr>");
                out.println("<td>" + c.getName() + "</td>");
                out.println("<td>" + URLDecoder.decode(c.getValue(), "UTF-8") + "</td>");
                out.println("<td>" + c.getMaxAge() + "</td>");
                out.println("<td>" + (c.getPath() != null ? c.getPath() : "/") + "</td>");
                out.println("</tr>");
            }
        } else {
            out.println("<tr><td colspan='4'>No cookies found</td><tr>");
        }
        out.println("</table>");
        
        // Expiry demonstration
        out.println("<div class='expiry-box'>");
        out.println("<h3>⏰ Cookie Expiry Demonstration:</h3>");
        out.println("<p>✅ <strong>User cookie ('userName')</strong> - Expires in 30 days (2,592,000 seconds)</p>");
        out.println("<p>✅ <strong>Visit count cookie ('visitCount')</strong> - Expires in 30 days (2,592,000 seconds)</p>");
        out.println("<p>⚠️ <strong>Demo expiring cookie ('demoExpiring')</strong> - Expires in <strong>15 seconds</strong>!</p>");
        out.println("<p><strong>🧪 Test:</strong> Refresh this page after 15 seconds - the 'demoExpiring' cookie will disappear!</p>");
        out.println("</div>");
        
        // How to test expiry
        out.println("<div class='info'>");
        out.println("<h3>📖 How to Test Cookie Expiry:</h3>");
        out.println("<ol>");
        out.println("<li>Note the 'demoExpiring' cookie in the table above (Max Age = 15)</li>");
        out.println("<li>Wait for 15 seconds</li>");
        out.println("<li>Refresh the page (F5 or Ctrl+R)</li>");
        out.println("<li>The 'demoExpiring' cookie will no longer appear in the table!</li>");
        out.println("<li>The 'userName' and 'visitCount' cookies will persist for 30 days</li>");
        out.println("</ol>");
        out.println("<p><a href='cookieDemo' class='button'>← Back to Form</a> ");
        out.println("<a href='cookieDemo?action=delete' class='button' style='background:#f44336;'>🗑️ Delete All Cookies</a></p>");
        out.println("</div>");
        
        out.println("</div></body></html>");
    }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Handle cookie deletion
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                cookie.setMaxAge(0);
                cookie.setPath("/");
                response.addCookie(cookie);
            }
        }
        response.sendRedirect("cookieDemo");
    }
}