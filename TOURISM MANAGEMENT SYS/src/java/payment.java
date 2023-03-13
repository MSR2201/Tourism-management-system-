import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class payment extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        
        final String JDBC_DRIVER="com.mysql.jdbc.Driver";
        final String DB_URL="jdbc:mysql://localhost:3306/tourist";
        final String USER="root";
        final String PASS="";
        
        
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");

        int a=1;
        
        System.out.println(username);

     
            try {
                
                Class.forName(JDBC_DRIVER);
                Connection C;
                try {
                    C = DriverManager.getConnection(DB_URL,USER,PASS);
                    int b=1;
                    
                    PreparedStatement pst = C.prepareStatement("alter user set eligible='"+b+"' where username='"+username+"' ");
                    
                    
                 
                int i = pst.executeUpdate();
                 if(i!=0) {


                    
                    RequestDispatcher R = request.getRequestDispatcher("./userlogin.html");
                    R.forward(request, response);
                    
                   
                }
                else {
                    System.out.println("coming in");
                    RequestDispatcher R1 = request.getRequestDispatcher("./failure.html");
                    R1.include(request, response);
                     
                }
                } catch (SQLException ex) {
                    Logger.getLogger(adminlogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(adminlogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
       @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
