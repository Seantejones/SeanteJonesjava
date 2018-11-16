public class drawBox {



    public static void main(String[] args){
        System.out.println("Draw Boxes");
        drawBox(2, 3, 'a');
        drawBox( 3, 4, 'b');
        drawBox(4, 5, 'c');
        System.out.println("Complete");
    }
    public static void drawBox(int height, int width, char box){
        System.out.println();
        drawTopBottom();
        drawSides();
        drawSides();
        drawTopBottom();

    }



    public static void drawTopBottom(){
        System.out.println("+------+");
    }
    public static void drawSides(){
      System.out.println("|      |");
    }


}
