/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvy
 */
public class ikw
extends ikq {
    public ikw() {
        super("ManaStatBar", "Mana");
        hso.cxK().cxP().cyZ();
        hvy.lho.b(new jlq<ikw>(this, this){
            final /* synthetic */ ikw mgP;
            {
                this.mgP = ikw2;
                super(ikw3);
            }

            public void b(ikw ikw2) {
                ikw.a(ikw2);
            }

            public /* synthetic */ void R(Object object) {
                this.b((ikw)object);
            }
        });
        hso.cxK().cxP().cyZ();
        hvy.lhp.b(new jlq<ikw>(this, this){
            final /* synthetic */ ikw mgP;
            {
                this.mgP = ikw2;
                super(ikw3);
            }

            public void b(ikw ikw2) {
                ikw.a(ikw2);
            }

            public /* synthetic */ void R(Object object) {
                this.b((ikw)object);
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
        return 180;
    }

    @Override
    public ijc cZY() {
        return new ikx();
    }

    private void dcA() {
        float f = hso.cxK().cxP().cyZ().Uf();
        float f2 = hso.cxK().cxP().cyZ().Ug();
        this.Y(f, f2);
    }

    static /* synthetic */ void a(ikw ikw2) {
        ikw2.dcA();
    }
}

