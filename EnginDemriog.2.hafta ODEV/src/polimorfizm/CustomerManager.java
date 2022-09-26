package polimorfizm;

public class CustomerManager {

	private BaseLogger logger;

	CustomerManager(BaseLogger loger) {
		this.logger = loger;
	}

	public void ekle() {

		System.out.println("müþteri eklendi");
		this.logger.log("Loglandý.");

		// DateBaseLogger logger=new DateBaseLogger();			
		// logger.Log(null);
		// bir class diðer bir class içinde new lenirse bagýmlý olmaya baþlarsýn.
	}
}
