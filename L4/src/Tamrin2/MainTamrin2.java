package Tamrin2;

import java.util.Scanner;
public class MainTamrin2 extends InformationTamrin2 {

    public static void main(String[] args) {

        System.out.print("Enter your full name : ");
        Scanner input = new Scanner(System.in);
        String myName = input.nextLine();
        System.out.print("Enter your E-mail : ");
        String myMail = input.nextLine();
        System.out.print("Enter your age : ");
        int myAge = input.nextInt();
        InformationTamrin2<String,String,Integer> user_data =
                new InformationTamrin2<String,String,Integer>(myName,myMail,myAge);
        InformationTamrin2 a1 = null;
        InformationTamrin2 a2 = null;
        InformationTamrin2 a3 = null;

        try {
            a1 = (InformationTamrin2) user_data.clone();
            a2 = (InformationTamrin2) user_data.clone();
            a3 = (InformationTamrin2) user_data.clone();
        }
        catch (CloneNotSupportedException e){
            System.err.println("ERROR!Not Supported!");
        }
        if (!user_data.equals(a1)||!user_data.equals(a2)||!user_data.equals(a3)){
            System.out.println(user_data);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
        }
    }
}
