/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class jci
extends jce {
    private xb mRo;
    private jbz mRf = jbz.mQj;
    private jbx mRi = jbx.mQa;
    private boolean mRj = true;

    public jci(xb xb2) {
        this.mRo = xb2;
    }

    public xb vS() {
        return this.mRo;
    }

    @Override
    public loz aND() {
        return this.mRo.vT();
    }

    @Override
    public jbz dxd() {
        return this.mRf;
    }

    @Override
    public void a(jbz jbz2) {
        if (jbz2 == this.mRf) {
            return;
        }
        this.mRf = jbz2;
        jcc.dwT().mQx.V(this);
    }

    @Override
    public jcg TQ(int n) {
        return this.mRo.getID() == n ? this : super.TQ(n);
    }

    public boolean isVisible() {
        return this.mRf != jbz.mQj;
    }

    @Override
    public jbx dxe() {
        return this.mRi;
    }

    @Override
    public void a(jbx jbx2) {
        if (jbx2 == this.mRi) {
            return;
        }
        this.mRi = jbx2;
        jcc.dwT().mQv.V(this);
    }

    @Override
    public boolean dxf() {
        return this.mRj;
    }

    @Override
    public void sV(boolean bl) {
        if (bl == this.mRj) {
            return;
        }
        this.mRj = bl;
        jcc.dwT().mQv.V(this);
    }

    @Override
    public List<String> dxg() {
        List<lfs<Integer, List<jcf>>> list = jcc.dwW().dZ(this.mRo.getID());
        ArrayList<String> arrayList = lcn.emv();
        for (lfs<Integer, List<jcf>> lfs2 : list) {
            for (jcf jcf2 : (List)lfs2.reY) {
                arrayList.add(jcf2.b(jcc.dwT().dwZ()));
            }
        }
        return arrayList;
    }

    @Override
    public boolean vY() {
        List<String> list = this.dxg();
        return list != null && !list.isEmpty();
    }

    void c(jch jch2) {
        this.dxx();
    }

    private void dxx() {
        jbx jbx2 = jbx.values()[0];
        boolean bl = false;
        for (jch jch2 : this.wr()) {
            if (!jch2.isVisible() || jch2.dxe().ordinal() <= jbx2.ordinal()) continue;
            jbx2 = jch2.dxe();
            bl = jch2.dxf() || bl;
        }
        this.a(jbx2);
        this.sV(bl);
    }
}

