//Source Code Of My Project

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //A Number Guessing Game In Java
        int gs=0;
        System.out.println("Welcome To the Number Guessing Game !");
        System.out.println("Bot:-I am thinking about a number between (1-5)");
        Random rand=new Random();
        int bs=rand.nextInt(1,6);
        System.out.println(bs);
        System.out.println("You Have 5 chances to Guess the Correct Number ok?");
        int k=5;
        while(k!=0) {
        System.out.println("Enter Your Guess !");
        gs= sc.nextInt();
        if(gs==bs) {
            System.out.println("You Have guessed the value correctly");
            break;
        }
        else{
            System.out.println("You Have "+" "+(k-1) +" "+"turns" );
            k--;
           }
        }
    }
}
