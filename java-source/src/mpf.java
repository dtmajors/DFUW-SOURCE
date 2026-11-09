/*
 * Decompiled with CFR.
 */
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class mpf
extends DefaultTableModel {
    public mpf(Vector vector, Vector vector2) {
        super(vector, vector2);
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        return false;
    }
}

