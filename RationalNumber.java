public class RationalNumber extends RealNumber{
  private int numerator;
  private int denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume; //this constructor will deal with the issue of
    denominator = deno; //zero as a denominator
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
    this.reduce();
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
    int myDeno = this.denominator;
    int otherDeno = other.denominator;
    RationalNumber r1 = new RationalNumber(this.numerator*otherDeno, this.denominator*otherDeno);
    RationalNumber r2 = new RationalNumber(other.numerator*myDeno, other.denominator*myDeno);
    return r2.numerator == r1.numerator;
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

  public static int gcd(int n1, int n2){
    if (n1 == 0 || n2 == 0) return 1;
    for (;n1 != n2;){
      if (n1>n2) n1-= n2;
      else n2 -= n1;
    }
    return n1;
  }

  private void reduce(){
    int factor = gcd(this.numerator, this.denominator);
    this.numerator /= factor;
    this.denominator /= factor;
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
