/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class muv
extends JPanel {
    private JButton EHI;
    private JButton EHJ;
    private JButton EHK;
    private JButton EHL;
    private JList EHM;
    private JButton EHN;
    private JButton EHO;
    private JButton EHP;
    private JList EHQ;
    private JButton EHR;
    private JPanel aa;
    private JPanel ac;
    private JScrollPane ah;
    private JScrollPane ai;
    private JSeparator bAx;
    private JTextField DEo;
    private JTextField EHS;
    private aux DEC;
    private List EHF = lcn.emv();
    private List EHT = lcn.emv();

    public muv() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.EHQ = new JList();
        this.EHP = new JButton();
        this.EHN = new JButton();
        this.DEo = new JTextField();
        this.EHR = new JButton();
        this.EHO = new JButton();
        this.bAx = new JSeparator();
        this.ac = new JPanel();
        this.EHS = new JTextField();
        this.ai = new JScrollPane();
        this.EHM = new JList();
        this.EHL = new JButton();
        this.EHJ = new JButton();
        this.EHI = new JButton();
        this.EHK = new JButton();
        this.EHQ.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ muv EHU;
            {
                this.EHU = muv2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.ah.setViewportView(this.EHQ);
        this.EHP.setText("Remove");
        this.EHP.addActionListener(new ActionListener(this){
            final /* synthetic */ muv EHU;
            {
                this.EHU = muv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muv.a(this.EHU, actionEvent);
            }
        });
        this.EHN.setText("Edit");
        this.EHN.addActionListener(new ActionListener(this){
            final /* synthetic */ muv EHU;
            {
                this.EHU = muv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muv.b(this.EHU, actionEvent);
            }
        });
        this.DEo.setEditable(false);
        this.DEo.setHorizontalAlignment(0);
        this.DEo.setText("Training Templates");
        this.EHR.setText("Add");
        this.EHR.addActionListener(new ActionListener(this){
            final /* synthetic */ muv EHU;
            {
                this.EHU = muv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muv.c(this.EHU, actionEvent);
            }
        });
        this.EHO.setText("New");
        this.EHO.addActionListener(new ActionListener(this){
            final /* synthetic */ muv EHU;
            {
                this.EHU = muv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muv.d(this.EHU, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.DEo, -1, 289, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.EHR).addPreferredGap(0).add((Component)this.EHP).addPreferredGap(0).add((Component)this.EHN).addPreferredGap(0, 51, Short.MAX_VALUE).add((Component)this.EHO)).add((Component)this.ah, -1, 289, Short.MAX_VALUE)).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DEo, -2, 19, -2).addPreferredGap(0).add((Component)this.ah, -1, 279, Short.MAX_VALUE).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.EHR).add((Component)this.EHP).add((Component)this.EHN).add((Component)this.EHO)).addContainerGap()));
        this.bAx.setOrientation(1);
        this.EHS.setEditable(false);
        this.EHS.setHorizontalAlignment(0);
        this.EHS.setText("Repair Templates");
        this.ai.setViewportView(this.EHM);
        this.EHL.setText("Remove");
        this.EHL.addActionListener(new ActionListener(this){
            final /* synthetic */ muv EHU;
            {
                this.EHU = muv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muv.e(this.EHU, actionEvent);
            }
        });
        this.EHJ.setText("Edit");
        this.EHJ.addActionListener(new ActionListener(this){
            final /* synthetic */ muv EHU;
            {
                this.EHU = muv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muv.f(this.EHU, actionEvent);
            }
        });
        this.EHI.setText("Add");
        this.EHI.addActionListener(new ActionListener(this){
            final /* synthetic */ muv EHU;
            {
                this.EHU = muv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muv.g(this.EHU, actionEvent);
            }
        });
        this.EHK.setText("New");
        this.EHK.addActionListener(new ActionListener(this){
            final /* synthetic */ muv EHU;
            {
                this.EHU = muv2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muv.h(this.EHU, actionEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.EHI).addPreferredGap(0).add((Component)this.EHL).addPreferredGap(0).add((Component)this.EHJ).addPreferredGap(0, 80, Short.MAX_VALUE).add((Component)this.EHK)).add((Component)this.EHS, -1, 318, Short.MAX_VALUE).add(2, (Component)this.ai, -1, 318, Short.MAX_VALUE)).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.EHS, -2, -1, -2).addPreferredGap(0).add((Component)this.ai, -1, 279, Short.MAX_VALUE).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.EHI).add((Component)this.EHL).add((Component)this.EHJ).add((Component)this.EHK)).addContainerGap()));
        GroupLayout groupLayout3 = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.bAx, -2, -1, -2).addPreferredGap(0).add((Component)this.ac, -2, -1, -2).addContainerGap()));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout3.createParallelGroup(1).add(2, (Component)this.aa, -1, -1, Short.MAX_VALUE).add((Component)this.bAx, -1, 344, Short.MAX_VALUE).add((Component)this.ac, -1, -1, Short.MAX_VALUE)).addContainerGap()));
    }

    private void cE(ActionEvent actionEvent) {
        this.b(muw.b.EJe);
    }

    private void cF(ActionEvent actionEvent) {
        this.e(muw.b.EJe);
    }

    private void cG(ActionEvent actionEvent) {
        this.c(muw.b.EJe);
    }

    private void cH(ActionEvent actionEvent) {
        this.d(muw.b.EJe);
    }

    private void cI(ActionEvent actionEvent) {
        this.b(muw.b.EJd);
    }

    private void cJ(ActionEvent actionEvent) {
        this.e(muw.b.EJd);
    }

    private void cK(ActionEvent actionEvent) {
        this.c(muw.b.EJd);
    }

    private void cL(ActionEvent actionEvent) {
        this.d(muw.b.EJd);
    }

    private void c() {
        this.ePS();
    }

    private void b(muw.b b2) {
        mup mup2 = new mup((Frame)this.DEC, false, b2);
        mup2.setLocationRelativeTo(this);
        mup2.setVisible(true);
    }

    private void c(muw.b b2) {
        Object object;
        jrw jrw2 = null;
        switch (b2) {
            case EJd: {
                object = (String)this.EHQ.getSelectedValue();
                if (object == null) {
                    return;
                }
                jrw2 = new jrw(lcw.qLb + "/" + "xml-files/server/vendor/" + "trainingtemplates/" + (String)object);
                break;
            }
            case EJe: {
                object = (String)this.EHM.getSelectedValue();
                if (object == null) {
                    return;
                }
                jrw2 = new jrw(lcw.qLb + "/" + "xml-files/server/vendor/" + "repairingtemplates/" + (String)object);
            }
        }
        object = new mup((Frame)this.DEC, false, b2);
        ((Window)object).setLocationRelativeTo(this);
        ((mup)object).p(this.DEC);
        ((mup)object).Q(jrw2);
        ((Dialog)object).setVisible(true);
    }

    private void d(muw.b b2) {
        switch (b2) {
            case EJd: {
                String string = (String)this.EHQ.getSelectedValue();
                this.EHF.remove(string);
                this.ePS();
                break;
            }
            case EJe: {
                String string = (String)this.EHM.getSelectedValue();
                this.EHT.remove(string);
                this.ePS();
            }
        }
    }

    private void e(muw.b b2) {
        String string = lcw.qLb + "/" + "xml-files/server/vendor/";
        JFileChooser jFileChooser = new JFileChooser();
        switch (b2) {
            case EJd: {
                jFileChooser.setCurrentDirectory(new jrw(string + "trainingtemplates/"));
                break;
            }
            case EJe: {
                jFileChooser.setCurrentDirectory(new jrw(string + "repairingtemplates/"));
            }
        }
        int n = jFileChooser.showOpenDialog(this);
        if (n == 0) {
            String string2 = jFileChooser.getSelectedFile().getName();
            switch (b2) {
                case EJd: {
                    this.EHF.add(string2);
                    break;
                }
                case EJe: {
                    this.EHT.add(string2);
                }
            }
            this.ePS();
        }
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    public void cF(List list) {
        this.EHF = list;
        this.ePS();
    }

    public void cG(List list) {
        this.EHT = list;
        this.ePS();
    }

    private void ePS() {
        this.EHQ.setListData(this.EHF.toArray());
        this.EHM.setListData(this.EHT.toArray());
    }

    static /* synthetic */ void a(muv muv2, ActionEvent actionEvent) {
        muv2.cL(actionEvent);
    }

    static /* synthetic */ void b(muv muv2, ActionEvent actionEvent) {
        muv2.cK(actionEvent);
    }

    static /* synthetic */ void c(muv muv2, ActionEvent actionEvent) {
        muv2.cJ(actionEvent);
    }

    static /* synthetic */ void d(muv muv2, ActionEvent actionEvent) {
        muv2.cI(actionEvent);
    }

    static /* synthetic */ void e(muv muv2, ActionEvent actionEvent) {
        muv2.cH(actionEvent);
    }

    static /* synthetic */ void f(muv muv2, ActionEvent actionEvent) {
        muv2.cG(actionEvent);
    }

    static /* synthetic */ void g(muv muv2, ActionEvent actionEvent) {
        muv2.cF(actionEvent);
    }

    static /* synthetic */ void h(muv muv2, ActionEvent actionEvent) {
        muv2.cE(actionEvent);
    }
}

