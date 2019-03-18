package com;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class APP extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public APP() {
		JFrame win = new JFrame();
		win.setTitle("EdClub");
		win.setVisible(true);
		win.setSize(400, 500);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		win.add(panel);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new APP();
	}
}

class MyPanel extends JPanel{
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawLine(0, 350, 500, 350);		
		//int node=0;
		//while(node<5)
		//{
			String str="";
			str+=(char)(Math.random()*26+'a');
			g.drawString(str, (int)(Math.random()*1000%400), (int)(Math.random()*1000%350));
		//		++node;
		//}
	}
}