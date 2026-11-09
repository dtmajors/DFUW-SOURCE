/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.Map;

public class joy {
    protected static final joi nHy = joi.nHV;
    private final Map<jov, jor> nKU = new HashMap<jov, jor>();
    private final Map<jou, joq> nKV = new HashMap<jou, joq>();
    public final lbi<jpc> nKW = new lbi<jpc>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ joy nKX;
        {
            this.nKX = joy2;
        }

        public void a(jpc jpc2) {
            if (jpc2 instanceof jpe) {
                joy.a(this.nKX, (jpe)jpc2);
            } else if (jpc2 instanceof jpd) {
                joy.a(this.nKX, (jpd)jpc2);
            } else if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((jpc)object);
        }

        static {
            $assertionsDisabled = !joy.class.desiredAssertionStatus();
        }
    };
    public final jom kzI = new jom(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ joy nKX;
        {
            this.nKX = joy2;
        }

        public final void a(boolean bl, jov jov2, jor jor2) {
            if (!$assertionsDisabled && jov2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && jor2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && joy.a(this.nKX).get(jov2) != (bl ? null : jor2)) {
                throw new AssertionError();
            }
            if (bl) {
                joy.a(this.nKX).put(jov2, jor2);
            } else {
                joy.a(this.nKX).remove(jov2);
            }
        }

        public final void a(boolean bl, jou jou2, joq joq2) {
            if (!$assertionsDisabled && jou2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && joq2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && joy.b(this.nKX).get(jou2) != (bl ? null : joq2)) {
                throw new AssertionError();
            }
            if (bl) {
                joy.b(this.nKX).put(jou2, joq2);
            } else {
                joy.b(this.nKX).remove(jou2);
            }
        }

        static {
            $assertionsDisabled = !joy.class.desiredAssertionStatus();
        }
    };

    private boolean a(jpe jpe2) {
        jor jor2 = this.nKU.get(jpe2.nLr);
        if (jor2 == null) {
            return false;
        }
        jor2.a(jpe2.nLr, jpe2.nLs);
        return true;
    }

    private boolean a(jpd jpd2) {
        if (jpd2.nLq == 0.0f) {
            return false;
        }
        joq joq2 = this.nKV.get(jpd2.nLp);
        if (joq2 == null) {
            return false;
        }
        joq2.a(jpd2.nLp, jpd2.nLq);
        return true;
    }

    static /* synthetic */ boolean a(joy joy2, jpe jpe2) {
        return joy2.a(jpe2);
    }

    static /* synthetic */ boolean a(joy joy2, jpd jpd2) {
        return joy2.a(jpd2);
    }

    static /* synthetic */ Map a(joy joy2) {
        return joy2.nKU;
    }

    static /* synthetic */ Map b(joy joy2) {
        return joy2.nKV;
    }
}

