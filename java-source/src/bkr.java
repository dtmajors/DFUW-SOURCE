/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  ha
 *  lcr
 */
public class bkr
extends bke
implements bto {
    private double dth = 0.0;

    public bkr() {
        this.dsy = bkd.a.dsw;
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
        ha ha2 = this.hI(fdo2.aYF);
        if (ha2 == null) {
            this.Vc();
            return;
        }
        if (ha2.jf() == null || ha2.jf().aAG() == null || ha2.jf().aAG() == null) {
            this.Vc();
            return;
        }
        ljq ljq2 = ha2.jf().aAG().azc().eqT();
        lgl lgl2 = new lgl(0.0f, ljq2.y, 0.0f);
        lgl lgl3 = new lgl(0.0f, 1.5707964f, 0.0f);
        lgl2.Y(lgl3);
        ljq ljq3 = fcw2.aZD.esF();
        fem fem2 = (fem)this.MessageDelegator.h(25345, this.getGUID(), lcr.qBI);
        fem2.ikP = false;
        fem2.Position = ljq3;
        fem2.Rotation = lgl2;
        fem2.ResourceType = cug.ih((String)"r_Tectonic Shift");
        fem2.iKA = fcw2.eKm;
        fem2.ilU = null;
        this.MessageDelegator.F(fem2);
    }
}

