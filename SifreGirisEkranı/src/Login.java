import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	public static void main(String[] args) {
		JFrame pencere = new JFrame("Giris Ekrani");
		JButton b = new JButton("GIRIS");
		pencere.setSize(300,350);
		pencere.getContentPane().setBackground(Color.gray);
		
		b.setBounds(100, 200, 100, 30);
		b.setBackground(Color.white);
		
		JTextField y=new JTextField();
		y.setBounds(120, 80,100, 20);
		
		JLabel y1=new JLabel("Kullanici Adi");
		y1.setBounds(30, 80,100, 20);
		y1.setForeground(Color.white);

		JLabel y2=new JLabel("Sifre");
		y2.setBounds(30, 130,100, 20);
		y2.setForeground(Color.white);
		
		JPasswordField pass=new JPasswordField();
		pass.setBounds(120, 130, 100, 20);
		
		
		b.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String Username = y.getText();
				String Password1 = pass.getText();
				
			

				if (Username.equals("Ali") && Password1.equals("123"))
					JOptionPane.showMessageDialog(null, "Giris Basarili");
				else
					JOptionPane.showMessageDialog(null, "Kullanici adi veya sifre hatali ");
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		pencere.add(b);
		pencere.add(y);
		pencere.add(y1);
		pencere.add(y2);
		pencere.add(pass);
		pencere.setLayout(null);
		pencere.setVisible(true);	
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
