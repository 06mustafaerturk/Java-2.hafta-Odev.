package polimorfizm;

public class EmailLogger extends BaseLogger{
	
	public void log(String message) {
		System.out.println("EmailLogger kýsmýndaki Ovirride edilen Log metodu calýþtý :"+ message);
		}
}