package fr.uvsq.cprog.mvnjunit;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Fraction fr = new Fraction(12,16);
        System.out.println("Num: "+fr.getNum());
        System.out.println("Den: "+fr.getDen());
        System.out.println("String: "+fr.toString());
        System.out.println("Double: "+fr.toDouble());

        System.out.println();
        System.out.println("addition: 12/16 + 4/2 = "+fr.add(new Fraction(12,16)).toString());

        Set<Fraction> Fractions = new HashSet<>();
        Fraction fr2 = new Fraction(12,16);
        Fraction fr3 = new Fraction(13,14);
        Fraction fr4 = new Fraction(5,10);
        Fractions.add(fr);
        Fractions.add(fr2);             // will be not added because already exists an element with same num/den
        Fractions.add(fr3);
        Fractions.add(fr4);
        System.out.println("hashmap size: "+Fractions.size());
        // by implementing hashcode and equals, now fr and fr2 will be considered as having the same hash
        // because they are identique in values, and that's our objectif by implementing it.
        // and the size of our hashset will be 3, because we have two elements that they are identique in values (numerator and denumarator)

        System.out.println(fr.toString()+" equals "+fr2.toString()+" : "+fr.equals(fr2));
        System.out.println(fr.toString()+" equals "+fr3.toString()+" : "+fr.equals(fr3));
        System.out.println(fr3.toString()+" equals "+fr4.toString()+" : "+fr3.equals(fr4));

        System.out.println("12/16 compared to 1/7 : "+fr.compareTo(new Fraction(1,7)));

    }
}
