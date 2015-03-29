import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.text.html.FormSubmitEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.*;


public class Real_Estate {

	private JFrame frame;
	private JTextField text_lot;
	private JTextField text_fn;
	private JTextField text_ln;
	private JTextField text_price;
	private JTextField text_square;
	private JTextField text_Bedroom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Real_Estate window = new Real_Estate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Real_Estate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Next House Displayed");
		lblNewLabel_1.setVerifyInputWhenFocusTarget(false);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setSize(new Dimension(10, 5));
		lblNewLabel_1.setBounds(10, 30, 131, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblLotNumber = new JLabel("                Lot Number:");
		lblLotNumber.setVerticalAlignment(SwingConstants.TOP);
		lblLotNumber.setVerifyInputWhenFocusTarget(false);
		lblLotNumber.setSize(new Dimension(10, 5));
		lblLotNumber.setBounds(39, 76, 131, 32);
		frame.getContentPane().add(lblLotNumber);
		
		JLabel lblFirstName = new JLabel("                 First Name:");
		lblFirstName.setVerticalAlignment(SwingConstants.TOP);
		lblFirstName.setVerifyInputWhenFocusTarget(false);
		lblFirstName.setSize(new Dimension(10, 5));
		lblFirstName.setBounds(39, 110, 131, 32);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("                 Last Name:");
		lblLastName.setVerticalAlignment(SwingConstants.TOP);
		lblLastName.setVerifyInputWhenFocusTarget(false);
		lblLastName.setSize(new Dimension(10, 5));
		lblLastName.setBounds(39, 144, 131, 32);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblPrice = new JLabel("                          Price:");
		lblPrice.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPrice.setVerticalAlignment(SwingConstants.TOP);
		lblPrice.setVerifyInputWhenFocusTarget(false);
		lblPrice.setSize(new Dimension(10, 5));
		lblPrice.setBounds(39, 178, 131, 32);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblSquareFeet = new JLabel("              Square Feet:");
		lblSquareFeet.setVerticalTextPosition(SwingConstants.TOP);
		lblSquareFeet.setVerticalAlignment(SwingConstants.TOP);
		lblSquareFeet.setVerifyInputWhenFocusTarget(false);
		lblSquareFeet.setSize(new Dimension(10, 5));
		lblSquareFeet.setBounds(39, 213, 131, 32);
		frame.getContentPane().add(lblSquareFeet);
		
		JLabel lblNumberOfBedrooms = new JLabel("Number of Bedrooms:");
		lblNumberOfBedrooms.setVerticalAlignment(SwingConstants.TOP);
		lblNumberOfBedrooms.setVerifyInputWhenFocusTarget(false);
		lblNumberOfBedrooms.setSize(new Dimension(10, 5));
		lblNumberOfBedrooms.setBounds(39, 247, 110, 32);
		frame.getContentPane().add(lblNumberOfBedrooms);
				
		text_lot = new JTextField();
		text_lot.setBounds(162, 73, 86, 20);
		frame.getContentPane().add(text_lot);
		text_lot.setColumns(10);
		
		text_fn = new JTextField();
		text_fn.setBounds(162, 107, 86, 20);
		frame.getContentPane().add(text_fn);
		text_fn.setColumns(10);
		
		text_ln = new JTextField();
		text_ln.setBounds(162, 141, 86, 20);
		frame.getContentPane().add(text_ln);
		text_ln.setColumns(10);
		
		text_price = new JTextField();
		text_price.setBounds(162, 175, 86, 20);
		frame.getContentPane().add(text_price);
		text_price.setColumns(10);
		
		text_square = new JTextField();
		text_square.setBounds(162, 210, 86, 20);
		frame.getContentPane().add(text_square);
		text_square.setColumns(10);
		
		text_Bedroom = new JTextField();
		text_Bedroom.setBounds(162, 244, 86, 20);
		frame.getContentPane().add(text_Bedroom);
		text_Bedroom.setColumns(10);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				text_lot.setText("");
				text_fn.setText("");
				text_ln.setText("");
				text_price.setText("");
				text_square.setText("");
				text_Bedroom.setText("");
			}
		});
		btnNewButton.setBounds(64, 382, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnAdd.setBounds(64, 342, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnClear = new JButton("Reset");
		btnClear.setBounds(64, 304, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(162, 304, 89, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(162, 342, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnFind = new JButton("Find");
		btnFind.setBounds(162, 382, 89, 23);
		frame.getContentPane().add(btnFind);
	}
}
