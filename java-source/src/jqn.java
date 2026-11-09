/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.Map;

public class jqn
extends jqk {
    private final Map<jqp, a> nSE = new HashMap<jqp, a>();
    protected final lbh kAz;
    public final jqt nSF;
    public final jqt nSG;
    public final jqt nSH;
    public final jqt nSI;
    public final jqt nSJ;
    public final jqr nSz;
    public final jqr nSA;
    public final jqr nSK;
    private boolean nuw = true;
    private double nux = 0.05;

    public final void chi() {
        for (jqp jqp2 : this.nSE.keySet()) {
            a a2 = this.nSE.get(jqp2);
            double d2 = a2.dRi();
            if (d2 == 0.0) continue;
            ((jqr)jqp2).h(d2, -1);
        }
    }

    public jqn(lbh lbh2, jqx jqx2, ldv ldv2, lbi<jpk> lbi2, String string, String string2, String string3, short s, short s2, int n, joe[] joeArray) {
        super(jqx2, ldv2, lbi2, string, string2, string3, s, s2, n, joeArray);
        assert (string != null);
        this.kAz = lbh2;
        this.nSF = (jqt)this.ta("BUTTON_0");
        this.nSG = (jqt)this.ta("BUTTON_1");
        this.nSH = (jqt)this.ta("BUTTON_2");
        this.nSI = (jqt)this.ta("BUTTON_3");
        this.nSJ = (jqt)this.ta("BUTTON_4");
        this.nSz = (jqr)this.ta("AXIS_X_0");
        this.nSA = (jqr)this.ta("AXIS_Y_0");
        this.nSK = (jqr)this.ta("AXIS_Z_0");
        this.cc(true);
    }

    public final void g(boolean bl, double d2) {
        this.nuw = bl;
        this.nux = d2;
    }

    @Override
    protected void a(jqp jqp2, int n, int n2, int n3) {
        assert (lda.acc(n3));
        if (jqp2.nSQ == jqp.a.nSU || jqp2.nSQ == jqp.a.nSV || jqp2.nSQ == jqp.a.nSW) {
            if (this.nSE.containsKey(jqp2)) {
                a a2 = this.nSE.get(jqp2);
                a2.fE(n, n3);
            } else {
                a a3 = new a(this, n, n3);
                this.nSE.put(jqp2, a3);
            }
        } else {
            super.a(jqp2, n, n2, n3);
        }
    }

    @Override
    protected void cbg() {
        this.cc(false);
        super.cbg();
    }

    private void cc(boolean bl) {
        assert (lda.yk(bl));
    }

    static /* synthetic */ boolean a(jqn jqn2) {
        return jqn2.nuw;
    }

    static /* synthetic */ double b(jqn jqn2) {
        return jqn2.nux;
    }
}

