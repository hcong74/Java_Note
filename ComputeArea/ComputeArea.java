import java.util.Scanner;
import javax.swing.JOptionPane;

public class ComputeArea {
	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		//double radius = JOptionPane.showInputDialog(null, "Enter an input",
			//"Input Dialog Demo", JOptionPane.QUESTION_MESSAGE);
		double area = radius * radius * 3.14159;
		
		System.out.println("The area for the circle of radius " + 
			radius + " is " + area);
		System.out.println(radius + 4);*/
		Scanner input = new Scanner(System.in);
		char i;
		int j = 10;
		while(j-- != 0)
		{
			System.out.println((int) (Math.random() * 10));
			input.nextChar();
		}
	}
}
