import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Topla {

	public static void main(String[] args) {
		//Kullanicidan iki sayi al. topla
		JFrame pencere=new JFrame("TOPLAMA MAKİNESİ");
		pencere.setSize(500, 500);
		JLabel b1,b2,b3;
		JTextField y1,y2,y3;
		JButton buton;
		
		b1=new JLabel("birinci sayi");
		b1.setBounds(100, 50, 100,30);
		b1.setForeground(Color.WHITE);
		
		b2=new JLabel("ikinci sayi");
		b2.setBounds(300, 50, 100, 30);
		b2.setForeground(Color.WHITE);

		
		b3=new JLabel("sonuc");
		b3.setBounds(200, 200, 100, 30);
		b3.setForeground(Color.WHITE);

		
		buton=new JButton("hesapla");
		buton.setBounds(180, 350, 100, 30);
        buton.setBackground(Color.black);
		buton.setForeground(Color.WHITE);

		
		y1=new JTextField();		
		y1.setBounds(80, 80, 100, 30);
		
		y2=new JTextField();
		y2.setBounds(280, 80, 100, 30);
		
		y3=new JTextField();
		y3.setBounds(170, 240, 100, 30);
		y3.setEditable(false);
		
		buton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(y1.getText());
				int b=Integer.parseInt(y2.getText());
				int c= a + b;
				String toplam = String.valueOf(c);
				y3.setText(toplam);
				
			}
		});


		
		pencere.add(b1);
		pencere.add(b2);
		pencere.add(b3);
		pencere.add(buton);
		pencere.add(y1);
		pencere.add(y2);
		pencere.add(y3);
		pencere.setLayout(null);
		pencere.setVisible(true);
		pencere.getContentPane().setBackground(Color.DARK_GRAY);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
