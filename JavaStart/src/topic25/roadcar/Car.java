package topic25.roadcar;

public class Car {
	private Engine Car_engine;
	private int Car_fuel;
	
	public Car(String Car_engineType) {
		Car_engine = new Engine(Car_engineType);
		System.out.println("Utworzono samochód z silnikiem: " + Car_engine.Engine_engineType);
	}
	/* InterruptedException
	 * ------------------------
	 * Generowany, gdy wątek czeka, śpi lub jest w inny sposób zajęty, a wątek zostaje 
	 * przerwany przed lub w trakcie działania. Czasami metoda może chcieć sprawdzić, 
	 * czy bieżący wątek został przerwany, a jeśli tak, natychmiast rzucić ten wyjątek.
	 */
	public void Car_go() throws InterruptedException {
		while(Car_fuel > 0) {
			Car_engine.Engine_fuelConsume();
			System.out.println("Pozstało " + Car_fuel + " litrów paliwa.");
			Thread.sleep(1000);
		}
		System.out.println("Brak paliwa w baku.");
	}
	public void Car_fuelUp(int Car_liters) {
		Car_fuel = Car_fuel + Car_liters;
	}
	
	/* ENGINE */
	public class Engine {
		private String Engine_engineType;
		private static final int ENGINE_FUEL_CONSUMPTION = 1;
		
		public Engine(String Engine_engineType) {
			this.Engine_engineType = Engine_engineType;
			// za pomocą "this.zmienna" nie mogę odwołać się do klasy zewnętrznej
			// używam konstrukcji klasa_zewnętrzna.this.zmienna np. Car.this.Car_fuel = 0;
		}
		public void Engine_fuelConsume() {
			Car_fuel = Car_fuel - ENGINE_FUEL_CONSUMPTION;
		}
	}
	/* ENGINE */
	
}
