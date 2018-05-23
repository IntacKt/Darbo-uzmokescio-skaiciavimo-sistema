package employee;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

import main.DbConnect;

import org.jdesktop.swingx.JXSearchField;
import org.jdesktop.xswingx.PromptSupport;
import org.jdesktop.xswingx.PromptSupport.FocusBehavior;




import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;
import org.jdesktop.swingx.JXSearchField.SearchMode;
import javax.swing.DefaultComboBoxModel;


public class UpdateEmpDetail extends JFrame {

	private JPanel contentPane;
	
	
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	
	Connection conn;
    Statement stmt;
    ResultSet rs;
    private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateEmpDetail frame = new UpdateEmpDetail();
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
	public UpdateEmpDetail() {
		setTitle("Updated Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 609);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		conn = DbConnect.doConnect();
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.LIGHT_GRAY);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(262, 101, 162, 20);
		contentPane.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 44, 638, -8);
		contentPane.add(separator);
		
		JLabel lblNewEntry = new JLabel("Update Employee Details");
		lblNewEntry.setBounds(238, 11, 230, 34);
		lblNewEntry.setFont(new Font("Roboto",Font.BOLD,18));
		contentPane.add(lblNewEntry);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(31, 145, 73, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblDepartmentId = new JLabel("Department ID");
		lblDepartmentId.setBounds(31, 173, 100, 14);
		contentPane.add(lblDepartmentId);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(31, 201, 67, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(31, 240, 73, 14);
		contentPane.add(lblLastName);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setEditable(true);
		textField.setBounds(133, 145, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(133, 198, 187, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(133, 237, 187, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(31, 285, 73, 14);
		contentPane.add(lblDob);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(31, 319, 67, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setActionCommand("Male");
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setActionCommand("Female");
		rdbtnMale.setBounds(133, 315, 80, 23);
		ButtonGroup bG = new ButtonGroup();
	     bG.add(rdbtnMale);
	     bG.add(rdbtnFemale);
	    
	    
		
		
		rdbtnFemale.setBounds(226, 315, 94, 23);
		contentPane.add(rdbtnMale);
		contentPane.add(rdbtnFemale);
		
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(132, 279, 188, 20);
		dateChooser.setDateFormatString("yyyy-MM-dd");
		
		Date dateFromDateChooser = (Date) dateChooser.getDate();
		contentPane.add(dateChooser);
		
		String[] d= new String[]{"", "34KC", "30KA", "25KE", "28KU", "35KT"};
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "34KC", "30KA", "25KE", "28KU", "35KT"}));
		comboBox_1.setBounds(133, 170, 187, 20);
		contentPane.add(comboBox_1);
		
		String[] c= new String[]{"", "Lithuania", "U.S", "India", "U.K", "Japan", "China"};
		JComboBox comboBox = new JComboBox(c);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Lithuania", "U.S", "India"}));
		comboBox.setBounds(133, 355, 187, 20);
		contentPane.add(comboBox);
		
		String[] s= new String[]{"", "Vilnius City Municipality", "Kaunas City Municipality", "Klaipeda City Municipality", "Panevezys City Municipality", "Siauliai City Municipality", "Alytus City Municipality", "Birstonas Municipality", "Palanga City Municipality", "Visaginas Municipality", "Neringa Municipality", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Vilnius City Municipality", "Kaunas City Municipality", "Klaipeda City Municipality", "Panevezys City Municipality", "\u0160iauliai City Municipality", "Alytus City Municipality", "Birstonas Municipality", "Palanga City Municipality", "Visaginas Municipality", "Neringa Municipality", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"}));
		comboBox_2.setBounds(507, 145, 187, 20);
		contentPane.add(comboBox_2);
		
		String[] m= new String[] {"", "Vilnius", "Kaunas", "Siauliai", "Panevezys", "Klaipeda", "New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "Austin", "San Francisco", "Columbus", "Indianapolis", "Denver", "Washington", "Boston", "Detroit", "Nashville", "Oklahoma City", "Las Vegas", "Milwaukee", "Sacramento", "Atlanta", "Raleigh", "Saint Paul", "Nashik", "Faridabad", "Meerut", "Rajkot", "Kalyan-Dombivali", "Vasai-Virar", "Varanasi", "Srinagar", "Aurangabad", "Dhanbad", "Amritsar", "Navi Mumbai", "Allahabad", "Ranchi"};
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "Vilnius", "Kaunas", "Siauliai", "Panevezys", "Klaipeda", "New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego", "Dallas", "Austin", "San Francisco", "Columbus", "Indianapolis", "Denver", "Washington", "Boston", "Detroit", "Nashville", "Oklahoma City", "Las Vegas", "Milwaukee", "Sacramento", "Atlanta", "Raleigh", "Saint Paul", "Nashik", "Faridabad", "Meerut", "Rajkot", "Kalyan-Dombivali", "Vasai-Virar", "Varanasi", "Srinagar", "Aurangabad", "Dhanbad", "Amritsar", "Navi Mumbai", "Allahabad", "Ranchi"}));
		comboBox_3.setBounds(507, 198, 187, 20);
		contentPane.add(comboBox_3);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(31, 358, 67, 14);
		contentPane.add(lblCountry);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(388, 147, 36, 18);
		contentPane.add(lblState);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(388, 201, 26, 14);
		contentPane.add(lblCity);
		
		JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setBounds(356, 145, 2, 328);
		contentPane.add(separator_1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(388, 229, 73, 14);
		contentPane.add(lblAddress);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(507, 227, 187, 88);
		contentPane.add(textArea);
		
		JLabel lblPincode = new JLabel("Pincode");
		lblPincode.setBounds(388, 357, 47, 14);
		contentPane.add(lblPincode);
		
		
			JFormattedTextField formattedTextField_1 = new JFormattedTextField();
			formattedTextField_1.setBounds(507, 351, 187, 22);
			contentPane.add(formattedTextField_1);
			
		 

		
		JLabel lblMobile = new JLabel("Phone Number");
		lblMobile.setBounds(388, 458, 94, 14);
		contentPane.add(lblMobile);
		
	
			JFormattedTextField formattedTextField_2 = new JFormattedTextField();
			formattedTextField_2.setBounds(507, 452, 187, 22);
			contentPane.add(formattedTextField_2);
			
			JLabel lblEmilId = new JLabel("Email");
			lblEmilId.setBounds(388, 395, 34, 14);
			contentPane.add(lblEmilId);
			
			textField_8 = new JTextField();
			textField_8.setBounds(507, 390, 187, 20);
			contentPane.add(textField_8);
			textField_8.setColumns(10);
		
			try {
				stmt = conn.createStatement();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			
			JLabel label_1 = new JLabel("");
			label_1.setBounds(194, 545, 323, 14);
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
								dateChooser.setDate(d);
								comboBox_1.setSelectedItem("");
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
			
			srchfldEnterempId.setPrompt("Enter Employee ID\r\n");
			srchfldEnterempId.setBounds(272, 60, 145, 22);
			contentPane.add(srchfldEnterempId);
			
			
			
			
			JButton btnSave = new JButton("Update");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String eid = textField.getText().toString();
					String dept_id= comboBox_1.getSelectedItem().toString();
					String lname = textField_5.getText();
					String fname = textField_4.getText();
					java.sql.Date dat = new java.sql.Date(dateChooser.getDate().getTime());
					String gen  =bG.getSelection().getActionCommand();
					String country = comboBox.getSelectedItem().toString();
					String state = comboBox_2.getSelectedItem().toString();
					String city = comboBox_3.getSelectedItem().toString();
					String add = textArea.getText();
					String pincode = formattedTextField_1.getText().toString();
					String email = textField_8.getText().toString();
					String mob = formattedTextField_2.getText().toString();

					try {
					String sql = "update employee set emp_id ='"+eid+"',dept_id_emp = '"+dept_id+"',last_name = '"+lname+"',first_name ='"+fname+"',dob = '"+dat+"',gender = '"+gen+"',country ='"
									+country+ "', state = '"+state+"', city = '"+city+"', address ='"+add+"', pincode ='"+pincode+"',email='"
											+ email+"', mobile_no = '"+mob+"' where emp_id = '"+srchfldEnterempId.getText().toString()+"' ";
					System.out.println(sql);
					stmt.executeUpdate(sql);
					
					label_1.setText("Your Records are Successfully Updated");
								
					
					} catch (SQLException e1) {
						e1.printStackTrace();
						
					}
				}
			});
			btnSave.setBounds(184, 500, 136, 34);
			contentPane.add(btnSave);
			
			JButton btnCancel = new JButton("Cancel");
			btnCancel.setBounds(388, 501, 136, 34);
			contentPane.add(btnCancel);
			
			



			PromptSupport.setPrompt("Enter Employee ID", textField);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField);
			PromptSupport.setFontStyle(Font.ITALIC, textField);
			PromptSupport.setForeground(Color.darkGray, textField);
			
			PromptSupport.setPrompt("Enter First Name", textField_4);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_4);
			PromptSupport.setFontStyle(Font.ITALIC, textField_4); 
			PromptSupport.setForeground(Color.DARK_GRAY, textField_4);
			
			PromptSupport.setPrompt("Enter Last Name", textField_5);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_5);
			PromptSupport.setFontStyle(Font.ITALIC, textField_5); 
			PromptSupport.setForeground(Color.darkGray, textField_5);
			
			PromptSupport.setPrompt("Enter Employee Address", textArea);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textArea);
			PromptSupport.setFontStyle(Font.ITALIC, textArea); 
			PromptSupport.setForeground(Color.darkGray, textArea);
			
			PromptSupport.setPrompt("Enter Pincode", formattedTextField_1);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, formattedTextField_1);
			PromptSupport.setFontStyle(Font.ITALIC, formattedTextField_1); 
			PromptSupport.setForeground(Color.darkGray, formattedTextField_1);
			
			PromptSupport.setPrompt("Enter Valid email", textField_8);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_8);
			PromptSupport.setFontStyle(Font.ITALIC, textField_8); 
			PromptSupport.setForeground(Color.darkGray, textField_8);
	
			
			PromptSupport.setPrompt("Enter Phone Number", formattedTextField_2);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, formattedTextField_2);
			PromptSupport.setFontStyle(Font.ITALIC, formattedTextField_2);
			PromptSupport.setForeground(Color.darkGray, formattedTextField_2);
			
		
			
			
			
			
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});

			PromptSupport.setPrompt("Enter Employee ID", textField);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField);
			PromptSupport.setFontStyle(Font.ITALIC, textField);
			PromptSupport.setForeground(Color.darkGray, textField);
			
			PromptSupport.setPrompt("Enter First Name", textField_4);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_4);
			PromptSupport.setFontStyle(Font.ITALIC, textField_4); 
			PromptSupport.setForeground(Color.DARK_GRAY, textField_4);
			
			PromptSupport.setPrompt("Enter Last Name", textField_5);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_5);
			PromptSupport.setFontStyle(Font.ITALIC, textField_5); 
			PromptSupport.setForeground(Color.darkGray, textField_5);
			
			PromptSupport.setPrompt("Enter Employee Address", textArea);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textArea);
			PromptSupport.setFontStyle(Font.ITALIC, textArea); 
			PromptSupport.setForeground(Color.darkGray, textArea);
			
			PromptSupport.setPrompt("Enter Pincode", formattedTextField_1);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, formattedTextField_1);
			PromptSupport.setFontStyle(Font.ITALIC, formattedTextField_1); 
			PromptSupport.setForeground(Color.darkGray, formattedTextField_1);
			
			PromptSupport.setPrompt("Enter valid email", textField_8);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_8);
			PromptSupport.setFontStyle(Font.ITALIC, textField_8); 
			PromptSupport.setForeground(Color.darkGray, textField_8);
	
			
			PromptSupport.setPrompt("Enter Phone Number", formattedTextField_2);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, formattedTextField_2);
			PromptSupport.setFontStyle(Font.ITALIC, formattedTextField_2);
			PromptSupport.setForeground(Color.darkGray, formattedTextField_2);
		} 
	}

