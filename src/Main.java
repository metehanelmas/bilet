import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, age, isReturn, tarife = 0.1, sum, ageDiscount = 1, roundTripDisc = 1;


        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = input.nextDouble();

        System.out.print("Yaşınız : ");
        age = input.nextInt();

        System.out.println("Tarifenizi seçin:\n1-Tek Yön\n2-Gidiş-Geliş");
        isReturn = input.nextDouble();

        if (km < 0 || age < 0 || isReturn < 0 || isReturn > 2) ;
        System.out.println("Hatalı veri girdiniz !");



        if (age < 12) {
            ageDiscount = 0.5;
        } else if (age >= 12 && age < 24) {
            ageDiscount = 0.9;
        } else if (age > 65) {
            ageDiscount = 0.7;
        }
        if (isReturn == 2) {
            roundTripDisc = 1.6;
        }

        sum = km * tarife * ageDiscount * roundTripDisc;
        System.out.print("Total price: " + sum);


}
    }
