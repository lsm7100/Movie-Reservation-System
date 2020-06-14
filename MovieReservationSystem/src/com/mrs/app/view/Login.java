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
	JTextField idField; // 텍스트 필드 변수
	JPasswordField pwField;

	JButton btnLogin = new JButton(new ImageIcon("./image/loginbutton.png")); // 버튼에 이미지를 넣는다

	public Login() {
		setTitle("MEGABIC_LOGIN"); // 메인이름
		setSize(600, 400); // 사이즈
		setLayout(null); // 레이아웃 없음
		setResizable(false); // 사이즈 조절 못 함
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
			JOptionPane.showMessageDialog(null, "아이디를 입력하세요."); 
		}else if (new String(pwField.getPassword()).trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "패스워드를 입력하세요."); 
		}else {
			if(idField.getText().equals("test") && new String(pwField.getPassword()).equals("1234")){
				JOptionPane.showMessageDialog(null, "Success");
				bLoginCheck = true;
				// 로그인 성공이라면 매니져창 띄우기
				if(isLogin()){
					main.showMovieList(); // 메인창 메소드를 이용해 창띄우기
				}					
			}else{
				JOptionPane.showMessageDialog(null, "아이디 혹은 패스워드가 잘못되었습니다."); 
			}
		}
	}

	// mainProcess와 연동
	public void setMain(Movie main) {
		this.main = main;
	}

	public boolean isLogin() {
		return bLoginCheck;
	}
}
