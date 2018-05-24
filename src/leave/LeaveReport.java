package leave;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import main.DbConnect;
import net.proteanit.sql.DbUtils;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class LeaveReport extends JFrame {

	private JPanel contentPane;
	Connection conn;
    Statement stmt,stmt1;
    ResultSet rs,rs1;
    private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveReport frame = new LeaveReport();
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
	public LeaveReport() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		conn = DbConnect.doConnect();
		JLabel lblPayrollManagementSystem = new JLabel("Salary Calculation System");
		lblPayrollManagementSystem.setBounds(553, 26, 369, 40);
		lblPayrollManagementSystem.setFont(new Font("Roboto",Font.BOLD,22));
		contentPane.add(lblPayrollManagementSystem);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 107, 1363, 2);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 106, 1382, 642);
		contentPane.add(scrollPane);
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
	
		
		
		try {
			stmt = conn.createStatement();
			stmt1 = conn.createStatement();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		JButton btnShowAllEmployee = new JButton("Show Leave Report");
		btnShowAllEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
				String sql = "(select (emp_id) Employee_ID,first_name First_Name ,last_name Last_Name,dept_id_emp Department_id,total_vac Total_Vacation_Leave, total_cas Total_Cassual_Leave,total_con Total_Convention_Leave,total_sick Total_Sick_Leave from employee,leave_vacation,leave_cassual,leave_convantion,leave_sick where emp_id = emp_id_vac && emp_id = emp_id_cas && emp_id= emp_id_con && emp_id= emp_id_sick group by  emp_id) ";
										
					rs=stmt.executeQuery(sql);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnShowAllEmployee.setBounds(577, 66, 226, 23);
		contentPane.add(btnShowAllEmployee);
		
		
	}

}
