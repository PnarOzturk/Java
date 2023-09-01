import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class olus {

	public static void main(String[] args) {
	JFrame pencere = new JFrame(); //pencere olusturmak icin JFrame sınıfından nesne olusturuyoruz
	pencere.setSize(500, 500); //olusturacagimiz pencerenin boyutlarini belirliyoruz
	
	JPanel panel = new JPanel(); //Panel olusturduk
	
	JButton bt = new JButton("Selam"); //buton nesnesi uretmeyi saglar
	//pencere.getContentPane().add(bt); //pencereyi getirmeyi ve uretilen nesneyi pencereye eklemeyi saglar
	panel.add(bt); //butonu panelin icine ekledik
	pencere.add(panel);//paneli olusturdugumuz pencereye ekledik

	
	
	
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//pencerenin kapatildiginda arka planda calismasini onlemek icin kullanilir
	pencere.setVisible(true);//pencereyi görünür yapiyoruz

	
	}

}
