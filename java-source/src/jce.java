/*
 * Decompiled with CFR.
 */
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class jce
extends jcg
implements ith {
    private List<jch> mQV = lcn.emv();
    private Map<Integer, jch> mQW = lcn.emw();
    private List<ith> mQX = lcn.emv();

    public List<jch> wr() {
        return Collections.unmodifiableList(this.mQV);
    }

    public void b(jch jch2) {
        if (jch2.mQZ != null) {
            assert (false);
            return;
        }
        jch2.mQZ = this;
        this.mQV.add(jch2);
        this.mQW.put(jch2.wF().getID(), jch2);
        this.e(jch2);
    }

    @Override
    public boolean hasChildren() {
        return !this.mQX.isEmpty();
    }

    @Override
    public List<ith> getChildren() {
        return this.mQX;
    }

    @Override
    public jcg TQ(int n) {
        jcg jcg2 = this.mQW.get(n);
        if (jcg2 != null) {
            return jcg2;
        }
        for (jch jch2 : this.mQV) {
            jcg2 = jch2.TQ(n);
            if (jcg2 == null) continue;
            return jcg2;
        }
        return null;
    }

    protected void e(ith ith2) {
        this.mQX.add(ith2);
    }
}

