import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Yıl giriniz: ");

        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.print(year +" artık yıldır.");
                }
                else{
                    System.out.print(year +" artık yıl değildir..");
                }
            }
            else{
                System.out.print(year +" artık yıldır.");

            }
        }

        else {
            System.out.print(year +" artık yıl değildir..");

        }


    }
}
