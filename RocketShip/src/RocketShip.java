public class RocketShip {
    public static final int height = 13;

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
        for(int i = 1; i < 6; i++) { //6
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }

                for (int k = 0; k < i; k++) {
                    System.out.print("/");
                }
                    System.out.print("**");
                for (int l = 0; l < i; l++) {
                    System.out.print("\\");
                }
                for (int g = height; g > i; g--) {
                    System.out.print(" ");
                } System.out.println();
        }
    }

    // Generate the top part of the rocket
    public static void drawTop() {
        for(int i = 2; i >= 0; i--) { //2
            System.out.print("|");
            for(int j = 0; j < i; j++) {
                System.out.print(".");
            }
            for(int k = 2; k >= i; k--) {
                System.out.print("/\\");
            }
            for(int l = 0; l < i; l++) {
                        System.out.print("..");
            }
            for (int m = 2; m >= i; m--) {
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
        for (int i = 2; i >= 0; i--) { //2
            System.out.print("|");
            for (int k = 2; k > i; k--) {
                System.out.print(".");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("\\/");
            }
            for (int k = 2; k > i; k--){
                System.out.print("..");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("\\/");
            }
            for (int k = 2; k > i; k--) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();

        }
    }





    // Generate the line between parts
    public static void drawLine() {
        System.out.print("+");
        for (int j = 0; j < 6; j++) { //6
            System.out.print("=*");

        } System.out.print("+");
        System.out.println();
    }

}
