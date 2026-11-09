/*
 * Decompiled with CFR.
 */
public class lfv
extends lfu {
    private final lfu rkF;

    public lfv(lfu lfu2) {
        this.rkF = lfu2;
    }

    @Override
    protected Object b(String string, Object object, Class<?> clazz) {
        try {
            return this.rkF.b(string, object, clazz);
        }
        catch (Throwable throwable) {
            Out.c(throwable);
            return null;
        }
    }

    @Override
    protected lfu zD(String string) {
        try {
            return this.rkF.zD(string);
        }
        catch (Throwable throwable) {
            Out.c(throwable);
            return this;
        }
    }

    @Override
    protected boolean eqC() {
        return this.rkF.eqC();
    }
}

