/*
 * Decompiled with CFR.
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class myf
extends TransferHandler {
    lfn ga = lfn.eqw();

    public myf() {
    }

    public myf(String string) {
        super(string);
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        myk myk2 = null;
        lfn.b(2, this.getClass().getName(), "trying to CreateTransferable(LogicObject)");
        if (jComponent instanceof mwf) {
            amf[] amfArray = ((mwf)jComponent).eQS();
            myk2 = new myk(amfArray);
            return myk2;
        }
        lfn.b(4, this.getClass().getName(), "Component dragged from was NOT  SFJTableObjectSpace");
        return null;
    }

    @Override
    public int getSourceActions(JComponent jComponent) {
        return 1;
    }

    @Override
    public boolean canImport(JComponent jComponent, DataFlavor[] dataFlavorArray) {
        return false;
    }
}

