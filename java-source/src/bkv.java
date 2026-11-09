/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  ha
 *  lcr
 */
import java.util.Map;

public class bkv
extends bke
implements bto {
    private fdd dtt = null;
    private double dtu = 40.0;
    private double dtv = 0.0;
    private double dth = 0.0;

    public bkv() {
        this.dsy = bkd.a.drI;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFLineDurationEffectFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9233) {
            lfn.b(5, "SFLineDurationEffectFO", "doFunction() FunctionMessage is not a SFFunctionLineEffectMessage.");
            lfn.b(5, "SFLineDurationEffectFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dtv = 0.0;
        this.dtt = (fdd)fdo2;
        this.dth = (double)this.MessageDelegator.bzy().getTimeInMillis() + this.dtt.eKm * 1000.0;
    }

    @Override
    public void doTick(ldz ldz2) {
        if ((double)this.MessageDelegator.bzy().getTimeInMillis() < this.dtv + this.dtu) {
            return;
        }
        this.dtv = this.MessageDelegator.bzy().getTimeInMillis();
        if ((double)this.MessageDelegator.bzy().getTimeInMillis() > this.dth) {
            this.Vc();
            return;
        }
        this.arn();
    }

    @Override
    public final void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        if (kuj2.dXg() == null) {
            lfn.b(5, "SFLineDurationEffectFO", "handleLineContainmentResponse() RequestGUID is null.");
            return;
        }
        if (kuj2.jnv == null) {
            lfn.b(5, "SFLineDurationEffectFO", "handleLineContainmentResponse() ObjectGUIDs array is null.");
            return;
        }
        if (kuj2.qdO == null) {
            lfn.b(5, "SFLineDurationEffectFO", "handleLineContainmentResponse() OwnerObjectGUIDs array is null.");
            return;
        }
        if (kuj2.pJh == null) {
            lfn.b(5, "SFLineDurationEffectFO", "handleLineContainmentResponse() Distances array is null.");
            return;
        }
        if (kuj2.ilP == null) {
            lfn.b(5, "SFLineDurationEffectFO", "handleLineContainmentResponse() Positions array is null.");
            return;
        }
        if (kuj2.bqd == null) {
            lfn.b(5, "SFLineDurationEffectFO", "handleLineContainmentResponse() ResourceTypes array is null.");
            return;
        }
        if (kuj2.qdP == null) {
            lfn.b(5, "SFLineDurationEffectFO", "handleLineContainmentResponse() HitLocations array is null.");
            return;
        }
        ldv[] ldvArray = kuj2.jnv;
        ldv[] ldvArray2 = kuj2.qdO;
        ljq[] ljqArray = kuj2.ilP;
        int[] nArray = kuj2.bqd;
        int[] nArray2 = kuj2.qdP;
        if (ldvArray == null || ldvArray.length == 0) {
            return;
        }
        assert (ldvArray2 != null);
        assert (nArray != null);
        assert (ldvArray.length == ldvArray2.length);
        assert (ldvArray.length == nArray.length);
        assert (ldvArray.length == ljqArray.length);
        assert (ldvArray.length == nArray2.length);
        int n = ldvArray.length;
        for (int i = 0; i < n; ++i) {
            ldv ldv2 = lcr.tQ((ldv)ldvArray2[i]);
            ldv ldv3 = lcr.tQ((ldv)this.dtt.aYF);
            if (this.a(ldvArray2[i], nArray[i], this.dtt.dta) || ldv3.equals(ldv2)) continue;
            this.a(ldvArray2[i], ljqArray[i], nArray[i], nArray2[i]);
        }
    }

    private void a(ldv ldv2, ljq ljq2, int n, int n2) {
        assert (ldv2 != null);
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.bst = this.dtt.gbe;
        fcw2.aZG = this.dtt.aZG;
        fcw2.akX = ldv2;
        fcw2.aYF = this.dtt.aYF;
        fcw2.bsG = this.dtt.bsG;
        fcw2.aYC = this.dtt.aYC;
        fcw2.Magnitude = this.dtt.Magnitude;
        fcw2.cRI = this.dtt.cRI;
        fcw2.eKm = this.dtt.eKm;
        fcw2.aSp = this.dtt.aSp;
        fcw2.aYH = this.dtt.aYH;
        fcw2.aYG = this.dtt.aYG;
        fcw2.bsE = this.dtt.bsE;
        fcw2.bRD = this.dtt.bRD;
        fcw2.gpI = this.dtt.gpI;
        fcw2.dup = this.dtt.dup;
        fcw2.aZH = this.dtt.aZH;
        fcw2.duq = this.dtt.duq;
        fcw2.duq = this.dtt.iJy;
        fcw2.iJA = this.dtt.iJA;
        fcw2.iJB = this.dtt.iJB;
        fcw2.a(cxd.f.getHitLocationTypeForHitLocation(n2));
        this.MessageDelegator.H(fcw2);
    }

    private void arn() {
        assert (this.dtt != null);
        ha ha2 = this.hI(this.dtt.aZG);
        if (ha2 == null) {
            this.Vc();
            return;
        }
        cex cex2 = ha2.jf();
        if (cex2 == null) {
            this.Vc();
            return;
        }
        if (cex2.aMA() == null) {
            this.Vc();
            return;
        }
        bvd bvd2 = cex2.aAG();
        if (bvd2 == null) {
            this.Vc();
            return;
        }
        ljq ljq2 = bvd2.azb();
        lgl lgl2 = bvd2.azc();
        ljq ljq3 = new ljq(ljq2);
        lgl lgl3 = new lgl(lgl2);
        float f2 = cex2.aMG() * 3.1415f - 1.57075f;
        lgl lgl4 = new lgl(new ljq(1.0f, 0.0f, 0.0f), f2);
        ljq ljq4 = new ljq();
        lgl lgl5 = new lgl();
        Map<String, eh> map = ei.ao(bvd2.getFileName());
        String string = cex2.aLU().aEP().vO() == 3 ? "AttachPoint Character Crouch Chest Center" : "AttachPoint Character Chest Center";
        eh eh2 = map.get(string);
        eh2.a(ljq3, lgl3, ljq4, lgl5);
        lgl4.Y(lgl5);
        ljq ljq5 = new ljq(0.0f, 0.0f, -1.0f);
        ljq5 = lgl4.eq(ljq5);
        ljq5.normalize();
        ljq ljq6 = ljq5;
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq4);
        kji2.cq(ljq6);
        kji2.setLength(this.dtt.akO);
        kji2.pEr = -1966273;
        this.MessageDelegator.a(kji2);
    }

    public void a(int n, ldv ldv2, ljq ljq2, ldv ldv3, lgl lgl2, ljq ljq3) {
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.getGUID(), lcr.qEb);
        glh2.setSpecialEffectType(n);
        glh2.setSourceObjectGUID(ldv3);
        glh2.setTargetObjectGUID(ldv2);
        glh2.setTargetPosition(ljq2);
        glh2.setSourcePosition(ljq3);
        glh2.setSourceRotation(lgl2);
        glh2.JQ(6);
        this.MessageDelegator.F(glh2);
    }
}

