/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.Set;

public class jki
extends btk
implements huh,
hux,
huy {
    private int nsK = 0;
    private HashMap<ldv, jkj> nsL = new HashMap();

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxP().czd().a(this);
        hso.cxK().cxP().czb().a(this);
        if (hso.cxK().cxP().czd().HT()) {
            this.cyF();
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null) {
            if (hso.cxK().cxP().czd() != null) {
                hso.cxK().cxP().czd().b(this);
            }
            if (hso.cxK().cxP().czb() != null) {
                hso.cxK().cxP().czb().b(this);
            }
        }
    }

    @Override
    public void h(azg azg2) {
        Object object;
        if (azg2 == null) {
            assert (false);
            return;
        }
        jjh jjh2 = hso.cxK().cxT().dIN().rV(azg2.XA());
        if (jjh2 == null) {
            return;
        }
        float f2 = (float)azg2.XD() / (float)azg2.XC();
        if (azg2.iG() != null && hso.cxK().cxP().czb() != null) {
            object = hso.cxK().cxP().czb().ack();
            if (f2 >= 1.0f || azg2.iG().equals(object)) {
                jjh2.setProgress(f2);
                if (jjh2.cBk() >= 1.0f) {
                    jjh2.sA("texture/gui/runtime/markers/collector_full.png");
                } else {
                    jjh2.sA("texture/gui/runtime/markers/collector.png");
                }
            }
        }
        object = new jkj(jjh2, azg2.XA(), azg2.XD(), azg2.XC());
        dmn dmn2 = hso.cxK().cxP().czd();
        if (dmn2 != null && dmn2.nc(azg2.getGUID())) {
            jjh2.sA("texture/gui/runtime/markers/collector_protected.png");
            ((jkj)object).ug(true);
        }
        this.nsL.put(azg2.XA(), (jkj)object);
    }

    @Override
    public void cyF() {
        Set<dml> set = hso.cxK().cxP().czd().bqu();
        for (dml dml2 : set) {
            azg azg2 = hso.cxK().cxP().czd().AJ(dml2.acY());
            if (azg2 == null || azg2.XA() == null) continue;
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("Name", this.l(azg2));
            hso.cxK().cxT().a(jjm.not, azg2.XB(), null, hashMap, azg2.XA());
            dml2.ir(azg2.XC());
            dml2.is(azg2.XD());
            this.h(azg2);
        }
    }

    public jkj so(ldv ldv2) {
        return this.nsL.get(ldv2);
    }

    @Override
    public void oj() {
        this.oi();
    }

    @Override
    public void oi() {
        Set<dml> set = hso.cxK().cxP().czd().bqu();
        for (dml dml2 : set) {
            azg azg2 = hso.cxK().cxP().czd().AJ(dml2.acY());
            if (azg2 == null || azg2.XA() == null) continue;
            this.h(azg2);
        }
    }

    private String l(azg azg2) {
        return lvm.sXg.bD(azg2.av()).exA();
    }
}

