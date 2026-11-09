/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.ArrayList;
import java.util.Map;

public class bfi
extends btk {
    private Map<Integer, cj> dge = lcn.emw();
    private int Zm;

    public int[] anX() {
        return new int[]{0, 1, 85354};
    }

    public bfc[] a(double d2, double d3, int n) {
        Object v = null;
        String string = "SELECT * from game_forecast";
        lfn.b(0, this.getClass().getSimpleName(), "createCharacter() : SQLQueryString is: " + string);
        kdj kdj2 = (kdj)this.MessageDelegator.i(259, this.GUID, lcr.qyX);
        kdj2.wA("Environment");
        kdj2.setContext(this.Zm);
        kdj2.wB(string);
        this.MessageDelegator.b(kdj2);
        this.dge.put(new Integer(this.Zm), (cj)v);
        ++this.Zm;
        return this.anY();
    }

    @Override
    public void receiveMiddlewareMessage(kcz kcz2) {
        switch (kcz2.getMessageType()) {
            case 260: {
                this.a((kdk)kcz2);
                break;
            }
            case 270: {
                lfn.b(5, this.getClass().getSimpleName(), "receiveMiddlewareMessage() : DeliveryError!");
                break;
            }
            default: {
                super.receiveMiddlewareMessage(kcz2);
            }
        }
    }

    private void a(kdk kdk2) {
        lmn lmn2 = kdk2.dVr();
        lfn.b(0, this.getClass().getSimpleName(), "handleSQLResultMessage() : Context = " + kdk2.getContext() + ", ErrorCode= " + lmn2.getErrorCode() + ", Rows affected = " + lmn2.euU());
        if (lmn2.getErrorCode() != 0) {
            String string = "Error: " + lmn2.getErrorCode();
            lfn.b(5, this.getClass().getSimpleName(), "handleSQLResultMessage() : --> " + string);
            return;
        }
        lmg[] lmgArray = lmn2.euS();
        lmo[] lmoArray = lmn2.euT();
        if (lmgArray == null || lmoArray == null) {
            String string = "Error: Columns = " + lmgArray + " Rows = " + lmoArray;
            lfn.b(5, this.getClass().getSimpleName(), "handleSQLResultMessage() : " + string);
            assert (false) : string;
            return;
        }
        for (int i = 0; i < lmgArray.length; ++i) {
            lmg lmg2 = lmgArray[i];
            for (int j = 0; j < lmoArray.length; ++j) {
                lmo lmo2 = lmoArray[j];
            }
        }
    }

    private bfc[] anY() {
        ArrayList arrayList = lcn.emv();
        return arrayList.toArray(new bfc[arrayList.size()]);
    }
}

