/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class mmj
extends mki {
    public mmj(Component component) {
        super(component);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Add State");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
        jMenuItem = new JMenuItem("Remove State");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
        jMenuItem = new JMenuItem("Refresh State list");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
    }
}

