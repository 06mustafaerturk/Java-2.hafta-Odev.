package attributes.constructor;

public class ProductManager {

	public void Add(Product product) { // bu classta operayonlarý yapcaz.add opresyonu ama ne ekiycek.onu belirtcez.
										// prametre olarak Product göndercez.
		System.out.println("ürün eklnedi " + product.get_name());
	}

	//public void Add2(int id, String name, String description, int stockAmount, double price) {

//}

}

// bu calssta operayonun yapacagý iþi belirttik.
// bunun nesnesini oluþturup.bu opresyonu kullancaz.
// main metodunda new leyip.yapcaz.