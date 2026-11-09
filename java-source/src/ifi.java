/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hyn
 */
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ifi
extends ipx {
    private a lRd = null;
    private ipb lLO = null;
    private ist lRe = null;
    private int ResourceType = -1;
    protected boolean kfM = false;
    protected ipb lRf = null;
    protected ipb lRg = new ipb("Slot");
    protected ipb lRh = new ipb("SlotFilled");

    public ifi(String string) {
        this.W(this.lRg);
        this.W(this.lRh);
        this.lRh.setVisible(false);
        this.r(0, 0, 100, 100);
        iwi iwi2 = new iwi(this){
            final /* synthetic */ ifi lRi;
            {
                this.lRi = ifi2;
            }

            public void cLq() {
                this.lRi.Qz(-1);
            }
        };
        iwi2.ek(54, 54);
        this.W(iwi2);
        this.lRf = new ipb(string);
        this.lRf.ek(0, 0);
        this.W(this.lRf);
    }

    @Override
    public boolean c(int n, int n2, hzk hzk2, ifg ifg2) {
        return true;
    }

    @Override
    public boolean a(int n, int n2, hzk hzk2, ifg ifg2) {
        return true;
    }

    @Override
    public boolean d(int n, int n2, hzk hzk2, ifg ifg2) {
        return true;
    }

    @Override
    public boolean b(int n, int n2, hzk hzk2, ifg ifg2) {
        hxd hxd2;
        if (!(ifg2 instanceof ifh)) {
            return false;
        }
        ifh ifh2 = (ifh)ifg2;
        hwm hwm2 = ifh2.cQm();
        if (!(hwm2 instanceof hwo)) {
            return false;
        }
        hwo hwo2 = (hwo)hwm2;
        if (hwo2.cBu() != null && ((hxd2 = hso.cxK().cxP().cza().ri(hwo2.cBu().AW())) == null || hxd2.cCN() != bqm.b.dEn)) {
            return false;
        }
        if (!cug.wC((int)hwo2.cBq().getType())) {
            return false;
        }
        if (this.ResourceType == hwo2.cBq().getType()) {
            return true;
        }
        if (hzk2 instanceof ifj && this.lRd != null) {
            this.lRd.QB(this.ResourceType);
        }
        this.Qz(hwo2.cBq().getType());
        return true;
    }

    @Override
    public void d(ifg ifg2) {
        if (!(ifg2 instanceof ifh)) {
            return;
        }
        if (!this.kfM) {
            return;
        }
        this.kfM = false;
        this.Qz(-1);
    }

    @Override
    public boolean dx(int n, int n2) {
        return this.ResourceType != -1;
    }

    @Override
    public ifg dy(int n, int n2) {
        if (this.ResourceType == -1) {
            return null;
        }
        lgw lgw2 = (lgw)lea.enW().acv(this.ResourceType);
        if (lgw2 == null) {
            return null;
        }
        hwo hwo2 = new hwo(lgw2);
        ifh ifh2 = new ifh(hwo2, -(n - this.lLO.getX()), -(n2 - this.lLO.getY()));
        this.kfM = true;
        return ifh2;
    }

    public void Qz(int n) {
        this.ResourceType = n;
        if (this.lRd != null) {
            this.lRd.QA(n);
        }
        if (this.lLO != null) {
            this.X(this.lLO);
            this.lLO = null;
        }
        if (n == -1) {
            this.lRh.setVisible(false);
            this.lRg.setVisible(true);
            this.lRf.setVisible(true);
            if (this.lRe != null) {
                this.X(this.lRe);
                this.lRe = null;
            }
            return;
        }
        lgw lgw2 = (lgw)lea.enW().acv(n);
        if (lgw2 == null) {
            return;
        }
        this.lRg.setVisible(false);
        this.lRh.setVisible(true);
        this.lRf.setVisible(false);
        String string = lgw2.atw().Name;
        this.lLO = new ipb("/dfdata/texture/dds/" + string.replace("//", "/"));
        this.lLO.ek(0, 0);
        this.W(this.lLO);
        if (this.lRe != null) {
            this.b(this.lRe, this.getChildren().size());
        }
    }

    public void a(a a2) {
        this.lRd = a2;
    }

    public void do(int n) {
        if (this.lRe == null) {
            this.lRe = new ist();
            this.lRe.Rk(0xABABAB);
            this.lRe.sv(false);
            this.lRe.a(isu.mxR);
            this.lRe.a(isf.mwO, 14);
            this.lRe.setText("0");
            this.lRe.ek(4, 78);
            this.lRe.setSize(64, 20);
            this.W(this.lRe);
        }
        this.lRe.setText("" + n);
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
    }

    @Override
    public hyn dd(int n, int n2) {
        if (this.ResourceType == -1) {
            return null;
        }
        SFTooltipBaseDTO sFTooltipBaseDTO = iae.a("<font size=\"12\">" + lxf.tod.bD(this.ResourceType).exA() + "</font>", "<font size=\"12\">" + lxf.tof.bD(this.ResourceType).exA() + "</font>", 0, 0, 0, 0, new String[0]);
        ioc ioc2 = this.eo(n, n2);
        iae iae2 = new iae(sFTooltipBaseDTO, ioc2.cf, ioc2.cg, 32, 32);
        return iae2;
    }

    public void cSj() {
        this.kfM = false;
    }
}

