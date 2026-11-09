/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class g
extends mki {
    public g(Object object) {
        super(object);
        assert (object instanceof ActionListener);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Remove item");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

