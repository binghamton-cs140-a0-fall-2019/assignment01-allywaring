package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth obj7 = new DateAndPlaceOfBirth(2000, 03, 06, "Setauket", "NY", "USA");
    StreetUSAddress myaddress7 = new StreetUSAddress("25 University Dr", "PO Box 455", "Setauket", "NY", "11733");
    Person myperson1 = new Person("Ally", "Waring", "123456789", obj7, myaddress7);

    ComputerOwner ally = new ComputerOwner(myperson1);

    Computer mycomputer1 = new Computer("apple", "15inch", 8, 1500, true, 1999.99);
    Computer mycomputer2 = new Computer("dell", "13inch", 8, 2000, false, 299.99);
    // Computer mycomputer3 = new Computer("hp", "11 inch", 8, 800, true, 599.99);
    // Computer mycomputer4 = new Computer("acer", "15 inch", 8, 500, false, 199.99);

    ally.addComputer(mycomputer1);
    ally.addComputer(mycomputer2);
    // ally.addComputer(mycomputer3);
    // ally.addComputer(mycomputer4);
    System.out.println(ally);
    // ally.add(mycomputer2);
    // ally.add(mycomputer3);
    // ally.add(mycomputer4);


    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

        DateAndPlaceOfBirth obj72 = new DateAndPlaceOfBirth(2000, 03, 06, "Setauket", "NY", "USA");
        StreetUSAddress myaddress72 = new StreetUSAddress("25 University Dr", "PO Box 455", "Setauket", "NY", "11733");
        Person myperson12 = new Person("Ally", "Waring", "123456789", obj7, myaddress7);

        ComputerOwner ally2 = new ComputerOwner(myperson1);

        Computer mycomputer123 = new Computer("apple", "15inch", 8, 1500, true, 1999.99);
        Computer mycomputer223 = new Computer("dell", "13inch", 8, 2000, false, 299.99);
        // Computer mycomputer3 = new Computer("hp", "11 inch", 8, 800, true, 599.99);
        // Computer mycomputer4 = new Computer("acer", "15 inch", 8, 500, false, 199.99);

        ally.addComputer(mycomputer123);
        ally.addComputer(mycomputer223);
        // ally.addComputer(mycomputer3);
        // ally.addComputer(mycomputer4);
        output.println(ally2);
        // ally.add(mycomputer2);
        // ally.add(mycomputer3);
        // ally.add(mycomputer4);


		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
