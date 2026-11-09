/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  com.l2fprod.common.swing.JTaskPane
 *  com.l2fprod.common.swing.JTaskPaneGroup
 *  cug
 */
import com.l2fprod.common.swing.JTaskPane;
import com.l2fprod.common.swing.JTaskPaneGroup;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
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

public class mtm
extends mkx {
    private aux DEC = null;
    private final Dimension DDN = new Dimension(650, 600);
    private JPanel Eqh = new JPanel(new BorderLayout());
    private JPanel Eyc = new JPanel(new BorderLayout());
    private JScrollPane Eyd = new JScrollPane();
    private Vector<String> Eye = new Vector();
    private JList Eyf = new JList<String>(this.Eye);
    private JPanel Eyg = new JPanel(new FlowLayout());
    private JButton DFU = new JButton("Add");
    private JButton DFV = new JButton("Remove");
    private JScrollPane Eqj = new JScrollPane();
    private JTaskPane Eqk = new JTaskPane();
    private JTaskPaneGroup Eyh = new JTaskPaneGroup();
    private JPanel Eyi = new JPanel(new BorderLayout());
    private JLabel Eyj = new JLabel("Missile Type");
    private Vector Eyk = new Vector();
    private JComboBox Eyl = new JComboBox(this.Eyk);
    private JPanel Eym = new JPanel(new BorderLayout());
    private JLabel Eyn = new JLabel("Radius");
    private JSlider Eyo = new JSlider(0, 1000);
    private JFormattedTextField Eyp = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel Eyq = new JPanel(new BorderLayout());
    private JLabel Eyr = new JLabel("Damage Type");
    private JTextField Eys = new JTextField();
    private JButton Eyt = new JButton("Effect");
    private JPanel Eyu = new JPanel(new BorderLayout());
    private JLabel Eyv = new JLabel("Damage Type 2");
    private JTextField Eyw = new JTextField();
    private JButton Eyx = new JButton("Effect");
    private JPanel Eyy = new JPanel(new BorderLayout());
    private JLabel Eyz = new JLabel("Damage");
    private JSlider EyA = new JSlider(-1000, 1000);
    private JFormattedTextField EyB = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel EyC = new JPanel(new BorderLayout());
    private JLabel EyD = new JLabel("Ammo");
    private JSlider EyE = new JSlider(-1, 1000);
    private JFormattedTextField EyF = new JFormattedTextField(new DecimalFormat("#"));
    private JPanel EyG = new JPanel(new BorderLayout());
    private JLabel EyH = new JLabel("Max Speed");
    private JSlider EyI = new JSlider(0, 40);
    private JFormattedTextField EyJ = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel EyK = new JPanel(new BorderLayout());
    private JLabel EyL = new JLabel("Yaw Turn Angle");
    private JSlider EyM = new JSlider(0, 31);
    private JFormattedTextField EyN = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel EyO = new JPanel(new BorderLayout());
    private JLabel EyP = new JLabel("Pitch Turn Angle");
    private JSlider EyQ = new JSlider(0, 31);
    private JFormattedTextField EyR = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel EyS = new JPanel(new BorderLayout());
    private JLabel EyT = new JLabel("Reload Timer");
    private JSlider EyU = new JSlider(0, 1000);
    private JFormattedTextField EyV = new JFormattedTextField(new DecimalFormat("#.0"));
    private JPanel EyW = new JPanel(new BorderLayout());
    private JLabel EyX = new JLabel("Acceleration Time");
    private JSlider EyY = new JSlider(0, 50);
    private JFormattedTextField EyZ = new JFormattedTextField(new DecimalFormat("#.0"));
    private Map gmH = lea.eoc();
    private Vector Eza = new Vector();
    private static final String Ezb = "NONE";
    private JPanel Ezc = new JPanel(new BorderLayout());
    private JLabel Ezd = new JLabel("Spawn Effect");
    private JComboBox Eze = new JComboBox(this.Eza);
    private JPanel Ezf = new JPanel(new BorderLayout());
    private JLabel Ezg = new JLabel("Damage Effect");
    private JComboBox Ezh = new JComboBox(this.Eza);
    private JPanel Ezi = new JPanel(new BorderLayout());
    private JLabel Ezj = new JLabel("Kill Effect");
    private JComboBox Ezk = new JComboBox(this.Eza);
    private JPanel Ezl = new JPanel(new BorderLayout());
    private JLabel Ezm = new JLabel("No Ammo Effect");
    private JComboBox Ezn = new JComboBox(this.Eza);
    private JPanel Ezo = new JPanel(new FlowLayout(2));
    private JButton DNZ = new JButton("Save Cannon Info List SFFile");
    private JTree Eix;
    private DefaultMutableTreeNode EiD;
    private JTree Ezp;
    private DefaultMutableTreeNode Ezq;
    private kbo Ezr = new kbo();
    private Map rhj = lea.eok();
    private bwm Ezs = null;

    public mtm() {
        super(false);
        this.setTitle("Gun Cannon Tool");
        this.setClosable(true);
        this.setSize(this.DDN);
        this.eOl();
        this.r();
        this.eNv();
        this.eOs();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
        this.DEC.getAlignmentY();
    }

    private void eOl() {
        for (Object k : this.gmH.keySet()) {
            String string;
            if (!(k instanceof String) || (string = (String)k).startsWith(Ezb)) continue;
            this.Eza.add(k);
        }
    }

    private void r() {
        this.eOo();
        if (this.Eye.size() == 0) {
            this.Ah(false);
        }
        Dimension dimension = new Dimension(80, 25);
        this.Eqj.getViewport().add((Component)this.Eqk);
        this.Eqk.add(this.Eyh);
        this.Eyh.setTitle("Cannon Attributes");
        this.Eqh.add((Component)this.Eyc, "West");
        this.Eqh.add((Component)this.Eqj, "Center");
        this.Eqh.add((Component)this.Ezo, "South");
        this.Eyc.add((Component)this.Eyd, "Center");
        this.Eyc.add((Component)this.Eyg, "South");
        this.Eyd.getViewport().add(this.Eyf);
        this.Eyc.setBorder(BorderFactory.createTitledBorder("Cannon Guns"));
        this.Eyg.add(this.DFU);
        this.Eyg.add(this.DFV);
        this.Ezo.add(this.DNZ);
        this.Eyh.add((Component)this.Eyi);
        this.Eyh.add((Component)this.Eym);
        this.Eyh.add((Component)this.Eyq);
        this.Eyh.add((Component)this.Eyu);
        this.Eyh.add((Component)this.Eyy);
        this.Eyh.add((Component)this.EyC);
        this.Eyh.add((Component)this.EyG);
        this.Eyh.add((Component)this.EyK);
        this.Eyh.add((Component)this.EyO);
        this.Eyh.add((Component)this.EyW);
        this.Eyh.add((Component)this.EyS);
        this.Eyh.add((Component)this.Ezc);
        this.Eyh.add((Component)this.Ezf);
        this.Eyh.add((Component)this.Ezi);
        this.Eyh.add((Component)this.Ezl);
        this.Eyi.add((Component)this.Eyj, "West");
        this.Eyi.setOpaque(false);
        this.Eyi.add((Component)this.Eyl, "Center");
        this.Eyj.setPreferredSize(dimension);
        this.Eyj.setOpaque(false);
        this.Eym.add((Component)this.Eyn, "West");
        this.Eym.setOpaque(false);
        this.Eym.add((Component)this.Eyo, "Center");
        this.Eyo.setOpaque(false);
        this.Eyo.setValue(0);
        this.Eym.add((Component)this.Eyp, "East");
        this.Eyp.setPreferredSize(new Dimension(40, 25));
        this.Eyp.setText("0.0");
        this.Eyn.setPreferredSize(dimension);
        this.Eyn.setOpaque(false);
        this.Eyq.add((Component)this.Eyr, "West");
        this.Eyq.setOpaque(false);
        this.Eyq.add((Component)this.Eys, "Center");
        this.Eys.setEditable(false);
        this.Eyq.add((Component)this.Eyt, "East");
        this.Eyr.setPreferredSize(dimension);
        this.Eyr.setOpaque(false);
        this.Eyu.add((Component)this.Eyv, "West");
        this.Eyu.setOpaque(false);
        this.Eyu.add((Component)this.Eyw, "Center");
        this.Eyw.setEditable(false);
        this.Eyu.add((Component)this.Eyx, "East");
        this.Eyv.setPreferredSize(dimension);
        this.Eyv.setOpaque(false);
        this.Eyy.add((Component)this.Eyz, "West");
        this.Eyy.setOpaque(false);
        this.Eyy.add((Component)this.EyA, "Center");
        this.EyA.setOpaque(false);
        this.EyA.setValue(0);
        this.EyB.setText("0.0");
        this.Eyy.add((Component)this.EyB, "East");
        this.EyB.setPreferredSize(new Dimension(40, 25));
        this.Eyz.setPreferredSize(dimension);
        this.Eyz.setOpaque(false);
        this.EyC.add((Component)this.EyD, "West");
        this.EyC.setOpaque(false);
        this.EyC.add((Component)this.EyE, "Center");
        this.EyE.setOpaque(false);
        this.EyE.setValue(0);
        this.EyF.setText("0");
        this.EyC.add((Component)this.EyF, "East");
        this.EyF.setPreferredSize(new Dimension(40, 25));
        this.EyD.setPreferredSize(dimension);
        this.EyD.setOpaque(false);
        this.EyG.add((Component)this.EyH, "West");
        this.EyG.setOpaque(false);
        this.EyG.add((Component)this.EyI, "Center");
        this.EyI.setOpaque(false);
        this.EyI.setValue(0);
        this.EyJ.setText("0.0");
        this.EyG.add((Component)this.EyJ, "East");
        this.EyJ.setPreferredSize(new Dimension(40, 25));
        this.EyH.setPreferredSize(dimension);
        this.EyH.setOpaque(false);
        this.EyK.add((Component)this.EyL, "West");
        this.EyK.setOpaque(false);
        this.EyK.add((Component)this.EyM, "Center");
        this.EyM.setOpaque(false);
        this.EyM.setValue(0);
        this.EyN.setText("0.0");
        this.EyK.add((Component)this.EyN, "East");
        this.EyN.setPreferredSize(new Dimension(40, 25));
        this.EyL.setPreferredSize(dimension);
        this.EyL.setOpaque(false);
        this.EyO.add((Component)this.EyP, "West");
        this.EyO.setOpaque(false);
        this.EyO.add((Component)this.EyQ, "Center");
        this.EyQ.setOpaque(false);
        this.EyQ.setValue(0);
        this.EyR.setText("0.0");
        this.EyO.add((Component)this.EyR, "East");
        this.EyR.setPreferredSize(new Dimension(40, 25));
        this.EyP.setPreferredSize(dimension);
        this.EyP.setOpaque(false);
        this.EyW.add((Component)this.EyX, "West");
        this.EyW.setOpaque(false);
        this.EyW.add((Component)this.EyY, "Center");
        this.EyY.setOpaque(false);
        this.EyY.setValue(0);
        this.EyZ.setText("0.0");
        this.EyW.add((Component)this.EyZ, "East");
        this.EyZ.setPreferredSize(new Dimension(40, 25));
        this.EyX.setPreferredSize(dimension);
        this.EyX.setOpaque(false);
        this.EyS.add((Component)this.EyT, "West");
        this.EyS.setOpaque(false);
        this.EyS.add((Component)this.EyU, "Center");
        this.EyU.setOpaque(false);
        this.EyU.setValue(0);
        this.EyV.setText("0.0");
        this.EyS.add((Component)this.EyV, "East");
        this.EyV.setPreferredSize(new Dimension(40, 25));
        this.EyT.setPreferredSize(dimension);
        this.EyT.setOpaque(false);
        this.Ezc.add((Component)this.Ezd, "West");
        this.Ezc.setOpaque(false);
        this.Ezc.add((Component)this.Eze, "Center");
        this.Ezd.setPreferredSize(dimension);
        this.Ezd.setOpaque(false);
        this.Ezf.add((Component)this.Ezg, "West");
        this.Ezf.setOpaque(false);
        this.Ezf.add((Component)this.Ezh, "Center");
        this.Ezg.setPreferredSize(dimension);
        this.Ezg.setOpaque(false);
        this.Ezi.add((Component)this.Ezj, "West");
        this.Ezi.setOpaque(false);
        this.Ezi.add((Component)this.Ezk, "Center");
        this.Ezj.setPreferredSize(dimension);
        this.Ezj.setOpaque(false);
        this.Ezl.add((Component)this.Ezm, "West");
        this.Ezl.setOpaque(false);
        this.Ezl.add((Component)this.Ezn, "Center");
        this.Ezm.setPreferredSize(dimension);
        this.Ezm.setOpaque(false);
        this.DGa.add(this.Eqh);
    }

    private void eNv() {
        this.Eyf.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 1) {
                    mtm.a(this.Ezt);
                    mtm.b(this.Ezt);
                }
            }
        });
        this.Eyf.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 40 || keyEvent.getKeyCode() == 38) {
                    mtm.a(this.Ezt);
                    mtm.b(this.Ezt);
                }
            }
        });
        this.DFU.addActionListener(new ActionListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtm.c(this.Ezt);
            }
        });
        this.DFV.addActionListener(new ActionListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtm.d(this.Ezt);
            }
        });
        this.DNZ.addActionListener(new ActionListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtm.e(this.Ezt);
            }
        });
        this.Eyt.addActionListener(new ActionListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtm.a(this.Ezt, mtm.f(this.Ezt));
            }
        });
        this.Eyx.addActionListener(new ActionListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtm.a(this.Ezt, mtm.g(this.Ezt));
            }
        });
        this.Eyo.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtm.h(this.Ezt).getValue();
                float f2 = (float)n / 10.0f;
                mtm.i(this.Ezt).setText(String.valueOf(f2));
            }
        });
        this.Eyp.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void focusLost(FocusEvent focusEvent) {
                String string = mtm.i(this.Ezt).getText();
                float f2 = Float.parseFloat(string = string.replaceAll(",", "."));
                int n = (int)(f2 * 10.0f);
                if (n > mtm.h(this.Ezt).getMaximum()) {
                    n = mtm.h(this.Ezt).getMaximum();
                    mtm.i(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                } else if (n < mtm.h(this.Ezt).getMinimum()) {
                    n = mtm.h(this.Ezt).getMinimum();
                    mtm.i(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                }
                mtm.h(this.Ezt).setValue(n);
            }
        });
        this.EyA.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtm.j(this.Ezt).getValue();
                float f2 = (float)n / 10.0f;
                mtm.k(this.Ezt).setText(String.valueOf(f2));
            }
        });
        this.EyB.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void focusLost(FocusEvent focusEvent) {
                String string = mtm.k(this.Ezt).getText();
                float f2 = Float.parseFloat(string = string.replaceAll(",", "."));
                int n = (int)(f2 * 10.0f);
                if (n > mtm.j(this.Ezt).getMaximum()) {
                    n = mtm.j(this.Ezt).getMaximum();
                    mtm.k(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                } else if (n < mtm.j(this.Ezt).getMinimum()) {
                    n = mtm.j(this.Ezt).getMinimum();
                    mtm.k(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                }
                mtm.j(this.Ezt).setValue(n);
            }
        });
        this.EyE.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtm.l(this.Ezt).getValue();
                mtm.m(this.Ezt).setText(String.valueOf(n));
            }
        });
        this.EyF.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void focusLost(FocusEvent focusEvent) {
                String string = mtm.m(this.Ezt).getText();
                int n = Integer.parseInt(string);
                if (n > mtm.l(this.Ezt).getMaximum()) {
                    n = mtm.l(this.Ezt).getMaximum();
                    mtm.m(this.Ezt).setText(String.valueOf((float)n / 10.0f));
                } else if (n < mtm.l(this.Ezt).getMinimum()) {
                    n = mtm.l(this.Ezt).getMinimum();
                    mtm.m(this.Ezt).setText(String.valueOf((float)n / 10.0f));
                }
                mtm.l(this.Ezt).setValue(n);
            }
        });
        this.EyI.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtm.n(this.Ezt).getValue();
                float f2 = (float)n / 10.0f;
                mtm.o(this.Ezt).setText(String.valueOf(f2));
            }
        });
        this.EyJ.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void focusLost(FocusEvent focusEvent) {
                String string = mtm.o(this.Ezt).getText();
                float f2 = Float.parseFloat(string = string.replaceAll(",", "."));
                int n = (int)(f2 * 10.0f);
                if (n > mtm.n(this.Ezt).getMaximum()) {
                    n = mtm.n(this.Ezt).getMaximum();
                    mtm.o(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                } else if (n < mtm.n(this.Ezt).getMinimum()) {
                    n = mtm.n(this.Ezt).getMinimum();
                    mtm.o(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                }
                mtm.n(this.Ezt).setValue(n);
            }
        });
        this.EyM.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtm.p(this.Ezt).getValue();
                float f2 = (float)n / 10.0f;
                mtm.q(this.Ezt).setText(String.valueOf(f2));
            }
        });
        this.EyN.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void focusLost(FocusEvent focusEvent) {
                String string = mtm.q(this.Ezt).getText();
                float f2 = Float.parseFloat(string = string.replaceAll(",", "."));
                int n = (int)(f2 * 10.0f);
                if (n > mtm.p(this.Ezt).getMaximum()) {
                    n = mtm.p(this.Ezt).getMaximum();
                    mtm.q(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                } else if (n < mtm.p(this.Ezt).getMinimum()) {
                    n = mtm.p(this.Ezt).getMinimum();
                    mtm.q(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                }
                mtm.p(this.Ezt).setValue(n);
            }
        });
        this.EyQ.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtm.r(this.Ezt).getValue();
                float f2 = (float)n / 10.0f;
                mtm.s(this.Ezt).setText(String.valueOf(f2));
            }
        });
        this.EyR.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void focusLost(FocusEvent focusEvent) {
                String string = mtm.s(this.Ezt).getText();
                float f2 = Float.parseFloat(string = string.replaceAll(",", "."));
                int n = (int)(f2 * 10.0f);
                if (n > mtm.r(this.Ezt).getMaximum()) {
                    n = mtm.r(this.Ezt).getMaximum();
                    mtm.s(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                } else if (n < mtm.r(this.Ezt).getMinimum()) {
                    n = mtm.r(this.Ezt).getMinimum();
                    mtm.s(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                }
                mtm.r(this.Ezt).setValue(n);
            }
        });
        this.EyY.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtm.t(this.Ezt).getValue();
                float f2 = (float)n / 10.0f;
                mtm.u(this.Ezt).setText(String.valueOf(f2));
            }
        });
        this.EyZ.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void focusLost(FocusEvent focusEvent) {
                String string = mtm.u(this.Ezt).getText();
                float f2 = Float.parseFloat(string = string.replaceAll(",", "."));
                int n = (int)(f2 * 10.0f);
                if (n > mtm.t(this.Ezt).getMaximum()) {
                    n = mtm.t(this.Ezt).getMaximum();
                    mtm.u(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                } else if (n < mtm.t(this.Ezt).getMinimum()) {
                    n = mtm.t(this.Ezt).getMinimum();
                    mtm.u(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                }
                mtm.t(this.Ezt).setValue(n);
            }
        });
        this.EyU.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                int n = mtm.v(this.Ezt).getValue();
                float f2 = (float)n / 10.0f;
                mtm.w(this.Ezt).setText(String.valueOf(f2));
            }
        });
        this.EyV.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void focusLost(FocusEvent focusEvent) {
                String string = mtm.w(this.Ezt).getText();
                float f2 = Float.parseFloat(string = string.replaceAll(",", "."));
                int n = (int)(f2 * 10.0f);
                if (n > mtm.v(this.Ezt).getMaximum()) {
                    n = mtm.v(this.Ezt).getMaximum();
                    mtm.w(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                } else if (n < mtm.v(this.Ezt).getMinimum()) {
                    n = mtm.v(this.Ezt).getMinimum();
                    mtm.w(this.Ezt).setText(String.valueOf(f2 / 10.0f));
                }
                mtm.v(this.Ezt).setValue(n);
            }
        });
    }

    private void eOm() {
        if (this.Ezs != null) {
            int n;
            String string = (String)this.Eyl.getSelectedItem();
            if (string != null) {
                n = this.Dj(string);
                if (n != -1) {
                    this.Ezs.nu(n);
                    this.Ezs.gt(string);
                } else {
                    lfn.b(5, "SFGunCannonTool", "createListeners() Missile [" + string + "] Doesn't Exist");
                }
            }
            n = this.Eyo.getValue();
            float f2 = (float)n / 10.0f;
            this.Ezs.ds(f2);
            String string2 = this.Eys.getText();
            this.Ezs.nt(lea.enT().getType(string2));
            String string3 = this.Eyw.getText();
            this.Ezs.nw(lea.enT().getType(string3));
            n = this.EyA.getValue();
            f2 = (float)n / 10.0f;
            this.Ezs.cN(f2);
            n = this.EyE.getValue();
            this.Ezs.nv(n);
            n = this.EyI.getValue();
            f2 = (float)n / 10.0f;
            this.Ezs.du(f2);
            n = this.EyM.getValue();
            f2 = (float)n / 10.0f;
            this.Ezs.dw(f2);
            n = this.EyQ.getValue();
            f2 = (float)n / 10.0f;
            this.Ezs.dv(f2);
            n = this.EyY.getValue();
            f2 = (float)n / 10.0f;
            this.Ezs.dt(f2);
            n = this.EyU.getValue();
            f2 = (float)n / 10.0f;
            this.Ezs.dx(f2);
            String string4 = (String)this.Eze.getSelectedItem();
            this.Ezs.gw(string4);
            String string5 = (String)this.Ezh.getSelectedItem();
            this.Ezs.gu(string5);
            String string6 = (String)this.Ezk.getSelectedItem();
            this.Ezs.gv(string6);
            String string7 = (String)this.Ezn.getSelectedItem();
            this.Ezs.gx(string7);
        }
    }

    private void eOn() {
        int n = this.Eyf.getSelectedIndex();
        if (n != -1) {
            String string = (String)this.Eyf.getSelectedValue();
            int n2 = lea.enW().getType(string);
            if (n2 != -1) {
                this.Ezs = (bwm)this.rhj.get(new Integer(n2));
                float f2 = this.Ezs.aBB();
                int n3 = this.Ezs.aBA();
                int n4 = this.Ezs.aBK();
                float f3 = this.Ezs.aou();
                int n5 = this.Ezs.aBF();
                float f4 = this.Ezs.aBG();
                float f5 = this.Ezs.aBI();
                float f6 = this.Ezs.aBH();
                float f7 = this.Ezs.aBE();
                float f8 = this.Ezs.aBJ();
                String string2 = this.Ezs.aBN();
                String string3 = this.Ezs.aBL();
                String string4 = this.Ezs.aBM();
                String string5 = this.Ezs.aBO();
                this.Ah(true);
                this.Eyl.setSelectedItem(this.Ezs.aBD());
                this.Eyo.setValue((int)(f2 * 10.0f));
                this.Eyp.setText(String.valueOf(f2));
                this.Eys.setText(lea.enT().getName(n3));
                if (n4 != -1) {
                    this.Eyw.setText(lea.enT().getName(n4));
                } else {
                    this.Eyw.setText("");
                }
                this.EyA.setValue((int)(f3 * 10.0f));
                this.EyB.setText(String.valueOf(f3));
                this.EyE.setValue(n5);
                this.EyF.setText(String.valueOf(n5));
                this.EyI.setValue((int)(f4 * 10.0f));
                this.EyJ.setText(String.valueOf(f4));
                this.EyM.setValue((int)(f5 * 10.0f));
                this.EyN.setText(String.valueOf(f5));
                this.EyQ.setValue((int)(f6 * 10.0f));
                this.EyR.setText(String.valueOf(f6));
                this.EyY.setValue((int)(f7 * 10.0f));
                this.EyZ.setText(String.valueOf(f7));
                this.EyU.setValue((int)(f8 * 10.0f));
                this.EyV.setText(String.valueOf(f8));
                this.Eze.setSelectedItem(string2);
                this.Ezh.setSelectedItem(string3);
                this.Ezk.setSelectedItem(string4);
                this.Ezn.setSelectedItem(string5);
            }
        }
    }

    private void eOo() {
        Map map = lea.eoj();
        for (Object k : map.keySet()) {
            if (!(k instanceof String)) continue;
            String string = (String)k;
            this.Eyk.add(string);
        }
        this.Eyl.revalidate();
    }

    private int Dj(String string) {
        bwo bwo2 = (bwo)lea.eoj().get(string);
        if (bwo2 != null) {
            return bwo2.getType();
        }
        return -1;
    }

    private void a(JButton jButton) {
        JDialog jDialog = new JDialog();
        jDialog.setTitle("Effects");
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout());
        JButton jButton2 = new JButton("Select Effect");
        JButton jButton3 = new JButton("Close");
        jButton3.addActionListener(new ActionListener(this, jDialog){
            final /* synthetic */ JDialog EtI;
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
                this.EtI = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EtI.dispose();
            }
        });
        jPanel2.add(jButton2);
        jPanel2.add(jButton3);
        JScrollPane jScrollPane = new JScrollPane();
        this.eOp();
        jScrollPane.getViewport().add(this.Ezp);
        jButton2.addActionListener(new ActionListener(this, jButton, jDialog){
            final /* synthetic */ JButton Ezu;
            final /* synthetic */ JDialog EtI;
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
                this.Ezu = jButton;
                this.EtI = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                DefaultMutableTreeNode defaultMutableTreeNode;
                int[] nArray = mtm.x(this.Ezt).getSelectionRows();
                if (nArray != null && (defaultMutableTreeNode = (DefaultMutableTreeNode)mtm.x(this.Ezt).getLastSelectedPathComponent()).isLeaf()) {
                    String string = defaultMutableTreeNode.toString();
                    if (this.Ezu == mtm.f(this.Ezt)) {
                        mtm.y(this.Ezt).setText(string);
                    } else {
                        mtm.z(this.Ezt).setText(string);
                    }
                    if (mtm.A(this.Ezt) != null) {
                        mtm.A(this.Ezt).nt(lea.enT().getType(string));
                    }
                    this.EtI.dispose();
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

    private void eOp() {
        ler ler2;
        this.Ezq = new DefaultMutableTreeNode("Effects");
        les les2 = lea.enT();
        ler ler3 = les2.g(ler2 = les2.eqq());
        if (ler3 != null) {
            this.f(this.Ezq, les2, ler3);
        }
    }

    private void f(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            DefaultMutableTreeNode defaultMutableTreeNode2;
            lfn.b(2, "SFCunCannonTool", "parseEffectTree() Type :" + ler3.getType());
            if (les2.g(ler3) == null) {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
            } else {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
                this.f(defaultMutableTreeNode2, les2, ler3);
            }
            ler3 = les2.h(ler3);
        }
        this.Ezp = new JTree(defaultMutableTreeNode);
        this.Ezp.getSelectionModel().setSelectionMode(1);
    }

    private void eOq() {
        JDialog jDialog = new JDialog();
        jDialog.setTitle("Artillery");
        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout());
        JButton jButton = new JButton("Add Artillery");
        JButton jButton2 = new JButton("Close");
        jButton2.addActionListener(new ActionListener(this, jDialog){
            final /* synthetic */ JDialog EtI;
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
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
            final /* synthetic */ mtm Ezt;
            {
                this.Ezt = mtm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                DefaultMutableTreeNode defaultMutableTreeNode;
                int[] nArray = mtm.B(this.Ezt).getSelectionRows();
                if (nArray != null && (defaultMutableTreeNode = (DefaultMutableTreeNode)mtm.B(this.Ezt).getLastSelectedPathComponent()).isLeaf()) {
                    String string = defaultMutableTreeNode.toString();
                    if (!mtm.C(this.Ezt).contains(string)) {
                        mtm.a(this.Ezt, string);
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

    private void eKn() {
        this.EiD = new DefaultMutableTreeNode("Artillery");
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            this.c(this.EiD, les2, ler3);
            ler3 = les2.h(ler3);
        }
    }

    private void c(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        int n = cug.fnw;
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

    private void Dk(String string) {
        int n = lea.enW().getType(string);
        if (n != -1) {
            bwm bwm2 = new bwm();
            bwm2.l(n);
            this.rhj.put(new Integer(n), bwm2);
            this.Eye.add(string);
            this.Eyf.setListData(this.Eye);
            this.Eyf.revalidate();
        } else {
            JOptionPane.showInternalMessageDialog(this.Eqh, "Resource [" + string + "] Doesn't Exist In Resource Tree");
        }
    }

    private void Ah(boolean bl) {
        this.Eyl.setEnabled(bl);
        this.Eyo.setEnabled(bl);
        this.Eyp.setEnabled(bl);
        this.EyA.setEnabled(bl);
        this.EyB.setEnabled(bl);
        this.Eys.setEnabled(bl);
        this.Eyw.setEnabled(bl);
        this.Eyt.setEnabled(bl);
        this.Eyx.setEnabled(bl);
        this.EyE.setEnabled(bl);
        this.EyF.setEnabled(bl);
        this.EyE.setEnabled(bl);
        this.EyF.setEnabled(bl);
        this.EyI.setEnabled(bl);
        this.EyJ.setEnabled(bl);
        this.EyM.setEnabled(bl);
        this.EyN.setEnabled(bl);
        this.EyQ.setEnabled(bl);
        this.EyR.setEnabled(bl);
        this.EyY.setEnabled(bl);
        this.EyZ.setEnabled(bl);
        this.EyU.setEnabled(bl);
        this.EyV.setEnabled(bl);
        this.Eze.setEnabled(bl);
        this.Ezh.setEnabled(bl);
        this.Ezk.setEnabled(bl);
        this.Ezn.setEnabled(bl);
    }

    private void eOr() {
        int n;
        String string = (String)this.Eyf.getSelectedValue();
        if (this.Ezs != null && (n = this.Ezs.az()) != -1) {
            if (this.rhj.remove(new Integer(n)) != null) {
                this.Eye.remove(string);
                this.Eyf.setListData(this.Eye);
                this.Eyf.revalidate();
                if (this.Eye.size() > 0) {
                    this.Eyf.setSelectedIndex(0);
                    this.eOn();
                }
            } else {
                lfn.b(5, "SFGunCannonTool", "removeCannonInfoEntry() Entry [" + string + "] Not Exist In CannonMap");
            }
        }
    }

    private void eOs() {
        for (Integer n : this.rhj.keySet()) {
            String string = lea.enW().getName(n);
            if (string == null || string.trim().equals("")) continue;
            this.Eye.add(string);
        }
        this.Eyf.setListData(this.Eye);
        this.Eyf.revalidate();
    }

    private void eOt() {
        if (this.Ezs != null) {
            this.eOm();
        }
        this.Ezr.dVa();
        JOptionPane.showInternalMessageDialog(this, "Cannon Info SFFile Saved");
    }

    static /* synthetic */ void a(mtm mtm2) {
        mtm2.eOm();
    }

    static /* synthetic */ void b(mtm mtm2) {
        mtm2.eOn();
    }

    static /* synthetic */ void c(mtm mtm2) {
        mtm2.eOq();
    }

    static /* synthetic */ void d(mtm mtm2) {
        mtm2.eOr();
    }

    static /* synthetic */ void e(mtm mtm2) {
        mtm2.eOt();
    }

    static /* synthetic */ JButton f(mtm mtm2) {
        return mtm2.Eyt;
    }

    static /* synthetic */ void a(mtm mtm2, JButton jButton) {
        mtm2.a(jButton);
    }

    static /* synthetic */ JButton g(mtm mtm2) {
        return mtm2.Eyx;
    }

    static /* synthetic */ JSlider h(mtm mtm2) {
        return mtm2.Eyo;
    }

    static /* synthetic */ JFormattedTextField i(mtm mtm2) {
        return mtm2.Eyp;
    }

    static /* synthetic */ JSlider j(mtm mtm2) {
        return mtm2.EyA;
    }

    static /* synthetic */ JFormattedTextField k(mtm mtm2) {
        return mtm2.EyB;
    }

    static /* synthetic */ JSlider l(mtm mtm2) {
        return mtm2.EyE;
    }

    static /* synthetic */ JFormattedTextField m(mtm mtm2) {
        return mtm2.EyF;
    }

    static /* synthetic */ JSlider n(mtm mtm2) {
        return mtm2.EyI;
    }

    static /* synthetic */ JFormattedTextField o(mtm mtm2) {
        return mtm2.EyJ;
    }

    static /* synthetic */ JSlider p(mtm mtm2) {
        return mtm2.EyM;
    }

    static /* synthetic */ JFormattedTextField q(mtm mtm2) {
        return mtm2.EyN;
    }

    static /* synthetic */ JSlider r(mtm mtm2) {
        return mtm2.EyQ;
    }

    static /* synthetic */ JFormattedTextField s(mtm mtm2) {
        return mtm2.EyR;
    }

    static /* synthetic */ JSlider t(mtm mtm2) {
        return mtm2.EyY;
    }

    static /* synthetic */ JFormattedTextField u(mtm mtm2) {
        return mtm2.EyZ;
    }

    static /* synthetic */ JSlider v(mtm mtm2) {
        return mtm2.EyU;
    }

    static /* synthetic */ JFormattedTextField w(mtm mtm2) {
        return mtm2.EyV;
    }

    static /* synthetic */ JTree x(mtm mtm2) {
        return mtm2.Ezp;
    }

    static /* synthetic */ JTextField y(mtm mtm2) {
        return mtm2.Eys;
    }

    static /* synthetic */ JTextField z(mtm mtm2) {
        return mtm2.Eyw;
    }

    static /* synthetic */ bwm A(mtm mtm2) {
        return mtm2.Ezs;
    }

    static /* synthetic */ JTree B(mtm mtm2) {
        return mtm2.Eix;
    }

    static /* synthetic */ Vector C(mtm mtm2) {
        return mtm2.Eye;
    }

    static /* synthetic */ void a(mtm mtm2, String string) {
        mtm2.Dk(string);
    }
}

