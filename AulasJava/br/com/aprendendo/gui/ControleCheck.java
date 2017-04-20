package br.com.aprendendo.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame {
	
	JCheckBox bold,italic;
	JTextField texto;
	public ControleCheck(){
		super("CheckBox");
		
		bold = new JCheckBox("Bold");
		italic = new JCheckBox("Italic");
		bold.addItemListener(new CheckListener());
		italic.addItemListener(new CheckListener());
		
		texto = new JTextField("Veja a Fonte Mudar", 12);
		texto.setFont(new Font("serif", Font.PLAIN, 26));
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(texto);
		c.add(bold);
		c.add(italic);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class CheckListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(bold.isSelected() && italic.isSelected()){
				texto.setFont(new Font("Serif",Font.BOLD | Font.ITALIC, 26));
			} else if(bold.isSelected()){
				texto.setFont(new Font("Serif",Font.BOLD, 26));
			} else if(italic.isSelected()){
				texto.setFont(new Font("Serif",Font.ITALIC, 26));
			} else 
				texto.setFont(new Font("Serif",Font.PLAIN, 26));
			
		}
		
	}
	
	public static void main(String[] args) {
		new ControleCheck();

	}

}
