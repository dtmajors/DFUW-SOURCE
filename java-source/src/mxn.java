/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class mxn
extends mki {
    public mxn(mkx mkx2) {
        super(mkx2);
        JMenuItem jMenuItem = new JMenuItem("Edit Node");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(new JPopupMenu.Separator());
        jMenuItem = new JMenuItem("Add Node");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Add Attribute");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Delete Node");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Repaint Tree");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

