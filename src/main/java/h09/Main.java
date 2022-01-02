package h09;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*
        final Traits<Number, Number, Number> traits = new Traits<Number, Number, Number>(
            Integer.class::isInstance,
            Object::hashCode,
            (number, o) -> number.intValue() * o.hashCode(),
            12.2
        );
         */
    }
}
