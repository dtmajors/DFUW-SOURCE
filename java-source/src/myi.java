/*
 * Decompiled with CFR.
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;

public class myi
extends myh {
    private btk EUg = null;
    private static int mTQ = 0;

    public myi(btk btk2) {
        this.EUf = new DataFlavor[]{myh.EUb};
        this.EUg = btk2;
    }

    @Override
    public synchronized Object getTransferData(DataFlavor dataFlavor) {
        if (dataFlavor == myh.EUb) {
            return this.EUg;
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }
}

