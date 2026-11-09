/*
 * Decompiled with CFR.
 */
public class bkx
extends bke {
    private fdd dtt = null;

    public bkx() {
        this.dsy = bkd.a.drH;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFLineInstantEffectFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9233) {
            lfn.b(5, "SFLineInstantEffectFO", "doFunction() FunctionMessage is not a SFFunctionLineEffectMessage.");
            lfn.b(5, "SFLineInstantEffectFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dtt = (fdd)fdo2;
        this.arn();
    }

    @Override
    public final void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                this.Vc();
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        if (kuj2.dXg() == null) {
            lfn.b(5, "SFLineInstantEffectFO", "handleLineContainmentResponse() RequestGUID is null.");
            return;
        }
        if (kuj2.jnv == null) {
            lfn.b(5, "SFLineInstantEffectFO", "handleLineContainmentResponse() ObjectGUIDs array is null.");
            return;
        }
        if (kuj2.qdO == null) {
            lfn.b(5, "SFLineInstantEffectFO", "handleLineContainmentResponse() OwnerObjectGUIDs array is null.");
            return;
        }
        if (kuj2.pJh == null) {
            lfn.b(5, "SFLineInstantEffectFO", "handleLineContainmentResponse() Distances array is null.");
            return;
        }
        if (kuj2.ilP == null) {
            lfn.b(5, "SFLineInstantEffectFO", "handleLineContainmentResponse() Positions array is null.");
            return;
        }
        if (kuj2.bqd == null) {
            lfn.b(5, "SFLineInstantEffectFO", "handleLineContainmentResponse() ResourceTypes array is null.");
            return;
        }
        if (kuj2.qdP == null) {
            lfn.b(5, "SFLineInstantEffectFO", "handleLineContainmentResponse() HitLocations array is null.");
            return;
        }
        ldv[] ldvArray = kuj2.jnv;
        ldv[] ldvArray2 = kuj2.qdO;
        float[] fArray = kuj2.pJh;
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
            if (this.a(ldvArray2[i], nArray[i], this.dtt.dta)) continue;
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
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(this.dtt.Position);
        kji2.cq(this.dtt.mx);
        kji2.setLength(this.dtt.akO);
        this.MessageDelegator.a(kji2);
    }
}

