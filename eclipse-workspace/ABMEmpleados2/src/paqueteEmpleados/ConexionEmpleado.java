package paqueteEmpleados;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionEmpleado {

	private static Connection cn;

	public static Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cn = (Connection)DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BDDEmpleados","sa","bocajuniors");
			//Esto deberia hacerlo aparte
			PreparedStatement pst=null;
			String consulta="SELECT* FROM Empleados";
			pst=cn.prepareStatement(consulta);
			ResultSet rs=pst.executeQuery();
			System.out.println("Legajo"+" "+"DNI"+" "+"Nombre"+" "+"Apellido"+" "+"Telefono"+" "+"Sexo"+" "+"Sueldo" );
			while(rs.next()) {
				System.out.println(/*"%3d %8s %25s %25s %10s %c %5.2f",*/rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
			}
			//
		
			
		} catch (Exception e) {
			cn = null;
		}
		return cn;
	}
	public static void main(String []args)  {
		Connection prueba=ConexionEmpleado.getConnection();
		if(prueba!=null) {
			System.out.println("Conectado...");
			System.out.println(prueba);
		}
			
		else
			System.out.println("Desconectado");
		
//		prueba.close();
	}
}
