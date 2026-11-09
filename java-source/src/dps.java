/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class dps
extends btk {
    private Map<ldv, dpx> gIx = lcn.emw();
    private Set<String> gNg = lcn.emx();

    public List<ldv> bso() {
        ArrayList<ldv> arrayList = lcn.abH(this.gIx.size());
        arrayList.addAll(this.gIx.keySet());
        return arrayList;
    }

    private void a(gbi gbi2, ldv ldv2) {
        gbj gbj2 = (gbj)this.MessageDelegator.h(24322, this.GUID, gbi2.aO());
        this.MessageDelegator.b(gbi2, gbj2);
        gbj2.jcT = gbi2.eUC;
        gbj2.jcS = ldv2;
        gbj2.eo = ldv2 != null;
        this.MessageDelegator.F(gbj2);
    }

    private void a(gbo gbo2, ldv[] ldvArray, String[] stringArray) {
        gbp gbp2 = (gbp)this.MessageDelegator.h(24326, this.GUID, gbo2.aO());
        this.MessageDelegator.b(gbo2, gbp2);
        gbp2.aoY = ldvArray;
        gbp2.jcW = stringArray;
        this.MessageDelegator.F(gbp2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24321: {
                this.a((gbi)dxq2);
                break;
            }
            case 24325: {
                this.a((gbo)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gbi gbi2) {
        if (gbi2.eUC == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handlePlayerVillageCreateRequestMessage() : Village Filename is null!!!");
            this.a(gbi2, null);
            return;
        }
        jxv jxv2 = new jxv();
        dpr dpr2 = jxv2.vw(gbi2.eUC);
        if (dpr2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handlePlayerVillageCreateRequestMessage() : Could not parse village Xml file!!!... Filename = " + gbi2.eUC);
            assert (false);
            this.a(gbi2, null);
            return;
        }
        if (this.gNg.contains(dpr2.getID())) {
            lfn.b(5, this.getClass().getSimpleName(), "handlePlayerVillageCreateRequestMessage() : Village already exists!!!... Village ID = " + dpr2.getID() + ", Filename = " + gbi2.eUC);
            assert (false);
            this.a(gbi2, null);
            return;
        }
        if (dpr2.bsm() == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handlePlayerVillageCreateRequestMessage() : Village does not contain a control-point info object!!!... Filename = " + gbi2.eUC);
            assert (false);
            this.a(gbi2, null);
            return;
        }
        if (dpr2.bsn().isEmpty()) {
            lfn.b(5, this.getClass().getSimpleName(), "handlePlayerVillageCreateRequestMessage() : Village does not contain any house info objects!!!... Filename = " + gbi2.eUC);
            assert (false);
            this.a(gbi2, null);
            return;
        }
        ldv ldv2 = gbi2.jcS;
        if (ldv2 == null) {
            ldv2 = this.MessageDelegator.bzw();
            if (ldv2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "handlePlayerVillageCreateRequestMessage() : Failed to create new persitent GUID for village!!!... Filename = " + gbi2.eUC);
                assert (false);
                this.a(gbi2, null);
                return;
            }
        } else {
            this.MessageDelegator.nZ(ldv2);
        }
        dpx dpx2 = new dpx(this, dpr2);
        dpx2.setGUID(ldv2);
        this.MessageDelegator.a(dpx2);
        this.gIx.put(ldv2, dpx2);
        this.a(gbi2, ldv2);
    }

    private void a(gbo gbo2) {
        ldv[] ldvArray = new ldv[this.gIx.size()];
        String[] stringArray = new String[this.gIx.size()];
        int n = 0;
        for (dpx dpx2 : this.gIx.values()) {
            ldvArray[n] = dpx2.getGUID();
            stringArray[n] = dpx2.getID();
            ++n;
        }
        this.a(gbo2, ldvArray, stringArray);
    }
}

