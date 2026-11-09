/*
 * Decompiled with CFR.
 */
import java.util.Map;
import java.util.Set;

public class ilx {
    ilq miM;

    public void cleanUp() {
    }

    public ilq ddA() {
        return this.miM;
    }

    public boolean ddB() {
        return this.miM != null ? this.miM.d(this) : false;
    }

    public ilq ddC() {
        ilq ilq2 = null;
        ilq ilq3 = this.miM;
        while (ilq3 != null) {
            ilq2 = ilq3;
            ilq3 = ilq3.miM;
        }
        return ilq2;
    }

    public img ddD() {
        return this.ddT() ? (img)this : (this.miM != null ? this.miM.ddD() : null);
    }

    public boolean f(ilx ilx2) {
        ilx ilx3 = this;
        while (ilx3 != null) {
            if (ilx3 == ilx2) {
                return true;
            }
            ilx3 = ilx3.miM;
        }
        return false;
    }

    public boolean a(ilx ilx2, ilx ilx3) {
        while (ilx3 != null) {
            if (ilx3 == this) {
                return true;
            }
            if (ilx3 == ilx2) break;
            ilx3 = ilx3.ddA();
        }
        return false;
    }

    public ily ddE() {
        return this.miM != null ? this.miM.ddE() : null;
    }

    public void print(int n, int n2) {
        lfn.b(n, "Inventory Node", lhn.acR(n2 * 4) + this.ddF().exA());
    }

    public boolean c(ldv ldv2, hxd hxd2) {
        return false;
    }

    public loz ddF() {
        return lvn.sXN.bD("");
    }

    public String ddG() {
        return this.ddF().exA();
    }

    public boolean ddH() {
        return false;
    }

    public void w(String string) {
    }

    public String cCU() {
        return null;
    }

    public inj ddI() {
        return new inj(this);
    }

    public int ddJ() {
        return this.miM != null ? this.miM.a(this) : -1;
    }

    public ilx R(bsh bsh2) {
        return null;
    }

    public ilx rA(ldv ldv2) {
        return null;
    }

    public int vf() {
        return 0;
    }

    public boolean b(ilx ilx2) {
        return false;
    }

    public int getItemCount() {
        return 1;
    }

    public int ddK() {
        return this.miM != null ? this.miM.ddK() : 0;
    }

    public int ddL() {
        return this.miM != null ? this.miM.ddL() : 0;
    }

    public float getWeight() {
        return 0.0f;
    }

    public float ddl() {
        return this.getWeight();
    }

    public float aum() {
        return this.miM != null ? this.miM.aum() : 0.0f;
    }

    public float ddM() {
        return 0.0f;
    }

    public String ddN() {
        return null;
    }

    public int ddO() {
        return 0;
    }

    public int uw() {
        return -1;
    }

    public bsh cBu() {
        return null;
    }

    public lfs<cab, cab> ddP() {
        return bsi.n(this.cBu());
    }

    public boolean auW() {
        return false;
    }

    public hxd cBs() {
        return null;
    }

    public boolean ddh() {
        return this.miM != null ? this.miM.ddh() : false;
    }

    public boolean ddQ() {
        return false;
    }

    public boolean ddR() {
        return false;
    }

    public ilt ddS() {
        return null;
    }

    public boolean e(ilx ilx2) {
        return false;
    }

    public boolean ed(int n, int n2) {
        return false;
    }

    public boolean delete() {
        return false;
    }

    public boolean c(hxd hxd2) {
        return false;
    }

    public void ac(int n, boolean bl) {
    }

    public ilu ddr() {
        return null;
    }

    public void b(ilu ilu2) {
    }

    public boolean ddT() {
        return false;
    }

    public boolean ddi() {
        return false;
    }

    public boolean ddk() {
        return false;
    }

    public boolean auG() {
        return false;
    }

    public boolean ddU() {
        return false;
    }

    public Map<Integer, Integer> o(Set<Integer> set) {
        Map<Integer, Integer> map = lcn.emw();
        this.a(set, map);
        return map;
    }

    public void a(Set<Integer> set, Map<Integer, Integer> map) {
    }

    public boolean L(Map<Integer, Integer> map) {
        return false;
    }

    public void ddn() {
    }

    public int ddj() {
        return this.miM != null ? this.miM.ddj() : -1;
    }

    public int ddV() {
        return this.miM != null ? 1 + this.miM.ddV() : 1;
    }

    public int ddo() {
        return 0;
    }

    void T(bsh bsh2) {
    }

    void ddt() {
        if (this.miM != null) {
            this.miM.ddt();
        }
    }

    void ddu() {
        if (this.miM != null) {
            this.miM.ddu();
        }
    }

    void ddW() {
    }

    void ddX() {
    }
}

