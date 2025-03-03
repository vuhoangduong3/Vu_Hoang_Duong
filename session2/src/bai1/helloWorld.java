package bai1;
import javax.swing.JOptionPane;
public class helloWorld {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("What is your name");
		JOptionPane.showMessageDialog(null, "hello: " + result + "!");
		System.exit(0);
	}
}
