// Case 1:-

/* public class overloading {
    public void m1(int i){
        System.out.println("Int");
    }
    public void m1(float i){
        System.out.println("Float");
    }
    public static void main(String[] args) {
        overloading o1 = new overloading();
        o1.m1(12);
        o1.m1(20.8f);
        o1.m1('a'); // Auto Promotional
    }
} */

// Case 2:-

/* public class overloading {
    public void m1(Object o){
        System.out.println("Object");
    }
    public void m1(String x){
        System.out.println("String");
    }

    public static void main(String[] args) {
        overloading o1 = new overloading();
        o1.m1(new Object());
        o1.m1("Ritesh");
        o1.m1(null);   // child get the high preference here String is the child of Object class
    }
} */

// Case 3 :-

/*public class overloading {
    public void m1(String x){
        System.out.println("String Version");
    }
    public void m1(StringBuffer x){
        System.out.println("StringBuffer Version");
    }

    public static void main(String[] args) {
        overloading o1 = new overloading();
        o1.m1("Ritesh");
        o1.m1(new StringBuffer("Ram"));
        o1.m1(null);    // its give the error because both are child class and compiler are not able to choose
                        // who's give higher priority
    }
} */

// Case 4 :-

/* public class overloading {
    public void m1(int i){
        System.out.println("General Version");
    }
    public void m1(int... i){
        System.out.println("Var-arg Version");
    }

    public static void main(String[] args) {
        overloading o1 = new overloading();
        o1.m1(10,20,40);
        o1.m1();
        o1.m1(12); // In this Old concept and New concept are fight , and only Old concept will win in java
    }
} */

// Case 5:-

public class overloading {
    public void m1(int i , float j){
        System.out.println("Int-Float Version");
    }
    public void m1(float i , int j){
        System.out.println("Float-Int Version");
    }

    public static void main(String[] args) {
        overloading o1 = new overloading();
        o1.m1(10,10.4f);
        o1.m1(10.6f,13);
        //o1.m1(10,19); // Both method match so gives compile time error
        //o1.m1(10.9f,10.7f); // Symbol not found error
    }
}