/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  com.l2fprod.common.swing.JTaskPane
 *  com.l2fprod.common.swing.JTaskPaneGroup
 *  lcw
 */
import com.l2fprod.common.swing.JTaskPane;
import com.l2fprod.common.swing.JTaskPaneGroup;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class mtr
extends mkx {
    private static final String EBk = lcw.qLb + "xml-files/gamelogicinfo/" + "missileinfolist.xml";
    private aux DEC = null;
    private final Dimension DDN = new Dimension(800, 600);
    private JPanel Eqh = new JPanel(new BorderLayout());
    private JPanel Eyc = new JPanel(new BorderLayout());
    private JScrollPane Eyd = new JScrollPane();
    private Vector<String> EBl = new Vector();
    private JList EBm = new JList<String>(this.EBl);
    private JPanel Eyg = new JPanel(new FlowLayout());
    private JButton DFU = new JButton("Add");
    private JButton DFV = new JButton("Remove");
    private JPanel EBn = new JPanel(new GridLayout(2, 1));
    private JScrollPane Eqj = new JScrollPane();
    private JTaskPane Eqk = new JTaskPane();
    private JTaskPaneGroup EBo = new JTaskPaneGroup();
    private JPanel EgT = new JPanel(new BorderLayout());
    private JLabel EBp = new JLabel("Resource Name");
    private JTextField EBq = new JTextField();
    private JButton f = new JButton("Change Resource Name");
    private JPanel ErA = new JPanel(new BorderLayout());
    private JLabel ErB = new JLabel("Skill Type");
    private JTextField ErC = new JTextField();
    private JButton ErD = new JButton("Add Skill");
    private JPanel EBr = new JPanel(new BorderLayout());
    private JLabel EBs = new JLabel("Line Length");
    private JSlider EBt = new JSlider(1, 1000);
    private JFormattedTextField EBu = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel ErE = new JPanel(new GridLayout(1, 2));
    private JPanel EBv = new JPanel(new BorderLayout());
    private JCheckBox EBw = new JCheckBox("Rotate Object", false);
    private JPanel EBx = new JPanel(new BorderLayout());
    private JCheckBox EBy = new JCheckBox("Use Auto Timer", false);
    private JPanel EBz = new JPanel(new BorderLayout());
    private JCheckBox EBA = new JCheckBox("Stop On Hitting Something", true);
    private JPanel EBB = new JPanel(new BorderLayout());
    private JLabel EBC = new JLabel("Per Second");
    private JSlider EBD = new JSlider(0, 1000);
    private JFormattedTextField EBE = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel EBF = new JPanel(new BorderLayout());
    private JLabel EBG = new JLabel("Mass");
    private JSlider EBH = new JSlider(0, 1000);
    private JFormattedTextField EBI = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel EBJ = new JPanel(new BorderLayout());
    private JLabel EBK = new JLabel("Start Velocity");
    private JSlider EBL = new JSlider(0, 5000);
    private JFormattedTextField EBM = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel EBN = new JPanel(new BorderLayout());
    private JLabel EBO = new JLabel("Max Velocity");
    private JSlider EBP = new JSlider(0, 10000);
    private JFormattedTextField EBQ = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel EBR = new JPanel(new BorderLayout());
    private JLabel EBS = new JLabel("Max Distance Travel");
    private JSlider EBT = new JSlider(0, 10000);
    private JFormattedTextField EBU = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel EBV = new JPanel(new BorderLayout());
    private JScrollPane EBW = new JScrollPane();
    private JTaskPane EBX = new JTaskPane();
    private JTaskPaneGroup EBY = new JTaskPaneGroup();
    private JPanel EBZ = new JPanel(new FlowLayout());
    private JButton ECa = new JButton("Add Special Effect");
    private Map gmH = lea.eoc();
    private Vector Eza = new Vector();
    private JPanel Ezo = new JPanel(new FlowLayout(2));
    private JButton DNZ = new JButton("Save Missile Info List SFFile");
    private JTree Eix;
    private DefaultMutableTreeNode EiD;
    private JTree EtR;
    private DefaultMutableTreeNode ECb;
    private Map ECc = lea.eoj();
    private bwo ECd = null;
    private List ECe = lcn.emv();
    private List ECf = lcn.emv();
    private kbr ECg = new kbr();

    public void p(aux aux2) {
        this.DEC = aux2;
        this.DEC.getAlignmentY();
    }

    public mtr() {
        super(false);
        this.eOS();
        this.eOl();
        this.setTitle("Missile Info Editor");
        this.setClosable(true);
        this.setSize(this.DDN);
        this.r();
        this.eNv();
    }

    private void r() {
        Dimension dimension = new Dimension(70, 30);
        Dimension dimension2 = new Dimension(60, 30);
        this.Eqh.setOpaque(false);
        this.Eqh.add((Component)this.Eyc, "West");
        this.Eyc.setOpaque(false);
        this.Eyc.setBorder(BorderFactory.createTitledBorder("Missile Info"));
        this.Eyc.add((Component)this.Eyd, "Center");
        this.Eyc.add((Component)this.Eyg, "South");
        this.Eyd.getViewport().add(this.EBm);
        this.Eyd.setOpaque(false);
        this.EBm.setListData(this.EBl);
        this.Eyg.setOpaque(false);
        this.Eyg.add(this.DFU);
        this.Eyg.add(this.DFV);
        this.Eqh.add((Component)this.EBn, "Center");
        this.EBn.setOpaque(false);
        this.EBn.add(this.Eqj);
        this.EBn.add(this.EBV);
        this.EBn.setBorder(BorderFactory.createTitledBorder(""));
        this.Eqj.setOpaque(false);
        this.Eqj.getViewport().add((Component)this.Eqk);
        this.Eqk.add(this.EBo);
        this.EBo.setTitle("Missile Attributes");
        this.EBo.add((Component)this.EgT);
        this.EgT.setOpaque(false);
        this.EgT.add((Component)this.EBp, "West");
        this.EBp.setOpaque(false);
        this.EBp.setPreferredSize(dimension);
        this.EgT.add((Component)this.EBq, "Center");
        this.EgT.add((Component)this.f, "East");
        this.EBo.add((Component)this.ErA);
        this.ErA.setOpaque(false);
        this.ErA.add((Component)this.ErB, "West");
        this.ErB.setOpaque(false);
        this.ErB.setPreferredSize(dimension);
        this.ErA.add((Component)this.ErC, "Center");
        this.ErA.add((Component)this.ErD, "East");
        this.EBo.add((Component)this.ErE);
        this.ErE.setOpaque(false);
        this.ErE.add(this.EBv);
        this.EBv.setOpaque(false);
        this.EBv.add((Component)this.EBw, "Center");
        this.EBw.setOpaque(false);
        this.EBw.setHorizontalTextPosition(2);
        this.ErE.add(this.EBx);
        this.EBx.add((Component)this.EBy, "Center");
        this.EBx.setOpaque(false);
        this.EBy.setOpaque(false);
        this.EBy.setHorizontalTextPosition(2);
        this.ErE.add(this.EBz);
        this.EBz.add((Component)this.EBA, "Center");
        this.EBz.setOpaque(false);
        this.EBA.setOpaque(false);
        this.EBA.setHorizontalTextPosition(2);
        this.EBo.add((Component)this.EBr);
        this.EBr.setOpaque(false);
        this.EBr.add((Component)this.EBs, "West");
        this.EBs.setOpaque(false);
        this.EBs.setPreferredSize(dimension);
        this.EBr.add((Component)this.EBt, "Center");
        this.EBt.setOpaque(false);
        this.EBt.setValue(1);
        this.EBr.add((Component)this.EBu, "East");
        this.EBu.setText("0.0");
        this.EBu.setPreferredSize(dimension2);
        this.EBo.add((Component)this.EBB);
        this.EBB.setOpaque(false);
        this.EBB.add((Component)this.EBC, "West");
        this.EBC.setOpaque(false);
        this.EBC.setPreferredSize(dimension);
        this.EBB.add((Component)this.EBD, "Center");
        this.EBD.setOpaque(false);
        this.EBD.setValue(0);
        this.EBB.add((Component)this.EBE, "East");
        this.EBE.setPreferredSize(dimension2);
        this.EBE.setText("0.0");
        this.EBo.add((Component)this.EBF);
        this.EBF.setOpaque(false);
        this.EBF.add((Component)this.EBG, "West");
        this.EBG.setOpaque(false);
        this.EBG.setPreferredSize(dimension);
        this.EBF.add((Component)this.EBH, "Center");
        this.EBH.setOpaque(false);
        this.EBH.setValue(0);
        this.EBF.add((Component)this.EBI, "East");
        this.EBI.setPreferredSize(dimension2);
        this.EBI.setText("0.0");
        this.EBo.add((Component)this.EBJ);
        this.EBJ.setOpaque(false);
        this.EBJ.add((Component)this.EBK, "West");
        this.EBK.setOpaque(false);
        this.EBK.setPreferredSize(dimension);
        this.EBJ.add((Component)this.EBL, "Center");
        this.EBL.setOpaque(false);
        this.EBL.setValue(0);
        this.EBJ.add((Component)this.EBM, "East");
        this.EBM.setPreferredSize(dimension2);
        this.EBM.setText("0.0");
        this.EBo.add((Component)this.EBN);
        this.EBN.setOpaque(false);
        this.EBN.add((Component)this.EBO, "West");
        this.EBO.setOpaque(false);
        this.EBO.setPreferredSize(dimension);
        this.EBN.add((Component)this.EBP, "Center");
        this.EBP.setOpaque(false);
        this.EBP.setValue(0);
        this.EBN.add((Component)this.EBQ, "East");
        this.EBQ.setPreferredSize(dimension2);
        this.EBQ.setText("0.0");
        this.EBo.add((Component)this.EBR);
        this.EBR.setOpaque(false);
        this.EBR.add((Component)this.EBS, "West");
        this.EBS.setOpaque(false);
        this.EBS.setPreferredSize(dimension);
        this.EBR.add((Component)this.EBT, "Center");
        this.EBT.setOpaque(false);
        this.EBT.setValue(0);
        this.EBR.add((Component)this.EBU, "East");
        this.EBU.setPreferredSize(dimension2);
        this.EBU.setText("0.0");
        this.EBV.setOpaque(false);
        this.EBV.add((Component)this.EBW, "Center");
        this.EBW.setOpaque(false);
        this.EBW.getViewport().add((Component)this.EBX);
        this.EBX.add(this.EBY);
        this.EBY.setTitle("Special Effects");
        this.EBV.add((Component)this.EBZ, "South");
        this.EBZ.add(this.ECa);
        this.EBZ.setBackground(this.EBY.getBackground());
        this.Eqh.add((Component)this.Ezo, "South");
        this.Ezo.setOpaque(false);
        this.Ezo.add(this.DNZ);
        this.DGa.add(this.Eqh);
    }

    private void eNv() {
        this.EBt.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtr.a(this.ECh).getValue();
                float f2 = (float)n / 10.0f;
                mtr.b(this.ECh).setText(String.valueOf(f2));
            }
        });
        this.EBu.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void focusLost(FocusEvent focusEvent) {
                if (mtr.c(this.ECh) != null) {
                    try {
                        String string = mtr.b(this.ECh).getText();
                        float f2 = Float.parseFloat(string);
                        int n = (int)(f2 * 10.0f);
                        if (n > mtr.a(this.ECh).getMaximum()) {
                            n = mtr.a(this.ECh).getMaximum();
                            mtr.b(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        } else if (n < mtr.a(this.ECh).getMinimum()) {
                            n = mtr.a(this.ECh).getMinimum();
                            mtr.b(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        }
                        mtr.a(this.ECh).setValue(n);
                    }
                    catch (Exception exception) {}
                } else {
                    JOptionPane.showInternalMessageDialog(mtr.d(this.ECh), "Select A Missile Info Item First");
                }
            }
        });
        this.EBD.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtr.e(this.ECh).getValue();
                float f2 = (float)n / 10.0f;
                mtr.f(this.ECh).setText(String.valueOf(f2));
            }
        });
        this.EBE.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void focusLost(FocusEvent focusEvent) {
                if (mtr.c(this.ECh) != null) {
                    try {
                        String string = mtr.f(this.ECh).getText();
                        float f2 = Float.parseFloat(string);
                        int n = (int)(f2 * 10.0f);
                        if (n > mtr.e(this.ECh).getMaximum()) {
                            n = mtr.e(this.ECh).getMaximum();
                            mtr.f(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        } else if (n < mtr.e(this.ECh).getMinimum()) {
                            n = mtr.e(this.ECh).getMinimum();
                            mtr.f(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        }
                        mtr.e(this.ECh).setValue(n);
                    }
                    catch (Exception exception) {}
                } else {
                    JOptionPane.showInternalMessageDialog(mtr.d(this.ECh), "Select A Missile Info Item First");
                }
            }
        });
        this.EBH.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtr.g(this.ECh).getValue();
                float f2 = (float)n / 10.0f;
                mtr.h(this.ECh).setText(String.valueOf(f2));
            }
        });
        this.EBI.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void focusLost(FocusEvent focusEvent) {
                if (mtr.c(this.ECh) != null) {
                    try {
                        String string = mtr.h(this.ECh).getText();
                        float f2 = Float.parseFloat(string);
                        int n = (int)(f2 * 10.0f);
                        if (n > mtr.g(this.ECh).getMaximum()) {
                            n = mtr.g(this.ECh).getMaximum();
                            mtr.h(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        } else if (n < mtr.g(this.ECh).getMinimum()) {
                            n = mtr.g(this.ECh).getMinimum();
                            mtr.h(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        }
                        mtr.g(this.ECh).setValue(n);
                    }
                    catch (Exception exception) {}
                } else {
                    JOptionPane.showInternalMessageDialog(mtr.d(this.ECh), "Select A Missile Info Item First");
                }
            }
        });
        this.EBL.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtr.i(this.ECh).getValue();
                float f2 = (float)n / 10.0f;
                mtr.j(this.ECh).setText(String.valueOf(f2));
            }
        });
        this.EBM.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void focusLost(FocusEvent focusEvent) {
                if (mtr.c(this.ECh) != null) {
                    try {
                        String string = mtr.j(this.ECh).getText();
                        float f2 = Float.parseFloat(string);
                        int n = (int)(f2 * 10.0f);
                        if (n > mtr.i(this.ECh).getMaximum()) {
                            n = mtr.i(this.ECh).getMaximum();
                            mtr.j(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        } else if (n < mtr.i(this.ECh).getMinimum()) {
                            n = mtr.i(this.ECh).getMinimum();
                            mtr.j(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        }
                        mtr.i(this.ECh).setValue(n);
                    }
                    catch (Exception exception) {}
                } else {
                    JOptionPane.showInternalMessageDialog(mtr.d(this.ECh), "Select A Missile Info Item First");
                }
            }
        });
        this.EBP.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtr.k(this.ECh).getValue();
                float f2 = (float)n / 10.0f;
                mtr.l(this.ECh).setText(String.valueOf(f2));
            }
        });
        this.EBQ.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void focusLost(FocusEvent focusEvent) {
                if (mtr.c(this.ECh) != null) {
                    try {
                        String string = mtr.l(this.ECh).getText();
                        float f2 = Float.parseFloat(string);
                        int n = (int)(f2 * 10.0f);
                        if (n > mtr.k(this.ECh).getMaximum()) {
                            n = mtr.k(this.ECh).getMaximum();
                            mtr.l(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        } else if (n < mtr.k(this.ECh).getMinimum()) {
                            n = mtr.k(this.ECh).getMinimum();
                            mtr.l(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        }
                        mtr.k(this.ECh).setValue(n);
                    }
                    catch (Exception exception) {}
                } else {
                    JOptionPane.showInternalMessageDialog(mtr.d(this.ECh), "Select A Missile Info Item First");
                }
            }
        });
        this.EBT.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtr.m(this.ECh).getValue();
                float f2 = (float)n / 10.0f;
                mtr.n(this.ECh).setText(String.valueOf(f2));
            }
        });
        this.EBU.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void focusLost(FocusEvent focusEvent) {
                if (mtr.c(this.ECh) != null) {
                    try {
                        String string = mtr.n(this.ECh).getText();
                        float f2 = Float.parseFloat(string);
                        int n = (int)(f2 * 10.0f);
                        if (n > mtr.m(this.ECh).getMaximum()) {
                            n = mtr.m(this.ECh).getMaximum();
                            mtr.n(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        } else if (n < mtr.m(this.ECh).getMinimum()) {
                            n = mtr.m(this.ECh).getMinimum();
                            mtr.n(this.ECh).setText(String.valueOf((float)n / 10.0f));
                        }
                        mtr.m(this.ECh).setValue(n);
                    }
                    catch (Exception exception) {}
                } else {
                    JOptionPane.showInternalMessageDialog(mtr.d(this.ECh), "Select A Missile Info Item First");
                }
            }
        });
        this.ErD.addActionListener(new ActionListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtr.o(this.ECh);
            }
        });
        this.f.addActionListener(new ActionListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtr.p(this.ECh);
            }
        });
        this.ECa.addActionListener(new ActionListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtr.q(this.ECh);
            }
        });
        this.EBm.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (mtr.c(this.ECh) != null && !mtr.r(this.ECh)) {
                    JOptionPane.showInternalMessageDialog(mtr.d(this.ECh), "You have To Specify A Missile Special Effect With Fired Type");
                    mtr.s(this.ECh).setSelectedValue(mtr.c(this.ECh).getName(), true);
                    return;
                }
                Iterator<K> iterator = mtr.t(this.ECh).keySet().iterator();
                String string = (String)mtr.s(this.ECh).getSelectedValue();
                if (string != null) {
                    while (iterator.hasNext()) {
                        K k = iterator.next();
                        if (!(k instanceof String) || !((String)k).equalsIgnoreCase(string)) continue;
                        mtr.a(this.ECh, (bwo)mtr.t(this.ECh).get(string));
                        lfn.b(0, "SFMissileInfoEditor", "loadSelectedMissileInfo() SelectedMissileInfo " + mtr.c(this.ECh));
                        mtr.u(this.ECh);
                    }
                }
            }
        });
        this.DNZ.addActionListener(new ActionListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtr.v(this.ECh);
            }
        });
        this.DFU.addActionListener(new ActionListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = JOptionPane.showInternalInputDialog(mtr.d(this.ECh), "New Missile Info Name");
                if (string != null && !string.trim().equals("")) {
                    int n = mtr.w(this.ECh);
                    if (!string.startsWith("m_")) {
                        string = "m_" + string;
                    }
                    if (!mtr.x(this.ECh).contains(string)) {
                        bwo bwo2 = new bwo();
                        bwo2.setName(string);
                        bwo2.setType(n);
                        mtr.t(this.ECh).put(string, bwo2);
                        mtr.t(this.ECh).put(new Integer(n), bwo2);
                        mtr.x(this.ECh).add(string);
                        mtr.s(this.ECh).setListData(mtr.x(this.ECh));
                        mtr.s(this.ECh).revalidate();
                    }
                }
            }
        });
        this.DFV.addActionListener(new ActionListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (mtr.c(this.ECh) != null) {
                    String string = mtr.c(this.ECh).getName();
                    int n = JOptionPane.showInternalConfirmDialog(mtr.d(this.ECh), "Do you Want To Remove Missile Info [" + string + "]");
                    if (n == 0) {
                        mtr.t(this.ECh).remove(string);
                        mtr.x(this.ECh).remove(string);
                        mtr.s(this.ECh).revalidate();
                        mtr.y(this.ECh);
                    }
                }
            }
        });
    }

    private int eOM() {
        int n = 0;
        for (Object k : this.ECc.keySet()) {
            int n2;
            if (!(k instanceof Integer) || (n2 = ((Integer)k).intValue()) <= n) continue;
            n = n2;
        }
        return n;
    }

    private boolean eON() {
        int n;
        int n2 = this.EBt.getValue();
        float f2 = (float)n2 / 10.0f;
        this.ECd.dy(f2);
        n2 = this.EBD.getValue();
        f2 = (float)n2 / 10.0f;
        this.ECd.dC(f2);
        n2 = this.EBH.getValue();
        f2 = (float)n2 / 10.0f;
        this.ECd.dD(f2);
        n2 = this.EBL.getValue();
        f2 = (float)n2 / 10.0f;
        this.ECd.ac(f2);
        n2 = this.EBP.getValue();
        f2 = (float)n2 / 10.0f;
        this.ECd.setMaxVelocity(f2);
        n2 = this.EBT.getValue();
        f2 = (float)n2 / 10.0f;
        this.ECd.ab(f2);
        String string = this.ErC.getText();
        int n3 = lea.enZ().getType(string);
        this.ECd.eI(n3);
        this.ECd.fa(this.EBw.isSelected());
        this.ECd.fb(this.EBy.isSelected());
        this.ECd.fc(this.EBA.isSelected());
        int n4 = 3;
        boolean bl = false;
        bwt[] bwtArray = new bwt[this.ECe.size()];
        for (n = 0; n < this.ECe.size(); ++n) {
            bwt bwt2;
            String string2 = (String)((JComboBox)this.ECe.get(n)).getSelectedItem();
            String string3 = (String)((JComboBox)this.ECf.get(n)).getSelectedItem();
            int n5 = bwn.gE(string3);
            int n6 = del.dr(string2);
            if (n5 == n4) {
                bl = true;
            }
            bwtArray[n] = bwt2 = new bwt(n6, n5);
        }
        this.ECd.a(bwtArray);
        n = lea.enW().getType(this.EBq.getText());
        this.ECd.l(n);
        return bl;
    }

    private void eOO() {
        this.aj("None", 0);
        this.EBY.revalidate();
    }

    private void eOt() {
        if (this.eON()) {
            this.ECg.wt(EBk);
            JOptionPane.showInternalMessageDialog(this.Eqh, "Missile Info SFFile Saved");
        } else {
            JOptionPane.showInternalMessageDialog(this.Eqh, "You have To Specify A Missile Special Effect With Fired Type");
        }
    }

    private void eOP() {
        if (this.ECd != null) {
            this.eOR();
            String string = this.ECd.pa();
            String string2 = this.ECd.Bu();
            boolean bl = this.ECd.aCj();
            boolean bl2 = this.ECd.aCk();
            boolean bl3 = this.ECd.aCu();
            float f2 = this.ECd.aCl();
            float f3 = this.ECd.aCm();
            float f4 = this.ECd.aCc();
            float f5 = this.ECd.aCo();
            float f6 = this.ECd.getMaxVelocity();
            float f7 = this.ECd.aCn();
            this.EBq.setText(string);
            this.ErC.setText(string2);
            this.EBw.setSelected(bl);
            this.EBy.setSelected(bl2);
            this.EBA.setSelected(bl3);
            this.EBt.setValue((int)f4 * 10);
            this.EBu.setText(String.valueOf(f4));
            this.EBD.setValue((int)f2 * 10);
            this.EBE.setText(String.valueOf(f2));
            this.EBH.setValue((int)f3 * 10);
            this.EBI.setText(String.valueOf(f3));
            this.EBH.setValue((int)f3 * 10);
            this.EBI.setText(String.valueOf(f3));
            this.EBL.setValue((int)f5 * 10);
            this.EBM.setText(String.valueOf(f5));
            this.EBP.setValue((int)f6 * 10);
            this.EBQ.setText(String.valueOf(f6));
            this.EBT.setValue((int)f7 * 10);
            this.EBU.setText(String.valueOf(f7));
            this.eOQ();
        }
    }

    private void eOQ() {
        this.EBY.removeAll();
        this.EBY.revalidate();
        bwt[] bwtArray = this.ECd.aCp();
        for (int i = 0; i < bwtArray.length; ++i) {
            bwt bwt2 = bwtArray[i];
            String string = bwt2.getSpecialEffectName();
            int n = bwt2.dWW;
            this.aj(string, n);
        }
    }

    private void eOl() {
        for (Object k : this.gmH.keySet()) {
            if (!(k instanceof String)) continue;
            this.Eza.add(k);
        }
    }

    private void aj(String string, int n) {
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new GridLayout(1, 2));
        JComboBox jComboBox = new JComboBox(this.Eza);
        jComboBox.setSelectedItem(string);
        Vector<String> vector = new Vector<String>();
        vector.add(bwn.ny(1));
        vector.add(bwn.ny(2));
        vector.add(bwn.ny(3));
        JComboBox jComboBox2 = new JComboBox(vector);
        jPanel2.add(jComboBox);
        jPanel2.add(jComboBox2);
        jComboBox2.setSelectedIndex(n - 1);
        JPanel jPanel3 = new JPanel(new GridLayout(1, 2));
        JButton jButton = new JButton("Remove");
        jPanel.setOpaque(false);
        jPanel.add((Component)jPanel2, "Center");
        jPanel.add((Component)jPanel3, "East");
        jPanel3.add(jButton);
        jButton.addActionListener(new ActionListener(this, jPanel){
            final /* synthetic */ JPanel ECi;
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
                this.ECi = jPanel;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtr.z(this.ECh).remove((Component)this.ECi);
                mtr.z(this.ECh).revalidate();
            }
        });
        this.EBY.add((Component)jPanel);
        this.ECe.add(jComboBox);
        this.ECf.add(jComboBox2);
    }

    private void eOR() {
        this.ErC.setText("");
        this.EBw.setSelected(false);
        this.EBy.setSelected(false);
        this.EBA.setSelected(true);
        this.EBt.setValue(0);
        this.EBu.setText("0.0");
        this.EBt.setValue(0);
        this.EBu.setText("0.0");
        this.EBD.setValue(0);
        this.EBE.setText("0.0");
        this.EBH.setValue(0);
        this.EBI.setText("0.0");
        this.EBL.setValue(0);
        this.EBM.setText("0.0");
        this.EBP.setValue(0);
        this.EBQ.setText("0.0");
        this.EBT.setValue(0);
        this.EBU.setText("0.0");
        this.ECe.clear();
        this.ECf.clear();
    }

    private void eOS() {
        Map map = lea.eoj();
        for (Object k : map.keySet()) {
            lfn.b(0, "SFMissileInfoEditor", "loadMissileInfoItems() Key " + k);
            if (!(k instanceof String)) continue;
            String string = (String)k;
            this.EBl.add(string);
        }
        this.EBm.setListData(this.EBl);
        this.EBm.revalidate();
    }

    private void eOq() {
        JDialog jDialog = new JDialog();
        jDialog.setTitle("Weapons");
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout());
        JButton jButton = new JButton("Add Weapon");
        JButton jButton2 = new JButton("Close");
        jButton2.addActionListener(new ActionListener(this, jDialog){
            final /* synthetic */ JDialog EtI;
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
                this.EtI = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EtI.dispose();
            }
        });
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
        JScrollPane jScrollPane = new JScrollPane();
        this.eKn();
        jScrollPane.getViewport().add(this.Eix);
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                int[] nArray = mtr.A(this.ECh).getSelectionRows();
                if (nArray != null) {
                    DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)mtr.A(this.ECh).getLastSelectedPathComponent();
                    String string = defaultMutableTreeNode.toString();
                    mtr.B(this.ECh).setText(string);
                }
            }
        });
        jPanel.add((Component)jScrollPane, "Center");
        jPanel.add((Component)jPanel2, "South");
        jDialog.add(jPanel);
        jDialog.setModal(true);
        jDialog.setSize(250, 500);
        jDialog.setLocation((int)this.DDN.getWidth() / 2, (int)this.DDN.getHeight() / 2);
        jDialog.setVisible(true);
    }

    private void eKn() {
        this.EiD = new DefaultMutableTreeNode("Weapons");
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            int n = les2.getType("r_Items");
            boolean bl = les2.isDescendant(ler3.getType(), n);
            if (bl) {
                this.c(this.EiD, les2, ler3);
                break;
            }
            ler3 = les2.h(ler3);
        }
    }

    private void c(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        int n = les2.getType("r_Weapons");
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), n);
            if (bl) {
                DefaultMutableTreeNode defaultMutableTreeNode2;
                if (les2.g(ler3) == null) {
                    defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                    defaultMutableTreeNode.add(defaultMutableTreeNode2);
                } else {
                    defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                    defaultMutableTreeNode.add(defaultMutableTreeNode2);
                    this.c(defaultMutableTreeNode2, les2, ler3);
                }
            }
            ler3 = les2.h(ler3);
        }
        this.Eix = new JTree(defaultMutableTreeNode);
        this.Eix.getSelectionModel().setSelectionMode(1);
    }

    private void eOT() {
        JDialog jDialog = new JDialog();
        jDialog.setTitle("Weapons");
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout());
        JButton jButton = new JButton("Add Skill");
        JButton jButton2 = new JButton("Close");
        jButton2.addActionListener(new ActionListener(this, jDialog){
            final /* synthetic */ JDialog EtI;
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
                this.EtI = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EtI.dispose();
            }
        });
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
        JScrollPane jScrollPane = new JScrollPane();
        this.eKg();
        jScrollPane.getViewport().add(this.EtR);
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ mtr ECh;
            {
                this.ECh = mtr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                DefaultMutableTreeNode defaultMutableTreeNode;
                int[] nArray = mtr.C(this.ECh).getSelectionRows();
                if (nArray != null && (defaultMutableTreeNode = (DefaultMutableTreeNode)mtr.C(this.ECh).getLastSelectedPathComponent()).isLeaf()) {
                    if (mtr.c(this.ECh) != null) {
                        String string = defaultMutableTreeNode.toString();
                        mtr.D(this.ECh).setText(string);
                    } else {
                        JOptionPane.showInternalMessageDialog(mtr.d(this.ECh), "Select A Missile Info Item First");
                    }
                }
            }
        });
        jPanel.add((Component)jScrollPane, "Center");
        jPanel.add((Component)jPanel2, "South");
        jDialog.add(jPanel);
        jDialog.setModal(true);
        jDialog.setSize(250, 500);
        jDialog.setLocation((int)this.DDN.getWidth() / 2, (int)this.DDN.getHeight() / 2);
        jDialog.setVisible(true);
    }

    private void eKg() {
        ler ler2;
        this.ECb = new DefaultMutableTreeNode("Skills");
        les les2 = lea.enZ();
        ler ler3 = les2.g(ler2 = les2.eqq());
        if (ler3 != null) {
            this.e(this.ECb, les2, ler3);
        }
    }

    private void e(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            DefaultMutableTreeNode defaultMutableTreeNode2;
            lfn.b(2, "SFMissileInfoEditor", "parseSkillTree() Type :" + ler3.getType());
            if (les2.g(ler3) == null) {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
            } else {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
                this.e(defaultMutableTreeNode2, les2, ler3);
            }
            ler3 = les2.h(ler3);
        }
        this.EtR = new JTree(defaultMutableTreeNode);
        this.EtR.getSelectionModel().setSelectionMode(1);
    }

    static /* synthetic */ JSlider a(mtr mtr2) {
        return mtr2.EBt;
    }

    static /* synthetic */ JFormattedTextField b(mtr mtr2) {
        return mtr2.EBu;
    }

    static /* synthetic */ bwo c(mtr mtr2) {
        return mtr2.ECd;
    }

    static /* synthetic */ JPanel d(mtr mtr2) {
        return mtr2.Eqh;
    }

    static /* synthetic */ JSlider e(mtr mtr2) {
        return mtr2.EBD;
    }

    static /* synthetic */ JFormattedTextField f(mtr mtr2) {
        return mtr2.EBE;
    }

    static /* synthetic */ JSlider g(mtr mtr2) {
        return mtr2.EBH;
    }

    static /* synthetic */ JFormattedTextField h(mtr mtr2) {
        return mtr2.EBI;
    }

    static /* synthetic */ JSlider i(mtr mtr2) {
        return mtr2.EBL;
    }

    static /* synthetic */ JFormattedTextField j(mtr mtr2) {
        return mtr2.EBM;
    }

    static /* synthetic */ JSlider k(mtr mtr2) {
        return mtr2.EBP;
    }

    static /* synthetic */ JFormattedTextField l(mtr mtr2) {
        return mtr2.EBQ;
    }

    static /* synthetic */ JSlider m(mtr mtr2) {
        return mtr2.EBT;
    }

    static /* synthetic */ JFormattedTextField n(mtr mtr2) {
        return mtr2.EBU;
    }

    static /* synthetic */ void o(mtr mtr2) {
        mtr2.eOT();
    }

    static /* synthetic */ void p(mtr mtr2) {
        mtr2.eOq();
    }

    static /* synthetic */ void q(mtr mtr2) {
        mtr2.eOO();
    }

    static /* synthetic */ boolean r(mtr mtr2) {
        return mtr2.eON();
    }

    static /* synthetic */ JList s(mtr mtr2) {
        return mtr2.EBm;
    }

    static /* synthetic */ Map t(mtr mtr2) {
        return mtr2.ECc;
    }

    static /* synthetic */ bwo a(mtr mtr2, bwo bwo2) {
        mtr2.ECd = bwo2;
        return mtr2.ECd;
    }

    static /* synthetic */ void u(mtr mtr2) {
        mtr2.eOP();
    }

    static /* synthetic */ void v(mtr mtr2) {
        mtr2.eOt();
    }

    static /* synthetic */ int w(mtr mtr2) {
        return mtr2.eOM();
    }

    static /* synthetic */ Vector x(mtr mtr2) {
        return mtr2.EBl;
    }

    static /* synthetic */ void y(mtr mtr2) {
        mtr2.eOR();
    }

    static /* synthetic */ JTaskPaneGroup z(mtr mtr2) {
        return mtr2.EBY;
    }

    static /* synthetic */ JTree A(mtr mtr2) {
        return mtr2.Eix;
    }

    static /* synthetic */ JTextField B(mtr mtr2) {
        return mtr2.EBq;
    }

    static /* synthetic */ JTree C(mtr mtr2) {
        return mtr2.EtR;
    }

    static /* synthetic */ JTextField D(mtr mtr2) {
        return mtr2.ErC;
    }
}

