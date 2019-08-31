package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
    Computer mycomputer1 = new Computer("apple", "15inch", 8, 1500, true, 1999.99);
    Computer mycomputer2 = new Computer("dell", "13inch", 8, 2000, false, 299.99);
    Computer mycomputer3 = new Computer("hp", "11 inch", 8, 800, true, 599.99);
    Computer mycomputer4 = new Computer("acer", "15 inch", 8, 500, false, 199.99);
    System.out.println(mycomputer1);
    System.out.println(mycomputer2);
    System.out.println(mycomputer3);
    System.out.println(mycomputer4);
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

      Computer mycomputer12 = new Computer("apple", "15inch", 8, 1500, true, 1999.99);
      Computer mycomputer22 = new Computer("dell", "13inch", 8, 2000, false, 299.99);
      Computer mycomputer32 = new Computer("hp", "11 inch", 8, 800, true, 599.99);
      Computer mycomputer42 = new Computer("acer", "15 inch", 8, 500, false, 199.99);
      output.println(mycomputer12);
      output.println(mycomputer22);
      output.println(mycomputer32);
      output.println(mycomputer42);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
