/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class msc
extends JInternalFrame
implements mrp {
    private JTextField DVA;
    private JButton EpA;
    private JComboBox EpB;
    private JComboBox EpC;
    private JButton DON;
    private JButton DEp;
    private JPanel bF;
    private JList EpD;
    private JList EpE;
    private JButton EpF;
    private JButton DNZ;
    private JTextField DVD;
    private JList EpG;
    private JList EpH;
    private JLabel I;
    private JLabel P;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JPanel ad;
    private JPanel bAw;
    private JPanel ae;
    private JPanel af;
    private JScrollPane ah;
    private JScrollPane ai;
    private JScrollPane aj;
    private JScrollPane ak;
    private mrq bQ;
    private aux DEC;
    private Map<String, dqt> EpI = lcn.emw();
    private String EpJ;
    private boolean EpK = false;
    private DefaultListModel EpL;
    private DefaultListModel EpM;
    private DefaultListModel EpN;
    private DefaultListModel EpO;

    public msc(boolean bl) {
        this.EpK = bl;
        this.b();
        this.c();
    }

    public msc() {
        this.b();
        this.c();
    }

    private void b() {
        this.I = new JLabel();
        this.DVD = new JTextField();
        this.DVA = new JTextField();
        this.bF = new JPanel();
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.EpG = new JList();
        this.bN = new JPanel();
        this.DEp = new JButton();
        this.DNZ = new JButton();
        this.DON = new JButton();
        this.ac = new JPanel();
        this.EpC = new JComboBox();
        this.EpA = new JButton();
        this.EpF = new JButton();
        this.ad = new JPanel();
        this.ai = new JScrollPane();
        this.EpD = new JList();
        this.bAw = new JPanel();
        this.aj = new JScrollPane();
        this.EpH = new JList();
        this.ae = new JPanel();
        this.ak = new JScrollPane();
        this.EpE = new JList();
        this.af = new JPanel();
        this.P = new JLabel();
        this.EpB = new JComboBox();
        this.setClosable(true);
        this.setTitle("Music Distributor Dialog");
        this.I.setText("Selected Tile(s):");
        this.DVD.setEditable(false);
        this.DVA.setEditable(false);
        GroupLayout groupLayout = new GroupLayout(this.bF);
        this.bF.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 584, Short.MAX_VALUE));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 520, Short.MAX_VALUE));
        this.aa.setBorder(BorderFactory.createTitledBorder("Sunrise"));
        this.EpG.addListSelectionListener(new ListSelectionListener(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                msc.a(this.EpP, listSelectionEvent);
            }
        });
        this.EpG.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                msc.a(this.EpP, keyEvent);
            }
        });
        this.ah.setViewportView(this.EpG);
        GroupLayout groupLayout2 = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.ah, -1, 260, Short.MAX_VALUE).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(this.ah, -2, 84, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.DEp.setText("Load");
        this.DEp.addActionListener(new ActionListener(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msc.a(this.EpP, actionEvent);
            }
        });
        this.DNZ.setText("Save");
        this.DNZ.addActionListener(new ActionListener(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msc.b(this.EpP, actionEvent);
            }
        });
        this.DON.setText("Clear");
        this.DON.addActionListener(new ActionListener(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msc.c(this.EpP, actionEvent);
            }
        });
        GroupLayout groupLayout3 = new GroupLayout(this.bN);
        this.bN.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addComponent(this.DEp).addGap(18, 18, 18).addComponent(this.DNZ).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE).addComponent(this.DON).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DEp).addComponent(this.DNZ).addComponent(this.DON))));
        this.ac.setBorder(BorderFactory.createTitledBorder("Area"));
        this.EpC.setModel(new DefaultComboBoxModel<String>(new String[]{"Ork Starting Area", "Human Starting Area"}));
        this.EpC.addActionListener(new ActionListener(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msc.d(this.EpP, actionEvent);
            }
        });
        this.EpA.setText("Add");
        this.EpA.addActionListener(new ActionListener(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msc.e(this.EpP, actionEvent);
            }
        });
        this.EpF.setText("Remove");
        this.EpF.addActionListener(new ActionListener(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msc.f(this.EpP, actionEvent);
            }
        });
        GroupLayout groupLayout4 = new GroupLayout(this.ac);
        this.ac.setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EpC, GroupLayout.Alignment.TRAILING, 0, 270, Short.MAX_VALUE).addGroup(groupLayout4.createSequentialGroup().addComponent(this.EpA).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.EpF).addContainerGap(138, Short.MAX_VALUE)))));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addComponent(this.EpC, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EpA).addComponent(this.EpF)).addContainerGap(-1, Short.MAX_VALUE)));
        this.ad.setBorder(BorderFactory.createTitledBorder("Mid-day"));
        this.EpD.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.EpD.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                msc.b(this.EpP, keyEvent);
            }
        });
        this.ai.setViewportView(this.EpD);
        GroupLayout groupLayout5 = new GroupLayout(this.ad);
        this.ad.setLayout(groupLayout5);
        groupLayout5.setHorizontalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addContainerGap().addComponent(this.ai, -1, 260, Short.MAX_VALUE).addContainerGap()));
        groupLayout5.setVerticalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addComponent(this.ai, -2, 90, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.bAw.setBorder(BorderFactory.createTitledBorder("Sunset"));
        this.EpH.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.EpH.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                msc.c(this.EpP, keyEvent);
            }
        });
        this.aj.setViewportView(this.EpH);
        GroupLayout groupLayout6 = new GroupLayout(this.bAw);
        this.bAw.setLayout(groupLayout6);
        groupLayout6.setHorizontalGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout6.createSequentialGroup().addContainerGap().addComponent(this.aj, -1, 260, Short.MAX_VALUE).addContainerGap()));
        groupLayout6.setVerticalGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout6.createSequentialGroup().addComponent(this.aj, -2, 88, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.ae.setBorder(BorderFactory.createTitledBorder("Midnight"));
        this.EpE.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.EpE.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                msc.d(this.EpP, keyEvent);
            }
        });
        this.ak.setViewportView(this.EpE);
        GroupLayout groupLayout7 = new GroupLayout(this.ae);
        this.ae.setLayout(groupLayout7);
        groupLayout7.setHorizontalGroup(groupLayout7.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout7.createSequentialGroup().addContainerGap().addComponent(this.ak, -1, 260, Short.MAX_VALUE).addContainerGap()));
        groupLayout7.setVerticalGroup(groupLayout7.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout7.createSequentialGroup().addComponent(this.ak, -2, 90, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.P.setText("Random effect:");
        this.EpB.setModel(new DefaultComboBoxModel<String>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        this.EpB.addActionListener(new ActionListener(this){
            final /* synthetic */ msc EpP;
            {
                this.EpP = msc2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msc.g(this.EpP, actionEvent);
            }
        });
        GroupLayout groupLayout8 = new GroupLayout(this.af);
        this.af.setLayout(groupLayout8);
        groupLayout8.setHorizontalGroup(groupLayout8.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout8.createSequentialGroup().addContainerGap().addComponent(this.P).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.EpB, -2, -1, -2).addContainerGap(433, Short.MAX_VALUE)));
        groupLayout8.setVerticalGroup(groupLayout8.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout8.createSequentialGroup().addContainerGap().addGroup(groupLayout8.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.EpB, -2, -1, -2)).addContainerGap(69, Short.MAX_VALUE)));
        GroupLayout groupLayout9 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout9);
        groupLayout9.setHorizontalGroup(groupLayout9.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout9.createSequentialGroup().addContainerGap().addGroup(groupLayout9.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout9.createSequentialGroup().addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DVD, -1, 428, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DVA, -2, 90, -2)).addComponent(this.bN, -1, -1, Short.MAX_VALUE).addGroup(groupLayout9.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.af, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addComponent(this.bF, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE))).addGap(10, 10, 10).addGroup(groupLayout9.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.ae, -1, -1, Short.MAX_VALUE).addComponent(this.bAw, -1, -1, Short.MAX_VALUE).addComponent(this.ad, -1, -1, Short.MAX_VALUE).addComponent(this.aa, -1, -1, Short.MAX_VALUE).addComponent(this.ac, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout9.setVerticalGroup(groupLayout9.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout9.createSequentialGroup().addContainerGap().addGroup(groupLayout9.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, groupLayout9.createSequentialGroup().addComponent(this.ac, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.aa, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ad, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bAw, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ae, -2, -1, -2)).addGroup(groupLayout9.createSequentialGroup().addGroup(groupLayout9.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.DVD, -2, -1, -2).addComponent(this.DVA, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.bF, -2, -1, -2).addGap(18, 18, 18).addComponent(this.af, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE).addComponent(this.bN, -2, -1, -2))).addContainerGap()));
        this.pack();
    }

    private void aj(ActionEvent actionEvent) {
        this.bCJ();
    }

    private void cf(ActionEvent actionEvent) {
        this.bQ.eLx();
    }

    private void aB(ActionEvent actionEvent) {
        this.eNj();
    }

    private void cg(ActionEvent actionEvent) {
        this.De((String)this.EpC.getSelectedItem());
    }

    private void b(ListSelectionEvent listSelectionEvent) {
    }

    private void ch(ActionEvent actionEvent) {
        this.eNh();
    }

    private void ci(ActionEvent actionEvent) {
        this.eNi();
    }

    private void f(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 127) {
            return;
        }
        String string = (String)this.EpG.getSelectedValue();
        if (string == null) {
            return;
        }
        this.a(this.EpL, string);
    }

    private void g(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 127) {
            return;
        }
        String string = (String)this.EpD.getSelectedValue();
        if (string == null) {
            return;
        }
        this.a(this.EpM, string);
    }

    private void h(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 127) {
            return;
        }
        String string = (String)this.EpH.getSelectedValue();
        if (string == null) {
            return;
        }
        this.a(this.EpN, string);
    }

    private void i(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 127) {
            return;
        }
        String string = (String)this.EpE.getSelectedValue();
        if (string == null) {
            return;
        }
        this.a(this.EpO, string);
    }

    private void cj(ActionEvent actionEvent) {
        this.eNg();
    }

    private void c() {
        this.bQ = new mrq();
        this.bF.add((Component)this.bQ, "Center");
        this.bF.repaint();
        this.bQ.zS(false);
        this.bQ.a(this);
        new Thread(new b(this, null)).start();
        this.EpL = new DefaultListModel();
        this.EpG.setDropMode(DropMode.INSERT);
        this.EpG.setTransferHandler(new a(this, this.EpL));
        this.EpG.setModel(this.EpL);
        this.EpM = new DefaultListModel();
        this.EpD.setDropMode(DropMode.INSERT);
        this.EpD.setTransferHandler(new a(this, this.EpM));
        this.EpD.setModel(this.EpM);
        this.EpN = new DefaultListModel();
        this.EpH.setDropMode(DropMode.INSERT);
        this.EpH.setTransferHandler(new a(this, this.EpN));
        this.EpH.setModel(this.EpN);
        this.EpO = new DefaultListModel();
        this.EpE.setDropMode(DropMode.INSERT);
        this.EpE.setTransferHandler(new a(this, this.EpO));
        this.EpE.setModel(this.EpO);
        if (this.EpK) {
            this.setTitle("Weather");
            this.EpB.setModel(new DefaultComboBoxModel<ber.a>(ber.a.values()));
        } else {
            this.setTitle("Music");
            this.EpB.setEnabled(false);
        }
        this.bCJ();
    }

    private void eNg() {
    }

    private void a(DefaultListModel defaultListModel, String string) {
        if (string == null) {
            return;
        }
        int n = JOptionPane.showConfirmDialog(this, "Remove '" + string + "' ?", "Remove", 0);
        if (n != 0) {
            return;
        }
        if (this.EpJ == null) {
            return;
        }
        boolean bl = defaultListModel.removeElement(string);
        if (!bl) {
            // empty if block
        }
    }

    private void eNh() {
        int n;
        String string = JOptionPane.showInputDialog(this, (Object)"Enter name for area:");
        if (string == null || string.isEmpty()) {
            return;
        }
        dqt dqt2 = this.EpI.get(string);
        if (dqt2 != null && (n = JOptionPane.showConfirmDialog(this, "'" + string + "' exists. Overwrite?")) == 0) {
            return;
        }
        dqt dqt3 = new dqt();
        dqt3.dfG = lcn.emv();
        dqt3.dfH = lcn.emv();
        dqt3.dfI = lcn.emv();
        dqt3.dfJ = lcn.emv();
        dqt3.gPA = lcn.emv();
        dqt3.Name = string;
        this.EpI.put(dqt3.Name, dqt3);
        this.EpC.setModel(new DefaultComboBoxModel<Object>(this.EpI.keySet().toArray()));
        this.EpC.setSelectedItem(dqt3.Name);
    }

    private void eNi() {
        String string = (String)this.EpC.getSelectedItem();
        if (string == null) {
            return;
        }
        int n = JOptionPane.showConfirmDialog(this, "Remove Area '" + string + "' ?");
        if (n != 0) {
            return;
        }
        this.EpI.remove(string);
        this.EpC.setModel(new DefaultComboBoxModel<Object>(this.EpI.keySet().toArray()));
        if (!this.EpI.isEmpty()) {
            this.EpC.setSelectedIndex(0);
        }
    }

    private void De(String string) {
        dqt dqt2;
        if (string == null) {
            return;
        }
        if (this.EpJ != null && (dqt2 = this.EpI.get(this.EpJ)) != null) {
            this.b(dqt2);
        }
        this.bQ.eLx();
        this.bQ.zS(true);
        dqt2 = this.EpI.get(string);
        if (dqt2 == null) {
            return;
        }
        this.a(dqt2);
        this.EpJ = string;
    }

    private void eNj() {
        Object object;
        if (this.EpJ != null && (object = this.EpI.get(this.EpJ)) != null) {
            this.b((dqt)object);
        }
        object = new jyq();
        ArrayList<dqt> arrayList = new ArrayList<dqt>(this.EpI.values());
        if (this.EpK) {
            ((jyq)object).bS(arrayList);
        } else {
            ((jyq)object).bR(arrayList);
        }
    }

    private void bCJ() {
        this.EpI.clear();
        jwn jwn2 = new jwn();
        List<dqt> list = null;
        list = this.EpK ? jwn2.dUp() : jwn2.dUq();
        for (dqt dqt2 : list) {
            this.EpI.put(dqt2.Name, dqt2);
        }
        this.EpC.setModel(new DefaultComboBoxModel<Object>(this.EpI.keySet().toArray()));
        if (this.EpI.isEmpty()) {
            return;
        }
        this.EpC.setSelectedIndex(0);
        dqt dqt3 = this.EpI.get(this.EpC.getItemAt(0));
        assert (dqt3 != null);
    }

    public void a(dqt dqt2) {
        assert (dqt2 != null);
        assert (this.bQ != null);
        this.EpL.clear();
        for (dqy object2 : dqt2.dfG) {
            this.EpL.addElement(object2.FileName);
        }
        this.EpM.clear();
        for (dqy dqy2 : dqt2.dfH) {
            this.EpM.addElement(dqy2.FileName);
        }
        this.EpN.clear();
        for (dqy dqy3 : dqt2.dfI) {
            this.EpN.addElement(dqy3.FileName);
        }
        this.EpO.clear();
        for (dqy dqy4 : dqt2.dfJ) {
            this.EpO.addElement(dqy4.FileName);
        }
        if (this.EpK) {
            this.EpB.setSelectedIndex(dqt2.gPz);
        }
        Object object3 = this.bQ.eLy();
        List<String> list = dqt2.gPA;
        try {
            for (String string : list) {
                ljq ljq2;
                int n = (string = string.toLowerCase()).lastIndexOf(".lvl");
                if (n != -1) {
                    string = string.substring(0, n);
                }
                if ((ljq2 = lcw.zh((String)string)) == null) {
                    return;
                }
                lej lej2 = lcw.dW((ljq)ljq2);
                object3[lej2.getX()][lej2.getY() - 1] = true;
            }
            this.bQ.repaint();
        }
        catch (NumberFormatException numberFormatException) {
            Thread.dumpStack();
        }
    }

    public void b(dqt dqt2) {
        int n;
        int n2;
        assert (dqt2 != null);
        assert (this.bQ != null);
        List<dqy> list = dqt2.dfG;
        list.clear();
        int n3 = this.EpL.getSize();
        for (n2 = 0; n2 < n3; ++n2) {
            list.add(new dqy((String)this.EpL.getElementAt(n2)));
        }
        list = dqt2.dfH;
        list.clear();
        n3 = this.EpM.getSize();
        for (n2 = 0; n2 < n3; ++n2) {
            list.add(new dqy((String)this.EpM.getElementAt(n2)));
        }
        list = dqt2.dfI;
        list.clear();
        n3 = this.EpN.getSize();
        for (n2 = 0; n2 < n3; ++n2) {
            list.add(new dqy((String)this.EpN.getElementAt(n2)));
        }
        list = dqt2.dfJ;
        list.clear();
        n3 = this.EpO.getSize();
        for (n2 = 0; n2 < n3; ++n2) {
            list.add(new dqy((String)this.EpO.getElementAt(n2)));
        }
        if (this.EpK && (n = this.EpB.getSelectedIndex()) != -1) {
            dqt2.gPz = n;
        }
        List<String> list2 = dqt2.gPA;
        list2.clear();
        int[][] nArray = this.bQ.eLy();
        for (n3 = 0; n3 < nArray.length; ++n3) {
            for (int i = 0; i < nArray[n3].length; ++i) {
                lej lej2;
                String string;
                int n4 = nArray[n3][i];
                if (n4 == 0 || (string = lcw.f((lej)(lej2 = new lej(n3, i)))) == null) continue;
                list2.add(string);
            }
        }
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

    @Override
    public boolean gu(int n, int n2) {
        if (this.EpJ == null) {
            return true;
        }
        lej lej2 = new lej(n, n2);
        String string = lcw.f((lej)lej2);
        for (String string2 : this.EpI.keySet()) {
            if (string2.equals(this.EpJ)) continue;
            dqt dqt2 = this.EpI.get(string2);
            if (!dqt2.gPA.contains(string)) continue;
            return false;
        }
        return true;
    }

    public aux eDR() {
        return this.DEC;
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(msc msc2, ListSelectionEvent listSelectionEvent) {
        msc2.b(listSelectionEvent);
    }

    static /* synthetic */ void a(msc msc2, KeyEvent keyEvent) {
        msc2.f(keyEvent);
    }

    static /* synthetic */ void a(msc msc2, ActionEvent actionEvent) {
        msc2.aj(actionEvent);
    }

    static /* synthetic */ void b(msc msc2, ActionEvent actionEvent) {
        msc2.aB(actionEvent);
    }

    static /* synthetic */ void c(msc msc2, ActionEvent actionEvent) {
        msc2.cf(actionEvent);
    }

    static /* synthetic */ void d(msc msc2, ActionEvent actionEvent) {
        msc2.cg(actionEvent);
    }

    static /* synthetic */ void e(msc msc2, ActionEvent actionEvent) {
        msc2.ch(actionEvent);
    }

    static /* synthetic */ void f(msc msc2, ActionEvent actionEvent) {
        msc2.ci(actionEvent);
    }

    static /* synthetic */ void b(msc msc2, KeyEvent keyEvent) {
        msc2.g(keyEvent);
    }

    static /* synthetic */ void c(msc msc2, KeyEvent keyEvent) {
        msc2.h(keyEvent);
    }

    static /* synthetic */ void d(msc msc2, KeyEvent keyEvent) {
        msc2.i(keyEvent);
    }

    static /* synthetic */ void g(msc msc2, ActionEvent actionEvent) {
        msc2.cj(actionEvent);
    }

    static /* synthetic */ mrq a(msc msc2) {
        return msc2.bQ;
    }

    static /* synthetic */ JTextField b(msc msc2) {
        return msc2.DVD;
    }

    static /* synthetic */ JTextField c(msc msc2) {
        return msc2.DVA;
    }

    static /* synthetic */ void d(msc msc2) {
        msc2.eIB();
    }
}

