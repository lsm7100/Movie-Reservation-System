package com.mrs.app.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.mrs.app.Movie;

public class AccountInfo extends SuperView {

	JButton accLogout = new JButton(new ImageIcon("./image/button/logout.png"));
	JButton movieReser = new JButton(new ImageIcon("./image/button/reservation.png"));
	JButton movieList = new JButton(new ImageIcon("./image/button/list.png"));

	JLabel accName = new JLabel("성 함");
	JLabel pointView = new JLabel("포인트");

	public AccountInfo() {
		setTitle("MEGABIC_고객정보");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);
		
		createwindows();

		
		accLogout.setBounds(90, 320, 90, 35);
		movieReser.setBounds(310, 295, 264, 100);
		movieList.setBounds(685, 320, 90, 35);

		accName.setBounds(310, 150, 200, 50);
		pointView.setBounds(698, 150, 200, 50);

		accName.setFont(new Font("굴림", Font.BOLD, 20));
		pointView.setFont(new Font("굴림", Font.BOLD, 20));
		accLogout.setBorderPainted(false);
		movieReser.setBorderPainted(false);
		movieList.setBorderPainted(false);
		


	}

	public void createwindows() {

		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/accounInfo.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();

		accLogout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showLogin(main);
			}
		});
		
		movieReser.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // 
				main.showMovieList(main); 
			}
		});
		
		movieList.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); //
				main.showFinalConfirmation(main); //
			}
		});

		add(accLogout);
		add(movieReser);
		add(movieList);

		add(accName);
		add(pointView);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
