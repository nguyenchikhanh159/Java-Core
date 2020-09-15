package stackjava.com;

public class GenericEX<T> {
    T obj;

    GenericEX(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}

class MainGeneric{
    public static void main(String args[]) {
        GenericEX<Integer> objgeneric1 = new GenericEX<Integer>(5);
        System.out.println(objgeneric1.getObject());

        GenericEX<String> objgeneric2 = new GenericEX<String>("ExampleGeneric");
        System.out.println(objgeneric2.getObject());

    }
}