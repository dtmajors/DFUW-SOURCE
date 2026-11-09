/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  dta
 *  lcr
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Map;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class mqn
extends mkx
implements ActionListener,
KeyListener,
ListSelectionListener {
    private Map<ldv, dta> haz = null;
    private aux DEC;
    private JTextField DGK;
    private JTable Een;
    private Vector<amf> pjQ = new Vector();

    public mqn(aux aux2, Map<ldv, dta> map) {
        super(false);
        this.haz = map;
        this.DEC = aux2;
        this.setClosable(true);
        this.DGK = new JTextField("");
        this.DGa.add((Component)this.DGK, "First");
        this.DGK.addActionListener(this);
        this.DGK.requestFocus();
        this.Een = new JTable(new b(this, null));
        JScrollPane jScrollPane = new JScrollPane(this.Een);
        this.DGa.add((Component)jScrollPane, "Center");
        this.Een.getColumnModel().getColumn(0).setHeaderValue("GUID");
        this.Een.getColumnModel().getColumn(1).setHeaderValue("ResourceType");
        this.Een.getColumnModel().getColumn(2).setHeaderValue("ObjectSpace");
        this.Een.getColumnModel().getColumn(3).setHeaderValue("ObjectType");
        this.Een.getColumnModel().getColumn(0).setPreferredWidth(75);
        this.Een.getColumnModel().getColumn(1).setPreferredWidth(300);
        this.Een.getColumnModel().getColumn(2).setPreferredWidth(50);
        this.Een.getColumnModel().getColumn(3).setPreferredWidth(75);
        this.Een.setSelectionMode(2);
        this.Een.getSelectionModel().addListSelectionListener(this);
        this.Een.addMouseListener(new a(this, null));
        this.Een.addKeyListener(this);
        this.DGK.addKeyListener(this);
        this.CQ("");
        this.setSize(500, 600);
        JPanel jPanel = new JPanel(new BorderLayout());
        JLabel jLabel = new JLabel("Drop a prop here:");
        JTextField jTextField = new JTextField();
        Dimension dimension = new Dimension(140, 18);
        jTextField.setMinimumSize(dimension);
        jTextField.setSize(dimension);
        jTextField.setPreferredSize(dimension);
        JButton jButton = new JButton("Replace Selected");
        jPanel.add((Component)jLabel, "West");
        jPanel.add((Component)jTextField, "Center");
        jPanel.add((Component)jButton, "East");
        jPanel.setBorder(BorderFactory.createTitledBorder("Replace Options..."));
        jButton.addActionListener(new ActionListener(this, jTextField){
            final /* synthetic */ JTextField Eeo;
            final /* synthetic */ mqn Eep;
            {
                this.Eep = mqn2;
                this.Eeo = jTextField;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqn.a(this.Eep, this.Eeo.getText());
            }
        });
        JButton jButton2 = new JButton("Delete");
        jButton2.addActionListener(new ActionListener(this){
            final /* synthetic */ mqn Eep;
            {
                this.Eep = mqn2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqn.a(this.Eep);
            }
        });
        JPanel jPanel2 = new JPanel(new BorderLayout());
        jPanel2.add((Component)jPanel, "Center");
        jPanel2.add((Component)jButton2, "East");
        this.DGa.add((Component)jPanel2, "South");
    }

    private void eJv() {
        if (JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the selected objects?") != 0) {
            return;
        }
        int[] nArray = this.Een.getSelectedRows();
        for (int i = 0; i < nArray.length; ++i) {
            amf amf2 = this.pjQ.get(nArray[i]);
            if (amf2.isScheduledForRemoval()) continue;
            fub fub2 = (fub)this.DEC.d(1027);
            fub2.HX(fub.iWD);
            fub2.hC(amf2.getGUID());
            fub2.on(amf2.getGUID());
            fub2.f(lcr.qAE);
            this.DEC.a((dxq)fub2);
        }
        try {
            Thread.sleep(200L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.DEC.nG(null);
        this.Een.clearSelection();
        this.CQ(this.DGK.getText());
        this.Een.updateUI();
    }

    private void CP(String string) {
        Object object;
        Object object2;
        Object object3;
        File file = new File(string);
        if (!file.exists() || !string.endsWith(".xml")) {
            JOptionPane.showMessageDialog(this, "Could not find file " + string + " or file not an xml file");
            return;
        }
        Map<ldv, amf> map = lcn.emw();
        int[] nArray = this.Een.getSelectedRows();
        dta dta2 = (dta)this.DEC.am().get(mje.DAS);
        if (dta2 == null) {
            JOptionPane.showMessageDialog(this, "no valid object space is selected to put the new objects in. Aborting...");
            return;
        }
        for (int i = 0; i < nArray.length; ++i) {
            amf object4 = this.pjQ.get(nArray[i]);
            if (object4.isScheduledForRemoval() || !(object4 instanceof ami)) continue;
            object3 = (ami)((Object)object4);
            object2 = (fub)this.DEC.d(1027);
            ((fub)object2).HX(fub.iWD);
            ((fub)object2).hC(object4.getGUID());
            ((dxq)object2).on(object4.getGUID());
            ((dxq)object2).f(lcr.qAE);
            this.DEC.a((dxq)object2);
            object = (hac)this.DEC.d(4097);
            ldv ldv2 = dta2.bzv();
            ((hac)object).hC(ldv2);
            ((dxq)object).on(lcr.qAE);
            ((dxq)object).f(lcr.qAE);
            ((hac)object).Lb(1);
            ((hac)object).setFileName(string.toLowerCase());
            ((hac)object).c(object3.av());
            ((hac)object).setRotation(object3.aw().eqT());
            this.DEC.a((dxq)object);
            map.put(ldv2, object4);
        }
        try {
            Thread.sleep(200L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.DEC.nG(null);
        try {
            Thread.sleep(200L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.CQ(this.DGK.getText());
        this.Een.updateUI();
        block5: for (Map.Entry entry : map.entrySet()) {
            object3 = this.DEC.d((ldv)entry.getKey());
            object2 = (amf)entry.getValue();
            if (!(object3 instanceof bdl)) continue;
            object = (bdl)((Object)object3);
            for (int i = 0; i < ((bdl)((Object)object)).ame().size(); ++i) {
                amf amf2 = ((bdl)((Object)object)).ame().get(i);
                if (!amf2.getObjectDescriptionFilename().equals(((amf)object2).getObjectDescriptionFilename())) continue;
                bdl.a a2 = ((bdl)((Object)object)).alY().get(i);
                ljq ljq2 = a2.aml().esF();
                ljq2.esB();
                mfy mfy2 = new mfy();
                mfy2.eG(ljq2);
                mfy mfy3 = new mfy();
                mfy3.ac(object.aw());
                mfy2.c(mfy3);
                mfy mfy4 = new mfy();
                mfy4.eG(((bdl)((Object)object)).av());
                mfy2.c(mfy4);
                ljq ljq3 = ((bdl)((Object)object)).av();
                ljq ljq4 = new ljq();
                lgl lgl2 = new lgl();
                mfy2.w(ljq4, lgl2);
                lgl2.normalize();
                ((bdl)((Object)object)).c(ljq4);
                object.a(lgl2);
                object.iN(true);
                continue block5;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void CQ(String string) {
        this.pjQ.clear();
        Map<ldv, dta> map = this.haz;
        synchronized (map) {
            for (dta dta2 : this.haz.values()) {
                for (amf amf2 : dta2.bzr()) {
                    String string2 = mqn.y(amf2);
                    if (string2 == null || !string2.toLowerCase().contains(string.toLowerCase())) continue;
                    boolean bl = false;
                    if (amf2 instanceof btk) {
                        btk btk2 = (btk)amf2;
                        for (ldv ldv2 : btk2.getObserverObjects()) {
                            amf amf3 = this.DEC.d(ldv2);
                            if (amf3 == null || !(amf3 instanceof bdl)) continue;
                            bl = true;
                        }
                    }
                    if (bl) continue;
                    this.pjQ.add(amf2);
                }
            }
        }
        this.setTitle("Object QuickFind (" + this.pjQ.size() + " objects...)");
    }

    public static String y(amf amf2) {
        if (amf2 instanceof bdl) {
            return ((bdl)((Object)amf2)).amd();
        }
        if (amf2 instanceof dsp) {
            return ((dsp)((Object)amf2)).atK();
        }
        if (amf2.getObjectType() == 28) {
            return amf2.getClass().getSimpleName() + " (" + amf2.getObjectDescriptionFilename() + ")";
        }
        return amf2.getObjectDescriptionFilename();
    }

    public void focus() {
        this.DGK.requestFocus();
    }

    public void eJw() {
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.CQ(this.DGK.getText());
        this.Een.updateUI();
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        int n = this.Een.getSelectedRow();
        if (n == -1) {
            return;
        }
        mwg.a(this.pjQ.get(n), this.DEC);
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int n;
        if (keyEvent.getKeyCode() == 32 && keyEvent.getSource() != this.DGK && (n = this.Een.getSelectedRow()) != -1) {
            mwg.a(this.pjQ.get(n), this.DEC, true);
        }
        if (keyEvent.getKeyCode() == 27) {
            this.setVisible(false);
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    static /* synthetic */ void a(mqn mqn2, String string) {
        mqn2.CP(string);
    }

    static /* synthetic */ void a(mqn mqn2) {
        mqn2.eJv();
    }

    static /* synthetic */ Vector b(mqn mqn2) {
        return mqn2.pjQ;
    }
}

