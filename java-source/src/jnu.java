/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hzo
 *  lcr
 *  lcw
 */
import java.util.Collection;
import java.util.Map;
import java.util.Queue;

public class jnu
extends btk
implements bto {
    private static final float nFo = 3.0f;
    private static final float nFp = 9.0f;
    private jgq lxe = null;
    private jgq nFq = null;
    private ikm nFr = null;
    private jnf nFs = null;
    private loz nFt = null;
    private loz nFu = null;
    private jf nFv = null;
    private Map<Integer, Double> nFw = lcn.emw();
    private Queue<loz> nFx = lcn.emA();

    @Override
    public void initialize() {
        Collection collection;
        super.initialize();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cxO() != null && hso.cxK().cxP().cxO() instanceof hzo) {
            this.nFs = hso.cxK().cxP().cze();
            collection = (hzo)hso.cxK().cxP().cxO();
            this.lxe = collection.cHz();
            this.nFq = collection.cHA();
            this.nFr = collection.cIQ();
        }
        if (this.nFv == null) {
            this.nFv = new jf(this);
            this.nFv.setGUID(this.MessageDelegator.bzv());
            this.MessageDelegator.a(this.nFv);
        }
        if ((collection = hso.cxK().cxP().d(this.getClass())) != null && !collection.isEmpty()) {
            for (dxq dxq2 : collection) {
                this.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void cleanUp() {
        this.lxe = null;
        this.nFq = null;
        this.nFr = null;
        this.nFs = null;
        if (this.nFv != null) {
            this.MessageDelegator.hd(this.nFv.getGUID());
            this.nFv = null;
        }
        super.cleanUp();
    }

    @Override
    public void doTick(ldz ldz2) {
        if ((this.nFq == null || this.lxe == null || this.nFs == null || this.nFr == null) && hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cxO() != null && hso.cxK().cxP().cxO() instanceof hzo) {
            this.nFs = hso.cxK().cxP().cze();
            hzo hzo2 = (hzo)hso.cxK().cxP().cxO();
            this.lxe = hzo2.cHz();
            this.nFq = hzo2.cHA();
            this.nFr = hzo2.cIQ();
        }
        if (!this.nFx.isEmpty() && this.nFq != null && this.lxe != null && this.nFs != null && this.nFr != null && this.nFq.cDj() && this.lxe.cDj()) {
            while (!this.nFx.isEmpty()) {
                this.v(this.nFx.poll());
            }
        }
    }

    public void dOi() {
        if (this.lxe != null && this.nFt != null) {
            this.lxe.addText(this.nFt.exA());
        }
        if (this.nFq != null && this.nFu != null) {
            this.nFq.addText(this.nFu.exA());
        }
    }

    public void c(loz loz2, boolean bl) {
        if (loz2 == null) {
            return;
        }
        if (this.nFq == null || this.lxe == null || this.nFs == null || this.nFr == null) {
            this.nFx.add(loz2);
            return;
        }
        jns jns2 = this.sX(loz2.exz());
        if (jns2 == null) {
            jns2 = jns.a(jnt.nEz);
        }
        String string = loz2.exA();
        if (jns2.dOd()) {
            this.nFu = loz2;
            this.nFq.addText(string);
        } else if (jns2.cTR()) {
            this.nFu = loz2;
            this.nFq.addText(string);
        }
        if (jns2.dOe() && bl) {
            this.nFt = loz2;
            this.lxe.addText(string);
        }
        this.nFs.a(loz2, jns2);
        if (jns.sS(loz2.exz())) {
            this.nFr.c(loz2, jns.sT(loz2.exz()));
        }
        this.F(loz2);
    }

    public void v(loz loz2) {
        this.c(loz2, true);
    }

    private jns sX(String string) {
        jns jns2 = jns.sW(string);
        if (jns2 != null) {
            return jns2;
        }
        String[] stringArray = string.split("\\.");
        for (int j = stringArray.length - 1; j > 0; --j) {
            String string2 = "";
            for (int k = 0; k < j; ++k) {
                string2 = string2 + (string2.isEmpty() ? "" : ".") + stringArray[k];
            }
            jns2 = jns.sW(string2);
            if (jns2 == null) continue;
            return jns2;
        }
        lfn.b(5, "SFNotificationsManager", "findNotificationCategory() : No Category Found for Received Notification!!!... NotificationID = " + string);
        return jns2;
    }

    public void pz(int n) {
        this.i(n, 0.0);
    }

    private void F(loz loz2) {
        String string;
        int n;
        lil<String, String, Double> lil2 = lpd.rHs.G(loz2);
        if (lil2 != null && (n = del.dr(string = lcw.emW() && lil2.reY != null && !((String)lil2.reY).isEmpty() ? (String)lil2.reY : (String)lil2.reX)) >= 0) {
            this.i(n, (Double)lil2.reZ);
        }
    }

    private void i(int n, double d2) {
        bth bth2 = (bth)this.MessageDelegator.bzx().bzt().d(lcr.qAG);
        if (bth2 != null && bth2.isEnabled()) {
            return;
        }
        Double d3 = this.nFw.get(n);
        if (d3 != null && d3 + d2 > this.MessageDelegator.arc().rgz) {
            return;
        }
        this.nFw.put(n, this.MessageDelegator.arc().rgz);
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEa);
        glh2.setSpecialEffectType(n);
        glh2.setTargetObjectGUID(null);
        glh2.setTargetPosition(new ljq());
        this.MessageDelegator.E(glh2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 29446: {
                this.d((fgs)dxq2);
                break;
            }
            case 29449: {
                this.a((fgr)dxq2);
                break;
            }
            case 29451: 
            case 29452: {
                this.nFv.receiveMessage(dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void d(fgs fgs2) {
        this.v(fgs2.bPu());
    }

    private void a(fgr fgr2) {
        this.v(fgr2.bPt());
    }
}

