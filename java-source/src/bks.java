/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 *  lcw
 */
import java.util.Iterator;
import java.util.Map;

public class bks
extends bkl {
    private fcz dtq = null;
    private Map<ldv, a> dsC = null;

    public bks() {
        this.dsy = bkd.a.drE;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        if (fdo2 == null) {
            lfn.b(5, "SFFlameThrowerFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9230) {
            lfn.b(5, "SFFlameThrowerFO", "doFunction() FunctionMessage is not a SFFunctionFlameThrowerEffectMessage.");
            lfn.b(5, "SFFlameThrowerFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dtq = (fcz)fdo2;
        this.Active = false;
        if (this.dtq.eKm <= 0.0) {
            lfn.b(5, "SFFlameThrowerFO", "doFunction() Duration is invalid.");
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

    @Override
    protected final void a(bkz bkz2) {
        assert (bkz2 != null);
        a a2 = this.dsC.get(bkz2.Ui);
        if (a2 != null) {
            return;
        }
        a2 = new a(this, null);
        a2.Ui = bkz2.Ui;
        a2.dsE = this.bBt + this.dtq.gpI;
        this.dsC.put(a2.Ui, a2);
        this.hN(bkz2.Ui);
    }

    @Override
    protected final void a(bkz bkz2, Iterator iterator) {
        assert (bkz2 != null);
        if (iterator != null) {
            iterator.remove();
        }
    }

    @Override
    protected final void arh() {
        this.dsH = false;
    }

    private int a(float[] fArray, ldv[] ldvArray, ldv[] ldvArray2) {
        assert (fArray != null);
        assert (fArray.length > 0);
        int n = -1;
        float f2 = 100000.0f;
        int n2 = fArray.length;
        for (int i = 0; i < n2; ++i) {
            if (!(fArray[i] < f2) || this.y(ldvArray[i], ldvArray2[i])) continue;
            n = i;
            f2 = fArray[i];
        }
        if (n >= 0) {
            // empty if block
        }
        return n;
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        if (kuj2.dXg() == null) {
            lfn.b(5, "SFFlameThrowerFO", "handleLineContainmentResponse() RequestGUID is null.");
            return;
        }
        if (kuj2.jnv == null) {
            lfn.b(5, "SFFlameThrowerFO", "handleLineContainmentResponse() ObjectGUIDs array is null.");
            return;
        }
        if (kuj2.qdO == null) {
            lfn.b(5, "SFFlameThrowerFO", "handleLineContainmentResponse() OwnerObjectGUIDs array is null.");
            return;
        }
        if (kuj2.pJh == null) {
            lfn.b(5, "SFFlameThrowerFO", "handleLineContainmentResponse() Distances array is null.");
            return;
        }
        if (kuj2.ilP == null) {
            lfn.b(5, "SFFlameThrowerFO", "handleLineContainmentResponse() Positions array is null.");
            return;
        }
        if (kuj2.bqd == null) {
            lfn.b(5, "SFFlameThrowerFO", "handleLineContainmentResponse() ResourceTypes array is null.");
            return;
        }
        if (kuj2.qdP == null) {
            lfn.b(5, "SFFlameThrowerFO", "handleLineContainmentResponse() HitLocations array is null.");
            return;
        }
        ldv[] ldvArray = kuj2.jnv;
        ldv[] ldvArray2 = kuj2.qdO;
        float[] fArray = kuj2.pJh;
        ljq[] ljqArray = kuj2.ilP;
        int[] nArray = kuj2.bqd;
        int[] nArray2 = kuj2.qdP;
        assert (ldvArray2 != null);
        assert (nArray != null);
        assert (ldvArray.length == ldvArray2.length);
        assert (ldvArray.length == nArray.length);
        assert (ldvArray.length == ljqArray.length);
        assert (ldvArray.length == nArray2.length);
        int n = -1;
        if (ldvArray.length <= 0 || fArray.length <= 0 || (n = this.a(fArray, ldvArray, ldvArray2)) < 0) {
            // empty if block
        }
        ljq ljq2 = null;
        if (n >= 0) {
            ljq2 = ljqArray[n];
            if (this.dtq.gbh > 0) {
                this.a(this.dtq.gbh, this.dtq.dsD, ljq2);
            }
        } else {
            ljq2 = new ljq(this.dtq.mx);
            ljq2.nm(this.dtq.akO);
            ljq2.es(this.dtq.Position);
            if (this.dtq.gbh > 0) {
                this.a(this.dtq.gbh, this.dtq.dsD, ljq2);
            }
        }
        this.bBt = this.MessageDelegator.arc().rgz;
        this.setRadius(this.dtq.Radius);
        this.aR(ljq2);
        this.hK(null);
        this.r(this.dtq.dta);
        this.aX(this.bBt + this.dtq.eKm);
        this.Active = true;
        this.dsC = lcn.emw();
        this.acf();
    }

    private void hN(ldv ldv2) {
        assert (ldv2 != null);
        cxd.f f2 = cxd.f.fQX;
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.bst = this.dtq.iJH;
        fcw2.aZG = this.dtq.aZG;
        fcw2.akX = ldv2;
        fcw2.aYF = this.dtq.aYF;
        fcw2.bsG = this.dtq.bsG;
        fcw2.aYC = this.dtq.aYC;
        fcw2.Magnitude = this.dtq.Magnitude;
        fcw2.eKm = this.dtq.eKm;
        fcw2.cRI = this.dtq.cRI;
        fcw2.aSp = this.dtq.aSp;
        fcw2.aYH = this.dtq.aYH;
        fcw2.aYG = this.dtq.aYG;
        fcw2.bsE = this.dtq.bsE;
        fcw2.bRD = this.dtq.bRD;
        fcw2.gpI = this.dtq.gpI;
        fcw2.dup = this.dtq.dup;
        fcw2.aZH = this.dtq.aZH;
        fcw2.duq = this.dtq.duq;
        fcw2.duq = this.dtq.iJy;
        fcw2.iJA = this.dtq.iJA;
        fcw2.iJB = this.dtq.iJB;
        fcw2.a(f2);
        this.MessageDelegator.H(fcw2);
    }

    private void arn() {
        assert (this.dtq != null);
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(this.dtq.Position);
        kji2.cq(this.dtq.mx);
        kji2.setLength(this.dtq.akO);
        this.MessageDelegator.a(kji2);
    }

    private void a(int n, ldv ldv2, ljq ljq2) {
        assert (n > 0);
        assert (ljq2 != null);
        assert (this.dtq.dsD != null);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEb);
        glh2.setSpecialEffectType(n);
        glh2.o(0.0);
        glh2.mj(true);
        glh2.setTargetObjectGUID(ldv2);
        glh2.setTargetPosition(new ljq(ljq2));
        int n2 = 1;
        glh2.setSourceObjectGUID(this.dtq.dsD);
        glh2.setSourcePosition(this.dtq.aZH);
        glh2.JQ(n2 |= 2);
        this.MessageDelegator.F(glh2);
    }

    private boolean y(ldv ldv2, ldv ldv3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        if (ldv3.equals(lcr.qAC)) {
            return false;
        }
        if (ldv3.equals(this.dtq.dsD)) {
            return true;
        }
        return lcw.enb() && ldv3.ib() != 3;
    }
}

