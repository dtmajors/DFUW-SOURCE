/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cex
 *  ha
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;

public class bkw
extends bke
implements bto {
    private Map<String, eh> bpR = null;
    private fdd dtt = null;
    private double dtu = 40.0;
    private double dtv = 0.0;
    private Map<ldv, a> dsC = lcn.emw();
    private boolean dtw = false;

    public bkw() {
        this.dsy = bkd.a.drJ;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFLineDurationEffectFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9233) {
            lfn.b(5, "SFLineInfiniteEffectFO", "doFunction() FunctionMessage is not a SFFunctionLineEffectMessage.");
            lfn.b(5, "SFLineInfiniteEffectFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dtv = 0.0;
        this.dtt = (fdd)fdo2;
        this.dtw = true;
    }

    @Override
    public void doTick(ldz ldz2) {
        if ((double)this.MessageDelegator.bzy().getTimeInMillis() < this.dtv + this.dtu) {
            return;
        }
        this.dtv = this.MessageDelegator.bzy().getTimeInMillis();
        if (!this.dtw) {
            this.Vc();
            return;
        }
        Iterator<a> iterator = this.dsC.values().iterator();
        while (iterator.hasNext()) {
            a a2 = iterator.next();
            if (!(a2.dsE < (double)this.MessageDelegator.bzy().getTimeInMillis())) continue;
            iterator.remove();
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
            lfn.b(5, "SFLineInfiniteEffectFO", "handleLineContainmentResponse() RequestGUID is null.");
            return;
        }
        if (kuj2.jnv == null) {
            lfn.b(5, "SFLineInfiniteEffectFO", "handleLineContainmentResponse() ObjectGUIDs array is null.");
            return;
        }
        if (kuj2.qdO == null) {
            lfn.b(5, "SFLineInfiniteEffectFO", "handleLineContainmentResponse() OwnerObjectGUIDs array is null.");
            return;
        }
        if (kuj2.pJh == null) {
            lfn.b(5, "SFLineInfiniteEffectFO", "handleLineContainmentResponse() Distances array is null.");
            return;
        }
        if (kuj2.ilP == null) {
            lfn.b(5, "SFLineInfiniteEffectFO", "handleLineContainmentResponse() Positions array is null.");
            return;
        }
        if (kuj2.bqd == null) {
            lfn.b(5, "SFLineInfiniteEffectFO", "handleLineContainmentResponse() ResourceTypes array is null.");
            return;
        }
        if (kuj2.qdP == null) {
            lfn.b(5, "SFLineInfiniteEffectFO", "handleLineContainmentResponse() HitLocations array is null.");
            return;
        }
        ldv[] ldvArray = kuj2.jnv;
        ldv[] ldvArray2 = kuj2.qdO;
        ljq[] ljqArray = kuj2.ilP;
        int[] nArray = kuj2.bqd;
        int[] nArray2 = kuj2.qdP;
        float[] fArray = kuj2.pJh;
        if (ldvArray == null || ldvArray.length == 0) {
            return;
        }
        assert (ldvArray2 != null);
        assert (nArray != null);
        assert (ldvArray.length == ldvArray2.length);
        assert (ldvArray.length == nArray.length);
        assert (ldvArray.length == ljqArray.length);
        assert (ldvArray.length == nArray2.length);
        assert (fArray.length == nArray2.length);
        bkw.a(fArray, ldvArray2);
        ldv ldv2 = lcr.tQ((ldv)this.dtt.aYF);
        int n = ldvArray2.length;
        for (int i = 0; i < n; ++i) {
            ldv ldv3 = lcr.tQ((ldv)ldvArray2[i]);
            if (ldv2.equals(ldv3)) continue;
            if (this.a(ldvArray2[i], nArray[i], this.dtt.dta)) {
                return;
            }
            a a2 = this.dsC.get(ldvArray2[i]);
            if (a2 != null) {
                return;
            }
            a2 = new a(this, null);
            a2.Ui = ldvArray2[i];
            a2.dsE = (double)this.MessageDelegator.bzy().getTimeInMillis() + this.dtt.gpI * 1000.0;
            this.dsC.put(a2.Ui, a2);
            this.a(ldvArray2[i], ljqArray[i], nArray[i], nArray2[i]);
        }
    }

    public static void a(float[] fArray, ldv[] ldvArray) {
        int n = fArray.length;
        boolean bl2 = true;
        while (bl2) {
            --n;
            bl2 = false;
            for (int i = 0; i < n; ++i) {
                if (!(fArray[i] > fArray[i + 1])) continue;
                float f2 = fArray[i];
                fArray[i] = fArray[i + 1];
                fArray[i + 1] = f2;
                ldv ldv2 = ldvArray[i];
                ldvArray[i] = ldvArray[i + 1];
                ldvArray[i + 1] = ldv2;
                bl2 = true;
            }
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
        fcw2.a(cxd.f.getHitLocationTypeForHitLocation(n2));
        fcw2.iJB = this.dtt.iJB;
        this.MessageDelegator.H(fcw2);
    }

    private void arn() {
        assert (this.dtt != null);
        ha ha2 = this.hI(this.dtt.aZG);
        if (ha2 == null) {
            if (this.dtt.bOs()) {
                this.a(this.dtt, true);
            }
            this.Vc();
            return;
        }
        cex cex2 = ha2.jf();
        if (cex2 == null) {
            if (this.dtt.bOs()) {
                this.a(this.dtt, true);
            }
            this.Vc();
            return;
        }
        if (cex2.aMA() == null) {
            if (this.dtt.bOs()) {
                this.a(this.dtt, true);
            }
            this.Vc();
            return;
        }
        bvd bvd2 = cex2.aAG();
        if (bvd2 == null) {
            if (this.dtt.bOs()) {
                this.a(this.dtt, true);
            }
            this.Vc();
            return;
        }
        ljq ljq2 = this.dtt.Position;
        lgl lgl2 = bvd2.azc();
        lgl lgl3 = new lgl(lgl2);
        float f2 = cex2.aMG() * (float)Math.PI - 1.5707964f;
        lgl lgl4 = new lgl(new ljq(1.0f, 0.0f, 0.0f), f2);
        lgl4.Y(lgl3);
        ljq ljq3 = new ljq(0.0f, 0.0f, -1.0f);
        ljq3 = lgl4.eq(ljq3);
        ljq3.normalize();
        ljq ljq4 = ljq3;
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(ljq4);
        kji2.setLength(this.dtt.akO);
        this.MessageDelegator.a(kji2);
    }

    @Override
    protected final void a(fdp fdp2) {
        if (!this.dtw) {
            lfn.b(5, "SFLineInfiniteEffectFO", "handleFunctionStopMessage() AreaSensor is not active for " + this.GUID);
            return;
        }
        this.dtw = false;
    }
}

