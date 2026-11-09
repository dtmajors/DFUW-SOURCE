/*
 * Decompiled with CFR.
 */
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;

public class mpb
extends DefaultCellEditor {
    public mpb(String[] stringArray) {
        super(new JComboBox<String>(stringArray));
    }
}

