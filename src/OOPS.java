class student{
    String name;
    int marks;

    public void PrintName(){
        System.out.println(this.name);
    }

    public void PrintMarks() {
        System.out.println(this.marks);
    }

    public void GetName(String n){
        this.name = n;
        System.out.println(this.name);
    }

    public void GetMarks(int m){
        this.marks = m;
        System.out.println(this.marks);
    }

    student(String name , int marks){
        this.name = name ;
        this.marks = marks ;
        System.out.println(this.name);
        System.out.println(this.marks);
    }

}


public class OOPS {
    public static void main(String[] args) {
        student student1 = new student("Ritesh" , 99);
//        student1.name = "Ritesh";
//        student1.marks = 98;

//        student1.PrintName();
//        student1.PrintMarks();

        student student2 = new student("Eshwari" , 100);
//        student2.name = "Eshwari";
//        student2.marks = 100;

//        student2.PrintName();
//        student2.PrintMarks();

//        student1.GetMarks(99);
//        student2.GetMarks(100);
    }
}
























