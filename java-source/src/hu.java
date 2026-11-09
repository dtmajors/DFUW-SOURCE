/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bqk
 *  brg
 *  cdb
 *  cug
 *  hx
 *  lcr
 *  lcw
 */
public class hu
extends btk {
    public static final int adQ = 1;
    public static final int adR = 2;
    public static final int adS = 3;
    public static final String adT = "Character";
    public static final String adU = "prop\\all\\pc_dead\\player_character_tomb_stone_01.xml";
    public static final String adV = "special\\tombstone_player_characters_01.xml";
    public static final String adW = "special\\tombstone_monsters_01.xml";
    public static final String adX = "special\\tombstone_dragon_01.xml";
    public static final String adY = "special\\tombstone_dragon_ice_01.xml";
    protected static final double adZ = 30.0;
    private ldv Sy = null;
    private ldv Tu = null;
    private int aea = 0;
    private String aeb = null;
    private ljq aec = null;
    private lgl aed = null;
    private String aee = null;
    private boolean aef = false;
    protected cdb aeg;
    private static les ResourceTree = lea.enW();

    public ldv hk() {
        return this.Sy;
    }

    public void ae(ldv ldv2) {
        this.Sy = ldv2;
    }

    public ldv ho() {
        return this.Tu;
    }

    public void ai(ldv ldv2) {
        this.Tu = ldv2;
    }

    public int lZ() {
        if (!lcw.enb()) {
            return this.aea;
        }
        if (this.aea == 0 && this.aeg != null) {
            return this.aeg.az();
        }
        return this.aea;
    }

    public void ci(int n) {
        this.aea = n;
    }

    public String ma() {
        if (this.aeg == null || !this.aeg.isInitialized()) {
            return this.aeb;
        }
        ff ff2 = (ff)this.aeg.fi().ae(1328);
        if (ff2 == null) {
            return this.aeb;
        }
        return ff2.getStringValue();
    }

    public ljq mb() {
        return this.aec;
    }

    public void R(ljq ljq2) {
        this.aec = ljq2;
    }

    public lgl mc() {
        return this.aed;
    }

    public void b(lgl lgl2) {
        this.aed = lgl2;
    }

    public String getDirectoryName() {
        return this.aee;
    }

    public void setDirectoryName(String string) {
        this.aee = string;
    }

    public boolean md() {
        return this.aef;
    }

    public void R(boolean bl) {
        this.aef = bl;
    }

    public final ldv me() {
        if (this.aeg == null) {
            return null;
        }
        return this.aeg.getGUID();
    }

    public final void mf() {
        assert (this.aeg.aJD().aEP().vM() == 4);
        this.ml();
    }

    public final void S(boolean bl) {
        assert (this.aeg.aJD().aEP().vM() == 3);
        this.T(bl);
    }

    public final void b(double d2, int n) {
        assert (this.aeg.aJD().aEP().vM() == 2);
        this.c(d2, n);
    }

    public final void mg() {
        assert (this.aeg.aJD().aEP().isAlive());
        this.mm();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 6146: {
                this.a((gfn)dxq2);
                break;
            }
            case 11527: {
                this.b((fon)dxq2);
                break;
            }
            case 11530: {
                this.a((foa)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        switch (gre2.jqc) {
            case 11027: {
                break;
            }
            default: {
                super.handleSystemMessageSendingErrorMessage(gre2);
            }
        }
    }

    private void a(bvr bvr2) {
        assert (this.aeg != null);
        if (bvr2 == null) {
            this.mn();
            return;
        }
        cbv cbv2 = this.aeg.aIh();
        bvr2.setGUID(cbv2.getGUID());
        this.aeg.d((bvd)bvr2);
        this.mj();
    }

    private void b(fon fon2) {
        assert (fon2.iSe != null);
        switch (fon2.aqs) {
            case 2: {
                this.a((cdb)fon2.iSe);
                break;
            }
            case 3: {
                this.a((bvr)fon2.iSe);
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(gfn gfn2) {
        if (gfn2.dtF == null) {
            lfn.b(5, "SFSessionObject", "handleResourceCreateResponse() Resource could not be created. MessageTag=" + gfn2.aVk());
            this.mn();
            return;
        }
        switch (gfn2.aVk()) {
            case 1: {
                this.a((cni)gfn2.dtF);
                break;
            }
            case 2: {
                this.a((cdb)gfn2.dtF);
                break;
            }
            default: {
                lfn.b(5, "SFSessionObject", "handleResourceCreateResponse() Unhandled messagetag received: " + gfn2.aVk());
                assert (false);
                return;
            }
        }
    }

    protected void a(cni cni2) {
    }

    private void a(cdb cdb2) {
        assert (this.aeg == null);
        assert (cdb2 != null);
        this.aeg = cdb2;
        cbv cbv2 = this.aeg.aIh();
        assert (cbv2.aza() != null);
        if (bve.a(cbv2.aza())) {
            if (this.aeg.aAG() == null) {
                this.aV(cbv2.getFileName());
            } else {
                if (this.aeg.aAG() == null) {
                    this.mn();
                    return;
                }
                this.mj();
            }
        } else {
            bvd bvd2 = bvt.c(cbv2.aza());
            bvd2.setGUID(cbv2.getGUID());
            bvd2.setFileName(cbv2.getFileName());
            this.aeg.d(bvd2);
            this.mj();
        }
    }

    private void aV(String string) {
        foo foo2 = (foo)this.MessageDelegator.h(11526, this.GUID, lcr.qzt);
        foo2.setObjectType(13);
        foo2.setServerObject(true);
        foo2.setDirectoryName(null);
        foo2.cd(string);
        foo2.lh(true);
        foo2.pM(this.GUID);
        foo2.sk(3);
        this.MessageDelegator.E(foo2);
    }

    private void mh() {
        assert (this.aeg == null);
        this.ck(this.aea);
    }

    private void mi() {
        assert (this.aeg == null);
        assert (this.aee != null);
        foo foo2 = (foo)this.MessageDelegator.h(11526, this.GUID, lcr.qzt);
        foo2.pM(this.GUID);
        foo2.setObjectType(62);
        foo2.R(false);
        foo2.setDirectoryName(this.aee);
        foo2.cd(adT);
        foo2.lh(true);
        foo2.sk(2);
        this.MessageDelegator.F(foo2);
    }

    public final cnh a(boolean bl, String string, String string2) {
        assert (this.aeg != null);
        cnh cnh2 = hu.a(bl, this.MessageDelegator, string, string2, this.aeg.az());
        cnh2.rY(this.aeg.az());
        return cnh2;
    }

    public static final cnh a(boolean bl, dxr dxr2, String string, String string2, int n) {
        assert (dxr2 != null);
        cnh cnh2 = new cnh();
        cnh2.setGUID(dxr2.lL(lcr.qzY));
        if (ctg.ffl) {
            cnh2.by(15.0);
        } else if (bl) {
            cnh2.by(7200.0);
        } else {
            cnh2.by(420.0);
        }
        if (bl) {
            cnh2.l(cug.fgI);
            cnh2.gx(false);
        } else {
            cnh2.l(cug.fgF);
            cnh2.gx(true);
        }
        ew ew2 = new ew();
        ew2.setType(12592);
        ew2.bi(n);
        cnh2.fi().b(ew2);
        ff ff2 = new ff();
        ff2.setType(12608);
        ff2.av(string);
        cnh2.fi().b(ff2);
        ff ff3 = new ff();
        ff3.setType(12624);
        ff3.av(string2 == null ? "" : string2);
        cnh2.fi().b(ff3);
        bvu bvu2 = (bvu)bvt.c(bve.a.dQx);
        bvu2.setGUID(dxr2.lL(cnh2.getGUID()));
        if (bl) {
            bvu2.setFileName(adV);
            cnh2.setSpecialEffectType(del.gkp);
        } else if (n == cug.fhi) {
            bvu2.setFileName(adX);
            cnh2.setSpecialEffectType(del.gkr);
        } else if (n == cug.fhh) {
            bvu2.setFileName(adY);
            cnh2.setSpecialEffectType(del.gkr);
        } else {
            bvu2.setFileName(adW);
            cnh2.setSpecialEffectType(del.gkq);
        }
        bvu2.eF(true);
        cnh2.d(bvu2);
        brk brk2 = new brk();
        brk2.setGUID(dxr2.lL(cnh2.getGUID()));
        if (bl) {
            brk2.a(bqm.b.dEr);
        } else {
            brk2.a(bqm.b.dEq);
        }
        cnh2.aJC().setGUID(dxr2.lL(cnh2.getGUID()));
        cnh2.aJC().b((bqk)brk2);
        cnh2.aJC().asf().setObjectType(95);
        return cnh2;
    }

    protected void mj() {
        assert (this.aeg != null);
        assert (this.aeg.aAG() != null);
        assert (this.aeg.aJC() != null);
        assert (this.aeg.aJC().asf() != null);
        this.aeg.a(this);
        ldv ldv2 = lcr.p((ldv)this.aeg.getGUID(), (int)this.hk().ib(), (int)this.aeg.getGUID().enw());
        this.aeg.jk().mk(ldv2);
        bvr bvr2 = (bvr)this.aeg.aAG();
        bvr2.c(this.aec);
        bvr2.a(this.aed);
        bvr2.l(this.aeg.az());
        if (this.aeg.UB()) {
            this.aeg.fi().i(10944, this.aeg.az());
        }
        this.aeg.aJC().asf().setObjectType(55);
        cbv cbv2 = this.aeg.aIh();
        cbv2.c(bvr2.av());
        cbv2.a(bvr2.aw());
    }

    protected final void mk() {
        if (this.aef) {
            this.mh();
        } else {
            this.mi();
        }
    }

    protected void ml() {
        assert (this.aeg != null);
        assert (this.aeg.aJC() != null);
        assert (this.aeg.aJC().asf() != null);
        assert (this.aeg.aAG() != null);
        ((brg)this.aeg.aJC().asf()).eb(true);
    }

    protected void T(boolean bl) {
        assert (this.aeg != null);
        assert (this.aeg.aJC() != null);
        assert (this.aeg.aJC().asf() != null);
        assert (this.aeg.aAG() != null);
        if (bl) {
            this.aeg.aJC().asf().auo().avh();
        } else {
            this.aeg.aAG().l(this.aeg.az());
            if (this.aeg.UB()) {
                this.aeg.fi().i(10944, this.aeg.az());
            }
        }
    }

    protected void c(double d2, int n) {
        assert (this.aeg != null);
        assert (this.aeg.aJC() != null);
        assert (this.aeg.aJC().asf() != null);
        assert (this.aeg.aAG() != null);
        assert (d2 > 0.0);
        this.aeg.aJC().asf().auo().avh();
        this.aeg.aAG().l(cug.fgB);
        this.aeg.fi().i(10944, cug.fgB);
    }

    protected void mm() {
        assert (this.aeg != null);
        assert (this.aeg.aJC() != null);
        assert (this.aeg.aJC().asf() != null);
        assert (this.aeg.aAG() != null);
        this.aeg.aJC().asf().auo().avg();
        this.aeg.aAG().l(this.aeg.az());
        this.aeg.fi().i(10944, this.aeg.az());
    }

    protected void a(foa foa2) {
    }

    protected void mn() {
    }

    protected final void mo() {
        assert (this.aeg != null);
        assert (this.aeg.aJC() != null);
        assert (this.aeg.aJC().asf() != null);
        assert (this.aeg.aAG() != null);
        this.aeg.aJD().a(byw.c.ecC);
        ((brg)this.aeg.aJC().asf()).eb(false);
        this.aeg.aJC().asf().auo().avh();
    }

    protected void cj(int n) {
        assert (this.Sy != null);
        assert (n > 0);
        gpa gpa2 = (gpa)this.MessageDelegator.h(11027, this.GUID, this.Sy);
        gpa2.hsP = true;
        gpa2.ilE = n;
        switch (n) {
            case 1: {
                assert (this.aeg != null);
                assert (this.aeg.aAG() != null);
                gpa2.aea = this.aeg.az();
                gpa2.jot = this.aeg.getGUID();
                gpa2.aTc = this.aeg.aAG().getGUID();
                gpa2.jou = this.aeg.aJC().getGUID();
                gpa2.jov = this.aeg.aJC().asf().getGUID();
                if (this instanceof hx) {
                    hx hx2 = (hx)this;
                    gpa2.jow = hx2.mB().aJC().asf().getGUID();
                }
                gpa2.eFu = this.aeg.aJz().jl().size();
                break;
            }
            case 4: {
                break;
            }
            default: {
                return;
            }
        }
        this.MessageDelegator.E(gpa2);
    }

    public final void a(cte[] cteArray, bqy bqy2) {
        this.a(bkd.dqO, cteArray, false, bqy2);
    }

    protected final void a(int n, cte[] cteArray, boolean bl, bqy bqy2) {
        boolean bl2;
        assert (this.aeg != null);
        assert (cteArray != null);
        assert (cteArray.length > 0);
        fcy fcy2 = (fcy)this.MessageDelegator.h(9229, this.GUID, this.MessageDelegator.getGUID());
        fcy2.bst = n;
        fcy2.akX = fcy2.aZG = this.aeg.getGUID();
        fcy2.dtP = cteArray;
        fcy2.b(bqy2);
        fcy2.iyH = bl2 = cteArray[0].fey != 0;
        if (bl) {
            fcy2.dul = 8;
        }
        this.MessageDelegator.F(fcy2);
    }

    protected final void b(int n, ldv ldv2, ldv ldv3) {
        geg geg2 = (geg)this.MessageDelegator.h(769, this.GUID, this.MessageDelegator.getGUID());
        geg2.gqN = n;
        geg2.blo = ldv2;
        geg2.blp = ldv3;
        this.MessageDelegator.F(geg2);
    }

    protected final void ck(int n) {
        assert (n > 0);
        gfm gfm2 = (gfm)this.MessageDelegator.h(6145, this.GUID, lcr.qCq);
        gfm2.aqs = 2;
        gfm2.ResourceType = n;
        gfm2.iSi = 1;
        gfm2.Yc = this.GUID;
        this.MessageDelegator.I(gfm2);
    }

    protected final void g(ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        int[] nArray = new int[]{5, 7};
        gom gom2 = (gom)this.MessageDelegator.h(21765, this.GUID, lcr.qAJ);
        gom2.adA = this.Sy;
        gom2.Rs = ldv2;
        gom2.jof = nArray;
        gom2.ija = bl ? 1 : 2;
        this.MessageDelegator.F(gom2);
    }

    public void aW(String string) {
        this.aeb = string;
    }
}

