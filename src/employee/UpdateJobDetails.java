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
import org.jdesktop.swingx.JXSearchField.LayoutStyle;
import org.jdesktop.swingx.JXSearchField.SearchMode;
import org.jdesktop.xswingx.*;
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



public class UpdateJobDetails extends JFrame {

	private JPanel contentPane;

	private JTextField textField;
	private JTextField textField_1;
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
					UpdateJobDetails frame = new UpdateJobDetails();

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
	public UpdateJobDetails() {
		setTitle("Update Job Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		conn = DbConnect.doConnect();
		

		JLabel lblSalaryDetails = new JLabel("Update Job Details");
		lblSalaryDetails.setBounds(64, 20, 204, 42);
		lblSalaryDetails.setFont((new Font("Roboto", Font.BOLD,22)));
		contentPane.add(lblSalaryDetails);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 73, 290, 8);
		contentPane.add(separator);
		
		JLabel lblSalaryId = new JLabel("Job ID");
		lblSalaryId.setBounds(22, 133, 43, 14);
		contentPane.add(lblSalaryId);
		
		JLabel lblEmplyeeId = new JLabel("Job Title");
		lblEmplyeeId.setBounds(22, 175, 81, 14);
		contentPane.add(lblEmplyeeId);
		
		JLabel lblBaseYear = new JLabel("Job Description");
		lblBaseYear.setBounds(22, 214, 95, 14);
		contentPane.add(lblBaseYear);
		
		
		
		textField = new JTextField();
		textField.setBounds(113, 130, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 172, 187, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(113, 214, 187, 77);
		contentPane.add(textArea_1);
		
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(543, 148, 139, 14);
		contentPane.add(label);
	
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(22, 347, 280, 14);
		contentPane.add(label_1);
		
		JXSearchField srchfldEnterJobId = new JXSearchField();
		srchfldEnterJobId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				try {
					String sql = "Select * from job_title where emp_id_job = '"+srchfldEnterJobId.getText().toString()+"' "; 
						
					
						rs = stmt.executeQuery(sql);
						System.out.println(sql);
						if (!rs.isBeforeFirst()) {
						    System.out.println("no data found");
						    label.setText("No Record Found");
						    java.util.Date d = new java.util.Date();
						    d.toString();
						    textField.setText("");
							textField_1.setText("");
							textArea_1.setText("");
							label_1.setText("");
							
						    
						} 
						else {
							
						while(rs.next()){
							label.setText("");
							textField.setText(rs.getString("job_id"));
							textField_1.setText(rs.getString("job_title"));
							textArea_1.setText(rs.getString("job_desc"));
						}
						
						}
						
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
			}
		});
		

		
		srchfldEnterJobId.setPrompt("Enter Employee ID\r\n");
		srchfldEnterJobId.setBounds(113, 92, 145, 22);
		contentPane.add(srchfldEnterJobId);
		JButton button = new JButton("Update Details");
		button.setBounds(22, 302, 127, 34);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jid = textField.getText().toString();
				String jt = textField_1.getText();
				String jd  = textArea_1.getText().toString();
				try {
				String sql = "update job_title set job_id = '"+jid+"', job_title = '"+jt+"', job_desc ='"+jd+"' where emp_id_job ='"+srchfldEnterJobId.getText().toString()+"'";
					
				System.out.println(sql);
				label_1.setText("Your Record Successfully Updated");
					
					stmt.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setBounds(173, 302, 127, 34);
		contentPane.add(button_1);
		

		PromptSupport.setPrompt("Enter Employee ID", textField);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField);
		PromptSupport.setFontStyle(Font.ITALIC, textField);
		PromptSupport.setForeground(Color.darkGray, textField);
		

		PromptSupport.setPrompt("Enter Job Title", textField_1);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_1);
		PromptSupport.setFontStyle(Font.ITALIC, textField_1);
		PromptSupport.setForeground(Color.darkGray, textField_1);
		

		PromptSupport.setPrompt("Enter Descrition ID", textArea_1);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textArea_1);
		PromptSupport.setFontStyle(Font.ITALIC, textArea_1);
		PromptSupport.setForeground(Color.darkGray, textArea_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setIcon(new ImageIcon("D:\\Projects\\Universitetas\\Bakalaurinis\\Darbo uzmokescio skaiciavimo sistema\\src\\aboutus\\r.jpg"));
		label_2.setBounds(0, 0, 373, 420);
		contentPane.add(label_2);
		
		
		
		
	button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		

		
	}
}
