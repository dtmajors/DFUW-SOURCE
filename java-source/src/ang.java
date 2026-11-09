/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.Map;
import java.util.Set;

public class ang
extends ane {
    private boolean bEJ;
    private ljp[] bEK = null;
    private anc.a bEL;
    private final anz bEM;
    private int bEN;
    private double bEO;
    private a bEP;
    private boolean bEQ;
    private ldv bER;
    private ldv bES;
    private boolean bET = false;
    private final Map<ldv, ljq> ayG = lcn.emw();

    public boolean KS() {
        if (this.bEP == a.bEV) {
            return true;
        }
        return this.bEP == a.bEW;
    }

    public boolean KT() {
        return this.bEP == a.bEX;
    }

    public boolean isCreated() {
        return this.bEJ;
    }

    public boolean KU() {
        return this.bEQ;
    }

    public void KV() {
        this.bEQ = false;
    }

    public boolean KW() {
        if (this.bCq == null) {
            return true;
        }
        return this.bCq.bVO;
    }

    public boolean ho(int n) {
        if (this.bCq == null) {
            return false;
        }
        Set<Integer> set = this.bCq.TP();
        if (set == null) {
            return false;
        }
        return set.contains(n);
    }

    public boolean hp(int n) {
        if (this.bCq == null) {
            return false;
        }
        Set<Integer> set = this.bCq.TQ();
        if (set == null) {
            return false;
        }
        return set.contains(n);
    }

    public void a(anc.a a2, ljp[] ljpArray) {
        this.bEL = a2;
        this.bEK = ljpArray;
        this.bEN = 0;
    }

    public int KX() {
        if (this.bCq == null) {
            return 1;
        }
        return this.bCq.bVL;
    }

    public ldv KY() {
        return this.bCl;
    }

    public ljq av() {
        return this.bEM.av();
    }

    public boolean KZ() {
        return this.bEL == anc.a.bCc || this.bEL == anc.a.bCd || this.bEL == anc.a.bCe;
    }

    public ang(String string, dxr dxr2, ljq ljq2, asc asc2) {
        super(string, dxr2, ljq2);
        this.bEM = new anz(this.ath, this.bCn, asc2);
        this.bEL = anc.a.bCb;
        this.a(a.bFb);
        this.bEO = 0.0;
        if (this.bCq != null) {
            this.bEM.K(this.bCq.bVM);
            this.bEM.J(this.bCq.bVN);
            this.bEM.bB(this.bCq.bIC);
        }
    }

    private void La() {
        if (this.bER == null) {
            return;
        }
        int[] nArray = new int[]{2, 3, 7, 5, 6};
        fbb fbb2 = (fbb)this.MessageDelegator.h(12545, this.GUID, this.bER);
        fbb2.iHR = this.GUID;
        fbb2.dhI = nArray;
        this.MessageDelegator.F(fbb2);
    }

    private void Lb() {
        if (this.bER == null) {
            return;
        }
        fbg fbg2 = (fbg)this.MessageDelegator.h(12547, this.GUID, this.bER);
        fbg2.iHR = this.GUID;
        this.MessageDelegator.F(fbg2);
    }

    private void br(boolean bl) {
        if (this.bCm == null) {
            return;
        }
        if (!bl && !this.bEJ) {
            return;
        }
        grf grf2 = (grf)this.MessageDelegator.h(11097, this.GUID, lcr.qAJ);
        grf2.Sy = lcr.qzq;
        grf2.Rs = this.bCm;
        grf2.ResourceType = this.ResourceType;
        grf2.jqg = bl;
        this.MessageDelegator.F(grf2);
    }

    @Override
    public void Id() {
        super.Id();
        this.br(false);
        this.Lb();
        this.ayG.clear();
    }

    private void b(fuu fuu2) {
        this.bES = fuu2.dtj;
        this.bER = lcr.al((ldv)this.bES, (int)this.bCm.ib());
        this.La();
    }

    private void E(double d2) {
        if (this.bEP == a.bFb) {
            return;
        }
        ljp ljp2 = null;
        boolean bl = false;
        if (this.bEP == a.bEY) {
            bl = true;
        }
        if (this.bEL == anc.a.bCe && this.bEK != null) {
            if (this.bEN < this.bEK.length) {
                ljp2 = this.bEK[this.bEN];
            } else {
                this.a(a.bFb);
                this.a(anc.a.bCb, null);
                return;
            }
        }
        boolean bl2 = false;
        boolean bl3 = false;
        while (this.bEM.N(d2)) {
            if (this.bEP == a.bEW) continue;
            if (this.bEP != a.bEV && this.bEP != a.bEZ && this.bEP != a.bFa) {
                bl2 = this.bEM.a(ljp2, bl);
            }
            bl3 = true;
        }
        if (bl3) {
            this.bEM.OH();
        }
        if (bl2) {
            ++this.bEN;
        }
    }

    public void a(ljq ljq2, double d2, float f) {
        if (ljq2 == null) {
            return;
        }
        if (this.bEP == a.bFa) {
            return;
        }
        if (this.bEP == a.bEY) {
            return;
        }
        if (this.bEP == a.bEZ) {
            return;
        }
        if (this.av().ez(ljq2) > f) {
            return;
        }
        this.F(d2);
    }

    public void F(double d2) {
        if (this.bEP == a.bFa) {
            return;
        }
        if (this.bEP == a.bEY) {
            return;
        }
        if (arw.bRW) {
            return;
        }
        if (this.bEP != a.bEZ) {
            this.hg(65907);
        }
        this.a(a.bEZ);
        this.a(anc.a.bCb, null);
        this.bEO = d2 + 0.6 + 0.6 * Math.random();
    }

    public void Lc() {
        if (this.bEP == a.bFa) {
            return;
        }
        if (arw.bRW) {
            return;
        }
        if (this.bEP != a.bEY) {
            this.hg(0x10000E);
        }
        this.a(a.bEY);
        this.bEO += 10.0 * (1.0 + Math.random());
    }

    public void Ld() {
        if (this.bEP == a.bFa) {
            return;
        }
        if (this.bEP == a.bEY) {
            return;
        }
        if (this.bEP == a.bEZ) {
            return;
        }
        if (arw.bRW) {
            return;
        }
        if (this.bEP != a.bEX) {
            this.hg(983046);
        }
        this.a(a.bEX);
        this.bEO += 10.0 * (1.0 + Math.random());
    }

    private void a(fbf fbf2) {
        assert (fbf2 != null);
        bfn bfn2 = fbf2.iIb;
        assert (bfn2 != null);
        switch (bfn2.Type) {
            case 2: 
            case 3: {
                if (this.bEP != a.bEY) {
                    this.a(anc.a.bCb, null);
                }
                this.Lc();
                if (!this.KW()) {
                    this.bET = true;
                }
                this.bEQ = true;
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                this.a(a.bFa);
            }
        }
    }

    @Override
    protected void a(dyc dyc2) {
        this.bEJ = true;
    }

    @Override
    protected void a(dyd dyd2) {
        super.a(dyd2);
        this.br(true);
    }

    public void a(dyp dyp2) {
        if (dyp2 == null) {
            return;
        }
        if (dyp2.Ui == null) {
            return;
        }
        if (dyp2.iiU) {
            this.ayG.put(dyp2.Ui, dyp2.Position);
        } else {
            this.ayG.remove(dyp2.Ui);
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 12548: {
                this.a((fbf)dxq2);
                break;
            }
            case 13314: {
                this.a((dyc)dxq2);
                break;
            }
            case 5636: {
                this.b((fuu)dxq2);
                break;
            }
            case 13333: {
                this.a((dyp)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private boolean G(double d2) {
        if (this.ayG.isEmpty()) {
            return false;
        }
        if (!this.KW() && !this.bET) {
            if (this.bEP == a.bEX || this.bEP == a.bEY || this.bEP == a.bEZ) {
                return false;
            }
            this.Ld();
            return true;
        }
        if (this.bEO <= d2 && this.bEP == a.bEY) {
            this.Lc();
            return true;
        }
        if (this.bEP != a.bEY && this.bEP != a.bEZ) {
            if (this.bET) {
                this.Lc();
            } else {
                this.F(d2);
            }
            return true;
        }
        return false;
    }

    private void H(double d2) {
        if (this.G(d2)) {
            return;
        }
        if (this.bEP == a.bFa) {
            return;
        }
        if (this.bEP != a.bFb && this.bEO > d2) {
            return;
        }
        double d3 = Math.random();
        if (arw.bRW) {
            d3 = 0.0;
        }
        switch (this.bEP) {
            case bEV: {
                this.a(a.bEW);
                break;
            }
            case bEZ: {
                this.a(a.bEY);
                break;
            }
            case bFb: 
            case bEW: 
            case bEX: 
            case bEY: {
                if (d3 > 0.9 && this.KW()) {
                    this.a(a.bEY);
                    break;
                }
                if (d3 > 0.7) {
                    this.a(a.bEX);
                    break;
                }
                this.a(a.bEV);
            }
        }
        switch (this.bEP) {
            case bEV: {
                if (Math.random() > 0.3) {
                    this.hg(65539);
                } else {
                    this.hg(65537);
                }
                this.bEO = d2 + 0.5;
                break;
            }
            case bEW: {
                this.bEO = d2 + 5.0 * (1.0 + 2.0 * Math.random());
                break;
            }
            case bEX: {
                this.hg(983046);
                this.bEO = d2 + 5.0 * (1.0 + 7.0 * Math.random());
                break;
            }
            case bEY: {
                this.hg(0x10000E);
                this.bEO = d2 + 5.0 * (1.0 + 3.0 * Math.random());
            }
        }
    }

    private void Le() {
        if (!this.bEM.OG()) {
            return;
        }
        if (this.bCl != null) {
            fut fut2 = (fut)this.MessageDelegator.h(5635, this.GUID, this.bCl);
            fut2.Ib(1);
            fut2.iXu = true;
            this.MessageDelegator.F(fut2);
        }
        this.bEM.a(this.MessageDelegator, this.GUID, this.bCl);
    }

    public void I(double d2) {
        if (this.isTerminated()) {
            return;
        }
        if (!this.isCreated()) {
            return;
        }
        this.Le();
        this.H(d2);
        this.E(d2);
    }

    private void a(a a2) {
        a a3 = this.bEP;
        this.bEP = a2;
        if (a3 != this.bEP && arw.Sx() < 0.2f) {
            switch (this.bEP) {
                case bEV: 
                case bEW: 
                case bEX: {
                    this.a(asf.a.bTX);
                    break;
                }
                case bEZ: {
                    this.a(asf.a.bTO);
                    break;
                }
                case bEY: {
                    this.a(asf.a.bTW);
                    break;
                }
            }
        }
    }
}

