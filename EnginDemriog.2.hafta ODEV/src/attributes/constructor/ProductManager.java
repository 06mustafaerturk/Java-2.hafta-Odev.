package attributes.constructor;

public class ProductManager {

	public void Add(Product product) { // bu classta operayonlar� yapcaz.add opresyonu ama ne ekiycek.onu belirtcez.
										// prametre olarak Product g�ndercez.
		System.out.println("�r�n eklnedi " + product.get_name());
	}

	//public void Add2(int id, String name, String description, int stockAmount, double price) {

//}

}

// bu calssta operayonun yapacag� i�i belirttik.
// bunun nesnesini olu�turup.bu opresyonu kullancaz.
// main metodunda new leyip.yapcaz.