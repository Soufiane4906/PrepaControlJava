package ControlA2;

public interface Comparable<E extends Person> {
    public default boolean isBetterThan(Employee a){
        return false;
    }
}