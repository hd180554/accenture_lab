class MathOperation {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperation math = new MathOperation();

        System.out.println("Sum of 2 integers: " + math.add(2, 3));
        System.out.println("Sum of 3 integers: " + math.add(2, 3, 4));
        System.out.println("Sum of 2 doubles: " + math.add(2.5, 3.5));
    }
}
