package com.mrs.app.view;

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

public class FinalConfirmation extends SuperView {

	private static final long serialVersionUID = -7740443590532007754L;

	JButton completion = new JButton(new ImageIcon("./image/button/Completion.png"));
	JLabel accName = new JLabel("최종확인");
	
	public FinalConfirmation() {
		setTitle("MEGABIC_예매내역");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);
		createwindows();

		accName.setBounds(100, 140, 200, 50);	
		accName.setFont(new Font("굴림", Font.BOLD, 20));
		
		
		completion.setBounds(720, 370, 90, 35);
		completion.setBorderPainted(false);
	}

	public void createwindows() {

		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/lastWindow.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();

		completion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showAccountInfo(main); 
			}
		});

		add(completion);
		add(accName);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
