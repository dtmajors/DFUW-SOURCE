/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  hzo
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ifa
extends ier
implements hyy.c {
    private static int[] lPI = new int[]{cug.fpB, cug.fpE, cug.fpA, cug.fpC, cug.fpF};
    ffi lPJ = null;

    public ifa() {
        super("SkillsList", "SkillsList.swf");
        this.OQ(jnz.nGn);
        this.a(hyb.lmC);
    }

    @Override
    public void initialize() {
        super.initialize();
        hzo hzo2 = (hzo)ifa.cxO();
        hzo2.cHx().a(hyy.a.lry, this);
    }

    public void cleanUp() {
        super.cleanUp();
        hzo hzo2 = (hzo)ifa.cxO();
        if (hzo2 != null && hzo2.cHx() != null) {
            hzo2.cHx().b(hyy.a.lry);
        }
    }

    public void a(List<Integer> list, ffi ffi2) {
        Object object;
        Object object2;
        Object object3;
        this.lPJ = ffi2;
        while (this.lOp.size() > 0) {
            this.Qg(0);
        }
        if (ifa.Qr(this.lPJ.iKX) && ifa.cxP() != null && ifa.cxP().cyZ() != null) {
            object3 = (lhg)lea.enZ().acv(cxd.fLs);
            object2 = new hwv((bsn)object3);
            ((hwv)object2).setEnabled(ifa.cxP().cyZ().ht(cxd.fLs) != null);
            object = new ieq(this, (hwm)object2);
            this.a((ieq)object, this.lOp.size());
        }
        object3 = lcn.emv();
        object3.addAll(list);
        Collections.sort(object3, new Comparator<Integer>(this){
            final /* synthetic */ ifa lPK;
            {
                this.lPK = ifa2;
            }

            public int b(Integer n, Integer n2) {
                String string = lvm.sXe.bD(n).exA();
                String string2 = lvm.sXe.bD(n2).exA();
                return string.compareTo(string2);
            }

            public /* synthetic */ int compare(Object object, Object object2) {
                return this.b((Integer)object, (Integer)object2);
            }
        });
        object2 = object3.iterator();
        while (object2.hasNext()) {
            object = (Integer)object2.next();
            lhg lhg2 = (lhg)lea.enZ().acv((Integer)object);
            hwv hwv2 = new hwv(lhg2);
            cxc cxc2 = ifa.cxP().cyZ().ht(((Integer)object).intValue());
            hwv2.setEnabled(true);
            ieq ieq2 = new ieq(this, hwv2);
            this.a(ieq2, this.lOp.size());
        }
    }

    public void a(int n, ffi ffi2) {
        ldv ldv2 = hso.cxK().bAn().gYX;
        gao gao2 = (gao)this.MessageDelegator.h(4867, this.getGUID(), ldv2);
        gao2.fBc = new int[]{n};
        gao2.fBb = true;
        gao2.fyj = ffi2.iKX;
        gao2.fBd = ffi2.fBd;
        gao2.fBe = ffi2.fBe;
        gao2.bpJ = ffi2.bpJ;
        this.MessageDelegator.E(gao2);
        hso.cxK().a(jnz.nFI);
    }

    protected void kq(float f) {
        this.a("setSize", new Object[]{Float.valueOf(f), 140});
    }

    @Override
    public void c(ieq ieq2) {
        hwv hwv2 = (hwv)ieq2.cQm();
        int n = hwv2.awK().getType();
        assert (this.lPJ != null);
        if (this.lPJ == null) {
            return;
        }
        this.a(n, this.lPJ);
    }

    @Override
    public void b(hyy.b b2, int n) {
        if (hso.cxK().cxN() == jnz.nFN && b2 == hyy.b.ltk) {
            hso.cxK().a(jnz.nFI);
        }
    }

    @Override
    public boolean cGG() {
        return true;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    private static boolean Qr(int n) {
        for (int j = 0; j < lPI.length; ++j) {
            if (lPI[j] != n) continue;
            return false;
        }
        return true;
    }
}

