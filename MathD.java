class MathUtility {
    // Static method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Static method for multiplication
    public static long multiply(int a, int b) {
        return (long) a * b;
    }

    // Static method for division (returns a double for precision)
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
        return a / b;
    }
}
public class MathD {
  public static void main(String[] args) {
   System.out.println(MathUtility.add(10 ,20));
   System.out.println(MathUtility.subtract(50 ,20));
   System.out.println(MathUtility.multiply(10 ,20));
   System.out.println(MathUtility.divide(100 ,20));
  }  
}
