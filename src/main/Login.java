package main;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.AbstractAction;
import javax.swing.Action;

import java.sql.*;

import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class Login {

	private JFrame frame;
	private JTextField unametf;
	private JPasswordField passwordField;
	Connection conn;
    Statement stmt;
    ResultSet rs;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
					window.frame.setTitle("Login");
					
					window.frame.setResizable(false);
					window.frame.setLocationRelativeTo(null);
					window.frame.setBounds(100, 100, 626, 340);
					  WindowAdapter exitListener = new WindowAdapter() {

				            @Override
				            public void windowClosing(WindowEvent e) {
				                int confirm = JOptionPane.showOptionDialog(window.frame,
				                        "Are you sure you want to close this application?",
				                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
				                        JOptionPane.QUESTION_MESSAGE, null, null, null);
				                if(confirm == JOptionPane.YES_OPTION){
				                	window.frame.setDefaultCloseOperation(window.frame.DISPOSE_ON_CLOSE);//yes

				                } else if (confirm == JOptionPane.CANCEL_OPTION) {
				                	window.frame.setDefaultCloseOperation(window.frame.DO_NOTHING_ON_CLOSE);//cancel
				                } else {
				                	window.frame.setDefaultCloseOperation(window.frame.DO_NOTHING_ON_CLOSE);//no
				                }
				            }
				        };
				        window.frame. addWindowListener(exitListener);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public Login() {
		
		initialize();
		conn = DbConnect.doConnect();
		frame.setVisible(true);
		frame.setVisible(true);
		frame.setTitle("Login");
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setBounds(100, 100, 626, 340);
		  WindowAdapter exitListener = new WindowAdapter() {

	            @Override
	            public void windowClosing(WindowEvent e) {
	                int confirm = JOptionPane.showOptionDialog(frame,
	                        "Are you sure you want to close this application?",
	                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
	                        JOptionPane.QUESTION_MESSAGE, null, null, null);
	                if(confirm == JOptionPane.YES_OPTION){
	                	frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);//yes

	                } else if (confirm == JOptionPane.CANCEL_OPTION) {
	                	frame.setDefaultCloseOperation(frame.DO_NOTHING_ON_CLOSE);//cancel
	                } else {
	                	frame.setDefaultCloseOperation(frame.DO_NOTHING_ON_CLOSE);//no
	                }
	            }
	        };
	        frame. addWindowListener(exitListener);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();

	
		frame.getContentPane().setForeground(new Color(51, 0, 102));
		frame.getContentPane().setFont(new Font("Roboto", Font.BOLD, 18));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSalaryCalculationSystem = new JLabel("Salary Calculation System");
		lblSalaryCalculationSystem.setForeground(Color.BLACK);
		lblSalaryCalculationSystem.setFont(new Font("Roboto", Font.PLAIN, 26));
		lblSalaryCalculationSystem.setBounds(143, 32, 308, 57);
		Font f = new Font("Roboto" ,Font.BOLD ,18);
		frame.getContentPane().add(lblSalaryCalculationSystem);

	
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblUsername.setBounds(175, 100, 70, 19);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblPassword.setBounds(175, 154, 70, 19);
		frame.getContentPane().add(lblPassword);
		
		unametf = new JTextField();
		unametf.setBounds(255, 100, 141, 20);
		frame.getContentPane().add(unametf);
		unametf.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(255, 154, 141, 20);
		frame.getContentPane().add(passwordField);
		frame.setBounds(100, 100, 611, 283);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton button = new JButton("Login");
		button.setBackground(new Color(102, 204, 204));
		button.setFont(new Font("Raleway", Font.BOLD, 13));
		button.setForeground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String query = "Select * from login where uname = ? and password = ?";
				try {
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1, unametf.getText());
					pst.setString(2, passwordField.getText());
					rs= pst.executeQuery();
					
					int count=0;
					while(rs.next()){
						count+=1;
						}
						if(count == 1 ){
							//JOptionPane.showMessageDialog(null, "Username and Password is Correct");
							frame.dispose();
							Home home = new Home();
							home.setVisible(true);
							home.setTitle("Home");
							home.setResizable(false);
							home.setLocationRelativeTo(null);
							  WindowAdapter exitListener = new WindowAdapter() {

						            @Override
						            public void windowClosing(WindowEvent e) {
						                int confirm = JOptionPane.showOptionDialog(home,
						                        "Are you sure you want to close this application?",
						                        "Exit Confirmation", JOptionPane.YES_NO_CANCEL_OPTION,
						                        JOptionPane.QUESTION_MESSAGE, null, null, null);
						                if(confirm == JOptionPane.YES_OPTION){
						                   home.setDefaultCloseOperation(home.DISPOSE_ON_CLOSE);//yes

						                } else if (confirm == JOptionPane.CANCEL_OPTION) {
						                    home.setDefaultCloseOperation(home.DO_NOTHING_ON_CLOSE);//cancel
						                } else {
						                    home.setDefaultCloseOperation(home.DO_NOTHING_ON_CLOSE);//no
						                }
						            }
						        };
						    home. addWindowListener(exitListener);
						}
						else if(count >1){
							JOptionPane.showMessageDialog(null, "Duplicate Username and Password");
						}
						else{
							JOptionPane.showMessageDialog(null, "Username or password is incorrect");
						}
					
					
				} catch (SQLException e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		button.setBounds(255, 206, 90, 23);
		frame.getContentPane().add(button);
		
	}
	
}
