package pl.writeonly.java.equals.api;

public interface Eqable<T extends Eqable> {

    boolean eq(T that);

}
