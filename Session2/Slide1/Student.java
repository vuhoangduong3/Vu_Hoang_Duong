package bai1;

public class Student {
	    
	    private String name;
	    private int year;

	   
	    public Student(String name, int year) {
	        this.name = name;
	        this.year = year;
	    }

	  
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	  
	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	   
	    public int getAge() {
	        return 2025 - this.year;
	    }
	
}
