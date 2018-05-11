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


public class Work_Details extends JFrame {

	private JPanel contentPane;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	

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
					Work_Details frame = new Work_Details();
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
	public Work_Details() {
		setTitle("Work Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 450, 377);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		//contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		conn =DbConnect.doConnect();
		JLabel lblSalaryDetails = new JLabel("Work Details");
		lblSalaryDetails.setBounds(140, 17, 140, 45);
		lblSalaryDetails.setFont((new Font("Roboto", Font.BOLD,22)));
		contentPane.add(lblSalaryDetails);
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 73, 414, 7);
		contentPane.add(separator);
		
		JLabel lblSalaryId = new JLabel("Hour ID");
		lblSalaryId.setBounds(55, 91, 46, 14);
		contentPane.add(lblSalaryId);
		
		JLabel lblEmplyeeId = new JLabel("Employee ID");
		lblEmplyeeId.setBounds(55, 133, 91, 14);
		contentPane.add(lblEmplyeeId);
		
		JLabel lblBaseYear = new JLabel("Hourly Rate");
		lblBaseYear.setBounds(55, 167, 116, 20);
		contentPane.add(lblBaseYear);
		
		JLabel lblRemarks = new JLabel("Remarks");
		lblRemarks.setBounds(55, 208, 116, 14);
		contentPane.add(lblRemarks);
		
		textField = new JTextField();
		textField.setBounds(218, 91, 187, 20);
		//textField.setBounds(178, 103, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(218, 133, 187, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(218, 170, 187, 20);
		contentPane.add(textField_2);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(218, 203, 187, 77);
		contentPane.add(textArea);
		

		PromptSupport.setPrompt("Enter Hour ID", textField);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField);
		PromptSupport.setFontStyle(Font.ITALIC, textField);
		PromptSupport.setForeground(Color.darkGray, textField);

		PromptSupport.setPrompt("Enter Employee ID", textField_1);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_1);
		PromptSupport.setFontStyle(Font.ITALIC, textField);
		PromptSupport.setForeground(Color.darkGray, textField_1);
		

		PromptSupport.setPrompt("Enter Hour rate ID", textField_2);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_2);
		PromptSupport.setFontStyle(Font.ITALIC, textField_2);
		PromptSupport.setForeground(Color.darkGray, textField_2);

		PromptSupport.setPrompt("Enter Description ID", textArea);
		PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textArea);
		PromptSupport.setFontStyle(Font.ITALIC, textArea);
		PromptSupport.setForeground(Color.darkGray, textArea);
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		JButton btnConfirmDetails = new JButton("Save Details");
		btnConfirmDetails.setBounds(77, 296, 127, 31);
		btnConfirmDetails.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String hr_id = textField.getText().toString();
				String e_id = textField_1.getText().toString();
				String ht_rate = textField_2.getText().toString();
				Double hr_rate = Double.parseDouble(ht_rate);
				
				Double salary = hr_rate *8*30;
				
				
				String nt = textArea.getText();
				try {
				String sql = "insert into hourly(hr_id,emp_id_hr,hr_rate,note) values('"+hr_id+"','"+e_id+"','"+ht_rate+"','"+nt+"')";
				
					stmt.executeUpdate(sql);
					System.out.println(sql);
				
				String sql1 = "update salary set salary = '"+salary.toString()+"' where emp_id_salary = '"+textField_1.getText().toString()+"' ";
				stmt.executeUpdate(sql1);
				System.out.println(sql1);
				
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnConfirmDetails);
		
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(223, 296, 127, 31);
		contentPane.add(btnCancel);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIcon(new ImageIcon("D:\\Projects\\Universitetas\\Bakalaurinis\\Darbo uzmokescio skaiciavimo sistema\\src\\aboutus\\r.jpg"));
		label.setBounds(0, 0, 501, 385);
		contentPane.add(label);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}

}
