/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class mxh
implements PropertyChangeListener,
Runnable {
    private JTable table;
    private Action DOL;
    private int row;
    private int column;
    private Object ETA;
    private Object ETB;

    public mxh(JTable jTable, Action action) {
        this.table = jTable;
        this.DOL = action;
        this.table.addPropertyChangeListener(this);
    }

    private mxh(JTable jTable, int n2, int n3, Object object, Object object2) {
        this.table = jTable;
        this.row = n2;
        this.column = n3;
        this.ETA = object;
        this.ETB = object2;
    }

    public int getColumn() {
        return this.column;
    }

    public Object getNewValue() {
        return this.ETB;
    }

    public Object getOldValue() {
        return this.ETA;
    }

    public int getRow() {
        return this.row;
    }

    public JTable getTable() {
        return this.table;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if ("tableCellEditor".equals(propertyChangeEvent.getPropertyName())) {
            if (this.table.isEditing()) {
                this.eSL();
            } else {
                this.eSM();
            }
        }
    }

    private void eSL() {
        SwingUtilities.invokeLater(this);
    }

    @Override
    public void run() {
        this.row = this.table.convertRowIndexToModel(this.table.getEditingRow());
        this.column = this.table.convertColumnIndexToModel(this.table.getEditingColumn());
        this.ETA = this.table.getModel().getValueAt(this.row, this.column);
        this.ETB = null;
    }

    private void eSM() {
        this.ETB = this.table.getModel().getValueAt(this.row, this.column);
        if (!this.ETB.equals(this.ETA)) {
            mxh mxh2 = new mxh(this.getTable(), this.getRow(), this.getColumn(), this.getOldValue(), this.getNewValue());
            ActionEvent actionEvent = new ActionEvent(mxh2, 1001, "");
            this.DOL.actionPerformed(actionEvent);
        }
    }
}

