package sistema;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro frame = new registro();
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
	public registro() {
		setTitle("registro ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		Label label = new Label("ingresar nombre de usuario");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Dialog", Font.PLAIN, 14));
		sl_contentPane.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label, 32, SpringLayout.WEST, contentPane);
		contentPane.add(label);
		
		TextField textField = new TextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, label);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, label);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, 28, SpringLayout.SOUTH, label);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, 205, SpringLayout.WEST, contentPane);
		contentPane.add(textField);
		
		Label label_1 = new Label("nombre");
		label_1.setForeground(Color.BLUE);
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_1, 6, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_1, 0, SpringLayout.WEST, label);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_1, 76, SpringLayout.WEST, label);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		contentPane.add(label_1);
		
		TextField textField_1 = new TextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, label_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, label);
		contentPane.add(textField_1);
		
		Label label_2 = new Label("apellido");
		label_2.setForeground(Color.BLUE);
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_2, 143, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_2, 0, SpringLayout.WEST, label);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		contentPane.add(label_2);
		
		TextField textField_2 = new TextField();
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, -5, SpringLayout.EAST, textField_2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 11, SpringLayout.SOUTH, label_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_2, 37, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_2, 145, SpringLayout.WEST, contentPane);
		contentPane.add(textField_2);
		
		Label label_3 = new Label("Numero telefonnico");
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_3, 16, SpringLayout.SOUTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_3, 0, SpringLayout.WEST, label);
		contentPane.add(label_3);
		
		TextField textField_3 = new TextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 6, SpringLayout.SOUTH, label_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, label);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_3, -10, SpringLayout.EAST, label_3);
		contentPane.add(textField_3);
		
		Label label_4 = new Label("correo electronico");
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 17));
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_4, 15, SpringLayout.SOUTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_4, 0, SpringLayout.WEST, label);
		contentPane.add(label_4);
		
		TextField textField_4 = new TextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_4, 6, SpringLayout.SOUTH, label_4);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, label);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_4, 20, SpringLayout.EAST, label);
		contentPane.add(textField_4);
		
		Label label_5 = new Label("clave");
		label_5.setForeground(Color.BLUE);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_5, 0, SpringLayout.WEST, label);
		label_5.setFont(new Font("Dialog", Font.PLAIN, 17));
		contentPane.add(label_5);
		
		TextField textField_5 = new TextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_5, 399, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_5, -6, SpringLayout.NORTH, textField_5);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_5, 0, SpringLayout.WEST, label);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_5, 188, SpringLayout.WEST, contentPane);
		contentPane.add(textField_5);
		
		Button button = new Button("confirmar usuario");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(Color.RED);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button, -29, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, button, -140, SpringLayout.EAST, contentPane);
		button.setFont(new Font("Dialog", Font.PLAIN, 17));
		contentPane.add(button);
	}

}
