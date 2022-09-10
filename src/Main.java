public class Main {
    public static void main(String[] args) {
        int deposition = 15_000;
        int percentOfDeposit = deposition / 100 * 7;
        int mounth = 1;
        int sumAccumulation = deposition + percentOfDeposit;
        while (sumAccumulation <= 12_006_000) {
            System.out.println(mounth + "й месяц накоплено:" + sumAccumulation);
            sumAccumulation = sumAccumulation + (deposition + percentOfDeposit);
            mounth++;
        }
    }
}


