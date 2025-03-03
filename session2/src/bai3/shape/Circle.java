package shape;

public class Circle {
	private Double radius;
	
	public Circle() {
		this.radius = 0.0;
	}
	
	public Circle(Double radius) {
		if(radius >= 0 && radius != null) {
			this.radius = radius;
		}
		else System.out.println("error");
	}
	
	public Double getRadius() {
		return this.radius;
	}
	
	public void setRadius(Double radius) {
		if(radius >= 0 && radius != null) {
			this.radius = radius;
		}
		else System.out.println("error");
	}
	
	public Double parameter() {
		return this.radius*2*Math.PI;
	}
	
	public Double area() {
		return this.radius * this.radius * Math.PI;
	}
	
	 public static void main(String[] args) {
		 Circle circle = new Circle(5.0);
		 System.out.println(circle.radius);
		 System.out.println(circle.parameter());
		 System.out.println(circle.area());
	        
	 }     
}
