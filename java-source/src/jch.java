/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class jch
extends jcg {
    public final jll<jch> mRa = new jll();
    public final jll<jch> mRb = new jll();
    public final jlm<jch, jcm> mRc = new jlm();
    public final jlm<jch, jcm> mRd = new jlm();
    private wy mRe;
    private jbz mRf = jbz.mQj;
    private Map<Integer, jcm> mRg = lcn.emw();
    private List<jcf> mRh = null;
    private jbx mRi = jbx.mQa;
    private boolean mRj = true;
    private Map<Integer, jjh> mRk;
    private int mRl = 0;
    private boolean mRm = false;
    private boolean mRn = false;

    public jch(wy wy2) {
        this.mRe = wy2;
        this.mRh = xe.baL.d(this.mRe);
        if (this.mRh == null) {
            this.mRh = lcn.emA();
        }
    }

    public wy wF() {
        return this.mRe;
    }

    @Override
    public boolean hasChildren() {
        return false;
    }

    @Override
    public List<ith> getChildren() {
        return null;
    }

    @Override
    public loz aND() {
        return this.mRe.vT();
    }

    public jci dxk() {
        return this.dxh() instanceof jci ? (jci)this.dxh() : null;
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
        this.cUp();
        if (this.mRf == jbz.mQl) {
            this.mRa.V(this);
            this.sX(false);
        }
        jcc.dwT().mQs.V(this);
    }

    @Override
    public jcg TQ(int n) {
        return this.mRe.getID() == n ? this : null;
    }

    public Map<Integer, jcm> dxl() {
        return Collections.unmodifiableMap(this.mRg);
    }

    public void a(jcm jcm2) {
        this.mRg.put(jcm2.getID(), jcm2);
        this.cUp();
        this.mRc.k(this, jcm2);
        jcc.dwT().mQy.k(this, jcm2);
    }

    public void b(jcm jcm2) {
        jcm jcm3 = this.mRg.remove(jcm2.getID());
        if (jcm3 != null) {
            this.mRd.k(this, jcm2);
            jcc.dwT().mQz.k(this, jcm2);
        }
    }

    public void dxm() {
        Map map = lcn.emw();
        this.mRg.clear();
        this.cUp();
        for (jcm jcm2 : map.values()) {
            jcc.dwT().mQz.k(this, jcm2);
        }
    }

    public boolean isVisible() {
        return this.mRf != jbz.mQj;
    }

    public List<jcf> wi() {
        return this.mRh;
    }

    public void a(jcf jcf2) {
        this.mRh.add(jcf2);
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
        jcc.dwT().mQt.V(this);
        jci jci2 = this.dxk();
        if (jci2 != null) {
            jci2.c(this);
        }
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
        jci jci2 = this.dxk();
        if (jci2 != null) {
            jci2.c(this);
        }
        jcc.dwT().mQu.V(this);
    }

    public boolean isCompleted() {
        return this.mRf == jbz.mQl;
    }

    public boolean xP() {
        for (jcm jcm2 : this.mRg.values()) {
            if (!jcm2.dxI()) continue;
            return true;
        }
        return false;
    }

    public boolean dxn() {
        for (jcm jcm2 : this.mRg.values()) {
            if (!jcm2.dxG()) continue;
            return true;
        }
        return false;
    }

    public boolean isInProgress() {
        return jcc.dwW().ee(this.mRe.getID());
    }

    public boolean dxo() {
        List<ach> list = this.mRe.we();
        return list != null && !list.isEmpty();
    }

    public int dxp() {
        List<ach> list = this.dxr();
        return list != null ? list.size() : 0;
    }

    public int dxq() {
        List<ach> list = this.dxr();
        int n = 0;
        for (ach ach2 : list) {
            if (ach2.isLocked()) continue;
            ++n;
        }
        return n;
    }

    public List<ach> dxr() {
        return xe.baL.eb(this.wF().getID());
    }

    public int dxs() {
        return this.mRl;
    }

    public int a(jjm jjm2, float f, float f2) {
        jjm jjm3 = null;
        switch (this.dxb()) {
            case bal: {
                jjm3 = jjm.noQ;
                break;
            }
            case baj: {
                jjm3 = jjm.noR;
                break;
            }
            case bak: {
                jjm3 = jjm.noS;
                break;
            }
            case bai: 
            case bam: {
                jjm3 = jjm.noT;
            }
        }
        if (jjm3 == null) {
            return -1;
        }
        ldv ldv2 = hso.cxK().cxT().getMessageDelegator().bzv();
        hso.cxK().cxT().a(jjm3, new ljq(f, 0.0f, f2), ldv2, null, null);
        jjh jjh2 = hso.cxK().cxT().dIQ().rU(ldv2);
        if (jjh2 == null) {
            return -1;
        }
        jjh2.ac("Text", this.aND().exA());
        jjh2.setVisible(true);
        if (this.mRk == null) {
            this.mRk = lcn.emw();
        }
        this.mRk.put(jjh2.getId(), jjh2);
        jcc.dwT().mQE.k(this, jjh2);
        ++this.mRl;
        return jjh2.getId();
    }

    public void TR(int n) {
        if (this.mRk == null) {
            assert (false);
            return;
        }
        jjh jjh2 = this.mRk.remove(n);
        if (jjh2 == null) {
            assert (false);
            return;
        }
        if (this.mRk.isEmpty()) {
            this.mRk = null;
        }
        hso.cxK().cxT().Vc(n);
        --this.mRl;
        jcc.dwT().mQF.k(this, jjh2);
    }

    public void sW(boolean bl) {
        if (this.mRk != null) {
            for (jjh jjh2 : this.mRk.values()) {
                jjh2.setVisible(bl);
            }
        }
    }

    public boolean dxt() {
        return this.mRk != null && !this.mRk.isEmpty();
    }

    @Override
    public List<String> dxg() {
        List<jcf> list = xe.baL.dY(this.wF().getID());
        if (list == null) {
            return null;
        }
        ArrayList<String> arrayList = lcn.emv();
        for (jcf jcf2 : list) {
            arrayList.add(jcf2.b(jcc.dwT().dwZ()));
        }
        return arrayList;
    }

    @Override
    public boolean vY() {
        List<String> list = this.dxg();
        return list != null && !list.isEmpty();
    }

    public boolean dxu() {
        return this.mRm;
    }

    public void dxv() {
        if (this.mRm) {
            return;
        }
        this.mRm = true;
        this.cUp();
    }

    @Override
    public void dxj() {
        super.dxj();
        this.dxv();
    }

    public boolean dxw() {
        return this.mRn;
    }

    public void sX(boolean bl) {
        if (bl == this.mRn) {
            return;
        }
        this.mRn = bl;
        this.mRb.V(this);
        jcc.dwT().mQJ.V(this);
    }

    private void cUp() {
        if (this.isCompleted()) {
            this.a(jbx.mPY);
        } else if (this.xP()) {
            this.a(jbx.mQd);
        } else if (this.dxn()) {
            this.a(jbx.mQc);
        } else if (this.isInProgress()) {
            this.a(jbx.mQb);
        } else if (!this.mRm) {
            this.a(jbx.mQa);
        } else {
            this.a(jbx.mPZ);
        }
        this.sV(!this.dxi());
    }
}

