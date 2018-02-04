package com.mangodev.frames;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Login {
	public Login() {
		JFrame frame = new JFrame("Login");
		JPanel panel = new JPanel();
		JTextField serverLogin = new JTextField();
		JTextField usrLogin = new JTextField();
		JPasswordField passLogin = new JPasswordField();
		JButton loginButton = new JButton("Login");
		JLabel l1 = new JLabel("Server Credentials:");  
		JLabel l2 = new JLabel("Username:");  
		JLabel l3 = new JLabel("Password:");
		l1.setBounds(20,20, 80,30);    
        l2.setBounds(20,75, 80,30); 
        l3.setBounds(20,100, 80,30);
        serverLogin.setBounds(100,20,100,30);
        usrLogin.setBounds(100,75, 100,30); 
        loginButton.setBounds(100,100, 80,30);   
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 200));
        frame.pack();
        frame.setVisible(true);
        frame.add(panel);
        frame.add(l1); 
        frame.add(serverLogin);
        frame.add(l2); 
        frame.add(usrLogin);
        frame.add(l3); 
        frame.add(passLogin);
        frame.add(loginButton);
        loginButton.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { String data = "Username " + serverLogin.getText() + ", Password: " + new String(passLogin.getPassword()); }});
        
	}
}
