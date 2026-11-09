/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.Map;

public class lq
extends btk {
    private static final String TC = "SFBoatManagerGlobalServer";
    private static final float auI = 215.0f;
    private static final float auJ = 400.0f;
    private static final float auK = 2400.0f;
    private static final float auL = 73.0f;
    public static final double auM = 3.0;
    public static final boolean auN = true;
    final Map<ldv, a> auO = lcn.emw();

    @Override
    public void receiveMessage(dxq dxq2) {
        int n = dxq2.bEz();
        switch (n) {
            case 3082: {
                this.a((eco)dxq2);
                break;
            }
            case 3083: {
                this.a((ecq)dxq2);
                break;
            }
            case 12854: {
                this.a((efi)dxq2);
            }
        }
    }

    private void a(eco eco2) {
        boolean bl = eco2.bFm();
        ldv ldv2 = eco2.bFv();
        if (!bl) {
            a a2 = this.auO.remove(ldv2);
            if (a2 == null) {
                lfn.b(5, TC, "handleBoatRegistrationMessage() : Boat : " + ldv2 + " is not registered.");
                assert (false);
                return;
            }
            return;
        }
        a a3 = new a(this, ldv2, eco2.az(), "", eco2.av());
        this.auO.put(ldv2, a3);
    }

    private void a(ecq ecq2) {
        ldv[] ldvArray = ecq2.bFw();
        ljq[] ljqArray = ecq2.bFx();
        String[] stringArray = ecq2.bFy();
        if (ldvArray == null || ljqArray == null || stringArray == null || ldvArray.length != ljqArray.length || ljqArray.length != stringArray.length) {
            assert (false);
            return;
        }
        for (int i = 0; i < ldvArray.length; ++i) {
            ldv ldv2 = ldvArray[i];
            a a2 = this.auO.get(ldv2);
            if (a2 == null) {
                lfn.b(5, TC, "handleBoatUpdateMessage() : Boat : " + ldv2 + " is not registered.");
                assert (false);
                return;
            }
            a2.Position = ljqArray[i];
            a2.auQ = stringArray[i];
        }
    }

    private void a(efi efi2) {
        efj efj2 = (efj)this.MessageDelegator.h(12855, this.getGUID(), efi2.aO());
        if (this.auO.isEmpty()) {
            this.MessageDelegator.E(efj2);
            return;
        }
        ArrayList<a> arrayList = null;
        ljq ljq2 = efi2.av();
        float f = (ljq2.y - 215.0f) * 2000.0f / 73.0f + 400.0f;
        f = lew.A(f, 400.0f, 2400.0f);
        for (a ljqArray2 : this.auO.values()) {
            if (ljqArray2.Position == null || ljqArray2.Position.ez(efi2.av()) > f) continue;
            if (arrayList == null) {
                arrayList = lcn.emv();
            }
            arrayList.add(ljqArray2);
        }
        if (arrayList == null) {
            this.MessageDelegator.E(efj2);
            return;
        }
        Object object = new int[arrayList.size()];
        ljq[] ljqArray = new ljq[arrayList.size()];
        String[] stringArray = new String[arrayList.size()];
        int n = 0;
        for (a a2 : arrayList) {
            object[n] = a2.ResourceType;
            ljqArray[n] = a2.Position;
            stringArray[n] = a2.auQ;
            ++n;
        }
        efj2.n(stringArray);
        efj2.f(ljqArray);
        efj2.S((int[])object);
        this.MessageDelegator.E(efj2);
    }
}

