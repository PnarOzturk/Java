import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PencereIslemleri {

	public static void main(String[] args) {
		JFrame pencere = new JFrame("Pencere Olustur");
		JLabel yazı= new JLabel("Lutfen butona tiklayin");

		JButton b = new JButton("hey");
		yazı.setBounds(10, 10, 300, 30);
		b.setBounds(100,100, 200,30);
		pencere.add(b);
		pencere.add(yazı);
		b.addActionListener(new ActionListener() { //butona tiklamayi yakalayan kisim
			
			int c = 1;
			public void actionPerformed(ActionEvent e) {
	
				yazı.setText("butona "+ c++ +". kez tiklandi");//tiklandiginda yapilacak eylem
				
			}
		});
	
		
		
		
		
		
		
		pencere.setSize(500,500);
		pencere.setLayout(null);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);

	}

}
