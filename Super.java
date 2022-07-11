package Supermark;
import java.sql.*;
public class Super {
        static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        static final String DB_URL="jdbc:mysql://127.0.0.1:3306/supermarkpro_x";
        static final String USER = "root";
        static final String PASS="20692548";
        public static void main(String args[]) throws SQLException {
        	Connection conn=null;
    		Statement stmt = null;
    		System.out.println("CONECTANDO A LA BASE DE DATOS...");
    		conn = DriverManager.getConnection(DB_URL, USER, PASS);
    		System.out.println("CREANDO EL STATEMENT....");
    		stmt = conn.createStatement();
    		String sql;
    		sql="select name_client from usuario";
    		ResultSet rs = stmt.executeQuery(sql);
    		while(rs.next()) {
    			String name_client=rs.getString("name_client");
    			//String id_category=rs.getString("id_category");
    			System.out.println("USUARIO: "+name_client);
 //System.out.println("USUARIO: "+id_category);
 //System.out.println("USUARIO: "+id_type_user);
            }      
        		rs.close();
        		conn.close();
        		stmt.close();
    }
}