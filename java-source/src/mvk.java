/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class mvk
extends mki {
    public mvk(mkx mkx2) {
        super(mkx2);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Change shader");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

