package TicTacToe;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fenetre {
	
	public void lancerPartie(){
		
		JFrame f = new JFrame();
		JButton creerJ1 = new JButton("Creer Joueur1");
		JButton creerJ2 = new JButton("Creer Joueur2");
		JButton rejouer = new JButton("New Game");
		GridBagConstraints GBC = new GridBagConstraints();
		
		
		f.setTitle("TicTacToe");
		f.setSize(600,600);
		f.setLayout(new GridBagLayout());
		f.add(creerJ1,GBC);
		f.add(creerJ2,GBC);
		f.add(rejouer,GBC);
		
		f.setVisible(true);
		
	}
	
	public void creerJoueur(){
		
	}
	
	public void rejouerpartie(){
		
	}
}
