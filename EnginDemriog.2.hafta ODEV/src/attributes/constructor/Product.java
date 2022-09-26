package attributes.constructor;
	//this benim i�ersinde bulunugum class'�n id si demek.
	// enkapsulation getter ve setterlar konusu.
	// kullan�c� eri�ememsei i�in setterlar� yazm�yoruz .
	// s�n�f i�inde saklamak d��ar�ya a�mamak.

	// biz bunlar� public olarak i�aretlersek.Yani her yerden ula��labilir.
	// private sadece o blokta cal���r di�er yerlerden ula��lmaz.
	// private lara ula�mak i�in ise getter va settarlar kullan�l�yor.
	// void bi�ey d�nmene gerek yok demek.
public class Product {
	
	public Product(int id,String name,String description,double price,int stockAmount,String renk,String kod) {
			// ben parametreli constructor ile sadece bu parametreleri verirsen �al��t�r�r�m.
		   // yani new lerim demek. yani nesne olu�tururum demek.
			System.out.println("parametreli contructor �al��t�.");
			
		this._id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._stockAmount=stockAmount;
		this._renk=renk;
		this._kod=kod;
		// biz burda k�sacas�  as�l Fieldlar� set ettik diyebiliriz.tabi = sag�ndakileri set ettik.
	
	}
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;  	// kod olarak id +�r�n�n ba� harfi. yazcak.
	
	// id + �r�n�n ba� harfi.Kullan�c� bulmamal�.sadece okuyabilmeli.yazamamal�.BUNU YAPACAZ.
	
	public int getId() {
		return _id;
	}
	
	
	public void set_id(int _id) {
		this._id = _id;
	}


	public String get_name() {
		return _name;
	}
	public void set_name(String name) {
		this._name = name;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String description) {
		this._description = description;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double price) {
		this._price = price;
	}
	public int get_stockAmount() {
		return _stockAmount;
	}
	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}
	public String get_renk() {
		return _renk;
	}
	public void set_renk(String renk) {
		this._renk = renk;
	}
	public String get_kod() {
		return this._id+_name.substring(0,1); // name yada getname 2 side field � sonucta.
	}
	
	
	
	
	
	
	
	
}
