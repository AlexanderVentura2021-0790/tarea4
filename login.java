package sistema;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Label;
import java.awt.Panel;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Checkbox;

public class login extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setFont(new Font("Dialog", Font.PLAIN, 13));
		setTitle("inicio de cesion");
		getContentPane().setForeground(Color.CYAN);
		setForeground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 363);
		getContentPane().setLayout(null);
		
		Label label = new Label("nombre");
		label.setBackground(SystemColor.activeCaption);
		label.setFont(new Font("Cambria", Font.PLAIN, 15));
		label.setBounds(30, 85, 79, 22);
		getContentPane().add(label);
		
		TextField textField = new TextField();
		textField.setBounds(160, 85, 144, 22);
		getContentPane().add(textField);
		
		Label label_1 = new Label("clave");
		label_1.setBackground(SystemColor.activeCaption);
		label_1.setFont(new Font("Bell MT", Font.PLAIN, 16));
		label_1.setBounds(25, 129, 115, 22);
		getContentPane().add(label_1);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(160, 129, 144, 22);
		getContentPane().add(textField_1);
		
		
		
		
		Button button = new Button("iniciar cesion");
		button.setBackground(Color.GREEN);
		button.setForeground(Color.RED);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			 
			
		});
		button.setFont(new Font("Dialog", Font.PLAIN, 18));
		button.setBounds(160, 196, 134, 43);
		getContentPane().add(button);
		
		Button button_1 = new Button("registrarme");
		button_1.setBackground(Color.GREEN);
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		button_1.setBounds(172, 265, 114, 22);
		getContentPane().add(button_1);
	}
}
