/*
 * Decompiled with CFR.
 */
public class jqh {
    protected static final joi nHy = joi.nHV;
    private final ldv gqQ;
    private final lha<dxq, dxq> jAj;
    private final joy nHB = new joy();
    public final jom kzI = new jom(this){
        static final /* synthetic */ boolean $assertionsDisabled;
        final /* synthetic */ jqh nRV;
        {
            this.nRV = jqh2;
        }

        public final void a(boolean bl, jov jov2, jor jor2) {
            if (!$assertionsDisabled && jov2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && jor2 == null) {
                throw new AssertionError();
            }
            jqh.a((jqh)this.nRV).kzI.a(bl, jov2, jor2);
            jqh.b((jqh)this.nRV).rnh.m(fja.a(jqh.b((jqh)this.nRV).rng, jqh.c(this.nRV), bl, jov2));
        }

        public final void a(boolean bl, jou jou2, joq joq2) {
            if (!$assertionsDisabled && jou2 == null) {
                throw new AssertionError();
            }
            if (!$assertionsDisabled && joq2 == null) {
                throw new AssertionError();
            }
            jqh.a((jqh)this.nRV).kzI.a(bl, jou2, joq2);
            jqh.b((jqh)this.nRV).rnh.m(fja.a(jqh.b((jqh)this.nRV).rng, jqh.c(this.nRV), bl, jou2));
        }

        static {
            $assertionsDisabled = !jqh.class.desiredAssertionStatus();
        }
    };
    private final lbi<fjb> nRU = new lbi<fjb>(this){
        final /* synthetic */ jqh nRV;
        {
            this.nRV = jqh2;
        }

        public void a(fjb fjb2) {
            jqh.a((jqh)this.nRV).nKW.m(fjb2.iNx);
        }

        public /* synthetic */ void m(Object object) {
            this.a((fjb)object);
        }
    };

    public jqh(ldv ldv2, lha<dxq, dxq> lha2) {
        this.jAj = lha2;
        this.gqQ = ldv2;
        this.cc(true);
    }

    public final void dispose() {
        this.cc(false);
    }

    private void cc(boolean bl) {
        this.jAj.rex.a(bl, fjb.class, this.nRU);
    }

    static /* synthetic */ joy a(jqh jqh2) {
        return jqh2.nHB;
    }

    static /* synthetic */ lha b(jqh jqh2) {
        return jqh2.jAj;
    }

    static /* synthetic */ ldv c(jqh jqh2) {
        return jqh2.gqQ;
    }
}

