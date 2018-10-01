/* Seante Jones
AP CS 1
September 27, 2018
Practice Project Draw Box
 */

public class ThreeBoxes {
   public static final int ROW = 3;
   public static final int COLUMN = 3;
    public static void main(String [] args) {
        Star();
        Dollar();
        Hashtag();
    }
    public static void Star() { // print stars
        for(int i=0; i < ROW; i++){
            for(int j = 0; j< COLUMN; j++) {
                System.out.print("*");
            } System.out.println();
        } System.out.println();
    }
    public static void Dollar() { // print dollar signs
        for(int i=0; i < ROW; i++){
            for(int j = 0; j< COLUMN; j++) {
                System.out.print("$");
            } System.out.println();
        } System.out.println();
    }
    public static void Hashtag() { // print hashtags
        for(int i=0; i < ROW; i++){
            for(int j = 0; j< COLUMN; j++) {
                System.out.print("#");
            } System.out.println();
        } System.out.println();
    }
}
