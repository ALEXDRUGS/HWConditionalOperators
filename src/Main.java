public class Main {
    public static void main(String[] args) {
        int population = 12_000_000;
        int partPopulation = 1_000;
        int fertility = 17 * (population / partPopulation);
        int mortality = 8 * (population / partPopulation);
        int growthToYear = (fertility - mortality);
        int sumGrowth = population + growthToYear;
        int year;
        for (year = 1; year <= 10; year++) {
            System.out.println(year + "й год прирост населения: " + sumGrowth);
            sumGrowth = sumGrowth + growthToYear;
        }
    }
}


