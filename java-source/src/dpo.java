/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  lcr
 */
import java.util.Set;

public class dpo
extends dqa
implements bto,
cbq {
    private static final int gMJ = 1;
    private static final int gMK = 2;
    private ldv dpx = null;
    private String bhA = null;
    private ldv aGO = null;
    private dpy gML = dpy.gND;
    private double gMM = 0.0;
    private double gMN = 0.0;
    private boolean eJL = false;
    private double gMO = 0.0;
    private beo gMP = null;
    private bfl dpJ = null;
    private int gMQ = 0;
    private int gMR = 0;
    private bgd gMS = null;
    private bge[] gMT = null;

    ldv bqi() {
        return this.dpx;
    }

    String bsb() {
        return this.bhA;
    }

    ldv bsc() {
        return this.aGO;
    }

    dpy bsd() {
        return this.gML;
    }

    double aeY() {
        return this.gML == dpy.gNE ? this.MessageDelegator.arc().rgz + this.gMM : 0.0;
    }

    double bse() {
        return this.gML == dpy.gNE ? this.aeY() - this.gMN : 0.0;
    }

    dpo(dpx dpx2) {
        super(dpx2);
    }

    @Override
    void a(pf pf2) {
        this.dpx = pf2.aGI.aGL;
        this.aGO = pf2.aGI.aGO;
        this.gML = dpy.getValueByOrdinal(pf2.aGI.mb);
        this.gMM = pf2.aGI.aGM;
        if (this.dpx != null) {
            this.a(3, new int[0], new int[0]);
            this.C(1, this.dpx);
            this.gNI = false;
        }
        this.emh.aJe();
    }

    @Override
    void b(pf pf2) {
        pf2.aGI.aGL = this.dpx;
        pf2.aGI.aGO = this.aGO;
        pf2.aGI.mb = this.gML.ordinal();
        pf2.aGI.aGM = (long)this.gMM;
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.gML == dpy.gNE) {
            if (this.gMM > 0.0) {
                this.gMM -= ldz2.qwh;
                if (this.gMM <= 0.0) {
                    this.Be(3);
                    this.gML = dpy.gNF;
                    this.gMM = 0.0;
                    this.emh.aJe();
                } else if (!this.eJL && this.gMM < jvv.dTG()) {
                    this.g(mau.ueT.bD(this.emh.getID(), this.gMM));
                    this.eJL = true;
                }
            }
        } else if (this.ddp == null) {
            this.gMO = jvv.dTE();
        } else {
            if (!this.ddp.aJm()) {
                return;
            }
            this.gMO -= ldz2.qwh;
            if (this.gMO <= 0.0) {
                this.ddp.aqw();
                this.gMO = jvv.dTE();
            }
        }
    }

    void it(boolean bl) {
        this.gML = dpy.gND;
        this.gMM = 0.0;
        if (bl && this.dpx != null) {
            this.w(1, null);
        }
        this.dpx = null;
        this.bhA = null;
        this.aGO = null;
        this.emh.aJe();
        this.emh.aJf();
    }

    @Override
    protected void bsf() {
        if (this.gML == dpy.gNE) {
            return;
        }
        this.gMP = new beo(this.ddp, this.MessageDelegator);
        this.ddp.aJc().a(this.gMP);
        this.ddp.fA(true);
        this.ddp.fB(true);
        this.ddp.a(this);
        this.dpJ = null;
        this.gMS = null;
        this.gMT = null;
        this.gMR = 0;
        this.gMQ = 0;
    }

    @Override
    protected void bsg() {
        this.ddp.aJc().b(this.gMP);
        this.gMP.b(this.MessageDelegator);
        this.gMP = null;
        this.ddp.aqw();
        this.ddp.fA(false);
        this.ddp.fB(false);
        this.ddp.a((cbq)null);
        this.dpJ = null;
        this.gMS = null;
        this.gMT = null;
        this.gMR = 0;
        this.gMQ = 0;
    }

    @Override
    public void a(cbx cbx2, et et2) {
        if (et2.getType() == 352) {
            this.gMO = jvv.dTE();
        }
    }

    @Override
    public boolean b(cbx cbx2, et et2) {
        return this.gML != dpy.gNE;
    }

    @Override
    public void b(cbx cbx2) {
        if (this.ddp == null || this.ddp != cbx2 || this.gMP == null) {
            return;
        }
        if (this.dpJ != null) {
            return;
        }
        this.dpJ = (bfl)this.ddp.aJc().aof();
        if (this.dpJ == null) {
            this.ddp.aJl();
            return;
        }
        if (this.dpJ.aYF == null) {
            this.ddp.aJl();
            return;
        }
        if (lea.enW().isDescendant(this.dpJ.bsG, cug.fgG)) {
            this.ddp.aJl();
            return;
        }
        if (this.gMT != null) {
            return;
        }
        fay fay2 = (fay)this.MessageDelegator.h(12549, this.GUID, this.GUID);
        fay2.kR(false);
        this.gMP.a(fay2);
    }

    private void bsh() {
        Set<lfs<Integer, Integer>> set;
        Object object;
        if (this.dpJ == null || this.ddp == null || this.gMT == null || this.gMR > 0) {
            return;
        }
        if (this.gMQ == 0) {
            this.dpJ = null;
            this.gMS = null;
            this.gMT = null;
            this.gMR = 0;
            this.gMQ = 0;
            this.ddp.aJl();
            this.gMP.ani();
            return;
        }
        if (this.gMQ != this.gMT.length) {
            object = new bge[this.gMQ];
            int n = 0;
            for (int i = 0; i < this.gMT.length; ++i) {
                if (this.gMT[i] == null) continue;
                object[n++] = this.gMT[i];
            }
            this.gMT = object;
        }
        object = this.gMT[0];
        if (this.gMT.length > 1 && this.gMT[1].aou() == ((bgd)object).aou()) {
            Set<bge> set2 = lcn.emx();
            for (bge bge2 : this.gMT) {
                if (bge2.aou() != ((bgd)object).aou()) break;
                set2.add(bge2);
            }
            int n = (int)(lgp.erA().nextFloat() * (float)set2.size());
            if (n < 0) {
                n = 0;
            } else if (n >= set2.size()) {
                n = set2.size() - 1;
            }
            object = set2.toArray(new bge[set2.size()])[n];
        }
        if (this.dpJ != null) {
            this.ddp.aJc().a(5, this.dpJ);
        }
        if (!(jvv.dTJ() && !((bgd)object).aov() || (set = jvv.a(this.emh.getID(), dpu.gNj, false, this.emh.bsk())).isEmpty())) {
            this.a(this.gMS.getGUID(), jvv.r(set), jvv.s(set), bqy.dGf);
            jts.a(bqy.dGf, jvv.r(set), jvv.s(set), this.emh.av(), this.MessageDelegator, this.emh.getGUID());
        }
        this.aGO = ((bge)object).aoy()[0].getGUID();
        Set<lfs<Integer, Integer>> set3 = jvv.a(this.emh.getID(), dpu.gNi, true, this.emh.bsk());
        jts.a(bqy.dGf, jvv.r(set3), jvv.s(set3), this.emh.av(), this.MessageDelegator, this.emh.getGUID());
        if (this.dpx == null) {
            this.dpx = ((bgd)object).getGUID();
            this.bhA = ((bgd)object).getName();
            this.a(2, jvv.r(set3), jvv.s(set3));
            this.emh.aJf();
        } else if (this.dpx.equals(((bgd)object).getGUID())) {
            this.a(1, jvv.r(set3), jvv.s(set3));
        } else {
            this.w(2, ((bgd)object).getName());
            this.dpx = ((bgd)object).getGUID();
            this.bhA = ((bgd)object).getName();
            this.a(2, jvv.r(set3), jvv.s(set3));
            this.emh.aJf();
        }
        this.ddp.aqw();
        this.ddp.fA(false);
        this.dpJ = null;
        this.gMS = null;
        this.gMT = null;
        this.gMR = 0;
        this.gMQ = 0;
        this.gMP.anh();
        this.gML = dpy.gNE;
        this.gMM = this.gMN = jvv.dTF();
        this.eJL = false;
        this.emh.bsQ();
        this.emh.aJe();
    }

    private void a(int n, int[] nArray, int[] nArray2) {
        exs exs2 = (exs)this.MessageDelegator.h(24068, this.GUID, this.dpx);
        exs2.hsP = true;
        exs2.iFc = this.aGO;
        exs2.cQg = this.emh.getGUID();
        exs2.cQk = this.emh.getID();
        exs2.cQi = this.emh.bsj();
        exs2.cQj = this.emh.bsk();
        exs2.cQh = this.emh.av();
        exs2.dzL = nArray;
        exs2.dzM = nArray2;
        exs2.gKV = n;
        this.MessageDelegator.F(exs2);
    }

    private void Be(int n) {
        exw exw2 = (exw)this.MessageDelegator.h(24069, this.getGUID(), this.dpx);
        exw2.ija = n;
        exw2.cQg = this.emh.getGUID();
        exw2.iFs = new int[0];
        exw2.iFr = new int[0];
        this.MessageDelegator.F(exw2);
    }

    private void w(int n, String string) {
        ext ext2 = (ext)this.MessageDelegator.h(24070, this.GUID, this.dpx);
        ext2.aET = string;
        ext2.iFf = n;
        ext2.cQg = this.emh.getGUID();
        this.MessageDelegator.F(ext2);
    }

    private void C(int n, ldv ldv2) {
        eln eln2 = (eln)this.MessageDelegator.h(13825, this.GUID, ldv2);
        eln2.aqs = n;
        eln2.hsP = true;
        this.MessageDelegator.F(eln2);
    }

    private void a(ldv ldv2, int[] nArray, int[] nArray2, bqy bqy2) {
        fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.GUID, ldv2);
        fmz2.bqd = nArray;
        fmz2.iIY = nArray2;
        fmz2.iQG = null;
        fmz2.b(bqy2);
        this.MessageDelegator.F(fmz2);
    }

    private void c(loz loz2, ldv ldv2) {
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void g(loz loz2) {
        fgo fgo2 = (fgo)this.MessageDelegator.h(29447, this.GUID, lcr.qAL);
        fgo2.r(loz2);
        this.MessageDelegator.F(fgo2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 13826: {
                this.a((elo)dxq2);
                break;
            }
            case 24074: {
                this.a((exo)dxq2);
                break;
            }
            case 12550: {
                this.a((faz)dxq2);
                break;
            }
            case 11034: {
                this.handleSystemMessageSendingErrorMessage((gre)dxq2);
                break;
            }
            case 24076: {
                this.a((exr)dxq2);
                break;
            }
            case 7956: {
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 270: {
                this.b((kcs)kcz2);
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(elo elo2) {
        switch (elo2.aVk()) {
            case 1: {
                if (this.dpx != null && this.dpx.equals(elo2.iG())) {
                    this.bhA = elo2.iV();
                }
                if (this.gNI) {
                    this.emh.aJf();
                    break;
                }
                this.gNI = true;
                this.emh.bsM();
                break;
            }
            case 2: {
                ++this.gMQ;
                --this.gMR;
                if (this.gMR != 0) break;
                this.bsh();
            }
        }
    }

    private void a(exo exo2) {
        if (this.dpx == null || !this.dpx.equals(exo2.ade)) {
            return;
        }
        this.it(false);
    }

    private void a(faz faz2) {
        if (this.ddp == null || this.gMP == null || this.dpJ == null) {
            return;
        }
        this.gMS = null;
        bgd[] bgdArray = faz2.bOb();
        int n = bgdArray.length;
        for (int i = 0; i < n; ++i) {
            bgd bgd2 = bgdArray[i];
            if (!bgd2.aov()) continue;
            if (bgd2.aow() && !iw.nE()) {
                this.c(mau.ueW.bD(new Object[0]), bgd2.getGUID());
                this.dpJ = null;
                this.gMS = null;
                this.ddp.aJl();
                this.gMP.ani();
                return;
            }
            this.gMS = bgd2;
            break;
        }
        bgd[] bgdArray2 = bgdArray = faz2.bMy() == null || faz2.bMy().length == 0 ? null : faz2.bMy()[0];
        if (bgdArray == null) {
            if (this.gMS != null) {
                this.c(mau.ueU.bD(new Object[0]), this.gMS.getGUID());
            }
            this.dpJ = null;
            this.gMS = null;
            this.ddp.aJl();
            this.gMP.ani();
            return;
        }
        this.gMT = faz2.bMy();
        this.gMR = this.gMT.length;
        for (bge bge2 : this.gMT) {
            this.C(2, bge2.getGUID());
        }
    }

    @Override
    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        switch (gre2.bWR()) {
            case 13825: {
                switch (gre2.bWS()) {
                    case 1: {
                        this.it(false);
                        break;
                    }
                    case 2: {
                        for (int i = 0; i < this.gMT.length; ++i) {
                            if (this.gMT[i] == null || !this.gMT[i].getGUID().equals(gre2.bWU())) continue;
                            this.gMP.a(this.gMT[i]);
                            this.gMT[i] = null;
                            --this.gMR;
                            if (this.gMR != 0) continue;
                            this.bsh();
                        }
                        break;
                    }
                }
                break;
            }
            case 29446: {
                lfn.b(5, this.getClass().getSimpleName(), "handleSystemMessageSendingErrorMessage() : HID Player Generic Notification Message Undelivered!!!... No Original ToGUID via This Method!!!");
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleSystemMessageSendingErrorMessage() : Something Wasn't Delivered, Previously this Would Free the Village, Without Telling the Clan!... Failed Message Type = " + gre2.jqc);
            }
        }
    }

    private void b(kcs kcs2) {
        switch (kcs2.pep) {
            case 13825: {
                if (this.gMR > 0) {
                    for (int i = 0; i < this.gMT.length; ++i) {
                        if (this.gMT[i] == null || !this.gMT[i].getGUID().equals(kcs2.hsQ)) continue;
                        this.gMP.a(this.gMT[i]);
                        this.gMT[i] = null;
                        --this.gMR;
                        if (this.gMR != 0) continue;
                        this.bsh();
                    }
                    break;
                }
                this.it(false);
                break;
            }
            case 29446: {
                lfn.b(5, this.getClass().getSimpleName(), "handleMiddlewareDeliveryErrorMessage() : HID Player Generic Notification Message Undelivered!!!... Orginal To GUID = " + kcs2.hsQ);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleMiddlewareDeliveryErrorMessage() : Something Wasn't Delivered, Previously this Would Free the Village, Without Telling the Clan!... Original Class Name = " + kcs2.peo);
            }
        }
    }

    private void a(exr exr2) {
        if (this.dpx == null || !ldv.au(this.dpx, exr2.iG())) {
            return;
        }
        this.bhA = exr2.iV();
        this.emh.aJg();
    }
}

