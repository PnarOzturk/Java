import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		System.out.println("**************Vize ve Final Ortalamasi Hesapla**************\n");
		System.out.println("lutfen vize notunuzu giriniz");
		Scanner sayi=new Scanner(System.in);
		int vize =sayi.nextInt();
		System.out.println("girdiginiz vize notu:"+vize);
		System.out.println("\nikinci sayiyi giriniz");
		int f=sayi.nextInt();
		System.out.println("girdiginiz final notu:"+f);
		System.out.println("Hesaplaniyor");
		System.out.println("Hesaplaniyor..");
		System.out.println("Hesaplaniyor...");
		int sonuc=((vize*40/100)+(f*60/100));
		System.out.println("Not ortalamaniz :"+sonuc);


	}

}
