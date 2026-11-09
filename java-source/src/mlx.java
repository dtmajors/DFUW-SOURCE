/*
 * Decompiled with CFR.
 */
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class mlx
extends mki {
    public mlx(Component component) {
        super(component);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Add effect");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
        jMenuItem = new JMenuItem("Remove effect");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
        jMenuItem = new JMenuItem("Refresh effect list");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
        jMenuItem = new JMenuItem("Copy Effect to All Playable Chars");
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(jMenuItem);
    }
}

