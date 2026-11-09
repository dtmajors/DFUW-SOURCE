/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  lcr
 */
public class cii {
    private final cew baO;
    private ldv eBr = null;
    private ldv eBs = null;
    private ldv eBt = null;
    private ldv eBu = null;
    private ldv eBv = null;
    private ldv eBw = null;

    public cii(cew cew2) {
        this.baO = cew2;
    }

    public void cleanUp() {
        this.aOZ();
        this.aPb();
        this.aPd();
        this.aPf();
        this.aPg();
        this.aPi();
    }

    public void d(ew ew2) {
        int n = ew2.fQ();
        if ((n & 1) > 0) {
            this.aOY();
        } else {
            this.aOZ();
        }
        if ((n & 2) > 0) {
            this.aPa();
        } else {
            this.aPb();
        }
        if ((n & 4) > 0) {
            this.aPc();
        } else {
            this.aPd();
        }
        if ((n & 8) > 0) {
            this.aPe();
        } else {
            this.aPf();
        }
    }

    public void e(ew ew2) {
        int n = ew2.getType();
        switch (n) {
            case 13712: {
                int n2 = ew2.fQ();
                if (n2 <= 0) {
                    this.aPi();
                    return;
                }
                this.aPh();
                break;
            }
            case 13696: {
                int n3 = ew2.fQ();
                if (n3 == -1) {
                    this.aPg();
                    return;
                }
                this.qr(n3);
                break;
            }
        }
    }

    private int aOV() {
        int n = cg.s(this.baO.az());
        switch (n) {
            case 1: 
            case 5: {
                return del.gjz;
            }
            case 3: {
                return del.gjA;
            }
            case 4: 
            case 6: {
                return del.gjB;
            }
            case 2: {
                return del.gjC;
            }
        }
        return del.gjz;
    }

    private int aOW() {
        int n = cg.s(this.baO.az());
        switch (n) {
            case 1: 
            case 5: {
                return del.gjD;
            }
            case 3: {
                return del.gjE;
            }
            case 4: 
            case 6: {
                return del.gjF;
            }
            case 2: {
                return del.gjG;
            }
        }
        return del.gjD;
    }

    private int aOX() {
        int n = cg.s(this.baO.az());
        switch (n) {
            case 1: 
            case 3: 
            case 5: {
                return del.gjH;
            }
            case 2: 
            case 4: 
            case 6: {
                return del.gjI;
            }
        }
        return del.gjH;
    }

    private void aOY() {
        if (this.eBr != null) {
            return;
        }
        int n = this.aOV();
        this.eBr = this.qs(n);
    }

    private void aOZ() {
        if (this.eBr != null) {
            this.kK(this.eBr);
            this.eBr = null;
        }
    }

    private void aPa() {
        if (this.eBs != null) {
            return;
        }
        int n = this.aOW();
        this.eBs = this.qs(n);
    }

    private void aPb() {
        if (this.eBs != null) {
            this.kK(this.eBs);
            this.eBs = null;
        }
    }

    private void aPc() {
        if (this.eBt != null) {
            return;
        }
        int n = this.aOX();
        this.eBt = this.qs(n);
    }

    private void aPd() {
        if (this.eBt == null) {
            return;
        }
        this.kK(this.eBt);
        this.eBt = null;
    }

    private void aPe() {
        if (this.eBu != null) {
            return;
        }
        int n = cij.qt(8);
        this.eBu = this.qs(n);
    }

    private void aPf() {
        if (this.eBu == null) {
            return;
        }
        this.kK(this.eBu);
        this.eBu = null;
    }

    private void qr(int n) {
        if (this.eBv != null) {
            return;
        }
        ayc.a a2 = lea.epQ().iK(n);
        assert (a2 != null);
        if (a2 != null) {
            this.eBv = this.qs(a2.ZH());
        }
    }

    private void aPg() {
        if (this.eBv == null) {
            return;
        }
        this.kK(this.eBv);
        this.eBv = null;
    }

    private void aPh() {
        if (this.eBw != null) {
            return;
        }
        this.eBw = this.qs(del.gjq);
    }

    private void aPi() {
        if (this.eBw == null) {
            return;
        }
        this.kK(this.eBw);
        this.eBw = null;
    }

    private ldv qs(int n) {
        if (this.baO.aAG() == null) {
            return null;
        }
        ldv ldv2 = this.baO.getMessageDelegator().lL(lcr.qEa);
        glh glh2 = (glh)this.baO.getMessageDelegator().h(13057, this.baO.getGUID(), lcr.qEa);
        glh2.SpecialEffectType = n;
        glh2.aUa = ldv2;
        glh2.akX = this.baO.aAG().getGUID();
        glh2.aZD = this.baO.aAG().av();
        this.baO.getMessageDelegator().F(glh2);
        return ldv2;
    }

    private void kK(ldv ldv2) {
        if (ldv2 == null) {
            return;
        }
        glj glj2 = (glj)this.baO.getMessageDelegator().h(13058, this.baO.getGUID(), lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = ldv2;
        this.baO.getMessageDelegator().F(glj2);
    }
}

