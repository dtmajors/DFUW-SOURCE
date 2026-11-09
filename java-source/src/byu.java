/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  cxd
 */
public class byu {
    private static final boolean dtQ = false;
    private final byx dZu;
    private boolean dZm = false;
    private boolean dZd = false;
    private boolean dZv = false;
    private boolean dZw = false;
    private float dZx = 0.0f;
    private float dZy = 0.0f;
    private float dZz = 0.0f;
    private ljq dZA = null;
    private double dZB = -1.0;
    private static final double dZC = 0.5;

    public byu(byx byx2) {
        this.dZu = byx2;
    }

    public boolean aEc() {
        return this.dZm;
    }

    public boolean aDT() {
        return this.dZd;
    }

    public boolean aEa() {
        return this.dZw;
    }

    public float aEg() {
        return this.dZz;
    }

    public void aEh() {
        if (this.dZu.aDd() == null || this.dZu.aDd().aAG() == null || this.dZu.aDd().aAG().av() == null) {
            return;
        }
        ljq ljq2 = this.dZu.aDd().aAG().av();
        if (this.dZx <= ljq2.getY()) {
            this.dZx = ljq2.getY();
        }
    }

    public void ay(int n, int n2) {
        switch (n2) {
            case 1: 
            case 5: 
            case 6: {
                this.dZw = true;
                this.dZA = this.dZu.aDd().aAG().av();
                this.dZx = this.dZA.getY();
                this.dZy = 0.0f;
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                switch (n) {
                    case 1: 
                    case 5: 
                    case 6: {
                        this.aEh();
                        this.aEk();
                        this.resetProperties();
                    }
                }
                break;
            }
            case 4: {
                if (!this.dZw) break;
                this.resetProperties();
                break;
            }
            default: {
                return;
            }
        }
    }

    public void amY() {
        this.dZm = true;
    }

    public void aEi() {
        this.dZd = true;
    }

    public void aEj() {
        this.dZv = true;
    }

    public void dF(float f2) {
        this.dZz = f2;
        if (this.dZw) {
            if (this.dZv) {
                this.dZv = false;
                this.dZy = f2;
            } else if (this.dZy < f2) {
                this.dZy = f2;
            }
            if (f2 < this.dZy) {
                // empty if block
            }
        }
    }

    public void resetProperties() {
        this.dZm = false;
        this.dZd = false;
        this.dZw = false;
        this.dZx = 0.0f;
        this.dZy = 0.0f;
        this.dZz = 0.0f;
        this.dZA = null;
    }

    private void aEk() {
        ljq ljq2 = this.dZu.aDd().aAG().azb();
        float f2 = this.dZx - ljq2.getY();
        if (f2 <= 0.0f) {
            return;
        }
        if (this.dZy <= 0.0f) {
            return;
        }
        this.c(this.dZu.aDd(), f2);
    }

    private void c(cbx cbx2, float f2) {
        assert (cbx2.getMessageDelegator() != null);
        if (this.dZB + 0.5 > cbx2.getMessageDelegator().arc().rgz) {
            return;
        }
        this.dZB = cbx2.getMessageDelegator().arc().rgz;
        boolean bl = this.dZu.aEP().aEt();
        bzc bzc2 = this.dZu.aDe();
        switch (this.dZu.aDd().getObjectType()) {
            case 110: 
            case 114: {
                double d2;
                cdb cdb2 = (cdb)this.dZu.aDd();
                if (cxd.fPN) {
                    d2 = cxd.fPO * Math.random();
                    cdb2.aJz().a(cxd.fHu, 0.0, d2, cxd.fHu, false);
                }
                if (!cxd.fPP) break;
                d2 = cxd.fPQ * Math.random();
                cdb2.aJz().a(cxd.fHH, 0.0, d2, cxd.fHH, false);
                break;
            }
            case 93: {
                break;
            }
            case 86: {
                cpf cpf2;
                cdb cdb3;
                if (!(cbx2 instanceof cpf) || (cdb3 = (cpf2 = (cpf)cbx2).aXa()) == null || cdb3.aJz() == null) break;
                double d3 = cxd.fPO * (2.0 + Math.random());
                cdb3.aJz().a(cxd.fHA, 0.0, d3, cxd.fHA, false);
                break;
            }
            default: {
                return;
            }
        }
        cbx2.a(f2, this.dZy, bzc2.edr, bl);
    }
}

