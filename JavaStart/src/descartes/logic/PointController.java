package descartes.logic;

import descartes.data.Point;

public class PointController {
	private Point point;
	
	public PointController(int x, int y) {
		point = new Point(x, y);
	}
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public void addX() {
		point.setX(point.getX() + 1);
	}
	public void minusX() {
		point.setX(point.getX() - 1);
	}
	public void addY() {
		point.setY(point.getY() + 1);
	}
	public void minusY() {
		point.setY(point.getY() - 1);
	}
	public void print() {
		System.out.println("X = " + point.getX() + " Y = " + point.getY());
	}
}
