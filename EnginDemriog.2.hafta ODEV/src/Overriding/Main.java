package Overriding;

public class Main {

	public static void main(String[] args) {

			//OgrenciKrediManager krediManager=new OgrenciKrediManager();
			//System.out.println(krediManager.hesapla(100));
			
			BaseKrediManager[] krediManagers=new BaseKrediManager[] 
					{new OgrenciKrediManager(),new OgretmenKrediManager(),new TarimKrediManager()};
		
				for (BaseKrediManager Krediler : krediManagers) {
					      System.out.println(Krediler.hesapla(10000));
				}
	}

}
