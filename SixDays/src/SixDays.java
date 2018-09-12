/* Seante Jones
AP CS A
Period 1
September 12, 2018
Project #1 SixDays
 */

public class SixDays {
    public static void main(String[] args) {
        FirstVerse();
        SecondVerse();
        ThirdVerse();
        FourthVerse();
        FifthVerse();
        SixthVerse();

    }
    public static void FirstVerse() {
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me");
        QuotePartridge();
        System.out.println();
    }
    public static void QuotePartridge() {
        System.out.println("a partridge in a pear tree.");
    }
    public static void SecondVerse() {
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
        QuoteDoves();
        System.out.println();
    }
    public static void QuoteDoves() {
        System.out.println("two turtle doves, and");
        QuotePartridge();
    }
    public static void ThirdVerse() {
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
        QuoteHens();
        System.out.println();
    }
    public static void QuoteHens () {
        System.out.println("three French hens,");
        QuoteDoves();
    }
    public static void FourthVerse() {
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
        QuoteBirds();
        System.out.println();
    }
    public static void QuoteBirds() {
        System.out.println("four calling birds,");
        QuoteHens();
    }
    public static void FifthVerse() {
        System.out.print("On the 5th day of \"Xmas\", my true love sent to me");
        QuoteRings();
        System.out.println();
    }
    public static void QuoteRings() {
        System.out.println("five golden rings,");
        QuoteBirds();
    }
    public static void SixthVerse() {
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");
        QuoteGeese();
        System.out.println();
    }
    public static void QuoteGeese() {
        System.out.println("six geese a-laying,");
        QuoteRings();
    }

}
