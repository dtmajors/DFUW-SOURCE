/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cew
 *  cug
 *  lcr
 *  lcw
 */
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class btq
extends btk
implements bto {
    private Map<ldv, btr> dLL = lcn.emw();
    private Set<ccg> dLM = lcn.emx();
    private Set<cck> dLN = lcn.emx();
    private Set<ldv> dLO = lcn.emx();
    private Map<ldv, bud> dLP = lcn.emw();
    private btx dLQ = null;
    private cew dLR = null;

    @Override
    public void doTick(ldz ldz2) {
        ff ff2;
        ej ej2;
        String string;
        ccc ccc2;
        Iterator<ccc> iterator;
        if (!lcw.qFy) {
            return;
        }
        if (!this.dLM.isEmpty()) {
            iterator = this.dLM.iterator();
            while (iterator.hasNext()) {
                ccc2 = iterator.next();
                if (ccc2 == null || ccc2.aAG() == null || ccc2.aAG().azb() == null) continue;
                iterator.remove();
                string = "";
                ej2 = ccc2.aIj().ae(1328);
                if (ej2 != null && ej2 instanceof ff) {
                    ff2 = (ff)ej2;
                    string = ff2.getStringValue();
                }
                this.a(ccc2.getGUID(), ccc2.aAG().av(), cug.fmj, string);
            }
        }
        if (!this.dLN.isEmpty()) {
            iterator = this.dLN.iterator();
            while (iterator.hasNext()) {
                ccc2 = (cck)iterator.next();
                if (ccc2 == null || ccc2.aAG() == null || ccc2.aAG().azb() == null) continue;
                iterator.remove();
                string = "";
                ej2 = ccc2.aIj().ae(1328);
                if (ej2 != null && ej2 instanceof ff) {
                    ff2 = (ff)ej2;
                    string = ff2.getStringValue();
                }
                this.a(ccc2.getGUID(), ccc2.aAG().av(), cug.fmi, string);
            }
        }
    }

    public void a(btx btx2) {
        this.dLQ = btx2;
    }

    public cew axF() {
        return this.dLR;
    }

    public void b(cew cew2) {
        this.dLR = cew2;
        this.dLQ.b(this.dLR);
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.dLQ = new btx();
            this.dLQ.setGUID(lcr.qCd);
            this.MessageDelegator.a(this.dLQ);
            this.Initialized = true;
        }
    }

    public void a(ccc ccc2) {
        assert (ccc2 != null);
        switch (ccc2.getObjectType()) {
            case 101: {
                this.a((ccg)ccc2);
                break;
            }
            case 100: {
                this.dLQ.a((cci)ccc2);
                break;
            }
            case 102: {
                this.a((cck)ccc2);
                break;
            }
            case 139: {
                break;
            }
            default: {
                lfn.b(5, "SFBindStoneManagement", "notifyBindStoneCreated() Invalid bindstone provided: '" + amh.gL(ccc2.getObjectType()) + "'");
                return;
            }
        }
    }

    public void b(ccc ccc2) {
        this.p(ccc2.getObjectType(), ccc2.getGUID());
    }

    public void p(int n, ldv ldv2) {
        assert (ldv2 != null);
        switch (n) {
            case 101: {
                this.jC(ldv2);
                break;
            }
            case 100: {
                this.dLQ.jH(ldv2);
                break;
            }
            case 102: {
                this.jD(ldv2);
                break;
            }
            case 139: {
                break;
            }
            default: {
                lfn.b(5, "SFBindStoneManagement", "notifyBindStoneRemoved() Invalid bindstone provided: '" + amh.gL(n) + "'");
                return;
            }
        }
    }

    private void a(ccg ccg2) {
        assert (ccg2 != null);
        btr btr2 = this.dLL.get(ccg2.getGUID());
        if (btr2 != null) {
            lfn.b(5, "SFBindStoneManagement", "handleChaosStoneCreated() ChaosStoneInfo for chaosstone " + ccg2.getGUID() + " already exists.");
            return;
        }
        btr2 = new btr();
        btr2.dLS = ccg2;
        this.dLL.put(btr2.dLS.getGUID(), btr2);
        this.dLM.add(ccg2);
    }

    private void a(cck cck2) {
        assert (cck2 != null);
        bud bud2 = this.dLP.get(cck2.getGUID());
        if (bud2 != null) {
            lfn.b(5, "SFBindStoneManagement", "handleGreaterStoneCreated() GreaterStoneInfo for greaterstone " + cck2.getGUID() + " already exists.");
            return;
        }
        bud2 = new bud();
        bud2.dMV = cck2;
        this.dLP.put(bud2.dMV.getGUID(), bud2);
        this.dLN.add(cck2);
    }

    private void jC(ldv ldv2) {
        assert (ldv2 != null);
        btr btr2 = this.dLL.remove(ldv2);
        if (btr2 == null) {
            lfn.b(5, "SFBindStoneManagement", "handleChaosStoneRemoved() Could not find chaosstoneinfo for chaosstone " + ldv2);
            return;
        }
        this.dLM.remove(btr2.dLS);
        if (btr2.dLS != null && this.dLO.contains(btr2.dLS.getGUID())) {
            this.jE(btr2.dLS.getGUID());
        }
    }

    private void jD(ldv ldv2) {
        assert (ldv2 != null);
        bud bud2 = this.dLP.remove(ldv2);
        if (bud2 == null) {
            lfn.b(5, "SFBindStoneManagement", "handleGreaterStoneRemoved() Could not find greaterstoneinfo for greaterstone " + ldv2);
            return;
        }
        this.dLN.remove(bud2.dMV);
        if (bud2.dMV != null && this.dLO.contains(bud2.dMV.getGUID())) {
            this.jE(bud2.dMV.getGUID());
        }
        lfn.b(0, "SFBindStoneManagement", "handleGreaterStoneRemoved() Removed " + bud2);
    }

    private void a(ldv ldv2, ljq ljq2, int n, String string) {
        if (this.dLO.contains(ldv2)) {
            return;
        }
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKR;
        ffb2.dbx = ldv2;
        ffb2.iKP = new ljg(string);
        ffb2.dzN = new lhu(16, 16, "gui/targeticons/take.dds");
        ffb2.ResourceType = n;
        ffb2.iKQ = ljq2;
        ffb2.eir = 0.0f;
        ffb2.eis = new ljp(1.0f, 1.0f);
        this.MessageDelegator.F(ffb2);
        this.dLO.add(ldv2);
    }

    private void jE(ldv ldv2) {
        if (!this.dLO.contains(ldv2)) {
            return;
        }
        ffb ffb2 = (ffb)this.MessageDelegator.h(2571, this.GUID, lcr.acL);
        ffb2.iKO = ffb.a.iKT;
        ffb2.dbx = ldv2;
        this.MessageDelegator.F(ffb2);
        this.dLO.remove(ldv2);
    }
}

