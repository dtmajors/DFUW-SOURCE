/*
 * Decompiled with CFR.
 */
public abstract class jfc {
    private bsj mWT;

    public static boolean a(jfc jfc2, jfc jfc3) {
        return jfc2 == jfc3 || jfc2 != null && jfc3 != null && bsk.a(jfc2.mWT, jfc3.mWT);
    }

    public bsj cCs() {
        return this.mWT;
    }

    public cxc bjd() {
        return (cxc)this.mWT;
    }

    public abstract jfc dAp();

    protected jfc(bsj bsj2) {
        this.mWT = bsj2;
    }

    public /* synthetic */ Object clone() {
        return this.dAp();
    }
}

