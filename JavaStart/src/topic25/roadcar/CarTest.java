package topic25.roadcar;

public class CarTest {

	public static void main(String[] args) {
		Car skoda = new Car("CBD 2.0 TDI");
		skoda.Car_fuelUp(5);
		try {
			skoda.Car_go();
		} catch (InterruptedException e) {
			System.out.println("Przyczyna błędu:");
			System.out.println(
			"Generowany, gdy wątek czeka, śpi lub jest w inny sposób zajęty, a wątek zostaje \n" + 
			"przerwany przed lub w trakcie działania. Czasami metoda może chcieć sprawdzić, \n" + 
			"czy bieżący wątek został przerwany, a jeśli tak, natychmiast rzucić ten wyjątek.");
			e.printStackTrace();
		}
		
		// tak tworzymy obiekt klasy wewnętrznej
		Car.Engine cbd40 = new Car("Fiat").new Engine("CBD 4.0 TDI");
		cbd40.Engine_fuelConsume();
		
		/* dostęp do metody fuelConsume w zasadzie nic nie daje, dostępu 
		do metod klasy zewnętrznej nie mamy ! 
		
		jeśli klasa wewnętrzna zostanie oznaczona jako prywatna, to dostęp do niej 
		z zewnątrz będzie niemożliwy. */
		
		/* w przypadku klas zagnieżdżonych nie wymagana jest tworzenie instancji klasy opakowującej
		gdy klasa jest statyczna, to elementy instancyjne klasy otaczającej wcale 
		nie muszą istnieć */
		CarStatic.Engine ferrari = new CarStatic.Engine();
		ferrari.fuel = 6;
		
		

	}

}
