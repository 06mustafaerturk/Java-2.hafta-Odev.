package Overriding;

public class TarimKrediManager extends BaseKrediManager{
	
	public double hesapla(double tutar) {		// burda Overriding yapt�m.Base s�n�ftak� metodu ezdim.
		return tutar *1.05;						
	}											// overloading ise imzas� degi�irse oluyor.
}												// parametresiz ve parametreli Construktor varsa demek.
