import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void getValuelineFunctTest(){
        double left = -3;
        double right = 2;
        double x = 1;
        double A = -4;
        double B = 2;
        lineFunct a = new lineFunct(A, B, left, right);
        assertEquals(a.getValue(x), -2, 0);
    }

    @Test
    public void getValueSinFunctTest(){
        double left = -3;
        double right = 2;
        double x = 1;
        double A = 8;
        double B = 5;
        sinFunct a = new sinFunct(A, B, left, right);
        assertEquals(a.getValue(x), -7.67, 2);
    }

    @Test
    public void getValuefractionFunctTest(){
        double left = -1;
        double right = 5;
        double x = 4;
        double A = 8;
        double B = 5;
        double C = -4;
        double D = 1;
        fractionFunct a = new fractionFunct(A, B, C, D, left, right);
        assertEquals(a.getValue(x), -2.46, 2);
    }

    @Test
    public void getValueeFunctTest(){
        double left = -1;
        double right = 3;
        double x = 2;
        double A = 8;
        double B = 5;
        eFunct a = new eFunct(A, B, left, right);
        assertEquals(a.getValue(x), 64.112, 3);
    }

    @Test
    public void getValueSumValueTest(){
        double A = 0;
        double B = 5;
        lineFunct a = new lineFunct(A, B, -1, 2);
        SumValue <lineFunct> b = new SumValue<>(-5, 10);
        assertEquals(b.res(a), 15.0, 1);
    }

    @Test
    public void getValueIntegralTest1(){
        double A = 4;
        double B = 1;
        lineFunct a = new lineFunct(A, B, 0, 4);
        Integral <lineFunct> b = new Integral<>(0, 4);
        assertEquals(b.res(a, 0.0001, 1), 35.99993133544922, 4);
    }

    @Test
    public void getValueIntegralTest2(){
        double A = 4;
        double B = 1;
        sinFunct a = new sinFunct(A, B, 0, 4);
        Integral <sinFunct> b = new Integral<>(0, 4);
        assertEquals(b.res(a, 0.0001, 1), 6.614666864518093, 4);
    }

    @Test
    public void getValueIntegralTest3(){
        double A = 1;
        double B = 1;
        double C = 1;
        double D = 1;
        fractionFunct a = new fractionFunct(A, B, C, D,0, 4);
        Integral <fractionFunct> b = new Integral<>(0, 4);
        assertEquals(b.res(a, 0.0001, 1), 6.614666864518093, 4);
    }


}
