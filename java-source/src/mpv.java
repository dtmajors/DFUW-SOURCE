/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  dqk
 */
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceListener;
import javax.swing.table.TableModel;

public class mpv
extends mkj
implements mxt {
    lfn ga = lfn.eqw();
    private DragSource DXj = null;
    private mya DXk = null;
    private mxp DXl = null;
    private aux DEC = null;

    public mpv() {
    }

    public mpv(TableModel tableModel) {
        super(tableModel);
        this.DXj = DragSource.getDefaultDragSource();
        this.DXk = new mya();
        this.DXl = new mxp();
        this.DXj.createDefaultDragGestureRecognizer(this, 3, this.DXl);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    @Override
    public DragSourceListener eIS() {
        return this.DXk;
    }

    @Override
    public dqn eIU() {
        int n = this.getSelectedRow();
        String string = (String)this.getValueAt(n, 0);
        lfn.b(0, this.getClass().getName(), "Getting selected object [" + string + "]");
        dqk dqk2 = new dqk();
        dqk2.setObjectDescriptionFilename(string);
        return dqk2;
    }
}

