import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Mesafeyi km türünden giriniz : ");
		double normalTutar = input.nextInt() * 0.1, yasIndirimOrani = 0, toplamTutar = 0;
		System.out.print("Yaşınızı giriniz : ");
		int yas = input.nextInt();
		if (yas < 12) yasIndirimOrani = 0.5;
		else if (yas <= 24) yasIndirimOrani = 0.1;
		else if (yas > 65) yasIndirimOrani = 0.3;
		double indirimliTutar = normalTutar * (1 - yasIndirimOrani);
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		int secim = input.nextInt();
		switch(secim) {
			case 1:
				toplamTutar = indirimliTutar;
				break;
			case 2:
				double gidisDonusBiletIndirimi = indirimliTutar * 0.2;
				toplamTutar = (indirimliTutar - gidisDonusBiletIndirimi) * 2;
		}
		if (secim < 1 || secim > 2 || normalTutar < 0 || yas < 0) System.out.println("\nHatalı Veri Girdiniz !");
		else System.out.println("\nToplam Tutar == " + toplamTutar);
	}

}
