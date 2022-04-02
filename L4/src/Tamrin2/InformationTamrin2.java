package Tamrin2;

public class InformationTamrin2 <User1,User2,User3> implements Cloneable{
    private User1 data1;
    private User2 data2;
    private User3 data3;

    public User1 getData() {return data1;}
    public void setData(User1 data) {this.data1 = data1;}

    public User2 getData2() {return data2;}
    public void setData2(User2 data2) {this.data2 = data2;}

    public User3 getData3() {return data3;}
    public void setData3(User3 data3) {this.data3 = data3;}

    InformationTamrin2(){}

    public InformationTamrin2(User1 data1,User2 data2,User3 data3) {this.data1 = data1;}

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}