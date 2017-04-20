package br.com.aprendendo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener {
	
	JButton botao;
	
	public Eventos(){
		super("Eventos");
		
		botao = new JButton("Click");
		botao.addActionListener(this);
		getContentPane().add(botao);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Eventos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		botao.setText("Foi clicado");
		
	}

}
