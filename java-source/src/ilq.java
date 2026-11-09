/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ilq
extends ilx {
    public final jll<ilx> mil = new jll();
    public final jll<ilx> mim = new jll();
    private List<ilx> lGI = lcn.emv();

    @Override
    public void cleanUp() {
        super.cleanUp();
        for (ilx ilx2 : this.lGI) {
            ilx2.cleanUp();
        }
    }

    public List<ilx> getChildren() {
        return Collections.unmodifiableList(this.lGI);
    }

    public int bfn() {
        return this.lGI.size();
    }

    public int a(ilx ilx2) {
        return this.lGI.indexOf(ilx2);
    }

    public ilx Rr(int n) {
        return this.lGI.get(n);
    }

    @Override
    public boolean b(ilx ilx2) {
        return ilx2 != null && !(ilx2 instanceof imf) && !this.f(ilx2) && ilx2.miM != this;
    }

    public boolean c(ilx ilx2) {
        if (ilx2 == null || !this.b(ilx2) || ilx2.miM != null) {
            assert (false);
            return false;
        }
        ilx2.miM = this;
        this.lGI.add(ilx2);
        ilx2.ddW();
        this.mil.V(ilx2);
        ilw.ddy().miB.k(this, ilx2);
        return true;
    }

    public boolean d(ilx ilx2) {
        if (ilx2 == null || ilx2.miM != this) {
            assert (false);
            return false;
        }
        ilx2.ddX();
        ilx2.miM = null;
        this.lGI.remove(ilx2);
        ilx2.cleanUp();
        this.mim.V(ilx2);
        ilw.ddy().miC.k(this, ilx2);
        return true;
    }

    @Override
    public void print(int n, int n2) {
        super.print(n, n2);
        this.ec(n, n2);
    }

    public void ec(int n, int n2) {
        for (ilx ilx2 : this.lGI) {
            ilx2.print(n, n2 + 1);
        }
    }

    @Override
    public boolean c(ldv ldv2, hxd hxd2) {
        for (ilx ilx2 : this.lGI) {
            if (!ilx2.c(ldv2, hxd2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public ilx R(bsh bsh2) {
        for (ilx ilx2 : this.lGI) {
            ilx ilx3 = ilx2.R(bsh2);
            if (ilx3 == null) continue;
            return ilx3;
        }
        return null;
    }

    @Override
    public ilx rA(ldv ldv2) {
        for (ilx ilx2 : this.lGI) {
            ilx ilx3 = ilx2.rA(ldv2);
            if (ilx3 == null) continue;
            return ilx3;
        }
        return null;
    }

    @Override
    public int getItemCount() {
        int n = 1;
        for (ilx ilx2 : this.lGI) {
            n += ilx2.getItemCount();
        }
        return n;
    }

    @Override
    public float ddl() {
        float f = super.ddl();
        for (ilx ilx2 : this.lGI) {
            f += ilx2.ddl();
        }
        return f;
    }

    public float ddm() {
        float f = 0.0f;
        for (ilx ilx2 : this.lGI) {
            f += ilx2.ddl();
        }
        return f;
    }

    @Override
    public void a(Set<Integer> set, Map<Integer, Integer> map) {
        for (ilx ilx2 : this.lGI) {
            ilx2.a(set, map);
        }
    }

    @Override
    public void ddn() {
        for (ilx ilx2 : this.lGI) {
            ilx2.ddn();
        }
    }

    @Override
    public boolean L(Map<Integer, Integer> map) {
        for (ilx ilx2 : this.lGI) {
            ilx2.L(map);
        }
        return false;
    }

    @Override
    public int ddo() {
        int n = 0;
        for (ilx ilx2 : this.lGI) {
            n = Math.max(n, ilx2.ddo());
        }
        return n;
    }
}

