package Tamrin1;

public class MapTamrin1 {
    private String FullName;
    private int StudentNumber;
    private double AvgScore;

    protected MapTamrin1(String FullName, int StudentNumber, double AvgScore) {
        this.FullName = FullName;
        this.StudentNumber = StudentNumber;
        this.AvgScore = AvgScore;
    }

    public MapTamrin1() {}

    public String getFullName() {return FullName;}
    public void setFullName(String fullName) {FullName = fullName;}

    public double getStudentNumber() {return StudentNumber;}
    public void setStudentNumber(int studentNumber) {StudentNumber = studentNumber;}

    public double getAvgScore() {return AvgScore;}
    public void setAvgScore(double avgScore) {AvgScore = avgScore;}
}