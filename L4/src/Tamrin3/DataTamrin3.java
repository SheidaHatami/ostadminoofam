package Tamrin3;

public class DataTamrin3<Name,StudentNumber,FatherName> {
    private Name name;
    private StudentNumber studentNumber;
    private FatherName fatherName;

    public DataTamrin3(Name name, StudentNumber studentNumber, FatherName fatherName) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.fatherName = fatherName;
    }

    DataTamrin3(){}
    public Name getName() {return name;}
    public void setName (Name name) {this.name = name;}

    public StudentNumber getsNumber() {return studentNumber;}
    public void setsNumber (StudentNumber sNumber) {this.studentNumber = studentNumber;}

    public FatherName getFatherName() {return fatherName;}
    public void setFatherName (FatherName fatherName) {this.fatherName = fatherName;}
}