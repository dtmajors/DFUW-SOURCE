/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
public class dqe
extends dqd {
    private ldv[] gNM = new ldv[3];
    private ldv[] gNN = new ldv[3];
    private boolean gNO;

    public boolean bsX() {
        return this.gNO;
    }

    public void iu(boolean bl) {
        this.gNO = bl;
    }

    public dqe(btk btk2) {
        super(btk2);
    }

    public void bsY() {
        for (int i = 0; i < 3; ++i) {
            if (this.gNK[i] == null || this.gNK[i].av() == null || this.gNN[i] != null) continue;
            this.Bi(i);
        }
    }

    private void Bg(int n) {
        assert (this.gNL != null);
        assert (this.gNK[n] != null);
        assert (this.gNM[n] == null);
        dxr dxr2 = this.gNL.getMessageDelegator();
        this.gNM[n] = dxr2.lL(lcr.qEa);
        glh glh2 = (glh)dxr2.h(13057, this.gNL.getGUID(), lcr.qEa);
        glh2.SpecialEffectType = this.b(this.gNK[n]);
        assert (glh2.SpecialEffectType != -1) : "waypoint wrong sfx resource type";
        glh2.aUa = this.gNM[n];
        glh2.aZD = this.gNK[n].av();
        dxr2.F(glh2);
    }

    private void Bh(int n) {
        assert (this.gNL != null);
        if (this.gNM[n] == null) {
            return;
        }
        dxr dxr2 = this.gNL.getMessageDelegator();
        glj glj2 = (glj)dxr2.h(13058, this.gNL.getGUID(), lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = this.gNM[n];
        dxr2.F(glj2);
        this.gNM[n] = null;
    }

    private void Bi(int n) {
        assert (this.gNO);
        assert (this.gNK[n] != null);
        assert (this.gNN[n] == null);
        dxr dxr2 = this.gNL.getMessageDelegator();
        ldv ldv2 = dxr2.bzv();
        ffb ffb2 = (ffb)dxr2.h(2571, this.gNL.getGUID(), lcr.acL);
        ffb2.iKO = ffb.a.iKR;
        ffb2.dbx = ldv2;
        ffb2.Rs = this.gNK[n].getGUID();
        ffb2.iKP = new ljg("Waypoint " + this.gNK[n].Hr());
        ffb2.dzN = new lhu(16, 16, "gui/targeticons/take.dds");
        ffb2.ResourceType = this.a(this.gNK[n]);
        ffb2.iKQ = this.gNK[n].av();
        ffb2.eir = 0.0f;
        ffb2.eis = new ljp(1.0f, 1.0f);
        dxr2.F(ffb2);
        this.gNN[n] = ldv2;
    }

    private int a(amo amo2) {
        int n = amo2.Hr();
        int n2 = amo2.getType();
        if (n2 == 2) {
            if (n == 0) {
                return cug.fmE;
            }
            if (n == 1) {
                return cug.fmF;
            }
            if (n == 2) {
                return cug.fmG;
            }
        } else if (n2 == 1) {
            if (n == 0) {
                return cug.fmB;
            }
            if (n == 1) {
                return cug.fmC;
            }
            if (n == 2) {
                return cug.fmD;
            }
        } else if (n2 == 0) {
            if (n == 0) {
                return cug.fmy;
            }
            if (n == 1) {
                return cug.fmz;
            }
            if (n == 2) {
                return cug.fmA;
            }
        }
        return -1;
    }

    private int b(amo amo2) {
        int n = amo2.Hr();
        int n2 = amo2.getType();
        if (n2 == 2) {
            if (n == 0) {
                return del.gki;
            }
            if (n == 1) {
                return del.gkj;
            }
            if (n == 2) {
                return del.gkk;
            }
        } else if (n2 == 1) {
            if (n == 0) {
                return del.giG;
            }
            if (n == 1) {
                return del.giH;
            }
            if (n == 2) {
                return del.giI;
            }
        } else if (n2 == 0) {
            if (n == 0) {
                return del.gkl;
            }
            if (n == 1) {
                return del.gkm;
            }
            if (n == 2) {
                return del.gkn;
            }
        }
        return -1;
    }

    private void Bj(int n) {
        if (this.gNN[n] == null) {
            return;
        }
        assert (this.gNO);
        dxr dxr2 = this.gNL.getMessageDelegator();
        ffb ffb2 = (ffb)dxr2.h(2571, this.gNL.getGUID(), lcr.acL);
        ffb2.iKO = ffb.a.iKT;
        ffb2.dbx = this.gNN[n];
        dxr2.F(ffb2);
        this.gNN[n] = null;
    }

    public final void cleanUp() {
        int n;
        for (n = 0; n < 3; ++n) {
            if (this.gNK[n] == null) continue;
            this.Bh(n);
        }
        if (!this.gNO) {
            return;
        }
        for (n = 0; n < 3; ++n) {
            this.Bj(n);
        }
    }

    public void b(amo[] amoArray) {
        int n;
        for (n = 0; n < 3; ++n) {
            if (this.gNK[n] == null || this.gNK[n].av() == null) continue;
            if (this.gNO) {
                this.Bj(n);
            }
            this.Bh(n);
        }
        this.gNK = amoArray;
        for (n = 0; n < 3; ++n) {
            if (this.gNK[n] == null) continue;
            if (this.gNK[n].av() != null) {
                if (this.gNO) {
                    this.Bi(n);
                }
                this.Bg(n);
                continue;
            }
            if (this.gNO) {
                this.Bj(n);
            }
            this.Bh(n);
        }
    }

    public void bsZ() {
        for (int i = 0; i < 3; ++i) {
            if (!this.gNO) continue;
            this.Bj(i);
        }
    }
}

