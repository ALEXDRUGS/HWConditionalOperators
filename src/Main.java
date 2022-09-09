public class Main {
    public static void main(String[] args) {
        int year;
        for (year = 1904; year <= 2096; year++) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Високосный год: " + year);
            }
        }
    }
}


