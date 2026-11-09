/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class imb
extends ima {
    private ilt mis;
    private ilv miV;

    public imb(ilt ilt2) {
        this.mis = ilt2;
        this.miV = new ilv(this, ilt2){
            final /* synthetic */ imb miW;
            {
                this.miW = imb2;
                super(ilt2);
            }

            public void ddt() {
                this.miW.ddt();
            }

            public void ddu() {
                this.miW.ddu();
            }
        };
        this.ddZ();
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.miV.cleanUp();
    }

    @Override
    public boolean b(ilx ilx2) {
        return super.b(ilx2) && this.ddV() + ilx2.ddo() < 5;
    }

    @Override
    public int ddo() {
        return 1 + super.ddo();
    }

    @Override
    public boolean ddQ() {
        return true;
    }

    @Override
    public boolean ddR() {
        return true;
    }

    @Override
    public ilt ddS() {
        return this.mis;
    }

    @Override
    public void print(int n, int n2) {
        lfn.b(n, "Inventory Node", lhn.acR(n2 * 4) + "Item Container: " + this.mis.toString());
        this.ec(n, n2);
    }

    @Override
    public boolean c(ldv ldv2, hxd hxd2) {
        if (this.mis.getGUID().equals(ldv2)) {
            this.e(hxd2);
            return true;
        }
        return super.c(ldv2, hxd2);
    }

    @Override
    public loz ddF() {
        return lvn.sXN.bD(hwo.z(this.mis.cBu()));
    }

    @Override
    public String ddG() {
        return "" + this.mis.ddp();
    }

    @Override
    public boolean ddH() {
        return true;
    }

    @Override
    public void w(String string) {
        String string2 = this.ddF().exA();
        if (lhn.aD(string2, string)) {
            return;
        }
        hso.cxK().cxP().cza().a(this.mis.cBu(), string);
    }

    @Override
    public String cCU() {
        String string = "/dfdata/texture/dds/" + this.mis.cBu().awx().atw().Name;
        return string;
    }

    @Override
    public hxd cBs() {
        return hso.cxK().cxP().cza().ri(this.mis.getGUID());
    }

    @Override
    public boolean ddh() {
        hxd hxd2 = this.cBs();
        if (hxd2 == null) {
            return false;
        }
        return bqm.b.isLootableType(hxd2.cCN());
    }

    @Override
    public ilx R(bsh bsh2) {
        return this.mis.S(bsh2) ? this : super.R(bsh2);
    }

    @Override
    public ilx rA(ldv ldv2) {
        return this.mis.rB(ldv2) ? this : super.rA(ldv2);
    }

    @Override
    public float getWeight() {
        return this.mis.getWeight();
    }

    @Override
    public float ddM() {
        return jbg.V(this.mis.cBu());
    }

    @Override
    public String ddN() {
        return jbg.f(this.mis.cBu(), 14112);
    }

    @Override
    public int ddO() {
        return jbg.e(this.mis.cBu(), 14096);
    }

    @Override
    public int uw() {
        return this.mis.cBu().az();
    }

    @Override
    public bsh cBu() {
        return this.mis.cBu();
    }

    @Override
    public boolean e(ilx ilx2) {
        return this.miV.e(ilx2);
    }

    @Override
    public boolean ed(int n, int n2) {
        return this.miV.ed(n, n2);
    }

    @Override
    public boolean delete() {
        return this.miV.delete();
    }

    @Override
    public boolean c(hxd hxd2) {
        return this.miV.c(hxd2);
    }

    @Override
    public void ac(int n, boolean bl) {
        this.miV.ac(n, bl);
    }

    @Override
    public ilu ddr() {
        return this.mis.ddr();
    }

    @Override
    public void b(ilu ilu2) {
        this.mis.b(ilu2);
        ilw.ddy().miJ.V(this);
    }

    @Override
    public boolean L(Map<Integer, Integer> map) {
        return this.mis.L(map) ? true : super.L(map);
    }

    @Override
    public void ddn() {
        this.ddZ();
        super.ddn();
    }

    @Override
    public boolean ddU() {
        return true;
    }

    @Override
    void T(bsh bsh2) {
        this.mis.y(bsh2);
        ilw.ddy().miD.V(this);
    }

    @Override
    void ddX() {
        this.miV.cleanUp();
    }

    private void ddZ() {
        this.e(hso.cxK().cxP().cza().rl(this.mis.getGUID()));
    }
}

