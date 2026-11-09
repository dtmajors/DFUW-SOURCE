/*
 * Decompiled with CFR.
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;

public class myj
extends myh {
    private amf EUh = null;
    private static int mTQ = 0;

    public myj(amf amf2) {
        this.EUf = new DataFlavor[]{myh.EUc};
        this.EUh = amf2;
    }

    @Override
    public synchronized Object getTransferData(DataFlavor dataFlavor) {
        if (dataFlavor == myh.EUb) {
            return this.EUh;
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }
}

