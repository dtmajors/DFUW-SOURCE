/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class mng
extends mki {
    public mng(mkx mkx2) {
        super(mkx2);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Object Properties");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Go to Object");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Turn ON Shadowcasting");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Turn OFF Shadowcasting");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Set Selected");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(new JPopupMenu.Separator());
        jMenuItem = new JMenuItem("Delete");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(new JPopupMenu.Separator());
        jMenuItem = new JMenuItem("Update Table");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

