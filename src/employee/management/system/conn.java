package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@SuppressWarnings("ALL")
public class conn {

    Connection connection;
    Statement statement;

    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemangementsystem","root","Anuj@1303");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}