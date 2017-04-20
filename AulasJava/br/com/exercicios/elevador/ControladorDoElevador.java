package br.com.exercicios.elevador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.eclipse.wb.swing.FocusTraversalOnArray;

public class ControladorDoElevador extends JFrame {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControladorDoElevador frame = new ControladorDoElevador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ControladorDoElevador() {
		setTitle("ElevSystemZ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 451);
		setVisible(true);
		
		Container c1 = getContentPane();
		c1.setLayout(new BorderLayout(20, 20));
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(10, 3));
		
		
		Predio p1 = new Predio();
		
		//9º andar
		JLabel lblA9 = new JLabel("");
		lblA9.setBackground(Color.GRAY);
		lblA9.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblA9);
		JLabel lblB9 = new JLabel("");
		lblB9.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblB9);
		lblA9.setName("lblA9");
		System.out.println(lblA9.getName());
		JButton btn9 = new JButton("Chamar");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1.p9.chamarElevador(p1.elevador1, p1.elevador2) == 1){
					try {
						percorrerLabel("A", p1.elevador1, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else{
					try {
						percorrerLabel("B", p1.elevador2, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		c2.add(btn9);
		
		//8º andar
		JLabel lblA8 = new JLabel("");
		lblA8.setBackground(Color.GRAY);
		lblA8.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblA8);
		JLabel lblB8 = new JLabel("");
		lblB8.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblB8);
		JButton btn8 = new JButton("Chamar");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1.p8.chamarElevador(p1.elevador1, p1.elevador2) == 1){
					try {
						percorrerLabel("A", p1.elevador1, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else{
					try {
						percorrerLabel("B", p1.elevador2, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		c2.add(btn8);
		
		//7º andar
		JLabel lblA7 = new JLabel("");
		lblA7.setBackground(Color.GRAY);
		lblA7.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblA7);
		JLabel lblB7 = new JLabel("");
		lblB7.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblB7);
		JButton btn7 = new JButton("Chamar");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1.p7.chamarElevador(p1.elevador1, p1.elevador2) == 1){
					try {
						percorrerLabel("A", p1.elevador1, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else{
					try {
						percorrerLabel("B", p1.elevador2, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		c2.add(btn7);
		
		//6º andar
		JLabel lblA6 = new JLabel("");
		lblA6.setBackground(Color.GRAY);
		lblA6.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblA6);
		JLabel lblB6 = new JLabel("");
		lblB6.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblB6);
		JButton btn6 = new JButton("Chamar");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1.p6.chamarElevador(p1.elevador1, p1.elevador2) == 1){
					try {
						percorrerLabel("A", p1.elevador1, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else{
					try {
						percorrerLabel("B", p1.elevador2, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		c2.add(btn6);
		
		//5º andar
		JLabel lblA5 = new JLabel("");
		lblA5.setBackground(Color.GRAY);
		lblA5.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblA5);
		JLabel lblB5 = new JLabel("");
		lblB5.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblB5);
		JButton btn5 = new JButton("Chamar");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1.p5.chamarElevador(p1.elevador1, p1.elevador2) == 1){
					try {
						percorrerLabel("A", p1.elevador1, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else{
					try {
						percorrerLabel("B", p1.elevador2, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		c2.add(btn5);
		
		//4º andar
		JLabel lblA4 = new JLabel("");
		lblA4.setBackground(Color.GRAY);
		lblA4.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblA4);
		JLabel lblB4 = new JLabel("");
		lblB4.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblB4);
		JButton btn4 = new JButton("Chamar");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1.p4.chamarElevador(p1.elevador1, p1.elevador2) == 1){
					try {
						percorrerLabel("A", p1.elevador1, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else{
					try {
						percorrerLabel("B", p1.elevador2, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		c2.add(btn4);
		
		//3º andar
		JLabel lblA3 = new JLabel("");
		lblA3.setBackground(Color.GRAY);
		lblA3.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblA3);
		JLabel lblB3 = new JLabel("");
		lblB3.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblB3);
		JButton btn3 = new JButton("Chamar");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1.p3.chamarElevador(p1.elevador1, p1.elevador2) == 1){
					try {
						percorrerLabel("A", p1.elevador1, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else{
					try {
						percorrerLabel("B", p1.elevador2, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		c2.add(btn3);
		
		//2º andar
		JLabel lblA2 = new JLabel("");
		lblA2.setBackground(Color.GRAY);
		lblA2.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblA2);
		JLabel lblB2 = new JLabel("");
		lblB2.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblB2);
		JButton btn2 = new JButton("Chamar");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1.p2.chamarElevador(p1.elevador1, p1.elevador2) == 1){
					try {
						percorrerLabel("A", p1.elevador1, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else{
					try {
						percorrerLabel("B", p1.elevador2, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		c2.add(btn2);
		
		//1º andar
		JLabel lblA1 = new JLabel("");
		lblA1.setBackground(Color.GRAY);
		lblA1.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblA1);
		JLabel lblB1 = new JLabel("");
		lblB1.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblB1);
		JButton btn1 = new JButton("Chamar");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1.p1.chamarElevador(p1.elevador1, p1.elevador2) == 1){
					try {
						percorrerLabel("A", p1.elevador1, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else{
					try {
						percorrerLabel("B", p1.elevador2, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		c2.add(btn1);
		
		// Terreo
		JLabel lblA0 = new JLabel("");
		lblA0.setBackground(Color.GRAY);
		lblA0.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblA0);
		JLabel lblB0 = new JLabel("");
		lblB0.setForeground(new Color(0, 0, 0));
		lblB0.setHorizontalAlignment(SwingConstants.CENTER);
		c2.add(lblB0);
		JButton btn0 = new JButton("Chamar");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(p1.p0.chamarElevador(p1.elevador1, p1.elevador2) == 1){
					try {
						percorrerLabel("A", p1.elevador1, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else{
					try {
						percorrerLabel("B", p1.elevador2, c2);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		c2.add(btn0);
		
		JButton btnEntrar = new JButton("Entrar no Elevador");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JButton btnSair = new JButton("Sair do Elevador");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 14));		
		
		//percorrer os label
		
		
		Container c3 = new JPanel();
		c3.setLayout(new FlowLayout());
		c3.add(btnEntrar);
		c3.add(btnSair);
		
		c1.add(BorderLayout.CENTER, c2);
		c1.add(BorderLayout.SOUTH, c3);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{c2, getContentPane(), lblB9, btn9, lblA8, lblB8, lblA9, btn8, lblA7, lblB7, btn7, lblA6, lblB6, btn6, lblA5, lblB5, btn5, lblA4, lblB4, btn4, lblA3, lblB3, btn3, lblA2, lblB2, btn2, lblA1, lblB1, btn1, lblA0, lblB0, btn0, c3, btnEntrar, btnSair}));
	}
	
	public static void percorrerLabel(String coluna, Elevador e, Container c) throws InterruptedException{
		int a[] = {27,24,21,18,15,12,9,6,3,0};
		int b[] = {28,25,22,19,16,13,10,7,4,1};
		
		if(coluna == "A"){
			//subindo
			if(e.getStatus() == "subindo"){
				for(int i = e.getAndarAnterior(); i<= e.getAndar(); i++){
					JLabel l =(JLabel) c.getComponent(a[i]);
					l.setText(e.getStatus());
					if(i!=e.getAndar()){
						l.setText("");
					}
					
				}
			}
			
			//descendo
			if(e.getStatus() == "descendo"){
				for(int i = e.getAndar(); i<= e.getAndarAnterior(); i++){
					JLabel l =(JLabel) c.getComponent(a[i]);
					l.setText(e.getStatus());
					if(i!=e.getAndar()){
						l.setText("");
					}
				}
			}
			
			
		} else if(coluna == "B"){
			//subindo
			if(e.getStatus() == "subindo"){
				for(int i = e.getAndarAnterior(); i<= e.getAndar(); i++){
					JLabel l =(JLabel) c.getComponent(b[i]);
					l.setText(e.getStatus());
					if(i!=e.getAndar()){
						l.setText("");
					}
				}
			}
			//descendo
			if(e.getStatus() == "descendo"){
				for(int i = e.getAndar(); i<= e.getAndarAnterior(); i++){
					JLabel l =(JLabel) c.getComponent(b[i]);
					l.setText(e.getStatus());
					if(i!=e.getAndar()){
						l.setText("");
					}
					
				}
			}
			
		}
	}

}
