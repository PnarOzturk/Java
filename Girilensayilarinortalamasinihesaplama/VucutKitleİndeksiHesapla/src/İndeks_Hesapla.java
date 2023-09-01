import java.util.Scanner;import java.text.DecimalFormat;

public class İndeks_Hesapla {

	public static void main(String[] args) {
		System.out.println("****VUCUT KITLE INDEKSI HESAPLAMA****");
		Scanner a=new Scanner(System.in);
		DecimalFormat cevir = new DecimalFormat("#.##");
		System.out.println("Lutfen kilonuzu 'kg' turunden giriniz");
		double kilo=a.nextFloat();
		System.out.println("Lutfen boyunuzu 'cm' turunden giriniz");
		double boy=a.nextFloat();
		System.out.println("kilonuz: "+kilo+"kg");
		System.out.println("boyunuz: "+boy+"cm");
		System.out.println("Hesaplaniyor");
		System.out.println("Hesaplaniyor...");
		double indeks=kilo/(Math.pow(boy/100,2));
		System.out.println("Vucut kitle indeksiniz "+cevir.format(indeks)+" m^2 dir");
			
		if(indeks<=18.4&& indeks>0){
		System.out.println("Zayif\n");
		System.out.println("Ideal indeksinize erismeniz icin "+cevir.format(18.4-indeks)+" almaniz gerekiyor");
		System.out.println("Boyunuza uygun agirliga erismeniz icin yeterli ve dengeli beslenmeye ozen gostermelisiniz.");
		}
		else if(indeks>18.4&& indeks<=24.9) {
			System.out.println("Normal\n");
			System.out.println("Yeterli ve dengeli beslenerek ve duzenli fiziksel aktivite yaparak bu agirliginizi korumaya calisiniz.");
		}
		else if(indeks>24.9&& indeks<=29.9) {
			System.out.println("Fazla Kilolu");
			System.out.println("Ideal indeksinize erismeniz icin "+cevir.format(indeks-18.4)+" vermeniz gerekiyor");
			System.out.println("Onlemler alinmadigi takdirde pek cok hastalik icin risk faktoru tasima durumunuz var");
		}
		else if(indeks>30.0) {
			System.out.println("Sisman");
			System.out.println("Ideal indeksinize erismeniz icin "+cevir.format(indeks-18.4)+" vermeniz gerekiyor");
			System.out.println("Simanlik, kalp-damar hastaliklari, diyabet, hipertansiyon v.b. kronik hastaliklar icin risk faktorudur.Lutfen, saglik kurulusuna basvurunuz.");
		}		
		
	}

}
