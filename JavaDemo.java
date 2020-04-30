import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
class JavaDemo extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
	PrintWriter out=response.getWriter();
	String s1=request.getParameter("n1");
	String s2="dependent";
	int c=0;
	out.println("<html>");
	out.println("<body>");
	/*if(s1.equals(s2))
	{
		c++;
		out.println(c);
	}*/
	out.println("<p>ram</p>");
	out.println("</body>");
	out.println("</html>");
	out.close();
	}
}