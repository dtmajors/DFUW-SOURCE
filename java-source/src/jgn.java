/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hvy
 *  hyn
 */
import java.util.List;
import java.util.Map;
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class jgn
extends ier
implements hvx,
hyy.c {
    Map<Integer, Integer> naC = lcn.emw();

    public jgn() {
        super("SelentineShopWindow", "selentineshop.swf");
        this.OQ(jnz.nGi);
        this.a(hyb.lmC);
    }

    @Override
    public void initialize() {
        super.initialize();
        this.naC.put(this.pY(lxz.tBp.bD(new Object[0]).exA()), 0);
        this.t((lgw)lea.enY().acv(0));
        jgn.cyJ().cHx().a(hyy.a.lrT, this);
        jgn.cxP().cyZ().a((hvx)this);
    }

    public void cleanUp() {
        super.cleanUp();
        jgn.cxP().cyZ().b((hvx)this);
        jgn.cyJ().cHx().b(hyy.a.lrT);
    }

    @Override
    public void cBa() {
        super.cBa();
        this.dEI();
        this.cEk();
    }

    @Override
    public void cEk() {
        super.cEk();
        this.a("setBuyMoreText", new Object[]{lxz.tBQ.bD(new Object[0]).exA()});
    }

    protected void t(lgw lgw2) {
        List<ler> list = lea.enY().a((ler)lgw2, false, true);
        for (int i = list.size() - 1; i >= 0; --i) {
            lgw lgw3 = (lgw)list.get(i);
            lgw3 = (lgw)lea.enW().acv(lgw3.getType());
            civ civ2 = lea.epC().get(lgw3.getType());
            if (civ2 != null && !civ2.isEnabled()) continue;
            hwu hwu2 = new hwu(lgw3);
            ieq ieq2 = new ieq(this, hwu2);
            this.a(ieq2, 0);
        }
    }

    @Override
    protected void c(ieq ieq2) {
        hwu hwu2 = (hwu)ieq2.cQm();
        int n = hwu2.cBq().getType();
        civ civ2 = lea.epC().get(n);
        if (civ2 != null) {
            hvy hvy2;
            if (n == cug.fua) {
                int n2;
                double d2;
                hvy hvy3 = jgn.cxP().cyZ();
                if (hvy3 != null && (d2 = hvy3.cAC()) < (double)(n2 = hvy3.cAE())) {
                    jgn.cxP().v(mcr.tBE.bD((double)n2 - d2, cug.fua));
                }
            } else if (n == cug.fui && (hvy2 = jgn.cxP().cyZ()) != null && hvy2.cAC() < hvy2.cAD()) {
                jgn.cxP().v(mcr.uye.bD(hvy2.cAD() - hvy2.cAC(), cug.fui));
            }
            jgn.cxP().czv().a(jgl.a.nal, -1, n, false);
            return;
        }
        this.cQo();
        this.t((lgw)lea.enY().acv(n));
        int n3 = this.pY(lxf.tod.bD(n).exA());
        this.naC.put(n3, n);
    }

    public void dEH() {
        this.cQo();
        this.t((lgw)lea.enY().acv(0));
    }

    @Override
    protected void Qi(int n) {
        this.cQo();
        Integer n2 = this.naC.get(n);
        if (n2 == null) {
            assert (false);
            return;
        }
        this.t((lgw)lea.enY().acv(n2));
    }

    @Override
    protected void Qh(int n) {
        this.naC.remove(n);
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        hwl hwl2 = new hwl(string);
        ieq ieq2 = (ieq)this.lOq.get(hwl2.cck);
        if (ieq2 == null) {
            return null;
        }
        hwm hwm2 = ieq2.cQm();
        if (hwm2 == null) {
            return null;
        }
        hwk hwk2 = new hwk(string);
        n = (int)((double)n - hwk2.getX());
        n2 = (int)((double)n2 - hwk2.getY() + 16.0);
        if (hwm2 instanceof hwu) {
            hwu hwu2 = (hwu)hwm2;
            civ civ2 = lea.epC().get(hwu2.cBq().getType());
            String string2 = "<p><font size=\"12\">" + lxf.tof.bD(hwu2.cBq().getType()).exA() + "</font></p>";
            if (civ2 != null) {
                if (civ2.aPG()) {
                    string2 = string2 + "<p><Font Size = \"12\" Color=\"#FF0000\">" + lxz.tCj.bD(new Object[0]).exA() + "</Font></p>";
                }
                if (civ2.aPI()) {
                    string2 = string2 + "<p><Font Size = \"12\" Color=\"#FF0000\">" + lxz.tCk.bD(new Object[0]).exA() + "</Font></p>";
                }
                if (civ2.aPH()) {
                    string2 = string2 + "<p><Font Size = \"12\" Color=\"#FF0000\">" + lxz.tCl.bD(new Object[0]).exA() + "</Font></p>";
                }
                if (civ2.aPJ()) {
                    string2 = string2 + "<p><Font Size = \"12\" Color=\"#FF0000\">" + lxz.tCm.bD(new Object[0]).exA() + "</Font></p>";
                }
                if (civ2.aPK()) {
                    string2 = string2 + "<p><Font Size = \"12\" Color=\"#FF0000\">" + lxz.tCn.bD(new Object[0]).exA() + "</Font></p>";
                }
            }
            SFTooltipBaseDTO sFTooltipBaseDTO = iae.a(string2, null, 0, 0, 0, 0, new String[0]);
            iae iae2 = new iae(sFTooltipBaseDTO, n, n2, 32, 32);
            return iae2;
        }
        return null;
    }

    @Override
    public void b(hyy.b b2, int n) {
        if (b2.ordinal() == hyy.b.lvw.ordinal()) {
            jgn.cyJ().cHw().a(hyc.lmY, false);
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

    @Override
    public void a(bsh bsh2, cxc cxc2) {
    }

    @Override
    public void czV() {
    }

    @Override
    public void q(ej ej2) {
        if (ej2.getType() == 12816 || ej2.getType() == 12832) {
            this.dEI();
        }
    }

    protected void dEI() {
        String string = String.format("<p>%d<img src=\"selentine_small.png\" hspace=\"0\" vspace=\"-6\"/></p>", jgn.cxP().cyZ().cAB());
        this.a("setSelentineAmountText", new Object[]{string});
    }

    @llk
    public void onBuyMoreButtonClicked() {
        this.dEJ();
    }

    public void dEJ() {
        ghf ghf2 = (ghf)this.MessageDelegator.h(32522, this.getGUID(), hso.cxK().bAn().gYX);
        this.MessageDelegator.E(ghf2);
    }

    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 32522: {
                this.a((ghf)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    protected void a(ghf ghf2) {
        kqm kqm2 = (kqm)this.MessageDelegator.h(3850);
        kqm2.ts(this.GUID);
        kqm2.pWv = "iexplore.exe";
        kqm2.pWw = ghf2.URL;
        kqm2.pWu = "open";
        kqm2.pWx = 5;
        this.MessageDelegator.a(kqm2);
    }
}

