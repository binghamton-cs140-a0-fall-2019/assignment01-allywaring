package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
  public static void main(String[] args) {

    SimpleDate newSimpleDate1 = SimpleDate.of(2019, 8, 26);
    SimpleDate newSimpleDate2 = SimpleDate.of(2018, 8, 26);


    System.out.println(newSimpleDate1);
    System.out.println(newSimpleDate1.before(newSimpleDate2));
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

      SimpleDate newSimpleDate12 = SimpleDate.of(2019, 8, 26);
      SimpleDate newSimpleDate22 = SimpleDate.of(2018, 8, 26);

      output.println(newSimpleDate12);
      output.println(newSimpleDate1.before(newSimpleDate2));
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
