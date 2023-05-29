public class Main {
    public static void main(String[] args) {
        int rows = 5;
        System.out.println("------------");
        patternSquare(rows);
        System.out.println("------------");
        increasingTriangle(rows);
        System.out.println("------------");
        decreasingTriangle(rows);
        System.out.println("------------");
        printRightSidedIncreasingTriangle(rows);
        System.out.println("------------");
        printRightSidedDecreasingTriangle(rows);
        System.out.println("------------");
        printHillPattern(5);
        System.out.println("------------");
        printReverseHill(5);
        System.out.println("------------");

    }
    public static void patternSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void increasingTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void decreasingTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRightSidedIncreasingTriangle(int n) {
        for (int i = 0; i < n; i++) {
            //decreasing triangle
            for (int j = i; j < n ; j++) {
                System.out.print("  ");
            }
            //increasing triangle
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRightSidedDecreasingTriangle(int n) {
        for (int i = 0; i < n; i++) {
            //increasing triangle
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            //decreasing triangle
            for (int j = i; j < n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printHillPattern(int n) {
        for (int i = 0; i < n; i++) {
            //decreasing triangle
            for (int j = i; j <= n ; j++) {
                System.out.print("  ");
            }
            //increasing triangle
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            //increasing triangle
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printReverseHill(int n) {
        for (int i = 0; i < n; i++) {
            //decreasing triangle
            for (int j = 0; j <= i ; j++) {
                System.out.print("  ");
            }
            //increasing triangle
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            //increasing triangle
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
