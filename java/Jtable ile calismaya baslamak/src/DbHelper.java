import java.sql.*;
public class DbHelper {
    private String userName="root";
    private String password="123";
    private String dbUrl="jdbc:mysql://localhost:3306/world?useSSl=false&Timezone?UTC ";
    public Connection getConnection()throws SQLException{
return DriverManager.getConnection(dbUrl,userName,password);
}
    
    public void showErrormessage(SQLException exception){
        System.out.println("Error: "+exception.getMessage());
        System.out.println("Error code:"+exception.getErrorCode());
    
    } 
}
