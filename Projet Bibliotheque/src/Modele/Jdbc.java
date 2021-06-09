package Modele;

import java.sql.*;

public class Jdbc {
	private Statement chStatement;
	
	public Jdbc() throws SQLException, ClassNotFoundException {
		//Connexion
	  	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		System.out.println("Connexion à la base de données de la bibliothèque...");
		//statement = DriverManager.getConnection (identifiants de connexion).createStatement ();
		chStatement = DriverManager.getConnection (identifiants de connexion).createStatement ();
		System.out.println("Connecté à la base de données de la bibliothèque...");
	}

	 public Statement getStatement() {
		return chStatement;
	 }
}
