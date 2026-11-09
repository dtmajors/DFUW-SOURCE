/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvj
 *  hzo
 *  jjg
 *  lcr
 *  lcw
 */
import java.util.List;
import java.util.Set;

public class hso
extends btk
implements bto,
hzq,
jml {
    private static hso lcl;
    private jnz lcm = jnz.nFA;
    private boolean lcn = false;
    private Set<hsn> lco = lcn.emx();
    private Set<hsn> lcp = lcn.emx();
    private Set<hsn> lcq = lcn.emx();
    private hvj alV;
    private jme lcr;
    private hsr lcs;
    private ka lct;
    private jmx lcu;
    private jjg lcv;
    private ldv lcw;
    private dsu alW = null;
    private dsu lcx = null;
    private int lcy = -1;
    private boolean lcz = false;
    private joa lcA;
    private joa lcB;
    private int lcC = -1;
    private boolean lcD = false;
    private joa lcE;
    private joa lcF;
    jnz lcG = jnz.nFE;
    jnz lcH = jnz.nFI;
    private List<lfs<Integer, Integer>> lcI = null;
    private joa lcJ = new joa(0.0f, 0.0f, 0.0f, 0.0f);
    public final jlk lcK = new jlk();

    public static hso cxK() {
        return lcl;
    }

    public hso() {
        assert (lcw.qOR && lcw.qOQ);
    }

    public final void a(hsn hsn2) {
        this.lcp.add(hsn2);
        this.lcq.remove(hsn2);
        if (this.alW != null) {
            hsn2.oo();
        }
    }

    public final void b(hsn hsn2) {
        this.lcq.add(hsn2);
        this.lcp.remove(hsn2);
    }

    @Override
    public void doTick(ldz ldz2) {
        Object object;
        while (!this.lcp.isEmpty()) {
            object = this.lcp.iterator().next();
            this.lcp.remove(object);
            assert (!this.lco.contains(object));
            this.lco.add((hsn)object);
        }
        while (!this.lcq.isEmpty()) {
            object = this.lcq.iterator().next();
            this.lcq.remove(object);
            this.lco.remove(object);
        }
        if (this.lcx != null) {
            if (this.alW != null && (this.alW.aFG == 3 || this.alW.aFG == 1)) {
                object = (grg)this.MessageDelegator.h(11072, this.GUID, lcr.qAG);
                ((grg)object).jqh = false;
                this.MessageDelegator.F((dxq)object);
            }
            this.alW = this.lcx;
            this.lcx = null;
            for (hsn object2 : this.lco) {
                object2.oo();
            }
        }
        this.cxL();
        if (this.lcm == jnz.nFA) {
            boolean bl = true;
            for (hsn hsn2 : this.lco) {
                bl = bl && hsn2.op();
            }
            if (bl) {
                this.cxM();
            }
        }
    }

    @Override
    public void initialize() {
        assert (lcl == null);
        lcl = this;
        super.initialize();
        this.Active = true;
        this.lcs = new hsr();
        this.lcs.setGUID(lcr.qCD);
        this.alV = new hvj();
        this.alV.setGUID(lcr.acL);
        this.lcr = new jme();
        this.lcr.a(this.alV);
        this.lcr.setGUID(lcr.qCC);
        this.lct = new ka();
        this.lct.setGUID(lcr.qCF);
        this.lcu = new jmx();
        this.lcu.setGUID(this.MessageDelegator.bzv());
        this.lcv = new jjg();
        this.lcv.setGUID(this.MessageDelegator.bzv());
        this.MessageDelegator.a(this.lcs);
        this.MessageDelegator.a(this.lcr);
        this.MessageDelegator.a((amf)this.alV);
        this.MessageDelegator.a(this.lct);
        this.MessageDelegator.a((amf)this.lcv);
        this.MessageDelegator.a(this.lcu);
        this.c(true, lcr.qzp, 1);
        mil mil2 = (mil)this.MessageDelegator.BX(4);
        mil2.sy(this.MessageDelegator.bzv());
        mil2.tk(this.getGUID());
        mil2.VO(0);
        mil2.VN(127);
        this.MessageDelegator.a(mil2);
        mih mih2 = (mih)this.MessageDelegator.BX(1);
        mih2.tk(this.getGUID());
        mih2.aet(-1);
        this.MessageDelegator.a(mih2);
    }

    private void a(gpr gpr2) {
        if (gpr2.alW == null) {
            return;
        }
        switch (gpr2.alW.aFG) {
            case 3: {
                this.lcx = gpr2.alW;
                break;
            }
            case 1: {
                this.lcx = gpr2.alW;
                break;
            }
            case 2: {
                this.alW.aFG = 2;
                break;
            }
            case 4: {
                this.alW.aFG = 4;
                break;
            }
        }
    }

    private void c(boolean bl, ldv ldv2, int n) {
        if (bl) {
            fpi fpi2 = (fpi)this.MessageDelegator.h(16385, this.getGUID(), lcr.qzp);
            fpi2.iTm = n;
            this.MessageDelegator.F(fpi2);
        } else {
            fpl fpl2 = (fpl)this.MessageDelegator.h(16386, this.getGUID(), lcr.qzp);
            fpl2.iTm = n;
            this.MessageDelegator.F(fpl2);
        }
    }

    @Override
    public void cleanUp() {
        this.MessageDelegator.hd(lcr.qCC);
        this.MessageDelegator.hd(lcr.acL);
        this.MessageDelegator.hd(lcr.qCD);
        this.MessageDelegator.hd(lcr.qCF);
        this.MessageDelegator.hd(this.lcv.getGUID());
        this.MessageDelegator.hd(this.lcu.getGUID());
        this.c(false, lcr.qzp, 1);
        super.cleanUp();
        assert (lcl == this);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 11012: {
                this.a((gpr)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveWindowResponse(miw miw2) {
        switch (miw2.getType()) {
            case 7: {
                this.b((miu)miw2);
                break;
            }
            case 9: {
                this.b((miy)miw2);
                break;
            }
            case 1: {
                this.b((min)miw2);
                break;
            }
            case 6: {
                this.b((mit)miw2);
                break;
            }
            case 8: {
                this.b((miv)miw2);
                break;
            }
            case 10: {
                this.b((miz)miw2);
                break;
            }
            case 2: 
            case 5: {
                break;
            }
            default: {
                super.receiveWindowResponse(miw2);
            }
        }
    }

    private void b(miy miy2) {
        if (miy2.dRv() == 0) {
            assert (this.lcw == null);
            this.lcw = miy2.dRw();
        } else {
            this.lcw = null;
        }
    }

    private void b(miu miu2) {
        if ((miu2.ezm() & 4) != 0) {
            this.lcF = new joa(miu2.ezn(), miu2.ezo(), miu2.chN(), miu2.chO());
        }
        if ((miu2.ezm() & 2) != 0) {
            this.lcE = new joa(miu2.ezq(), miu2.ezr(), miu2.eez(), miu2.eey());
        }
        if ((miu2.ezm() & 1) != 0) {
            this.lcC = miu2.getState();
        }
        if ((miu2.ezm() & 8) != 0) {
            this.lcD = miu2.ezp();
        }
    }

    private void b(min min2) {
        if (this.cxP().cyJ() != null) {
            jah jah2 = this.cxP().cyJ().cHw();
            if (jah2 == null) {
                this.lcs.cye();
                loi.exd().shutdown();
                return;
            }
            jah2.duD();
        } else {
            hzs hzs2 = new hzs();
            hzs2.a(this);
            hzs2.a(lyi.tEF.bD(new Object[0]).exA(), (int)this.lcB.W, 15, 0, 20);
        }
    }

    @Override
    public void oH(boolean bl) {
        this.cxP().cyJ().cHy().setVisible(false);
        if (bl) {
            this.lcs.cye();
            loi.exd().shutdown();
        }
    }

    @Override
    public void O(float f2, float f3) {
        jah jah2 = this.cxP().cyJ().cHw();
        float f4 = jah2.cEU() ? this.lcB.W - jah2.getWidth() - f2 : this.lcB.W - f2;
        hzs hzs2 = this.cxP().cyJ().cHy();
        hzs2.R(f4 + 4.0f, 9.0f);
        hzs2.setVisible(true);
        hzs2.cqF();
    }

    private void b(mit mit2) {
        this.lcD = mit2.dmb();
    }

    private void b(miv miv2) {
        this.lcF = new joa(miv2.ezn(), miv2.ezo(), miv2.chN(), miv2.chO());
        this.lcE = new joa(miv2.ezq(), miv2.ezr(), miv2.eez(), miv2.eey());
    }

    private void b(miz miz2) {
        this.lcC = miz2.getState();
    }

    private void cxL() {
        if (this.lcy != this.lcC) {
            this.lcy = this.lcC;
            for (hsn hsn2 : this.lco) {
                hsn2.cB(this.lcy);
            }
        }
        if (this.lcz != this.lcD) {
            this.lcz = this.lcD;
            for (hsn hsn2 : this.lco) {
                hsn2.X(this.lcz);
            }
        }
        if (this.lcF != null) {
            if (!this.lcF.equals(this.lcB)) {
                this.lcB = this.lcF;
                for (hsn hsn2 : this.lco) {
                    hsn2.b(this.lcB);
                }
            }
            this.cyb();
            this.lcF = null;
        }
        if (this.lcE != null) {
            if (!this.lcE.equals(this.lcA)) {
                this.lcA = this.lcE;
                for (hsn hsn2 : this.lco) {
                    hsn2.a(this.lcA);
                }
            }
            this.lcE = null;
        }
    }

    private void cxM() {
        lfn.b(3, "SFHIDManager", "hidFinishedInitializing()");
        this.lcr.dMa().a(jmq.nyX, this);
        this.lcr.dMa().a(jmq.nyY, this);
        this.lcr.dMa().a(jmq.nyZ, this);
        this.lcr.dMa().a(jmq.nzb, this);
        this.lcr.dMa().a(jmq.nzc, this);
        if (lcw.bn) {
            this.a(jnz.nFB);
        } else {
            this.a(jnz.nFE);
        }
    }

    public jnz cxN() {
        return this.lcm;
    }

    public void a(jnz jnz2) {
        assert (this.isInitialized());
        if (this.lcm == jnz2) {
            return;
        }
        if (this.lcn) {
            return;
        }
        this.lcn = true;
        while (this.lcr.dMg() > 0) {
            this.lcr.dMj();
        }
        jnz jnz3 = this.lcm;
        this.lcm = jnz2;
        for (hsn hsn2 : this.lco) {
            hsn2.a(jnz3, this.lcm);
        }
        this.lcn = false;
    }

    public hzl cxO() {
        return this.alV.cxO();
    }

    public hvj cxP() {
        return this.alV;
    }

    public hsr cxQ() {
        return this.lcs;
    }

    public jme cxR() {
        return this.lcr;
    }

    public ka cxS() {
        return this.lct;
    }

    public jjg cxT() {
        return this.lcv;
    }

    public jmx cxU() {
        return this.lcu;
    }

    public final int cxV() {
        return this.lcy;
    }

    public final boolean cxW() {
        return this.lcz;
    }

    public final joa cxX() {
        if (this.lcA == null) {
            this.lcA = new joa();
        }
        return this.lcA;
    }

    public final joa cxY() {
        if (this.lcB == null) {
            this.lcB = new joa();
        }
        return this.lcB;
    }

    @Override
    public void a(jmq jmq2) {
        if (!(this.cxO() instanceof hzo)) {
            return;
        }
        hzo hzo2 = (hzo)this.cxO();
        if (hzo2.cIg()) {
            return;
        }
        if (jmq2 == jmq.nyX) {
            if (this.cxN() == jnz.nFE) {
                this.a(jnz.nFI);
            } else if (this.cxN() != jnz.nFK) {
                if (this.cxN() == jnz.nFM) {
                    hzo2.cHw().a(hyc.lmJ, false);
                } else if (this.cxN() == jnz.nFY) {
                    hzo2.cIP().cZs();
                } else if (!this.lcr.dMf()) {
                    if (hzo2.cHQ() != null && hzo2.cHQ().cRB()) {
                        hzo2.cHQ().a(ifb.a.lQn);
                    } else if (hzo2.cIr() != null && hzo2.cIr().cRQ() && lcw.emW()) {
                        hzo2.cIr().a(ifb.a.lQn, null);
                    } else {
                        this.a(jnz.nFE);
                        hzo2.cHm();
                    }
                }
            }
        } else if (jmq2 == jmq.nyZ) {
            if (this.cxN() == jnz.nFE) {
                this.a(jnz.nFG);
            } else if (this.cxN() == jnz.nFG) {
                this.a(jnz.nFE);
            }
        } else if (jmq2 == jmq.nzc) {
            if (this.cxN() == jnz.nFJ) {
                this.a(this.lcG);
            } else if (this.cxP().cyZ() != null && this.cxP().cyZ().cAw()) {
                this.lcG = this.cxN();
                this.a(jnz.nFJ);
            }
        } else if (jmq2 == jmq.nzb) {
            this.alV.cyL();
        } else if (jmq2 == jmq.nyY) {
            this.alV.cyM();
        } else {
            lfn.b(5, "SFInputManager", "handleActionTriggered(): Don't know how to handle " + (Object)((Object)jmq2));
        }
    }

    @Override
    public void a(jmq jmq2, int n) {
    }

    @Override
    public void a(jmq jmq2, double d2) {
    }

    public final dsu bAn() {
        return this.alW;
    }

    public void cxZ() {
        if (this.cxN() == jnz.nFE) {
            return;
        }
        this.lcr.dMi();
    }

    public void cya() {
        if (this.cxN() == jnz.nFE) {
            return;
        }
        this.lcr.dMj();
    }

    public void cyb() {
        if (this.cxP() == null || this.cxP().cyJ() == null || this.cxP().cyJ().cHH() == null) {
            return;
        }
        List<lfs<Integer, Integer>> list = this.cyd();
        lfs<Integer, Integer> lfs2 = null;
        for (lfs<Integer, Integer> lfs3 : list) {
            if ((Integer)lfs3.reX != (int)this.lcB.W || (Integer)lfs3.reY != (int)this.lcB.H) continue;
            lfs2 = lfs3;
            break;
        }
        if (lfs2 != null && ((Integer)lfs2.reX != (int)this.lcJ.W || (Integer)lfs2.reY != (int)this.lcJ.H)) {
            this.lcJ = new joa(0.0f, 0.0f, ((Integer)lfs2.reX).intValue(), ((Integer)lfs2.reY).intValue());
            this.lcK.dLF();
        }
    }

    public joa cyc() {
        return this.lcJ;
    }

    public List<lfs<Integer, Integer>> cyd() {
        if (this.lcI == null) {
            this.lcI = this.cxP().cyJ().cHH().cyd();
        }
        return this.lcI;
    }
}

