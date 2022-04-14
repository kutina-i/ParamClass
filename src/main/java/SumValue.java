public class SumValue <T extends IfunctOfOneRealArg> implements IfunctionalOneArg<T>{
    private double right;
    private double left;

    public SumValue(double right, double left) {
        this.right = right;
        this.left = left;
    }

    public double res(T funct){
        if((Double.compare(left,funct.getLeft() )  < 0) || (Double.compare(right, funct.getRight()) > 0)){
            throw new IllegalArgumentException("x не принадлежит отрезку");
        }
        return funct.getValue(funct.getLeft())+funct.getValue((funct.getLeft() + funct.getRight())/2) + funct.getValue(funct.getRight());
    }
}
