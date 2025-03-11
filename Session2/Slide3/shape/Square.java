package shape;

public class Square {
	private Double length;
	
	public Square() {
		this.length = 0.0;
	}
	
	public Square(Double length) {
		if(length != null && length >= 0) {
			this.length = length;
		}
		else System.out.println("Error");
	}
	
	public Double getLength() {
		return this.length;
	}
	
	public void setLength(Double length) {
		if(length != null && length > 0) {
			this.length = length;
		}
		else System.out.println("Error");
	}
	
	public Double perimeter() {
		return this.length*4;
	}
	
	public Double area() {
		return this.length * this.length;
	}
	
	public static void main(String[] args) {
		Square square = new Square(4.0);
		System.out.println(square.length);
		System.out.println(square.perimeter());
		System.out.println(square.area());
	}
}
