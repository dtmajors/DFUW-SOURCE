/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class jcc
implements ith {
    public final jll<jch> mQs = new jll();
    public final jll<jch> mQt = new jll();
    public final jll<jch> mQu = new jll();
    public final jll<jci> mQv = new jll();
    public final jll<jci> mQw = new jll();
    public final jll<jci> mQx = new jll();
    public final jlm<jch, jcm> mQy = new jlm();
    public final jlm<jch, jcm> mQz = new jlm();
    public final jll<jcn> mQA = new jll();
    public final jll<jcn> mQB = new jll();
    public final jlm<jcm, jcf> mQC = new jlm();
    public final jlm<jcg, jcg> mQD = new jlm();
    public final jlm<jch, jjh> mQE = new jlm();
    public final jlm<jch, jjh> mQF = new jlm();
    public final jlm<jch, Integer> mQG = new jlm();
    public final jll<jcg> mQH = new jll();
    public final jll<jcg> mQI = new jll();
    public final jll<jch> mQJ = new jll();
    public final jln<Integer, List<jck>, Boolean> mQK = new jln();
    private static jcc mQL = new jcc();
    private Map<xa, jcd> mQM = lcn.emw();
    private List<ith> mQN = lcn.emv();
    private jcg mQO;
    private int mQP = -1;

    public static jcc dwT() {
        return mQL;
    }

    public Map<xa, jcd> dwU() {
        return Collections.unmodifiableMap(this.mQM);
    }

    public jcd a(xa xa2) {
        return this.mQM.get((Object)xa2);
    }

    public void a(jcd jcd2) {
        if (jcd2.mQQ != null) {
            assert (false);
            return;
        }
        jcd2.mQQ = this;
        this.mQM.put(jcd2.dxb(), jcd2);
        this.mQN.add(jcd2);
    }

    @Override
    public ith dqI() {
        return null;
    }

    @Override
    public boolean hasChildren() {
        return !this.mQN.isEmpty();
    }

    @Override
    public List<ith> getChildren() {
        return this.mQN;
    }

    @Override
    public loz aND() {
        return lxu.txJ.bD(new Object[0]);
    }

    public jcg TO(int n) {
        for (jcd jcd2 : this.mQM.values()) {
            jcg jcg2 = jcd2.TQ(n);
            if (jcg2 == null) continue;
            return jcg2;
        }
        return null;
    }

    public void b(wz wz2) {
        jcg jcg2 = this.TO(wz2.getID());
        if (jcg2 != null) {
            jch jch2;
            jci jci2;
            jcg2.a(jbz.mQk);
            if (jcg2 instanceof jch && (jci2 = (jch2 = (jch)jcg2).dxk()) != null) {
                jci2.a(jbz.mQk);
            }
        }
    }

    public void i(wy wy2) {
        jcg jcg2 = this.TO(wy2.getID());
        if (jcg2 != null) {
            jch jch2;
            jci jci2;
            jcg2.a(jbz.mQl);
            if (jcg2 instanceof jch && (jci2 = (jch2 = (jch)jcg2).dxk()) != null && jci2.dxd() != jbz.mQl) {
                boolean bl = true;
                for (jch jch3 : jci2.wr()) {
                    if (jch3.dxd() == jbz.mQl) continue;
                    bl = false;
                    break;
                }
                if (bl) {
                    jci2.a(jbz.mQl);
                }
            }
        }
    }

    public void j(wy wy2) {
        jch jch2 = (jch)this.TO(wy2.getID());
        if (jch2 != null) {
            jch2.dxm();
            jch2.a(jbz.mQj);
        }
    }

    public void a(int n, jcm jcm2) {
        if (jcm2 == null) {
            return;
        }
        jch jch2 = (jch)this.TO(n);
        if (jch2 != null) {
            jch2.a(jcm2);
        }
    }

    public void b(int n, jcm jcm2) {
        jch jch2 = (jch)this.TO(n);
        if (jch2 != null) {
            jch2.b(jcm2);
        }
    }

    public int a(int n, jjm jjm2, float f, float f2) {
        jch jch2 = (jch)this.TO(n);
        if (jch2 == null) {
            assert (false);
            return -1;
        }
        return jch2.a(jjm2, f, f2);
    }

    public void fm(int n, int n2) {
        jch jch2 = (jch)this.TO(n);
        if (jch2 == null) {
            assert (false);
            return;
        }
        jch2.TR(n2);
    }

    public void fn(int n, int n2) {
    }

    public void fo(int n, int n2) {
    }

    public void b(aci aci2) {
        this.mQG.k((jch)this.TO(aci2.wF().getID()), aci2.getID());
    }

    public jcg dwV() {
        return this.mQO;
    }

    public void c(jcg jcg2) {
        if (jcg2 == this.mQO) {
            return;
        }
        jcg jcg3 = this.mQO;
        this.mQO = jcg2;
        this.mQO.dxj();
        this.mQD.k(jcg3, this.mQO);
    }

    public static xe dwW() {
        return xe.baL;
    }

    public jcg dwX() {
        return this.mQP != -1 ? this.TO(this.mQP) : null;
    }

    public void TP(int n) {
        if (this.mQP != -1) {
            this.dwY();
        }
        jcg jcg2 = this.TO(n);
        List<String> list = jcg2.dxg();
        for (String string : list) {
            jcc.dwW().cp(string);
        }
        this.mQP = n;
        this.mQH.V(jcg2);
    }

    public void a(int n, jcf jcf2) {
        if (this.mQP != -1) {
            this.dwY();
        }
        jcg jcg2 = this.TO(n);
        jcc.dwW().cp(jcf2.b(jcc.dwT().dwZ()));
        this.mQP = n;
        this.mQH.V(jcg2);
    }

    public void dwY() {
        if (this.mQP == -1) {
            return;
        }
        jcc.dwW().wy();
        this.mQI.V(this.TO(this.mQP));
        this.mQP = -1;
    }

    public yw dwZ() {
        return yw.bbO;
    }

    public boolean vY() {
        for (jcd jcd2 : this.mQM.values()) {
            if (!jcd2.vY()) continue;
            return true;
        }
        return false;
    }

    private jcc() {
    }
}

