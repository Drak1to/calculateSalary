public class Calculating {
    private static double PI = Math.PI;
    private int a;
    private int b;

    public Calculating(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static double getPI() {
        return PI;
    }

    public static void setPI(double PI) {
        Calculating.PI = PI;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Calculating{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void sum() {
        System.out.println(" Sum = " + (a + b));
    }

    public void multiply() {
        System.out.println(" Multiply = " + (a * b));
    }

    public void divide() {
        System.out.println(" Divide = " + (a / b));
    }

    public void subtract() {
        System.out.println(" Subtract = " + (a - b));
    }

    public void calkurateArrea(int r) {
        System.out.println(" CalkurateArrea = " + (PI * (r * r)));
    }
}





