package payroll;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

import org.jdesktop.swingx.JXSearchField;
import org.jdesktop.swingx.JXSearchField.SearchMode;

import main.DbConnect;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Bonus extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_7;
    private JTextField textField_8;
   
    
    Connection conn;
    Statement stmt,stmt1,stmt2;
    ResultSet rs,rs1 ,rs2,rs3;
    private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bonus frame = new Bonus();
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
	public Bonus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 570, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		conn = DbConnect.doConnect();
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 56, 526, 14);
		contentPane.add(separator);
		
		JLabel lblNewEntry = new JLabel("Bonus  Details");
		lblNewEntry.setBounds(208, 11, 140, 34);
		lblNewEntry.setFont(new Font("Roboto",Font.BOLD,18));
		contentPane.add(lblNewEntry);
		
		JLabel lblDepartmentId = new JLabel("Employee ID");
		lblDepartmentId.setBounds(22, 136, 89, 14);
		contentPane.add(lblDepartmentId);
		
		JLabel lblJobId = new JLabel("First Name");
		lblJobId.setBounds(22, 161, 89, 14);
		contentPane.add(lblJobId);
		
		JLabel lblEmployeeTypeId = new JLabel("Last Name");
		lblEmployeeTypeId.setBounds(22, 186, 89, 17);
		contentPane.add(lblEmployeeTypeId);
		
		JLabel lblFirstName = new JLabel("Date");
		lblFirstName.setBounds(22, 236, 30, 14);
		contentPane.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setForeground(Color.RED);
		textField_1.setBounds(105, 130, 187, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(105, 155, 187, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(105, 181, 187, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	
	
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(105, 209, 187, 20);
		contentPane.add(textField_5);
		
		JLabel lblJobTitle = new JLabel("Job Title");
		lblJobTitle.setBounds(22, 214, 89, 17);
		contentPane.add(lblJobTitle);
		
		String[] cb = new String[]{"Annual","Special"};
		JComboBox comboBox = new JComboBox(cb);
		comboBox.setBounds(105, 261, 187, 20);
		contentPane.add(comboBox);
		
		JLabel lblTypeOfBonus = new JLabel("Type of Bonus");
		lblTypeOfBonus.setBounds(22, 261, 102, 14);
		contentPane.add(lblTypeOfBonus);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(105, 289, 187, 20);
		contentPane.add(textField_6);
		
		JLabel lblBonusAmount = new JLabel("Bonus Amount");
		lblBonusAmount.setBounds(22, 292, 102, 14);
		contentPane.add(lblBonusAmount);
		
		JLabel lblRemarks = new JLabel("Remarks");
		lblRemarks.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRemarks.setBounds(394, 130, 59, 14);
		contentPane.add(lblRemarks);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(313, 157, 223, 115);
		contentPane.add(textArea);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(313, 360, 89, 23);
		contentPane.add(btnCancel);

		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(313, 81, 89, 23);
		contentPane.add(btnSearch);
		
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(105, 236, 187, 20);
		dateChooser.setDateFormatString("yyyy-MM-dd");
		contentPane.add(dateChooser);
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(201, 407, 201, 14);
		contentPane.add(label);
		JLabel label_1 = new JLabel("");
		label_1.setBounds(201, 432, 202, 14);
		contentPane.add(label_1);
		
		JXSearchField srchfldEnterempId = new JXSearchField();
		srchfldEnterempId.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		srchfldEnterempId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String sql = "Select * from bonus b inner join employee e on b.emp_id_bonus = e.emp_id where b.emp_id_bonus= '"+srchfldEnterempId.getText().toString()+"' "; 
						
					
					
						rs = stmt.executeQuery(sql);
						
						System.out.println(sql);
						

						if (!rs.isBeforeFirst()) {
						    System.out.println("no data found");
						    label.setText("No Record Found");
							textField_1.setText("");
							textField_2.setText("");
							textField_3.setText("");
							java.util.Date d = new java.util.Date();
							dateChooser.setDate(d);
							textField_5.setText("");
							textField_6.setText("");
							textArea.setText("");
							label_1.setText("");
							
							} 
						else {
						while(rs.next()){
							
							label.setText("");
							
							dateChooser.setDate(rs.getDate("date"));
							comboBox.setSelectedItem((rs.getString("bonus_type")));
							textField_6.setText(rs.getString("bonus_payment"));
							textArea.setText(rs.getString("note"));
							textField_1.setText(rs.getString("emp_id"));
							textField_2.setText(rs.getString("first_name"));
							textField_3.setText(rs.getString("last_name"));
							
							
							
				}
						
						String sql2 = "Select * from job_title where emp_id_job = '"+srchfldEnterempId.getText().toString()+"' "; 
						rs3 = stmt.executeQuery(sql2);
						System.out.println(sql2);
						
						while(rs3.next()){
							textField_5.setText(rs3.getString("job_title"));
						}
						
						
						
					}} catch (SQLException e1) {
						e1.printStackTrace();
					} 
				}
			
			
		});
		
		
		srchfldEnterempId.setSearchMode(SearchMode.INSTANT);
		srchfldEnterempId.setPrompt("Enter Employee ID\r\n");
		srchfldEnterempId.setBounds(150, 81, 140, 22);
		contentPane.add(srchfldEnterempId);

	
		
		try {
			stmt1 = conn.createStatement();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String em = textField_1.getText().toString();
				java.sql.Date date = new java.sql.Date(dateChooser.getDate().getTime());
				String type  = comboBox.getSelectedItem().toString();
				String ba = textField_6.getText().toString();
				String nt = textArea.getText().toString();
				try {
				String sql  = "update bonus set date = '"+date+"', bonus_payment = '"+ba+"',note = '"+nt+"',bonus_type = '"+type+"'  where emp_id_bonus = '"+srchfldEnterempId.getText().toString()+"' ";
					
					System.out.println(sql);
				 	stmt1.executeUpdate(sql);
				
					label_1.setText("Record Updated Sucessfully");
				
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnSave.setBounds(201, 360, 89, 23);
		contentPane.add(btnSave);
		
		JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setBounds(301, 131, 2, 204);
		contentPane.add(separator_1);
		
	
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}
}
