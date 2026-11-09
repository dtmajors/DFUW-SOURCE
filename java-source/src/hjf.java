/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
public class hjf
implements lbi<fex>,
lbr {
    private lha<dxq, dxq> cdh;
    private final lbn kxG = new lbn(this){
        final /* synthetic */ hjf kxI;
        {
            this.kxI = hjf2;
        }

        public void W() {
            hjf.a(this.kxI);
        }
    };
    public final atk kxH = new atk();

    public hjf() {
    }

    public hjf(lha<dxq, dxq> lha2) {
        this.cdh = lha2;
        this.cdh.rex.a(true, fex.class, this);
        this.kxH.cec().a(true, this.kxG);
    }

    public void dispose() {
        this.cdh.rex.a(false, fex.class, this);
        this.kxH.cec().a(false, this.kxG);
    }

    private void cmV() {
        atk atk2 = (atk)this.kxH.evc();
        fex fex2 = (fex)this.cdh.rng.ik(2576);
        fex2.f(lcr.acL);
        fex2.on(lcr.qCh);
        fex2.iKH = atk2;
        fex2.iKI = atk2.bYr;
        this.cdh.rnh.m(fex2);
    }

    public void b(fex fex2) {
        this.kxH.cec().a(false, this.kxG);
        this.kxH.i(fex2.iKH);
        this.kxH.cec().a(true, this.kxG);
    }

    @Override
    public boolean a(lfu lfu2) {
        return this.kxH.a(lfu2.zC("AudioOptions"));
    }

    @Override
    public /* synthetic */ void m(Object object) {
        this.b((fex)object);
    }

    static /* synthetic */ void a(hjf hjf2) {
        hjf2.cmV();
    }
}

