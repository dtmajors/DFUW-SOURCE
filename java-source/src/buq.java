/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcr
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class buq
extends btk
implements bto {
    private Map<ldv, cpv> dOH = lcn.emw();
    private Set<cpv> dOI = lcn.emx();
    private Set<ldv> dOJ = lcn.emx();
    private Map<ldv, ldv> dOK = lcn.emw();
    private boolean dOL;
    private boolean dOM = true;

    @Override
    public void doTick(ldz ldz2) {
        if (this.dOH.isEmpty()) {
            return;
        }
        if (!this.dOL) {
            return;
        }
        Iterator<cpv> iterator = this.dOI.iterator();
        while (iterator.hasNext()) {
            cpv cpv2 = iterator.next();
            if (cpv2 == null || cpv2.aAG() == null || cpv2.aAG().azb() == null) continue;
            iterator.remove();
            String string = "";
            ej ej2 = cpv2.aIj().ae(1328);
            if (ej2 != null && ej2 instanceof ff) {
                ff ff2 = (ff)ej2;
                string = ff2.getStringValue();
            }
            if (this.dOM && !this.dOK.containsKey(cpv2.getGUID())) {
                this.b(cpv2.getGUID(), cpv2.aAG().av(), string);
                continue;
            }
            if (this.dOM || !this.dOK.containsKey(cpv2.getGUID())) continue;
            this.jW(cpv2.getGUID());
        }
    }

    public void a(cpv cpv2) {
        this.dOH.put(cpv2.getGUID(), cpv2);
        this.dOI.add(cpv2);
    }

    public void b(cpv cpv2) {
        this.dOH.remove(cpv2.getGUID());
        this.dOI.remove(cpv2);
        if (this.dOJ.contains(cpv2.getGUID())) {
            this.jE(cpv2.getGUID());
        }
        if (this.dOK.containsKey(cpv2.getGUID())) {
            this.jW(cpv2.getGUID());
        }
    }

    private void a(ldv ldv2, ljq ljq2, String string) {
        if (this.dOJ.contains(ldv2)) {
            return;
        }
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKR;
        ffb2.dbx = ldv2;
        ffb2.iKP = new ljg(string);
        ffb2.dzN = new lhu(16, 16, "gui/targeticons/take.dds");
        ffb2.ResourceType = cug.flY;
        ffb2.iKQ = ljq2;
        ffb2.eir = 0.0f;
        ffb2.eis = new ljp(1.0f, 1.0f);
        this.MessageDelegator.F(ffb2);
        this.dOJ.add(ldv2);
    }

    private void jE(ldv ldv2) {
        if (!this.dOJ.contains(ldv2)) {
            return;
        }
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKT;
        ffb2.dbx = ldv2;
        this.MessageDelegator.F(ffb2);
        this.dOJ.remove(ldv2);
    }

    private void a(gzd gzd2) {
        this.en(gzd2.bYu());
    }

    private void b(ldv ldv2, ljq ljq2, String string) {
        ldv ldv3;
        if (this.dOK.containsKey(ldv2)) {
            return;
        }
        glh glh2 = (glh)this.MessageDelegator.h(13057, this.GUID, lcr.qEa);
        glh2.SpecialEffectType = del.gko;
        assert (glh2.SpecialEffectType != -1) : "vendor wrong sfx resource type";
        glh2.aUa = ldv3 = this.MessageDelegator.lL(lcr.qEa);
        glh2.akX = ldv2;
        glh2.aZD = ljq2;
        this.MessageDelegator.F(glh2);
        this.dOK.put(ldv2, ldv3);
    }

    private void jW(ldv ldv2) {
        if (!this.dOK.containsKey(ldv2)) {
            return;
        }
        glj glj2 = (glj)this.MessageDelegator.h(13058, this.GUID, lcr.qEa);
        glj2.jkV = 1;
        glj2.aUa = this.dOK.get(ldv2);
        this.MessageDelegator.F(glj2);
        this.dOK.remove(ldv2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2574: {
                this.dOL = ((ffj)dxq2).dOL;
                break;
            }
            case 20230: {
                this.a((gzd)dxq2);
            }
        }
        super.receiveMessage(dxq2);
    }

    public void en(boolean bl2) {
        if (this.dOM != bl2) {
            this.dOI.addAll(this.dOH.values());
        }
        this.dOM = bl2;
    }
}

