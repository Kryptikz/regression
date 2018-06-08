public class RegressionTest {
    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            double[] a= new double[10];
            double[] b= new double[10];
            for(int i2=0;i2<a.length;i2++) {
                a[i2]=Math.random()*100;
                b[i2]=Math.random()*100;
            }
            Calculate.LinearRegression(a, b);
        }
    }
}