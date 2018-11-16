

public class Quadrant {
    public static void main(String[] args) {
        Quadrant(-4.2, 17.3);
        System.out.println();

    }

    public static int Quadrant(double x1, double y1){

        if(x1 > 0 && y1 > 0){
            return 1;
        } else if (x1 > 0 && y1 < 0) {
            return 4;
        } else if (x1 < 0 && y1 > 0) {
            return 2;
        } else if (x1 < 0 && y1 < 0) {
            return 3;
        } else {
            return 0;
        }
    }
}
