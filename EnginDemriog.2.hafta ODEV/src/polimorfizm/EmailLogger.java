package polimorfizm;

public class EmailLogger extends BaseLogger{
	
	public void log(String message) {
		System.out.println("EmailLogger k�sm�ndaki Ovirride edilen Log metodu cal��t� :"+ message);
		}
}