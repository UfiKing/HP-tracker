package net.hodak.jure;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    //Arrays to store the values of mobs
    // [Name of mob] [Abbreviation] [HP]
    static int nmb = 0;
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
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("Add an enemy(Add), display current enemy's(mob), or go into encounter mode(enc)?");
            input = scanner.nextLine();
            if (input.toLowerCase(Locale.ROOT).equals("add")) {
                add();
            }else if (input.toLowerCase(Locale.ROOT).equals("mob")){
                System.out.println("Displaying current mobs");
                displayMobs();
                System.out.println(" ");
            }else if (input.toLowerCase(Locale.ROOT).equals("enc")){
                encounter();
            }else{
                System.out.println("Sorry I didn't get that.");
            }
            /*for (int i = 0; i < 3; i++) {
                System.out.println(array[i]);
            }
            */

            //System.out.println(nmbOfMobs);
        }
    }

    public static void add(){
        Scanner scanner = new Scanner(System.in);

        int nmbOfRemainingMobs = 0;
        nmbOfRemainingMobs = 10-nmb;
        boolean bool = true;
        if (nmb == 0){
            System.out.println("You can add up to 10 mobs");
        }else{
            System.out.println("You can add " + nmbOfRemainingMobs + " enemy's");
        }
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
            for (int i = 0; i<=2; i++){
                System.out.print(mob1[i] + " ");
            }
        }else if(nmbOfMobs==2){
            for (int i = 0; i<=2; i++){
                System.out.print(mob1[i] + " ");
            }
            System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob2[i] + " ");
            }

        }else if(nmbOfMobs==3){
            for (int i = 0; i<=2; i++){
                System.out.print(mob1[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob2[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob3[i] + " ");
            }

        }else if(nmbOfMobs==4){
            for (int i = 0; i<=2; i++){
                System.out.print(mob1[i] + " ");
            }
            System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob2[i] + " ");
            }
            System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob3[i] + " ");
            }
            System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob4[i] + " ");
            }
        }else if(nmbOfMobs==5){
            for (int i = 0; i<=2; i++){
                System.out.print(mob1[i] + " ");
            }
            System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob2[i] + " ");
            }
            System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob3[i] + " ");
            }
            System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob4[i] + " ");
            }
            System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob5[i] + " ");
            }
        }else if(nmbOfMobs==6){
            for (int i = 0; i<=2; i++){
                System.out.print(mob1[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob2[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob3[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob4[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob5[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob6[i] + " ");
            }
        }else if(nmbOfMobs==7){
            for (int i = 0; i<=2; i++){
                System.out.print(mob1[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob2[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob3[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob4[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob5[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob6[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob7[i] + " ");
            }
        }else if(nmbOfMobs==8){
            for (int i = 0; i<=2; i++){
                System.out.print(mob1[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob2[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob3[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob4[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob5[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob6[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob7[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob8[i] + " ");
            }
        }else if(nmbOfMobs==9){
            for (int i = 0; i<=2; i++){
                System.out.print(mob1[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob2[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob3[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob4[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob5[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob6[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob7[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob8[i] + " ");
            }
            for (int i = 0; i<=2; i++){
                System.out.print(mob9[i] + " ");
            }
        }else if(nmbOfMobs==10){
            for (int i = 0; i<=2; i++){
                System.out.print(mob1[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob2[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob3[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob4[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob5[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob6[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob7[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob8[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob9[i] + " ");
            }System.out.println(" ");
            for (int i = 0; i<=2; i++){
                System.out.print(mob10[i] + " ");
            }
        }




    }

    public static void encounter(){
        System.out.println("Welcome to the encounter mode");
        System.out.println("Which mob would you like to damage?");
        displayMobs();
        System.out.println(" ");
        /*for (int i=0; i<3; i++) {
            if (mob1[i] != null) {
                System.out.print(mob1[i] + " ");
            }
            if (mob2[i] != null) {
                System.out.print(mob2[i] +" ");
            }
            if (mob3[i] != null) {
                System.out.print(mob3[i]+" ");
            }
            if (mob4[i] != null) {
                System.out.print(mob4[i]+" ");
            }
            if (mob5[i] != null) {
                System.out.print(mob5[i]+" ");
            }
            if (mob6[i] != null) {
                System.out.print(mob6[i]+" ");
            }
            if (mob7[i] != null) {
                System.out.print(mob7[i]+" ");
            }
            if (mob8[i] != null) {
                System.out.print(mob8[i]+" ");
            }
            if (mob9[i] != null) {
                System.out.print(mob9[i]+" ");
            }
            if (mob10[i] != null) {
                System.out.print(mob10[i]+" ");
            }
            System.out.println(" ");
        }*/
    }
}