public class laba1 {
    public static void main(String[] args) {
        int[] c = new int[16];
        int a = 16;
        for (int i = 0; i < 16; i++) {
            c[i] = a;
            a = a - 1;
        }
        double[] x = new double[16];
        for (int i = 0; i < 15; i++) {
            double j = (Math.random() - 0.5) * 30;
            if (j < -9.0) {
                j = j + 6.0;
            }
            x[i] = j;
        }
        double[][] y = new double[16][16];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (c[i] == 12) {
                    y[i][j] = Math.asin(Math.pow(Math.exp(1), Math.cbrt(Math.pow(Math.sin(x[j]), 2) * -1)));
                }
                if (c[i] == 3 | c[i] == 7 | c[i] == 11 | c[i] == 13 | c[i] == 16 | c[i] == 14 | c[i] == 15) {
                    y[i][j] = Math.atan(Math.pow(Math.exp(1), Math.cbrt((Math.abs(x[j]) + 1) * -1 / Math.abs(x[j]))));
                }
                if (c[i] == 2 | c[i] == 4 | c[i] == 5 | c[i] == 6 | c[i] == 8 | c[i] == 9 | c[i] == 10 | c[i] == 12) {
                    y[i][j] = Math.tan(Math.asin(Math.pow(Math.exp(1), Math.cbrt((Math.abs(x[j])) * -1))));
                }
                System.out.print(" " + (Math.ceil(y[i][j] * 100000) / 100000));
            }
            System.out.println();
        }

    }
}