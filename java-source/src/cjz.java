/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  ha
 *  lcw
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class cjz
extends cka {
    private ckm eFd = null;
    private ggp eFe = null;
    private boolean eFf = false;
    private boolean eFg = false;
    private boolean eFh = false;
    private cjx eFi = null;
    private ckd eFj = null;
    private int eFk = -1;

    public cjz(ha ha2) {
        super(ha2);
        this.eFd = new ckm(ha2);
        if (lcw.enb()) {
            this.a(null, -1, ckc.SKIRMISHER.ordinal(), cke.eFR.aOK());
        }
    }

    @Override
    void rw() {
        this.eFd.aQY();
        this.hF.jf().jm().a(11552, this.eFl.getName());
        this.hF.jf().jm().a(11536, this.eFm.getName());
        super.rw();
    }

    @Override
    void gg(boolean bl) {
        if (bl) {
            this.eEQ.clear();
        }
        ArrayList<Integer> arrayList = lcn.emv();
        int n = this.eFm.aQL();
        int n2 = this.eFm.aQM();
        for (int n3 : cxd.bfI()) {
            if (n == n3 || n2 == n3) continue;
            arrayList.add(n3);
        }
        int n4 = lea.epx().qS(n2);
        if (n4 != -1) {
            arrayList.add(n4);
        }
        ArrayList<Integer> arrayList2 = lcn.emv();
        for (Integer n5 : this.eEQ) {
            if (arrayList.contains((int)n5)) continue;
            arrayList2.add(n5);
            this.hF.jf().aJz().c(n5.intValue(), n5.intValue(), 3.14496E7);
        }
        this.eEQ.removeAll(arrayList2);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int n6 = (Integer)iterator.next();
            if (this.eEQ.contains(n6)) continue;
            this.eEQ.add(n6);
            this.hF.jf().aJz().a(n6, 0.0, 3.14496E7, n6, false);
        }
    }

    @Override
    void aQk() {
    }

    private void a(ggp ggp2) {
        if (!this.auz) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() Player state is not valid.");
            this.a(6, ggp2.aO(), ggp2.aVk(), -1.0);
            return;
        }
        if (!this.aQC()) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() Player state is not valid.");
            this.a(6, ggp2.aO(), ggp2.aVk(), -1.0);
            return;
        }
        if (this.kn()) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() System is on cooldown.");
            this.a(0, ggp2.aO(), ggp2.aVk(), -1.0);
            return;
        }
        if (this.eFe != null) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() System already proccessing another request.");
            this.a(1, ggp2.aO(), ggp2.aVk(), -1.0);
            return;
        }
        if (this.hF.jf().mp()) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() Player is controlling a monster.");
            this.a(5, ggp2.aO(), ggp2.aVk(), -1.0);
            return;
        }
        int n = ggp2.aQN();
        int n2 = ggp2.bUR();
        int n3 = ggp2.bUL();
        int n4 = ggp2.bUM();
        this.eFi = lea.epx().qU(n);
        if (this.eFi == null) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() Invalid Ordinal : " + n);
            assert (false) : "Invalid Ordinal : " + n;
            this.a(2, ggp2.aO(), ggp2.aVk(), -1.0);
            return;
        }
        this.eFj = this.eFi.aQx().get(n2);
        if (this.eFj == null) {
            lfn.b(5, this.TC, "handlePlayerRoleManagementRequestMessage() Specialization : " + n2 + " is not valid for selected role : " + this.eFi.getDisplayName());
            assert (false) : "Invalid specialization : " + n2 + " for role : " + this.eFi.getDisplayName();
            this.a(2, ggp2.aO(), ggp2.aVk(), -1.0);
            this.eFj = null;
            return;
        }
        ckk ckk2 = n3 != -1 && n4 != -1 ? lea.epw().aW(n3, n4) : null;
        int n5 = this.eFd.kh();
        this.eFk = ckk2 == null ? -1 : ckk2.getID();
        this.eFf = this.eFl.getIndex() != this.eFi.getIndex();
        this.eFg = this.eFj.getIndex() != this.eFm.getIndex() || this.eFf;
        boolean bl = this.eFh = n5 != this.eFk;
        if (!(this.eFf || this.eFg || this.eFh)) {
            this.eFf = false;
            this.eFg = false;
            this.eFh = false;
            this.eFi = null;
            this.eFj = null;
            this.eFk = -1;
            this.a(4, ggp2.aO(), ggp2.aVk(), -1.0);
            return;
        }
        this.eFe = ggp2;
        fdt fdt2 = (fdt)this.MessageDelegator.h(9250, this.getGUID(), this.hF.jf().getGUID());
        fdt2.kU(true);
        fdt2.cz(this.acj);
        fdt2.jM(true);
        fdt2.kT(true);
        fdt2.kV(true);
        this.MessageDelegator.I(fdt2);
    }

    private void a(fdu fdu2) {
        assert (this.eFe != null);
        if (!this.aQC()) {
            lfn.b(5, this.TC, "handleFunctionUseObjectDelayResponseMessage() Player state is not valid.");
            this.a(6, this.eFe.aO(), this.eFe.aVk(), -1.0);
            this.eFe = null;
            this.eFf = false;
            this.eFg = false;
            this.eFh = false;
            this.eFi = null;
            this.eFj = null;
            this.eFk = -1;
            return;
        }
        if (!fdu2.bOA()) {
            lfn.b(5, this.TC, "handleFunctionUseObjectDelayResponseMessage() Player broke the proccess.");
            this.a(6, this.eFe.aO(), this.eFe.aVk(), -1.0);
            this.eFe = null;
            this.eFf = false;
            this.eFg = false;
            this.eFh = false;
            this.eFi = null;
            this.eFj = null;
            this.eFk = -1;
            return;
        }
        if (this.eFh) {
            this.eFh = this.eFd.rg(this.eFk);
        }
        if (this.eFf) {
            this.eFl = this.eFi;
            this.hF.jf().jm().a(11552, this.eFl.getName());
        }
        if (this.eFg) {
            fa fa2;
            if (this.eFm != null && (fa2 = this.hF.jf().jm().fs()) != null) {
                fa2.bn(this.eFm.aQL());
                fa2.bn(this.eFm.aQM());
            }
            this.eFm = this.eFj;
            this.hF.jf().jm().a(11536, this.eFm.getName());
            this.hF.bW(this.eFm.aQL());
        }
        this.aQk();
        if (this.eFf || this.eFg) {
            this.gg(false);
        }
        if (this.eFf || this.eFh) {
            this.aQD();
        }
        this.hF.jf().aMy().aLB();
        this.a(3, this.eFe.aO(), this.eFe.aVk(), this.eFn);
        this.eFe = null;
        this.eFf = false;
        this.eFg = false;
        this.eFh = false;
        this.eFi = null;
        this.eFj = null;
        this.eFk = -1;
    }

    private void a(ggl ggl2) {
        Object object;
        ggm ggm2 = (ggm)this.MessageDelegator.h(30980, this.getGUID(), ggl2.aO());
        this.MessageDelegator.b(ggl2, ggm2);
        if (!this.auz) {
            ggm2.DR(4);
            this.MessageDelegator.F(ggm2);
            return;
        }
        if (!this.qk()) {
            ggm2.DR(4);
            this.MessageDelegator.F(ggm2);
            return;
        }
        ts ts2 = this.hF.kz();
        if (ts2 == null) {
            ggm2.DR(4);
            this.MessageDelegator.F(ggm2);
            return;
        }
        int n = ggl2.bUL();
        int n2 = ggl2.bUM();
        ckk ckk2 = lea.epw().aW(n, n2);
        if (ckk2 == null) {
            ggm2.DR(5);
            this.MessageDelegator.F(ggm2);
            return;
        }
        boolean bl = this.eFd.ri(ckk2.getID());
        if (!bl) {
            ggm2.DR(0);
            this.MessageDelegator.F(ggm2);
            return;
        }
        boolean bl2 = this.eFd.rl(ckk2.getID());
        if (!bl2) {
            ggm2.DR(2);
            this.MessageDelegator.F(ggm2);
            return;
        }
        int n3 = this.eFd.rj(ckk2.getIndex());
        float f = lea.epw().aX(ckk2.getIndex(), n3);
        tu tu2 = ts2.a(tv.aVC, -f, ckk2.getName());
        if (tu2 == tu.aVn) {
            ggm2.DR(4);
            this.MessageDelegator.F(ggm2);
            return;
        }
        if (tu2 == tu.aVo) {
            ggm2.DR(1);
            this.MessageDelegator.F(ggm2);
            return;
        }
        boolean bl3 = this.eFd.rk(ckk2.getID());
        ggm2.DR(bl3 ? 3 : 4);
        this.MessageDelegator.F(ggm2);
        if (ggl2.bUO()) {
            object = this.eFd.rn(this.eFd.kh());
            boolean bl4 = true;
            if (object != null && ((ckk)object).aQS() != ckk2.aQS()) {
                bl4 = false;
            }
            if (bl4) {
                this.eFd.rg(ckk2.getID());
            }
        }
        object = (fsn)this.MessageDelegator.h(30221, this.getGUID(), this.hF.getGUID());
        ((fsn)object).ObjectType = cgd.ewS.ordinal();
        ((fsn)object).bSL = ckk2.getID();
        this.MessageDelegator.I((dxq)object);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 30981: {
                this.a((ggj)dxq2);
                break;
            }
            case 30979: {
                this.a((ggl)dxq2);
                break;
            }
            case 30977: {
                this.a((ggp)dxq2);
                break;
            }
            case 9251: {
                this.a((fdu)dxq2);
                break;
            }
            default: {
                assert (false) : "Unhandled message type : " + n;
                break;
            }
        }
    }

    @Override
    public int km() {
        return this.eFd.km();
    }

    @Override
    public op[] aQr() {
        List<op> list = this.eFd.aQX();
        return list.toArray(new op[list.size()]);
    }

    @Override
    public void a(op[] opArray, int n, int n2, int n3) {
        if (n2 == -1 || !ckc.isValidOrdinal(n2)) {
            n2 = ckc.WARRIOR.ordinal();
        }
        if (n3 == -1 || cke.getValueByOrdinal(n3) == null) {
            n3 = cke.eFJ.ordinal();
        }
        this.eFl = lea.epx().qU(n2);
        if (this.eFl == null) {
            lfn.b(5, this.TC, "restoreFromPersistence() SelectedRoleOrdinal : " + n2 + " is invalid!");
            this.eFl = lea.epx().qU(ckc.WARRIOR.ordinal());
            if (this.eFl == null) {
                assert (false);
                return;
            }
            n3 = cke.eFJ.ordinal();
        }
        this.eFm = this.eFl.aQx().get(n3);
        if (this.eFm == null) {
            lfn.b(5, this.TC, "restoreFromPersistence() SelectedSpecializationOrdinal : " + n3 + " is invalid. Role : " + this.eFl.getDisplayName());
            assert (false);
            return;
        }
        this.eFd.a(opArray, n);
    }

    @Override
    Map<Integer, ckl> aQq() {
        return this.eFd.aRa();
    }

    @Override
    public int kh() {
        return this.eFd.kh();
    }

    @Override
    public cjx ki() {
        return this.eFl;
    }

    @Override
    public ckd kj() {
        return this.eFm;
    }
}

