/*
 * Decompiled with CFR.
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;

public class mym
extends myh {
    private dqn EUk = null;
    private static int mTQ = 0;

    public mym(dqn dqn2) {
        this.EUf = new DataFlavor[]{myh.EUa};
        this.EUk = dqn2;
    }

    @Override
    public synchronized Object getTransferData(DataFlavor dataFlavor) {
        if (dataFlavor == myh.EUa) {
            return this.EUk;
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }
}

