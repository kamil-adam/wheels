package pl.writeonly.wheels.equals.impl;

import com.google.common.base.MoreObjects;
import pl.writeonly.wheels.equals.api.BoilerplateEqable;

import java.util.Objects;

public class BaroqueTag implements BoilerplateEqable<BaroqueTag> {
    private final String name;
    private final int count;

    public BaroqueTag(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public boolean equals(Object other) {
        return defaultEquals(other);
    }


    @Override
    public boolean eq(BaroqueTag that) {
        return Objects.equals(name, that.name) && Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("count", count)
                .toString();
    }
}
