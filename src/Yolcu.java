import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari {
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Yatırdığınız harç bedeli:");
		this.harc=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Siyasi yasağınız var mı:");
		String cevap = scanner.nextLine();
		if(cevap.equals("evet")) {
			this.siyasiYasak = true;
		}
		else {
			this.siyasiYasak = false;
		}
		System.out.println("Vizeniz var mı:");
		String cevap2 = scanner.nextLine();
		if(cevap2.equals("evet")) {
			this.vizeDurumu = true;
		}
		else {
			this.vizeDurumu = false;
		}
		
		
	}
	
	public boolean yurtdisiHarciKontrol() {
		if(this.harc<15) {
			System.out.println("Lütfen harcı tam yatırın.");
			return false;
		}
		else {
			return true;
		}
	}
	public boolean siyasiYasakKontrol() {
		if(this.siyasiYasak == true) {
			System.out.println("Siyasi yasağınız bulunuyor.Yurt dıına çıkamazsınız.");
			return false;
		}
		else {
			System.out.println("Siyasi yasağınız bulunmuyor.");
			return true;
		}
	}
	public boolean vizeDurumuKontrol() {
		if(this.vizeDurumu == true) {
			System.out.println("Vize işlemleri tamam.");
			return true;
		}
		else {
			System.out.println("Gideceğiniz ülkeye vizeniz bulunmuyor.");
			return false;
		}
		
	}
}
