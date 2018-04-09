package descartes;

//import descartes.data.Point;
import descartes.logic.PointController;

public class PointApplication {
	
	public static final int ADD_X = 0;
	public static final int ADD_Y = 1;
	public static final int MINUS_X = 2;
	public static final int MINUS_Y = 3;

	public static void main(String[] args) {
		//Point p = new Point(6, 6);
		PointController pc = new PointController(2, 3);
		
		int option = ADD_Y;
        
        switch(option) {
        case ADD_X:
            pc.addX();
            break;
        case ADD_Y:
            pc.addY();
            break;
        case MINUS_X:
            pc.minusX();
            break;
        case MINUS_Y:
            pc.minusY();
            break;
        default:
            System.out.println("Podano b³êdn¹ wartoœæ");
        }
		pc.print();
		
		/*
			pc.addX();
			pc.addY();
			pc.print();
			pc.setPoint(new Point(10, 2));
			pc.print();
			System.out.println(p.getX());
		*/
		
		
	}

}
