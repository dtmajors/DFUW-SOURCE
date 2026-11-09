/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;

public class igk
extends btk
implements igl {
    private ign lSA;

    @Override
    public void initialize() {
        super.initialize();
        hso.cxK().cxP().cyJ().a((igl)this);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        if (hso.cxK() != null && hso.cxK().cxP() != null && hso.cxK().cxP().cyJ() != null) {
            hso.cxK().cxP().cyJ().b((igl)this);
        }
    }

    @Override
    public void a(fbt fbt2) {
        ArrayList<ign> arrayList = lcn.emv();
        ArrayList<ign> arrayList2 = lcn.emv();
        ArrayList<ign> arrayList3 = lcn.emv();
        for (int i = 0; i < fbt2.iII.length; ++i) {
            boolean bl;
            boolean bl2;
            int n = fbt2.iII[i];
            int n2 = (int)fbt2.iIJ[i];
            ign ign2 = igq.QK(n);
            if (ign2 == null) continue;
            boolean bl3 = ign2.isLocked();
            boolean bl4 = ign2.isCompleted();
            ign2.QN(n2);
            ign2.dp(fbt2.iIK[i]);
            if (ign2.cTT()) {
                ign2.QO(fbt2.iIL[i]);
            }
            arrayList2.add(ign2);
            boolean bl5 = bl2 = bl3 && !ign2.isLocked();
            if (bl2) {
                arrayList.add(ign2);
            }
            boolean bl6 = bl = !bl4 && ign2.isCompleted();
            if (!bl) continue;
            arrayList3.add(ign2);
            igq.l(ign2);
            if (ign2.cTI() != igm.lSL) continue;
            igq.k(ign2);
        }
        igq.lTF.c(arrayList, arrayList2, arrayList3, fbt2.iIH);
        if (!fbt2.iIH) {
            for (ign ign3 : arrayList) {
                if (!ign3.cTM()) continue;
                hso.cxK().cxP().c(mbu.uob.bD(ibi.a(ign3), ibi.b(ign3)), false);
            }
            for (ign ign4 : arrayList2) {
                if (!ign4.cTM() || !ign4.isInProgress()) continue;
                hso.cxK().cxP().c(mbu.tja.bD(ibi.a(ign4), ign4.cTu(), ign4.cTt(), ibi.b(ign4)), false);
            }
            for (ign ign5 : arrayList3) {
                if (!ign5.cTM()) continue;
                hso.cxK().cxP().cyJ().X(ign5.getId(), false);
                hso.cxK().cxP().c(mbu.tiK.bD(ibi.a(ign5)), false);
            }
            if (arrayList.size() > 0 && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cHw() != null) {
                hso.cxK().cxP().cyJ().cHw().d(hyc.lmQ, true);
            }
            if (arrayList3.size() > 0 && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cHw() != null) {
                hso.cxK().cxP().cyJ().cHw().d(hyc.lmQ, true);
            }
        }
    }

    public boolean cTh() {
        return this.lSA != null;
    }

    public static void cTi() {
        if (!igq.cUn()) {
            hso.cxK().cxP().j(cja.eDB.ordinal(), 0, 0, 0);
        }
    }
}

