public class RationalNumber extends RealNumber{
  private int numerator;
  private int denominator;

  public RationalNumber(int nume, int denom){
    numerator = nume; //this constructor will deal with the issue of
    denominator = denom; //zero as a denominator
  }

  public RationalNumber(){
    numerator = 1;
    denominator = 1;
  }

  public String toString(){
    return "";
  }

  public void setNum(int nume, int denom){
    numerator = nume;
    denominator = denom;
  }

  public String compareTo(RationalNumber other){
    return "the return statement will compare the RationalNumber that calls compateTo and other";
  }

  public String conpareTo(RealNumber irrational, RationalNumber rational){
    return "the return statement will compare the RationalNumber that calls compateTo and other";
  }

}
