/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  axx
 *  cug
 */
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class clb
extends cky {
    private bnb eHp = null;
    private dll eHq = null;
    private amy eHr = null;
    private cbq elf = null;
    private bfu elg = null;
    private btn elh = null;
    private bwc elc = new bwc(true);
    public static final int eHs = 1;
    private static final double eHt = 10.0;
    private static final double eHu = 1.0;
    private ell eHv = null;
    private boolean eHw = false;
    private double eHx = -1.0;
    private double eHy = -1.0;
    private StringBuffer eHz = new StringBuffer();
    private String eHA = null;

    public clb() {
        super(true);
        this.ObjectType = 103;
        this.elg = new bfu(this);
    }

    public final bfq aIv() {
        return this.elg;
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.elg.doTick(ldz2);
        this.bv(ldz2.rgz);
    }

    private void bv(double d2) {
        if (this.eHq == null) {
            return;
        }
        if (!this.eHq.isEnabled()) {
            return;
        }
        if (!this.eHw) {
            return;
        }
        if (d2 - this.eHy < 1.0) {
            return;
        }
        this.eHy = d2;
        double d3 = d2 - this.eHx;
        if (d3 > (double)this.aRt().SR()) {
            this.eHw = false;
            this.gY(this.eHA);
            return;
        }
        long l = (long)((double)this.aRt().SR() - d3);
        long l2 = TimeUnit.SECONDS.toMinutes(l);
        long l3 = TimeUnit.SECONDS.toSeconds(l);
        long l4 = l3 - TimeUnit.MINUTES.toSeconds(l2);
        this.eHz.setLength(0);
        this.eHz.append(String.format("%d min, %d sec", l2, l4));
        this.gY(this.eHA + " [" + this.eHz.toString() + "]");
    }

    public void gY(String string) {
        ej ej2 = this.fi().ae(1328);
        if (ej2 != null && ej2 instanceof ff) {
            ff ff2 = (ff)ej2;
            if (ff2.getStringValue() != null && ff2.getStringValue().equals(string)) {
                return;
            }
            ff2.av(string);
        }
    }

    public void cleanUp() {
        super.cleanUp();
        if (this.eHr != null) {
            this.eHr.HD();
            this.eHr = null;
        }
        if (this.elc != null) {
            this.elc.cleanUp();
            this.elc = null;
        }
    }

    public cbq aIL() {
        return this.elf;
    }

    public void a(cbq cbq2) {
        this.elf = cbq2;
    }

    public void receiveMessage(dxq dxq2) {
        if (this.elh != null && this.elh.a(dxq2, (btk)((Object)this))) {
            return;
        }
        switch (dxq2.bEz()) {
            case 13846: {
                this.a((ell)dxq2);
                break;
            }
            case 13828: {
                this.a((elg)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
                break;
            }
            case 7982: {
                this.a((fnf)dxq2);
                break;
            }
            case 11034: {
                this.h((gre)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(ell ell2) {
        if (!cug.wc((int)this.az())) {
            lfn.b(5, "SFGuardTowerServer", "handleClanGuardTowerBoostRequestMessage() Guard Tower Resource Type Is Not Correct.");
            assert (false);
            return;
        }
        ldv ldv2 = ell2.Ri;
        if (ldv2 == null) {
            lfn.b(5, "SFGuardTowerServer", "handleClanGuardTowerBoostRequestMessage() PSOGUID is NULL.");
            assert (false);
            return;
        }
        ldv ldv3 = ell2.afF;
        if (ldv3 == null) {
            lfn.b(5, "SFGuardTowerServer", "handleClanGuardTowerBoostRequestMessage() PlayerObjectGUID is NULL.");
            assert (false);
            return;
        }
        if (this.eHq == null) {
            return;
        }
        if (!this.eHq.isEnabled()) {
            lfn.b(5, "SFGuardTowerServer", "handleClanGuardTowerBoostRequestMessage() Tower is already boosted.");
            this.a(ell2, 7);
            return;
        }
        if (this.eHw) {
            lfn.b(5, "SFGuardTowerServer", "handleClanGuardTowerBoostRequestMessage() Tower is already boosted.");
            this.a(ell2, 0);
            return;
        }
        if (this.eHv != null) {
            lfn.b(5, "SFGuardTowerServer", "handleClanGuardTowerBoostRequestMessage() Player " + this.eHv.Ri + " is trying to boost the tower already.");
            this.a(ell2, 1);
            return;
        }
        this.eHv = ell2;
        elf elf2 = (elf)this.MessageDelegator.h(13827, this.getGUID(), ldv2);
        elf2.hsP = true;
        this.MessageDelegator.F(elf2);
    }

    private void a(elg elg2) {
        if (this.eHv == null) {
            lfn.b(5, "SFGuardTowerServer", "handleClanGUIDResponseMessage() SOMETHING IS REALLY WRONG.");
            assert (false);
            return;
        }
        if (!this.eHq.isEnabled()) {
            lfn.b(5, "SFGuardTowerServer", "handleClanGUIDResponseMessage() Tower is already boosted.");
            this.a(this.eHv, 7);
            this.eHv = null;
            return;
        }
        if (elg2.ade == null) {
            this.a(this.eHv, 2);
            this.eHv = null;
            return;
        }
        axx axx2 = this.eHq.XQ();
        if (axx2 == null) {
            assert (false);
            this.eHv = null;
            return;
        }
        ldv ldv2 = axx2.Xw();
        if (ldv2 == null) {
            this.a(this.eHv, 3);
            this.eHv = null;
            return;
        }
        if (!elg2.ade.equals(ldv2)) {
            this.a(this.eHv, 4);
            this.eHv = null;
            return;
        }
        fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.GUID, this.eHv.afF);
        fdt2.sk(elg2.aVk());
        fdt2.kU(true);
        fdt2.cz(10.0);
        fdt2.jM(true);
        this.MessageDelegator.F(fdt2);
    }

    private void a(fdu fdu2) {
        if (this.eHv == null) {
            lfn.b(5, "SFGuardTowerServer", "handleFunctionUseObjectDelayResponseMessage() SOMETHING IS REALLY WRONG.");
            assert (false);
            return;
        }
        if (!this.eHq.isEnabled()) {
            lfn.b(5, "SFGuardTowerServer", "handleFunctionUseObjectDelayResponseMessage() Tower is already boosted.");
            this.a(this.eHv, 7);
            this.eHv = null;
            return;
        }
        if (!fdu2.bOA()) {
            this.a(this.eHv, 5);
            this.eHv = null;
            return;
        }
        fne fne2 = (fne)this.MessageDelegator.h(7981, this.getGUID(), this.eHv.Ri);
        fne2.hsP = true;
        fne2.ResourceType = lea.enW().getType(this.aRt().ST());
        fne2.asi = 1;
        fne2.b(bqy.dHw);
        this.MessageDelegator.F(fne2);
    }

    private void a(fnf fnf2) {
        if (this.eHv == null) {
            lfn.b(5, "SFGuardTowerServer", "handleInventoryResourceRemoveResponseMessage() SOMETHING IS REALLY WRONG.");
            assert (false);
            return;
        }
        boolean bl = fnf2.iQM;
        if (!bl) {
            this.a(this.eHv, 6);
            this.eHv = null;
            return;
        }
        if (!this.eHq.isEnabled()) {
            lfn.b(5, "SFGuardTowerServer", "handleInventoryResourceRemoveResponseMessage() Tower is already boosted.");
            this.a(this.eHv, 7);
            this.eHv = null;
            return;
        }
        this.eHw = true;
        this.eHx = this.MessageDelegator.arc().rgz;
        this.a(this.eHv, 9);
        this.eHv = null;
    }

    private void h(gre gre2) {
        if (this.eHv != null) {
            this.a(this.eHv, 8);
            this.eHv = null;
        }
    }

    private void a(ell ell2, int n) {
        elm elm2 = (elm)this.MessageDelegator.h(13847, this.getGUID(), ell2.aO());
        elm2.ew = n;
        if (n == 6) {
            elm2.iud = ResourceTree.getType(this.aRt().SN());
            elm2.iue = 1;
        }
        this.MessageDelegator.F(elm2);
    }

    public void f(et et2) {
        if (this.elf != null && !this.elf.b(this, et2)) {
            return;
        }
        if (et2.getType() == 352) {
            bfl bfl2 = (bfl)this.elg.aof();
            if (bfl2 != null) {
                this.elg.a(5, bfl2);
            }
            if (this.elf != null) {
                this.elf.b(this);
            }
        }
        super.f(et2);
    }

    public void d(et et2, float f) {
        super.d(et2, f);
        if (this.elf != null) {
            this.elf.a(this, et2);
        }
    }

    @Override
    protected void aIw() {
        super.aIw();
        assert (this.bBu != null);
        bvd bvd2 = this.aAG();
        Map<String, eh> map = ei.ao(bvd2.getFileName());
        if (map == null) {
            assert (false);
            return;
        }
        eh eh2 = map.get("AttachPoint_GuardTower Fire 01");
        if (eh2 == null) {
            assert (false);
            return;
        }
        ljq ljq2 = new ljq(eh2.fb());
        assert (this.Initialized);
        assert (this.MessageDelegator != null);
        this.eHr = anb.a(ljq2, this.bBu, this.MessageDelegator, this);
        if (this.bBu.SP().equals((Object)asb.a.bTi)) {
            this.enable();
        }
        if (this.elb != null) {
            this.elc.setMessageDelegator(this.MessageDelegator);
            this.elc.d(this.aAG());
            this.elc.e("AttachPoint_Structure Kill 01", 20, this.elb.GC());
        }
        this.eHr.HU();
        this.eHr.HV();
        lip lip2 = cug.uH((int)this.az());
        this.eHA = lip2 != null ? lip2.esy() : cug.uV((int)this.az());
    }

    public void enable() {
        if (this.eHr != null) {
            cla cla2;
            this.eHr.HF();
            axx axx2 = this.eHq.XQ();
            if (axx2 != null && (cla2 = axx2.Zm()) != null) {
                this.eHr.a(cla2);
            }
        }
    }

    public void disable() {
        if (this.eHr != null) {
            this.eHr.HE();
        }
    }

    public void Hy() {
        this.aIw();
    }

    public void c(cla cla2) {
        if (this.eHr != null) {
            this.eHr.a(cla2);
        }
    }

    public btn aIO() {
        return this.elh;
    }

    public void a(btn btn2) {
        this.elh = btn2;
    }

    public final void a(dll dll2) {
        this.eHq = dll2;
    }

    public final dll aRu() {
        return this.eHq;
    }

    public final bnb aRv() {
        return this.eHp;
    }

    public final void a(bnb bnb2) {
        this.eHp = bnb2;
    }

    public final boolean aRw() {
        return this.eHw;
    }

    public void HU() {
        if (this.eHr != null) {
            this.eHr.HU();
        }
    }

    public void HV() {
        if (this.eHr != null) {
            this.eHr.HV();
        }
    }

    public ldv aIY() {
        if (this.eHq == null) {
            return null;
        }
        if (this.eHq.XQ() == null) {
            return null;
        }
        return this.eHq.XQ().Xw();
    }

    public ldv acm() {
        if (this.eHq == null) {
            return null;
        }
        if (this.eHq.XQ() == null) {
            return null;
        }
        return this.eHq.XQ().getGUID();
    }

    public boolean dv(ldv ldv2) {
        return this.eHq == null ? false : this.eHq.dv(ldv2);
    }

    public boolean dw(ldv ldv2) {
        return this.eHq == null ? false : this.eHq.dw(ldv2);
    }

    public boolean dx(ldv ldv2) {
        return this.eHq == null ? false : this.eHq.dx(ldv2);
    }

    public boolean dy(ldv ldv2) {
        return this.eHq == null ? false : this.eHq.dy(ldv2);
    }

    public boolean dz(ldv ldv2) {
        return this.eHq == null ? false : this.eHq.dz(ldv2);
    }
}

