package polimorfizm;

public class Main {

	public static void main(String[] args) {
/*
			EmailLogger emailLogger=new EmailLogger();
			emailLogger.Log("mustafa\n");
			DateBaseLogger dateBaseLogger=new DateBaseLogger();
			dateBaseLogger.Log("hamdi\n");
			
			// polimorfizm birbirinin referanslar�n� tutuyor.
			BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new DateBaseLogger(),new EmailLogger(),new ConsoleLogger()};
			
			for (BaseLogger aaaa : loggers) {		
					aaaa.Log("Log mesaj�\n");			// BaseLogger dizisindeki elemanlar� dola�acak.
			}
			
			
			
			// BaseLogger tipinde dizi olusturabilirim.
			// sonra elamanlar� olu�turudm.
			// elamanlar� asl�nda BaseLogger �n alt s�n�f� diyebildig�imiz i�in.s�k�t�n olmuyo.
*/	
				// polimorfim tam olarak burusu oluyo.
		CustomerManager customerManager=new CustomerManager(new DateBaseLogger());
		customerManager.ekle();
		
	}	

}
