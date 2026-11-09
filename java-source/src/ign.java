/*
 * Decompiled with CFR.
 */
import java.util.HashSet;
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class ign {
    ign lSS;
    private cgr lST;
    private hwn lSU;
    private int lSV;
    private int lSW;
    private int lSX;
    private long lSY = 0L;
    private HashSet<ign> lSZ = new HashSet();
    private HashSet<ign> lTa = new HashSet();
    private HashSet<ign> lTb = new HashSet();
    private boolean lTc = true;
    private boolean lCf = false;
    private boolean lTd = false;
    private igm lTe;
    private float lRH = 0.0f;
    private float lTf = -1.0f;
    private ljq lSi = new ljq(65536.0f, 65536.0f, 65536.0f);
    private long lTg = 0L;
    private float lTh = 0.0f;
    private Set<igp> lTi = lcn.emx();
    private double lTj = 0.0;
    private int lTk;
    private boolean lTl;
    private boolean lTm = false;
    private boolean lTn = true;

    public ign(cgr cgr2) {
        this.lST = cgr2;
        this.lTe = igm.findCategoryFromTag(cgr2.eyN.get(0));
        if (this.lTe == null) {
            // empty if block
        }
        this.lSU = new hwn(this);
        float f = this.lTh = this.lST.eyV != null ? this.lST.eyV.ezc / this.lST.eyU.aFv : 0.0f;
        if (this.lST.eyT != null) {
            switch (this.lST.eyT) {
                case ezg: {
                    this.lTi.add(igp.lTz);
                    break;
                }
                case ezh: {
                    this.lTi.add(igp.lTA);
                }
            }
        }
        if (this.cTR()) {
            this.lTi.add(igp.lTB);
        }
        if (this.cTP()) {
            this.lTi.add(igp.lTC);
        }
        if (!lea.eps().pX(cgr2.adk)) {
            this.cUd();
        }
    }

    public cgr cTq() {
        return this.lST;
    }

    public String cTr() {
        return this.lST.eyN.get(0);
    }

    public boolean qf(String string) {
        return string.equalsIgnoreCase(this.lST.eyN.get(0));
    }

    public hwn cTs() {
        return this.lSU;
    }

    public SFGUIElementDTO cBj() {
        return this.lSU.cBj();
    }

    public int getId() {
        return this.lST.adk;
    }

    public int cTt() {
        return (int)(this.lST.eyU != null ? this.lST.eyU.aFv : 0.0f);
    }

    public int cTu() {
        return this.lSW;
    }

    public int cTv() {
        return (int)Math.max(0.0, Math.min((double)this.lSW / (double)this.cTt() * 100.0, 100.0));
    }

    public void QN(int n) {
        this.lSV = this.lSW;
        this.lSW = n;
        this.cUd();
        this.cUe();
        if (this.isInProgress() && this.cUa() && this.cTI() != igm.lSL) {
            this.qg(true);
        }
    }

    public boolean isCompleted() {
        return this.lSW >= this.cTt();
    }

    public boolean isInProgress() {
        return this.lSW > 0 && this.lSW < this.cTt();
    }

    public long qc() {
        return this.lTg;
    }

    public int cTw() {
        return this.isLocked() ? 0 : 1;
    }

    public long cTx() {
        return this.lSY;
    }

    public boolean cTy() {
        return this.lST.eyP;
    }

    public boolean isLocked() {
        return this.lTc;
    }

    public HashSet<ign> cTz() {
        return this.lSZ;
    }

    public boolean cTA() {
        if (this.lSZ != null) {
            for (ign ign2 : this.lSZ) {
                if (ign2.cTM()) continue;
                return true;
            }
        }
        return false;
    }

    public HashSet<ign> cTB() {
        return this.lTa;
    }

    public HashSet<ign> cTC() {
        return this.lTb;
    }

    public Set<ign> cTD() {
        Set<ign> set = lcn.emx();
        for (ign ign2 : this.lTb) {
            if (!ign2.cTM()) continue;
            set.add(ign2);
        }
        return set;
    }

    public String getTitle() {
        return this.lST.getDisplayName();
    }

    public loz cTE() {
        return this.lST.aOC();
    }

    public String getDescription() {
        return this.lST.getDescription();
    }

    public int cTF() {
        return (int)(this.lST.eyV != null ? this.lST.eyV.ezc : 0.0f);
    }

    public int cTG() {
        int n = this.cTF();
        for (ign ign2 : this.lSZ) {
            if (ign2.cTM() || ign2.isCompleted()) continue;
            n += ign2.cTF();
        }
        return n;
    }

    public String cTH() {
        return this.cTG() + "";
    }

    public boolean isExpanded() {
        return this.lCf;
    }

    public void setExpanded(boolean bl) {
        this.lCf = bl;
    }

    public igm cTI() {
        return this.lTe;
    }

    public float getWeight() {
        return this.lRH;
    }

    public void cTJ() {
        this.lRH = 0.0f;
    }

    public void kD(float f) {
        this.lRH += f;
    }

    public float cTK() {
        return this.lTf;
    }

    public void kE(float f) {
        this.lTf = f;
    }

    public ljq av() {
        return this.lSi;
    }

    public void c(ljq ljq2) {
        this.lSi = ljq2;
    }

    public boolean cTL() {
        return this.lTd;
    }

    public void qe(boolean bl) {
        this.lTd = bl;
    }

    public boolean cTM() {
        return this.lST.eyR;
    }

    public boolean cTN() {
        return this.lST.eyQ;
    }

    public float cTO() {
        return this.lTh;
    }

    public boolean cTP() {
        if (this.lST.eyK == null) {
            return false;
        }
        for (cgw cgw2 : this.lST.eyK.aCN) {
            if (cgw2.ezk != cgl.eyC) continue;
            return true;
        }
        return false;
    }

    public Set<igp> cTQ() {
        Set<igp> set = lcn.emx();
        set.addAll(this.lTi);
        if (this.isCompleted()) {
            set.add(igp.lTv);
        } else if (this.isInProgress()) {
            set.add(igp.lTw);
        } else if (this.isLocked()) {
            set.add(igp.lTx);
        } else {
            set.add(igp.lTy);
        }
        return set;
    }

    public boolean qg(String string) {
        return this.getTitle().toLowerCase().contains(string) || this.getDescription().toLowerCase().contains(string);
    }

    public boolean cTR() {
        return this.lST.eyM == cgj.exZ;
    }

    public cgv cTS() {
        return this.lST.eyT;
    }

    public boolean cTT() {
        return this.cTS() != null;
    }

    public ign cTU() {
        return this.lSS;
    }

    public double cTV() {
        return this.lTj;
    }

    public void dp(double d) {
        this.lTj = d;
    }

    public boolean isCancelled() {
        return !this.isCompleted() && (this.lSS == null || this.lSS.isCompleted());
    }

    public boolean cTW() {
        return this.lSS != null && this.lSS.lST.eyU instanceof chk && this.lSS.lST.eyU.aFv < (float)((chk)this.lSS.lST.eyU).ezZ.size();
    }

    public boolean a(igp igp2) {
        switch (igp2) {
            case lTv: {
                return this.isCompleted();
            }
            case lTw: {
                if (this.isInProgress()) {
                    return true;
                }
                if (this.lSZ != null) {
                    for (ign ign2 : this.lSZ) {
                        if (!ign2.isInProgress()) continue;
                        return true;
                    }
                }
                return false;
            }
            case lTx: {
                return this.isLocked();
            }
            case lTy: {
                return !this.isLocked() && !this.isCompleted();
            }
        }
        return this.lTi != null && this.lTi.contains((Object)igp2);
    }

    public int cTX() {
        return this.lTk;
    }

    public void QO(int n) {
        this.lTk = n;
    }

    public int cTY() {
        return this.lTk * this.cTF();
    }

    public boolean cTZ() {
        return this.lTl;
    }

    public void qf(boolean bl) {
        if (bl == this.lTl) {
            return;
        }
        this.lTl = bl;
        igq.lTG.V(this);
    }

    public boolean cUa() {
        return this.isInProgress() && this.cTM() && this.lTn && !this.lTl;
    }

    public boolean cUb() {
        return this.lTm;
    }

    public boolean qg(boolean bl) {
        if (bl == this.lTm) {
            return true;
        }
        if (bl && !this.cUa()) {
            return false;
        }
        this.lTm = bl;
        igq.lTH.V(this);
        return true;
    }

    public void cUc() {
        this.lTn = false;
    }

    private void cUd() {
        if (!this.lTc) {
            return;
        }
        this.lSY = System.currentTimeMillis();
        this.lTc = false;
    }

    private void cUe() {
        if (this.isCompleted() && this.lTg == 0L) {
            this.lTg = System.currentTimeMillis();
        }
    }
}

