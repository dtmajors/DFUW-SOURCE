/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cug
 *  lcr
 *  lcw
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class bue
extends btk
implements bto {
    private Map<ldv, cbx> dMW = lcn.emw();
    private Set<cbx> dMX = lcn.emx();
    private Set<ldv> dMY = lcn.emx();

    @Override
    public void doTick(ldz ldz2) {
        if (this.dMX.isEmpty()) {
            return;
        }
        if (!lcw.qFy) {
            return;
        }
        Iterator<cbx> iterator = this.dMX.iterator();
        while (iterator.hasNext()) {
            cbx cbx2 = iterator.next();
            if (cbx2 == null || cbx2.aAG() == null || cbx2.aAG().azb() == null) continue;
            iterator.remove();
            String string = "";
            ej ej2 = cbx2.aIj().ae(1328);
            if (ej2 != null && ej2 instanceof ff) {
                ff ff2 = (ff)ej2;
                string = ff2.getStringValue();
            }
            this.a(cbx2.getGUID(), cbx2.aAG().av(), string, cbx2.az());
        }
    }

    public void n(cbx cbx2) {
        if (this.mV(cbx2.az()) < 0) {
            return;
        }
        this.dMW.put(cbx2.getGUID(), cbx2);
        this.dMX.add(cbx2);
    }

    private int mV(int n) {
        if (lea.enW().isDescendant(n, cug.fsb)) {
            return cug.flS;
        }
        if (lea.enW().isDescendant(n, cug.fsc)) {
            return cug.flT;
        }
        if (lea.enW().isDescendant(n, cug.fsd)) {
            return cug.flU;
        }
        return -1;
    }

    public void o(cbx cbx2) {
        this.dMW.remove(cbx2.getGUID());
        this.dMX.remove(cbx2);
        if (this.dMY.contains(cbx2.getGUID())) {
            this.jE(cbx2.getGUID());
        }
    }

    private void a(ldv ldv2, ljq ljq2, String string, int n) {
        if (this.dMY.contains(ldv2)) {
            return;
        }
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKR;
        ffb2.dbx = ldv2;
        ffb2.iKP = new ljg(string);
        ffb2.dzN = new lhu(16, 16, "gui/targeticons/take.dds");
        ffb2.ResourceType = this.mV(n);
        ffb2.iKQ = ljq2;
        ffb2.eir = 0.0f;
        ffb2.eis = new ljp(1.0f, 1.0f);
        this.MessageDelegator.F(ffb2);
        this.dMY.add(ldv2);
    }

    private void jE(ldv ldv2) {
        if (!this.dMY.contains(ldv2)) {
            return;
        }
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKT;
        ffb2.dbx = ldv2;
        this.MessageDelegator.F(ffb2);
        this.dMY.remove(ldv2);
    }
}

