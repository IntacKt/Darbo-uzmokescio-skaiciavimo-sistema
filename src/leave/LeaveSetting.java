package leave;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import main.DbConnect;

import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class LeaveSetting extends JFrame {

	private JPanel contentPane;
	   
    Connection conn;
    Statement stmt,stmt1,stmt2,stmt3,stmt4,stmt5;
    ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs6,rs7;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveSetting frame = new LeaveSetting();
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
	public LeaveSetting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		conn = DbConnect.doConnect();
		
		JSeparator separator = new JSeparator();
		separator.setBounds(17, 69, 304, 2);
		contentPane.add(separator);
		
		JLabel lblNewEntry = new JLabel("Leave Settings");
		lblNewEntry.setBounds(92, 24, 140, 34);
		lblNewEntry.setFont(new Font("Roboto",Font.BOLD,18));
		contentPane.add(lblNewEntry);
		
		JLabel lblLeaveType = new JLabel("Leave Type ");
		lblLeaveType.setBounds(76, 85, 91, 14);
		contentPane.add(lblLeaveType);
		
		String[] l = new String[]{"	------Select------", "Sick Leave","Vacation Leave","Cassual Leave","Convention Leave"};
		JComboBox comboBox = new JComboBox(l);
		
		comboBox.setBounds(161, 82, 117, 20);
		contentPane.add(comboBox);
		
		JLabel lblJanuary = new JLabel("January");
		lblJanuary.setBounds(17, 119, 68, 14);
		contentPane.add(lblJanuary);
		
		JLabel lblFebruary = new JLabel("February");
		lblFebruary.setBounds(17, 144, 54, 14);
		contentPane.add(lblFebruary);
		
		JLabel lblMarch = new JLabel("March");
		lblMarch.setBounds(17, 173, 68, 14);
		contentPane.add(lblMarch);
		
		JLabel lblApril = new JLabel("April");
		lblApril.setBounds(17, 198, 33, 14);
		contentPane.add(lblApril);
		
		JLabel lblMay = new JLabel("May");
		lblMay.setBounds(17, 223, 33, 14);
		contentPane.add(lblMay);
		
		JLabel lblJune = new JLabel("June");
		lblJune.setBounds(17, 248, 33, 14);
		contentPane.add(lblJune);
		
		JLabel lblJuly = new JLabel("July");
		lblJuly.setBounds(191, 122, 26, 14);
		contentPane.add(lblJuly);
		
		JLabel lblAugust = new JLabel("August");
		lblAugust.setBounds(191, 147, 45, 14);
		contentPane.add(lblAugust);
		
		JLabel lblSeptember = new JLabel("September");
		lblSeptember.setBounds(191, 172, 87, 14);
		contentPane.add(lblSeptember);
		
		JLabel lblOctomber = new JLabel("October");
		lblOctomber.setBounds(191, 201, 87, 14);
		contentPane.add(lblOctomber);
		
		JLabel lblNovember = new JLabel("November");
		lblNovember.setBounds(191, 226, 87, 14);
		contentPane.add(lblNovember);
		
		JLabel lblDecember = new JLabel("December");
		lblDecember.setBounds(191, 251, 87, 14);
		contentPane.add(lblDecember);
		
		textField = new JTextField();
		textField.setBounds(76, 116, 54, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(76, 144, 54, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(76, 170, 54, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(76, 198, 54, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(76, 223, 54, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(76, 248, 54, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(267, 119, 54, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(267, 147, 54, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(267, 173, 54, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(267, 198, 54, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(267, 223, 54, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(267, 248, 54, 20);
		contentPane.add(textField_11);
		
		JButton btnSave = new JButton("Save");
		
		btnSave.setBounds(59, 299, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(177, 299, 89, 23);
		contentPane.add(btnCancel);
		
		JSeparator separator_1 = new JSeparator(SwingConstants.VERTICAL);
		separator_1.setBounds(158, 119, 9, 162);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(76, 333, 187, 14);
		contentPane.add(lblNewLabel);
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				String lt = comboBox.getSelectedItem().toString();
				lblNewLabel.setText("");
				
				if(lt.equals("Sick Leave")){
					
					try {
					String sql = "Select sum(jan) j, sum(feb) f,sum(mar) m ,sum(april) a, sum(may) m1 ,sum(june) j1 ,sum(july) j2, sum(aug) a1 , sum(sept) s,sum(oct) o , sum(nov) n, sum(decm) d1"
							+ "  from leave_sick";
					rs = stmt.executeQuery(sql);
					
					System.out.println(sql);
					
					while(rs.next()){
						textField.setText(rs.getString("j"));
						textField_1.setText(rs.getString("f"));
						textField_2.setText(rs.getString("m"));
						textField_3.setText(rs.getString("a"));
						textField_4.setText(rs.getString("m1"));
						textField_5.setText(rs.getString("j1"));
						textField_6.setText(rs.getString("j2"));
						textField_7.setText(rs.getString("a1"));
						textField_8.setText(rs.getString("s"));
						textField_9.setText(rs.getString("o"));
						textField_10.setText(rs.getString("n"));
					
						textField_11.setText(rs.getString("d1"));
						
					}
					
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
				if(lt.equals("Vacation Leave")){
					try {
					String sql  = "Select sum(jan) j, sum(feb) f,sum(mar) m ,sum(apr) a, sum(may) m1 ,sum(june) j1 ,sum(july) j2, sum(aug) a1 , sum(sept) s,sum(oct) o , sum(nov) n,sum(decm) d  from leave_vacation";
					rs1 = stmt.executeQuery(sql);
					System.out.println(sql);
					
					while(rs1.next()){
						
						
						textField.setText(rs1.getString("j"));
						textField_1.setText(rs1.getString("f"));
						textField_2.setText(rs1.getString("m"));
						textField_3.setText(rs1.getString("a"));
						textField_4.setText(rs1.getString("m1"));
						textField_5.setText(rs1.getString("j1"));
						textField_6.setText(rs1.getString("j2"));
						textField_7.setText(rs1.getString("a1"));
						textField_8.setText(rs1.getString("s"));
						textField_9.setText(rs1.getString("o"));
						textField_10.setText(rs1.getString("n"));
						textField_11.setText(rs1.getString("d"));
						
					}
					
					}catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					}
				
				if(lt.equals("Conve"
						+ "ntion Leave")){
					
					try {
						String sql  = "Select sum(jan) j, sum(feb) f,sum(mar) m ,sum(apr) a, sum(may) m1 ,sum(june) j1 ,sum(july) j2, sum(aug) a1 , sum(sept) s,sum(oct) o , sum(nov) n,sum(decm) d  from leave_convantion";
						rs2 = stmt.executeQuery(sql);
						System.out.println(sql);
						
						while(rs2.next()){
							
							
							textField.setText(rs2.getString("j"));
							textField_1.setText(rs2.getString("f"));
							textField_2.setText(rs2.getString("m"));
							textField_3.setText(rs2.getString("a"));
							textField_4.setText(rs2.getString("m1"));
							textField_5.setText(rs2.getString("j1"));
							textField_6.setText(rs2.getString("j2"));
							textField_7.setText(rs2.getString("a1"));
							textField_8.setText(rs2.getString("s"));
							textField_9.setText(rs2.getString("o"));
							textField_10.setText(rs2.getString("n"));
							textField_11.setText(rs2.getString("d"));
							
						}
						
						}catch (SQLException e1) {
							e1.printStackTrace();
						}
						
					}
				
				if(lt.equals("Cassual Leave")){
				
				try {
					String sql  = "Select sum(jan) j, sum(feb) f,sum(mar) m ,sum(apr) a, sum(may) m1 ,sum(june) j1 ,sum(july) j2, sum(aug) a1 , sum(sept) s,sum(oct) o , sum(nov) n,sum(decm) d  from leave_cassual";
					rs1 = stmt.executeQuery(sql);
					System.out.println(sql);
					
					while(rs1.next()){
						
						
						textField.setText(rs1.getString("j"));
						textField_1.setText(rs1.getString("f"));
						textField_2.setText(rs1.getString("m"));
						textField_3.setText(rs1.getString("a"));
						textField_4.setText(rs1.getString("m1"));
						textField_5.setText(rs1.getString("j1"));
						textField_6.setText(rs1.getString("j2"));
						textField_7.setText(rs1.getString("a1"));
						textField_8.setText(rs1.getString("s"));
						textField_9.setText(rs1.getString("o"));
						textField_10.setText(rs1.getString("n"));
						textField_11.setText(rs1.getString("d"));
						
					}
					
					}catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
			}
		});
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String sql = "update leave_total set leave_type = '"+comboBox.getSelectedItem().toString()+"' ,jan='"+textField.getText().toString()+"', feb='"+textField_1.getText().toString()+"', mar='"+textField_2.getText().toString()+"',apr='"+textField_3.getText().toString()+"',may='"+textField_4.getText().toString()+"',june='"+textField_5.getText().toString()+"',july='"+textField_6.getText().toString()+"',aug='"+textField_7.getText().toString()+"',sept='"+textField_8.getText().toString()+"',oct='"+textField_9.getText().toString()+"',nov='"+textField_10.getText().toString()+"',decm ='"+textField_11.getText().toString()+"' where leave_type = '"+comboBox.getSelectedItem().toString()+"' ";
					
				
					System.out.println(sql);
					stmt.executeUpdate(sql);
					lblNewLabel.setText("Record Updated Successfully");
				
				} catch (SQLException e1) {
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
