/*
 * Decompiled with CFR.
 */
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;

public class mxf
extends JInternalFrame {
    protected JButton EgQ;
    protected JLabel ESJ;
    protected JTextField ESK;
    protected JPanel DLe;
    protected JComboBox ESL;
    protected JLabel EuQ;
    protected JButton ESM;
    protected JButton ESN;
    protected JComboBox ESO;
    protected JLabel ESP;
    protected JButton ESQ;
    protected JComboBox ESR;
    protected JLabel ESS;
    protected JTabbedPane EST;
    protected JPanel ESU;
    protected JButton DFV;
    protected JComboBox ESV;
    protected JLabel Evd;
    protected JPanel Esb;
    protected JScrollPane ESW;
    protected JTable EQz;
    protected JComboBox ESX;
    protected JLabel EvJ;
    protected JComboBox ESY;
    protected JLabel ESZ;
    protected JScrollPane ETa;
    protected JTextPane ETb;
    protected JTextField ETc;
    protected JLabel ETd;
    protected JPanel ETe;
    protected JList ETf;
    protected JPanel ETg;
    protected JScrollPane ETh;
    protected JPanel ETi;
    protected JScrollPane ETj;
    protected JTextPane ETk;
    protected JScrollPane ETl;
    protected JTextPane ETm;
    protected JScrollPane ETn;
    protected JTextPane ETo;
    protected JPanel ETp;
    protected JComboBox ETq;
    protected JLabel EqI;
    protected JButton ETr;
    protected JPanel aa;
    protected JPanel bN;
    protected JPanel ac;
    protected JPanel ad;
    protected JPanel bAw;

    public mxf() {
        this.b();
    }

    private void b() {
        this.EST = new JTabbedPane();
        this.ESU = new JPanel();
        this.ac = new JPanel();
        this.ETn = new JScrollPane();
        this.ETo = new JTextPane();
        this.ad = new JPanel();
        this.ETl = new JScrollPane();
        this.ETm = new JTextPane();
        this.bAw = new JPanel();
        this.ETj = new JScrollPane();
        this.ETk = new JTextPane();
        this.ETi = new JPanel();
        this.ETg = new JPanel();
        this.DLe = new JPanel();
        this.ESQ = new JButton();
        this.ETr = new JButton();
        this.ESN = new JButton();
        this.ESM = new JButton();
        this.ETh = new JScrollPane();
        this.ETf = new JList();
        this.ETe = new JPanel();
        this.ESJ = new JLabel();
        this.Esb = new JPanel();
        this.ESW = new JScrollPane();
        this.EQz = new JTable();
        this.DFV = new JButton();
        this.EgQ = new JButton();
        this.ESK = new JTextField();
        this.ETp = new JPanel();
        this.EqI = new JLabel();
        this.ETq = new JComboBox();
        this.Evd = new JLabel();
        this.ESV = new JComboBox();
        this.EvJ = new JLabel();
        this.ESX = new JComboBox();
        this.ESS = new JLabel();
        this.ESR = new JComboBox();
        this.EuQ = new JLabel();
        this.ESL = new JComboBox();
        this.ETd = new JLabel();
        this.ESP = new JLabel();
        this.ESO = new JComboBox();
        this.ETc = new JTextField();
        this.aa = new JPanel();
        this.ETa = new JScrollPane();
        this.ETb = new JTextPane();
        this.bN = new JPanel();
        this.ESZ = new JLabel();
        this.ESY = new JComboBox();
        this.setClosable(true);
        this.setTitle("Trainer Task Editor");
        this.ESU.setLayout(new GridLayout(3, 0));
        this.ac.setLayout(new GridLayout(1, 0));
        this.ETo.setBorder(BorderFactory.createTitledBorder("Trainer Start Message"));
        this.ETn.setViewportView(this.ETo);
        this.ac.add(this.ETn);
        this.ESU.add(this.ac);
        this.ad.setLayout(new GridLayout(1, 0));
        this.ETm.setBorder(BorderFactory.createTitledBorder("Trainer End Message"));
        this.ETl.setViewportView(this.ETm);
        this.ad.add(this.ETl);
        this.ESU.add(this.ad);
        this.bAw.setLayout(new GridLayout(1, 0));
        this.ETk.setBorder(BorderFactory.createTitledBorder("Trainer Capital Message"));
        this.ETj.setViewportView(this.ETk);
        this.bAw.add(this.ETj);
        this.ESU.add(this.bAw);
        this.EST.addTab("Trainer Messages", this.ESU);
        this.ETg.setBorder(BorderFactory.createBevelBorder(0));
        this.ESQ.setText("Down");
        this.ETr.setText("Up");
        this.ESN.setText("Delete");
        this.ESM.setText("Create");
        GroupLayout groupLayout = new GroupLayout(this.DLe);
        this.DLe.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 279, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.ETr, -1, 50, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ESQ).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ESN).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ESM).addContainerGap())));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 38, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(4, 4, 4).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ETr).addComponent(this.ESQ).addComponent(this.ESN).addComponent(this.ESM)).addContainerGap(-1, Short.MAX_VALUE))));
        this.ETf.setSelectionMode(0);
        this.ETh.setViewportView(this.ETf);
        GroupLayout groupLayout2 = new GroupLayout(this.ETg);
        this.ETg.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addGap(6, 6, 6).addComponent(this.DLe, -1, -1, Short.MAX_VALUE).addContainerGap()).addComponent(this.ETh, -1, 295, Short.MAX_VALUE));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addComponent(this.ETh, -1, 698, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DLe, -2, -1, -2).addContainerGap()));
        this.ETe.setBorder(BorderFactory.createBevelBorder(0));
        this.ESJ.setText("BindStone :");
        this.Esb.setBorder(BorderFactory.createTitledBorder("Rewards"));
        this.EQz.setModel(new DefaultTableModel(this, new Object[0][], new String[]{"Resource Name", "Quantity", "ContainerName"}){
            Class[] Eoh;
            boolean[] Ego;
            final /* synthetic */ mxf ETs;
            {
                this.ETs = mxf2;
                super(objectArray, objectArray2);
                this.Eoh = new Class[]{String.class, Integer.class, String.class};
                this.Ego = new boolean[]{false, true, true};
            }

            public Class getColumnClass(int n) {
                return this.Eoh[n];
            }

            public boolean isCellEditable(int n, int n2) {
                return this.Ego[n2];
            }
        });
        this.EQz.getTableHeader().setReorderingAllowed(false);
        this.ESW.setViewportView(this.EQz);
        this.DFV.setText("Remove");
        this.EgQ.setText("Add");
        GroupLayout groupLayout3 = new GroupLayout(this.Esb);
        this.Esb.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.ESW, GroupLayout.Alignment.LEADING, -1, 538, Short.MAX_VALUE).addGroup(groupLayout3.createSequentialGroup().addComponent(this.EgQ).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DFV))).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addComponent(this.ESW, -1, 152, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DFV).addComponent(this.EgQ)).addContainerGap()));
        this.ESK.addActionListener(new ActionListener(this){
            final /* synthetic */ mxf ETs;
            {
                this.ETs = mxf2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mxf.a(this.ETs, actionEvent);
            }
        });
        this.ETp.setBorder(BorderFactory.createTitledBorder("Trigger"));
        this.EqI.setText("Type :");
        this.Evd.setText("Resource Name :");
        this.EvJ.setText("Skill name :");
        this.ESX.setModel(new DefaultComboBoxModel<String>(new String[]{"NONE"}));
        this.ESS.setText("Duration : ");
        this.ESR.setModel(new DefaultComboBoxModel<String>(new String[]{"true", "false"}));
        this.ESR.setSelectedIndex(1);
        this.EuQ.setText("Counter : ");
        this.ESL.setModel(new DefaultComboBoxModel<String>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
        this.ETd.setText("Sub Message :");
        this.ESP.setText("Delivery Name :");
        this.ESO.setModel(new DefaultComboBoxModel<String>(new String[]{"NONE"}));
        GroupLayout groupLayout4 = new GroupLayout(this.ETp);
        this.ETp.setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Evd).addComponent(this.EqI)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ESV, 0, 301, Short.MAX_VALUE).addComponent(this.ETq, 0, 301, Short.MAX_VALUE))).addGroup(groupLayout4.createSequentialGroup().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EvJ).addComponent(this.ESS).addComponent(this.EuQ).addComponent(this.ETd).addComponent(this.ESP)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ETc, -2, 301, -2).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ESO, 0, 301, Short.MAX_VALUE).addComponent(this.ESL, 0, 301, Short.MAX_VALUE).addComponent(this.ESR, 0, 301, Short.MAX_VALUE).addComponent(this.ESX, 0, 301, Short.MAX_VALUE))))).addGap(163, 163, 163)));
        groupLayout4.linkSize(0, this.EuQ, this.ESS, this.Evd, this.EvJ, this.ETd, this.EqI);
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.EqI).addComponent(this.ETq, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.Evd).addComponent(this.ESV, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.ESP).addComponent(this.ESO, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EvJ, GroupLayout.Alignment.TRAILING).addComponent(this.ESX, GroupLayout.Alignment.TRAILING, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ESS, GroupLayout.Alignment.TRAILING).addComponent(this.ESR, GroupLayout.Alignment.TRAILING, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EuQ, GroupLayout.Alignment.TRAILING).addComponent(this.ESL, GroupLayout.Alignment.TRAILING, -2, -1, -2)).addGap(9, 9, 9).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.ETd).addComponent(this.ETc, -2, -1, -2)).addGap(25, 25, 25)));
        groupLayout4.linkSize(1, this.EuQ, this.ESS, this.Evd, this.EvJ, this.ETd, this.EqI);
        this.aa.setBorder(BorderFactory.createTitledBorder("Start Message"));
        this.ETb.setFont(new Font("Arial", 0, 11));
        this.ETa.setViewportView(this.ETb);
        GroupLayout groupLayout5 = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout5);
        groupLayout5.setHorizontalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout5.createSequentialGroup().addContainerGap().addComponent(this.ETa, -1, 552, Short.MAX_VALUE).addContainerGap()));
        groupLayout5.setVerticalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addContainerGap().addComponent(this.ETa, -1, 139, Short.MAX_VALUE).addContainerGap()));
        this.ESZ.setText("Special Effect :");
        this.ESY.setModel(new DefaultComboBoxModel<String>(new String[]{"NONE"}));
        GroupLayout groupLayout6 = new GroupLayout(this.bN);
        this.bN.setLayout(groupLayout6);
        groupLayout6.setHorizontalGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout6.createSequentialGroup().addContainerGap().addComponent(this.ESZ).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ESY, 0, 480, Short.MAX_VALUE).addContainerGap()));
        groupLayout6.setVerticalGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout6.createSequentialGroup().addContainerGap().addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ESY, -2, -1, -2).addComponent(this.ESZ)).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout7 = new GroupLayout(this.ETe);
        this.ETe.setLayout(groupLayout7);
        groupLayout7.setHorizontalGroup(groupLayout7.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout7.createSequentialGroup().addComponent(this.aa, -1, -1, Short.MAX_VALUE).addGap(8, 8, 8)).addGroup(GroupLayout.Alignment.TRAILING, groupLayout7.createSequentialGroup().addComponent(this.bN, -1, -1, Short.MAX_VALUE).addContainerGap()).addGroup(groupLayout7.createSequentialGroup().addGap(7, 7, 7).addComponent(this.ESJ).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ESK, -2, 220, -2).addGap(283, 283, 283)).addGroup(groupLayout7.createSequentialGroup().addContainerGap().addComponent(this.ETp, -1, -1, Short.MAX_VALUE).addContainerGap()).addGroup(groupLayout7.createSequentialGroup().addContainerGap().addComponent(this.Esb, -1, -1, Short.MAX_VALUE).addGap(12, 12, 12)));
        groupLayout7.setVerticalGroup(groupLayout7.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout7.createSequentialGroup().addContainerGap().addGroup(groupLayout7.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ESK, -2, -1, -2).addComponent(this.ESJ)).addGap(11, 11, 11).addComponent(this.aa, -2, -1, -2).addGap(2, 2, 2).addComponent(this.bN, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ETp, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Esb, -1, -1, Short.MAX_VALUE).addContainerGap()));
        GroupLayout groupLayout8 = new GroupLayout(this.ETi);
        this.ETi.setLayout(groupLayout8);
        groupLayout8.setHorizontalGroup(groupLayout8.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout8.createSequentialGroup().addContainerGap().addComponent(this.ETg, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ETe, -2, -1, -2).addContainerGap(11, Short.MAX_VALUE)));
        groupLayout8.setVerticalGroup(groupLayout8.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout8.createSequentialGroup().addContainerGap().addGroup(groupLayout8.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.ETe, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addComponent(this.ETg, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        this.EST.addTab("Tasks", this.ETi);
        GroupLayout groupLayout9 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout9);
        groupLayout9.setHorizontalGroup(groupLayout9.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EST, -1, 927, Short.MAX_VALUE));
        groupLayout9.setVerticalGroup(groupLayout9.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout9.createSequentialGroup().addComponent(this.EST, -1, 812, Short.MAX_VALUE).addContainerGap()));
        this.pack();
    }

    private void dz(ActionEvent actionEvent) {
    }

    static /* synthetic */ void a(mxf mxf2, ActionEvent actionEvent) {
        mxf2.dz(actionEvent);
    }
}

