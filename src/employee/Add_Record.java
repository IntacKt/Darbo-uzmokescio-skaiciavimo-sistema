package employee;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

import main.DbConnect;
import main.Home;

import org.jdesktop.swingx.prompt.PromptSupport;
import org.jdesktop.swingx.prompt.PromptSupport.FocusBehavior;

import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;


public class Add_Record extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	Connection conn;
    Statement stmt;
    ResultSet rs;
    private JTextField textField_8;
    
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		private static final String MOBILE_PATTERN = "\\d{10}";
		private static final String PINCODE_PATTERN = "\\d{6}";
    
   


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Record frame = new Add_Record();
					frame.setVisible(true);
					frame.setTitle("New Record Entry");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public Add_Record() throws ParseException {
		setTitle("Add Employee");
		setBackground(SystemColor.inactiveCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		conn = DbConnect.doConnect();
		
		JLabel jlabeloutput = new JLabel("");
		jlabeloutput.setBounds(235, 557, 240, 34);
		contentPane.add(jlabeloutput);
		
		JLabel lblSalaryCalculationSystem = new JLabel("Salary Calculation System");
		lblSalaryCalculationSystem.setBounds(224, 11, 276, 43);
		lblSalaryCalculationSystem.setFont(new Font("Roboto",Font.BOLD,22));
		contentPane.add(lblSalaryCalculationSystem);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 107, 673, 2);
		contentPane.add(separator);
		
		JLabel lblNewEntry = new JLabel("New Employee Entry");
		lblNewEntry.setBounds(260, 62, 204, 34);
		lblNewEntry.setFont(new Font("Roboto",Font.BOLD,18));
		contentPane.add(lblNewEntry);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(23, 143, 73, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblDepartmentId = new JLabel("Department ID");
		lblDepartmentId.setBounds(23, 174, 100, 14);
		contentPane.add(lblDepartmentId);
		
		JLabel lblJobId = new JLabel("Job ID");
		lblJobId.setBounds(23, 213, 94, 14);
		contentPane.add(lblJobId);
		
		JLabel lblEmployeeTypeId = new JLabel("Employee Type ID");
		lblEmployeeTypeId.setBounds(23, 257, 111, 20);
		contentPane.add(lblEmployeeTypeId);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(23, 297, 94, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(23, 336, 100, 14);
		contentPane.add(lblLastName);
		
		textField = new JTextField();
		textField.setBounds(125, 143, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 171, 187, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(125, 210, 187, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(125, 254, 187, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(125, 294, 187, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(125, 333, 187, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(23, 381, 94, 14);
		contentPane.add(lblDob);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(23, 415, 94, 14);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setActionCommand("Male");
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setActionCommand("Female");
		rdbtnMale.setBounds(125, 411, 81, 23);
		ButtonGroup bG = new ButtonGroup();
	     bG.add(rdbtnMale);
	     bG.add(rdbtnFemale);
		
		rdbtnFemale.setBounds(224, 411, 88, 23);
		contentPane.add(rdbtnMale);
		contentPane.add(rdbtnFemale);
		
			
	

		
		

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(125, 378, 187, 20);
		
		
		Date dateFromDateChooser = dateChooser.getDate();
		
		
		contentPane.add(dateChooser);

		
		String[] c= new String[]{"Lithuania", "U.S", "India", "U.K", "Japan", "China"};
		JComboBox comboBox = new JComboBox(c);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Lithuania", "U.S", "India", "U.K", "Japan", "China"}));
		comboBox.setBounds(125, 457, 133, 20);
		contentPane.add(comboBox);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(23, 460, 94, 14);
		contentPane.add(lblCountry);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(401, 146, 63, 14);
		contentPane.add(lblState);
		
		textField_6 = new JTextField();
		textField_6.setBounds(525, 148, 187, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(401, 198, 49, 18);
		contentPane.add(lblCity);
		
		textField_7 = new JTextField();
		textField_7.setBounds(525, 199, 187, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		
		
		JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setBounds(357, 146, 10, 338);
		contentPane.add(separator_1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(401, 228, 63, 14);
		contentPane.add(lblAddress);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(525, 230, 187, 88);
		contentPane.add(textArea);
		
		JLabel lblPincode = new JLabel("Pincode");
		lblPincode.setBounds(401, 353, 74, 20);
		contentPane.add(lblPincode);
		
		MaskFormatter fmt;
	
		//	fmt = new MaskFormatter("######");
			JFormattedTextField formattedTextField_1 = new JFormattedTextField();
			formattedTextField_1.setBounds(525, 354, 187, 22);
			contentPane.add(formattedTextField_1);
			
		 

		
		JLabel lblMobile = new JLabel("Phone Number");
		lblMobile.setBounds(401, 460, 99, 14);
		contentPane.add(lblMobile);
		
	
		
		
			JFormattedTextField formattedTextField_2 = new JFormattedTextField();
			formattedTextField_2.setBounds(525, 455, 187, 22);
			contentPane.add(formattedTextField_2);
			
			JLabel lblEmilId = new JLabel("Email");
			lblEmilId.setBounds(401, 394, 63, 14);
			contentPane.add(lblEmilId);
			
			textField_8 = new JTextField();
			textField_8.setBounds(525, 393, 187, 20);
			contentPane.add(textField_8);
			textField_8.setColumns(10);
		
			try {
				stmt = conn.createStatement();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			JButton btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
					String eid = textField.getText().toString();
					String dept_id= textField_1.getText().toString();
					String job_id = textField_2.getText().toString();
					String type_id = textField_3.getText().toString();
					String lname = textField_5.getText().toString();
					String fname = textField_4.getText().toString();
					java.sql.Date date = new java.sql.Date(dateChooser.getDate().getTime());
					String gender =bG.getSelection().getActionCommand();
					String country = comboBox.getSelectedItem().toString();
					String state = textField_6.getText().toString();
					String city = textField_7.getText().toString();
					String add = textArea.getText().toString();
					String pincode = formattedTextField_1.getText().toString();
					String email = textField_8.getText().toString();
					String mob = formattedTextField_2.getText().toString();
					 System.out.println(gender+dateChooser.getDateFormatString().toString());
					 
					 

						boolean testEmail, testMob,testpin;
						Pattern patternEmail, patternMob,patternpin;
						Matcher matcherEmail, matcherMob,matcherpin;
						

						patternEmail = Pattern.compile(EMAIL_PATTERN);
						matcherEmail = patternEmail.matcher(email);
						testEmail =  matcherEmail.matches();
						
						patternMob = Pattern.compile(MOBILE_PATTERN);
						matcherMob = patternMob.matcher(mob);
						testMob = matcherMob.matches();
						
						patternpin = Pattern.compile(PINCODE_PATTERN);
						matcherpin = patternpin.matcher(pincode);
						testpin = matcherpin.matches();
						
					if((!testEmail) || (!testMob) || (!testpin)){
						JOptionPane.showMessageDialog(null, "Enter Valid Email, Phone Number or Pincode");
					}
					
					else{
					
					try {
					
					String sql = "insert into  employee(emp_id ,dept_id_emp,job_id_emp,type_id_emp,last_name,first_name,dob,gender,country,state"
							+ ",city,address,pincode,email,mobile_no)"
							+ "values('"+eid+"','"+dept_id+"','"+job_id+"','"+type_id+"','"+lname+"','"+fname+"','"+date+"','"+gender+"','"+country+"','"+state+"','"+city+"','"+add+"','"+pincode+"','"+email+"','"+mob+"')";
					
							if(testEmail && testMob && testpin){
							JOptionPane.showMessageDialog(null, "Record was added successfully");
							}
								System.out.println(sql);
								stmt.executeUpdate(sql);	
								jlabeloutput.setText("Record was added successfully");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, e1);
						
					}
				}
			}
		});
			
			btnSave.setBounds(176, 512, 136, 34);
			contentPane.add(btnSave);
			
			JButton btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					dispose();
				
				}
			});
			btnCancel.setBounds(401, 512, 136, 34);
			contentPane.add(btnCancel);
			
			PromptSupport.setPrompt("Enter Employee ID", textField);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField);
			PromptSupport.setFontStyle(Font.ITALIC, textField);
			PromptSupport.setForeground(Color.darkGray, textField);
			
			PromptSupport.setPrompt("Enter Job ID", textField_1);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_1);
			PromptSupport.setFontStyle(Font.ITALIC, textField_1);
			PromptSupport.setForeground(Color.darkGray, textField_1);
			
			PromptSupport.setPrompt("Enter Department ID", textField_2);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_2);
			PromptSupport.setFontStyle(Font.ITALIC, textField_2); 
			PromptSupport.setForeground(Color.darkGray, textField_2);
			
			PromptSupport.setPrompt("Enter Employee Type ID", textField_3);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_3);
			PromptSupport.setFontStyle(Font.ITALIC, textField_3); 
			PromptSupport.setForeground(Color.darkGray, textField_3);
			
			PromptSupport.setPrompt("Enter First Name", textField_4);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_4);
			PromptSupport.setFontStyle(Font.ITALIC, textField_4); 
			PromptSupport.setForeground(Color.DARK_GRAY, textField_4);
			
			PromptSupport.setPrompt("Enter Last Name", textField_5);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_5);
			PromptSupport.setFontStyle(Font.ITALIC, textField_5); 
			PromptSupport.setForeground(Color.darkGray, textField_5);
	
			PromptSupport.setPrompt("Enter State", textField_6);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_6);
			PromptSupport.setFontStyle(Font.ITALIC, textField_6);
			PromptSupport.setForeground(Color.darkGray, textField_6);
			
			PromptSupport.setPrompt("Enter City", textField_7);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, textField_7);
			PromptSupport.setFontStyle(Font.ITALIC, textField_7);
			PromptSupport.setForeground(Color.darkGray, textField_7);
			
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
	
			
			PromptSupport.setPrompt("Enter Mobile Number", formattedTextField_2);
			PromptSupport.setFocusBehavior(FocusBehavior.SHOW_PROMPT, formattedTextField_2);
			PromptSupport.setFontStyle(Font.ITALIC, formattedTextField_2);
			PromptSupport.setForeground(Color.darkGray, formattedTextField_2);
			
			JLabel Jlabel = new JLabel("");
			Jlabel.setHorizontalAlignment(SwingConstants.CENTER);
			Jlabel.setVerticalAlignment(SwingConstants.TOP);
			Jlabel.setIcon(new ImageIcon("D:\\Projects\\Universitetas\\Bakalaurinis\\Darbo uzmokescio skaiciavimo sistema\\src\\aboutus\\r.jpg"));
			Jlabel.setBounds(0, 0, 789, 674);
			contentPane.add(Jlabel);
			
		
			
		}
	}

