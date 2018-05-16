package topic17.wholesale;

public class Garage {
	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		/* tablica jest mi potrzebna 
		 * by podnosiæ id
		 * */
		Tire[] michelin = new Tire[3];
		michelin[0] = new Tire();
		michelin[1] = new Tire();
		michelin[2] = new Tire();
		
		
		michelin[0].setCircleDec(5.8);
		//michelin[1].setIdNum();
		//michelin[2].setIdNum();
		
		print(michelin[0]);
		print(michelin[1]);
		print(michelin[2]);
	}
}
