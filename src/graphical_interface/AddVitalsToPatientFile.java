package graphical_interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database_management.SqlitePatientConnection;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class AddVitalsToPatientFile extends JFrame {

	private JPanel contentPane;
	private JLabel firstnamefield;
	private JLabel lastnamefield;
	private JEditorPane editorPane;
	Connection conn = null;
	JPanel panel;
	Search search = new Search();


	
	public void DoTheMainWork() {
		if(JOptionPane.showConfirmDialog(null,"Add Vitals to Patient with \n First Name = "+search.getFirstName()+" \n and Last Name = "+search.getLastName()+" ","Vitals Information Confirmation", JOptionPane.YES_NO_OPTION)== 0) {
			try {
				
				search.connection = SqlitePatientConnection.dbConnector();
				String query1 = "update folder_files set vitals_information='"+editorPane.getText()+"' where folderID= "+search.getFolderID() +" and date_created='"+search.TodaysDate()+"'";
				PreparedStatement pstm = search.connection.prepareStatement(query1);
				pstm.execute();
				JOptionPane.showMessageDialog(null, "Vitals has been successfully added to Patient File");
				pstm.close();
				
				
				
			}catch(Exception ef) {
				JOptionPane.showMessageDialog(null, "There was a problem adding vitals to Patient's File");
				ef.printStackTrace();
			
			}
			
		}
		
	}
	
	
	
	public void PopulateFirstAndLastName() {	
		int row = search.table.getSelectedRow();
		search.setPatientID((int)search.table.getModel().getValueAt(row, 0));
		this.firstnamefield.setText((String)search.table.getModel().getValueAt(row, 1));
		this.lastnamefield.setText((String)search.table.getModel().getValueAt(row, 2));
		search.setFirstName((String)search.table.getModel().getValueAt(row, 1));
		search.setLastName((String)search.table.getModel().getValueAt(row, 2));
	}
	

	/**
	 * Create the frame.
	 */
	public AddVitalsToPatientFile() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = search.panel;
		panel.setBounds(10, 11, 613, 519);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(623, 10, 6, 502);
		contentPane.add(separator);
		
		editorPane = new JEditorPane();
		editorPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		editorPane.setBounds(639, 158, 422, 297);
		editorPane.setText("\n\nTemperature(Degree Celcius): \n\nWeight(kg): \n\nHeight(cm): \n\nBlood Pressure:");
		contentPane.add(editorPane);
		
		JLabel lblNewLabel = new JLabel("Please Attach Values Obtained Respectively Near Each Field ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(639, 51, 422, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Search and Select The Patient in the Left Pane");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(639, 10, 422, 30);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add Vitals To Patient File");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(firstnamefield.getText().isBlank() && lastnamefield.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Search And Select Patient in the Left Pane Before Adding Vitals");
				}
				else {					
					search.SetTheFolderID();
					search.getTheDateCreated();
					if(!search.getdate_created().equals(search.TodaysDate()) ) {
						JOptionPane.showMessageDialog(null, "File has not been created for the Patient Today.\nContact the Receptionist on duty.");
					}else {
						DoTheMainWork();
					}

					
				}
						
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(723, 466, 216, 46);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Patient First Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(639, 92, 131, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Patient Last Name:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(639, 124, 131, 23);
		contentPane.add(lblNewLabel_3);
		
		firstnamefield = new JLabel("");
		firstnamefield.setFont(new Font("Tahoma", Font.PLAIN, 14));
		firstnamefield.setBounds(800, 92, 123, 19);
		contentPane.add(firstnamefield);
		
		lastnamefield = new JLabel("");
		lastnamefield.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lastnamefield.setBounds(780, 124, 143, 20);
		contentPane.add(lastnamefield);
		
		search.table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PopulateFirstAndLastName();
			}
		});
		
	}
}
