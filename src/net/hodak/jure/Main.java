package net.hodak.jure;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    //Arrays to store the values of mobs
    // [Name of mob] [Abreviation] [HP]
    static int nmbOfMobs;
    static String[] array = new String[3];
    static String[] mob1 = new String[3];
    static String[] mob2 = new String[3];
    static String[] mob3 = new String[3];
    static String[] mob4 = new String[3];
    static String[] mob5 = new String[3];
    static String[] mob6 = new String[3];
    static String[] mob7 = new String[3];
    static String[] mob8 = new String[3];
    static String[] mob9 = new String[3];
    static String[] mob10 = new String[3];
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Would you like to add a mob?");
        input = scanner.nextLine();
        if (input.toLowerCase(Locale.ROOT).equals("yes")){
            System.out.println("You can add up to 10 mobs");
            add();
        }else{
            System.out.println("Okay");
            System.out.println("Shutting down");
        }
        for (int i = 0; i<3 ;i++){
            System.out.println(array[i]);

        }
        System.out.println("Displaying current mobs");
        displayMobs();
        System.out.println(nmbOfMobs);
    }

    public static void add(){
        Scanner scanner = new Scanner(System.in);
        int nmb = 0;
        boolean bool = true;
        while (bool){
            System.out.println("Enter name of mob (ex. Zombie1)");
            String input = scanner.nextLine();
            input = input.toLowerCase(Locale.ROOT);
            array[0] = input;
            System.out.println(array[0]);
            System.out.println("enter abbreviation (ex. zmb1)");
            input = scanner.nextLine();
            array[1] = input.toLowerCase(Locale.ROOT);
            System.out.println("Enter HP of the mob (ex. 52)");
            input = scanner.nextLine();
            array[2] = input;
            nmb++;
            nmbOfMobs++;
            switch (nmb) {
                case 1 -> System.arraycopy(array, 0, mob1, 0, 3);
                case 2 -> System.arraycopy(array, 0, mob2, 0, 3);
                case 3 -> System.arraycopy(array, 0, mob3, 0, 3);
                case 4 -> System.arraycopy(array, 0, mob4, 0, 3);
                case 5 -> System.arraycopy(array, 0, mob5, 0, 3);
                case 6 -> System.arraycopy(array, 0, mob6, 0, 3);
                case 7 -> System.arraycopy(array, 0, mob7, 0, 3);
                case 8 -> System.arraycopy(array, 0, mob8, 0, 3);
                case 9 -> System.arraycopy(array, 0, mob9, 0, 3);
                case 10 -> System.arraycopy(array, 0, mob10, 0, 3);
                case 11 -> {
                    System.out.println("Oh no! You've ran out of space! the limit is 10 mobs");
                    bool = false;
                }
            }
            if (nmb == 11){
                break;
            }
            System.out.println("Would you like to add another mob?");
            System.out.println("yes or no?");
            input = scanner.nextLine();
            input = input.toLowerCase(Locale.ROOT);
            if (input.equals("no")){
                bool = false;
            }

        }


    }


    public static void displayMobs(){
        if (nmbOfMobs == 1){
            for (int i = 0; i<=3; i++){
                System.out.print(mob1[i] + " ");
            }
        }else if(nmbOfMobs==2){
            for (int i = 0; i<=3; i++){
                System.out.print(mob1[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob2[i] + " ");
            }

        }else if(nmbOfMobs==3){
            for (int i = 0; i<=3; i++){
                System.out.print(mob1[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob2[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob3[i] + " ");
            }

        }else if(nmbOfMobs==4){
            for (int i = 0; i<=3; i++){
                System.out.print(mob1[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob2[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob3[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob4[i] + " ");
            }
        }else if(nmbOfMobs==5){
            for (int i = 0; i<=3; i++){
                System.out.print(mob1[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob2[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob3[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob4[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob5[i] + " ");
            }
        }else if(nmbOfMobs==6){
            for (int i = 0; i<=3; i++){
                System.out.print(mob1[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob2[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob3[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob4[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob5[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob6[i] + " ");
            }
        }else if(nmbOfMobs==7){
            for (int i = 0; i<=3; i++){
                System.out.print(mob1[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob2[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob3[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob4[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob5[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob6[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob7[i] + " ");
            }
        }else if(nmbOfMobs==8){
            for (int i = 0; i<=3; i++){
                System.out.print(mob1[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob2[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob3[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob4[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob5[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob6[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob7[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob8[i] + " ");
            }
        }else if(nmbOfMobs==9){
            for (int i = 0; i<=3; i++){
                System.out.print(mob1[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob2[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob3[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob4[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob5[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob6[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob7[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob8[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob9[i] + " ");
            }
        }else if(nmbOfMobs==10){
            for (int i = 0; i<=3; i++){
                System.out.print(mob1[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob2[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob3[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob4[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob5[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob6[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob7[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob8[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob9[i] + " ");
            }
            for (int i = 0; i<=3; i++){
                System.out.print(mob10[i] + " ");
            }
        }




    }
}