/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cdb
 *  cug
 *  dta
 *  lcr
 */
import java.util.List;

public class bub
extends btk {
    private dtp dMR = null;
    private bun dMS = null;
    private cul ala = new cul();
    private static les ResourceTree = lea.enW();

    public void a(bun bun2) {
        this.dMS = bun2;
    }

    @Override
    public void initialize() {
        super.initialize();
        this.dMR = (dtp)((Object)this.MessageDelegator);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 16653: {
                this.a((erz)dxq2);
                break;
            }
            case 16654: {
                this.a((eri)dxq2);
                break;
            }
            case 16657: {
                this.b((erl)dxq2);
                break;
            }
            case 16656: {
                this.d((erk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(eri eri2) {
        kqi kqi2 = (kqi)this.MessageDelegator.h(3847);
        kqi2.aFo = eri2.ixR;
        kqi2.ec = this.GUID;
        kqi2.hsP = false;
        kqi2.iBr = false;
        this.MessageDelegator.a(kqi2);
    }

    private void b(erl erl2) {
        kqe kqe2 = (kqe)this.MessageDelegator.h(3848);
        kqe2.iyu = 6;
        kqe2.pVK = erl2.iyB;
        kqe2.iyD = erl2.iyD;
        kqe2.iyC = erl2.iyC;
        kqe2.ts(this.getGUID());
        kqe2.jM(false);
        kqe2.wD(false);
        this.MessageDelegator.a(kqe2);
    }

    private void d(erk erk2) {
        lfn.b(3, "SFCommandManagerPlayer", "handleCommandEngineSystemIProfControlMessage() forwarding to system chat proxy");
        erk2.on(lcr.qDb);
        this.MessageDelegator.F(erk2);
    }

    private void i(String[] stringArray) {
        Cloneable cloneable;
        if (stringArray == null || stringArray.length == 0) {
            return;
        }
        ldv ldv2 = this.axP();
        if (ldv2 == null) {
            return;
        }
        String string = stringArray[0];
        if (string == null) {
            return;
        }
        int n = 0;
        if (string.startsWith("*")) {
            string = string.replace("*", "");
            cloneable = lcn.emv();
            this.ala.a(string, (List<cte>)((Object)cloneable));
            if (cloneable.isEmpty()) {
                return;
            }
            if (cloneable.size() > 1) {
                return;
            }
            n = ((cte)cloneable.get((int)0)).ResourceType;
        } else {
            n = ResourceTree.getType(string);
            if (n <= 0) {
                return;
            }
        }
        if (ResourceTree.isDescendant(n, cug.fgE)) {
            cloneable = (fdn)this.MessageDelegator.h(9237, this.GUID, ldv2.bFk());
            ((fdn)cloneable).bst = bkd.dqU;
            ((fdn)cloneable).aZG = ldv2;
            ((fdn)cloneable).akX = ldv2;
            ((fdn)cloneable).ResourceType = n;
            ((fdn)cloneable).DisplayName = stringArray.length == 2 ? stringArray[1] : "Korpius";
            this.MessageDelegator.F((dxq)cloneable);
        }
    }

    private void a(erz erz2) {
        switch (erz2.iAU) {
            case 1: {
                this.i(erz2.iBe);
                break;
            }
            default: {
                return;
            }
        }
    }

    private ljq axN() {
        ldv ldv2 = this.dMR.bAn().gYY;
        amf amf2 = ((dta)this.MessageDelegator).bzt().d(ldv2);
        if (amf2 == null) {
            return null;
        }
        return ((cdb)amf2).aAG().av();
    }

    private ldv axO() {
        return this.dMS.axO();
    }

    private ldv axP() {
        return this.dMR.bAn().gYX;
    }
}

