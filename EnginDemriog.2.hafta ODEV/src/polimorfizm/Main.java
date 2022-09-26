package polimorfizm;

public class Main {

	public static void main(String[] args) {
/*
			EmailLogger emailLogger=new EmailLogger();
			emailLogger.Log("mustafa\n");
			DateBaseLogger dateBaseLogger=new DateBaseLogger();
			dateBaseLogger.Log("hamdi\n");
			
			// polimorfizm birbirinin referanslarýný tutuyor.
			BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new DateBaseLogger(),new EmailLogger(),new ConsoleLogger()};
			
			for (BaseLogger aaaa : loggers) {		
					aaaa.Log("Log mesajý\n");			// BaseLogger dizisindeki elemanlarý dolaþacak.
			}
			
			
			
			// BaseLogger tipinde dizi olusturabilirim.
			// sonra elamanlarý oluþturudm.
			// elamanlarý aslýnda BaseLogger ýn alt sýnýfý diyebildigðimiz için.sýkýtýn olmuyo.
*/	
				// polimorfim tam olarak burusu oluyo.
		CustomerManager customerManager=new CustomerManager(new DateBaseLogger());
		customerManager.ekle();
		
	}	

}
