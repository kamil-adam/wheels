package pl.writeonly.wheels.equals.api;

public interface BoilerplateEqable<T extends BoilerplateEqable> extends Eqable<T> {

    default boolean defaultEquals(Object other) {
        return other != null && getClass().equals(other.getClass()) && eq((T) other);
    }
}
