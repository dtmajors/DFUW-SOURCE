/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  lcr
 *  lcw
 */
import java.util.Arrays;

public class cnj
extends cni
implements brd,
cnd {
    private cwm eOa = null;
    private boolean eOb = false;
    private boolean eOc = false;
    private boolean eOd = false;
    private boolean eOe = false;
    private boolean eOf = false;
    private cnl eOg = null;
    private cnl eOh = null;
    private brg eOi = null;
    private boolean eOj = false;
    private boolean eOk = false;
    private boolean eOl = false;
    private boolean eOm = false;
    private gxo eOn = null;

    public cnj() {
        this.setObjectType(108);
    }

    public void a(cwm cwm2) {
        this.eOa = cwm2;
    }

    public boolean aUw() {
        return this.eOb;
    }

    public void gz(boolean bl) {
        this.eOc = bl;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.aJC().asf().dM(true);
        if (this.eOc) {
            assert (this.eOa != null);
            this.eOg = new cnl(this.eOa.getGUID(), this.eOa.bdI());
            this.eOg.eOq = false;
            this.eOh = new cnl(this.eOa.bdF(), this.eOa.bdJ());
            this.eOh.eOq = false;
        }
    }

    public void aUx() {
        brk brk2 = (brk)this.aJC().asf();
        if (brk2.aun().isEmpty()) {
            return;
        }
        assert (this.eOa != null);
        this.eOj = true;
        brv[] brvArray = brk2.a(bqy.dHo);
        brg brg2 = (brg)this.eOa.bdt().aFh().aJC().asf();
        int n = brvArray.length;
        for (int i = 0; i < n; ++i) {
            ldv ldv2 = brvArray[i].dIY.getGUID();
            ldv ldv3 = brg2.ji(ldv2);
            if (ldv3 == null) {
                ldv3 = brg2.aun().awe().awo().getGUID();
            } else if (!brg2.iE(ldv3)) {
                ldv3 = brg2.aun().awe().awo().getGUID();
            }
            boolean bl = brg2.a(brvArray[i], ldv3, bqy.dHo);
            if (bl) continue;
        }
    }

    public void aUy() {
        this.eOd = true;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 7946: {
                this.a((fmo)dxq2);
                break;
            }
            case 18440: {
                this.c((gxm)dxq2);
                break;
            }
            case 18442: {
                this.a((gxn)dxq2);
                break;
            }
            case 18443: {
                this.a((gxo)dxq2);
                break;
            }
            case 18444: {
                this.a((gxc)dxq2);
                break;
            }
            case 11034: {
                this.handleSystemMessageSendingErrorMessage((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    public void aUz() {
        if (!this.eOg.eOq) {
            return;
        }
        brp[] brpArray = new brp[this.eOg.eOr.length];
        int n = brpArray.length;
        for (int i = 0; i < n; ++i) {
            brpArray[i] = this.eOg.eOr[i].awk();
        }
        ldv ldv2 = this.eOh.dzZ;
        gxm gxm2 = (gxm)this.MessageDelegator.h(18440, ldv2, this.GUID);
        gxm2.eOq = true;
        gxm2.eOr = new brp[0];
        gxm2.eOs = brpArray;
        this.receiveMessage(gxm2);
    }

    @Override
    public void setScheduledForRemoval() {
        this.aUx();
        super.setScheduledForRemoval();
    }

    private void aUA() {
        assert (this.eOb);
        assert (this.eOc);
        assert (this.eOe);
        if (this.eOa != null && !this.eOd) {
            this.eOa.Ci();
        }
        this.MessageDelegator.hd(this.GUID);
    }

    private ldv jc(ldv ldv2) {
        assert (ldv2 != null);
        int n = -1;
        int n2 = ldv2.enw();
        n = n2 < 50000 || n2 >= 0x100000 ? lcr.abP((int)n2) : lcr.abS((int)n2);
        return lcr.ak((ldv)ldv2, (int)n);
    }

    private boolean a(brp[] brpArray, brp[] brpArray2) {
        if (brpArray.length != brpArray2.length) {
            return false;
        }
        int n = brpArray.length;
        for (int i = 0; i < n; ++i) {
            if (brpArray[i].equals(brpArray2[i])) continue;
            return false;
        }
        return true;
    }

    private boolean aUB() {
        assert (this.eOg.eOr != null);
        assert (this.eOg.eOs != null);
        assert (this.eOh.eOr != null);
        assert (this.eOh.eOs != null);
        if (!this.a(this.eOg.eOr, this.eOh.eOs)) {
            return false;
        }
        return this.a(this.eOg.eOs, this.eOh.eOr);
    }

    private int b(brv[] brvArray) {
        int n = 0;
        int n2 = brvArray.length;
        for (int i = 0; i < n2; ++i) {
            n += brvArray[i].atV();
        }
        return n;
    }

    private void a(gxm gxm2) {
        if (this.eOd) {
            return;
        }
        if (this.eOe) {
            return;
        }
        this.eOg.eOq = gxm2.eOq;
        if (this.eOg.eOq) {
            this.eOg.eOr = gxm2.eOr;
            this.eOg.eOs = gxm2.eOs;
            if (this.eOa.bdH()) {
                this.j(mdb.uEy.bD(new Object[0]));
                this.eOg.eOq = false;
                this.F(this.eOg.dzZ, this.eOg.eOq);
                this.E(this.eOh.dzZ, this.eOg.eOq);
            } else if (this.eOh.eOq) {
                if (this.aUB()) {
                    this.aUC();
                } else {
                    this.aUD();
                }
            } else {
                this.E(this.eOh.dzZ, this.eOg.eOq);
            }
        } else {
            this.eOg.aUH();
            this.E(this.eOh.dzZ, this.eOg.eOq);
        }
    }

    private void a(fmo fmo2) {
        assert (this.eOc);
        assert (fmo2.ilu == 1);
        if (this.eOf) {
            this.eOf = false;
            this.eOk = false;
            if (this.eOd) {
                this.aUA();
            } else {
                this.aUD();
            }
            return;
        }
        assert (this.eOb);
        assert (this.eOe);
        if (lcw.enb()) {
            this.eOg.eOv = true;
            this.eOh.eOv = true;
            this.aUA();
            return;
        }
        if (fmo2.aO().equals(this.eOg.eOu)) {
            assert (!this.eOh.eOv);
            this.eOh.eOv = true;
            if (this.eOg.eOv) {
                this.aUA();
            }
        } else if (fmo2.aO().equals(this.eOh.eOu)) {
            assert (!this.eOg.eOv);
            this.eOg.eOv = true;
            if (this.eOh.eOv) {
                this.aUA();
            }
        }
    }

    private void b(gxm gxm2) {
        if (this.eOd) {
            return;
        }
        if (this.eOe) {
            return;
        }
        this.eOh.eOq = gxm2.eOq;
        if (this.eOh.eOq) {
            this.eOh.eOr = gxm2.eOr;
            this.eOh.eOs = gxm2.eOs;
            if (this.eOa.bdH()) {
                this.j(mdb.uEy.bD(new Object[0]));
                this.eOh.eOq = false;
                this.F(this.eOh.dzZ, this.eOh.eOq);
                this.E(this.eOg.dzZ, this.eOh.eOq);
            } else if (this.eOg.eOq) {
                if (this.aUB()) {
                    this.aUC();
                } else {
                    this.aUD();
                }
            } else {
                this.E(this.eOg.dzZ, this.eOh.eOq);
            }
        } else {
            this.eOh.aUH();
            this.E(this.eOg.dzZ, this.eOh.eOq);
        }
    }

    private void a(gxc gxc2) {
        assert (this.eOc);
        if (this.eOe) {
            return;
        }
        this.aUF();
    }

    private void c(gxm gxm2) {
        assert (this.eOc);
        assert (this.eOg != null);
        assert (this.eOh != null);
        if (this.eOe) {
            return;
        }
        if (gxm2.eOq) {
            int n;
            if (gxm2.eOr == null) {
                return;
            }
            if (gxm2.eOs == null) {
                return;
            }
            brp[] brpArray = gxm2.eOr;
            int n2 = brpArray.length;
            for (n = 0; n < n2; ++n) {
                brpArray[n].GUID = lcr.O((int)0, (ldv)brpArray[n].GUID);
            }
            brpArray = gxm2.eOs;
            n2 = brpArray.length;
            for (n = 0; n < n2; ++n) {
                brpArray[n].GUID = lcr.O((int)0, (ldv)brpArray[n].GUID);
            }
            Arrays.sort(gxm2.eOr);
            Arrays.sort(gxm2.eOs);
        }
        if (gxm2.aO().equals(this.eOg.dzZ)) {
            this.a(gxm2);
        } else if (gxm2.aO().equals(this.eOh.dzZ)) {
            this.b(gxm2);
        } else {
            return;
        }
    }

    private void a(gxn gxn2) {
        Object[] objectArray;
        assert (!this.eOb);
        assert (!this.eOc);
        assert (!this.eOe);
        brg brg2 = (brg)this.eOa.bdt().aFh().aJC().asf();
        brk brk2 = (brk)this.aJC().asf();
        boolean bl = true;
        if (gxn2.dJg == null) {
            bl = false;
        } else if (brk2.auo().avf()) {
            bl = false;
        } else {
            objectArray = brk2.aun().avX();
            Arrays.sort(objectArray);
            if (!this.a((brp[])objectArray, gxn2.dJg)) {
                bl = false;
            } else if (!brk2.auo().dT(true)) {
                bl = false;
            }
        }
        objectArray = null;
        if (bl) {
            objectArray = brk2.a(bqy.dHp);
            int n = this.b((brv[])objectArray);
            if (n != gxn2.dJg.length) {
                bl = false;
            }
            int n2 = objectArray.length;
            for (int i = 0; i < n2; ++i) {
                brg2.ji(((brv)objectArray[i]).dIY.getGUID());
            }
        }
        brk2.auo().avg();
        gxo gxo2 = (gxo)this.MessageDelegator.h(18443, this.GUID, gxn2.aO());
        gxo2.jtt = bl;
        gxo2.dxt = brg2.getGUID();
        gxo2.jtu = brk2.getGUID();
        gxo2.gKU = objectArray;
        this.MessageDelegator.F(gxo2);
    }

    private void a(gxo gxo2) {
        assert (this.eOb);
        assert (this.eOc);
        assert (this.eOe);
        assert (this.eOi != null);
        if (gxo2.jtt) {
            if (gxo2.dxt == null) {
                if (this.eOa.bdN()) {
                    this.eOa.bdM();
                }
                return;
            }
            if (gxo2.jtu == null) {
                if (this.eOa.bdN()) {
                    this.eOa.bdM();
                }
                return;
            }
            if (gxo2.gKU == null) {
                if (this.eOa.bdN()) {
                    this.eOa.bdM();
                }
                return;
            }
        } else {
            this.eOb = false;
            this.eOi = null;
            this.aJC().asf().auo().avg();
            this.aUD();
            if (this.eOa.bdN()) {
                this.eOa.bdM();
            }
            return;
        }
        if (this.eOf) {
            this.a(gxo2.jtu, gxo2.gKU, bqy.dHo);
            this.eOb = false;
            this.eOi = null;
            this.aJC().asf().auo().avg();
            if (this.eOa.bdN()) {
                this.eOa.bdM();
            }
            return;
        }
        this.eOg.eOu = this.eOi.getGUID();
        this.eOh.eOu = gxo2.dxt;
        this.eOl = true;
        if (this.eOa.bdy() && this.eOa.bdA()) {
            if (this.eOa.bdt() != null && this.eOa.bdt().aFh() != null && this.eOa.bdt().aFh().mA() != null && this.eOa.bdt().aFh().mA().jZ().oO()) {
                this.eOm = true;
                this.eOn = gxo2;
                ldv ldv2 = lcr.tQ((ldv)this.eOh.dzZ);
                this.eOa.ha(true);
                this.eOa.bdt().aFh().mA().jZ().a(ldv2, this);
                if (this.eOa.bdN()) {
                    this.eOa.bdM();
                }
                return;
            }
            this.eOb = false;
            this.eOi = null;
            this.aJC().asf().auo().avg();
            this.aUD();
            if (this.eOa.bdN()) {
                this.eOa.bdM();
            }
            return;
        }
        if (this.eOg.eOr.length > 0) {
            brv[] brvArray = ((brk)this.aJC().asf()).a(bqy.dHp);
            int n = this.b(brvArray);
            if (n != this.eOg.eOr.length) {
                if (this.eOa.bdN()) {
                    this.eOa.bdM();
                }
                return;
            }
            brg brg2 = (brg)this.eOa.bdt().aFh().aJC().asf();
            int n2 = brvArray.length;
            for (int i = 0; i < n2; ++i) {
                brg2.ji(brvArray[i].dIY.getGUID());
            }
            this.a(this.eOh.eOu, brvArray, bqy.dHq);
        } else {
            this.eOg.eOv = true;
        }
        if (gxo2.gKU.length > 0) {
            this.a(this.eOg.eOu, gxo2.gKU, bqy.dHq);
        } else {
            this.eOh.eOv = true;
        }
        if (this.eOa.bdN()) {
            this.eOa.bdM();
        }
    }

    protected void handleSystemMessageSendingErrorMessage(gre gre2) {
        int n = gre2.jqc;
        switch (n) {
            case 18442: {
                lfn.b(5, "SFStorageObjectTrading", "handleSystemMessageSendingErrorMessage() Failed Message Type : " + n + " Validation did not succeed.");
                if (this.aJC() != null && this.aJC().asf() != null && this.aJC().asf().auo() != null) {
                    this.aJC().asf().auo().avg();
                }
                this.aUx();
                this.eOm = false;
                this.eOn = null;
                if (this.eOg != null) {
                    this.eOg.aUH();
                }
                if (this.eOh != null) {
                    this.eOh.aUH();
                }
                this.aUA();
                break;
            }
            case 18443: {
                assert (false) : "CAN NOT HAPPEN";
                break;
            }
            default: {
                lfn.b(5, "SFStorageObjectTrading", "handleSystemMessageSendingErrorMessage() Failed Message Type : " + n);
                assert (false) : "SFStorageObjectTrading handleSystemMessageSendingErrorMessage() Failed Message Type : " + n;
                break;
            }
        }
    }

    @Override
    public void gw(boolean bl) {
        assert (this.eOm);
        assert (this.eOn != null);
        if (!bl) {
            this.eOa.Ci();
            return;
        }
        if (this.eOg.eOr.length > 0) {
            brv[] brvArray = ((brk)this.aJC().asf()).a(bqy.dHp);
            int n = this.b(brvArray);
            if (n != this.eOg.eOr.length) {
                return;
            }
            brg brg2 = (brg)this.eOa.bdt().aFh().aJC().asf();
            int n2 = brvArray.length;
            for (int i = 0; i < n2; ++i) {
                brg2.ji(brvArray[i].dIY.getGUID());
            }
            this.a(this.eOh.eOu, brvArray, bqy.dHq);
        } else {
            this.eOg.eOv = true;
        }
        if (this.eOn.gKU.length > 0) {
            this.a(this.eOg.eOu, this.eOn.gKU, bqy.dHq);
        } else {
            this.eOh.eOv = true;
        }
    }

    @Override
    public void aUg() {
        this.eOa.Ci();
    }

    private void aUC() {
        assert (!this.eOe);
        assert (this.eOg.eOr != null);
        assert (this.eOh.eOr != null);
        assert (this.eOi == null);
        Object[] objectArray = this.aJC().asf().aun().avX();
        Arrays.sort(objectArray);
        if (!this.a((brp[])objectArray, this.eOg.eOr)) {
            this.aUD();
            return;
        }
        if (!this.aJC().asf().auo().dT(true)) {
            this.aUD();
            return;
        }
        this.eOb = true;
        this.eOe = true;
        this.eOh.eOt = this.eOa.bdz();
        this.eOi = (brg)this.eOa.bdt().aFh().aJC().asf();
        this.eOk = true;
        gxn gxn2 = (gxn)this.MessageDelegator.h(18442, this.GUID, this.eOh.eOt);
        gxn2.hsP = true;
        gxn2.dJg = this.eOh.eOr;
        this.MessageDelegator.F(gxn2);
    }

    private void aUD() {
        assert (this.eOc);
        assert (this.eOg != null);
        assert (this.eOh != null);
        this.eOe = false;
        this.eOm = false;
        this.eOn = null;
        this.eOg.aUH();
        this.eOh.aUH();
        this.D(this.eOg.dzZ, false);
        this.D(this.eOh.dzZ, false);
    }

    private void j(loz loz2) {
        ldv ldv2 = lcr.p((ldv)lcr.acL, (int)this.eOh.RB, (int)this.eOh.dzZ.enw());
        fgs fgs2 = (fgs)this.MessageDelegator.h(29446, this.GUID, ldv2);
        fgs2.r(loz2);
        this.MessageDelegator.F(fgs2);
    }

    private void a(ldv ldv2, brv[] brvArray, bqy bqy2) {
        assert (ldv2 != null);
        assert (brvArray != null);
        fmj fmj2 = (fmj)this.MessageDelegator.h(7974, this.GUID, ldv2);
        fmj2.aXQ = ldv2;
        fmj2.gKU = brvArray;
        fmj2.b(bqy2);
        this.MessageDelegator.F(fmj2);
    }

    private void aUE() {
        assert (!this.eOc);
        assert (this.eOa != null);
        ldv ldv2 = this.eOa.bdz();
        gxc gxc2 = (gxc)this.MessageDelegator.h(18444, this.GUID, ldv2);
        this.MessageDelegator.F(gxc2);
    }

    private void D(ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        gxb gxb2 = (gxb)this.MessageDelegator.h(18441, this.GUID, ldv2);
        gxb2.ija = 1;
        gxb2.eOq = bl;
        this.MessageDelegator.F(gxb2);
    }

    private void E(ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        gxb gxb2 = (gxb)this.MessageDelegator.h(18441, this.GUID, ldv2);
        gxb2.ija = 2;
        gxb2.eOq = bl;
        this.MessageDelegator.F(gxb2);
    }

    private void F(ldv ldv2, boolean bl) {
        assert (ldv2 != null);
        gxb gxb2 = (gxb)this.MessageDelegator.h(18441, this.GUID, ldv2);
        gxb2.ija = 3;
        gxb2.eOq = bl;
        this.MessageDelegator.F(gxb2);
    }

    @Override
    public final void c(brp brp2) {
        this.aUF();
    }

    @Override
    public final void a(brp brp2, int n) {
        this.aUF();
    }

    @Override
    public final void b(brp brp2, int n) {
        this.aUF();
    }

    @Override
    public final void d(brp brp2) {
        if (this.eOj) {
            return;
        }
        brg brg2 = (brg)this.eOa.bdt().aFh().aJC().asf();
        brg2.ji(brp2.GUID);
        this.aUF();
    }

    private void aUF() {
        if (this.eOc) {
            if (this.eOl) {
                return;
            }
            if (this.eOe) {
                this.eOf = true;
                this.eOk = true;
                return;
            }
            if (this.eOk) {
                return;
            }
            this.aUD();
        } else {
            this.aUE();
        }
    }

    public final boolean aUG() {
        return this.eOe;
    }
}

