/*
 * Decompiled with CFR.
 */
import java.io.Serializable;

public class lgt
implements Serializable {
    khd[] rmO;
    private int size = 0;
    private float rmP = 0.5f;

    public lgt() {
        this.rmO = new khd[this.size];
    }

    public lgt(int n) {
        this.rmO = new khd[n];
    }

    public void no(float f) {
        this.rmP = f;
    }

    public void ensureCapacity(int n) {
        int n2 = this.rmO.length;
        if (n > n2) {
            khd[] khdArray = this.rmO;
            int n3 = n2 * 3 / 2 + 1;
            if (n3 < n) {
                n3 = n;
            }
            this.rmO = new khd[n3];
            System.arraycopy(khdArray, 0, this.rmO, 0, this.size);
        }
    }

    public int size() {
        return this.size;
    }

    public void trimToSize() {
        int n = this.rmO.length;
        if (this.size < n) {
            khd[] khdArray = this.rmO;
            this.rmO = new khd[this.size];
            System.arraycopy(khdArray, 0, this.rmO, 0, this.size);
        }
    }

    public boolean e(khd khd2) {
        this.ensureCapacity(this.size + 1);
        this.rmO[this.size++] = khd2;
        return true;
    }

    public khd acJ(int n) {
        this.acK(n);
        return this.rmO[n];
    }

    public Object remove(int n) {
        this.acK(n);
        khd khd2 = this.rmO[n];
        int n2 = this.size - n - 1;
        if (n2 > 0) {
            System.arraycopy(this.rmO, n + 1, this.rmO, n, n2);
        }
        this.rmO[--this.size] = null;
        return khd2;
    }

    public void clear() {
        for (int i = 0; i < this.size; ++i) {
            this.rmO[i] = null;
        }
        this.size = 0;
    }

    public khd[] erG() {
        khd[] khdArray = new khd[this.size];
        System.arraycopy(this.rmO, 0, khdArray, 0, this.size);
        return khdArray;
    }

    private void acK(int n) {
        if (n >= this.size || n < 0) {
            throw new IndexOutOfBoundsException("Index: " + n + ", Size: " + this.size);
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
}

