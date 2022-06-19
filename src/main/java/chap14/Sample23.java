package chap14;

public class Sample23<T> {


    // final instance method
    @SafeVarargs
    public final void safe(T... toAdd){}

    // static method
    @SafeVarargs
    public static void safe(int... toAdd){}


    // private instance method

    @SafeVarargs
    private void safe2(T... toAdd){}
}
