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

public class Login extends SuperView {

	private static final long serialVersionUID = -3656622646025106289L;

	JTextField idField; // �ؽ�Ʈ �ʵ� ����
	JPasswordField pwField; // �н����� �ʵ� ����
	
	JButton btnRegister = new JButton(new ImageIcon("./image/button/join.png")); // ȸ�� ��� ��ư�� �̹����� �ִ´�
	JButton btnLogin = new JButton(new ImageIcon("./image/button/login.png")); // ��ư�� �̹����� �ִ´�

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
		idField = new JTextField(10);
		pwField = new JPasswordField(15);

		idField.setBounds(400, 160, 200, 40);
		pwField.setBounds(400, 250, 200, 40);
		btnLogin.setBounds(700, 189, 100, 35);
		btnRegister.setBounds(700, 250, 100, 35);

		btnLogin.setBorderPainted(true);
		btnLogin.setFocusPainted(false);
		btnLogin.setContentAreaFilled(false);
		
		btnRegister.setBorderPainted(true);
		btnRegister.setFocusPainted(false);
		btnRegister.setContentAreaFilled(false);

		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck();
			}
		});
		
		btnRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // �ڱ� â �ݱ�
				main.showRegister(); // ����â �޼ҵ带 �̿��� ��ȭ ��� â ����
			}
		});

		add(idField);
		add(pwField);
		add(btnLogin);
		add(btnRegister);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void isLoginCheck() {
		String inputID = idField.getText().trim();
		String inputPassword = new String(pwField.getPassword()).trim();

		if (inputID.isEmpty()) { // ID ���� ����
			JOptionPane.showMessageDialog(null, "���̵� �Է��ϼ���.");
		} else if (inputPassword.isEmpty()) { // Password ���� ����
			JOptionPane.showMessageDialog(null, "�н����带 �Է��ϼ���.");
		} else { // ȸ�� ���� ���� ����
			if (isLogin(inputID, inputPassword)) { // ȸ�� ���� ���� �Լ� ȣ��
				JOptionPane.showMessageDialog(null, "�α��ο� �����߽��ϴ�.");
				this.dispose(); // �ڱ� â �ݱ�
				this.main.showMovieList(); // ����â �޼ҵ带 �̿��� ��ȭ ��� â ����
			} else { // ���� ����.
				JOptionPane.showMessageDialog(null, "���̵� Ȥ�� �н����尡 �߸��Ǿ����ϴ�.");
			}
		}
	}

	public boolean isLogin(String inputID, String inputPassword) {
		boolean result = false;
		
		// DB�� ID, Password ��ȸ�Ͽ� ��ȿ���� ����.
		if (inputID.equals("test") && inputPassword.equals("1234")) {
			result = true;
		}
		return result;
	}
}
