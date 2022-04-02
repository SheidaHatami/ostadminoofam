package TamrinClassi;

public class MainTamtinClassi extends TamrinClassi {
    public static void main(String[] args) {
        TamrinClassi<String,String,Integer,String,String,String>
                information =
                new TamrinClassi<String,String,Integer,String,String,String>
                        ("Sheida","Hatami",19,"Sheid-19","400shied","Student");
        System.out.println();
        System.out.println(information.getMyName());
        System.out.println(information.getMyFamily());
        System.out.println(information.getMyAge());
        System.out.println(information.getMyUser());
        System.out.println(information.getMyPassword());
        System.out.println(information.getMyJob());
    }
}