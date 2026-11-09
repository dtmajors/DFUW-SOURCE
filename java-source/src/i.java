/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class i
extends mki {
    public i(Object object) {
        super(object);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Create SFFile for Resource");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Create SFFile for Resource from copy");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Open Resource");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

