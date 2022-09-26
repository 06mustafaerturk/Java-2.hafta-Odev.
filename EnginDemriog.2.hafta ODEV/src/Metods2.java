
public class Metods2 {

	public static void main(String[] args) {
			String mesaj="bugun hava cok güzel";
			mesaj.substring(0, 2);		// 0.cý indexten 2 ye kadar degerleri alacaktý.
					
			String yeniDger=mesaj.substring(0, 2);
			System.out.println(yeniDger);
			String yeniDeger=sehirVer();
			int sayilarinToplami=topla1(1,5,8,7);
			System.out.println(sayilarinToplami);
	}
		public static void ekle() {
				System.out.println("eklendi");  // iþ yaptýrdýk.biþey dönmedi
		}
		
		public static void sil() {
			System.out.println("silindi");
		}
	
		public static void guncelle() {
				System.out.println("güncellendi");
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
