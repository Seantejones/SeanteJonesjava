public class RocketShip {
    public static final int HEIGHT = 2;

    public static void main(String[] args) {
        drawCone();
        drawLine();
        drawTop();
        drawBottom();
        drawLine();
        drawBottom();
        drawTop();
        drawLine();
        drawCone();
    }

    // Generate the cone for the rocket
    public static void drawCone() {
        for(int i = 1; i < HEIGHT*2; i++) { //6
            for (int j = HEIGHT*2; j > i; j--) {
                System.out.print(" ");
            }

                for (int k = 0; k < i; k++) {
                    System.out.print("/");
                }
                    System.out.print("**");
                for (int l = 0; l < i; l++) {
                    System.out.print("\\");
                }
                for (int g = HEIGHT*2; g > i; g--) {
                    System.out.print(" ");
                } System.out.println();
        }
    }

    // Generate the top part of the rocket
    public static void drawTop() {
        for(int i = HEIGHT-1; i >= 0; i--) { //2
            System.out.print("|");
            for(int j = 0; j < i; j++) {
                System.out.print(".");
            }
            for(int k = HEIGHT-1; k >= i; k--) {
                System.out.print("/\\");
            }
            for(int l = 0; l < i; l++) {
                        System.out.print("..");
            }
            for (int m = HEIGHT-1; m >= i; m--) {
                System.out.print("/\\");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(".");
            } System.out.print("|");
            System.out.println();


        }
    }

    // Generate the bottom part of the rocket
    public static void drawBottom(){
        for (int i = HEIGHT-1; i >= 0; i--) { //2
            System.out.print("|");
            for (int k = HEIGHT-1; k > i; k--) {
                System.out.print(".");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("\\/");
            }
            for (int k = HEIGHT-1; k > i; k--){
                System.out.print("..");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("\\/");
            }
            for (int k = HEIGHT-1; k > i; k--) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();

        }
    }





    // Generate the line between parts
    public static void drawLine() {
        System.out.print("+");
        for (int j = 0; j < HEIGHT*2; j++) { //6
            System.out.print("=*");

        } System.out.print("+");
        System.out.println();
    }

}
