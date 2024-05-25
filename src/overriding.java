// Case 1 :-

public class overriding {
    protected Number m1(int i){
        System.out.println("Hiii");
        return 13;
    }
}
class c extends overriding{
    public Float m1(int x){
        System.out.println("Hello");
        return 12f;
    }
}