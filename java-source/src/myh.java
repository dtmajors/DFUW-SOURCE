/*
 * Decompiled with CFR.
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.Serializable;
import java.util.Arrays;

public abstract class myh
implements Transferable,
Serializable {
    public static final DataFlavor EUa = new DataFlavor("application/x-java-jvm-local-objectref", "SFWorldObject");
    public static final DataFlavor EUb = new DataFlavor("application/x-java-jvm-local-objectref", "SFLogicObject");
    public static final DataFlavor EUc = new DataFlavor("application/x-java-jvm-local-objectref", "SFObject");
    public static final DataFlavor EUd = new DataFlavor("application/x-java-jvm-local-objectref", "SFObject[]");
    public static final DataFlavor EUe = new DataFlavor("application/x-java-jvm-local-objectref", "SFObjectSpace");
    protected DataFlavor[] EUf = null;

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return this.EUf;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor dataFlavor) {
        return Arrays.asList(this.EUf).contains(dataFlavor);
    }
}

