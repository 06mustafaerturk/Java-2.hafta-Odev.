package polimorfizm;

public class ConsoleLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("ConsoleLogger kýsmýndaki Ovirride edilen Log metodu calýþtý :"+ message);
		}
}
