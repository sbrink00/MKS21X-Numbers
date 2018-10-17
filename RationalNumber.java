public class RationalNumber extends RealNumber{
  private int numerator;
  private int denominator;

  public RationalNumber(int nume, int denom){
    super(0.0);
    numerator = nume; //this constructor will deal with the issue of
    denominator = denom; //zero as a denominator
    if (denom == 0){
      numerator = 0;
      denominator = 1;
    }
  }

  public double getValue(){
    return this.numerator/this.denominator;
  }

  public int getNumerator(){
    return this.numerator;
  }

  public int getDenominator(){
    return this.denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber output;
    output = new RationalNumber(this.denominator, this.numerator);
    return output;
  }

  public boolean equals(RationalNumber other){
    return false;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber output;
    output = new RationalNumber(this.numerator * other.numerator, this.denominator * other.denominator);
    return output;

  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber recip = other.reciprocal();
    RationalNumber output;
    output = this.multiply(recip);
    return output;

  }

  public String toString(){
    return this.numerator + "/" + this.denominator;
  }

  public void setNum(int nume, int denom){
    numerator = nume;
    denominator = denom;
  }

  public String compareTo(RationalNumber other){
    return "the return statement will compare the RationalNumber that calls compateTo and other";
  }

  public String compareTo(RealNumber irrational, RationalNumber rational){
    return "the return statement will compare the RationalNumber that calls compateTo and other";
  }

}
