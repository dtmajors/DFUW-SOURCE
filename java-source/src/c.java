/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class c
extends mki {
    public c(Object object) {
        super(object);
        assert (object instanceof ActionListener);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Select All");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Select None");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

