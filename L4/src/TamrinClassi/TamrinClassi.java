package TamrinClassi;

public class TamrinClassi<Name,Family,Age,UserName,Password,Job> {
    private Name myName;
    private Family myFamily;
    private Age myAge;
    private UserName myUser;
    private Password myPassword ;
    private Job myJob;
    public TamrinClassi (Name myName,Family myFamily,Age myAge,UserName myUser,Password myPassword ,Job myJob) {
        this.myName = myName;
        this.myFamily = myFamily;
        this.myAge = myAge;
        this.myUser = myUser;
        this.myPassword = myPassword;
        this.myJob = myJob;
    }
    TamrinClassi(){}
    public Name getMyName() {
        return myName;
    }
    public void setMyName(Name myName) {
        this.myName = myName;
    }
    public Family getMyFamily() {
        return myFamily;
    }
    public void setMyFamily(Family myFamily) {
        this.myFamily = myFamily;
    }
    public Age getMyAge() {
        return myAge;
    }
    public void setMyAge(Age myAge) {
        this.myAge = myAge;
    }
    public UserName getMyUser() {
        return myUser;
    }
    public void setMyUser(UserName myUser) {
        this.myUser = myUser;
    }
    public Password getMyPassword () {
        return myPassword;
    }
    public void setMyPassword (Password myPass) {this.myPassword = myPass;}
    public Job getMyJob() {
        return myJob;
    }
    public void setMyJob (Job myJob) {
        this.myJob = myJob;
    }
}