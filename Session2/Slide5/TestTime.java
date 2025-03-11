package Bai5;
public class TestTime {
    public static void main(String[] args) {
    	@SuppressWarnings("unused")
		String str = "";
        long start1 = System.nanoTime();	
        for (int i = 0; i < 100000; i++) {
            str += "a"; 
        }
        long end1 = System.nanoTime();
        long durationString = end1 - start1;

       
        long start2 = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sb.append("a"); 
        }
        long end2 = System.nanoTime();
        long durationStringBuffer = end2 - start2;

       
        System.out.println(" String: " + durationString / 1_000_000 + " ms");
        System.out.println(" StringBuffer: " + durationStringBuffer / 1_000_000 + " ms");

     
        System.out.println("String/StringBuffer =  " + durationString/durationStringBuffer);
    }
}
