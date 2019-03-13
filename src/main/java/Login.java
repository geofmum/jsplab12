import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remememberMe = request.getParameter("remember_me");

        UserDAO db = new UserDAO();

        if (db.hasUser(username, password)){
            User user = db.getUser(username);

            HttpSession session = request.getSession();
            session.setAttribute("user", user.getName());

            Cookie promo = new Cookie("promo", "$100");
            promo.setMaxAge(30*24*60*60);
            response.addCookie(promo);

            if ("yes".equals(remememberMe)){
                Cookie c = new Cookie("username", username);
                c.setMaxAge(30*24*60*60);
                response.addCookie(c);
            } else {
                Cookie c = new Cookie("username", null);
                c.setMaxAge(0);
                response.addCookie(c);
            }

            response.sendRedirect("/user/profile");
        } else {
            response.sendRedirect("/");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
