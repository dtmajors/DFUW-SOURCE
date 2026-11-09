/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 */
import java.awt.dnd.DropTarget;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class mwf
extends JTable
implements mxv,
mxw {
    private myc DOp = null;
    private int DOq = 1;
    private mwi EOV = null;
    private ldv Rr = null;
    private aux DEC = null;

    public mwf() {
    }

    public mwf(mwi mwi2) {
        super(mwi2);
        this.EOV = mwi2;
        this.DOp = new myc();
        new DropTarget(this, this.DOq, this.DOp, true);
        this.setTransferHandler(new myf("[!LogicObject!]"));
        this.setDragEnabled(true);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    @Override
    public void a(btk btk2, double d2, double d3) {
        lfn.b(0, this.getClass().getName(), "dropObjet called, with Object: " + btk2);
        hai hai2 = (hai)this.DEC.d(4111);
        hai2.on(lcr.qzr);
        hai2.f(lcr.qzr);
        hai2.qN(this.Rr);
        hai2.hC(btk2.getGUID());
        this.DEC.a((dxq)hai2);
    }

    @Override
    public void a(amf[] amfArray, double d2, double d3) {
        if (amfArray != null) {
            boolean bl = false;
            amf amf2 = null;
            for (int i = 0; i < amfArray.length; ++i) {
                amf2 = amfArray[i];
                if (amf2 == null) continue;
                if (!amf2.getGUID().tV(this.Rr)) {
                    hai hai2 = (hai)this.DEC.d(4111);
                    hai2.on(lcr.qzr);
                    hai2.f(lcr.qzr);
                    hai2.qN(this.Rr);
                    hai2.hC(amf2.getGUID());
                    this.DEC.a((dxq)hai2);
                    continue;
                }
                bl = true;
            }
            if (bl) {
                lfn.b(0, this.getClass().getName(), "dropObjectArray() : Cannot copy Objects to same OS!");
                JOptionPane.showMessageDialog(null, "Cannot move Objects within the same os!", "Move Error", 0);
            }
        }
    }

    public amf[] eQS() {
        int[] nArray = this.getSelectedRows();
        if (nArray != null) {
            ArrayList<amf> arrayList = lcn.emv();
            for (int i = 0; i < nArray.length; ++i) {
                amf amf2 = this.EOV.afJ(i);
                int n = nArray[i];
                arrayList.add(this.EOV.afJ(n));
            }
            lfn.b(0, this.getClass().getName(), "Getting selected object(s). NrOf Objects [" + arrayList.size() + "]");
            amf[] amfArray = new amf[arrayList.size()];
            return arrayList.toArray(amfArray);
        }
        return null;
    }

    public void oD(ldv ldv2) {
        this.Rr = ldv2;
    }
}

