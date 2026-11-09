/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JMenuItem;

public class mke
extends mki {
    public mke(JComponent jComponent) {
        super(jComponent);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Edit");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("load");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Rename");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

