package recap_classes;

public class Main {

	public static void main(String[] args) {

		DortIslem dortýslem=new DortIslem();
		int sonuc=dortýslem.Bolme(6,3);		// Bolme operasyonu int döndüðü icin int döneceði için.Sonuc degiþkenine atadýk.
		int sonuc2=dortýslem.Cikarma(6, 3);
		int sonuc3=dortýslem.Carpma(6, 3);
		int sonuc4=dortýslem.Topla(6, 3);
		 
		System.out.println(sonuc);
		
	}

}
