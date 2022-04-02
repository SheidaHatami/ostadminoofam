package Tamrin3;
import Tamrin3.DataTamrin3;
import java.util.ArrayList;
        import java.util.Scanner;

public class MainTamrin3 extends DataTamrin3 {
    public static void main(String[] args) {

        ArrayList<String> scores = new ArrayList<>();
        scores.add("Lesson one's score : 19 ");
        scores.add("Lesson two's score : 17 ");
        scores.add("Lesson three's score : 13 ");
        scores.add("Lesson four's score : 20 ");
        scores.add("Lesson five's score : 16 ");

        System.out.print("Your Name And Your Family Name: ");
        Scanner input = new Scanner(System.in);
        String myName = input.nextLine();
        System.out.print("The Student number : ");
        double MyNum = input.nextDouble();
        System.out.print("Your Father's Name : ");
        String MyFatherName = input.next();

        DataTamrin3<String,Double,String> myScores = new
                DataTamrin3<String,Double,String>(myName,MyNum,MyFatherName);
        myScores.setName(myName);
        myScores.setsNumber(MyNum);
        myScores.setFatherName(MyFatherName);

        for (int i=0 ; i<scores.size(); i++) {
            System.out.println(scores.get(i));}
    }
}