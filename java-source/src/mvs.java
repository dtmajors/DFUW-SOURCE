/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class mvs
extends mki {
    public mvs(mkx mkx2) {
        super(mkx2);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Add Texture");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Remove Texture");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

