public class fractionFunct implements IfunctOfOneRealArg {
    private double A;
    private double B;
    private double C;
    private double D;
    private double x;
    private double right;
    private double left;

    public fractionFunct(double a, double b, double c, double d, double left, double right) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.left = left;
        this.right = right;
    }

    public double getRight() {
        return right;
    }

    public double getLeft() {
        return left;
    }

    public double getValue(double x) {
        if((Double.compare(x,left )  < 0) || (Double.compare(x, right) > 0)){
            throw new IllegalArgumentException("x не принадлежит отрезку");
        }
        return (A * x + B) / (C * x + D);
    }
}