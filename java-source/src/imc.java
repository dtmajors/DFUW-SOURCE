/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;

public class imc
extends ilx {
    private ilt mis;
    private ilv miV;

    public imc(ilt ilt2) {
        this.mis = ilt2;
        this.miV = new ilv(this, ilt2){
            final /* synthetic */ imc miX;
            {
                this.miX = imc2;
                super(ilt2);
            }

            public void ddt() {
                this.miX.ddt();
            }

            public void ddu() {
                this.miX.ddu();
            }
        };
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.miV.cleanUp();
    }

    @Override
    public boolean ddQ() {
        return true;
    }

    @Override
    public ilt ddS() {
        return this.mis;
    }

    @Override
    public void print(int n, int n2) {
        lfn.b(n, "Inventory Node", lhn.acR(n2 * 4) + "Item: " + this.mis.toString());
    }

    @Override
    public loz ddF() {
        return lxg.tpf.bD(this.mis.vf(), this.mis.cBu().az());
    }

    @Override
    public String cCU() {
        String string = "/dfdata/texture/dds/" + this.mis.cBu().awx().atw().Name;
        return string;
    }

    @Override
    public ilx R(bsh bsh2) {
        return this.mis.S(bsh2) ? this : null;
    }

    @Override
    public ilx rA(ldv ldv2) {
        return this.mis.rB(ldv2) ? this : null;
    }

    @Override
    public int vf() {
        return this.mis.cBu().vf();
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
    public boolean b(ilx ilx2) {
        return ilx2 != null && this.auW() && ilx2.auW() && this.uw() == ilx2.uw();
    }

    @Override
    public boolean auW() {
        return this.mis.auW();
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
    public void a(Set<Integer> set, Map<Integer, Integer> map) {
        int n = this.mis.cBu().az();
        if (set.contains(n)) {
            Integer n2 = map.get(n);
            map.put(n, (n2 != null ? n2 : 0) + this.vf());
        }
    }

    @Override
    public boolean L(Map<Integer, Integer> map) {
        return this.mis.L(map);
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
}

