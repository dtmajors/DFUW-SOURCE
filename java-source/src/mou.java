/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class mou
extends mki {
    public mou(mkx mkx2) {
        super(mkx2);
        System.out.println("*** Popup Listener :" + mkx2);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Copy Attachpoint");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

