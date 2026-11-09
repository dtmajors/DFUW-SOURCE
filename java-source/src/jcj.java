/*
 * Decompiled with CFR.
 */
import java.util.Queue;

public class jcj {
    private int aDf = -1;
    private Queue<Integer> mRp = null;
    private jcl bcX = null;
    private abb bdl = abb.bdo;

    public int qS() {
        return this.aDf;
    }

    public int dxy() {
        return this.mRp.isEmpty() ? -1 : this.mRp.peek();
    }

    public jcl xQ() {
        return this.bcX;
    }

    public abb yv() {
        return this.bdl;
    }

    public jcj(int n, Queue<Integer> queue, jcl jcl2, abb abb2) {
        this.aDf = n;
        this.mRp = queue;
        this.bcX = jcl2;
        this.bdl = abb2;
    }

    public void dxz() {
        this.mRp.poll();
    }

    public void dxA() {
    }
}

