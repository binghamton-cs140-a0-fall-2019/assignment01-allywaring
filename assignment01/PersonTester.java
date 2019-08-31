package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth obj7 = new DateAndPlaceOfBirth(2000, 03, 06, "Setauket", "NY", "USA");
    StreetUSAddress myaddress7 = new StreetUSAddress("25 University Dr", "PO Box 455", "Setauket", "NY", "11733");
    Person myperson1 = new Person("Ally", "Waring", "123456789", obj7, myaddress7);
    System.out.println(myperson1);

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

      DateAndPlaceOfBirth obj72 = new DateAndPlaceOfBirth(2000, 03, 06, "Setauket", "NY", "USA");
      StreetUSAddress myaddress72 = new StreetUSAddress("25 University Dr", "PO Box 455", "Setauket", "NY", "11733");
      Person myperson13 = new Person("Ally", "Waring", "123456789", obj7, myaddress7);
      output.println(myperson13);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
