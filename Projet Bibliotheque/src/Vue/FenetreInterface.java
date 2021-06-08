package Vue;

import java.sql.*;

import javax.swing.JFrame ;

import Constantes.*;
import Controleur.*;
import Modele.Jdbc;

public class FenetreInterface extends JFrame implements ConstantesInterfaces {
	private static final long serialVersionUID = 5713084436146948003L;
	
    public FenetreInterface (Statement parStmt) throws SQLException {
        super("Interface Login");
        PanelFormulaireConnexion paneFormulaireConnexion = new PanelFormulaireConnexion();
        
        setContentPane(paneFormulaireConnexion);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(HORIZONTAL,VERTICAL); setVisible(true); setLocation (POS_X,POS_Y);
        setBackground (BLANC);
        
        new ControleurConnexion(this, paneFormulaireConnexion, parStmt);
    }

    
    public static void main (String  [] args) throws ClassNotFoundException, SQLException {
    	
    	Jdbc connexion = new Jdbc();
    	Statement stmt = connexion.getStatement();
        new FenetreInterface(stmt);
    }
}

