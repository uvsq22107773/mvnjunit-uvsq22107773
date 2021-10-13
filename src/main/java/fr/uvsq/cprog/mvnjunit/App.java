package fr.uvsq.cprog.mvnjunit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Fraction fr = new Fraction(12,16);
        System.out.println(fr.getNum());
        System.out.println(fr.getDen());
        System.out.println(fr.toStringg());
        System.out.println(fr.toDouble());

        System.out.println();
        System.out.println(fr.add(new Fraction(4,2)).toStringg());

        System.out.println();
        System.out.println(fr.equals(new Fraction(6,7)));

        System.out.println();
        System.out.println(fr.compareTo(new Fraction(1,7)));

    }
}
