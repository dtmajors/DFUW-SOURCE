/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class jcb {
    public Set<jcz> mQp = lcn.emx();
    public Set<jbx> mQq = lcn.emx();
    public boolean mQr;

    public jcb dwS() {
        jcb jcb2 = new jcb();
        jcb2.a(this);
        return jcb2;
    }

    public void a(jcb jcb2) {
        this.mQp.clear();
        this.mQp.addAll(jcb2.mQp);
        this.mQq.clear();
        this.mQq.addAll(jcb2.mQq);
        this.mQr = jcb2.mQr;
    }

    public /* synthetic */ Object clone() {
        return this.dwS();
    }
}

