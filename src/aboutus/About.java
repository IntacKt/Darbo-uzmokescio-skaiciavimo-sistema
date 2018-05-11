package aboutus;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
					frame.setVisible(true);
					frame.setTitle("About");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public About() {
		setTitle("About");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(51, 204, 153));
		setContentPane(contentPane);
		
		JLabel lblSalarySystem = new JLabel("1.0");
		lblSalarySystem.setBounds(268, 257, 29, 31);
		lblSalarySystem.setFont(new Font("Raleway", Font.BOLD, 15));
		
		JLabel lblLanguage = new JLabel("Language");
		lblLanguage.setBounds(166, 226, 70, 20);
		lblLanguage.setFont(new Font("Raleway", Font.BOLD, 15));
		
		JLabel lblLaimis = new JLabel("Laimonas Kazenas PRIf-14/2");
		lblLaimis.setBounds(497, 124, 216, 20);
		lblLaimis.setForeground(new Color(204, 51, 51));
		lblLaimis.setFont(new Font("Roboto", Font.BOLD, 15));
		
		JLabel lblWindowsPro = new JLabel("Windows 10 Pro");
		lblWindowsPro.setBounds(267, 190, 112, 31);
		lblWindowsPro.setFont(new Font("Raleway", Font.BOLD, 15));
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(194, 151, 43, 39);
		lblEmail.setFont(new Font("Raleway", Font.BOLD, 15));
		
		JLabel lblOperatingSystem = new JLabel("Operating System");
		lblOperatingSystem.setBounds(110, 195, 126, 20);
		lblOperatingSystem.setFont(new Font("Raleway", Font.BOLD, 15));
		
		JLabel lblJavaSe = new JLabel("Java SE-1.8");
		lblJavaSe.setBounds(267, 226, 112, 20);
		lblJavaSe.setFont(new Font("Raleway", Font.BOLD, 15));
		
		JLabel lblDeveloper = new JLabel("Developer");
		lblDeveloper.setBounds(160, 124, 75, 20);
		lblDeveloper.setFont(new Font("Raleway", Font.BOLD, 15));
		
		JLabel lblmymailcom = new JLabel("lkazenas05@gmail.com");
		lblmymailcom.setBounds(268, 151, 171, 39);
		lblmymailcom.setFont(new Font("Raleway", Font.BOLD, 15));
		
		JLabel lblThisSoftwareIs = new JLabel("This software was developed by ");
		lblThisSoftwareIs.setBounds(266, 114, 237, 39);
		lblThisSoftwareIs.setFont(new Font("Raleway", Font.BOLD, 15));
		
		JLabel lblVersion = new JLabel("Version");
		lblVersion.setBounds(183, 262, 54, 20);
		lblVersion.setFont(new Font("Raleway", Font.BOLD, 15));
		
		JLabel lblSalaryCalculationSystem = new JLabel("Salary Calculation System");
		lblSalaryCalculationSystem.setBounds(261, 65, 229, 24);
		lblSalaryCalculationSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalaryCalculationSystem.setForeground(new Color(0, 0, 0));
		lblSalaryCalculationSystem.setBackground(new Color(102, 102, 255));
		lblSalaryCalculationSystem.setFont(new Font("Raleway", Font.BOLD, 18));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 825, 388);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\Projects\\Universitetas\\Bakalaurinis\\Darbo uzmokescio skaiciavimo sistema\\src\\aboutus\\r.jpg"));
		contentPane.setLayout(null);
		contentPane.add(lblSalarySystem);
		contentPane.add(lblLanguage);
		contentPane.add(lblLaimis);
		contentPane.add(lblWindowsPro);
		contentPane.add(lblEmail);
		contentPane.add(lblOperatingSystem);
		contentPane.add(lblJavaSe);
		contentPane.add(lblDeveloper);
		contentPane.add(lblmymailcom);
		contentPane.add(lblThisSoftwareIs);
		contentPane.add(lblVersion);
		contentPane.add(lblSalaryCalculationSystem);
		contentPane.add(lblNewLabel);
		
		
	}

}
