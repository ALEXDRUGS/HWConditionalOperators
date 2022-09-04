public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int min = 20;
        int i = 40; //интервал расстояния
        int day = 1;
        int sum = deliveryDistance / i;
        if (deliveryDistance <= min){
            System.out.println("Потребуется дней: " + day);}
        else if (deliveryDistance % i <= min){
            System.out.println("Потребуется дней: " + (sum + day));}
        else if (deliveryDistance % i > min){
            System.out.println("Потребуется дней: " + (sum + (day + day)));}
    }
}

