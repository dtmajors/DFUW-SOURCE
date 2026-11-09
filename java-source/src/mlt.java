/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class mlt
extends mki {
    public mlt(mkx mkx2) {
        super(mkx2);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Add DistanceTimer");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Remove DistanceTimer");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(new JPopupMenu.Separator());
        jMenuItem = new JMenuItem("Refresh");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

