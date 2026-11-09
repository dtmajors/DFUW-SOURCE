/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  cyt
 *  hyn
 *  hzo
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;
import spenefett.hid.gui.serialization.dto.SFGUIElementListDTO;

public class iew
extends ier
implements hwf,
hyy.c {
    protected les lPy = null;
    protected ldy lPz = null;
    protected Set<ldy> lPA = lcn.emx();
    protected Map<Integer, ldy> lPB = lcn.emw();
    protected boolean lPC = false;
    protected boolean lPD = false;
    int lPE = -1;

    public iew(boolean bl) {
        super("SkillsList", "SkillsList.swf");
        this.lPC = bl;
        this.OQ(jnz.nGq);
        this.a(hya.lmu, false);
        this.a(hyb.lmC);
        this.lPy = lea.eob();
        this.lPz = (ldy)this.lPy.eqq();
    }

    @Override
    protected void cBa() {
        super.cBa();
        if (this.lPD) {
            this.cQL();
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxP().cyZ().a((hwf)this);
        this.lPB.put(this.pY(lya.tCM.bD(new Object[0]).exA()), (ldy)this.lPy.eqq());
        hzo hzo2 = (hzo)iew.cxO();
        if (this.lPC) {
            hzo2.cHx().a(hyy.a.lrs, this);
        }
    }

    public void cleanUp() {
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyZ() != null) {
            hso.cxK().cxP().cyZ().b((hwf)this);
        }
        super.cleanUp();
        hzo hzo2 = (hzo)iew.cxO();
        if (hzo2 != null && hzo2.cHx() != null && this.lPC) {
            hzo2.cHx().b(hyy.a.lrs);
        }
    }

    protected void cEa() {
        super.cEa();
    }

    protected void kq(float f) {
        this.a("setSize", new Object[]{Float.valueOf(f), 140});
    }

    @Override
    protected void c(ifg ifg2) {
        this.a(hxz.lmg);
    }

    @Override
    public void cf(cxc cxc2) {
        Object object;
        List<ler> list = this.lPy.a((ler)this.lPz, false, true);
        int n = 0;
        hwv hwv2 = null;
        for (ler ler2 : list) {
            Object object2;
            object = (ldy)ler2;
            if (this.lPA.contains(object)) {
                ++n;
                continue;
            }
            if (((ler)object).getType() == cxc2.zg()) {
                hwv2 = new hwv(this, cxc2){
                    final /* synthetic */ iew lPF;
                    {
                        this.lPF = iew2;
                        super(bsj2);
                    }

                    public SFGUIElementDTO cBj() {
                        SFGUIElementDTO sFGUIElementDTO = super.cBj();
                        if (jen.dzL().dzM().dzE() != null && jen.dzL().dzM().dzE().hu(this.liS.getType())) {
                            sFGUIElementDTO.indicators = 32;
                        }
                        if (lea.epx().qT(this.liS.getType())) {
                            sFGUIElementDTO.text = "<p><font color=\"#f0a015\">" + sFGUIElementDTO.text + "</font></p>";
                        }
                        return sFGUIElementDTO;
                    }
                };
            } else if (this.lPy.isDescendant(cxc2.zg(), ((ler)object).getType())) {
                object2 = (lhg)lea.enZ().acv(((ler)object).getType());
                hwv2 = new hwv((bsn)object2);
            }
            if (hwv2 == null) continue;
            hwv2.setEnabled(true);
            if (!cyt.yV((int)((ler)object).getType())) {
                hwv2.oW(false);
            } else {
                hwv2.oW(this.lPC);
            }
            this.lPA.add((ldy)object);
            object2 = new ieq(this, hwv2);
            this.a((ieq)object2, n);
            break;
        }
        if (hwv2 == null) {
            boolean bl = lea.enZ().isDescendant(cxc2.zg(), cxd.fLc);
            boolean bl2 = lea.enZ().isDescendant(cxc2.zg(), cxd.fIl);
            if (bl || bl2) {
                hwv2 = new hwv(cxc2);
                hwv2.oW(false);
                object = new ieq(this, hwv2);
                this.a((ieq)object, n);
            }
        }
    }

    @Override
    public void ck(cxc cxc2) {
        for (int j = 0; j < this.lOp.size(); ++j) {
            hwv object = (hwv)((ieq)this.lOp.get(j)).cQm();
            if (object.zg() != cxc2.zg()) continue;
            this.Qg(j);
            break;
        }
        for (ldy ldy2 : this.lPA) {
            if (ldy2.getType() != cxc2.zg()) continue;
            this.lPA.remove(ldy2);
            break;
        }
    }

    @Override
    public void cl(cxc cxc2) {
        for (ieq ieq2 : this.lOp) {
            hwv hwv2;
            hwm hwm2 = ieq2.cQm();
            if (!(hwm2 instanceof hwv) || (hwv2 = (hwv)hwm2).zg() != cxc2.zg() || !(hwv2.cBk() < 0.0f)) continue;
            this.a(ieq2, cxc2.Bt() / 100.0f);
        }
    }

    @Override
    public void a(cxc cxc2, float f, double d2) {
    }

    @Override
    public void c(cxc cxc2, boolean bl) {
    }

    @Override
    public void c(ieq ieq2) {
        hwv hwv2 = (hwv)ieq2.cQm();
        int n = hwv2.awK().getType();
        ldy ldy2 = (ldy)this.lPy.acv(n);
        if (ldy2 == null) {
            return;
        }
        if (ldy2.cCr() == ldy.a.FOLDER) {
            this.lPz = ldy2;
            this.lPB.put(this.pY(lvm.sXe.bD(hwv2.zg()).exA()), ldy2);
            this.cQJ();
            hso.cxK().cxP().j(cja.eDx.ordinal(), -1, ldy2.getType(), -1);
        } else if (ldy2.cCr() == ldy.a.SKILL) {
            hzo hzo2;
            bsn bsn2 = hwv2.awK();
            hzo hzo3 = hzo2 = iew.cxO() == null || !(iew.cxO() instanceof hzo) ? null : (hzo)iew.cxO();
            if (hzo2 != null) {
                if (cwy.a(bsn2, false) && hzo2.cHQ() != null) {
                    hzo2.a(bsn2);
                    if (hzo2.cIr() != null && hzo2.cIr().isVisible()) {
                        hzo2.cIr().setVisible(false);
                    }
                    if (hzo2.cHw() != null) {
                        hzo2.cHw().duE();
                    }
                } else if (bsn2.getType() == cxd.fLs && hzo2.cIr() != null) {
                    if (hzo2.cHw() != null && !hzo2.cHw().a(hyc.lmI)) {
                        hzo2.cHw().a(hyc.lmI, true);
                    }
                    hzo2.cIr().setVisible(true);
                    if (hzo2 != null && hzo2.cHQ() != null && hzo2.cHQ().isVisible()) {
                        hzo2.cHQ().close();
                    }
                    if (hzo2.cHw() != null) {
                        hzo2.cHw().duE();
                    }
                }
            }
        }
    }

    public void cQJ() {
        while (this.lOp.size() > 0) {
            this.Qg(0);
        }
        this.lPA.clear();
        Collection collection = iew.cxP().cyZ().Gq().values();
        for (cxc cxc2 : collection) {
            this.cf(cxc2);
        }
    }

    public void e(cxc cxc2, boolean bl) {
        this.ck(cxc2);
        this.cf(cxc2);
    }

    @Override
    protected void Qi(int n) {
        ldy ldy2;
        this.lPz = ldy2 = this.lPB.get(n);
        this.cQJ();
    }

    @Override
    protected void Qh(int n) {
        super.Qh(n);
        this.lPB.remove(n);
    }

    public iag B(int n, int n2, int n3) {
        ieq ieq2 = (ieq)this.lOq.get(n3);
        if (ieq2 == null) {
            return null;
        }
        hwm hwm2 = ieq2.cQm();
        if (hwm2 == null) {
            return null;
        }
        if (!(hwm2 instanceof hwv)) {
            return null;
        }
        hwv hwv2 = (hwv)hwm2;
        bsn bsn2 = hwv2.awK();
        assert (bsn2 != null);
        return new iag(hwv2.zg(), n, n2, false);
    }

    public iag a(hwv hwv2) {
        ieq ieq2 = this.d(hwv2);
        return ieq2 != null ? this.B(0, 0, ieq2.getID()) : null;
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        hwl hwl2 = new hwl(string);
        return this.B(n, n2, hwl2.cck);
    }

    @Override
    public void b(hyy.b b2, int n) {
        hzo hzo2 = (hzo)iew.cxO();
        if (b2.equals((Object)hyy.b.lsi)) {
            hzo2.cHw().a(hyc.lmM, false);
        }
    }

    @Override
    public boolean cGG() {
        return true;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    protected void cQK() {
        SFGUIElementListDTO sFGUIElementListDTO = new SFGUIElementListDTO();
        for (ieq ieq2 : this.lOp) {
            Object object;
            hwm hwm2 = ieq2.cQm();
            if (!(hwm2.cBk() > 0.0f)) continue;
            if (hwm2 instanceof hwv) {
                object = (hwv)hwm2;
                ((hwv)object).setProgress(-1.0f);
            }
            object = ieq2.cBj();
            sFGUIElementListDTO.list.add((SFGUIElementDTO)object);
        }
        if (sFGUIElementListDTO.list.size() > 0) {
            this.a("update", new Object[]{sFGUIElementListDTO});
        }
    }

    public void cEc() {
        if (!this.cEU()) {
            this.cQK();
        }
    }

    protected void b(jnz jnz2, jnz jnz3) {
        if (this.cEU()) {
            this.cQK();
        }
    }

    public void iB(int n) {
        ldy ldy2 = (ldy)lea.eob().acv(n);
        if (ldy2 != null) {
            this.lOt.list.clear();
            this.lPz = ldy2;
            this.lPB.put(this.pY(lya.tCp.bD(n).exA()), this.lPz);
        }
    }

    protected void cQL() {
        this.a("moveTitleToTop", new Object[0]);
    }

    public void pY(boolean bl) {
        this.lPD = bl;
        if (this.cDj()) {
            this.cQL();
        }
    }

    @llk
    public void skillUpButtonClicked(int n) {
        ieq ieq2 = (ieq)this.lOq.get(n);
        if (ieq2 == null) {
            return;
        }
        hwv hwv2 = (hwv)ieq2.cQm();
        int n2 = hwv2.zg();
        this.cyJ().cIc().Pa(n2);
    }

    @Override
    public void i(cxc cxc2, int n) {
        if (!this.lPC) {
            return;
        }
        for (int j = 0; j < this.lOp.size(); ++j) {
            ieq ieq2 = (ieq)this.lOp.get(j);
            hwv hwv2 = (hwv)ieq2.cQm();
            if (hwv2.awK().getType() != cxc2.zg()) continue;
            this.a(ieq2);
            break;
        }
    }
}

