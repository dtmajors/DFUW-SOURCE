/*
 * Decompiled with CFR.
 */
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.JTableHeader;

public class mok
extends MouseAdapter {
    JTableHeader header;
    mol DSH;

    public mok(JTableHeader jTableHeader, mol mol2) {
        this.header = jTableHeader;
        this.DSH = mol2;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        int n = this.header.columnAtPoint(mouseEvent.getPoint());
        int n2 = this.header.getTable().convertColumnIndexToModel(n);
        this.DSH.afb(n);
        this.DSH.afc(n);
        this.header.repaint();
        if (this.header.getTable().isEditing()) {
            this.header.getTable().getCellEditor().stopCellEditing();
        }
        boolean bl = 1 == this.DSH.getState(n);
        ((mom)this.header.getTable().getModel()).aq(n2, bl);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        int n = this.header.columnAtPoint(mouseEvent.getPoint());
        this.DSH.afb(-1);
        this.header.repaint();
    }
}

