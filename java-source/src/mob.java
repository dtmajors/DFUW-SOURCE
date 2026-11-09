/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  moh
 */
import javax.swing.JTable;
import javax.swing.JViewport;

public class mob
extends JTable
implements mxy {
    private mod DRx = null;
    private moh DRy;

    public mob() {
    }

    public mob(mod mod2, moh moh2) {
        super(mod2);
        this.DRx = mod2;
        this.DRy = moh2;
        this.setTransferHandler(new myf("[!LogicObject!]"));
        this.setDragEnabled(true);
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        if (this.getParent() instanceof JViewport) {
            JViewport jViewport = (JViewport)this.getParent();
            return jViewport.getHeight() > this.getPreferredSize().height;
        }
        return false;
    }

    public mof eHi() {
        lfn.b(0, this.getClass().getName(), "Getting selected object!");
        return this.DRx.aeY(this.getSelectedRow());
    }

    @Override
    public void a(String string, double d2, double d3) {
        lfn.b(0, this.getClass().getName(), "dropString called with String: " + string);
        jrw jrw2 = new jrw(string);
        this.DRy.Q(jrw2);
    }
}

