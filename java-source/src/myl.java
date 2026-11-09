/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;

public class myl
extends myh {
    private dta EUj = null;
    private static int mTQ = 0;

    public myl(dta dta2) {
        this.EUf = new DataFlavor[]{myh.EUe};
        this.EUj = dta2;
    }

    @Override
    public synchronized Object getTransferData(DataFlavor dataFlavor) {
        if (dataFlavor == myh.EUe) {
            return this.EUj;
        }
        throw new UnsupportedFlavorException(dataFlavor);
    }
}

