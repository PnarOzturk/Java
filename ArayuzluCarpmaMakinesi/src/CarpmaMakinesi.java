import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CarpmaMakinesi {

	public static void main(String[] args) {
		JFrame pencere = new JFrame("CARPMA MAKINESI");
		pencere.setSize(300, 500);
		pencere.getContentPane().setBackground(Color.pink);
		
		JLabel y1,y2,y3,y4,y5;
		JTextField c1,c2,c3;
		JButton buton;
		
		
		y1=new JLabel("Nasıl calisir ?");
		y1.setBounds(0, 0, 500,30);
		
		y2=new JLabel("Carpmak istediginiz sayiları sırayla kutulara giriniz");
		y2.setBounds(0, 15, 500,30);

		y3=new JLabel("Cozumu, sonuc kisminda cikacaktir");
		y3.setBounds(0, 25, 500,30);
		
		y4=new JLabel("birinci sayi");
		y4.setBounds(100, 80, 100, 30);
		
		y5=new JLabel("ikinci sayi");
		y5.setBounds(100, 180, 100, 30);
		

		buton=new JButton("HESAPLA");
		buton.setBounds(80, 280, 100, 30);
		buton.setBackground(Color.cyan);
		
		c1=new JTextField();
		c1.setBounds(95, 110, 70, 20);
		
		c2=new JTextField();
		c2.setBounds(95, 210, 70, 20);
		
		c3=new JTextField();
		c3.setBounds(95, 340, 70, 20);
		c3.setEditable(false);
		
		buton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				int a= Integer.parseInt(c1.getText());
				int b=Integer.parseInt(c2.getText());
				int c=a*b;
				String sonuc = String.valueOf(c);
				c3.setText(sonuc);
				
			}
		});
		
		pencere.add(y1);
		pencere.add(y2);
		pencere.add(y3);
		pencere.add(y4);
		pencere.add(y5);
		pencere.add(buton);
		pencere.add(c1);
		pencere.add(c2);
		pencere.add(c3);
		pencere.setLayout(null);
		pencere.setVisible(true);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
