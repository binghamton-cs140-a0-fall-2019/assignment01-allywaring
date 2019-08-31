package assignment01;
import java.time.LocalDate;
/**
*@author AllyWaring
*/
public class SimpleDate {
  private int year;
  private int month;
  private int day;

  // public SimpleDate(int yr, int m, int d){
  //   year = yr;
  //   month = m;
  //   day = d;
  // }
  public static SimpleDate of(int yr, int m, int d){
    var returnValue = new SimpleDate();
    returnValue.year = yr;
    returnValue.month = m;
    returnValue.day = d;
    return returnValue;
  }
  public boolean before(SimpleDate other){
    if(this.year > other.year && this.month > other.month && this.day > other.day){
      return true;
    }
    else{
      return false;
    }
  }
  @Override
  public String toString() {
    // System.out.println(firstNames + " " + lastNames + " "+ "(" + ssn + ")");
    // System.out.println("Date and place of birth: " + placeDob);
    // System.out.println(address);
    return String.format(year + "," + month + "," + day);

  }
  }
