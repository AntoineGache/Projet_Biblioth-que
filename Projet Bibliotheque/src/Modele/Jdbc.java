package Modele;

import java.sql.*;

public class Jdbc {
	private Statement chStatement;
	
	public Jdbc() throws SQLException, ClassNotFoundException {
		//Connexion
	  	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		System.out.println("Connexion à la base de données de la bibliothèque...");
		//statement = DriverManager.getConnection ("jdbc:oracle:thin:@madere:1521:info","apellegr", "azerty").createStatement ();
		chStatement = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:info","apellegr", "azerty").createStatement ();
		System.out.println("Connecté à la base de données de la bibliothèque...");
	}

	 public Statement getStatement() {
		return chStatement;
	 }
}