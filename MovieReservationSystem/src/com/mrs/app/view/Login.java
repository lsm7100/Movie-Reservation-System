package com.mrs.app.view;

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

import com.mrs.app.Movie;

public class Login extends JFrame {

	private Movie main;
	private boolean bLoginCheck;
	JTextField idField; // �ؽ�Ʈ �ʵ� ����
	JPasswordField pwField;

	JButton btnLogin = new JButton(new ImageIcon("./image/loginbutton.png")); // ��ư�� �̹����� �ִ´�

	public Login() {
		setTitle("MEGABIC_LOGIN"); // �����̸�
		setSize(600, 400); // ������
		setLayout(null); // ���̾ƿ� ����
		setResizable(false); // ������ ���� �� ��
		createwindows();
	}

	public void createwindows() {
		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/login.PNG")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();
		idField = new JTextField(25);
		pwField = new JPasswordField(25);

		idField.setBounds(400, 160, 200, 40);
		pwField.setBounds(400, 250, 200, 40);
		btnLogin.setBounds(700, 189, 100, 35);

		btnLogin.setBorderPainted(true);
		btnLogin.setFocusPainted(false);
		btnLogin.setContentAreaFilled(false);

		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck();
			}
		});
		
		
		add(idField);
		add(pwField);
		add(btnLogin);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void isLoginCheck(){
		if (idField.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "���̵� �Է��ϼ���."); 
		}else if (new String(pwField.getPassword()).trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "�н����带 �Է��ϼ���."); 
		}else {
			if(idField.getText().equals("test") && new String(pwField.getPassword()).equals("1234")){
				JOptionPane.showMessageDialog(null, "Success");
				bLoginCheck = true;
				// �α��� �����̶�� �Ŵ���â ����
				if(isLogin()){
					main.showMovieList(); // ����â �޼ҵ带 �̿��� â����
				}					
			}else{
				JOptionPane.showMessageDialog(null, "���̵� Ȥ�� �н����尡 �߸��Ǿ����ϴ�."); 
			}
		}
	}

	// mainProcess�� ����
	public void setMain(Movie main) {
		this.main = main;
	}

	public boolean isLogin() {
		return bLoginCheck;
	}
}
