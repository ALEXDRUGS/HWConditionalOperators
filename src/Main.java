public class Main {
    public static void main(String[] args) {
        int mounth;
        int sumAccumulation = 29_000;
        for (mounth = 1; mounth <= 12; mounth++) {
            System.out.println(mounth + "й месяц накоплено: " + sumAccumulation);
            sumAccumulation += 29_000;
        }
    }
}


