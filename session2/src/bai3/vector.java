

public class vector {
	private Double length;
	private Double Width;
	private Double Height;
	
	public vector() {
		this.length = 0.0;
		this.Width = 0.0;
		this.Height = 0.0;
	}
	
	public vector(Double x, Double y, Double z) {
		if(x >= 0 && y >= 0 && z >= 0) {
			this.length = x;
			this.Width = y;
			this.Height = z;
		}
		else {
			System.out.println("Error");
		}
	}
	
	public static vector addVector(vector a, vector b) {
		return new vector(a.length + b.length, a.Width + b.Width, a.Height + b.Height);
		
	}
	
	public static Double multiplyTwoVector(vector a, vector b) {
		return a.length*b.length + a.Width*b.Width + a.Height*b.Height;
	}
	
	public vector multiplyNumber(Double k) {
		return new vector(this.length*k, this.Width*k,this.Height*k);
	}
	
	
	
	 public static void main(String[] args) {
	        
	        vector v1 = new vector(1.0, 2.0, 3.0);
	        vector v2 = new vector(4.0, 5.0, 6.0);

	     
	        vector sum = vector.addVector(v1, v2);
	        System.out.println("Tổng hai vector: " + sum.length + " " + sum.Width + " " + sum.Height);

	      
	        Double multiply = vector.multiplyTwoVector(v1, v2);
	        System.out.println("Tích vô hướng của hai vector: " + multiply);

	       
	        vector product = v1.multiplyNumber(2.0);
	        System.out.println("Vector sau khi nhân với 2: " + product.length + " " + product.Width
	        														+ " " + product.Height);
	        
	 }
}
