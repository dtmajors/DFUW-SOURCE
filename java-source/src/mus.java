/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.layout.GroupLayout;

public class mus
extends JInternalFrame {
    private JButton EHs;
    private JButton EHt;
    private JButton EHu;
    private JButton EHv;
    private JButton EHw;
    private JButton EHx;
    private JButton DNZ;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JScrollPane ah;
    private JScrollPane ai;
    private JTable Egl;
    private JTable EHy;
    aux DEC;

    public mus() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.Egl = new JTable();
        this.EHt = new JButton();
        this.EHv = new JButton();
        this.EHx = new JButton();
        this.bN = new JPanel();
        this.EHs = new JButton();
        this.EHu = new JButton();
        this.EHw = new JButton();
        this.ai = new JScrollPane();
        this.EHy = new JTable();
        this.ac = new JPanel();
        this.DNZ = new JButton();
        this.setClosable(true);
        this.setTitle("Skill Training Rule Editor");
        this.Egl.setModel(new DefaultTableModel(this, new Object[][]{{null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}}, new String[]{"Skill", "Cost", "Nr.Of Requirements"}){
            boolean[] Ego;
            final /* synthetic */ mus EHz;
            {
                this.EHz = mus2;
                super(objectArray, objectArray2);
                this.Ego = new boolean[]{false, false, false};
            }

            public boolean isCellEditable(int n, int n2) {
                return this.Ego[n2];
            }
        });
        this.ah.setViewportView(this.Egl);
        this.EHt.setText("Add Rule");
        this.EHt.addActionListener(new ActionListener(this){
            final /* synthetic */ mus EHz;
            {
                this.EHz = mus2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mus.a(this.EHz, actionEvent);
            }
        });
        this.EHv.setText("Edit Rule");
        this.EHv.addActionListener(new ActionListener(this){
            final /* synthetic */ mus EHz;
            {
                this.EHz = mus2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mus.b(this.EHz, actionEvent);
            }
        });
        this.EHx.setText("Remove Rule");
        this.EHx.addActionListener(new ActionListener(this){
            final /* synthetic */ mus EHz;
            {
                this.EHz = mus2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mus.c(this.EHz, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.ah, -1, 680, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.EHt).addPreferredGap(0).add((Component)this.EHv).addPreferredGap(0).add((Component)this.EHx))).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.ah, -2, 151, -2).addPreferredGap(0, 22, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.EHt).add((Component)this.EHv).add((Component)this.EHx)).addContainerGap()));
        this.bN.setBorder(BorderFactory.createTitledBorder("Requirement details"));
        this.EHs.setText("Add Req.");
        this.EHs.addActionListener(new ActionListener(this){
            final /* synthetic */ mus EHz;
            {
                this.EHz = mus2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mus.d(this.EHz, actionEvent);
            }
        });
        this.EHu.setText("Edit Req.");
        this.EHu.addActionListener(new ActionListener(this){
            final /* synthetic */ mus EHz;
            {
                this.EHz = mus2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mus.e(this.EHz, actionEvent);
            }
        });
        this.EHw.setText("Remove Req.");
        this.EHw.addActionListener(new ActionListener(this){
            final /* synthetic */ mus EHz;
            {
                this.EHz = mus2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mus.f(this.EHz, actionEvent);
            }
        });
        this.EHy.setModel(new DefaultTableModel(this, new Object[][]{{null, null, null}, {null, null, null}, {null, null, null}, {null, null, null}}, new String[]{"Type", "TypeName", "Level"}){
            boolean[] Ego;
            final /* synthetic */ mus EHz;
            {
                this.EHz = mus2;
                super(objectArray, objectArray2);
                this.Ego = new boolean[]{false, false, false};
            }

            public boolean isCellEditable(int n, int n2) {
                return this.Ego[n2];
            }
        });
        this.ai.setViewportView(this.EHy);
        GroupLayout groupLayout2 = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.EHs).addPreferredGap(0).add((Component)this.EHu).addPreferredGap(0).add((Component)this.EHw)).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add(10, 10, 10).add((Component)this.ai, -1, 644, Short.MAX_VALUE))).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.ai, -1, 164, Short.MAX_VALUE).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.EHs).add((Component)this.EHu).add((Component)this.EHw))));
        this.DNZ.setText("Save Rules");
        this.DNZ.addActionListener(new ActionListener(this){
            final /* synthetic */ mus EHz;
            {
                this.EHz = mus2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mus.g(this.EHz, actionEvent);
            }
        });
        GroupLayout groupLayout3 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap(605, Short.MAX_VALUE).add((Component)this.DNZ)));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.DNZ).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().add((Component)this.ac, -1, -1, Short.MAX_VALUE).addContainerGap()).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((Component)this.bN, -1, -1, Short.MAX_VALUE).addContainerGap()).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout4.createSequentialGroup().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.bN, -2, -1, -2).addPreferredGap(0).add((Component)this.ac, -2, -1, -2)));
        this.pack();
    }

    private void aB(ActionEvent actionEvent) {
        jvs jvs2 = new jvs();
        jvs2.dTD();
    }

    private void cy(ActionEvent actionEvent) {
        this.ePV();
    }

    private void cz(ActionEvent actionEvent) {
        this.ePW();
    }

    private void cA(ActionEvent actionEvent) {
        this.ePU();
    }

    private void cB(ActionEvent actionEvent) {
        this.ePY();
    }

    private void cC(ActionEvent actionEvent) {
        this.ePZ();
    }

    private void cD(ActionEvent actionEvent) {
        this.ePX();
    }

    private void c() {
        this.ePT();
    }

    private void ePT() {
        Vector vector = new Vector();
        Vector<String> vector2 = new Vector<String>();
        vector2.add("Skill");
        vector2.add("Cost");
        vector2.add("Requirements");
        ArrayList<cuo> arrayList = new ArrayList<cuo>(cxj.bfS().values());
        Collections.sort(arrayList);
        for (cuo object2 : arrayList) {
            Vector<Object> vector3 = new Vector<Object>();
            vector3.add(object2.Bu());
            vector3.add(new Float(object2.TrainingCost));
            vector3.add(object2.Requirements.length);
            vector.add(vector3);
        }
        ((DefaultTableModel)this.Egl.getModel()).setDataVector(vector, vector2);
        this.Egl.setSelectionMode(0);
        ListSelectionListener listSelectionListener = new ListSelectionListener(this){
            final /* synthetic */ mus EHz;
            {
                this.EHz = mus2;
            }

            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                if (listSelectionEvent.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel listSelectionModel = (ListSelectionModel)listSelectionEvent.getSource();
                if (listSelectionModel.isSelectionEmpty()) {
                    return;
                }
                int n = listSelectionModel.getMinSelectionIndex();
                mus.a(this.EHz, n);
            }
        };
        ListSelectionModel listSelectionModel = this.Egl.getSelectionModel();
        listSelectionModel.addListSelectionListener(listSelectionListener);
    }

    private void DA(String string) {
        int n = this.Egl.getRowHeight();
        for (int i = 0; i < n; ++i) {
            String string2 = (String)this.Egl.getModel().getValueAt(i, 0);
            if (!string2.equals(string)) continue;
            this.Egl.setRowSelectionInterval(i, i);
            lfn.b(0, this.getClass().getSimpleName(), "setRuleSelected() : Got it (row = " + i + ") SkillName = " + string);
            break;
        }
    }

    private void afI(int n) {
        if (n == -1) {
            return;
        }
        Vector vector = ((DefaultTableModel)this.Egl.getModel()).getDataVector().get(n);
        assert (vector != null);
        String string = (String)vector.get(0);
        int n2 = lea.enZ().getType(string);
        assert (n2 > 0);
        cuo cuo2 = cxj.yw(n2);
        assert (cuo2 != null);
        Vector vector2 = new Vector();
        Vector<String> vector3 = new Vector<String>();
        vector3.add("Type");
        vector3.add("TypeName");
        vector3.add("Level");
        cua[] cuaArray = cuo2.Requirements;
        for (int i = 0; i < cuaArray.length; ++i) {
            cua cua2;
            Vector<Object> vector4 = new Vector<Object>();
            cua cua3 = cuaArray[i];
            if (cua3 instanceof cue) {
                cua2 = (cue)cua3;
                vector4.add("Skill");
                vector4.add(((cue)cua2).Bu());
                vector4.add(new Float(((cue)cua2).SkillLevel));
            } else if (cua3 instanceof cuc) {
                cua2 = (cuc)cua3;
                vector4.add("Attribute");
                vector4.add(((cuc)cua2).getAttributeName());
                vector4.add(new Float(((cuc)cua2).AttributeValue));
            } else if (cua3 instanceof cub) {
                cua2 = (cub)cua3;
                vector4.add("Composite");
                vector4.add("Edit to see details");
                vector4.add("Parts = " + ((cub)cua2).Requirements.length);
            }
            vector2.add(vector4);
        }
        ((DefaultTableModel)this.EHy.getModel()).setDataVector(vector2, vector3);
        this.EHy.setSelectionMode(0);
        this.repaint();
    }

    private void ePU() {
        mum mum2 = new mum((Frame)this.DEC, true);
        mum2.p(this.DEC);
        mum2.setLocationRelativeTo(this);
        mum2.setVisible(true);
        if (mum2.Bu() == null) {
            return;
        }
        cuo cuo2 = new cuo();
        cuo2.SkillType = lea.enZ().getType(mum2.Bu());
        assert (cuo2.SkillType > 0);
        cuo2.TrainingCost = mum2.Bb();
        cuo2.Requirements = new cua[0];
        if (cxj.yv(cuo2.SkillType)) {
            JOptionPane.showMessageDialog(this, "Training rule for skill " + mum2.Bu() + " already exists. Not Adding!");
            return;
        }
        cxj.a(cuo2);
        this.ePT();
        this.DA(cuo2.Bu());
    }

    private void ePV() {
        int n = this.Egl.getSelectedRow();
        if (n == -1) {
            return;
        }
        Vector vector = ((DefaultTableModel)this.Egl.getModel()).getDataVector().get(n);
        assert (vector != null);
        String string = (String)vector.get(0);
        int n2 = lea.enZ().getType(string);
        assert (n2 > 0);
        cxj.yx(n2);
        this.ePT();
    }

    private void ePW() {
        int n = this.Egl.getSelectedRow();
        if (n == -1) {
            return;
        }
        Vector vector = ((DefaultTableModel)this.Egl.getModel()).getDataVector().get(n);
        assert (vector != null);
        String string = (String)vector.get(0);
        int n2 = lea.enZ().getType(string);
        assert (n2 > 0);
        cuo cuo2 = cxj.yw(n2);
        assert (cuo2 != null);
        mum mum2 = new mum(null, true);
        mum2.p(this.DEC);
        mum2.setLocationRelativeTo(this);
        mum2.CU(cuo2.Bu());
        mum2.aa(cuo2.TrainingCost);
        mum2.setVisible(true);
        if (mum2.Bu() == null) {
            return;
        }
        String string2 = mum2.Bu();
        int n3 = lea.enZ().getType(string2);
        if (n3 != cuo2.SkillType) {
            if (cxj.yv(n3)) {
                JOptionPane.showMessageDialog(this, "Training rule for skill " + mum2.Bu() + " already exists. Not changing!");
                return;
            }
            cxj.yx(n2);
            lfn.b(0, this.getClass().getSimpleName(), "editRule() : New skillType. Removing from map and re-adding with new type.");
            cuo2.SkillType = n3;
            cxj.a(cuo2);
        }
        cuo2.TrainingCost = mum2.Bb();
        this.ePT();
    }

    private void ePX() {
        int n = this.Egl.getSelectedRow();
        if (n == -1) {
            return;
        }
        mul mul2 = new mul((Frame)this.DEC, true);
        mul2.setLocationRelativeTo(this);
        mul2.setVisible(true);
        cua cua2 = mul2.ePK();
        if (cua2 == null) {
            return;
        }
        Vector vector = ((DefaultTableModel)this.Egl.getModel()).getDataVector().get(n);
        assert (vector != null);
        String string = (String)vector.get(0);
        int n2 = lea.enZ().getType(string);
        assert (n2 > 0);
        cuo cuo2 = cxj.yw(n2);
        assert (cuo2 != null);
        cua[] cuaArray = cuo2.Requirements;
        ArrayList<cua> arrayList = new ArrayList<cua>(Arrays.asList(cuaArray));
        arrayList.add(cua2);
        cuo2.Requirements = arrayList.toArray(new cua[arrayList.size()]);
        this.ePT();
        this.afI(n);
        this.DA(cuo2.Bu());
        this.repaint();
    }

    private void ePY() {
        int n = this.Egl.getSelectedRow();
        if (n == -1) {
            return;
        }
        int n2 = this.EHy.getSelectedRow();
        if (n2 == -1) {
            return;
        }
        mul mul2 = new mul((Frame)this.DEC, true);
        mul2.setLocationRelativeTo(this);
        Vector vector = ((DefaultTableModel)this.Egl.getModel()).getDataVector().get(n);
        assert (vector != null);
        String string = (String)vector.get(0);
        int n3 = lea.enZ().getType(string);
        assert (n3 > 0);
        cuo cuo2 = cxj.yw(n3);
        assert (cuo2 != null);
        cua cua2 = cuo2.Requirements[n2];
        int n4 = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove Requirement [" + cua2 + "]?", "Remove Requirement", 0);
        if (n4 == 1) {
            return;
        }
        cua[] cuaArray = cuo2.Requirements;
        ArrayList<cua> arrayList = new ArrayList<cua>(Arrays.asList(cuaArray));
        arrayList.remove(cua2);
        cuo2.Requirements = arrayList.toArray(new cua[arrayList.size()]);
        this.ePT();
        this.afI(n);
        this.DA(cuo2.Bu());
        this.repaint();
    }

    private void ePZ() {
        int n = this.Egl.getSelectedRow();
        if (n == -1) {
            return;
        }
        int n2 = this.EHy.getSelectedRow();
        if (n2 == -1) {
            return;
        }
        mul mul2 = new mul((Frame)this.DEC, true);
        mul2.setLocationRelativeTo(this);
        Vector vector = ((DefaultTableModel)this.Egl.getModel()).getDataVector().get(n);
        assert (vector != null);
        String string = (String)vector.get(0);
        int n3 = lea.enZ().getType(string);
        assert (n3 > 0);
        cuo cuo2 = cxj.yw(n3);
        assert (cuo2 != null);
        cua cua2 = cuo2.Requirements[n2];
        mul2.c(cua2);
        mul2.setVisible(true);
        cua cua3 = mul2.ePK();
        if (cua3 == null) {
            return;
        }
        if (cua3 != cua2) {
            cuo2.Requirements[n2] = cua3;
        }
        this.ePT();
        this.afI(n);
        this.DA(cuo2.Bu());
        this.EHy.setRowSelectionInterval(n2, n2);
        this.repaint();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mus mus2, ActionEvent actionEvent) {
        mus2.cA(actionEvent);
    }

    static /* synthetic */ void b(mus mus2, ActionEvent actionEvent) {
        mus2.cz(actionEvent);
    }

    static /* synthetic */ void c(mus mus2, ActionEvent actionEvent) {
        mus2.cy(actionEvent);
    }

    static /* synthetic */ void d(mus mus2, ActionEvent actionEvent) {
        mus2.cD(actionEvent);
    }

    static /* synthetic */ void e(mus mus2, ActionEvent actionEvent) {
        mus2.cC(actionEvent);
    }

    static /* synthetic */ void f(mus mus2, ActionEvent actionEvent) {
        mus2.cB(actionEvent);
    }

    static /* synthetic */ void g(mus mus2, ActionEvent actionEvent) {
        mus2.aB(actionEvent);
    }

    static /* synthetic */ void a(mus mus2, int n) {
        mus2.afI(n);
    }
}

