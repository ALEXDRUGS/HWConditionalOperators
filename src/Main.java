public class Main {
    public static void main(String[] args) {
        int deposition = 15_000;
        int percentOfDeposit = deposition / 100 * 7;
        int mounth = 1;
        int sumAccumulation = deposition + percentOfDeposit;
        int sumAllAccumulation = sumAccumulation / 100 * 7 + sumAccumulation;
        while (sumAllAccumulation <= 12_039_000) {
            if (mounth % 6 == 0) {
                System.out.println(mounth + "й месяц накоплено:" + sumAllAccumulation);
            }
            sumAllAccumulation += (deposition + percentOfDeposit);
            mounth++;
        }
    }
}


