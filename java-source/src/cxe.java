/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  lcr
 */
public class cxe
extends btk {
    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 4633: {
                this.a((gka)dxq2);
                break;
            }
            case 4635: {
                this.a((gkc)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gka gka2) {
        int n2;
        float[] fArray = new float[gka2.bVw().length];
        for (n2 = 0; n2 < fArray.length; ++n2) {
            fArray[n2] = cxd.a((cxn)gka2.bVw()[n2]);
        }
        if (gka2.bVy()) {
            for (n2 = 0; n2 < gka2.bVw().length; ++n2) {
                lfn.b(2, this.getClass().getSimpleName(), "SFSkillXPGainModifierPrintRequestMessage() : Skill Modifier '" + (Object)((Object)gka2.bVw()[n2]) + "' is " + Float.toString(fArray[n2]));
            }
        }
        if (gka2.bVx()) {
            gkb gkb2 = (gkb)this.MessageDelegator.h(4634, this.GUID, gka2.aO());
            this.MessageDelegator.b(gka2, gkb2);
            gkb2.a(gka2.bVw(), fArray);
            this.MessageDelegator.F(gkb2);
        }
    }

    private void a(gkc gkc2) {
        if (!gkc2.aO().equals(lcr.hac)) {
            if (gkc2.bVB()) {
                float[] fArray = new float[gkc2.bVw().length];
                for (int i2 = 0; i2 < fArray.length; ++i2) {
                    fArray[i2] = cxd.a((cxn)gkc2.bVw()[i2]);
                }
                int[] nArray = new int[fArray.length];
                int[] nArray2 = new int[fArray.length];
                for (int i3 = 0; i3 < fArray.length; ++i3) {
                    nArray[i3] = 1;
                    nArray2[i3] = 0;
                }
                gkd gkd2 = (gkd)this.MessageDelegator.h(4636, this.GUID, gkc2.aO());
                this.MessageDelegator.b(gkc2, gkd2);
                gkd2.a(gkc2.bVw(), fArray, fArray, nArray2, nArray);
                gkd2.kY("Skill XP-Gain Set Requests MUST Originate from the Game-Logic Distributor!!!");
                this.MessageDelegator.F(gkd2);
            }
            return;
        }
        float[] fArray = new float[gkc2.bVw().length];
        for (int i4 = 0; i4 < fArray.length; ++i4) {
            fArray[i4] = cxd.a((cxn)gkc2.bVw()[i4]);
        }
        int[] nArray = new int[gkc2.bVw().length];
        int[] nArray3 = new int[gkc2.bVw().length];
        String string = null;
        for (int i5 = 0; i5 < gkc2.bVw().length; ++i5) {
            if (cxd.a((cxn)gkc2.bVw()[i5], (float)gkc2.bVA()[i5])) {
                nArray[i5] = 1;
                nArray3[i5] = 0;
                continue;
            }
            nArray[i5] = 0;
            nArray3[i5] = 1;
            string = string + "! SFSkillConstants Failed Request to Set XP-Gain Modifier '" + (Object)((Object)gkc2.bVw()[i5]) + "' to " + gkc2.bVA()[i5] + " !";
        }
        if (gkc2.bVB()) {
            float[] fArray2 = new float[gkc2.bVw().length];
            for (int i6 = 0; i6 < fArray2.length; ++i6) {
                fArray2[i6] = cxd.a((cxn)gkc2.bVw()[i6]);
            }
            gkd gkd3 = (gkd)this.MessageDelegator.h(4636, this.GUID, gkc2.aO());
            this.MessageDelegator.b(gkc2, gkd3);
            gkd3.a(gkc2.bVw(), fArray, fArray2, nArray, nArray3);
            gkd3.kY(string);
            this.MessageDelegator.F(gkd3);
        }
    }
}

