import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Week102 {

	private JFrame frame;
	private JTextField textField_Num1;
	private JTextField textField_Num2;
	private JTextField textField_Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Week102 window = new Week102();
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
	public Week102() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_Num1 = new JTextField();
		textField_Num1.setBounds(74, 32, 114, 42);
		frame.getContentPane().add(textField_Num1);
		textField_Num1.setColumns(10);
		
		textField_Num2 = new JTextField();
		textField_Num2.setBounds(251, 32, 114, 42);
		frame.getContentPane().add(textField_Num2);
		textField_Num2.setColumns(10);
		
		JButton btnNewButton = new JButton("Add (+)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, answer;
				try {
					num1 = Integer.parseInt(textField_Num1.getText());
					num2 = Integer.parseInt(textField_Num2.getText());
					answer = num1 + num2;
					textField_Answer.setText(Integer.toString(answer));
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton.setBounds(74, 85, 114, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus (-)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, answer;
				try {
					num1 = Integer.parseInt(textField_Num1.getText());
					num2 = Integer.parseInt(textField_Num2.getText());
					answer = num1 - num2;
					textField_Answer.setText(Integer.toString(answer));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton_1.setBounds(251, 85, 114, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_Answer = new JTextField();
		textField_Answer.setBounds(209, 207, 86, 20);
		frame.getContentPane().add(textField_Answer);
		textField_Answer.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Answer:");
		lblNewLabel.setBounds(142, 210, 57, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Multiply (*)");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, answer;
				try {
					num1 = Integer.parseInt(textField_Num1.getText());
					num2 = Integer.parseInt(textField_Num2.getText());
					answer = num1 * num2;
					textField_Answer.setText(Integer.toString(answer));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton_2.setBounds(74, 138, 114, 42);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Divide (/)");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, answer;
				try {
					num1 = Integer.parseInt(textField_Num1.getText());
					num2 = Integer.parseInt(textField_Num2.getText());
					answer = num1 / num2;
					textField_Answer.setText(Integer.toString(answer));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton_3.setBounds(251, 138, 114, 42);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Num1");
		lblNewLabel_1.setBounds(116, 11, 51, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Num2");
		lblNewLabel_2.setBounds(294, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
