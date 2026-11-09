/*
 * Decompiled with CFR.
 */
public class jby {
    public boolean mQi = true;

    public void a(jby jby2) {
        this.mQi = jby2.mQi;
    }

    public jby dwR() {
        jby jby2 = new jby();
        jby2.a(this);
        return jby2;
    }

    public /* synthetic */ Object clone() {
        return this.dwR();
    }
}

