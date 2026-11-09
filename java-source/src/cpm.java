/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cov
 *  cug
 *  cxd
 *  lcr
 *  lcw
 */
import java.util.List;
import java.util.Map;

public class cpm
extends btk {
    private static final les ResourceTree = lea.enW();
    private static final double eTQ = 4.0;
    private static final float eTR = 25.0f;
    private static final float eTS = 35.0f;
    private final cov ePS;
    private final List<eh> eQE;
    private ldv enc = null;
    private ldv eTT = null;
    private boolean eTU = false;
    private List<ldv> eTV = lcn.emv();
    private Map<ldv, ljq> eTW = lcn.emw();
    private double eTX = 0.0;

    public cpm(cov cov2) {
        this.ePS = cov2;
        this.eQE = this.ePS.aWi();
    }

    public void V(ldv ldv2, ldv ldv3) {
        this.eTT = ldv2;
        this.enc = ldv3;
        if (this.eQE == null || this.eQE.isEmpty()) {
            this.ePS.b(false, this.enc, 0);
            this.reset();
            assert (false);
            return;
        }
        if (this.ePS.aAG() == null) {
            this.ePS.b(false, this.enc, 0);
            this.reset();
            return;
        }
        if (this.ePS.aAG().av() == null) {
            this.ePS.b(false, this.enc, 0);
            this.reset();
            return;
        }
        if (this.eTT == null) {
            this.ePS.b(false, this.enc, 0);
            this.reset();
            return;
        }
        if (this.ePS.aXq() == null) {
            this.ePS.b(false, this.enc, 0);
            this.reset();
            return;
        }
        ldv ldv4 = lcr.tQ((ldv)this.ePS.aXq());
        if (!this.eTT.equals(ldv4)) {
            this.ePS.b(false, this.enc, 0);
            this.reset();
            return;
        }
        if (this.eTU) {
            this.ePS.b(false, this.enc, 3);
            this.reset();
            return;
        }
        double d2 = this.MessageDelegator.arc().rgz;
        if (d2 < this.eTX + 4.0) {
            this.ePS.b(false, this.enc, 2);
            return;
        }
        this.eTU = true;
        this.eTX = d2;
        int n = this.ePS.aVq().Hl();
        this.ePS.oN(n);
        for (eh eh2 : this.eQE) {
            ljq ljq2 = new ljq();
            lgl lgl2 = new lgl();
            eh2.a(this.ePS.aAG().av(), this.ePS.aAG().aw(), ljq2, lgl2);
            kjo kjo2 = (kjo)this.MessageDelegator.h(2819);
            kjo2.ec = this.GUID;
            kjo2.pDY = 0;
            kjo2.ipF = ljq2;
            kjo2.gBJ = 25.0f;
            kjo2.dtb = true;
            kjo2.pFi = 10;
            kjo2.pFj = false;
            kjo2.ObjectType = 0;
            kjo2.pEL = true;
            this.MessageDelegator.a(kjo2);
            this.eTW.put(kjo2.GUID, ljq2);
        }
    }

    private void a(kuo kuo2) {
        ljq ljq2 = this.eTW.remove(kuo2.ev);
        if (ljq2 == null) {
            assert (false) : "RequestGUID :" + kuo2.ev;
            return;
        }
        ldv[] ldvArray = kuo2.jnv;
        ldv[] ldvArray2 = kuo2.qdO;
        int[] nArray = kuo2.bqd;
        ljq[] ljqArray = kuo2.ilP;
        if (ldvArray != null && ldvArray2 != null && nArray != null && ljqArray != null && ldvArray.length == ldvArray2.length && ldvArray.length == nArray.length && ldvArray.length == ljqArray.length && ldvArray.length > 0) {
            int n = ldvArray.length;
            for (int i = 0; i < n; ++i) {
                this.a(ldvArray[i], ldvArray2[i], ljqArray[i], nArray[i]);
            }
        }
        if (this.eTW.isEmpty()) {
            this.ePS.b(true, this.enc, -1);
            this.reset();
        }
    }

    private void a(ldv ldv2, ldv ldv3, ljq ljq2, int n) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (ljq2 != null);
        if (this.W(ldv3, n)) {
            return;
        }
        if (this.eTV.contains(ldv3)) {
            return;
        }
        this.eTV.add(ldv3);
        this.a(ldv3, ljq2, n, cxd.f.fQX);
    }

    private void a(ldv ldv2, ljq ljq2, int n, cxd.f f2) {
        assert (ldv2 != null);
        assert (f2 != null);
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.bst = bkd.dqy;
        fcw2.aZG = lcr.qAC;
        fcw2.akX = ldv2;
        fcw2.aYF = this.ePS.aXq();
        fcw2.bsG = cug.fgJ;
        fcw2.aYC = cxd.fJV;
        fcw2.Magnitude = 35.0f;
        fcw2.eKm = 0.0;
        fcw2.aSp = 0.0f;
        fcw2.aYH = -1;
        fcw2.aYG = bfk.dgC;
        fcw2.bsE = 0;
        fcw2.bRD = 1;
        fcw2.gpI = -3.0;
        fcw2.aZH = ljq2;
        fcw2.dhr = n;
        fcw2.akX = ldv2;
        fcw2.a(f2);
        this.MessageDelegator.F(fcw2);
    }

    private boolean W(ldv ldv2, int n) {
        assert (ldv2 != null);
        if (n <= 0) {
            lfn.b(5, "SFTargetHarvesterBoat", "skipObject() Skipping object with invalid resourcetype.");
            return true;
        }
        if (!ResourceTree.isDescendant(n, cug.fgJ) && !ResourceTree.isDescendant(n, cug.fgH)) {
            return true;
        }
        if (ldv2.equals(lcr.qAC)) {
            return false;
        }
        return lcw.enb() && !lcw.abY((int)ldv2.ib());
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        int n = ktv2.egT();
        switch (n) {
            case 4867: {
                this.a((kuo)ktv2);
                break;
            }
        }
    }

    @Override
    public void reset() {
        this.eTT = null;
        this.enc = null;
        this.eTU = false;
        this.eTV.clear();
        this.eTW.clear();
    }

    public final boolean aYg() {
        return this.eTU;
    }
}

