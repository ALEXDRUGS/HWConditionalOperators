public class Main {
    public static void main(String[] args) {
        int num = 1;
        int num1 = 2;
        int num2 = 2;
        int sum = num1 * num;
        for (num = 1; num <= 10; num++) {
            System.out.println("2 * " + num + " = " + sum);
            sum = num1 * num2;
            num2++;
        }
    }
}


