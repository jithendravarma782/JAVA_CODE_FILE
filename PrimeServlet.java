/*6c. Build a servlet program to check the given number is prime number or not using HTML 
 * with step by step procedure*/
package SIXC;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int num = Integer.parseInt(request.getParameter("num"));
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Display result
            out.println("<html><body>");
            if (isPrime) {
                out.println("<h2>" + num + " is a Prime Number</h2>");
            } else {
                out.println("<h2>" + num + " is NOT a Prime Number</h2>");
            }
            out.println("</body></html>");

        } catch (Exception e) {
            out.println("<h2>Invalid input!</h2>");
        }
    }
}