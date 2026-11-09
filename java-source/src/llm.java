/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  lcr
 */
import java.util.List;

public class llm
extends btk
implements bto {
    lll rDU;
    private ljq rDV;
    private ljq rDW;
    private ljq rDX;
    private int rDY = 0;
    private double nf = 0.0;
    private boolean gpD = false;
    private ljq na = new ljq();
    List<dqk> rDZ = lcn.emv();
    public static final String rEa = "gizmos/gizmo_light01.xml";
    public static final String rEb = "gizmos/gizmo_spawnpoint_01.xml";
    public boolean rEc;
    public boolean rEd;

    @Override
    public void initialize() {
        assert (this.rDU != null);
        assert (this.rDU.euI().size() > 2);
        this.rDV = this.rDU.euI().get(0);
        this.rDW = this.rDU.euI().get(1);
        this.rDX = this.rDU.euI().get(2);
        if (this.rEc) {
            this.b(this.rDU);
            if (this.rDY + 3 < this.rDU.euI().size()) {
                this.cT();
                this.b(this.rDU);
            }
            return;
        }
        this.nf = this.MessageDelegator.arc().rgz + (double)this.rDU.getDuration();
        if (this.ObserverObjects != null && this.ObserverObjects.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "No Observer Objects to Controll!");
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.rEd) {
            this.reset();
            this.MessageDelegator.hd(this.GUID);
            return;
        }
        if (this.rEc) {
            return;
        }
        if (this.gpD) {
            lfn.b(0, this.getClass().getSimpleName(), "doTick() : Finished");
            this.MessageDelegator.hd(this.GUID);
            return;
        }
        this.s(ldz2.qwh, ldz2.rgz);
    }

    private void s(double d2, double d3) {
        ljq ljq2 = new ljq();
        ljq ljq3 = new ljq();
        this.a(d3, ljq2, ljq3);
        edc edc2 = (edc)this.MessageDelegator.h(2049, this.GUID, lcr.rg);
        int n = 4;
        if (this.rDU.euL()) {
            n |= 8;
        }
        edc2.DH(n);
        edc2.c(ljq2);
        edc2.a(new lgl(ljq3));
        this.MessageDelegator.F(edc2);
    }

    private void a(double d2, ljq ljq2, ljq ljq3) {
        if (d2 > this.nf) {
            if (this.rDY + 3 < this.rDU.euI().size()) {
                this.cT();
                this.nf = d2 + (double)this.rDU.getDuration();
            } else {
                this.gpD = true;
            }
        }
        double d3 = 1.0 - (this.nf - d2) / (double)this.rDU.getDuration();
        ljq ljq4 = ljq.c(this.rDV, this.rDW, this.rDX, (float)d3);
        ljq2.eu(ljq4);
        if (this.rDU.euL()) {
            this.c(ljq3, d3);
        }
    }

    public void cT() {
        lfn.b(0, this.getClass().getSimpleName(), "sampleNextPoints() : ..");
        this.rDY += 3;
        this.rDV = this.rDX;
        this.rDX = this.rDU.euI().get(this.rDY);
        this.rDW = new ljq(this.rDV.x + (this.rDX.x - this.rDV.x), this.rDV.y + (this.rDX.y - this.rDV.y), this.rDV.rlV + (this.rDX.rlV - this.rDV.rlV));
        lfn.b(0, this.getClass().getSimpleName(), "sampleNextPoints() : Pos1 = " + this.rDV);
        lfn.b(0, this.getClass().getSimpleName(), "sampleNextPoints() : Pos2 = " + this.rDW);
        lfn.b(0, this.getClass().getSimpleName(), "sampleNextPoints() : Pos3 = " + this.rDX);
    }

    private void c(ljq ljq2, double d2) {
        ljq.a(this.rDU.euK(), this.rDU.euJ(), (float)d2, ljq2);
    }

    private void a(float f, ljq ljq2) {
        ljq ljq3 = ljq.d(this.rDV, this.rDW, this.rDX, f);
        ljq3.normalize();
        ljq2.x = this.na.x + (float)Math.atan2(ljq3.y, ljq3.rlV);
        ljq2.y = this.na.y + (float)Math.atan2(ljq3.y, ljq3.rlV);
        ljq2.rlV = this.na.rlV + 0.0f;
    }

    public lll euN() {
        return this.rDU;
    }

    public void a(lll lll2) {
        this.rDU = lll2;
    }

    @Override
    public void reset() {
        this.rDU = null;
        this.gpD = false;
        this.rDY = 0;
        this.nf = 0.0;
        this.na = new ljq();
        this.byK();
        this.rEc = false;
    }

    private void b(lll lll2) {
        int n = 10;
        this.a(this.rDV, new lgl(), rEb);
        this.a(this.rDW, new lgl(), rEb);
        this.a(this.rDX, new lgl(), rEb);
        int n2 = n;
        for (int i = 0; i <= n2; ++i) {
            ljq ljq2 = new ljq();
            ljq ljq3 = new ljq();
            double d2 = (double)i / (double)n;
            ljq ljq4 = ljq.c(this.rDV, this.rDW, this.rDX, (float)d2);
            ljq2.eu(ljq4);
            if (this.rDU.euL()) {
                this.c(ljq3, d2);
            }
            this.a(ljq2, new lgl(ljq3), rEa);
        }
    }

    public void a(ljq ljq2, lgl lgl2, String string) {
        if (this.MessageDelegator == null) assert (false);
        dqk dqk2 = new dqk();
        dqk2.setGUID(this.MessageDelegator.bzv());
        dqk2.setObjectDescriptionFilename(string);
        dqk2.c(ljq2);
        dqk2.a(lgl2);
        dqk2.setWorldbuilderSaveable(false);
        this.MessageDelegator.a((amf)dqk2);
        this.rDZ.add(dqk2);
    }

    public void byK() {
        for (dqk dqk2 : this.rDZ) {
            this.MessageDelegator.hd(dqk2.getGUID());
        }
        this.rDZ.clear();
    }
}

