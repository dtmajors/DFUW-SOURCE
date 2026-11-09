/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.List;

public class jjr
extends btk
implements bto {
    public static final int npA = 100;
    private List<a> npB = lcn.emv();
    private double npC = 0.0;
    private float npD = 1.0f;
    private float npE = 0.0f;

    @Override
    public void initialize() {
        super.initialize();
        ljq ljq2 = hso.cxK().cxT().oB();
        for (int j = 0; j < 100; ++j) {
            float f2 = (j - 50) * 10;
            a a2 = new a(cug.flV, "PartyPlayer" + j, new ljq(ljq2.x + f2, ljq2.y, ljq2.rlV + f2), this.MessageDelegator.bzv());
            this.npB.add(a2);
            this.a(a2);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.rgz - this.npC > 0.1) {
            this.npC = ldz2.rgz;
            for (a a2 : this.npB) {
                a2.bzt.x += this.npD;
                a2.bzt.rlV += this.npD;
                this.b(a2);
            }
            this.npE += 1.0f;
            if (this.npE > 100.0f) {
                this.npE = 0.0f;
                this.npD = -this.npD;
            }
        }
    }

    private void a(a a2) {
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, hso.cxK().cxT().getGUID());
        ffb2.iKO = ffb.a.iKR;
        ffb2.dbx = a2.npG;
        ffb2.iKP = new ljg(a2.toString());
        ffb2.dzN = new lhu(16, 16, "gui/targeticons/take.dds");
        ffb2.ResourceType = a2.npF;
        ffb2.iKQ = a2.bzt;
        ffb2.eir = 0.0f;
        ffb2.eis = new ljp(1.0f, 1.0f);
        this.MessageDelegator.F(ffb2);
    }

    private void b(a a2) {
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, hso.cxK().cxT().getGUID());
        ffb2.iKO = ffb.a.iKS;
        ffb2.dbx = a2.npG;
        ffb2.iKP = new ljg(a2.toString());
        ffb2.dzN = new lhu(16, 16, "gui/targeticons/take.dds");
        ffb2.ResourceType = a2.npF;
        ffb2.iKQ = a2.bzt;
        ffb2.eir = 0.0f;
        ffb2.eis = new ljp(1.0f, 1.0f);
        this.MessageDelegator.F(ffb2);
    }
}

