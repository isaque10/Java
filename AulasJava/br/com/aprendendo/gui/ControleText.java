package br.com.aprendendo.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleText extends JFrame implements ActionListener{
	
	JButton ok, cancel;
	JTextField login;
	JPasswordField senha;
	
	public ControleText(){
		super("Texto e Senhas");
		
		ok = new JButton("Ok");
		ok.addActionListener(new BotaoOkListener());
		
		cancel = new JButton("Cancel");
		cancel.addActionListener(new BotaoCancelListener());
		
		login = new JTextField();
		senha = new JPasswordField();
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("Login"));
		c.add(login);
		c.add(new JLabel("Senha"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ControleText();	

	}
	
	class BotaoOkListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == ok){
				String s = "login: " + login.getText()
						+ "\nsenha: " + new String (senha.getPassword());
				JOptionPane.showMessageDialog(null, s);
			}
		}
	}
	class BotaoCancelListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				senha.setText("");
				login.setText("");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
