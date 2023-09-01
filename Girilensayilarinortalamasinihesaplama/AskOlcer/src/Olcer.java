import java.util.Scanner;
import java.security.DrbgParameters.NextBytes;
import java.util.Random;


public class Olcer {

	public static void main(String[] args) {
		System.out.println("****AskOlcer****");
		Scanner girdi=new Scanner(System.in);
		System.out.println("Lutfen ilk ismi giriniz");
		String ilk =girdi.nextLine();
		System.out.println("Lutfen ikinci ismi giriniz");
		String ikinciString = girdi.nextLine();
		System.out.println("Askiniz hesaplaniyor..");
		System.out.println("Askiniz hesaplaniyor...");
		Random r=new Random();
		int puan=r.nextInt(101);
		System.out.println("Askinizin puani "+puan+"dir");
	
	}

}
