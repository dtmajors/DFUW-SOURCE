/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  lcr
 *  lkv
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mmh
extends mkx
implements ActionListener {
    private aux DEC;
    private lkr DMu = null;
    private mjr DMC;
    private a DMD = null;
    private bvf DJS;
    private mjr DME;
    private mla DMF;
    private mkl DMG;
    private mkl DMH;
    private mkn DMI;
    private mla DMJ;
    private mjr DMK;
    private mkg DML;
    private mkg DMM;
    private JButton DMN = new JButton("Add Specialeffect");
    private JButton DMO = new JButton("Refresh List");
    private JButton DLu = new JButton("Play");
    private Dimension DDN = new Dimension(650, 450);
    private mmj DMw;
    private mlx DMx;
    private mkl DMP;
    private mla DMQ;

    public mmh(aux aux2, lkr lkr2, bvf bvf2) {
        this.DEC = aux2;
        this.DMu = lkr2;
        this.DJS = bvf2;
        this.DMD = new a(this);
        this.DMw = new mmj(this);
        this.DMx = new mlx(this);
        this.setTitle("Animation State Properties");
        this.setPreferredSize(this.DDN);
        this.setMinimumSize(this.DDN);
        this.setClosable(true);
        this.eFk();
        this.pack();
    }

    private void eFk() {
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel();
        BoxLayout boxLayout = new BoxLayout(jPanel2, 1);
        jPanel2.setLayout(boxLayout);
        JPanel jPanel3 = new JPanel(new FlowLayout(0));
        Object[] objectArray = lkv.euf();
        Arrays.sort(objectArray, String.CASE_INSENSITIVE_ORDER);
        JPanel jPanel4 = new JPanel(new FlowLayout(0));
        this.DMC = new mjr("State ID:", objectArray, lkv.adr((int)this.DMu.etO()));
        jPanel4.add(this.DMC);
        this.DJS.azw().AB(this.DMu.getSetName());
        Object[] objectArray2 = this.DJS.azw().etL();
        Arrays.sort(objectArray2, String.CASE_INSENSITIVE_ORDER);
        this.DME = new mjr("Set ID", objectArray2, this.DMu.getSetName());
        jPanel4.add(this.DME);
        jPanel2.add(jPanel4);
        JPanel jPanel5 = new JPanel(new FlowLayout(0));
        this.DMJ = new mla("Speed", 0.0f, 5.0f, this.DMu.bEX(), 2);
        this.DMJ.a(new ChangeListener(this){
            final /* synthetic */ mmh DMR;
            {
                this.DMR = mmh2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmh.b(this.DMR).iF(mmh.a(this.DMR).getValue());
            }
        });
        jPanel5.add(this.DMJ);
        this.DMI = new mkn("Length (seconds)", Float.toString(this.DMu.etP()));
        jPanel5.add(this.DMI);
        jPanel2.add(jPanel5);
        jPanel5 = new JPanel(new FlowLayout(0));
        this.DMH = new mkl("Loop", this.DMu.isLooping());
        jPanel5.add(this.DMH);
        this.DMH.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mmh DMR;
            {
                this.DMR = mmh2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmh.b(this.DMR).setLooping(mmh.c(this.DMR).eDr());
            }
        });
        this.DMK = new mjr("Playback Type", (Object[])kia.pzu, this.DMu.etV());
        jPanel5.add(this.DMK);
        mkl mkl2 = new mkl("Remove Partial", this.DMu.etR());
        this.DMG = new mkl("Partial Animation", this.DMu.isPartial());
        jPanel5.add(this.DMG);
        this.DMG.addChangeListener(new ChangeListener(this, mkl2){
            final /* synthetic */ mkl DMS;
            final /* synthetic */ mmh DMR;
            {
                this.DMR = mmh2;
                this.DMS = mkl2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmh.b(this.DMR).yC(mmh.d(this.DMR).eDr());
                if (mmh.d(this.DMR).eDr()) {
                    this.DMS.zi(false);
                }
            }
        });
        jPanel5.add(mkl2);
        mkl2.addChangeListener(new ChangeListener(this, mkl2){
            final /* synthetic */ mkl DMS;
            final /* synthetic */ mmh DMR;
            {
                this.DMR = mmh2;
                this.DMS = mkl2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmh.b(this.DMR).yD(this.DMS.eDr());
                if (this.DMS.eDr()) {
                    mmh.d(this.DMR).zi(false);
                }
            }
        });
        jPanel2.add(jPanel5);
        JPanel jPanel6 = new JPanel(new FlowLayout(0));
        this.DMP = new mkl("Stop At Position", this.DMu.etY());
        jPanel6.add(this.DMP);
        this.DMP.addChangeListener(new ChangeListener(this, mkl2){
            final /* synthetic */ mkl DMS;
            final /* synthetic */ mmh DMR;
            {
                this.DMR = mmh2;
                this.DMS = mkl2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmh.b(this.DMR).yE(mmh.e(this.DMR).eDr());
                mmh.f(this.DMR).setEnabled(mmh.e(this.DMR).eDr());
                if (mmh.e(this.DMR).eDr()) {
                    this.DMS.zi(true);
                }
            }
        });
        this.DMQ = new mla("Normalized Stop Position", 0.0f, 1.0f, this.DMu.etX(), 2);
        this.DMQ.a(new ChangeListener(this){
            final /* synthetic */ mmh DMR;
            {
                this.DMR = mmh2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmh.b(this.DMR).nF(mmh.f(this.DMR).getValue());
            }
        });
        jPanel6.add(this.DMQ);
        jPanel2.add(jPanel6);
        JPanel jPanel7 = new JPanel();
        jPanel7.setLayout(new BoxLayout(jPanel7, 0));
        this.DML = new mkg(new Object[0], "Chained States", true);
        this.DML.setVisibleRowCount(5);
        this.DML.a(this.DMD);
        jPanel7.add(this.DML);
        this.eFm();
        JPanel jPanel8 = new JPanel();
        JPanel jPanel9 = new JPanel(new FlowLayout(0));
        BoxLayout boxLayout2 = new BoxLayout(jPanel8, 1);
        jPanel8.setLayout(boxLayout2);
        this.DMM = new mkg(new Object[0], "Special Effects", true);
        this.DMM.setVisibleRowCount(5);
        this.DMM.a(this.DMD);
        jPanel8.add(this.DMM);
        this.DMN.addActionListener(new ActionListener(this){
            final /* synthetic */ mmh DMR;
            {
                this.DMR = mmh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DMR.at(actionEvent);
            }
        });
        jPanel9.add(this.DMN);
        this.DMO.addActionListener(new ActionListener(this){
            final /* synthetic */ mmh DMR;
            {
                this.DMR = mmh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmh.g(this.DMR);
            }
        });
        jPanel9.add(this.DMO);
        jPanel8.add(jPanel9);
        jPanel7.add(jPanel8);
        jPanel2.add(jPanel7);
        this.eFn();
        this.DLu.addActionListener(new ActionListener(this){
            final /* synthetic */ mmh DMR;
            {
                this.DMR = mmh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mmh.a(this.DMR, actionEvent);
            }
        });
        jPanel3.add(this.DLu);
        jPanel.add((Component)jPanel2, "Center");
        jPanel.add((Component)jPanel3, "South");
        this.DGa.add(jPanel);
    }

    protected void at(ActionEvent actionEvent) {
        lkp lkp2 = new lkp();
        lkp2.ade(13);
        lkp2.setStartTime(0.0f);
        this.DMu.c(lkp2);
        mlw mlw2 = new mlw(this.DEC, this.DJS, this.DMu);
        mlw2.d(lkp2);
        this.DEC.eCu().add(mlw2);
        mlw2.setVisible(true);
        this.eFn();
    }

    private void eFm() {
        if (this.DMu.etW() != null) {
            Object[] objectArray = new String[this.DMu.etW().length];
            int[] nArray = this.DMu.etW();
            for (int i = 0; i < nArray.length; ++i) {
                objectArray[i] = lkv.adr((int)nArray[i]);
            }
            this.DML.setListData(objectArray);
            this.DML.repaint();
        }
    }

    private void eFn() {
        if (this.DMu.etZ() != null) {
            List<lkp> list = this.DMu.etZ();
            Object[] objectArray = new lkp[list.size()];
            int n = 0;
            for (lkp lkp2 : list) {
                objectArray[n] = lkp2;
                ++n;
            }
            this.DMM.setListData(objectArray);
            this.DMM.repaint();
        }
    }

    private void aeQ(int n) {
        int[] nArray = this.DMu.etW();
        int[] nArray2 = null;
        if (this.DMu.etW() != null) {
            nArray2 = new int[nArray.length + 1];
            System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
            nArray2[nArray.length] = n;
        } else {
            nArray2 = new int[]{n};
        }
        nArray = nArray2;
        Integer[] integerArray = new Integer[nArray.length];
        this.DMu.aX(nArray);
    }

    private void aeR(int n) {
        int[] nArray = this.DMu.etW();
        int[] nArray2 = null;
        if (nArray != null) {
            int n2;
            ArrayList<Integer> arrayList = lcn.emv();
            for (n2 = 0; n2 < nArray.length; ++n2) {
                arrayList.add(new Integer(nArray[n2]));
            }
            arrayList.remove(n);
            nArray2 = new int[arrayList.size()];
            n2 = 0;
            for (Integer n3 : arrayList) {
                nArray2[n2] = n3;
                ++n2;
            }
        } else {
            return;
        }
        nArray = nArray2;
        this.DMu.aX(nArray);
    }

    @Override
    protected void eDD() {
        String string;
        Object object = this.DMC.getSelectedItem();
        if (object != null) {
            int n = lkv.AG((String)((String)object));
            n = lkv.adq((int)n);
            this.DMu.adf(n);
        }
        if ((string = (String)this.DME.getSelectedItem()) != null) {
            this.DMu.setSetName(string);
        } else {
            lfn.b(0, this.getClass().getSimpleName(), "ApplyChanges() : SelIndex = -1!");
        }
        int n = this.DMK.getSelectedIndex();
        if (n != -1) {
            this.DMu.adh(n);
        }
        if (this.DMu.getSetName() == null) {
            this.DMu.setSetName(this.DJS.azw().etL()[0]);
        }
        this.eFv();
    }

    public void eFv() {
        double d2 = 0.0;
        String string = null;
        lkn lkn2 = this.DJS.azw();
        lkl lkl2 = null;
        string = this.DMu.getSetName();
        lkl2 = lkn2.AC(string);
        if (lkl2 != null && d2 < lkl2.Bw()) {
            d2 = lkl2.Bw();
        }
        this.DMu.nE((float)d2);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Add State")) {
            lfn.b(0, this.getClass().getSimpleName(), "mousePressed() : Ja!");
            Object[] objectArray = lkv.euf();
            Arrays.sort(objectArray, String.CASE_INSENSITIVE_ORDER);
            mjr mjr2 = new mjr("Choose", objectArray, 0);
            int n = JOptionPane.showConfirmDialog(this.DEC.eCu(), mjr2, "Add Chained State", 2);
            if (n == 0 && mjr2.getSelectedItem() != null) {
                lfn.b(0, this.getClass().getSimpleName(), "mousePressed() : Selected Item = " + mjr2.getSelectedItem());
                this.aeQ(lkv.AG((String)((String)mjr2.getSelectedItem())));
                this.eFm();
            } else {
                lfn.b(5, this.getClass().getSimpleName(), "mousePressed() : Selected Item = " + mjr2.getSelectedItem());
            }
        } else if (actionEvent.getActionCommand().equals("Remove State")) {
            lfn.b(0, this.getClass().getSimpleName(), "actionPerformed() : REMOVE");
            int n = this.DML.eDp();
            if (n != -1) {
                this.aeR(n);
                this.eFm();
            }
        } else if (actionEvent.getActionCommand().equals("Remove effect")) {
            lfn.b(0, this.getClass().getSimpleName(), "actionPerformed() : Remove Effect");
            int n = this.DMM.eDp();
            if (n != -1) {
                List<lkp> list = this.DMu.etZ();
                list.remove(n);
                this.eFn();
            } else {
                lfn.b(0, this.getClass().getSimpleName(), "actionPerformed() : Nothing selected!");
            }
        }
    }

    private void au(ActionEvent actionEvent) {
        Object object;
        if (this.DMu.getSetName() == null) {
            String string = lkv.adr((int)this.DMu.etO());
            JOptionPane.showInternalMessageDialog(this.DEC.eCu(), "State [" + string + "] has invalid setname [null]!");
            return;
        }
        List<lkl> list = this.DJS.azw().etK();
        boolean bl = false;
        for (lkl lkl2 : list) {
            if (!lkl2.dZF().equalsIgnoreCase(this.DMu.getSetName())) continue;
            bl = true;
            break;
        }
        if (!bl) {
            object = lkv.adr((int)this.DMu.etO());
            JOptionPane.showInternalMessageDialog(this.DEC.eCu(), "State [" + (String)object + "] refers to non-existing set [" + this.DMu.getSetName() + "] !");
            return;
        }
        object = (dzv)this.DEC.d(7425);
        ((dxq)object).on(this.DJS.getGUID());
        ((dxq)object).f(lcr.qzr);
        ((dzv)object).dTs = this.DMu.etO();
        this.DEC.a((dxq)object);
    }

    static /* synthetic */ mla a(mmh mmh2) {
        return mmh2.DMJ;
    }

    static /* synthetic */ lkr b(mmh mmh2) {
        return mmh2.DMu;
    }

    static /* synthetic */ mkl c(mmh mmh2) {
        return mmh2.DMH;
    }

    static /* synthetic */ mkl d(mmh mmh2) {
        return mmh2.DMG;
    }

    static /* synthetic */ mkl e(mmh mmh2) {
        return mmh2.DMP;
    }

    static /* synthetic */ mla f(mmh mmh2) {
        return mmh2.DMQ;
    }

    static /* synthetic */ void g(mmh mmh2) {
        mmh2.eFn();
    }

    static /* synthetic */ void a(mmh mmh2, ActionEvent actionEvent) {
        mmh2.au(actionEvent);
    }

    static /* synthetic */ mkg h(mmh mmh2) {
        return mmh2.DML;
    }

    static /* synthetic */ mmj i(mmh mmh2) {
        return mmh2.DMw;
    }

    static /* synthetic */ mkg j(mmh mmh2) {
        return mmh2.DMM;
    }

    static /* synthetic */ mlx k(mmh mmh2) {
        return mmh2.DMx;
    }

    static /* synthetic */ aux l(mmh mmh2) {
        return mmh2.DEC;
    }

    static /* synthetic */ bvf m(mmh mmh2) {
        return mmh2.DJS;
    }
}

