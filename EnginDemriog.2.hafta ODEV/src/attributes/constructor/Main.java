package attributes.constructor;

public class Main {

	public static void main(String[] args) {

		Product product=new Product(2,"hakan","hp laptop" ,3000,5,"sar�","L2");
		
		
		
		product.set_name("Laptop");
		product.set_id(1);
		product.set_description("Asus Laptop");
		product.set_price(5000);
		product.set_stockAmount(3);
		
		
		ProductManager productManager=new ProductManager();		// burda bo� constructor ile new liyoruz.
		productManager.Add(product);							// ProduckManager class�ndan ol��turdugumuz nesne ile
		String kod=product.get_kod();							// ProductManager i�indeki metodu cag�rd�k.
		System.out.println(kod);
	}

}
