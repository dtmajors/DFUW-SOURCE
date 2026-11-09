/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class jcd
extends jce
implements ith {
    jcc mQQ;
    private xa mQR;
    private List<jci> mQS = lcn.emv();
    private Map<xb, jci> mQT = lcn.emw();
    private Map<Integer, jci> mQU = lcn.emw();

    public jcd(xa xa2) {
        this.mQR = xa2;
    }

    public jcc dxa() {
        return this.mQQ;
    }

    @Override
    public xa dxb() {
        return this.mQR;
    }

    public List<jci> dxc() {
        return Collections.unmodifiableList(this.mQS);
    }

    public jci d(xb xb2) {
        return this.mQT.get(xb2);
    }

    public void a(jci jci2) {
        if (jci2.mQZ != null) {
            assert (false);
            return;
        }
        jci2.mQZ = this;
        this.mQS.add(jci2);
        this.mQT.put(jci2.vS(), jci2);
        this.mQU.put(jci2.vS().getID(), jci2);
        this.e(jci2);
    }

    @Override
    public jcg TQ(int n) {
        jcg jcg2 = super.TQ(n);
        if (jcg2 != null) {
            return jcg2;
        }
        jci jci2 = this.mQU.get(n);
        if (jci2 != null) {
            return jci2;
        }
        for (jci jci3 : this.mQS) {
            jcg2 = jci3.TQ(n);
            if (jcg2 == null) continue;
            return jcg2;
        }
        return null;
    }

    @Override
    public ith dqI() {
        return this.mQQ;
    }

    @Override
    public loz aND() {
        return this.mQR.wp().bD(new Object[0]);
    }

    @Override
    public jbz dxd() {
        return null;
    }

    @Override
    public void a(jbz jbz2) {
    }

    @Override
    public jbx dxe() {
        return null;
    }

    @Override
    public void a(jbx jbx2) {
    }

    @Override
    public boolean dxf() {
        return false;
    }

    @Override
    public void sV(boolean bl) {
    }

    @Override
    public List<String> dxg() {
        Object object;
        ArrayList<String> arrayList = lcn.emv();
        List<jch> list = this.wr();
        for (jch object22 : list) {
            object = object22.dxg();
            if (object == null || object.isEmpty()) continue;
            arrayList.addAll((Collection<String>)object);
        }
        List<jci> list2 = this.dxc();
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            object = (jci)iterator.next();
            List<String> list3 = ((jci)object).dxg();
            if (list3 == null || list3.isEmpty()) continue;
            arrayList.addAll(list3);
        }
        return arrayList;
    }

    @Override
    public boolean vY() {
        List<jch> list = this.wr();
        for (jch object2 : list) {
            if (!object2.vY()) continue;
            return true;
        }
        List<jci> list2 = this.dxc();
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            jci jci2 = (jci)iterator.next();
            if (!jci2.vY()) continue;
            return true;
        }
        return false;
    }
}

