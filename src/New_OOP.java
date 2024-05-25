class person {
    public void takeName(String x){
        System.out.println(x);
    }
}

class students extends person {
    public void takeRollNo(int y){
        System.out.println(y);
    }
}

public class New_OOP {
    public static void main(String[] args) {
        person p1 = new person();
        p1.takeName("Ritesh");

        students s1 = new students();
        s1.takeRollNo(123);
        p1.takeName("Esh");

        person p2 = new students();
        p2.takeName("Rit");
       // p2.takeRollNo(145);

        //students s3 = new person();
        //s3.takeRollNo(999);

    }
}
