package payroll;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import main.DbConnect;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.jdesktop.swingx.JXSearchField;
import org.jdesktop.swingx.JXSearchField.SearchMode;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class BasicSalary extends JFrame {

	private JPanel contentPane;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	
	Connection conn;
    Statement stmt ,stmt1,stmt2,stmt3;
    ResultSet rs,rs1,rs3,rs4,rs5,rs6,rs7,rs8;
    Double hr,sal,bonus,amount,np;
   
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicSalary frame = new BasicSalary();

					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BasicSalary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 620, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		//contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		conn = DbConnect.doConnect();
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 56, 576, 13);
		contentPane.add(separator);
		
		JLabel lblNewEntry = new JLabel("Basic Salary");
		lblNewEntry.setBounds(230, 11, 108, 34);
		lblNewEntry.setFont(new Font("Roboto",Font.BOLD,18));
		contentPane.add(lblNewEntry);
		
		JLabel lblEmployeeId = new JLabel("Payroll  ID");
		lblEmployeeId.setBounds(10, 126, 60, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblDepartmentId = new JLabel("Employee ID");
		lblDepartmentId.setBounds(10, 151, 89, 14);
		contentPane.add(lblDepartmentId);
		
		JLabel lblJobId = new JLabel("First Name");
		lblJobId.setBounds(10, 176, 89, 20);
		contentPane.add(lblJobId);
		
		JLabel lblEmployeeTypeId = new JLabel("Last Name");
		lblEmployeeTypeId.setBounds(10, 210, 89, 20);
		contentPane.add(lblEmployeeTypeId);
		
		JLabel lblFirstName = new JLabel("Hours Worked");
		lblFirstName.setBounds(312, 151, 96, 14);
		contentPane.add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(80, 126, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setBounds(80, 151, 187, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(80, 176, 187, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(80, 210, 187, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(399, 148, 187, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(399, 176, 187, 20);
		contentPane.add(textField_11);
		
		JLabel lblDeductions = new JLabel("Deductions");
		lblDeductions.setBounds(312, 179, 96, 14);
		contentPane.add(lblDeductions);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(399, 210, 187, 20);
		contentPane.add(textField_12);
		
		JLabel lblNetPay = new JLabel("Net Pay");
		lblNetPay.setBounds(312, 213, 47, 14);
		contentPane.add(lblNetPay);
		try {
			stmt = conn.createStatement();
			stmt1 = conn.createStatement();
			stmt2 = conn.createStatement();
			stmt3 = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(230, 236, 117, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(114, 520, 175, 14);
		contentPane.add(label_1);
		
		
		JXSearchField srchfldEnterempId = new JXSearchField();
		srchfldEnterempId.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		srchfldEnterempId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String sql = "Select * from payroll p INNER JOIN employee e  on e.emp_id = p.emp_id where e.emp_id = '"+srchfldEnterempId.getText().toString()+"' "; 
						
					
						rs = stmt.executeQuery(sql);
						System.out.println(sql);
						
						if (!rs.isBeforeFirst()) {
						    System.out.println("no data found");
						    label.setText("No Record Found");
						    textField.setText("");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							
							textField_4.setText("");
							textField_5.setText("");
							textField_11.setText("");
							
							textField_12.setText("");
							label_1.setText("");
						
						    
						    
						} 
						else {
						while(rs.next()){
							
							label.setText("");
							textField.setText(rs.getString("payroll_id"));
							
							
							textField_4.setText("208");
						
							
							textField_1.setText(rs.getString("emp_id"));
							textField_2.setText(rs.getString("first_name"));
							textField_3.setText(rs.getString("last_name"));
							
							
							
							
						
						
					
						String sql2 = "Select * from job_title where emp_id_job = '"+srchfldEnterempId.getText().toString()+"' "; 
						rs3 = stmt.executeQuery(sql2);
						System.out.println(sql2);
						
						while(rs3.next()){
							textField_5.setText(rs3.getString("job_title"));
						}
						rs3.close();
				
						
						String sql7 = "Select * from salary  where emp_id_salary = '"+srchfldEnterempId.getText().toString()+"' "; 
						rs5 = stmt1.executeQuery(sql7);
						System.out.println(sql7);
						while(rs5.next()){
							sal = rs5.getDouble("salary");
							System.out.println(sal);
						}
						rs5.close();
						
						String sql8 = "Select amount from deduction where emp_id_deduct = '"+srchfldEnterempId.getText().toString()+"' "; 
						rs6  =stmt2.executeQuery(sql8);
						
						
						while(rs6.next()){
							amount  = rs6.getDouble("amount");
							textField_11.setText(String.valueOf(amount));
							System.out.println(amount);
						}
						rs6.close();
					
						
						String sql9 = "Select  bonus_payment from bonus where emp_id_bonus = '"+srchfldEnterempId.getText().toString()+"' "; 
						
						rs7 = stmt3.executeQuery(sql9);
						while(rs7.next()){
							bonus = rs7.getDouble("bonus_payment");
							System.out.println(bonus);
							
							np= ((sal - amount)+bonus);
							System.out.println(np);
						
							textField_12.setText(String.valueOf(np));
							}
						
						
						}
						String sql10 = "update payroll set netpay = '"+np+"' ";
						System.out.println(sql10);
						stmt.executeUpdate(sql10);
						
						}
						
					
						
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				
			
			}
		});
		
		
	;
		
		
		srchfldEnterempId.setSearchMode(SearchMode.INSTANT);
		srchfldEnterempId.setPrompt("Enter Employee ID\r\n");
		srchfldEnterempId.setBounds(214, 80, 145, 22);
		contentPane.add(srchfldEnterempId);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String p_id = textField.getText().toString();
				String e_id = textField_1.getText().toString();
				String fname = textField_2.getText().toString();
				String lname = textField_3.getText().toString();
				String jt = textField_5.getText().toString();
				String hw = textField_4.getText().toString();
				String ded = textField_11.getText().toString();
				String np = textField_12.getText().toString();
				
				try {
					
					String sql3  = "update payroll set payroll_id ='"+p_id+"', hrs_worked = '"+hw+"', deductions = '"+ded+"',netpay ='"+np+"' where emp_id = '"+srchfldEnterempId.getText().toString()+"' ";
					System.out.println(sql3);
				//	stmt.execute(sql3);
					//stmt.close();
					
					String sql4 = "update employee set first_name = '"+fname+"',last_name = '"+lname+"' where emp_id = '"+srchfldEnterempId.getText().toString()+"' ";
					System.out.println(sql4);
				//	stmt1.execute(sql4);
				//	stmt1.close();
					
					String sql5 = "update job_title set job_title = '"+jt+"'";
					
					stmt.addBatch(sql3);
					stmt.addBatch(sql4);
					stmt.addBatch(sql5);
					stmt.executeBatch();
					
					label_1.setText("Record Updated Successfully");
				
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		btnUpdate.setBounds(153, 486, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(265, 486, 89, 23);
		contentPane.add(btnCancel);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(399, 123, 187, 20);
		contentPane.add(textField_5);
		
		JLabel lblJobTitle = new JLabel("Job Title");
		lblJobTitle.setBounds(312, 126, 77, 17);
		contentPane.add(lblJobTitle);
		
		JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setBounds(288, 125, 2, 105);
		contentPane.add(separator_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("D:\\Projects\\Universitetas\\Bakalaurinis\\Darbo uzmokescio skaiciavimo sistema\\src\\aboutus\\r.jpg"));
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 0, 647, 304);
		contentPane.add(label_2);

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		
		

	
	}
}
