package fr.uvsq.cprog.mvnjunit;

public class Fraction {
    private int num;
    private int den;
    static private final Fraction zero = new Fraction(0,1);
    static private final Fraction un = new Fraction(1,1);

    Fraction(int num,int den){
        this.num = num;
        this.den = den;
    }
    Fraction(int num){
        this.num = num;
        this.den = 1;
    }
    Fraction(){
        this.num = 0;
        this.den = 1;
    }

    @Override
    public String toString(){
        return this.num+" / "+this.den;
    }

    double toDouble(){
        return (double)this.num/this.den;
    }
    public int getNum(){
        return this.num;
    }
    public int getDen(){
        return this.den;
    }
    public Fraction add(Fraction fr2){
        if (this.getDen()==fr2.getDen()){
            return new Fraction(this.num+fr2.num,this.den);
        }else {
            return new Fraction((this.num*fr2.den)+(fr2.num*this.den),fr2.den*this.den);
        }
    }

    public boolean equals(Fraction fr){
        if ((reduite(this.num ,this.den).num==reduite(fr.num,fr.den).num) && (reduite(this.num ,this.den).den==reduite(fr.num,fr.den).den) ){
            return true;
        }else{
            return false;
        }
    }

    public int compareTo(Fraction fr){
        if ( this.toDouble() == fr.toDouble() ) {
            return 0;
        }else if ( this.toDouble() < fr.toDouble() ){
            return 1;
        }else{
            return -1;
        }
    }


    // Function pour reduire fraction
    private Fraction reduite(int x, int y)
    {
        int d;
        d = pgcd(x, y);
        x = x / d;
        y = y / d;
        return new Fraction(x,y);
    }
    static int pgcd(int a, int b)
    {
        if (b == 0)
            return a;
        return pgcd(b, a % b);

    }}
