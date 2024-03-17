
public class Main {

	public static void main(String[] args) {
		String kurallar = "Harcınızı yatırmanız gerekiyor.\n"
				+"Siyasi yasağınızın bulunmaması gerekiyor.\n"
				+"Vizeninizin olması gerekiyor.";
		
		String mesaj = "Yurt dışı şartlarının hepsini sağlamanız gerekiyor.";
		
		while(true) {
			System.out.println("***************************************************");
			System.out.println(kurallar);
			System.out.println(mesaj);
			System.out.println("****************************************************");
			
			Yolcu yolcu = new Yolcu();
			
			System.out.println("Harç bedeli kontrol ediliyor...");
			
			if(yolcu.yurtdisiHarciKontrol()== false) {
				System.out.println(mesaj);
				continue;
			}
			System.out.println("Siyasi yasak kontrol ediliyor...");
			
			if(yolcu.siyasiYasakKontrol() == false) {
				System.out.println(mesaj);
				continue;
			}
			System.out.println("Vize durumu kontrol ediliyor...");
			
			if(yolcu.vizeDurumuKontrol() == false) {
				System.out.println(mesaj);
				continue;
			}
			System.out.println("İşlemleriniz tamam yurt dışına çıkabillirsiniz.");
			break;
			
		}
				
	}

}
