/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  dqk
 *  lcr
 *  mlr
 *  mvg
 */
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class mwg
extends mkx
implements ActionListener {
    private Dimension bV = new Dimension(750, 320);
    private Collection<amf> EOW = lcn.emv();
    private ldv Rr = null;
    private mwh EOX = null;
    private aux DEC = null;
    private a EOY = null;
    private String EOZ;
    private mwf EPa = null;
    private boolean DNU = true;
    private mwi EOV;
    private int EPb = 0;
    public static mwg EPc = null;

    public mwg(Collection<amf> collection, String string, ldv ldv2) {
        super(false);
        EPc = this;
        this.setClosable(true);
        this.Rr = ldv2;
        this.EOW = collection;
        this.k(string, this.Rr);
        this.setPreferredSize(this.bV);
        this.EOY = new a(this);
        this.EOX = new mwh(this);
        this.eQT();
        this.pack();
        Thread thread = new Thread(new c(this));
        thread.start();
        this.addInternalFrameListener(new InternalFrameAdapter(this){
            final /* synthetic */ mwg EPd;
            {
                this.EPd = mwg2;
            }

            public void internalFrameClosing(InternalFrameEvent internalFrameEvent) {
                mwg.a(this.EPd, false);
            }
        });
    }

    public void k(String string, ldv ldv2) {
        this.EOZ = " ObjectSpace [" + string + "] with GUID [" + ldv2.enw() + "]";
        this.setTitle(this.EOZ);
    }

    public void a(Collection<amf> collection, ldv ldv2) {
        this.EPb = -1;
        this.EOW = collection;
        this.Rr = ldv2;
        this.EPa.oD(ldv2);
    }

    public ldv bBk() {
        return this.Rr;
    }

    public void nG(ldv ldv2) {
        int n = -1;
        mwi mwi2 = (mwi)this.EPa.getModel();
        for (int i = 0; i < mwi2.getRowCount(); ++i) {
            if (!ldv2.equals(mwi2.afJ(i).getGUID())) continue;
            n = i;
            break;
        }
        if (n != -1) {
            this.EPa.changeSelection(n, 0, false, false);
        }
    }

    public void p(aux aux2) {
        this.DEC = aux2;
        this.EPa.p(aux2);
    }

    public void eQT() {
        this.EOV = new mwi(this.EOW);
        this.EPa = new mwf(this.EOV);
        this.EPa.oD(this.Rr);
        this.EPa.addMouseListener(this.EOY);
        this.EPa.setSelectionMode(2);
        for (int i = 0; i < this.EPa.getColumnCount(); ++i) {
            this.EPa.getColumnModel().getColumn(i).setPreferredWidth(this.EOV.eRk()[i]);
        }
        JTableHeader jTableHeader = this.EPa.getTableHeader();
        this.EPa.setShowVerticalLines(true);
        this.EPa.setShowHorizontalLines(true);
        jTableHeader.setReorderingAllowed(false);
        jTableHeader.setVerifyInputWhenFocusTarget(true);
        mol mol2 = new mol();
        b b2 = new b(this);
        jTableHeader.addMouseListener(new mok(jTableHeader, mol2));
        TableColumnModel tableColumnModel = this.EPa.getColumnModel();
        int n = tableColumnModel.getColumnCount();
        for (int i = 0; i < n; ++i) {
            tableColumnModel.getColumn(i).setHeaderRenderer(mol2);
            tableColumnModel.getColumn(i).setCellRenderer(b2);
        }
        ListSelectionModel listSelectionModel = this.EPa.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener(this){
            final /* synthetic */ mwg EPd;
            {
                this.EPd = mwg2;
            }

            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                if (listSelectionEvent.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel listSelectionModel = (ListSelectionModel)listSelectionEvent.getSource();
                if (!listSelectionModel.isSelectionEmpty()) {
                    mwg.a(this.EPd);
                }
            }
        });
        JScrollPane jScrollPane = new JScrollPane(this.EPa);
        this.DGa.add(jScrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String string = actionEvent.getActionCommand();
        if (string.equals("Object Properties")) {
            this.eRf();
        } else if (string.equals("Delete")) {
            this.eRc();
        } else if (string.equals("Update Table")) {
            ((mwi)this.EPa.getModel()).fireTableDataChanged();
        } else if (string.equals("Set Selected")) {
            this.eRd();
        } else if (string.equals("Go to Object")) {
            this.An(false);
        } else if (string.equals("Dissolve Collecion")) {
            this.eA();
        } else if (string.equals("Inline Collecion")) {
            this.eRa();
        } else if (string.equals("Set Selected Height Object")) {
            this.eQZ();
        } else if (string.equals("Set Global Shader")) {
            this.eQY();
        } else if (string.equals("Set as Selected Attachable")) {
            this.eQX();
        } else if (string.equals("Toggle Editing of Collection")) {
            this.eQW();
        } else if (string.equals("Turn ON Shadowcasting")) {
            this.Ao(true);
        } else if (string.equals("Turn OFF Shadowcasting")) {
            this.Ao(false);
        } else if (string.equals("Align object(s) to ground")) {
            this.eRb();
        } else if (string.equals("Edit Mesh")) {
            this.eRi();
        } else if (string.equals("Hide Selected")) {
            this.eQU();
        } else if (string.equals("Unhide All")) {
            this.eQV();
        } else if (string.equals("Move Selected Objects to this OS")) {
            this.eRj();
        } else if (string.equals("Set Object Category")) {
            this.eRe();
        }
    }

    private void eQU() {
        int[] nArray = this.EPa.getSelectedRows();
        int n = 0;
        for (int i = 0; i < nArray.length; ++i) {
            n = nArray[i];
            amf amf2 = ((mwi)this.EPa.getModel()).afJ(n);
            if (!(amf2 instanceof dqk)) continue;
            dqk dqk2 = (dqk)amf2;
            dqk2.setVisible(false);
        }
    }

    private void eQV() {
    }

    private void eQW() {
        hac hac2 = (hac)this.DEC.d(4097);
        hac2.Lb(38);
        this.DEC.a((dxq)hac2);
    }

    private void eQX() {
        int n = this.EPa.getSelectedRow();
        amf amf2 = ((mwi)this.EPa.getModel()).afJ(n);
        if (amf2 == null) {
            return;
        }
        int n2 = amf2.getObjectType();
        switch (n2) {
            case 5: 
            case 13: {
                this.DEC.un(amf2.getGUID());
                break;
            }
        }
    }

    private void eQY() {
        int n = this.EPa.getSelectedRowCount();
        if (n > 0) {
            mkz mkz2 = new mkz((Frame)this.DEC, true);
            mkz2.setLocationRelativeTo(this);
            mkz2.setVisible(true);
            String string = mkz2.eDF();
            if (string != null) {
                int[] nArray = this.EPa.getSelectedRows();
                int n2 = 0;
                block3: for (int i = 0; i < nArray.length; ++i) {
                    n2 = nArray[i];
                    amf amf2 = ((mwi)this.EPa.getModel()).afJ(n2);
                    int n3 = amf2.getObjectType();
                    switch (n3) {
                        case 5: 
                        case 24: 
                        case 29: 
                        case 38: {
                            gif gif2 = (gif)this.DEC.d(6913);
                            gif2.on(amf2.getGUID());
                            gif2.f(lcr.qzr);
                            gif2.JD(gif.jii);
                            gif2.oo(0);
                            gif2.Cv(1);
                            gif2.gW(string);
                            this.DEC.a((dxq)gif2);
                            continue block3;
                        }
                    }
                }
            }
        } else {
            JOptionPane.showInternalMessageDialog(this, "No Object(s) or Selected!  Rowcount=" + n, "Error", 0);
        }
    }

    private void eQZ() {
        int n = this.EPa.getSelectedRow();
        amf amf2 = ((mwi)this.EPa.getModel()).afJ(n);
        if (amf2 == null) {
            return;
        }
        int n2 = amf2.getObjectType();
        switch (n2) {
            case 5: 
            case 24: 
            case 29: 
            case 38: {
                this.DEC.um(amf2.getGUID());
                break;
            }
        }
    }

    private void eRa() {
        if (mje.gUd != null) {
            eqz eqz2 = (eqz)this.DEC.d(9476);
            eqz2.EM(3);
            eqz2.on(mje.gUd);
            eqz2.f(lcr.qzr);
            this.DEC.a((dxq)eqz2);
        } else {
            JOptionPane.showInternalMessageDialog(this, "No Object Selected!", "Error", 0);
        }
    }

    private void eA() {
        if (mje.gUd != null) {
            eqz eqz2 = (eqz)this.DEC.d(9476);
            eqz2.EM(1);
            eqz2.on(mje.gUd);
            eqz2.f(lcr.qzr);
            this.DEC.a((dxq)eqz2);
            this.DEC.nG(null);
        } else {
            JOptionPane.showInternalMessageDialog(this, "No Collection Selected!", "Error", 0);
        }
    }

    private void eRb() {
        if (mje.DAT == null) {
            return;
        }
        int[] nArray = this.EPa.getSelectedRows();
        int n = 0;
        block3: for (int i = 0; i < nArray.length; ++i) {
            n = nArray[i];
            amf amf2 = ((mwi)this.EPa.getModel()).afJ(n);
            int n2 = amf2.getObjectType();
            switch (n2) {
                case 5: 
                case 29: 
                case 38: {
                    ewy ewy2 = new ewy();
                    ewy2.FA(kjn.iEH);
                    ewy2.on(amf2.getGUID());
                    ewy2.f(lcr.qAE);
                    ewy2.hC(mje.DAT);
                    this.DEC.a((dxq)ewy2);
                    continue block3;
                }
            }
        }
    }

    private void eRc() {
        int[] nArray = this.EPa.getSelectedRows();
        int n = 0;
        for (int i = 0; i < nArray.length; ++i) {
            n = nArray[i];
            amf amf2 = ((mwi)this.EPa.getModel()).afJ(n);
            haf haf2 = (haf)this.DEC.d(4101);
            haf2.Lf(2);
            haf2.hC(amf2.getGUID());
            this.DEC.a((dxq)haf2);
        }
        ((mwi)this.EPa.getModel()).fireTableDataChanged();
    }

    private void eRd() {
        int n = this.EPa.getSelectedRow();
        amf amf2 = ((mwi)this.EPa.getModel()).afJ(n);
        mwg.a(amf2, this.DEC);
    }

    private void eRe() {
        int[] nArray = this.EPa.getSelectedRows();
        String string = JOptionPane.showInputDialog("Please enter Category Text:");
        if (string != null) {
            for (int i = 0; i < nArray.length; ++i) {
                amf amf2 = ((mwi)this.EPa.getModel()).afJ(nArray[i]);
                if (string.equals("")) {
                    mje.DCj.remove(amf2.getGUID());
                    continue;
                }
                mje.DCj.put(amf2.getGUID(), string);
            }
            this.EPa.updateUI();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(amf amf2, aux aux2) {
        ldv ldv2 = null;
        int n = 0;
        amf amf3 = amf2;
        synchronized (amf3) {
            if (amf2 == null) {
                return;
            }
            n = amf2.getObjectType();
            ldv2 = amf2.getGUID();
            ldv2 = new ldv(ldv2.ib(), ldv2.enw(), ldv2.enx());
        }
        switch (n) {
            case 5: 
            case 13: 
            case 24: 
            case 29: 
            case 38: 
            case 46: 
            case 53: 
            case 94: 
            case 96: 
            case 106: 
            case 120: 
            case 121: 
            case 140: 
            case 141: 
            case 142: 
            case 144: 
            case 147: 
            case 148: {
                aux2.nG(ldv2);
                if (!mje.DBH) break;
                mwg.a(amf2, aux2, true);
                break;
            }
            default: {
                if (n <= amh.bxE.length) break;
                lfn.b(4, "SFObjectSpaceDialog", "getValueAt() Invalid objectType =  " + n);
            }
        }
    }

    private void An(boolean bl) {
        int n = this.EPa.getSelectedRow();
        amf amf2 = ((mwi)this.EPa.getModel()).afJ(n);
        mwg.a(amf2, this.DEC, bl);
    }

    public static void a(amf amf2, aux aux2, boolean bl) {
        int n = amf2.getObjectType();
        hac hac2 = (hac)aux2.d(4097);
        hac2.Lb(115);
        hac2.hC(amf2.getGUID());
        hac2.jxb = bl;
        aux2.a((dxq)hac2);
    }

    private void Ao(boolean bl) {
        int n = this.EPa.getSelectedRow();
        amf amf2 = ((mwi)this.EPa.getModel()).afJ(n);
        int n2 = amf2.getObjectType();
        switch (n2) {
            case 5: {
                gih gih2 = (gih)this.DEC.d(6915);
                gih2.on(amf2.getGUID());
                gih2.f(lcr.qzr);
                gih2.me(bl);
                gih2.JG(gih.jiw);
                this.DEC.a((dxq)gih2);
                break;
            }
        }
    }

    private void eRf() {
        int n = this.EPa.getSelectedRow();
        amf amf2 = ((mwi)this.EPa.getModel()).afJ(n);
        if (amf2 == null) {
            return;
        }
        mwg.b(amf2, this.DEC);
    }

    public static JInternalFrame b(amf object, aux aux2) {
        JInternalFrame jInternalFrame = null;
        int n = object.getObjectType();
        switch (n) {
            case 13: {
                mlr mlr2 = new mlr((bvf)object, aux2);
                aux2.eCu().add((Component)mlr2);
                mlr2.setVisible(true);
                jInternalFrame = mlr2;
                break;
            }
            case 5: {
                mvm mvm2 = new mvm((dqk)object);
                mvm2.p(aux2);
                aux2.eCu().add(mvm2);
                mvm2.setVisible(true);
                jInternalFrame = mvm2;
                break;
            }
            case 33: {
                mvp mvp2 = new mvp((drk)object);
                mvp2.p(aux2);
                aux2.eCu().add(mvp2);
                mvp2.setVisible(true);
                jInternalFrame = mvp2;
                break;
            }
            case 50: {
                mvo mvo2 = new mvo((drb)object);
                mvo2.p(aux2);
                aux2.eCu().add(mvo2);
                mvo2.setVisible(true);
                jInternalFrame = mvo2;
                break;
            }
            case 51: {
                mvr mvr2 = new mvr((drc)object);
                mvr2.p(aux2);
                aux2.eCu().add(mvr2);
                mvr2.setVisible(true);
                jInternalFrame = mvr2;
                break;
            }
            case 58: {
                mvt mvt2 = new mvt((drd)object);
                mvt2.p(aux2);
                aux2.eCu().add(mvt2);
                mvt2.setVisible(true);
                jInternalFrame = mvt2;
                break;
            }
            case 59: {
                mvv mvv2 = new mvv((drf)object);
                mvv2.p(aux2);
                aux2.eCu().add(mvv2);
                mvv2.setVisible(true);
                jInternalFrame = mvv2;
                break;
            }
            case 29: 
            case 38: {
                mva mva2 = new mva((bdl)((Object)object));
                mva2.p(aux2);
                aux2.eCu().add(mva2);
                mva2.setVisible(true);
                jInternalFrame = mva2;
                break;
            }
            case 8: 
            case 9: 
            case 10: {
                mvx mvx2 = new mvx((drt)object);
                mvx2.p(aux2);
                aux2.eCu().add(mvx2);
                mvx2.setVisible(true);
                jInternalFrame = mvx2;
                break;
            }
            case 36: {
                mvz mvz2 = new mvz((drx)object);
                mvz2.p(aux2);
                aux2.eCu().add(mvz2);
                mvz2.setVisible(true);
                jInternalFrame = mvz2;
                break;
            }
            case 47: {
                mwa mwa2 = new mwa((dry)object);
                mwa2.p(aux2);
                aux2.eCu().add(mwa2);
                mwa2.setVisible(true);
                jInternalFrame = mwa2;
                break;
            }
            case 53: {
                mvg mvg2 = new mvg((dsl)((Object)object));
                mvg2.p(aux2);
                aux2.eCu().add((Component)mvg2);
                mvg2.setVisible(true);
                jInternalFrame = mvg2;
                break;
            }
            case 74: {
                mvy mvy2 = new mvy((drv)object);
                mvy2.p(aux2);
                aux2.eCu().add(mvy2);
                mvy2.setVisible(true);
                jInternalFrame = mvy2;
                break;
            }
            case 69: {
                mvw mvw2 = new mvw((drs)object);
                mvw2.p(aux2);
                aux2.eCu().add(mvw2);
                mvw2.setVisible(true);
                jInternalFrame = mvw2;
                break;
            }
            case 23: {
                mvi mvi2 = new mvi();
                mvi2.a((dsr)object);
                aux2.eCu().add(mvi2);
                mvi2.setVisible(true);
                jInternalFrame = mvi2;
                break;
            }
            case 106: {
                mvl mvl2 = new mvl((dsn)((Object)object));
                aux2.eCu().add(mvl2);
                mvl2.setVisible(true);
                jInternalFrame = mvl2;
                break;
            }
            case 121: {
                mqq mqq2 = new mqq();
                mqq2.a((dsh)((Object)object));
                mqq2.p(aux2);
                aux2.eCu().add(mqq2);
                mqq2.setVisible(true);
                jInternalFrame = mqq2;
                break;
            }
            case 140: {
                mpr mpr2 = new mpr((dsd)((Object)object));
                aux2.eCu().add(mpr2);
                mpr2.setVisible(true);
                jInternalFrame = mpr2;
                break;
            }
            case 144: {
                mre mre2 = new mre();
                aux2.eCu().add(mre2);
                mre2.c();
                mre2.setVisible(true);
                mre2.b((dsk)((Object)object));
                jInternalFrame = mre2;
                break;
            }
            case 142: {
                object = ((dsi)((Object)object)).bxL();
            }
            case 141: {
                mqy mqy2 = new mqy(aux2, (dsj)object);
                aux2.eCu().add(mqy2);
                mqy2.setVisible(true);
                jInternalFrame = mqy2;
                break;
            }
            case 149: {
                object = ((dsf)((Object)object)).bxD();
            }
            case 147: {
                mpz mpz2 = new mpz(aux2, (dsg)((Object)object));
                aux2.eCu().add(mpz2);
                mpz2.setVisible(true);
                jInternalFrame = mpz2;
                break;
            }
            case 148: {
                mpl mpl2 = new mpl(aux2, (dsa)((Object)object));
                aux2.eCu().add(mpl2);
                mpl2.setVisible(true);
                jInternalFrame = mpl2;
                break;
            }
            case 150: {
                mrm mrm2 = new mrm((dsq)((Object)object));
                aux2.eCu().add(mrm2);
                mrm2.setVisible(true);
                jInternalFrame = mrm2;
                break;
            }
            case 151: {
                mpq mpq2 = new mpq((dsc)((Object)object));
                aux2.eCu().add(mpq2);
                mpq2.setVisible(true);
                jInternalFrame = mpq2;
                break;
            }
            case 156: {
                mvu mvu2 = new mvu((drl)object);
                mvu2.p(aux2);
                aux2.eCu().add(mvu2);
                mvu2.setVisible(true);
                jInternalFrame = mvu2;
                break;
            }
            default: {
                if (!(object instanceof btk)) break;
                muk muk2 = new muk((btk)object);
                muk2.p(aux2);
                aux2.eCu().add(muk2);
                muk2.setVisible(true);
                jInternalFrame = muk2;
            }
        }
        return jInternalFrame;
    }

    private void eRg() {
        if (this.EPa != null) {
            this.EOV.n(this.EOW);
            ((mwi)this.EPa.getModel()).eHE();
            ((mwi)this.EPa.getModel()).fireTableDataChanged();
            this.EPa.invalidate();
            this.eRh();
        }
    }

    private void eRh() {
        int n = 0;
        n = this.EOW.size();
        this.setTitle(this.EOZ + ", Objects = [" + n + "]");
    }

    private void eRi() {
        int n = this.EPa.getSelectedRow();
        amf amf2 = ((mwi)this.EPa.getModel()).afJ(n);
        if (amf2 == null) {
            return;
        }
        int n2 = amf2.getObjectType();
        if (n2 == 24 || n2 == 5) {
            mri mri2 = new mri(this.DEC);
            this.getDesktopPane().add(mri2);
            mri2.z(amf2);
            mri2.setVisible(true);
        }
    }

    public void eRj() {
    }

    static /* synthetic */ boolean a(mwg mwg2, boolean bl) {
        mwg2.DNU = bl;
        return mwg2.DNU;
    }

    static /* synthetic */ void a(mwg mwg2) {
        mwg2.eRd();
    }

    static /* synthetic */ mwh b(mwg mwg2) {
        return mwg2.EOX;
    }

    static /* synthetic */ mwf c(mwg mwg2) {
        return mwg2.EPa;
    }

    static /* synthetic */ void d(mwg mwg2) {
        mwg2.eRf();
    }

    static /* synthetic */ boolean e(mwg mwg2) {
        return mwg2.DNU;
    }

    static /* synthetic */ Collection f(mwg mwg2) {
        return mwg2.EOW;
    }

    static /* synthetic */ int g(mwg mwg2) {
        return mwg2.EPb;
    }

    static /* synthetic */ int a(mwg mwg2, int n) {
        mwg2.EPb = n;
        return mwg2.EPb;
    }

    static /* synthetic */ void h(mwg mwg2) {
        mwg2.eRg();
    }
}

