/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class mwd
extends mki {
    public mwd(mkx mkx2) {
        super(mkx2);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Delete");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Update Table");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

