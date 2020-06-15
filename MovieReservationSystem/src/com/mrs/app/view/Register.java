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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends SuperView {

	private static final long serialVersionUID = 4309338501451187572L;

	JTextField rgName, rgId;
	JButton btnCheck = new JButton(new ImageIcon("./image/button/check.png")); // ��ư�� �̹����� �ִ´�
	JButton btnPrevious = new JButton(new ImageIcon("./image/button/previous.png")); // ��ư�� �̹����� �ִ´�
	JPasswordField pw, pwConfirm;

	public Register() {
		setTitle("MEGABIC_REGISTER");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);

		rgName = new JTextField(25);
		rgId = new JTextField(25);
		pw = new JPasswordField(25);
		pwConfirm = new JPasswordField(25);

		createwindows();
	}

	public void createwindows() {
		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/Register.PNG")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();

		btnCheck.setBounds(750, 345, 95, 36);
		btnPrevious.setBounds(650, 345, 95, 36);
		rgName.setBounds(420, 140, 200, 40);
		rgId.setBounds(420, 200, 200, 40);
		pw.setBounds(420, 270, 200, 40);
		pwConfirm.setBounds(420, 340, 200, 40);

		btnPrevious.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showLogin(main);
			}
		});

		add(btnPrevious);
		add(btnCheck);
		add(rgName);
		add(rgId);
		add(pw);
		add(pwConfirm);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
