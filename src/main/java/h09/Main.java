package h09;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * Each of the lines in this method should pass through the compiler without error or warning.
     */
    static void shouldWork() {
        /*
        final Traits<Number, Number, Number> t1 = new Traits<>(
            Integer.class::isInstance,
            Object::hashCode,
            (number, o) -> number.intValue() * o.hashCode(),
            12.2
        );
        final Traits<Integer, Integer, Integer> t2 = new Traits<>(
            integer -> integer > 0,
            integer -> integer + 1,
            (i1, i2) -> i1 * i2,
            0
        );
        final Traits<Integer, Integer, Integer> t3 = new Traits<>(
            (Object o) -> o.hashCode() > 1255477819,
            integer -> integer + 1,
            (i1, i2) -> i1 * i2,
            0
        );
        final Traits<Integer, Integer, Integer> t4 = new Traits<>(
            integer -> integer > 0,
            (Object o) -> o.hashCode(),
            (i1, i2) -> i1 * i2,
            0
        );
        final Traits<Integer, Object, Integer> t5 = new Traits<>(
            integer -> integer > 0,
            integer -> 52,
            (i, o) -> i * o.hashCode(),
            0
        );
        final Traits<Integer, Object, Integer> t6 = new Traits<>(
            integer -> integer > 0,
            integer -> "Test",
            (i, o) -> i * o.hashCode(),
            0
        );
        final Traits<Integer, Integer, Integer> t7 = new Traits<Integer, Integer, Integer>(
            integer -> integer > 0,
            integer -> 52,
            (Integer i, Object o) -> 2 * o.hashCode(),
            0
        );
        final Traits<Integer, Integer, Integer> t8 = new Traits<Integer, Integer, Integer>(
            integer -> integer > 0,
            integer -> 52,
            (Integer i, Number n) -> 2 * n.intValue(),
            0
        );
        */
    }

    /**
     * Every single line of this method should cause a compiler error. Make sure that this
     * requirement is met by commenting each line in this method individually, and making sure
     * that the code is no longer accepted by the compiler.
     */
    static void shouldNotWork() {
        /*
        final Traits<Number, Number, Number> t1 = new Traits<>(
            (Integer i) -> i.compareTo(5) > 0,
            Object::hashCode,
            (number, o) -> number.intValue() * o.hashCode(),
            12.2
        );
        final Traits<Number, Number, Number> t2 = new Traits<>(
            Integer.class::isInstance,
            (Double d) -> 5,
            (number, o) -> number.intValue() * o.hashCode(),
            12.2
        );
        final Traits<Number, Number, Number> t3 = new Traits<>(
            Integer.class::isInstance,
            number -> new Object(),
            (number, o) -> number.intValue() * o.hashCode(),
            12.2
        );
        final Traits<Number, Number, Number> t4 = new Traits<>(
            Integer.class::isInstance,
            (Double d) -> 5,
            (Number n, Integer i) -> n.intValue() * i,
            12.2
        );
        final Traits<Number, Number, Number> t5 = new Traits<>(
            Integer.class::isInstance,
            number -> number.intValue() * 10,
            (Object o, Number number) -> o.hashCode() * number.doubleValue(),
            12.2
        );
        */
    }
}
