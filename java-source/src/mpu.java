/*
 * Decompiled with CFR.
 */
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceListener;
import javax.swing.table.TableModel;

public class mpu
extends mkj
implements mxr {
    private DragSource DXj = null;
    private mya DXk = null;
    private mxp DXl = null;

    public mpu() {
    }

    public mpu(TableModel tableModel) {
        super(tableModel);
        this.DXj = DragSource.getDefaultDragSource();
        this.DXk = new mya();
        this.DXl = new mxp();
        this.DXj.createDefaultDragGestureRecognizer(this, 3, this.DXl);
    }

    @Override
    public DragSourceListener eIS() {
        return this.DXk;
    }

    @Override
    public btk eIT() {
        System.out.println("SFJTable: Getting selected object!");
        int n = this.getSelectedRow();
        String string = (String)this.getValueAt(n, 0);
        System.out.println("SFJTable: Getting selected object [" + string + "] !");
        return null;
    }
}

