package employee;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.JXSearchField;
import org.jdesktop.swingx.JXSearchField.SearchMode;
import org.jdesktop.xswingx.PromptSupport;
import org.jdesktop.xswingx.PromptSupport.FocusBehavior;

import main.DbConnect;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


public class UpdateWorkDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
					UpdateWorkDetails frame = new UpdateWorkDetails();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UpdateWorkDetails() {
		setTitle("Updated Work Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 310, 418);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		conn = DbConnect.doConnect();
		

		JLabel lblSalaryDetails = new JLabel("Update Work Details");
		lblSalaryDetails.setBounds(40, 23, 218, 42);
		lblSalaryDetails.setFont((new Font("Roboto", Font.BOLD,22)));
		contentPane.add(lblSalaryDetails);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 71, 266, 4);
		contentPane.add(separator);
		
		JLabel lblEmplyeeId = new JLabel("Employee ID");
		lblEmplyeeId.setBounds(12, 122, 69, 14);
		contentPane.add(lblEmplyeeId);
		
		JLabel lblBaseYear = new JLabel("Hourly Rate");
		lblBaseYear.setBounds(12, 161, 89, 14);
		contentPane.add(lblBaseYear);
		
		JLabel lblRemarks = new JLabel("Remarks");
		lblRemarks.setBounds(12, 191, 79, 14);
		contentPane.add(lblRemarks);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setForeground(Color.RED);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(89, 119, 187, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(89, 158, 187, 20);
		contentPane.add(textField_2);
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(89, 191, 187, 77);
		contentPane.add(textArea);
		
		
		JButton btnConfirmDetails = new JButton("Update Details");
		btnConfirmDetails.setBounds(12, 279, 127, 31);
		
		
	
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(149, 279, 127, 31);
		contentPane.add(btnCancel);


		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(74, 346, 139, 14);
		contentPane.add(label);
		
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(42, 321, 218, 14);
		contentPane.add(label_1);
		
	

		JXSearchField srchfldEnterempId = new JXSearchField();
		srchfldEnterempId.setFont(new Font("Tahoma", Font.ITALIC, 11));
		srchfldEnterempId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String sql = "Select * from hourly where emp_id_hr = '"+srchfldEnterempId.getText().toString()+"' "; 
						
					
						rs = stmt.executeQuery(sql);
						System.out.println(sql);
						if (!rs.isBeforeFirst()) {
						    System.out.println("no data found");
						    label.setText("No Record Found");
						    java.util.Date d = new java.util.Date();
						    d.toString();
							textField_1.setText("");
							textField_2.setText("");
							textArea.setText("");
							label_1.setText("");
							
						    
						} 
						else {
							
						while(rs.next()){
							label.setText("");
							
							textField_1.setText(rs.getString("emp_id_hr"));
							textField_2.setText(rs.getString("hr_rate"));
							textArea.setText(rs.getString("note"));
							
						}
						
						
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					} 
				
			
			}
		});
		srchfldEnterempId.setSearchMode(SearchMode.INSTANT);
		srchfldEnterempId.setPrompt("Enter Employee ID\r\n");
		srchfldEnterempId.setBounds(30, 86, 145, 22);
		contentPane.add(srchfldEnterempId);

		
		JButton btnSearch_1 = new JButton("Search");
		btnSearch_1.setBounds(185, 85, 89, 23);
		
		
		
		btnSearch_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			
				
				try {
					String sql = "Select * from hourly where emp_id_hr = '"+srchfldEnterempId.getText().toString()+"' "; 
						
					
						rs = stmt.executeQuery(sql);
						System.out.println(sql);
							
						while(rs.next()){
							
							textField_1.setText(rs.getString("emp_id_hr"));
							textField_2.setText(rs.getString("hr_rate"));
							textArea.setText(rs.getString("note"));
							
						}
						
						
						
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					} 
				
			}
		});
		contentPane.add(btnSearch_1);

btnConfirmDetails.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String e_id =textField_1.getText().toString();
				String ht_rate = textField_2.getText().toString();
				
				String nt  = textArea.getText().toLowerCase().toString();
				
				Double hr_rate = Double.parseDouble(ht_rate);
				
				Double salary = hr_rate *8*30;
				try {
				
					String sql ="update hourly set emp_id_hr = '"+e_id+"',hr_rate = '"+ht_rate+"', note = '"+nt+"' where emp_id_hr = '"+srchfldEnterempId.getText().toString()+"'";
				
						stmt.executeUpdate(sql);
						System.out.println(sql);
						
				

					String sql1 = "update salary set salary = '"+salary.toString()+"' where emp_id_salary = '"+textField_1.getText().toString()+"' ";
					stmt.executeUpdate(sql1);
					System.out.println(sql1);
					
					label_1.setText("Your Records are Successfully Updated");
					
					
			}catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnConfirmDetails);
	
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
