public class sinFunct implements IfunctOfOneRealArg {
    private double A;
    private double B;
    private double x;
    private double right;
    private double left;

    public sinFunct(double a, double b, double left, double right) {
        this.A = a;
        this.B = b;
        this.left = left;
        this.right = right;
    }

    public double getRight(){
        return right;
    }

    public double getLeft(){
        return left;
    }

    public double getValue(double x){
        if((Double.compare(x,left )  < 0) || (Double.compare(x, right) > 0)){
            throw new IllegalArgumentException("x не принадлежит отрезку");
        }
        return  A * Math.sin(B * x);
    }

}
