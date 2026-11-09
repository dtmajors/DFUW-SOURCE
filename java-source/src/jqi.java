/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.Map;

public class jqi {
    protected static final joi nHy = joi.nHV;
    private final lha<dxq, dxq> jAj;
    private final Map<jov, c> nRW = new HashMap<jov, c>();
    private final Map<jou, b> nRX = new HashMap<jou, b>();
    private final jom kzI;
    private final lbi<fja> nRY = new lbi<fja>(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jqi nRZ;
        {
            this.nRZ = jqi2;
        }

        public final void a(fja fja2) {
            ldv ldv2 = fja2.aO();
            if (fja2.iNw instanceof jov) {
                jqi.a(this.nRZ, fja2.ila, (jov)fja2.iNw, ldv2);
            } else if (fja2.iNw instanceof jou) {
                jqi.a(this.nRZ, fja2.ila, (jou)fja2.iNw, ldv2);
            } else if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }

        public /* synthetic */ void m(Object object) {
            this.a((fja)object);
        }

        static {
            $assertionsDisabled = !jqi.class.desiredAssertionStatus();
        }
    };

    private void a(boolean bl, jov jov2, ldv ldv2) {
        c c2;
        if (bl) {
            assert (this.nRW.get(jov2) == null);
            c2 = new c(this, jov2, ldv2);
            this.nRW.put(jov2, c2);
        } else {
            c2 = this.nRW.get(jov2);
            assert (c2.iNw == jov2);
            assert (c2.nSa == ldv2);
            this.nRW.remove(jov2);
        }
        this.kzI.a(bl, jov2, c2);
    }

    private void a(boolean bl, jou jou2, ldv ldv2) {
        b b2;
        if (bl) {
            assert (this.nRX.get(jou2) == null);
            b2 = new b(this, jou2, ldv2);
            this.nRX.put(jou2, b2);
        } else {
            b2 = this.nRX.get(jou2);
            assert (b2.iNw == jou2);
            assert (b2.nSa == ldv2);
            this.nRX.remove(jou2);
        }
        this.kzI.a(bl, jou2, b2);
    }

    public jqi(jom jom2, lha<dxq, dxq> lha2) {
        assert (lha2 != null);
        this.kzI = jom2;
        this.jAj = lha2;
        this.jAj.rex.a(true, fja.class, this.nRY);
    }

    protected final void a(ldv ldv2, jpc jpc2) {
        this.jAj.rnh.m(fjb.a(this.jAj.rng, ldv2, jpc2));
    }

    static /* synthetic */ void a(jqi jqi2, boolean bl, jov jov2, ldv ldv2) {
        jqi2.a(bl, jov2, ldv2);
    }

    static /* synthetic */ void a(jqi jqi2, boolean bl, jou jou2, ldv ldv2) {
        jqi2.a(bl, jou2, ldv2);
    }
}

