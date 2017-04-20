package br.com.aprendendo.refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aninhamento extends JFrame{
	
	JButton botao;
	
	public Aninhamento(){
		super("Aninhamento");
		
		botao = new JButton("ok");
		botao.addActionListener(new ListenerAninhado());//aninhada
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Classe anonima executa " + botao.getText());
			}
		});//anonima
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
		
	}
	
	public class ListenerAninhado implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Classe aninhada executa " + botao.getText());
		}
		
	}
	
	public static void main(String[] args) {
		Aninhamento janela = new Aninhamento();
		Aninhamento.ListenerAninhado listener = janela.new ListenerAninhado(); 

	}

}
