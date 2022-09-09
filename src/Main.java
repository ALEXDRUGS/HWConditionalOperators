public class Main {
    public static void main(String[] args) {
        int mounth;
        int sumAccumulation = 29_000;
        mounth = 1;
        while (sumAccumulation <= 2_500_000) {
            System.out.println(mounth + "й месяц накоплено: " + sumAccumulation);
            sumAccumulation = sumAccumulation + (29_000 + (sumAccumulation / 100));
            mounth++;
        }
    }
}


