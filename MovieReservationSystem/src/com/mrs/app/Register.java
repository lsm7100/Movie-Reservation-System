package com.mrs.app;


	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.File;
	import java.io.IOException;

	import javax.imageio.ImageIO;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPasswordField;
	import javax.swing.JTextField;

	public class Register extends JFrame {

		JTextField rgName, rgId, rgPw;



		public Register() {
			setTitle("MEGABIC_REGISTER"); // 메인이름
			setSize(600, 400); // 사이즈
			setLayout(null); // 레이아웃 없음
			setResizable(false); // 사이즈 조절 못 함
		
		}

		public void createwindows() {
			try {
				setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/Register.PNG")))));
			} catch (IOException e) {
				e.printStackTrace();
			}
			pack();

		

			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		Register regi = new Register();
		regi.createwindows();
	}
	}
	
		
		
	