/*
 * Decompiled with CFR.
 */
import java.util.Arrays;
import java.util.List;

public class lim<E> {
    private Object[] roz;
    private final int Size;
    private Class<?> roA;

    public lim(int n) {
        this.Size = n;
        this.roz = new Object[n];
    }

    public lim(int n, Class<E> clazz) {
        this.Size = n;
        this.roz = new Object[n];
        this.roA = clazz;
    }

    public lim(E ... EArray) {
        this.Size = EArray.length;
        this.roz = EArray;
        this.roA = EArray.getClass().getComponentType();
    }

    public lim(lim<E> lim2) {
        this.Size = lim2.size();
        this.roz = this.bz(lim2.esx());
        this.roA = lim2.getType();
    }

    private lim(Class<E> clazz, E ... EArray) {
        this.Size = EArray.length;
        this.roz = EArray;
        this.roA = clazz;
    }

    public boolean an(Object object) {
        return object instanceof lim ? Arrays.deepEquals(this.roz, ((lim)object).esx()) : false;
    }

    public Object get(int n) {
        return this.roz[n];
    }

    public Object[] esx() {
        return this.roz;
    }

    public Class<?> getType() {
        return this.roA;
    }

    public boolean e(Object object, int n) {
        if (n < 0 || n >= this.Size) {
            return false;
        }
        if (object != null) {
            try {
                this.roA.cast(object);
            }
            catch (ClassCastException classCastException) {
                return false;
            }
        }
        if (this.ao(object)) {
            return false;
        }
        this.roz[n] = object;
        return true;
    }

    public void setType(Class<E> clazz) {
        this.roA = clazz;
        for (int i = 0; i < this.roz.length; ++i) {
            if (this.e(this.roz[i], i)) continue;
            this.roz[i] = null;
        }
    }

    public int size() {
        return this.Size;
    }

    public lim<E> acT(int n) {
        if (n > this.Size || n < 0) {
            return null;
        }
        List<Object> list = Arrays.asList(this.roz);
        list = list.subList(n, this.Size);
        return new lim<Object>(this.roA, new Object[]{list.toArray()});
    }

    public lim<E> ge(int n, int n2) {
        if (n >= n2 || n < 0 || n2 > this.Size) {
            return null;
        }
        List<Object> list = Arrays.asList(this.roz);
        list = list.subList(n, n2);
        return new lim<Object>(this.roA, new Object[]{list.toArray()});
    }

    public String toString() {
        return super.toString();
    }

    private boolean ao(Object object) {
        if (object instanceof lim) {
            if (!this.equals(object)) {
                return this.ao(((lim)object).esx());
            }
            return true;
        }
        if (object instanceof Object[]) {
            Object[] objectArray = (Object[])object;
            int n = 0;
            while (!this.ao(objectArray[n])) {
                if (++n < objectArray.length) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private Object[] bz(Object[] objectArray) {
        Object[] objectArray2 = new Object[objectArray.length];
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            objectArray2[i] = object instanceof Object[] ? this.bz((Object[])object) : object;
        }
        return objectArray2;
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + Arrays.hashCode(this.roz);
        n2 = 31 * n2 + this.Size;
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        if (!Arrays.equals(this.roz, ((lim)object).roz)) {
            return false;
        }
        return this.Size == ((lim)object).Size;
    }

    public E getValue(int n) {
        return (E)this.roz[n];
    }
}

