package javaabstracts.Arithmetic;

public class Arithmetic implements Test {

    /**
     * overriding method from Test interface
     */

    @Override
    public int square(int n) {
        return n * n;
    }

}
