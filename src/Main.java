public class Main {
    public static void main(String[] args) {
        int numSubsequence;
        numSubsequence = 1;
        while (numSubsequence <= 10) {
            System.out.print(numSubsequence + " ");
            numSubsequence++;
        }
        System.out.println();
        for (numSubsequence = 10; numSubsequence >0; numSubsequence -= 1) {
            System.out.print(numSubsequence + " ");
        }
    }
}


