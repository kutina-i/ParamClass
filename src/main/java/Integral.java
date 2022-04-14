public class Integral <T extends IfunctOfOneRealArg>{
    private double right;
    private double left;

    public Integral(double left, double right) {
        this.right = right;
        this.left = left;
    }

    public double res(T funct, double epsilon, double c) {
        if((Double.compare(left,funct.getLeft() )  < 0) || (Double.compare(right,funct.getRight()) > 0)){
            throw new IllegalArgumentException("x не принадлежит отрезку");
        }

        double res = 0.0;
        double n = 2;
        double SL = 0;
        double S;
        double x;
        do {
            double h = (right-left)/n;
            x = left+(c*h);
            S = 0;
            for (int i = 0; i<n-1; i++)
            {
                double F = funct.getValue(x);
                S = S + F;
                x = x+h;
            }
            S = S*h;
            if(!(Math.abs(S-SL)<=epsilon)){
                SL=S;
                n=2*n;
            }else{
                break;
            }
        }while (Math.abs(S-SL)<=epsilon);
        return S;
    }
}