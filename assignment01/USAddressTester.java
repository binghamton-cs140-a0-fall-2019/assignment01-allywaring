package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
  public static void main(String[] args) {
    StreetUSAddress myaddress1 = new StreetUSAddress("25 University Dr", "PO Box 455", "Setauket", "NY", "11733");
    StreetUSAddress myaddress2 = new StreetUSAddress("25 University Dr", " ", "Setauket", "NY", "11733");
    System.out.println(myaddress1);
    System.out.println(myaddress2);

    try(var output =new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
      output.println("\nTESTS FOR StreetUSAddress.java:");

      StreetUSAddress myaddress12 = new StreetUSAddress("25 University Dr", "PO Box 455", "Setauket", "NY", "11733");
      StreetUSAddress myaddress22 = new StreetUSAddress("25 University Dr", " ", "Setauket", "NY", "11733");
      output.println(myaddress12);
      output.println(myaddress22);
    //Copy all your lines above, add an extra "2" to every variable name
    // and replace every System.out.print or System.out.println
    // by output.print or output.println
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
