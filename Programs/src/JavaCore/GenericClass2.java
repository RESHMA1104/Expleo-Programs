package JavaCore;

class Test<T, U, R> {

    T ob1;
    U ob2;
    R ob3;

    Test(T ob1, U ob2, R ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public void print() {
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob3);
    }
}

public class GenericClass2 {

    public static void main(String[] args) {

        Test<String, Integer, Double> obj =
                new Test<String, Integer, Double>("Reshma", 21, 95.5);

        obj.print();

    }

}