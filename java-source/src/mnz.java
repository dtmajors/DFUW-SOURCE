/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

public class mnz
extends mkx {
    private aux DEC = null;
    private Dimension bV = new Dimension(300, 600);
    private jrw DRq = new jrw(lcw.qLb + "worldbuilder/vegetation/" + "region_material.xml");
    private JButton DRr = new JButton("Set Mesh Edit Mode");
    private JButton DRs = new JButton("Save Mesh");
    private mkg DRt;
    private List DRu;
    private a DRv;

    public mnz() {
        super(false);
        this.setClosable(true);
        this.setPreferredSize(this.bV);
        this.DRv = new a(this);
        this.r();
        this.setTitle("Mesh Material Editor");
        this.pack();
    }

    private void r() {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        JPanel jPanel2 = new JPanel(new FlowLayout(2));
        JPanel jPanel3 = new JPanel(new BorderLayout());
        this.b(jPanel3);
        this.DRr.addActionListener(new ActionListener(this){
            final /* synthetic */ mnz DRw;
            {
                this.DRw = mnz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mje.DAR = mje.a.DCp;
            }
        });
        this.DRr.setToolTipText("<HTML><B>Remember to Select the correct object before setting this mode!</B></HTML>");
        jPanel2.add(this.DRr);
        this.DRs.addActionListener(new ActionListener(this){
            final /* synthetic */ mnz DRw;
            {
                this.DRw = mnz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mnz.a(this.DRw);
            }
        });
        this.DRs.setToolTipText("<HTML>Saves the edited Mesh</HTML>");
        jPanel2.add(this.DRs);
        this.DGa.add((Component)jPanel, "North");
        this.DGa.add((Component)jPanel3, "Center");
        this.DGa.add((Component)jPanel2, "South");
    }

    private void b(JPanel jPanel) {
        this.DRu = this.eHg();
        Object[] objectArray = new String[this.DRu.size()];
        for (int i = 0; i < this.DRu.size(); ++i) {
            moa moa2 = (moa)this.DRu.get(i);
            objectArray[i] = moa2.eyJ();
            ++i;
        }
        this.DRt = new mkg(objectArray, "Textures", true);
        this.DRt.a(this.DRv);
        jPanel.add((Component)this.DRt, "West");
    }

    private List eHg() {
        mzi mzi2 = new mzi();
        return mzi2.as(this.DRq);
    }

    private void eHh() {
        if (this.DEC != null) {
            hac hac2 = (hac)this.DEC.d(4097);
            hac2.Lb(40);
            hac2.hC(mje.gUd);
            this.DEC.a((dxq)hac2);
        } else {
            lfn.b(5, this.getClass().getName(), "sendMeshSaveMessage() : WBDesktop is null!!");
        }
    }

    public aux eDR() {
        return this.DEC;
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mnz mnz2) {
        mnz2.eHh();
    }

    static /* synthetic */ mkg b(mnz mnz2) {
        return mnz2.DRt;
    }

    static /* synthetic */ List c(mnz mnz2) {
        return mnz2.DRu;
    }
}

