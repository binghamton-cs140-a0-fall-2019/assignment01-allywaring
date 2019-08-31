package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
  public static void main(String[] args){
    DateAndPlaceOfBirth obj1 = new DateAndPlaceOfBirth(2000, 03, 06, "Setauket", "NY", "USA");
    DateAndPlaceOfBirth obj2 = new DateAndPlaceOfBirth(1998, 01, 06, "San Diego", "CA", "USA");
    DateAndPlaceOfBirth obj3 = new DateAndPlaceOfBirth(1990, 12, 17, "Miami", "FL", "USA");
    DateAndPlaceOfBirth obj4 = new DateAndPlaceOfBirth(1990, 12, 17, "London","England");
    DateAndPlaceOfBirth obj5 = new DateAndPlaceOfBirth(2003, 12, 17, "Paris", "France");

    System.out.println(obj1);
    System.out.println(obj2);
    System.out.println(obj3);
    System.out.println(obj4);
    System.out.println(obj5);

    System.out.println(obj1.hasSameBirthDayAs(obj2));
    System.out.println(obj1.hasSameBirthDayAs(obj3));
    System.out.println(obj1.hasSameBirthDayAs(obj4));
    System.out.println(obj1.hasSameBirthDayAs(obj5));
    System.out.println(obj2.hasSameBirthDayAs(obj3));
    System.out.println(obj2.hasSameBirthDayAs(obj4));
    System.out.println(obj2.hasSameBirthDayAs(obj5));
    System.out.println(obj3.hasSameBirthDayAs(obj4));
    System.out.println(obj3.hasSameBirthDayAs(obj5));
    System.out.println(obj4.hasSameBirthDayAs(obj5));

    System.out.println(obj1.hasSameBirthDateAs(obj2));
    System.out.println(obj1.hasSameBirthDateAs(obj3));
    System.out.println(obj1.hasSameBirthDateAs(obj4));
    System.out.println(obj1.hasSameBirthDateAs(obj5));
    System.out.println(obj2.hasSameBirthDateAs(obj3));
    System.out.println(obj2.hasSameBirthDateAs(obj4));
    System.out.println(obj2.hasSameBirthDateAs(obj5));
    System.out.println(obj3.hasSameBirthDateAs(obj4));
    System.out.println(obj3.hasSameBirthDateAs(obj5));
    System.out.println(obj4.hasSameBirthDateAs(obj5));

    System.out.println(obj1.youngerThan(obj2));
    System.out.println(obj1.youngerThan(obj3));
    System.out.println(obj1.youngerThan(obj4));
    System.out.println(obj1.youngerThan(obj5));
    System.out.println(obj2.youngerThan(obj3));
    System.out.println(obj2.youngerThan(obj4));
    System.out.println(obj2.youngerThan(obj5));
    System.out.println(obj3.youngerThan(obj4));
    System.out.println(obj3.youngerThan(obj5));
    System.out.println(obj4.youngerThan(obj5));

    System.out.println(obj1.olderThan(obj2));
    System.out.println(obj1.olderThan(obj3));
    System.out.println(obj1.olderThan(obj4));
    System.out.println(obj1.olderThan(obj5));
    System.out.println(obj2.olderThan(obj3));
    System.out.println(obj2.olderThan(obj4));
    System.out.println(obj2.olderThan(obj5));
    System.out.println(obj3.olderThan(obj4));
    System.out.println(obj3.olderThan(obj5));
    System.out.println(obj4.olderThan(obj5));
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

      DateAndPlaceOfBirth obj12 = new DateAndPlaceOfBirth(2000, 03, 06, "Setauket", "NY", "USA");
      DateAndPlaceOfBirth obj22 = new DateAndPlaceOfBirth(1998, 01, 06, "San Diego", "CA", "USA");
      DateAndPlaceOfBirth obj32 = new DateAndPlaceOfBirth(1990, 12, 17, "Miami", "FL", "USA");
      DateAndPlaceOfBirth obj42 = new DateAndPlaceOfBirth(1990, 12, 17, "London","England");
      DateAndPlaceOfBirth obj52 = new DateAndPlaceOfBirth(2003, 12, 17, "Paris", "France");

      output.println(obj12);
      output.println(obj22);
      output.println(obj32);
      output.println(obj42);
      output.println(obj52);

      output.println(obj12.hasSameBirthDayAs(obj22));
      output.println(obj12.hasSameBirthDayAs(obj32));
      output.println(obj12.hasSameBirthDayAs(obj42));
      output.println(obj12.hasSameBirthDayAs(obj52));
      output.println(obj22.hasSameBirthDayAs(obj32));
      output.println(obj22.hasSameBirthDayAs(obj42));
      output.println(obj22.hasSameBirthDayAs(obj52));
      output.println(obj32.hasSameBirthDayAs(obj42));
      output.println(obj32.hasSameBirthDayAs(obj52));
      output.println(obj42.hasSameBirthDayAs(obj52));

      output.println(obj12.hasSameBirthDateAs(obj22));
      output.println(obj12.hasSameBirthDateAs(obj32));
      output.println(obj12.hasSameBirthDateAs(obj42));
      output.println(obj12.hasSameBirthDateAs(obj52));
      output.println(obj22.hasSameBirthDateAs(obj32));
      output.println(obj22.hasSameBirthDateAs(obj42));
      output.println(obj22.hasSameBirthDateAs(obj52));
      output.println(obj32.hasSameBirthDateAs(obj42));
      output.println(obj32.hasSameBirthDateAs(obj52));
      output.println(obj42.hasSameBirthDateAs(obj52));

      output.println(obj12.youngerThan(obj22));
      output.println(obj12.youngerThan(obj32));
      output.println(obj12.youngerThan(obj42));
      output.println(obj12.youngerThan(obj52));
      output.println(obj22.youngerThan(obj32));
      output.println(obj22.youngerThan(obj42));
      output.println(obj22.youngerThan(obj52));
      output.println(obj32.youngerThan(obj42));
      output.println(obj32.youngerThan(obj52));
      output.println(obj42.youngerThan(obj52));

      output.println(obj12.olderThan(obj22));
      output.println(obj12.olderThan(obj32));
      output.println(obj12.olderThan(obj42));
      output.println(obj12.olderThan(obj52));
      output.println(obj22.olderThan(obj32));
      output.println(obj22.olderThan(obj42));
      output.println(obj22.olderThan(obj52));
      output.println(obj32.olderThan(obj42));
      output.println(obj32.olderThan(obj52));
      output.println(obj42.olderThan(obj52));
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
