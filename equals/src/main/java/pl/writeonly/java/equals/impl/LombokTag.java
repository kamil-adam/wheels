package pl.writeonly.java.equals.impl;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import pl.writeonly.java.equals.api.Eqable;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class LombokTag implements Eqable<LombokTag> {
    private final String name;
    private final int count;

    @Override
    public boolean eq(LombokTag that) {
        return equals(that);
    }
}
