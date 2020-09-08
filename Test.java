class Test {
    public static void main(final String[] args) {
        Test3 t = new Test3() {
            @Override
            public void doThing() {
                System.out.println("do thing");
            }
        };
        doInterface(t);
        doInterface(new Test2());
    }

    public static void doInterface(Test3 test1) {
        test1.doThing();
    }
}

class Test2 implements Test3 {
    @Override
    public void doThing() {
        System.out.println("do thing");
    }
}

public interface Test3 {
    void doThing();
}