
public class Metods2 {

	public static void main(String[] args) {
			String mesaj="bugun hava cok g�zel";
			mesaj.substring(0, 2);		// 0.c� indexten 2 ye kadar degerleri alacakt�.
					
			String yeniDger=mesaj.substring(0, 2);
			System.out.println(yeniDger);
			String yeniDeger=sehirVer();
			int sayilarinToplami=topla1(1,5,8,7);
			System.out.println(sayilarinToplami);
	}
		public static void ekle() {
				System.out.println("eklendi");  // i� yapt�rd�k.bi�ey d�nmedi
		}
		
		public static void sil() {
			System.out.println("silindi");
		}
	
		public static void guncelle() {
				System.out.println("g�ncellendi");
		}

		public static int topla() {
			return 5;
			
		}
		
		public static String sehirVer() {
			return "Ankara";
		}
		
		public static int topla1(int... sayilar) {
			int toplam=0;
			for (int sayi : sayilar) {
				toplam+=sayi;
			}
			
			return toplam;
			
		}
		
}
