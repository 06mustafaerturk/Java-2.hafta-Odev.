package attributes.constructor;
	//this benim içersinde bulunugum class'ýn id si demek.
	// enkapsulation getter ve setterlar konusu.
	// kullanýcý eriþememsei için setterlarý yazmýyoruz .
	// sýnýf içinde saklamak dýþarýya açmamak.

	// biz bunlarý public olarak iþaretlersek.Yani her yerden ulaþýlabilir.
	// private sadece o blokta calýþýr diðer yerlerden ulaþýlmaz.
	// private lara ulaþmak için ise getter va settarlar kullanýlýyor.
	// void biþey dönmene gerek yok demek.
public class Product {
	
	public Product(int id,String name,String description,double price,int stockAmount,String renk,String kod) {
			// ben parametreli constructor ile sadece bu parametreleri verirsen çalýþtýrýrým.
		   // yani new lerim demek. yani nesne oluþtururum demek.
			System.out.println("parametreli contructor çalýþtý.");
			
		this._id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._stockAmount=stockAmount;
		this._renk=renk;
		this._kod=kod;
		// biz burda kýsacasý  asýl Fieldlarý set ettik diyebiliriz.tabi = sagýndakileri set ettik.
	
	}
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;  	// kod olarak id +ürünün baþ harfi. yazcak.
	
	// id + ürünün baþ harfi.Kullanýcý bulmamalý.sadece okuyabilmeli.yazamamalý.BUNU YAPACAZ.
	
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
		return this._id+_name.substring(0,1); // name yada getname 2 side field ý sonucta.
	}
	
	
	
	
	
	
	
	
}
