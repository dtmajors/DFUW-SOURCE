/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  con
 *  lcr
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class mpx
extends JInternalFrame {
    private JTextField DVA;
    private JButton DXn;
    private JButton DVB;
    private JButton DIj;
    private JCheckBox DXo;
    private JCheckBox DXp;
    private JPanel bF;
    private JCheckBox DXq;
    private JButton bI;
    private JTextField DVD;
    private JLabel I;
    private JPanel aa;
    private JPanel ac;
    private mrq bQ;
    private aux DEC;

    public mpx() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.DVD = new JTextField();
        this.I = new JLabel();
        this.DVA = new JTextField();
        this.bF = new JPanel();
        this.ac = new JPanel();
        this.DIj = new JButton();
        this.bI = new JButton();
        this.DVB = new JButton();
        this.DXq = new JCheckBox();
        this.DXp = new JCheckBox();
        this.DXo = new JCheckBox();
        this.DXn = new JButton();
        this.setClosable(true);
        this.setIconifiable(true);
        this.setTitle("Level Converter");
        this.DVD.setEditable(false);
        this.I.setText("Selected Tile(s):");
        this.DVA.setEditable(false);
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.I).addPreferredGap(0).add((Component)this.DVD, -1, 313, Short.MAX_VALUE).add(18, 18, 18).add((Component)this.DVA, -2, 80, -2).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.DVD, -2, -1, -2).add((Component)this.DVA, -2, -1, -2)).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout2 = new GroupLayout((Container)this.bF);
        this.bF.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(0, 512, Short.MAX_VALUE));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(0, 524, Short.MAX_VALUE));
        this.DIj.setText("Convert Selected");
        this.DIj.addActionListener(new ActionListener(this){
            final /* synthetic */ mpx DXr;
            {
                this.DXr = mpx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpx.a(this.DXr, actionEvent);
            }
        });
        this.bI.setText("Select All");
        this.bI.addActionListener(new ActionListener(this){
            final /* synthetic */ mpx DXr;
            {
                this.DXr = mpx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpx.b(this.DXr, actionEvent);
            }
        });
        this.DVB.setText("Clear All");
        this.DVB.addActionListener(new ActionListener(this){
            final /* synthetic */ mpx DXr;
            {
                this.DXr = mpx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpx.c(this.DXr, actionEvent);
            }
        });
        this.DXq.setText("Process Dynamic Data ONLY");
        this.DXq.addActionListener(new ActionListener(this){
            final /* synthetic */ mpx DXr;
            {
                this.DXr = mpx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpx.d(this.DXr, actionEvent);
            }
        });
        this.DXp.setSelected(true);
        this.DXp.setText("Edit \"zones.xml\"");
        this.DXp.addActionListener(new ActionListener(this){
            final /* synthetic */ mpx DXr;
            {
                this.DXr = mpx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpx.e(this.DXr, actionEvent);
            }
        });
        this.DXo.setText("Create zones for empty levels");
        this.DXn.setText("StitchNormals");
        GroupLayout groupLayout3 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add(21, 21, 21).add((Component)this.DXo)).add((Component)this.DXp).add((Component)this.DXq)).addPreferredGap(0, 43, Short.MAX_VALUE).add((Component)this.DXn).addPreferredGap(0).add((GroupLayout.Group)groupLayout3.createParallelGroup(2, false).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((Component)this.DVB, -2, 79, -2).addPreferredGap(0).add((Component)this.bI)).add((Component)this.DIj, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout3.createParallelGroup(2).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((Component)this.DIj).addPreferredGap(0).add((GroupLayout.Group)groupLayout3.createParallelGroup(3).add((Component)this.bI).add((Component)this.DVB).add((Component)this.DXn))).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((Component)this.DXq).addPreferredGap(0).add((Component)this.DXp).addPreferredGap(0).add((Component)this.DXo))).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((Component)this.bF, -1, -1, Short.MAX_VALUE).add((Component)this.aa, -1, -1, Short.MAX_VALUE).add(2, (Component)this.ac, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((Component)this.aa, -2, -1, -2).addPreferredGap(0).add((Component)this.bF, -1, -1, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.ac, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    private void bh(ActionEvent actionEvent) {
        this.bQ.eLx();
    }

    private void h(ActionEvent actionEvent) {
        this.bQ.selectAll();
    }

    private void bg(ActionEvent actionEvent) {
        this.eID();
    }

    private void bi(ActionEvent actionEvent) {
        if (this.DXp.isSelected()) {
            this.DXq.setSelected(false);
            this.DXo.setEnabled(true);
        }
    }

    private void bj(ActionEvent actionEvent) {
        if (this.DXq.isSelected()) {
            this.DXp.setSelected(false);
            this.DXo.setSelected(false);
            this.DXo.setEnabled(false);
        }
    }

    private void c() {
        this.DXn.addActionListener(new ActionListener(this){
            final /* synthetic */ mpx DXr;
            {
                this.DXr = mpx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpx.a(this.DXr);
            }
        });
        this.bQ = new mrq();
        this.bF.add((Component)this.bQ, "Center");
        this.bF.repaint();
        new Thread(new a(this, null)).start();
    }

    private void eIX() {
        kre kre2 = (kre)this.DEC.ii(4111);
        ArrayList<String> arrayList = lcn.emv();
        int[][] nArray = this.bQ.eLy();
        for (int i = 0; i < nArray.length; ++i) {
            for (int j = 0; j < nArray[i].length; ++j) {
                if (nArray[i][j] == 0) continue;
                String string = "terrain_" + lcw.f((lej)new lej(i, j)).toLowerCase();
                arrayList.add(string);
            }
        }
        String[] stringArray = new String[arrayList.size()];
        stringArray = arrayList.toArray(stringArray);
        kre2.M(stringArray);
        this.DEC.a((khd)kre2, null, null);
    }

    private synchronized void eIB() {
        Point point = this.bQ.eLz();
        if (point == null) {
            return;
        }
        List<mqm> list = this.bQ.eLA();
        mqm mqm2 = new mqm();
        mqm2.getDefaultSize().height = 10;
        mqm2.getDefaultSize().width = 10;
        mqm2.j(Color.cyan);
        mqm2.h(Color.cyan);
        mqm2.a(mqm.a.Eee);
        mqm2.h(point);
        list.clear();
        list.add(mqm2);
        this.bQ.m(null);
    }

    private void eID() {
        ArrayList<jrw> arrayList = lcn.emv();
        int[][] nArray = this.bQ.eLy();
        for (int i = 0; i < nArray.length; ++i) {
            for (int j = 0; j < nArray[i].length; ++j) {
                if (nArray[i][j] == 0) continue;
                jrw jrw2 = new jrw(lcw.qLb + "xml-files/objectspace/built_tiles/" + lcw.f((lej)new lej(i, j)).toLowerCase());
                if (jrw2.exists()) {
                    arrayList.add(jrw2);
                    continue;
                }
                jrw jrw3 = new jrw(lcw.qLb + "xml-files/objectspace/sea_tiles/" + lcw.f((lej)new lej(i, j)).toLowerCase());
                if (!jrw3.exists()) continue;
                arrayList.add(jrw3);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        con con2 = new con();
        con2.c(arrayList, false);
        con2.Az(!this.DXq.isSelected());
        con2.Ay(this.DXp.isSelected());
        con2.Ax(this.DXo.isSelected());
        gzw gzw2 = (gzw)this.DEC.d(4124);
        gzw2.on(lcr.qAE);
        gzw2.jvM = con2;
        this.DEC.a((dxq)gzw2);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mpx mpx2, ActionEvent actionEvent) {
        mpx2.bg(actionEvent);
    }

    static /* synthetic */ void b(mpx mpx2, ActionEvent actionEvent) {
        mpx2.h(actionEvent);
    }

    static /* synthetic */ void c(mpx mpx2, ActionEvent actionEvent) {
        mpx2.bh(actionEvent);
    }

    static /* synthetic */ void d(mpx mpx2, ActionEvent actionEvent) {
        mpx2.bj(actionEvent);
    }

    static /* synthetic */ void e(mpx mpx2, ActionEvent actionEvent) {
        mpx2.bi(actionEvent);
    }

    static /* synthetic */ void a(mpx mpx2) {
        mpx2.eIX();
    }

    static /* synthetic */ mrq b(mpx mpx2) {
        return mpx2.bQ;
    }

    static /* synthetic */ JTextField c(mpx mpx2) {
        return mpx2.DVD;
    }

    static /* synthetic */ JTextField d(mpx mpx2) {
        return mpx2.DVA;
    }

    static /* synthetic */ void e(mpx mpx2) {
        mpx2.eIB();
    }
}

