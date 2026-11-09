/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvy
 */
public class ikt
extends ikq {
    public ikt() {
        super("HealthStatBar", "Health");
        hso.cxK().cxP().cyZ();
        hvy.lhk.b(new jlq<ikt>(this, this){
            final /* synthetic */ ikt mgO;
            {
                this.mgO = ikt2;
                super(ikt3);
            }

            public void b(ikt ikt2) {
                ikt.a(ikt2);
            }

            public /* synthetic */ void R(Object object) {
                this.b((ikt)object);
            }
        });
        hso.cxK().cxP().cyZ();
        hvy.lhl.b(new jlq<ikt>(this, this){
            final /* synthetic */ ikt mgO;
            {
                this.mgO = ikt2;
                super(ikt3);
            }

            public void b(ikt ikt2) {
                ikt.a(ikt2);
            }

            public /* synthetic */ void R(Object object) {
                this.b((ikt)object);
            }
        });
        this.dcA();
    }

    @Override
    public ijg dS(int n, int n2) {
        return ijg.mcR;
    }

    @Override
    public Integer dP(int n, int n2) {
        return 140;
    }

    @Override
    public ijc cZY() {
        return new iku();
    }

    private void dcA() {
        float f = hso.cxK().cxP().cyZ().Ua();
        float f2 = hso.cxK().cxP().cyZ().Ub();
        this.Y(f, f2);
    }

    static /* synthetic */ void a(ikt ikt2) {
        ikt2.dcA();
    }
}

