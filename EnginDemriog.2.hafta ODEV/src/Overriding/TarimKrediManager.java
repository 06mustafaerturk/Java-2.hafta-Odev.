package Overriding;

public class TarimKrediManager extends BaseKrediManager{
	
	public double hesapla(double tutar) {		// burda Overriding yaptım.Base sınıftakı metodu ezdim.
		return tutar *1.05;						
	}											// overloading ise imzası degişirse oluyor.
}												// parametresiz ve parametreli Construktor varsa demek.
