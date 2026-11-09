/*
 * Decompiled with CFR.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class jkl
extends btk
implements bto,
hva {
    private int nsK = 0;
    private HashMap<ldv, jkk> nsS = new HashMap();

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxP().czd().a(this);
        if (hso.cxK().cxP().czd().HT()) {
            this.cyF();
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().czd() != null) {
            hso.cxK().cxP().czd().b(this);
        }
    }

    @Override
    public void f(bbi bbi2) {
        jjh jjh2 = hso.cxK().cxT().dIN().rV(bbi2.getGUID());
        if (jjh2 == null) {
            return;
        }
        if (bbi2.iG() != null) {
            String string = this.sq(bbi2.iG());
            jjh2.ac("Owner", string);
        } else {
            jjh2.ac("Owner", null);
        }
    }

    @Override
    public void cyF() {
        Set<bbi> set = hso.cxK().cxP().czd().bqr();
        for (bbi bbi2 : set) {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("Name", this.h(bbi2));
            hso.cxK().cxT().a(jjm.nop, bbi2.av(), null, hashMap, bbi2.getGUID());
            this.f(bbi2);
            this.g(bbi2);
        }
    }

    @Override
    public void g(bbi bbi2) {
        jjh jjh2 = hso.cxK().cxT().dIN().rV(bbi2.getGUID());
        if (jjh2 == null) {
            return;
        }
        if (bbi2.isDestroyed()) {
            this.nsS.put(bbi2.getGUID(), new jkk(jjh2, bbi2.getGUID(), bbi2.ajW(), bbi2.acU(), bbi2.ajY(), bbi2.ajZ()));
            jjh2.sA("texture/gui/runtime/markers/sea_fortress_destroyed.png");
        } else if (bbi2.acU() > 0.0) {
            this.nsS.put(bbi2.getGUID(), new jkk(jjh2, bbi2.getGUID(), bbi2.ajW(), bbi2.acU(), bbi2.ajY(), bbi2.ajZ()));
            jjh2.sA("texture/gui/runtime/markers/sea_fortress_protected.png");
        } else if (bbi2.acU() == -1.0) {
            this.nsS.put(bbi2.getGUID(), new jkk(jjh2, bbi2.getGUID(), -1.0, -1.0, bbi2.ajY(), bbi2.ajZ()));
            jjh2.sA("texture/gui/runtime/markers/sea_fortress_protected.png");
        } else {
            this.nsS.put(bbi2.getGUID(), new jkk(jjh2, bbi2.getGUID(), -1.0, -1.0, bbi2.ajY(), bbi2.ajZ()));
            jjh2.sA("texture/gui/runtime/markers/sea_fortress_vulnerable.png");
            jjh2.setProgress(0.0f);
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (ldz2.lpr - this.nsK > 10) {
            this.nsK = ldz2.lpr;
            for (Map.Entry<ldv, jkk> entry : this.nsS.entrySet()) {
                double d2 = entry.getValue().aAx() - entry.getValue().aAw();
                double d3 = this.MessageDelegator.arc().rgz - entry.getValue().aAw();
                double d4 = Math.min(d3 / d2, 1.0);
                entry.getValue().duI().setProgress((float)d4);
            }
        }
    }

    public jkk sp(ldv ldv2) {
        return this.nsS.get(ldv2);
    }

    private String h(bbi bbi2) {
        return lvm.sXg.bD(bbi2.av()).exA();
    }

    private String sq(ldv ldv2) {
        Set<bcp> set = hso.cxK().cxP().czd().bqm();
        for (bcp bcp2 : set) {
            if (!bcp2.iG().equals(ldv2)) continue;
            return bcp2.iV();
        }
        return null;
    }
}

