public class LabTime {
    public static void main(String[] args) {
        double getresult = lab(1,2,3);
        System.out.println(getresult);
        double getresult2 = threevalues(1, 2, 3);
        System.out.println(getresult2);


    }
    public static double lab(int x1, int x2, int x3){
        double min = Math.min(Math.min(x1, x2),x3);
        return min;
    }

   public static double threevalues(int x1, int x2, int x3){
        double max = Math.max(Math.max(x1, x2),x3);
        double min = Math.min(Math.min(x1, x2),x3);
        double add = max + min;
        double sqrt = Math.sqrt (add);
        return sqrt;
   }
}
