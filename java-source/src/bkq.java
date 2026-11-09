/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
public class bkq
extends bke
implements bto {
    private double dth = 0.0;

    public bkq() {
        this.dsy = bkd.a.dsl;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.dth > 0.0 && ldz2.rgz > this.dth) {
            this.Vc();
        }
    }

    @Override
    public void a(int n, fdo fdo2) {
        fcw fcw2 = (fcw)fdo2;
        this.dth = this.MessageDelegator.arc().rgz + fcw2.eKm;
        if (fcw2.aZD == null) {
            this.Vc();
            return;
        }
        ljq ljq2 = fcw2.aZD.esF();
        int n2 = cxi.fj(fcw2.Magnitude * 100.0f) + 1;
        if (n2 < 1 || n2 > 5) {
            n2 = 1;
        }
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), lcr.qBI);
        fem2.ikP = false;
        fem2.Position = ljq2;
        fem2.Position.es(new ljq(0.0f, 1.8f, 0.0f));
        fem2.Rotation = new lgl();
        fem2.ResourceType = cug.ih((String)("r_SanctuarySphere" + n2));
        fem2.iKA = fcw2.eKm;
        fem2.ilU = null;
        this.MessageDelegator.F(fem2);
    }
}

