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

public class Payment extends SuperView {

	JLabel accName = new JLabel("결제 내역 확인");
	JButton preView = new JButton(new ImageIcon("./image/button/previous.png"));
	JButton nextView = new JButton(new ImageIcon("./image/button/nextButton.png"));

	public Payment() {
		setTitle("MEGABIC_고객정보");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);
		createwindows();

		accName.setBounds(100, 140, 200, 50);

		accName.setFont(new Font("굴림", Font.BOLD, 20));
		preView.setBounds(90, 370, 90, 35);
		nextView.setBounds(700, 370, 90, 35);
	}

	public void createwindows() {

		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/paymentWindow.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();

		preView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // 기존 화면 꺼짐
				main.showSeatSelection(main); // 버튼을 누르면 Register로 넘어감
			}
		});

		nextView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // 기존 화면 꺼짐
				main.showFinalConfirmation(main); // 버튼을 누르면 Register로 넘어감
			}
		});

		add(preView);
		add(nextView);

		add(accName);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
