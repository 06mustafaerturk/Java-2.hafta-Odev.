package polimorfizm;

public class ConsoleLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("ConsoleLogger k�sm�ndaki Ovirride edilen Log metodu cal��t� :"+ message);
		}
}
