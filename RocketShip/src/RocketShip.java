public class RocketShip {

    public static void main(String[] args) {
        drawCone();
        drawLine();
        drawTop();


    }
    // Generate the cone for the rocket
    public static void drawCone() {
        for(int i = 1; i < 6; i++) {
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
                for (int g = 6; g > i; g--) {
                    System.out.print(" ");
                }
            System.out.println();

        }


    }
    // Generate the top part of the rocket
    public static void drawTop() {
        System.out.print("|");
        for(int i = 1; i < 6; i++){
            for(int j = 4; j > i; i--) {
                System.out.print(".");

            }
            for(int h = 0; h < i; h++) {
                System.out.print("/\\");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("..");
            }
        }
        System.out.print("|");
        System.out.println();
    }
    // Generate the bottom part of the rocket
    public static void drawBottom(){

    }
    // Generate the line between parts
    public static void drawLine() {
        System.out.print("+");
        for (int j = 0; j < 6; j++) {
            System.out.print("=*");

        } System.out.print("+");
    }

}
