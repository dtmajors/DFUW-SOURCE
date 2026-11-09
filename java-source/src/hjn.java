/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class hjn
implements lbi<ffg>,
lbr {
    private final lha<dxq, dxq> cdh;
    private final lbn kzE = new lbn(this){
        final /* synthetic */ hjn kzG;
        {
            this.kzG = hjn2;
        }

        public void W() {
            hjn.a(this.kzG);
        }
    };
    public final cqu kzF = new cqu();

    public hjn(lha<dxq, dxq> lha2) {
        this.cdh = lha2;
        this.cdh.rex.a(true, ffg.class, this);
        this.kzF.cec().a(true, this.kzE);
    }

    public void dispose() {
        this.cdh.rex.a(false, ffg.class, this);
        this.kzF.cec().a(false, this.kzE);
    }

    private void cnQ() {
        cqu cqu2 = (cqu)this.kzF.evc();
        ffg ffg2 = (ffg)this.cdh.rng.ik(2575);
        ffg2.f(lcr.acL);
        ffg2.on(lcr.qCg);
        ffg2.iKW = cqu2;
        ffg2.iKI = cqu2.bYr;
        this.cdh.rnh.m(ffg2);
    }

    public void b(ffg ffg2) {
        this.kzF.cec().a(false, this.kzE);
        this.kzF.i(ffg2.iKW);
        this.kzF.cec().a(true, this.kzE);
    }

    @Override
    public boolean a(lfu lfu2) {
        return this.kzF.a(lfu2.zC("VideoOptions"));
    }

    @Override
    public /* synthetic */ void m(Object object) {
        this.b((ffg)object);
    }

    static /* synthetic */ void a(hjn hjn2) {
        hjn2.cnQ();
    }
}

