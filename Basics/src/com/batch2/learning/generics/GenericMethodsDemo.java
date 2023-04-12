package com.batch2.learning.generics;

public class GenericMethodsDemo {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10L, 20L));
        System.out.println(add(10.45, 20.67));
        System.out.println(add(10.45F, 20.67F));
        //System.out.println(add(new Sunny(1, "34", 56.67), new Sunny(1, "34", 56.67)));

        displayValue(23);
        displayValue(23.45);
        displayValue(23.67F);
        displayValue(23L);
        displayValue('C');
        displayValue("Suresh");
        displayValue(new Sunny(1, "Sunny", 67.89));
    }

    static <T> void displayValue(T element) {
        System.out.println(element);
    }

    static <T extends Number> T add(T one, T two) {
        if (one.getClass() == Integer.class) {
            // With auto-boxing / unboxing
            return (T) (Integer) ((Integer) one + (Integer) two);
        }
        if (one.getClass() == Long.class) {
            // Without auto-boxing / unboxing
            return (T) Long.valueOf(((Long) one).longValue() +
                    ((Long) two).longValue());
        }
        if (one.getClass() == Double.class) {
            // Without auto-boxing / unboxing
            return (T) Double.valueOf(((Double) one).doubleValue() +
                    ((Double) two).doubleValue());
        }

        if (one.getClass() == Float.class) {
            // Without auto-boxing / unboxing
            return (T) Float.valueOf(((Float) one).floatValue() +
                    ((Float) two).floatValue());
        }

        return null;
    }
}
