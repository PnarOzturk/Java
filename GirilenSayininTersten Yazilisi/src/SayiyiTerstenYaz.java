import java.util.Scanner;
public class SayiyiTerstenYaz {

	public static void main(String[] args) {
		System.out.println("****GIRILEN SAYIYI TERSTEN YAZMA****");
       Scanner girdi = new Scanner(System.in);    
        System.out.print("Tersten yazilmasini istediginiz sayiyi giriniz: ");
        int sayi = girdi.nextInt();        
        System.out.print("Girdiginiz sayinin tersten yazilisi = ");
        while(sayi > 0) {
            
            System.out.print(sayi % 10);
            sayi /= 10;
        }
	}

}
