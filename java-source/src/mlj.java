/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class mlj
extends mki {
    public mlj(mkx mkx2) {
        super(mkx2);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Refresh");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
        jMenuItem = new JMenuItem("Remove");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
    }
}

