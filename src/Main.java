import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        List<int[]> data = new ArrayList<>();
        data.add(new int[]{1, 2, 3});
        data.add(new int[]{-10, 5, 7});

        for (int i = 0; i < data.size(); i++) {
            int d = delta(data.get(i)[0], data.get(i)[1], data.get(i)[2]);
            calculateQuadraticFormula(d, data.get(i)[0], data.get(i)[1], data.get(i)[2]);
        }
    }

    protected static int delta(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    private static final void calculateQuadraticFormula(int delta, int a, int b, int c) {
        if (delta < 0) {
            System.out.println("There is no solution for delta < 0: delta = " + delta + " for data: a=" + a + " b=" + b + " c=" + c);
        } else if (delta == 0) {
            double solution = (-b / (2 * a));
            System.out.println("There is one solution for delta = " + delta + " Solution: " + solution +
                    " for data: a=" + a + " b=" + b + " c=" + c);
        } else {
            double firstSolution = (-b - sqrt(delta)) / (2 * a);
            double secondSolution = (-b + sqrt(delta)) / (2 * a);
            System.out.println("There are two solutions for delta = " + delta + " First solution: " + firstSolution +
                    " and Second solution: " + secondSolution + " for data: a=" + a + " b=" + b + " c=" + c);
        }
    }
}

