/*
 * Decompiled with CFR.
 */
public class hrg<E extends Enum<E>>
extends hre<E, String> {
    public hrg(Class<E> clazz) {
        super(clazz.getEnumConstants());
    }

    @Override
    public String a(E e2, int n) {
        assert (n == 0);
        return ((Enum)e2).name();
    }
}

