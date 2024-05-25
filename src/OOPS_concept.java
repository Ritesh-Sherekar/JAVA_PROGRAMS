class studentNew {
    String name ;
    int age;

    public void studentInfo(String name ){
        System.out.println(name);
    }

    public void studentInfo(int age){
        System.out.println(age);
    }

    public void studentInfo(String name , int age ){
        System.out.println(name);
        System.out.println(age);
    }


}

public class OOPS_concept {
    public static void main(String[] args) {
        studentNew s1 = new studentNew();
//        s1.name = "Ritesh";
//        s1.age = 20;

        s1.studentInfo(19);
        s1.studentInfo("Ritesh" , 19);
        s1.studentInfo("Ritesh");

    }
}
