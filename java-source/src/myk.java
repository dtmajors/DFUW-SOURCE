/*
 * Decompiled with CFR.
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;

public class myk
extends myh {
    private amf[] EUi = null;
    private static int mTQ = 0;

    public myk(amf[] amfArray) {
        this.EUf = new DataFlavor[]{myh.EUd};
        this.EUi = amfArray;
    }

    @Override
    public synchronized Object getTransferData(DataFlavor dataFlavor) {
        if (dataFlavor == myh.EUd) {
            return this.EUi;
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }
}

