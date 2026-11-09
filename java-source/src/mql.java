/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class mql
extends JInternalFrame {
    private JTextField DVA;
    private JCheckBox EdP;
    private JCheckBox EdQ;
    private JCheckBox EdR;
    private JButton DVB;
    private JButton DIj;
    private JPanel bF;
    private JButton bI;
    private JTextField DVD;
    private JTextField EdS;
    private JLabel I;
    private JLabel P;
    private JPanel aa;
    private JPanel ac;
    private mrq bQ;
    private aux DEC;

    public mql() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.bF = new JPanel();
        this.ac = new JPanel();
        this.DIj = new JButton();
        this.bI = new JButton();
        this.DVB = new JButton();
        this.EdQ = new JCheckBox();
        this.EdS = new JTextField();
        this.P = new JLabel();
        this.EdP = new JCheckBox();
        this.EdR = new JCheckBox();
        this.DVD = new JTextField();
        this.I = new JLabel();
        this.DVA = new JTextField();
        this.setClosable(true);
        this.setIconifiable(true);
        this.setTitle("Make Minimap Setup Dialog");
        GroupLayout groupLayout = new GroupLayout((Container)this.bF);
        this.bF.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(0, 665, Short.MAX_VALUE));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(0, 526, Short.MAX_VALUE));
        this.DIj.setText("Save Minimap Generation Config");
        this.DIj.addActionListener(new ActionListener(this){
            final /* synthetic */ mql EdT;
            {
                this.EdT = mql2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mql.a(this.EdT, actionEvent);
            }
        });
        this.bI.setText("Select All");
        this.bI.addActionListener(new ActionListener(this){
            final /* synthetic */ mql EdT;
            {
                this.EdT = mql2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mql.b(this.EdT, actionEvent);
            }
        });
        this.DVB.setText("Clear All");
        this.DVB.addActionListener(new ActionListener(this){
            final /* synthetic */ mql EdT;
            {
                this.EdT = mql2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mql.c(this.EdT, actionEvent);
            }
        });
        this.EdQ.setText("Only Terrain");
        this.EdS.setText("768");
        this.P.setText("Size:");
        this.EdP.setText("LoadNeighbours");
        this.EdR.setText("Replace Water Shaders");
        GroupLayout groupLayout2 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.DIj).addPreferredGap(0, 320, Short.MAX_VALUE).add((Component)this.DVB).addPreferredGap(0).add((Component)this.bI)).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.EdQ).add(23, 23, 23).add((Component)this.P).addPreferredGap(1).add((Component)this.EdS, -2, 34, -2).addPreferredGap(1).add((Component)this.EdP).addPreferredGap(0).add((Component)this.EdR).addContainerGap(236, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap(11, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.EdQ).add((Component)this.EdS, -2, -1, -2).add((Component)this.P).add((Component)this.EdP).add((Component)this.EdR)).addPreferredGap(1).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.DIj).add((Component)this.bI).add((Component)this.DVB))));
        this.DVD.setEditable(false);
        this.I.setText("Selected Tile(s):");
        this.DVA.setEditable(false);
        GroupLayout groupLayout3 = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((Component)this.I).addPreferredGap(0).add((Component)this.DVD, -2, 333, -2).addPreferredGap(0, 151, Short.MAX_VALUE).add((Component)this.DVA, -2, 90, -2)).add(2, (Component)this.bF, -1, -1, Short.MAX_VALUE).add(2, (Component)this.ac, -1, -1, Short.MAX_VALUE));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout3.createSequentialGroup().add((GroupLayout.Group)groupLayout3.createParallelGroup(3).add((Component)this.I).add((Component)this.DVD, -2, -1, -2).add((Component)this.DVA, -2, -1, -2)).addPreferredGap(0).add((Component)this.bF, -1, -1, Short.MAX_VALUE).add(12, 12, 12).add((Component)this.ac, -2, -1, -2)));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        this.pack();
    }

    private void bh(ActionEvent actionEvent) {
        this.bQ.eLx();
    }

    private void h(ActionEvent actionEvent) {
        this.bQ.selectAll();
    }

    private void bg(ActionEvent actionEvent) {
        this.eJn();
    }

    private void c() {
        this.bQ = new mrq();
        this.bF.add((Component)this.bQ, "Center");
        this.bF.repaint();
        new Thread(new a(this, null)).start();
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

    private void eJn() {
        ArrayList<String> arrayList = lcn.emv();
        int[][] nArray = this.bQ.eLy();
        for (int i = 0; i < nArray.length; ++i) {
            for (int j = 0; j < nArray[i].length; ++j) {
                if (nArray[i][j] == 0) continue;
                String string = lcw.f((lej)new lej(i, j)).toLowerCase();
                arrayList.add(string);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        dy dy2 = new dy();
        dy2.MinimapsToGenerate = arrayList.toArray(new String[arrayList.size()]);
        dy2.OnlyTerrain = this.EdQ.isSelected();
        dy2.Size = Integer.parseInt(this.EdS.getText());
        dy2.LoadNeighbours = this.EdP.isSelected();
        dy2.ReplaceWaterShaders = this.EdR.isSelected();
        try {
            mze.a(dy2);
        }
        catch (bg bg2) {
            bg2.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error setting up minimap generating. Check log!", "Setup error.", 0);
            return;
        }
        JOptionPane.showMessageDialog(this, "Setup ready to generate [" + arrayList.size() + "] minimaps", "Setup finished.", 1);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mql mql2, ActionEvent actionEvent) {
        mql2.bg(actionEvent);
    }

    static /* synthetic */ void b(mql mql2, ActionEvent actionEvent) {
        mql2.h(actionEvent);
    }

    static /* synthetic */ void c(mql mql2, ActionEvent actionEvent) {
        mql2.bh(actionEvent);
    }

    static /* synthetic */ mrq a(mql mql2) {
        return mql2.bQ;
    }

    static /* synthetic */ JTextField b(mql mql2) {
        return mql2.DVD;
    }

    static /* synthetic */ JTextField c(mql mql2) {
        return mql2.DVA;
    }

    static /* synthetic */ void d(mql mql2) {
        mql2.eIB();
    }
}

