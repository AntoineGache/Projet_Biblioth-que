package Modele;

import java.sql.*;

public class Jdbc {
	private Statement chStatement;
	
	public Jdbc() throws SQLException, ClassNotFoundException {
		//Connexion
	  	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		System.out.println("Connexion � la base de donn�es de la biblioth�que...");
		//statement = DriverManager.getConnection ("jdbc:oracle:thin:@madere:1521:info","apellegr", "azerty").createStatement ();
		chStatement = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:info","apellegr", "azerty").createStatement ();
		System.out.println("Connect� � la base de donn�es de la biblioth�que...");
	}

	 public Statement getStatement() {
		return chStatement;
	 }
}