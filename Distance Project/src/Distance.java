/* Seante Jones
AP Computer Science 1
Period 1
October 18, 2018
Distance Formula Project
 */
public class Distance {
    public static void main(String [] args) {
        double answer1 = distance(16, 10, 4, 28);
        double answer2 = answer1 + distance(4, 28, 2, 8);
        double answer3 = answer1 + answer2;

        System.out.println("The distance from Tacoma to Gig Harbor is " + answer1 + " miles.");
        System.out.println("The distance from Tacoma to Gig Harbor to Steilacoom is " + answer2 + " miles.");
        System.out.println("The distance from Tacoma to Gig Harbor to Steilacoom back to Tacoma is " + answer3 + " miles.");
    }

        public static double distance (double x1, double y1, double x2, double y2){ // Create the Distance Formula
        double d1 = Math.pow(x2 - x1, 2);
        double d2 = Math.pow(y2 - y1, 2);
        double d = Math.sqrt(d1 + d2);

        return d;
    }
}
