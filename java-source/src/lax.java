/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class lax<E>
implements lbe<E> {
    private ArrayList<E> quP = new ArrayList();
    private int quQ = 0;
    private int fDE = 0;

    public lax() {
        this(0, 0);
    }

    public lax(int n, int n2) {
        this.resize(n, n2);
    }

    public lax(E[][] EArray) {
        this(EArray.length, EArray[0].length);
        for (int i = 0; i < this.fDE; ++i) {
            for (int j = 0; j < this.quQ; ++j) {
                this.a(i, j, EArray[i][j]);
            }
        }
    }

    @Override
    public final int getRowCount() {
        return this.fDE;
    }

    @Override
    public final int cst() {
        return this.quQ;
    }

    @Override
    public final void resize(int n, int n2) {
        assert (n >= 0);
        assert (n2 >= 0);
        if (n != this.fDE || n2 != this.quQ) {
            int n3;
            int n4 = n * n2;
            ArrayList<E> arrayList = new ArrayList<E>(n4);
            for (n3 = 0; n3 < n4; ++n3) {
                arrayList.add(null);
            }
            n3 = Math.min(n, this.fDE);
            int n5 = Math.min(n2, this.quQ);
            for (int i = 0; i < n3; ++i) {
                for (int j = 0; j < n5; ++j) {
                    E e2 = this.quP.get(i * this.quQ + j);
                    arrayList.set(i * n2 + j, e2);
                }
            }
            this.quP = arrayList;
            this.fDE = n;
            this.quQ = n2;
        }
    }

    @Override
    public final E fM(int n, int n2) {
        assert (n >= 0 && n < this.fDE);
        assert (n2 >= 0 && n2 < this.quQ);
        return this.quP.get(n * this.quQ + n2);
    }

    @Override
    public final void a(int n, int n2, E e2) {
        assert (n >= 0 && n < this.fDE);
        assert (n2 >= 0 && n2 < this.quQ);
        this.quP.set(n * this.quQ + n2, e2);
    }
}

