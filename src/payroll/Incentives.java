package payroll;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.JXSearchField;
import org.jdesktop.swingx.JXSearchField.SearchMode;

import main.DbConnect;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Incentives extends JFrame {

	private JPanel contentPane;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    
    Connection conn;
    Statement stmt,stmt1,stmt2;
    ResultSet rs,rs1,rs2,rs3,rs4;
    private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Incentives frame = new Incentives();
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
	public Incentives() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 630, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		conn = DbConnect.doConnect();
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 56, 589, 8);
		contentPane.add(separator);
		
		JLabel lblNewEntry = new JLabel("Incentives");
		lblNewEntry.setBounds(243, 11, 100, 34);
		lblNewEntry.setFont(new Font("Roboto",Font.BOLD,18));
		contentPane.add(lblNewEntry);
		
		JLabel lblEmployeeId = new JLabel("Salary ID");
		lblEmployeeId.setBounds(10, 111, 81, 14);
		contentPane.add(lblEmployeeId);
		
		JLabel lblDepartmentId = new JLabel("Employee ID");
		lblDepartmentId.setBounds(10, 136, 81, 14);
		contentPane.add(lblDepartmentId);
		
		JLabel lblJobId = new JLabel("First Name");
		lblJobId.setBounds(10, 161, 81, 14);
		contentPane.add(lblJobId);
		
		JLabel lblEmployeeTypeId = new JLabel("Last Name");
		lblEmployeeTypeId.setBounds(10, 186, 81, 14);
		contentPane.add(lblEmployeeTypeId);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(80, 108, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setBounds(80, 133, 187, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(80, 158, 187, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(80, 183, 187, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(289, 316, 89, 23);
		contentPane.add(btnCancel);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(80, 208, 187, 20);
		contentPane.add(textField_4);
		
		JLabel lblJobTitle = new JLabel("Job title");
		lblJobTitle.setBounds(10, 211, 81, 14);
		contentPane.add(lblJobTitle);
		
		JLabel lblIncentivesInfo = new JLabel("Incentives Info.");
		lblIncentivesInfo.setFont(new Font("Roboto",Font.BOLD,14));
		lblIncentivesInfo.setBounds(289, 109, 116, 14);
		contentPane.add(lblIncentivesInfo);
		
		JLabel lblHra = new JLabel("H.R.A");
		lblHra.setBounds(289, 136, 35, 14);
		contentPane.add(lblHra);
		
		JLabel lblDa = new JLabel("D.A");
		lblDa.setBounds(289, 161, 27, 14);
		contentPane.add(lblDa);
		
		JLabel lblCca = new JLabel("C.C.A");
		lblCca.setBounds(289, 186, 35, 14);
		contentPane.add(lblCca);
		
		JLabel lblT = new JLabel("TA");
		lblT.setBounds(289, 211, 20, 14);
		contentPane.add(lblT);
		
		JLabel lblMedical = new JLabel("Medical");
		lblMedical.setBounds(289, 236, 116, 14);
		contentPane.add(lblMedical);
		
		textField_5 = new JTextField();
		textField_5.setBounds(445, 134, 35, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(445, 159, 35, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(445, 183, 35, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(445, 208, 35, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(445, 233, 35, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(526, 133, 73, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(526, 158, 73, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(526, 183, 73, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(526, 208, 73, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(526, 233, 73, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setBounds(526, 258, 73, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblPercentage = new JLabel("Percentage(%)");
		lblPercentage.setBounds(415, 105, 105, 22);
		lblPercentage.setFont(new Font("Roboto",Font.BOLD,14));
		contentPane.add(lblPercentage);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(530, 109, 89, 14);
		lblAmount.setFont(new Font("Roboto",Font.BOLD,14));
		contentPane.add(lblAmount);

		JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setBounds(277, 111, 13, 186);
		contentPane.add(separator_1);
		textField_5.setText("0");
		textField_6.setText("0");
		textField_7.setText("0");
		textField_8.setText("0");
		textField_9.setText("0");
		
		textField_10.setText("0");
		textField_11.setText("0");
		textField_12.setText("0");
		textField_13.setText("0");
		textField_14.setText("0");
		textField_15.setText("0");
		

		JLabel label_1 = new JLabel("");
		label_1.setBounds(178, 350, 200, 14);
		contentPane.add(label_1);
	
		
		
		JButton btnAdd = new JButton("Save");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				String em = textField_1.getText().toString();
				String h = textField_10.getText().toString();
				String d = textField_11.getText().toString();
				String c = textField_12.getText().toString();
				String t = textField_13.getText().toString();
				String m = textField_14.getText().toString();
				String total =  textField_15.getText().toString();
				
				String sql6 = "insert into incentives(emp_id_ins,hra,da,cca,ta,medical,total"
						+ ") values('"+em+"','"+h+"','"+d+"','"+c+"','"+t+"','"+m+"','"+total+"')";
				stmt.execute(sql6);
				System.out.println(sql6);
				label_1.setText("Record Added Successfully");
				
				
				} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		btnAdd.setBounds(178, 316, 89, 23);
		contentPane.add(btnAdd);
		
		try {
			stmt =conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
	
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(178, 368, 200, 14);
		contentPane.add(label);

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
							
							textField_4.setText("");;
							textField_10.setText("");;
							textField_11.setText("");
							textField_12.setText("");
							textField_13.setText("");
							textField_14.setText("");
							textField_15.setText("");
							label_1.setText("");
						    
						    
						} 
						else {
							
						
						while(rs.next()){
							
							label.setText("");
							textField.setText(rs.getString("payroll_id"));
							textField_1.setText(rs.getString("emp_id"));
							textField_2.setText(rs.getString("first_name"));
							textField_3.setText(rs.getString("last_name"));
							}
						
						
						
						String sql7= "Select * from incentives i inner join job_title j on i.emp_id_ins = j.emp_id_job where i.emp_id_ins ='"+srchfldEnterempId.getText().toString()+"' "; 
						rs4 = stmt.executeQuery(sql7);
						System.out.println(sql7);
						
						while(rs4.next()){
							textField_4.setText(rs4.getString("job_title"));
							textField_10.setText(rs4.getString("hra"));
							textField_11.setText(rs4.getString("da"));
							textField_12.setText(rs4.getString("cca"));
							textField_13.setText(rs4.getString("ta"));
							textField_14.setText(rs4.getString("medical"));
							textField_15.setText(rs4.getString("total"));
						}
			
						
						
						
						}
					
									
						
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				
			
			}
		});
		
		
		srchfldEnterempId.setSearchMode(SearchMode.INSTANT);
		srchfldEnterempId.setPrompt("Enter Employee ID\r\n");
		srchfldEnterempId.setBounds(207, 75, 174, 22);
		contentPane.add(srchfldEnterempId);
		
		JButton btnCalculate = new JButton("Calculate");

		btnCalculate.setBounds(493, 316, 106, 22);
		contentPane.add(btnCalculate);
		
		
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(445, 264, 52, 14);
		contentPane.add(lblTotal);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("D:\\Projects\\Universitetas\\Bakalaurinis\\Darbo uzmokescio skaiciavimo sistema\\src\\aboutus\\r.jpg"));
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 0, 680, 439);
		contentPane.add(label_2);
		
		
		try {
			stmt1 = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				
				String sql5 = "select salary from salary where  emp_id_salary = '"+srchfldEnterempId.getText().toString()+"' ";
				rs4 = stmt1.executeQuery(sql5);
				System.out.println(sql5);
				
				while(rs4.next()){
				Double  sal = Double.parseDouble(rs4.getString("salary"));
				System.out.println(sal);
				
				
				double  hra = Double.parseDouble((textField_5.getText().toString()));
				double da =  Double.parseDouble((textField_6.getText().toString()));
				double cca = Double.parseDouble((textField_7.getText().toString()));
				double ta =  Double.parseDouble((textField_8.getText().toString()));
				double med =  Double.parseDouble((textField_9.getText().toString()));
				
			
				
				
				double  ha =(hra*sal)/100 ;
				double  daa =(da*sal)/100;
				double ccaa = (cca*sal)/100;
				double taa = (ta * sal)/100;
				double meda = (med*sal)/100;
				

				
				textField_10.setText(String.valueOf(ha));
				textField_11.setText(String.valueOf(daa));
				textField_12.setText(String.valueOf(ccaa));
				textField_13.setText(String.valueOf(taa));
				textField_14.setText(String.valueOf(meda));
				
				double total = ha+daa+ccaa+taa+meda;
				textField_15.setText(String.valueOf(total));
				
			
				}
				
				
			} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	
	}
}
