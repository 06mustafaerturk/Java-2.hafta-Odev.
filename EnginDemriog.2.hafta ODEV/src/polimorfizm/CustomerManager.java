package polimorfizm;

public class CustomerManager {

	private BaseLogger logger;

	CustomerManager(BaseLogger loger) {
		this.logger = loger;
	}

	public void ekle() {

		System.out.println("m��teri eklendi");
		this.logger.log("Logland�.");

		// DateBaseLogger logger=new DateBaseLogger();			
		// logger.Log(null);
		// bir class di�er bir class i�inde new lenirse bag�ml� olmaya ba�lars�n.
	}
}
