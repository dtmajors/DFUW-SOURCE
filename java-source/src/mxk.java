/*
 * Decompiled with CFR.
 */
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class mxk
extends mki {
    public mxk(mkx mkx2) {
        super(mkx2);
        JMenuItem jMenuItem = null;
        jMenuItem = new JMenuItem("Create ObjectSpace");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Create Interaction ObjectSpace");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("View Contents");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Rename");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Save ObjectSpace");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(new JPopupMenu.Separator());
        jMenuItem = new JMenuItem("Remove");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(new JPopupMenu.Separator());
        jMenuItem = new JMenuItem("Remove All");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(new JPopupMenu.Separator());
        jMenuItem = new JMenuItem("Add Sensors");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Remove Sensors");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        this.add(new JPopupMenu.Separator());
        jMenuItem = new JMenuItem("Enable");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Disable");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Reposition ObjectSpace");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem.setToolTipText("Moves all Objects in this objectspace");
        this.add(new JPopupMenu.Separator());
        jMenuItem = new JMenuItem("Update Table");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Set Selected");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
        jMenuItem = new JMenuItem("Move Selected Objects to this OS");
        this.add(jMenuItem);
        jMenuItem.addActionListener((ActionListener)this.DFt);
    }
}

