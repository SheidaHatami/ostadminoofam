package Tamrin1;

import Tamrin1.MapTamrin1;
import java.util.HashMap;
        import java.util.Scanner;

public class MainTamrin1 extends MapTamrin1 {
    public MainTamrin1 (String FullName, int StudentNumber, double AvgScore) {
        super(FullName, StudentNumber, AvgScore);
    }
    public static void main(String[] args) {
        MapTamrin1 student = new MapTamrin1();
        System.out.print("Naam Daneshjoo:");
        Scanner input = new Scanner(System.in);
        String FullName = input.nextLine();
        System.out.print("Shomare Daneshjoo:");
        int StudentNumber = input.nextInt();
        System.out.print("Moadel Kol Daneshjo:");
        double AvgScore = Double.parseDouble(input.next());
        student.setStudentNumber(StudentNumber);
        student.setAvgScore(AvgScore);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        HashMap<String,Double> map2 = new HashMap<String,Double>();
        map.put(FullName,StudentNumber);
        map2.put(FullName, AvgScore);
        System.out.println("Naam Daneshjoo:"+ map.keySet());
        System.out.println("Shomare Daneshjoo:"+map.values());
        System.out.println("Moadel Kol:"+map2.values());
    }
}