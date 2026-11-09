/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 */
import java.awt.dnd.DropTarget;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class muz
extends JTable
implements mxw {
    private lfn ga = lfn.eqw();
    private DropTarget DOo = null;
    private myc DOp = null;
    private int DOq = 1;
    private mvb EJk = null;
    private ldv EJl = null;
    private aux DEC = null;

    public muz() {
    }

    public muz(mvb mvb2) {
        super(mvb2);
        this.EJk = mvb2;
        this.DOp = new myc();
        this.DOo = new DropTarget(this, this.DOq, this.DOp, true);
        this.setTransferHandler(new myf("[!LogicObject!]"));
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    @Override
    public void a(amf[] amfArray, double d2, double d3) {
        assert (this.EJl != null) : "CollectionGUID is null!";
        if (amfArray != null) {
            amf amf2 = null;
            for (int i = 0; i < amfArray.length; ++i) {
                amf2 = amfArray[i];
                if (amf2 == null) continue;
                if (amf2.getGUID().tV(this.EJl)) {
                    lfn.b(0, this.getClass().getName(), "dropObjectArray() : Adding Object [" + amf2 + "] to Collection [" + this.EJl + "]");
                    erb erb2 = (erb)this.DEC.d(9475);
                    erb2.on(this.EJl);
                    erb2.f(lcr.qzr);
                    erb2.pm(amf2.getGUID());
                    this.DEC.a((dxq)erb2);
                    continue;
                }
                JOptionPane.showMessageDialog(null, "Cannot add Objects from other ObjectSpaces", "Error Add to Collection", 0);
            }
        }
        try {
            Thread.sleep(100L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.updateUI();
    }

    public amf bYW() {
        lfn.b(0, this.getClass().getName(), "Getting selected object!");
        return this.EJk.afJ(this.getSelectedRow());
    }

    public void uq(ldv ldv2) {
        this.EJl = ldv2;
    }
}

