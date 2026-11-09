/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbj
 *  lcr
 */
public class dqf
extends dqd {
    int gNP = 0;

    public dqf(btk btk2) {
        super(btk2);
        int n = btk2 instanceof bdk ? 2 : (btk2 instanceof cbj ? 1 : 0);
        this.gNK[0] = new amo();
        this.gNK[0].setType(n);
        this.gNK[0].setColor(0);
        this.gNK[1] = new amo();
        this.gNK[1].setType(n);
        this.gNK[1].setColor(1);
        this.gNK[2] = new amo();
        this.gNK[2].setType(n);
        this.gNK[2].setColor(2);
    }

    public void a(dqg dqg2) {
        switch (dqg2.gNT) {
            case 0: {
                if (dqg2.gNU == null) {
                    return;
                }
                int n = this.bta();
                assert (this.gNK[n] != null);
                assert (this.gNK[n].getType() == 0) : "Wrong Waypoint Type!";
                this.gNK[n].c(dqg2.gNU);
                if (this.gNK[n].getGUID() == null) {
                    this.gNK[n].setGUID(this.gNL.getMessageDelegator().bzv());
                }
                this.gNP = n;
                break;
            }
            case 1: {
                assert (dqg2.gNW != null) : "Invalid Waypoint GUID!";
                int n = this.nB(dqg2.gNW);
                if (n < 0 || n > 2) break;
                this.gNK[n].c(null);
                break;
            }
            case 2: {
                assert (dqg2.gNW != null) : "Invalid Waypoint GUID!";
                assert (dqg2.gNV >= 0 && dqg2.gNV <= 2) : "Invalid Waypoint Color!";
                int n = this.nB(dqg2.gNW);
                if (n == -1 || this.gNK[n].Hr() == dqg2.gNV) break;
                int n2 = this.Bk(dqg2.gNV);
                assert (n2 >= 0 && n2 <= 2);
                int n3 = this.gNK[n].Hr();
                this.gNK[n].setColor(this.gNK[n2].Hr());
                this.gNK[n2].setColor(n3);
                break;
            }
        }
    }

    public void a(enz enz2) {
        switch (enz2.gNT) {
            case 0: {
                if (enz2.gNU == null) {
                    return;
                }
                int n = this.bta();
                assert (this.gNK[n] != null);
                assert (this.gNK[n].getType() == 2) : "Wrong Waypoint Type!";
                this.gNK[n].c(enz2.gNU);
                if (this.gNK[n].getGUID() == null) {
                    this.gNK[n].setGUID(this.gNL.getMessageDelegator().bzv());
                }
                this.gNP = n;
                break;
            }
            case 1: {
                assert (enz2.gNW != null) : "Invalid Waypoint GUID!";
                int n = this.nB(enz2.gNW);
                if (n < 0 || n > 2) break;
                this.gNK[n].c(null);
                break;
            }
            case 2: {
                assert (enz2.gNW != null) : "Invalid Waypoint GUID!";
                assert (enz2.gNV >= 0 && enz2.gNV <= 2) : "Invalid Waypoint Color!";
                int n = this.nB(enz2.gNW);
                if (n == -1 || this.gNK[n].Hr() == enz2.gNV) break;
                int n2 = this.Bk(enz2.gNV);
                assert (n2 >= 0 && n2 <= 2);
                int n3 = this.gNK[n].Hr();
                this.gNK[n].setColor(this.gNK[n2].Hr());
                this.gNK[n2].setColor(n3);
                break;
            }
        }
    }

    public void a(fxy fxy2) {
        switch (fxy2.gNT) {
            case 0: {
                if (fxy2.gNU == null) {
                    return;
                }
                int n = this.bta();
                assert (this.gNK[n] != null);
                assert (this.gNK[n].getType() == 1) : "Wrong Waypoint Type!";
                this.gNK[n].c(fxy2.gNU);
                if (this.gNK[n].getGUID() == null) {
                    this.gNK[n].setGUID(this.gNL.getMessageDelegator().bzv());
                }
                this.gNP = n;
                break;
            }
            case 1: {
                assert (fxy2.gNW != null) : "Invalid Waypoint GUID!";
                int n = this.nB(fxy2.gNW);
                if (n < 0 || n > 2) break;
                this.gNK[n].c(null);
                break;
            }
            case 2: {
                assert (fxy2.gNW != null) : "Invalid Waypoint GUID!";
                assert (fxy2.gNV >= 0 && fxy2.gNV <= 2) : "Invalid Waypoint Color!";
                int n = this.nB(fxy2.gNW);
                if (n == -1 || this.gNK[n].Hr() == fxy2.gNV) break;
                int n2 = this.Bk(fxy2.gNV);
                assert (n2 >= 0 && n2 <= 2);
                int n3 = this.gNK[n].Hr();
                this.gNK[n].setColor(this.gNK[n2].Hr());
                this.gNK[n2].setColor(n3);
                break;
            }
        }
        dxr dxr2 = this.gNL.getMessageDelegator();
        gys gys2 = (gys)dxr2.h(12044, this.gNL.getGUID(), lcr.qAI);
        gys2.juZ = this.gNK;
        dxr2.F(gys2);
    }

    private int nB(ldv ldv2) {
        for (int i = 0; i <= 2; ++i) {
            if (this.gNK[i].getGUID() == null || !this.gNK[i].getGUID().equals(ldv2)) continue;
            return i;
        }
        return -1;
    }

    private int Bk(int n) {
        for (int i = 0; i <= 2; ++i) {
            if (this.gNK[i].Hr() != n) continue;
            return i;
        }
        return -1;
    }

    private int bta() {
        int n;
        for (n = 0; n <= 2; ++n) {
            if (this.gNK[n].av() != null) continue;
            return n;
        }
        n = this.gNP + 1;
        if (n > 2) {
            n = 0;
        }
        return n;
    }

    public amo[] btb() {
        return this.gNK;
    }
}

