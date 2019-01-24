package pl.writeonly.wheels.equals.api;

public interface Eqable<T extends Eqable> {

    boolean eq(T that);

}
