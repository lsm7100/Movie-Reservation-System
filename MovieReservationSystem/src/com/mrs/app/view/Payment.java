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
	JButton preView = new JButton(new ImageIcon("./image/button/pre.png"));
	JButton nextView = new JButton(new ImageIcon("./image/button/next.png"));

	public Payment() {
		setTitle("MEGABIC_결제");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);
		createwindows();

		accName.setBounds(100, 140, 200, 50);

		accName.setFont(new Font("굴림", Font.BOLD, 20));
		preView.setBounds(30, 200, 17, 39);
		nextView.setBounds(850, 200, 17, 39);
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
				dispose();
				main.showSeatSelection(main); 
			}
		});

		nextView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showFinalConfirmation(main); 
			}
		});

		add(preView);
		add(nextView);

		add(accName);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
