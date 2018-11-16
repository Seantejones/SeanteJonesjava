public class ThreeSquares {
    public static void main(String[] args) {
        drawSquare(3, 4, '*');
        drawSquare(4,5, '&');
        drawSquare(5, 6, '$');
    }

    public static void drawSquare(int height, int width, char character) {
        for (int i = 0; i < height; i++) {
            System.out.print(character);
            for (int j = 0; j < width; j++) {
                System.out.print(character);

            }
            System.out.println();
        }
    }
}