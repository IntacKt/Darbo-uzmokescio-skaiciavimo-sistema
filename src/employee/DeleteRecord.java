package employee;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.util.*;

import main.DbConnect;




import org.jdesktop.swingx.JXSearchField;
import org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior;

import com.toedter.calendar.JDateChooser;

import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;


public class DeleteRecord extends JFrame {

	private JPanel contentPane;
	

	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	
	Connection conn;
    Statement stmt;
    ResultSet rs;
    private JTextField textField_8;
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteRecord frame = new DeleteRecord();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public DeleteRecord() {
		setTitle("Delete Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 750, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		conn = DbConnect.doConnect();
		
		JLabel lblSalaryCalculationSystem = new JLabel("Salary Calculation System");
		lblSalaryCalculationSystem.setBounds(232, 11, 275, 40);
		lblSalaryCalculationSystem.setFont(new Font("Roboto",Font.BOLD,22));
		contentPane.add(lblSalaryCalculationSystem);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(37, 106, 662, 2);
		contentPane.add(separator);
		
		JLabel lblNewEntry = new JLabel("Delete Employee Details");
		lblNewEntry.setBounds(256, 51, 225, 34);
		lblNewEntry.setFont(new Font("Roboto",Font.BOLD,18));
		contentPane.add(lblNewEntry);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(38, 204, 73, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblDepartmentId = new JLabel("Department ID");
		lblDepartmentId.setBounds(38, 232, 100, 14);
		contentPane.add(lblDepartmentId);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(37, 260, 67, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(37, 299, 73, 14);
		contentPane.add(lblLastName);
		
		textField = new JTextField();
		textField.setBounds(140, 204, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(139, 257, 187, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(139, 296, 187, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(37, 344, 73, 14);
		contentPane.add(lblDob);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(37, 378, 67, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setActionCommand("Male");
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setActionCommand("Female");
		rdbtnMale.setBounds(139, 374, 79, 23);
		ButtonGroup bG = new ButtonGroup();
	     bG.add(rdbtnMale);
	     bG.add(rdbtnFemale);
	   
	    
		
		
		rdbtnFemale.setBounds(248, 374, 79, 23);
		contentPane.add(rdbtnMale);
		contentPane.add(rdbtnFemale);
		
			
	
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(138, 338, 188, 20);
		dateChooser.setDateFormatString("yyyy-MM-dd");
		
		Date dateFromDateChooser = (Date) dateChooser.getDate();
		contentPane.add(dateChooser);
		
		String[] d= new String[]{"", "34KC", "30KA", "25KE", "28KU", "35KT"};
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "34KC", "30KA", "25KE", "28KU", "35KT"}));
		comboBox_1.setBounds(140, 229, 187, 20);
		contentPane.add(comboBox_1);
		
		String[] s= new String[]{"", "Vilnius City Municipality", "Kaunas City Municipality", "Klaipeda City Municipality", "Panevezys City Municipality", "Siauliai City Municipality", "Alytus City Municipality", "Birstonas Municipality", "Palanga City Municipality", "Visaginas Municipality", "Neringa Municipality", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Vilnius City Municipality", "Kaunas City Municipality", "Klaipeda City Municipality", "Panevezys City Municipality", "\u0160iauliai City Municipality", "Alytus City Municipality", "Birstonas Municipality", "Palanga City Municipality", "Visaginas Municipality", "Neringa Municipality", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"}));
		comboBox_2.setBounds(485, 204, 187, 20);
		contentPane.add(comboBox_2);
		
		String[] m= new String[] {"", "Vilnius", "Kaunas", "Siauliai", "Panevezys", "Klaipeda", "New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "Austin", "San Francisco", "Columbus", "Indianapolis", "Denver", "Washington", "Boston", "Detroit", "Nashville", "Oklahoma City", "Las Vegas", "Milwaukee", "Sacramento", "Atlanta", "Raleigh", "Saint Paul", "Nashik", "Faridabad", "Meerut", "Rajkot", "Kalyan-Dombivali", "Vasai-Virar", "Varanasi", "Srinagar", "Aurangabad", "Dhanbad", "Amritsar", "Navi Mumbai", "Allahabad", "Ranchi"};
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "Vilnius", "Kaunas", "Siauliai", "Panevezys", "Klaipeda", "New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "Austin", "San Francisco", "Columbus", "Indianapolis", "Denver", "Washington", "Boston", "Detroit", "Nashville", "Oklahoma City", "Las Vegas", "Milwaukee", "Sacramento", "Atlanta", "Raleigh", "Saint Paul", "Nashik", "Faridabad", "Meerut", "Rajkot", "Kalyan-Dombivali", "Vasai-Virar", "Varanasi", "Srinagar", "Aurangabad", "Dhanbad", "Amritsar", "Navi Mumbai", "Allahabad", "Ranchi"}));
		comboBox_3.setBounds(485, 257, 187, 20);
		contentPane.add(comboBox_3);
		
		String[] c= new String[]{"Lithuania", "U.S", "India", "U.K", "Japan", "China"};
		JComboBox comboBox = new JComboBox(c);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Lithuania", "U.S", "India", "U.K", "Japan", "China"}));
		comboBox.setBounds(139, 420, 187, 20);
		contentPane.add(comboBox);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(37, 423, 67, 14);
		contentPane.add(lblCountry);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(402, 206, 36, 22);
		contentPane.add(lblState);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(402, 260, 24, 14);
		contentPane.add(lblCity);
		
		
		
		JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setBounds(369, 194, 2, 341);
		contentPane.add(separator_1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(402, 300, 79, 14);
		contentPane.add(lblAddress);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(485, 288, 187, 88);
		contentPane.add(textArea);
		
		JLabel lblPincode = new JLabel("Pincode");
		lblPincode.setBounds(402, 416, 73, 14);
		contentPane.add(lblPincode);

			JFormattedTextField formattedTextField_1 = new JFormattedTextField();
			formattedTextField_1.setBounds(485, 412, 187, 22);
			contentPane.add(formattedTextField_1);
			
		 

		
		JLabel lblMobile = new JLabel("Phone Number");
		lblMobile.setBounds(402, 517, 91, 14);
		contentPane.add(lblMobile);
	
			JFormattedTextField formattedTextField_2 = new JFormattedTextField();
			formattedTextField_2.setBounds(485, 513, 187, 22);
			contentPane.add(formattedTextField_2);
			
			JLabel lblEmilId = new JLabel("Email");
			lblEmilId.setBounds(402, 454, 62, 14);
			contentPane.add(lblEmilId);
			
			textField_8 = new JTextField();
			textField_8.setBounds(485, 451, 187, 20);
			contentPane.add(textField_8);
			textField_8.setColumns(10);
		
			try {
				stmt = conn.createStatement();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			
			JLabel label = new JLabel("");
			label.setFont(new Font("Tahoma", Font.BOLD, 11));
			label.setBounds(1059, 168, 139, 14);
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("");
			label_1.setBounds(256, 618, 237, 20);
			contentPane.add(label_1);

			JXSearchField srchfldEnterempId = new JXSearchField();
			srchfldEnterempId.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					try {
						String sql = "Select * from employee where emp_id = '"+srchfldEnterempId.getText().toString()+"' "; 
							
						
							rs = stmt.executeQuery(sql);
							System.out.println(sql);
							if (!rs.isBeforeFirst()) {
							    System.out.println("no data found");
							    label.setText("No Record Found");
							    java.util.Date d = new java.util.Date();
							    d.toString();
							    textField.setText("");
							    comboBox_1.setSelectedItem("");
								dateChooser.setDate(d);
								comboBox.setSelectedItem("");
								textField_4.setText("");;
								textField_5.setText("");;
								comboBox_2.setSelectedItem("");
								textField_8.setText("");
								comboBox_3.setSelectedItem("");
								formattedTextField_1.setText("");
								formattedTextField_2.setText("");
								textArea.setText("");
								rdbtnMale.setSelected(false);
								rdbtnFemale.setSelected(false);
								label_1.setText("");
								
							    
							    
							} 
							else {
								
								
							while(rs.next()){
								label.setText("");
							textField.setText(rs.getString("emp_id"));
							comboBox_1.setSelectedItem(rs.getString("dept_id_emp"));
							textField_4.setText(rs.getString("first_name"));
							textField_5.setText(rs.getString("last_name"));
							dateChooser.setDate(rs.getDate("dob"));
							String gen= rs.getString("gender");
							
							if(gen.equals("Male")){
								rdbtnMale.setSelected(true);
								rdbtnFemale.setSelected(false);
							}
							else{
								rdbtnFemale.setSelected(true);
								rdbtnMale.setSelected(false);
							}
							comboBox.setSelectedItem(rs.getString("country"));
							comboBox_2.setSelectedItem(rs.getString("state"));
							comboBox_3.setSelectedItem(rs.getString("city"));
							textArea.setText(rs.getString("address"));
							formattedTextField_1.setText(rs.getString("pincode"));
							textField_8.setText(rs.getString("email"));
							formattedTextField_2.setText(rs.getString("mobile_no"));
							
							
							}
							
							}
							
							
						} catch (SQLException e1) {
							e1.printStackTrace();
						} 
				}
			});
			srchfldEnterempId.setFocusBehavior(FocusBehavior.SHOW_PROMPT);
			srchfldEnterempId.setPrompt("Enter Employee ID\r\n");
			srchfldEnterempId.setBounds(219, 140, 145, 22);
			contentPane.add(srchfldEnterempId);
			
			JButton btnSearch_1 = new JButton("Search");
			btnSearch_1.setBounds(375, 140, 89, 23);
			
			btnSearch_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
				
					
					try {
						String sql = "Select * from employee where emp_id = '"+srchfldEnterempId.getText().toString()+"' "; 
							
						
							rs = stmt.executeQuery(sql);
							System.out.println(sql);
								
							while(rs.next()){
							textField.setText(rs.getString("emp_id"));
							comboBox_1.setSelectedItem(rs.getString("dept_id_emp"));
							textField_4.setText(rs.getString("first_name"));
							textField_5.setText(rs.getString("last_name"));
							dateChooser.setDate(rs.getDate("dob"));
							String gen= rs.getString("gender");
							
							if(gen.equals("Male")){
								rdbtnMale.setSelected(true);
								rdbtnFemale.setSelected(false);
							}
							else{
								rdbtnFemale.setSelected(true);
								rdbtnMale.setSelected(false);
							}
							comboBox.setSelectedItem(rs.getString("country"));
							comboBox_2.setSelectedItem(rs.getString("state"));
							comboBox_3.setSelectedItem(rs.getString("city"));
							textArea.setText(rs.getString("address"));
							formattedTextField_1.setText(rs.getString("pincode"));
							textField_8.setText(rs.getString("email"));
							formattedTextField_2.setText(rs.getString("mobile_no"));
							
							
							}
							
							
							
							
						} catch (SQLException e1) {
							e1.printStackTrace();
						} 
					
				}
			});
			

			
			contentPane.add(btnSearch_1);
			
			JButton btnSave = new JButton("Delete");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				
					try {
						String sql = "delete from employee where emp_id = '"+srchfldEnterempId.getText().toString()+"'";
						stmt.executeUpdate(sql);
						System.out.println(sql);
						 
						label_1.setText("Record Deleted Successfully");
					
					} catch (SQLException e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, e1);
						
					}
				}
			});
			btnSave.setBounds(204, 573, 136, 34);
			contentPane.add(btnSave);
			
			JButton btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnCancel.setBounds(402, 573, 136, 34);
			contentPane.add(btnCancel);
		}
	}


	


