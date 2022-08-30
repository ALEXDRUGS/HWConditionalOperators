public class Main {
    public static void main(String[] args) {
        int passenger = 10;
        if (passenger < 60) {System.out.println("Есть сидячие и стоячие места.");}
        if (passenger >= 60 && passenger< 102) {System.out.println("Есть стоячие места.");}
        if (passenger >= 102) {System.out.println("Мест нет.");}
    }
}