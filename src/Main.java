public class Main {
    public static void main(String[] args) {
        int clientDeviseYear = 2015;
        int clientOS = 1;
        int andr = 0;
        int ios = 1;
        if (clientDeviseYear < 2015 && clientOS == andr){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }if (clientDeviseYear >= 2015 && clientOS == andr){
            System.out.println("Установите приложение для Android по ссылке");}
        else if (clientDeviseYear < 2015 && clientOS == ios){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }if (clientDeviseYear >= 2015 && clientOS == ios){
            System.out.println("Установите приложение для iOS по ссылке");}
        }
    }



