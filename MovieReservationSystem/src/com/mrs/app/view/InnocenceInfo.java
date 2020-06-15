package com.mrs.app.view;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InnocenceInfo extends SuperView {

	private static final long serialVersionUID = -7740443590532007754L;

	JButton preView = new JButton(new ImageIcon("./image/button/pre.png"));
	
	Checkbox movieTime_1 = new Checkbox("06.16 13:00");
	Checkbox movieTime_2 = new Checkbox("06.16 16:00");
	Checkbox movieTime_3 = new Checkbox("06.16 21:00");

	public InnocenceInfo() {
		setTitle("MEGABIC_결백");
		setSize(600, 400);
		setLayout(null);
		setResizable(false);
		createwindows();

		preView.setBounds(30, 200, 17, 39);

		movieTime_1.setBounds(420, 260, 90, 30);
		movieTime_2.setBounds(420, 290, 90, 30);
		movieTime_3.setBounds(420, 320, 90, 30);
		movieTime_1.setBackground(Color.WHITE);
		movieTime_2.setBackground(Color.WHITE);
		movieTime_3.setBackground(Color.WHITE);
	}

	public void createwindows() {

		try {
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./image/innocenWindow.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pack();

		preView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				main.showMovieList(main);
			}
		});

		add(preView);

		add(movieTime_1);
		add(movieTime_2);
		add(movieTime_3);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
