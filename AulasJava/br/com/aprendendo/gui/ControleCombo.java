package br.com.aprendendo.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame{
	
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("IMG/favoritos.png")),
			new ImageIcon(getClass().getResource("IMG/harpa_transparente.png")),
			new ImageIcon(getClass().getResource("IMG/lupa.png")),
			new ImageIcon(getClass().getResource("IMG/sobre_transparente.png"))
	};
	
	public ControleCombo(){
		super("Album de fotos");
		
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("serif", Font.PLAIN, 26));
		combo.addItem("Favoritos");
		combo.addItem("Harpa");
		combo.addItem("Lupa");
		combo.addItem("Sobre");
		combo.addItemListener(new ComboBox());
		
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		setSize(300,530);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ComboBox implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED){
				label.setIcon(imagens[combo.getSelectedIndex()]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		new ControleCombo();

	}

}
