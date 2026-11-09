/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class myg
extends TransferHandler {
    lfn ga = lfn.eqw();

    public myg() {
    }

    public myg(String string) {
        super(string);
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        lfn.b(2, this.getClass().getName(), "trying to CreateTransferable");
        if (jComponent instanceof mpw) {
            dta dta2 = ((mpw)jComponent).eIV();
            myl myl2 = new myl(dta2);
            return myl2;
        }
        lfn.b(4, this.getClass().getName(), "Component dragged from was NOT  SFJTableWorldData");
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

