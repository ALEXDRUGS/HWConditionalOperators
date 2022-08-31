public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >=2 && age <= 6) {System.out.println("Если возраст " + age + " лет, он ходит в детский сад.");}
        if (age >= 7 && age <= 18) {System.out.println("Если возраст " + age + " лет, он ходит в школу.");}
        if (age > 18 && age <= 24) {System.out.println("Если возраст " + age + " лет, он ходит в университет.");}
        if (age > 24) {System.out.println("Если возраст " + age + " лет, он работает.");}
    }
}