/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class mmq
extends mki {
    public mmq(mkx mkx2) {
        super(mkx2);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Add Transition");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
        jMenuItem = new JMenuItem("Remove Transition");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
        this.add(new JPopupMenu.Separator());
        jMenuItem = new JMenuItem("Refresh Table");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
    }
}

