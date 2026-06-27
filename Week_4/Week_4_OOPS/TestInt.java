interface test {
    int square(int x);
}

class Arithmetic implements test {
    public int square(int x) {
        return x * x;
    }
}

public class TestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        System.out.println("Square = " + obj.square(5));
    }
}