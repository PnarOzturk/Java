import java.util.Scanner;

public class n_sayi_hesapla {

	public static void main(String[] args) {
		System.out.println("****n adet sayinin ortalamasini hesaplama****");
		System.out.println("lutfen kac adet sayi gireceginizi yaziniz");
		Scanner s1=new Scanner(System.in);
		int toplam=0;
		int n=s1.nextInt();
		System.out.println(n+" sayi gireceginizi yazdiniz. Lutfen sirayla sayilari giriniz");
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+".sayiyi giriniz");
			int sayi=s1.nextInt();
			toplam+=sayi; //toplam=toplam+sayi;
		}
		System.out.println("girdiginiz sayilarin toplami:"+toplam+"dir");
		System.out.println("girdiginiz sayilarin ortalamasi:"+(toplam/n)+"dir");

	}

}
