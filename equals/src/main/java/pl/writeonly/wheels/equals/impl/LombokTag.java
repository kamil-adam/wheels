package pl.writeonly.wheels.equals.impl;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import pl.writeonly.wheels.equals.api.Eqable;

//@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class LombokTag implements Eqable<LombokTag> {
    private String name;
    private int count;

    @Override
    public boolean eq(LombokTag that) {
        return equals(that);
    }

}
