public class Main {
    public static void main(String[] args) {
        int interval;
        int date = 2096;
        int min = date - 200;
        int max = date + 100;
        for (interval = min; interval <= max; interval += 79)
            System.out.println(interval);
    }
}


