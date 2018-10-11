public static void main(String[] args){
    public class drawBox {
        System.out.println("Draw Boxes");
        drawBox();
        drawBox();
        drawBox();
        System.out.println("Complete");
    }
    public static void drawBox(){
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
