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
    return (double)this.numerator/(double)this.denominator;
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
    int v1 = this.numerator*other.denominator;
    int v2 = other.numerator*this.denominator;
    return v1 == v2;
  }

  public String toString(){
    if (this.denominator == 1) return "" + this.numerator;
    if (this.numerator == 0) return "" + 0;
    else return this.numerator + "/" + this.denominator;
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

  public RationalNumber add(RationalNumber other){
    RationalNumber output;
    int top = this.numerator*other.denominator+other.numerator*this.denominator;
    output = new RationalNumber(top, this.denominator*other.denominator);
    return output;
  }

  public RationalNumber subtract(RationalNumber other){
    RationalNumber output;
    int top = this.numerator*other.denominator-other.numerator*this.denominator;
    output = new RationalNumber(top, this.denominator*other.denominator);
    return output;
  }

}
