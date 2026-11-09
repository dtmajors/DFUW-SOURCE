/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class mlp
extends mki {
    public mlp(Component component) {
        super(component);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Add audio effect");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
        jMenuItem = new JMenuItem("Remove audio effect");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
        jMenuItem = new JMenuItem("Refresh audio effect list");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
        jMenuItem = new JMenuItem("Copy to All Playable Chars");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
    }
}

