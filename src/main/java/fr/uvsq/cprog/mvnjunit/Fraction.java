package fr.uvsq.cprog.mvnjunit;
import java.math.BigInteger;
import java.util.Objects;

public class Fraction {
    private BigInteger num;
    private BigInteger den;
    static private final Fraction zero = new Fraction(BigInteger.valueOf(0),BigInteger.valueOf(1));
    static private final Fraction un = new Fraction(BigInteger.valueOf(1),BigInteger.valueOf(1));

    Fraction(BigInteger num,BigInteger den){
        this.num = num;
        this.den = den;
    }
    Fraction(BigInteger num){
        this.num = num;
        this.den = BigInteger.valueOf(1);
    }
    Fraction(){
        this.num = BigInteger.valueOf(0);
        this.den = BigInteger.valueOf(1);
    }

    @Override
    public String toString(){
        return this.num+" / "+this.den;
    }

    Double toDouble(){
        return this.num.doubleValue()/(this.den.doubleValue());
    }
    public BigInteger getNum(){
        return this.num;
    }
    public BigInteger getDen(){
        return this.den;
    }
    public Fraction addd(Fraction fr2){
        if (this.getDen()==fr2.getDen()){
            return new Fraction(this.num.add(fr2.num),this.den);
        }else {
            return reduite((this.num.multiply(fr2.den)).add(fr2.num.multiply(this.den)),fr2.den.multiply(this.den));
        }
    }

    @Override
    public boolean equals(Object fr){
        if (fr == null){
            System.out.println("dfdfdfdf");

            return false;
        }if(!(fr instanceof Fraction)){
            System.out.println("-----");

            return false;
        }

        Fraction frr = (Fraction)fr;
        if (((reduite(this.num ,this.den).num).equals(reduite(frr.num,frr.den).num)) && ((reduite(this.num ,this.den).den).equals(reduite(frr.num,frr.den).den)) ){
            return true;
        }else {
            System.out.println("dfdfdfdf");

            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(num, den);
    }

    public BigInteger compareTo(Fraction fr){
        if ( this.toDouble() == fr.toDouble() ) {
            return BigInteger.valueOf(0);
        }else if ( this.toDouble() < fr.toDouble() ){
            return BigInteger.valueOf(1);
        }else{
            return BigInteger.valueOf(-1);
        }
    }


    // Function pour reduire fraction
    private Fraction reduite(BigInteger x, BigInteger y)
    {
        BigInteger d;
        d = pgcd(x, y);
        x = x.divide(d);
        y = y.divide(d);
        return new Fraction(x,y);
    }
    static BigInteger pgcd(BigInteger a, BigInteger b)
    {
        if (b.equals(BigInteger.valueOf(0)))
            return a;
        return pgcd(b, a.mod(b));

    }}
