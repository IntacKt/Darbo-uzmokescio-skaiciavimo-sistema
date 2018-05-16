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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

import org.jdesktop.xswingx.PromptSupport;
import org.jdesktop.xswingx.PromptSupport.FocusBehavior;

import main.DbConnect;

import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


public class Job_Details extends JFrame {

	private JPanel contentPane;
	

	private JTextField textField;
	private JTextField textField_1;

	Connection conn;
    Statement stmt;
    ResultSet rs;
    private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Job_Details frame = new Job_Details();
					
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Job_Details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		conn = DbConnect.doConnect();
		JLabel lblSalaryDetails = new JLabel("Job Details");
		lblSalaryDetails.setBounds(131, 11, 127, 42);
		lblSalaryDetails.setFont((new Font("Roboto", Font.BOLD,22)));
		contentPane.add(lblSalaryDetails);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 64, 356, 2);
		contentPane.add(separator);
		
		JLabel lblSalaryId = new JLabel("Job ID");
		lblSalaryId.setBounds(37, 84, 76, 14);
		contentPane.add(lblSalaryId);
		
		JLabel lblEmplyeeId = new JLabel("Job Title");
		lblEmplyeeId.setBounds(37, 163, 86, 14);
		contentPane.add(lblEmplyeeId);
		
		JLabel lblBaseYear = new JLabel("Job Description");
		lblBaseYear.setBounds(37, 214, 113, 14);
		contentPane.add(lblBaseYear);
		
		
		
		textField = new JTextField();
		textField.setBounds(179, 77, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(179, 119, 187, 20);
		contentPane.add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(179, 205, 187, 77);
		contentPane.add(textArea);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(179, 156, 187, 20);
		contentPane.add(textField_2);
		

		PromptSupport.setPrompt("Enter Job ID", textField);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField);
		PromptSupport.setFontStyle(Font.ITALIC, textField);
		PromptSupport.setForeground(Color.darkGray, textField);
		
		PromptSupport.setPrompt("Enter Employee Id", textField_1);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_1);
		PromptSupport.setFontStyle(Font.ITALIC, textField_1);
		PromptSupport.setForeground(Color.darkGray, textField_1);
		
		PromptSupport.setPrompt("Enter Job Title", textField_2);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_2);
		PromptSupport.setFontStyle(Font.ITALIC, textField_2);
		PromptSupport.setForeground(Color.darkGray, textField_2);
		

		PromptSupport.setPrompt("Enter Descrition ID", textArea);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textArea);
		PromptSupport.setFontStyle(Font.ITALIC, textArea);
		PromptSupport.setForeground(Color.darkGray, textArea);
		
		try {
			stmt= conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(88, 362, 213, 14);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("Save Details");
		button.setBounds(37, 320, 127, 31);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String j_id = textField.getText().toString();
				String e_id = textField_1.getText().toString();
				String j_title = textField_2.getText();
				String desc = textArea.getText();
				try {
					
				String sql = "insert into job_title(job_id,job_title,job_desc,emp_id_job) values('"+j_id+"','"+j_title+"','"+desc+"','"+e_id+"')";
				
					stmt.executeUpdate(sql);
					System.out.print(sql);
					
				lblNewLabel.setText("Record Saved Successfully");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setBounds(208, 320, 127, 31);
		contentPane.add(button_1);
	
		
		JLabel lblEmployeeId = new JLabel("Employee id");
		lblEmployeeId.setBounds(37, 126, 89, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIcon(new ImageIcon("D:\\Projects\\Universitetas\\Bakalaurinis\\Darbo uzmokescio skaiciavimo sistema\\src\\aboutus\\r.jpg"));
		label.setBounds(0, 0, 440, 430);
		contentPane.add(label);

		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	
		
	}
}
