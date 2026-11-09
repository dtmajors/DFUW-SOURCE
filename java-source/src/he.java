/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ha
 *  lcr
 *  lcw
 */
import java.util.Map;

public class he {
    private final ha hF;
    private final gx abj = new gx();
    private Map<ldv, lil<ldv, ldv, String>> YH = lcn.emw();
    private Map<ldv, ldv> abk = lcn.emw();
    private Map<Integer, fwt> abl = lcn.emw();
    private int Qs = 1;
    private fwo abm = null;

    public he(ha ha2) {
        this.hF = ha2;
    }

    public gx lr() {
        return this.abj;
    }

    public void b(esv esv2) {
        if (esv2.iBx == null) {
            return;
        }
        ldv ldv2 = esv2.iBx.dbT;
        lil<ldv, ldv, String> lil2 = this.YH.remove(ldv2);
        if (lil2 == null) {
            if (this.abj.Ys && this.YH.isEmpty() && this.abk.isEmpty()) {
                this.abj.Ys = false;
            }
            return;
        }
        ldv ldv3 = lil2.getFirst();
        ldv ldv4 = lil2.eqz();
        if (this.hF.jf() == null) {
            this.d(12, ldv3);
            return;
        }
        if (this.hF.jf().aMA() == null) {
            this.d(12, ldv3);
            return;
        }
        if (this.hF.jf().aMA().mp()) {
            this.d(12, ldv3);
            return;
        }
        bdv bdv2 = esv2.iBx;
        if (bdv2 instanceof bdw) {
            int n = ((bdw)bdv2).dbU;
            bdp.a a2 = bdp.a.getPartyInviteButtonType(n);
            if (a2 == null) {
                lfn.b(5, "SFPlayerPartyManager", "handleConfirmationResponse() Buttontype==null");
                a2 = bdp.a.dbu;
            }
            switch (a2) {
                case dbt: {
                    if (this.abj.iC()) {
                        this.hF.c(mcj.uuX.bD(new Object[0]));
                        this.d(9, ldv3);
                        return;
                    }
                    if (this.abj.isLocked()) {
                        this.hF.c(mcj.uuX.bD(new Object[0]));
                        this.d(9, ldv3);
                        if (this.YH.isEmpty()) {
                            this.abj.Ys = true;
                        }
                        return;
                    }
                    this.abj.Ys = true;
                    ckd ckd2 = this.hF.kj();
                    int n2 = ckd2 != null ? ckd2.aQL() : 0;
                    fww fww2 = (fww)this.hF.getMessageDelegator().h(17925, this.hF.getGUID(), ldv4);
                    fww2.hsP = true;
                    fww2.aYc = n2;
                    fww2.eiE = ldv3;
                    fww2.hC = this.hF.aP();
                    fww2.YU = this.hF.iP();
                    fww2.YV = this.hF.iR();
                    fww2.cCF = this.hF.js();
                    fww2.iZn = this.hF.jt();
                    fww2.Qw = this.hF.getAlignment();
                    fww2.RB = this.hF.jr();
                    fww2.iZo = this.hF.iW();
                    this.hF.getMessageDelegator().F(fww2);
                    this.abk.put(ldv4, ldv3);
                    break;
                }
                case dbv: {
                    this.hF.c(ldv3, (String)lil2.reZ);
                    this.d(6, ldv3);
                    break;
                }
                case dbu: {
                    this.d(4, ldv3);
                    break;
                }
                default: {
                    this.d(3, ldv3);
                    break;
                }
            }
        } else if (bdv2 instanceof bdx) {
            this.d(3, ldv3);
        } else {
            this.d(3, ldv3);
            return;
        }
    }

    public void d(gre gre2) {
        switch (gre2.jqc) {
            case 17925: {
                ldv ldv2 = this.abk.remove(gre2.bWU());
                if (ldv2 == null) {
                    return;
                }
                this.d(10, ldv2);
                this.abj.Ys = false;
                this.hF.c(mcj.uvg.bD(new Object[0]));
                break;
            }
            default: {
                return;
            }
        }
    }

    public void a(fxe fxe2) {
        boolean bl = false;
        if (this.hF.jf() == null) {
            lfn.b(5, "SFPlayerPartyManager", "handlePartyMessage(): " + fxe2 + ": CharacterObject is null");
        } else if (this.hF.jf().aMA() == null) {
            lfn.b(5, "SFPlayerPartyManager", "handlePartyMessage(): " + fxe2 + ": SessionObjectPlayer is null");
        } else {
            bl = this.hF.jf().aMA().mp();
        }
        switch (fxe2.bEz()) {
            case 17921: {
                if (bl) {
                    fwp fwp2 = (fwp)this.hF.getMessageDelegator().h(17922, this.hF.getGUID(), fxe2.aO());
                    this.hF.getMessageDelegator().b(fxe2, fwp2);
                    fwp2.iZu = 3;
                    fwp2.cRI = lcr.qAC;
                    this.hF.getMessageDelegator().E(fwp2);
                    return;
                }
                this.a((fwo)fxe2);
                break;
            }
            case 17922: {
                fwp fwp3 = (fwp)fxe2;
                if (bl) {
                    fxe fxe3;
                    this.abj.Yu = false;
                    if (fwp3.iZu == 0) {
                        fxe3 = (fwy)this.hF.getMessageDelegator().h(17943, this.hF.getGUID(), fwp3.cRI);
                        fxe3.hsP = true;
                        this.hF.getMessageDelegator().F(fxe3);
                    }
                    fxe3 = (fwp)this.hF.getMessageDelegator().h(17922, this.hF.getGUID(), fxe2.aO());
                    this.hF.getMessageDelegator().b(fxe2, fxe3);
                    ((fwp)fxe3).iZu = 3;
                    ((fwp)fxe3).cRI = this.abj.GUID;
                    this.hF.getMessageDelegator().E(fxe3);
                    return;
                }
                this.a(fwp3);
                break;
            }
            case 17938: {
                if (bl) {
                    fxm fxm2 = (fxm)this.hF.getMessageDelegator().h(17939, this.hF.getGUID(), fxe2.aO());
                    fxm2.ew = 1;
                    this.hF.getMessageDelegator().F(fxm2);
                    return;
                }
                this.a((fxl)fxe2);
                break;
            }
            case 17939: {
                if (bl) {
                    // empty if block
                }
                this.a((fxm)fxe2);
                break;
            }
            case 17931: {
                if (bl) {
                    lfn.b(5, "SFPlayerPartyManager", "handlePartyMessage() SFPARTY_CLIENT_INVITATION_REQUEST_MESSAGE : Player is playing as a monster.");
                    fwk fwk2 = (fwk)this.hF.getMessageDelegator().h(17932, this.hF.getGUID(), fxe2.aO());
                    fwk2.ew = 1;
                    this.hF.getMessageDelegator().F(fwk2);
                    return;
                }
                this.a((fwj)fxe2);
                break;
            }
            case 17923: {
                if (bl) {
                    ldv ldv2 = ((fwu)fxe2).iZc;
                    this.d(12, ldv2);
                    return;
                }
                this.a((fwu)fxe2);
                break;
            }
            case 17926: {
                if (bl) {
                    assert (false) : "CAN NOT HAPPEN";
                    return;
                }
                this.a((fwx)fxe2);
                break;
            }
            case 17924: {
                if (bl) {
                    assert (false) : "BIG PROBLEM MAMA";
                    return;
                }
                this.a((fwv)fxe2);
                break;
            }
            case 17930: {
                if (bl) {
                    assert (false) : "This can not happen??";
                    return;
                }
                this.a((fxo)fxe2);
                break;
            }
            case 17949: {
                if (bl) {
                    lfn.b(5, "SFPlayerPartyManager", "handlePartyMessage() SFPARTY_INVITE_MEMBER_BY_NAME_MESSAGE : Player is playing as a monster.");
                    return;
                }
                this.a((fwt)fxe2);
                break;
            }
            default: {
                return;
            }
        }
    }

    public boolean iC() {
        return this.abj.iC();
    }

    public boolean aA(ldv ldv2) {
        return this.abj.aA(ldv2);
    }

    public boolean aI(ldv ldv2) {
        return this.YH.containsKey(ldv2);
    }

    public void ls() {
        if (!this.abj.iC()) {
            if (this.abj.isLocked()) {
                this.abj.Yr = true;
            }
            return;
        }
        fxn fxn2 = (fxn)this.hF.getMessageDelegator().h(17927, this.hF.getGUID(), this.abj.GUID);
        this.hF.getMessageDelegator().F(fxn2);
        fwy fwy2 = (fwy)this.hF.getMessageDelegator().h(17943, this.hF.getMessageDelegator().getGUID(), lcr.acL);
        this.hF.getMessageDelegator().F(fwy2);
        this.abj.reset();
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 5639: {
                this.a((fux)dxq2);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(fux fux2) {
        if (fux2.aqs == -1) {
            return;
        }
        fwt fwt2 = this.abl.remove(fux2.aqs);
        if (fwt2 == null) {
            return;
        }
        if (fux2.Ri == null) {
            this.hF.c(mcj.PlayerNotFound.bD(fwt2.FirstName.trim() + " " + fwt2.LastName));
            return;
        }
        fwj fwj2 = (fwj)this.hF.getMessageDelegator().h(17931, this.hF.getGUID(), this.hF.getGUID());
        fwj2.iZc = this.hF.getGUID();
        fwj2.iZd = fux2.Ri;
        this.a((fxe)fwj2);
    }

    private void a(fwj fwj2) {
        if (fwj2.iZd == null) {
            return;
        }
        if (fwj2.iZd.equals(this.hF.getGUID())) {
            this.hF.c(mcj.uuZ.bD(new Object[0]));
            return;
        }
        if (!this.abj.iC()) {
            fwk fwk2 = (fwk)this.hF.getMessageDelegator().h(17932, this.hF.getGUID(), fwj2.aO());
            fwk2.ew = 1;
            this.hF.getMessageDelegator().F(fwk2);
            return;
        }
        if (!this.abj.Yo) {
            this.hF.c(mcj.uvk.bD(new Object[0]));
            return;
        }
        if (this.abj.Yv.contains(fwj2.iZd)) {
            fwk fwk3 = (fwk)this.hF.getMessageDelegator().h(17932, this.hF.getGUID(), fwj2.aO());
            fwk3.ew = 4;
            this.hF.getMessageDelegator().F(fwk3);
            return;
        }
        int n = this.abj.Yv.size();
        int n2 = this.abj.Yp;
        int n3 = this.abj.Yq;
        if (n2 >= n3) {
            fwk fwk4 = (fwk)this.hF.getMessageDelegator().h(17932, this.hF.getGUID(), fwj2.aO());
            fwk4.ew = 2;
            this.hF.getMessageDelegator().F(fwk4);
            return;
        }
        if (n + n2 >= n3) {
            fwk fwk5 = (fwk)this.hF.getMessageDelegator().h(17932, this.hF.getGUID(), fwj2.aO());
            fwk5.ew = 3;
            this.hF.getMessageDelegator().F(fwk5);
            return;
        }
        this.abj.Yv.add(fwj2.iZd);
        fwu fwu2 = (fwu)this.hF.getMessageDelegator().h(17923, this.hF.getGUID(), fwj2.iZd);
        fwu2.iZc = fwj2.iZc;
        fwu2.cRI = this.abj.GUID;
        fwu2.iux = this.hF.iP() + " " + this.hF.iR();
        fwu2.iZo = this.hF.iW();
        this.hF.getMessageDelegator().F(fwu2);
    }

    private void a(fwo fwo2) {
        if (!this.hF.iY()) {
            return;
        }
        ldv ldv2 = this.abj.GUID;
        if (ldv2 != null) {
            fwp fwp2 = (fwp)this.hF.getMessageDelegator().h(17922, this.hF.getGUID(), fwo2.aO());
            this.hF.getMessageDelegator().b(fwo2, fwp2);
            fwp2.iZu = 2;
            fwp2.cRI = ldv2;
            this.hF.getMessageDelegator().E(fwp2);
            return;
        }
        if (this.abj.isLocked()) {
            fwp fwp3 = (fwp)this.hF.getMessageDelegator().h(17922, this.hF.getGUID(), fwo2.aO());
            this.hF.getMessageDelegator().b(fwo2, fwp3);
            fwp3.iZu = 1;
            fwp3.cRI = lcr.qAC;
            this.hF.getMessageDelegator().E(fwp3);
            return;
        }
        if (this.hF.kv()) {
            fwp fwp4 = (fwp)this.hF.getMessageDelegator().h(17922, this.hF.getGUID(), fwo2.aO());
            this.hF.getMessageDelegator().b(fwo2, fwp4);
            fwp4.iZu = 4;
            fwp4.cRI = lcr.qAC;
            this.hF.getMessageDelegator().E(fwp4);
            return;
        }
        this.abj.Yt = true;
        if (fwo2.aO().tV(this.hF.getGUID())) {
            this.abj.Yu = true;
        } else {
            this.abm = fwo2;
        }
        ldv ldv3 = lcr.ak((ldv)lcr.kAS, (int)this.hF.getGUID().ib());
        ckd ckd2 = this.hF.kj();
        int n = ckd2 != null ? ckd2.aQL() : 0;
        fwo fwo3 = (fwo)this.hF.getMessageDelegator().h(17921, this.hF.getGUID(), ldv3);
        fwo3.eiE = this.hF.getGUID();
        fwo3.hC = this.hF.aP();
        fwo3.YU = this.hF.iP();
        fwo3.YV = this.hF.iR();
        fwo3.Qw = this.hF.getAlignment();
        fwo3.cCF = this.hF.js();
        fwo3.iZn = this.hF.jt();
        fwo3.iZo = this.hF.iW();
        fwo3.RB = this.hF.jr();
        fwo3.aYc = n;
        this.hF.getMessageDelegator().F(fwo3);
    }

    private void a(fwp fwp2) {
        if (fwp2.iZu == 0) {
            // empty if block
        }
        if (this.abj.Yu) {
            this.abj.Yu = false;
            this.hF.jf().aMz().receiveMessage((dxq)fwp2);
        } else if (this.abm != null) {
            fwp2.f(this.hF.getGUID());
            fwp2.on(this.abm.aO());
            this.hF.getMessageDelegator().F(fwp2);
            this.abm = null;
        }
    }

    private void a(fwt fwt2) {
        if (fwt2.FirstName == null) {
            return;
        }
        if (fwt2.LastName == null) {
            return;
        }
        String string = (fwt2.FirstName.trim() + " " + fwt2.LastName.trim()).trim();
        if (!this.iC()) {
            this.hF.c(mcj.uvj.bD(new Object[0]));
            return;
        }
        if (!this.abj.Yo) {
            this.hF.c(mcj.uvk.bD(new Object[0]));
            return;
        }
        int n = this.Qs++;
        this.abl.put(n, fwt2);
        if (lcw.enb()) {
            fux fux2 = (fux)this.hF.getMessageDelegator().h(5639, this.hF.getGUID(), this.hF.getGUID());
            fux2.aqs = n;
            fux2.Ri = this.hF.iU().equals(string) ? this.hF.getGUID() : null;
            this.receiveMessage(fux2);
            return;
        }
        this.e(n, string);
    }

    private void a(fwu fwu2) {
        ldv ldv2 = fwu2.iZc;
        int n = 0;
        if (!this.hF.iY()) {
            n = 2;
        } else if (this.hF.aD(ldv2)) {
            n = 8;
        } else if (this.abj.iC()) {
            n = 7;
        } else if (this.abj.isLocked()) {
            n = 11;
        }
        if (n > 0) {
            this.d(n, ldv2);
            return;
        }
        ldv ldv3 = this.hF.getMessageDelegator().bzv();
        double d2 = this.hF.getMessageDelegator().arc().rgz + 20.0;
        ldv ldv4 = lcr.p((ldv)lcr.aTZ, (int)this.hF.jr(), (int)this.hF.getGUID().enw());
        bdt bdt2 = new bdt();
        bdt2.bsD = d2;
        bdt2.dbD = bds.dbB.ordinal();
        bdt2.ev = ldv3;
        bdt2.dbE = lwq.tfX.bD(fwu2.iux);
        bdt2.ed = bdu.dbF.ordinal();
        bdt2.Ri = ldv2;
        esu esu2 = (esu)this.hF.getMessageDelegator().h(18183, this.hF.getGUID(), ldv4);
        esu2.iBw = bdt2;
        this.hF.getMessageDelegator().F(esu2);
        this.YH.put(ldv3, new lil<ldv, ldv, String>(ldv2, fwu2.cRI, fwu2.iux));
    }

    private void a(fwv fwv2) {
        int n = fwv2.iuw;
        if (!this.abj.Yv.remove(fwv2.aO())) {
            return;
        }
        switch (n) {
            case 1: {
                this.hF.c(mcj.uuZ.bD(new Object[0]));
                break;
            }
            case 2: {
                this.hF.c(mcj.uvi.bD(fwv2.iux));
                break;
            }
            case 3: {
                this.hF.c(mcj.uve.bD(fwv2.iux));
                break;
            }
            case 4: {
                this.hF.c(mcj.uvc.bD(fwv2.iux));
                break;
            }
            case 5: {
                this.hF.c(mcj.uvd.bD(fwv2.iux));
                break;
            }
            case 6: {
                this.hF.c(mcj.uvb.bD(fwv2.iux));
                break;
            }
            case 7: {
                this.hF.c(mcj.uuY.bD(fwv2.iux));
                break;
            }
            case 8: {
                this.hF.c(mcj.uvf.bD(fwv2.iux));
                break;
            }
            case 9: {
                this.hF.c(mcj.uva.bD(fwv2.iux));
                break;
            }
            case 10: {
                this.hF.c(mcj.uvg.bD(new Object[0]));
                break;
            }
            case 11: {
                this.hF.c(mcj.uvh.bD(fwv2.iux));
                break;
            }
            case 12: {
                this.hF.c(mcj.uvl.bD(fwv2.iux));
                break;
            }
        }
        if (n != 5 && this.abj.Yv.isEmpty() && this.abj.Yp == 1) {
            this.ls();
        }
    }

    private void a(fwx fwx2) {
        ldv ldv2 = this.abk.remove(fwx2.aO());
        if (ldv2 == null) {
            return;
        }
        switch (fwx2.ew) {
            case 1: {
                this.d(7, ldv2);
                break;
            }
            case 3: {
                this.d(5, ldv2);
                break;
            }
            case 4: {
                this.d(12, ldv2);
                break;
            }
            default: {
                assert (false);
                return;
            }
        }
    }

    private void a(fxl fxl2) {
        ldv ldv2 = this.abj.GUID;
        if (ldv2 == null) {
            fxm fxm2 = (fxm)this.hF.getMessageDelegator().h(17939, this.hF.getGUID(), fxl2.aO());
            fxm2.ew = 1;
            this.hF.getMessageDelegator().F(fxm2);
            return;
        }
        if (this.abj.isLocked()) {
            fxm fxm3 = (fxm)this.hF.getMessageDelegator().h(17939, this.hF.getGUID(), fxl2.aO());
            fxm3.ew = 3;
            this.hF.getMessageDelegator().F(fxm3);
            return;
        }
        fxl2.f(this.hF.getGUID());
        fxl2.on(ldv2);
        fxl2.iux = this.hF.iU();
        fxl2.iZo = this.hF.iW();
        this.hF.getMessageDelegator().F(fxl2);
    }

    private void a(fxm fxm2) {
        switch (fxm2.ew) {
            case 2: {
                this.abj.reset();
                break;
            }
            case 1: {
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(fxo fxo2) {
        if (this.abj.GUID == null) {
            this.abj.GUID = fxo2.cRI;
            if (this.abj.Ys) {
                this.abj.Ys = false;
            } else if (this.abj.Yt) {
                this.abj.Yt = false;
            } else if (!this.hF.iY()) {
                // empty if block
            }
            if (!this.YH.isEmpty()) {
                // empty if block
            }
        } else if (!this.abj.GUID.equals(fxo2.cRI)) {
            return;
        }
        this.abj.Yo = fxo2.aYb;
        this.abj.Yp = fxo2.Yp;
        this.abj.Yq = fxo2.Yq;
        this.hF.L(true);
    }

    private void e(int n, String string) {
        assert (n > 0);
        assert (string != null);
        fux fux2 = (fux)this.hF.getMessageDelegator().h(5639, this.hF.getGUID(), lcr.hac);
        fux2.aqs = n;
        fux2.bc = string;
        this.hF.getMessageDelegator().F(fux2);
    }

    private void d(int n, ldv ldv2) {
        assert (ldv2 != null);
        assert (n > 0);
        fwv fwv2 = (fwv)this.hF.getMessageDelegator().h(17924, this.hF.getGUID(), ldv2);
        fwv2.iuw = n;
        fwv2.iux = this.hF.iU();
        fwv2.iZo = this.hF.iW();
        fwv2.iZE = ldv2;
        this.hF.getMessageDelegator().F(fwv2);
    }

    public void d(loz loz2) {
        if (!this.abj.iC()) {
            return;
        }
        fgs fgs2 = (fgs)this.hF.getMessageDelegator().h(29446, this.hF.getGUID(), this.abj.GUID);
        fgs2.r(loz2);
        this.hF.getMessageDelegator().F(fgs2);
    }
}

