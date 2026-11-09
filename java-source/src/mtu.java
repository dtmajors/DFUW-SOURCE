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
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.LayoutStyle;
import javax.swing.border.SoftBevelBorder;
import javax.swing.tree.DefaultMutableTreeNode;

public class mtu
extends mkx {
    private aux DEC = null;
    private final Dimension DDN = new Dimension(897, 878);
    private JTaskPane Eqk = new JTaskPane();
    private JTaskPaneGroup EDk = new JTaskPaneGroup();
    private JTree Eix;
    private DefaultMutableTreeNode EiD;
    private Map<String, cur> rho = lea.eos();
    private kbn EDl = new kbn();
    private kbu EDm = new kbu();
    private Map<cur, lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>>> EDn = lcn.emw();
    protected JButton DFU;
    protected JPanel DLe;
    protected JComboBox EDo;
    protected JCheckBox EDp;
    protected JCheckBox EDq;
    protected JPanel EDr;
    protected JCheckBox EDs;
    protected JCheckBox EDt;
    protected JComboBox EDu;
    protected JButton DNZ;
    protected JButton qtf;
    protected JPanel EDv;
    protected JTextField Eot;
    protected JComboBox DJh;
    private JFormattedTextField EDw;
    protected JPanel EDx;
    protected JScrollPane EDy;
    protected JLabel I;
    protected JLabel P;
    protected JLabel Q;
    protected JLabel R;
    protected JLabel EDz;
    protected JLabel EDA;

    public mtu() {
        super(false);
        this.b();
        this.setTitle("Weapon Reach Editor");
        this.setClosable(true);
        this.setSize(this.DDN);
        this.setResizable(false);
        this.r();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
        this.DEC.getAlignmentX();
    }

    private void b() {
        this.EDx = new JPanel();
        this.EDy = new JScrollPane();
        this.DLe = new JPanel();
        this.DNZ = new JButton();
        this.DFU = new JButton();
        this.EDz = new JLabel();
        this.EDA = new JLabel();
        this.EDv = new JPanel();
        this.DJh = new JComboBox();
        this.EDu = new JComboBox();
        this.I = new JLabel();
        this.P = new JLabel();
        this.Q = new JLabel();
        this.Eot = new JTextField();
        this.qtf = new JButton();
        this.EDr = new JPanel();
        this.EDs = new JCheckBox();
        this.EDt = new JCheckBox();
        this.EDq = new JCheckBox();
        this.EDw = new JFormattedTextField(new DecimalFormat("#.#"));
        this.setBorder(BorderFactory.createEtchedBorder());
        this.setIconifiable(true);
        this.setTitle("Weapon Reach Editor");
        GroupLayout groupLayout = new GroupLayout(this.EDx);
        this.EDx.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EDy, -1, 774, Short.MAX_VALUE));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EDy, -1, 738, Short.MAX_VALUE));
        this.DLe.setBorder(BorderFactory.createBevelBorder(0));
        this.DNZ.setText("Save");
        this.DFU.setText("Add");
        this.EDz.setText("Number Of Weapons");
        this.EDA.setText(" ");
        this.EDA.setBorder(BorderFactory.createEtchedBorder());
        GroupLayout groupLayout2 = new GroupLayout(this.DLe);
        this.DLe.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addComponent(this.EDz).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EDA, -2, 52, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 607, Short.MAX_VALUE).addComponent(this.DFU).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DNZ).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DNZ).addComponent(this.DFU).addComponent(this.EDz).addComponent(this.EDA)).addContainerGap()));
        this.EDv.setBorder(new SoftBevelBorder(0));
        this.DJh.setModel(new DefaultComboBoxModel<String>(new String[]{"All", "Melee", "Magic Staffs", "Bows"}));
        this.EDu.setModel(new DefaultComboBoxModel<String>(new String[]{"------", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100"}));
        this.I.setText(" Type");
        this.P.setText("Rank");
        this.Q.setText("Item Name");
        this.qtf.setText("Search");
        GroupLayout groupLayout3 = new GroupLayout(this.EDv);
        this.EDv.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.Q).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Eot, -2, 155, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.qtf).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE).addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DJh, -2, 173, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.P, -2, 32, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EDu, -2, 55, -2).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Q).addComponent(this.Eot, -2, -1, -2).addComponent(this.qtf).addComponent(this.EDu, -2, -1, -2).addComponent(this.P).addComponent(this.DJh, -2, -1, -2).addComponent(this.I)).addContainerGap(-1, Short.MAX_VALUE)));
        this.EDr.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 0, 0)));
        this.EDs.setText("Lock Rank");
        this.EDt.setText("Lock Reach");
        this.EDq.setText("Lock Angle");
        this.EDw.setText("100");
        this.EDw.setBorder(BorderFactory.createTitledBorder("Unit"));
        GroupLayout groupLayout4 = new GroupLayout(this.EDr);
        this.EDr.setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EDw, -1, 89, Short.MAX_VALUE).addComponent(this.EDs).addComponent(this.EDt).addComponent(this.EDq)).addContainerGap()));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addComponent(this.EDs).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.EDt).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.EDq).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 596, Short.MAX_VALUE).addComponent(this.EDw, -2, -1, -2).addContainerGap()));
        GroupLayout groupLayout5 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout5);
        groupLayout5.setHorizontalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EDv, -1, -1, Short.MAX_VALUE).addComponent(this.DLe, GroupLayout.Alignment.TRAILING, -1, -1, Short.MAX_VALUE).addGroup(groupLayout5.createSequentialGroup().addComponent(this.EDx, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EDr, -1, -1, Short.MAX_VALUE)));
        groupLayout5.setVerticalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addComponent(this.EDv, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EDr, -1, -1, Short.MAX_VALUE).addComponent(this.EDx, -1, -1, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DLe, -2, -1, -2)));
        this.pack();
    }

    private void r() {
        this.EDy.getViewport().add((Component)this.Eqk);
        this.Eqk.add(this.EDk);
        this.EDk.setTitle("Weapons");
        this.ePf();
        ArrayList<String> arrayList = lcn.emv();
        arrayList.add("All");
        int n = 0;
        while ((float)n < 85.0f) {
            arrayList.add(String.valueOf(n));
            n += 5;
        }
        this.EDu.setModel(new DefaultComboBoxModel<Object>(arrayList.toArray()));
        ArrayList<String> arrayList2 = lcn.emv();
        arrayList2.add("All");
        ler ler2 = lea.enW().acv(cug.fiL);
        List<ler> list = lea.enW().a(ler2, true, true);
        for (int i = 0; i < list.size(); ++i) {
            ler ler3 = list.get(i);
            List<ler> list2 = lea.enW().a(ler3, true, true);
            boolean bl = list2 != null && !list2.isEmpty();
            boolean bl2 = lea.enW().isDescendant(ler3.getType(), cug.fiK);
            if (ler3.getType() == cug.fiK || bl2 || !bl) continue;
            String string = ler3.getName();
            arrayList2.add(string);
        }
        this.DJh.setModel(new DefaultComboBoxModel<Object>(arrayList2.toArray()));
        this.DNZ.addActionListener(new ActionListener(this){
            final /* synthetic */ mtu EDB;
            {
                this.EDB = mtu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtu.a(this.EDB);
            }
        });
        this.DFU.addActionListener(new ActionListener(this){
            final /* synthetic */ mtu EDB;
            {
                this.EDB = mtu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtu.b(this.EDB);
            }
        });
        this.qtf.addActionListener(new ActionListener(this){
            final /* synthetic */ mtu EDB;
            {
                this.EDB = mtu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtu.c(this.EDB);
            }
        });
        this.Eot.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mtu EDB;
            {
                this.EDB = mtu2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                int n = keyEvent.getKeyCode();
                if (n == 10) {
                    mtu.c(this.EDB);
                }
            }
        });
        this.EDu.addActionListener(new ActionListener(this){
            final /* synthetic */ mtu EDB;
            {
                this.EDB = mtu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (this.EDB.EDu.getSelectedIndex() != -1) {
                    float f2 = this.EDB.EDu.getSelectedIndex() != 0 ? Float.valueOf((String)this.EDB.EDu.getSelectedItem()).floatValue() : -1.0f;
                    mtu.a(this.EDB, f2);
                }
            }
        });
        this.DJh.addActionListener(new ActionListener(this){
            final /* synthetic */ mtu EDB;
            {
                this.EDB = mtu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                if (this.EDB.DJh.getSelectedIndex() != -1) {
                    int n = lea.enW().getType((String)this.EDB.DJh.getSelectedItem());
                    mtu.a(this.EDB, n);
                }
            }
        });
    }

    private void eiV() {
        this.EDk.removeAll();
        Component[] componentArray = this.EDk.getComponents();
        for (int i = 0; i < componentArray.length; ++i) {
            this.EDk.remove(componentArray[i]);
        }
        this.EDk.revalidate();
        this.EDn.clear();
        this.DJh.setSelectedIndex(0);
        this.EDu.setSelectedIndex(0);
        String string = this.Eot.getText();
        if (string != null) {
            if (string.length() == 0) {
                this.ePf();
            } else {
                for (String string2 : this.rho.keySet()) {
                    if (!string2.contains(string.toLowerCase())) continue;
                    cur cur2 = this.rho.get(string2);
                    lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>> lil2 = this.a(string2, cur2);
                    this.EDn.put(cur2, lil2);
                }
            }
        }
    }

    private void oE(float f2) {
        this.EDk.removeAll();
        this.EDk.revalidate();
        this.EDn.clear();
        boolean bl = this.Eot.getText() != null && !this.Eot.getText().equals("");
        boolean bl2 = this.DJh.getSelectedIndex() != -1 && this.DJh.getSelectedIndex() != 0;
        boolean bl3 = true;
        for (Map.Entry<String, cur> entry : this.rho.entrySet()) {
            int n;
            int n2;
            cur cur2 = entry.getValue();
            String string = entry.getKey();
            if (f2 != -1.0f) {
                int n3 = n2 = bl && string.contains(this.Eot.getText()) || !bl ? 1 : 0;
                if (bl2) {
                    n = lea.enW().getType((String)this.DJh.getSelectedItem());
                    boolean bl4 = lea.enW().isDescendant(cur2.ResourceType, n);
                    boolean bl5 = bl3 = bl2 && bl4 || !bl2;
                }
                if (cur2.fyc != f2 || n2 == 0 || !bl3) continue;
                lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>> lil2 = this.a(string, cur2);
                this.EDn.put(cur2, lil2);
                continue;
            }
            n2 = lea.enW().getType((String)this.DJh.getSelectedItem());
            n = lea.enW().isDescendant(cur2.ResourceType, n2);
            boolean bl6 = bl3 = bl2 && n != 0 || !bl2;
            if ((!bl || !string.contains(this.Eot.getText())) && bl || !bl3) continue;
            lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>> lil3 = this.a(string, cur2);
            this.EDn.put(cur2, lil3);
        }
    }

    private void afC(int n) {
        this.EDk.removeAll();
        this.EDk.revalidate();
        this.EDn.clear();
        boolean bl = this.Eot.getText() != null && !this.Eot.getText().equals("");
        boolean bl2 = this.EDu.getSelectedIndex() != -1 && this.EDu.getSelectedIndex() != 0;
        boolean bl3 = true;
        boolean bl4 = true;
        for (Map.Entry<String, cur> entry : this.rho.entrySet()) {
            lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>> lil2;
            cur cur2 = entry.getValue();
            String string = entry.getKey();
            boolean bl5 = lea.enW().isDescendant(cur2.ResourceType, n);
            if (n != -1) {
                bl3 = bl && string.contains(this.Eot.getText()) || !bl;
                boolean bl6 = bl4 = bl2 && cur2.fyc == Float.parseFloat((String)this.EDu.getSelectedItem()) || !bl2;
                if (!bl5 || !bl3 || !bl4) continue;
                lil2 = this.a(string, cur2);
                this.EDn.put(cur2, lil2);
                continue;
            }
            bl3 = bl && string.contains(this.Eot.getText()) || !bl;
            boolean bl7 = bl4 = bl2 && cur2.fyc == Float.parseFloat((String)this.EDu.getSelectedItem()) || !bl2;
            if (!bl3 || !bl4) continue;
            lil2 = this.a(string, cur2);
            this.EDn.put(cur2, lil2);
        }
    }

    private void a(JSlider jSlider, float f2) {
        boolean bl = this.EDs.isSelected();
        if (bl) {
            for (Map.Entry<cur, lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>>> entry : this.EDn.entrySet()) {
                lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>> lil2 = entry.getValue();
                lfs lfs2 = (lfs)lil2.reX;
                JSlider jSlider2 = (JSlider)lfs2.reX;
                JLabel jLabel = (JLabel)lfs2.reY;
                if (jSlider != jSlider2) {
                    float f3 = f2;
                    jSlider2.setValue((int)f3);
                    jLabel.setText(String.valueOf(f3));
                }
                cur cur2 = entry.getKey();
                cur2.fyc = f2;
            }
        }
    }

    private void b(JSlider jSlider, float f2) {
        boolean bl = this.EDt.isSelected();
        if (bl) {
            for (Map.Entry<cur, lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>>> entry : this.EDn.entrySet()) {
                lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>> lil2 = entry.getValue();
                lfs lfs2 = (lfs)lil2.reY;
                JSlider jSlider2 = (JSlider)lfs2.reX;
                JLabel jLabel = (JLabel)lfs2.reY;
                if (jSlider != jSlider2) {
                    float f3 = f2;
                    jSlider2.setValue((int)(f3 * 10.0f));
                    jLabel.setText(String.valueOf(f3));
                }
                cur cur2 = entry.getKey();
                if (!lea.enW().isDescendant(cur2.ResourceType, cug.fiC)) continue;
                cur2.bFz = f2;
            }
        }
    }

    private void c(JSlider jSlider, float f2) {
        boolean bl = this.EDq.isSelected();
        if (bl) {
            for (Map.Entry<cur, lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>>> entry : this.EDn.entrySet()) {
                lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>> lil2 = entry.getValue();
                lfs lfs2 = (lfs)lil2.reZ;
                JSlider jSlider2 = (JSlider)lfs2.reX;
                JLabel jLabel = (JLabel)lfs2.reY;
                if (jSlider != jSlider2) {
                    float f3 = f2;
                    jSlider2.setValue((int)f3);
                    jLabel.setText(String.valueOf(f3));
                }
                cur cur2 = entry.getKey();
                if (!lea.enW().isDescendant(cur2.ResourceType, cug.fiC)) continue;
                cur2.fyb = f2;
            }
        }
    }

    private void ePf() {
        block3: {
            try {
                this.rho = this.EDl.dUZ();
            }
            catch (bg bg2) {
                lfn.log("SFWeaponReachEditor", bg2);
                if ($assertionsDisabled) break block3;
                throw new AssertionError();
            }
        }
        for (String string : this.rho.keySet()) {
            cur cur2 = this.rho.get(string);
            lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>> lil2 = this.a(string, cur2);
            this.EDn.put(cur2, lil2);
        }
        this.EDw.setText(String.valueOf(this.EDl.dUY()));
    }

    private void ePg() {
        int n = JOptionPane.showConfirmDialog(this, "Do you want to save the changes?", "Save Weapon Reach Map.", 1);
        if (n == 0) {
            float f2 = Float.parseFloat(this.EDw.getText());
            this.EDm.a(this.rho, f2);
        }
    }

    private lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>> a(String string, cur cur2) {
        float f2 = cur2.fyb;
        float f3 = cur2.fyc;
        float f4 = cur2.bFz;
        boolean bl = lea.enW().isDescendant(cur2.ResourceType, cug.fiC);
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.setOpaque(false);
        JPanel jPanel2 = new JPanel(new GridLayout());
        jPanel2.setOpaque(false);
        JPanel jPanel3 = new JPanel(new BorderLayout());
        jPanel3.setOpaque(false);
        JTextField jTextField = new JTextField();
        jTextField.setForeground(Color.BLUE);
        jTextField.setText(string);
        jTextField.setEditable(false);
        jPanel3.add((Component)jTextField, "Center");
        JPanel jPanel4 = new JPanel(new BorderLayout());
        JLabel jLabel = new JLabel(" Reach :");
        jLabel.setForeground(Color.BLUE);
        JLabel jLabel2 = new JLabel(String.valueOf(f4));
        jPanel4.setOpaque(false);
        jLabel2.setBorder(BorderFactory.createTitledBorder(""));
        jLabel2.setOpaque(false);
        JSlider jSlider = new JSlider();
        if (bl) {
            jSlider.setOpaque(false);
            jSlider.setMinimum(0);
            jSlider.setMaximum(30);
            jSlider.setMajorTickSpacing(1);
            jSlider.setMinorTickSpacing(1);
            jSlider.setSnapToTicks(true);
            jSlider.addMouseListener(new MouseAdapter(this, jSlider, jLabel2, string){
                final /* synthetic */ JSlider EDI;
                final /* synthetic */ JLabel EDJ;
                final /* synthetic */ String EDE;
                final /* synthetic */ mtu EDB;
                {
                    this.EDB = mtu2;
                    this.EDI = jSlider;
                    this.EDJ = jLabel;
                    this.EDE = string;
                }

                public void mouseReleased(MouseEvent mouseEvent) {
                    float f2 = (float)this.EDI.getValue() / 10.0f;
                    this.EDJ.setText(String.valueOf(f2));
                    cur cur2 = (cur)mtu.d(this.EDB).get(this.EDE);
                    cur2.bFz = f2;
                    mtu.a(this.EDB, this.EDI, f2);
                }
            });
            jSlider.addKeyListener(new KeyAdapter(this, jSlider, jLabel2, string){
                final /* synthetic */ JSlider EDI;
                final /* synthetic */ JLabel EDJ;
                final /* synthetic */ String EDE;
                final /* synthetic */ mtu EDB;
                {
                    this.EDB = mtu2;
                    this.EDI = jSlider;
                    this.EDJ = jLabel;
                    this.EDE = string;
                }

                public void keyReleased(KeyEvent keyEvent) {
                    if (keyEvent.getKeyCode() == 37 || keyEvent.getKeyCode() == 39) {
                        float f2 = (float)this.EDI.getValue() / 10.0f;
                        this.EDJ.setText(String.valueOf(f2));
                        cur cur2 = (cur)mtu.d(this.EDB).get(this.EDE);
                        cur2.bFz = f2;
                        mtu.a(this.EDB, this.EDI, f2);
                    }
                }
            });
        } else {
            jSlider.setEnabled(false);
            jSlider.setVisible(false);
            jLabel.setVisible(false);
            jLabel2.setVisible(false);
        }
        jPanel4.add((Component)jLabel, "West");
        jPanel4.add((Component)jSlider, "Center");
        String string2 = String.valueOf(f4 * 10.0f);
        string2 = string2.substring(0, string2.indexOf("."));
        jSlider.setValue(Integer.valueOf(string2));
        jSlider.revalidate();
        jPanel4.add((Component)jLabel2, "East");
        JPanel jPanel5 = new JPanel(new BorderLayout());
        JLabel jLabel3 = new JLabel(" Angle :");
        jLabel3.setForeground(Color.BLUE);
        JLabel jLabel4 = new JLabel(String.valueOf(f2));
        JSlider jSlider2 = new JSlider();
        if (bl) {
            jSlider2.setOpaque(false);
            jSlider2.setValue(0);
            jSlider2.setMinimum(0);
            jSlider2.setMaximum(360);
            jSlider2.setMajorTickSpacing(5);
            jSlider2.setMinorTickSpacing(5);
            jSlider2.addMouseListener(new MouseAdapter(this, jSlider2, jLabel4, string){
                final /* synthetic */ JSlider EDC;
                final /* synthetic */ JLabel EDD;
                final /* synthetic */ String EDE;
                final /* synthetic */ mtu EDB;
                {
                    this.EDB = mtu2;
                    this.EDC = jSlider;
                    this.EDD = jLabel;
                    this.EDE = string;
                }

                public void mouseReleased(MouseEvent mouseEvent) {
                    float f2 = this.EDC.getValue();
                    this.EDD.setText(String.valueOf(f2));
                    cur cur2 = (cur)mtu.d(this.EDB).get(this.EDE);
                    cur2.fyb = f2;
                    mtu.b(this.EDB, this.EDC, f2);
                }
            });
            jSlider2.addKeyListener(new KeyAdapter(this, jSlider2, jLabel4, string){
                final /* synthetic */ JSlider EDC;
                final /* synthetic */ JLabel EDD;
                final /* synthetic */ String EDE;
                final /* synthetic */ mtu EDB;
                {
                    this.EDB = mtu2;
                    this.EDC = jSlider;
                    this.EDD = jLabel;
                    this.EDE = string;
                }

                public void keyReleased(KeyEvent keyEvent) {
                    if (keyEvent.getKeyCode() == 37 || keyEvent.getKeyCode() == 39) {
                        float f2 = this.EDC.getValue();
                        this.EDD.setText(String.valueOf(f2));
                        cur cur2 = (cur)mtu.d(this.EDB).get(this.EDE);
                        cur2.fyb = f2;
                        mtu.b(this.EDB, this.EDC, f2);
                    }
                }
            });
        } else {
            jSlider2.setEnabled(false);
            jSlider2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
        }
        jLabel4.setBorder(BorderFactory.createTitledBorder(""));
        jPanel5.add((Component)jLabel3, "West");
        jPanel5.add((Component)jSlider2, "Center");
        jPanel5.add((Component)jLabel4, "East");
        jSlider2.setValue((int)f2);
        jSlider2.revalidate();
        JPanel jPanel6 = new JPanel(new BorderLayout());
        jPanel6.setOpaque(false);
        JLabel jLabel5 = new JLabel(" Rank :");
        jLabel5.setForeground(Color.BLUE);
        JLabel jLabel6 = new JLabel(String.valueOf(f3));
        jLabel6.setBorder(BorderFactory.createTitledBorder(""));
        jLabel6.setOpaque(false);
        JSlider jSlider3 = new JSlider();
        jSlider3.setOpaque(false);
        jSlider3.setMinimum(0);
        jSlider3.setMaximum(80);
        jSlider3.setMajorTickSpacing(5);
        jSlider3.setMinorTickSpacing(5);
        jSlider3.addMouseListener(new MouseAdapter(this, jSlider3, jLabel6, string){
            final /* synthetic */ JSlider EDF;
            final /* synthetic */ JLabel EDG;
            final /* synthetic */ String EDE;
            final /* synthetic */ mtu EDB;
            {
                this.EDB = mtu2;
                this.EDF = jSlider;
                this.EDG = jLabel;
                this.EDE = string;
            }

            public void mouseReleased(MouseEvent mouseEvent) {
                if (mouseEvent.getClickCount() == 1 && mouseEvent.getButton() == 1) {
                    float f2 = this.EDF.getValue();
                    this.EDG.setText(String.valueOf(f2));
                    cur cur2 = (cur)mtu.d(this.EDB).get(this.EDE);
                    cur2.fyc = f2;
                    mtu.c(this.EDB, this.EDF, f2);
                }
            }
        });
        jSlider3.addKeyListener(new KeyAdapter(this, jSlider3, jLabel6, string){
            final /* synthetic */ JSlider EDF;
            final /* synthetic */ JLabel EDG;
            final /* synthetic */ String EDE;
            final /* synthetic */ mtu EDB;
            {
                this.EDB = mtu2;
                this.EDF = jSlider;
                this.EDG = jLabel;
                this.EDE = string;
            }

            public void keyReleased(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 37 || keyEvent.getKeyCode() == 39) {
                    float f2 = this.EDF.getValue();
                    this.EDG.setText(String.valueOf(f2));
                    cur cur2 = (cur)mtu.d(this.EDB).get(this.EDE);
                    cur2.fyc = f2;
                    mtu.c(this.EDB, this.EDF, f2);
                }
            }
        });
        jPanel6.add((Component)jLabel5, "West");
        jPanel6.add((Component)jSlider3, "Center");
        jSlider3.setValue((int)f3);
        jSlider3.revalidate();
        jPanel6.add((Component)jLabel6, "East");
        jPanel2.add(jPanel3);
        jPanel2.add(jPanel4);
        jPanel2.add(jPanel5);
        jPanel2.add(jPanel6);
        JPanel jPanel7 = new JPanel(new GridLayout());
        jPanel7.setOpaque(false);
        JButton jButton = new JButton("X");
        jButton.setForeground(Color.RED);
        jPanel7.add(jButton);
        jButton.addActionListener(new ActionListener(this, jPanel, string){
            final /* synthetic */ JPanel EDH;
            final /* synthetic */ String EDE;
            final /* synthetic */ mtu EDB;
            {
                this.EDB = mtu2;
                this.EDH = jPanel;
                this.EDE = string;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mtu.e(this.EDB).remove((Component)this.EDH);
                mtu.d(this.EDB).remove(this.EDE);
                mtu.e(this.EDB).revalidate();
            }
        });
        jPanel.add((Component)jPanel2, "Center");
        jPanel.add((Component)jPanel7, "East");
        this.EDk.add((Component)jPanel);
        this.EDk.revalidate();
        return new lil<lfs<JSlider, JLabel>, lfs<JSlider, JLabel>, lfs<JSlider, JLabel>>(new lfs<JSlider, JLabel>(jSlider3, jLabel6), new lfs<JSlider, JLabel>(jSlider, jLabel2), new lfs<JSlider, JLabel>(jSlider2, jLabel4));
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
            final /* synthetic */ mtu EDB;
            {
                this.EDB = mtu2;
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
            final /* synthetic */ mtu EDB;
            {
                this.EDB = mtu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                DefaultMutableTreeNode defaultMutableTreeNode;
                int[] nArray = mtu.f(this.EDB).getSelectionRows();
                if (nArray != null && (defaultMutableTreeNode = (DefaultMutableTreeNode)mtu.f(this.EDB).getLastSelectedPathComponent()).isLeaf()) {
                    String string = defaultMutableTreeNode.toString();
                    if (!mtu.d(this.EDB).containsKey(string)) {
                        int n = lea.enW().getType(string);
                        cur cur2 = new cur(n, 0.0f, 0.0f, 0.0f, -1, 0.0f, -1, 0.0f);
                        mtu.d(this.EDB).put(string, cur2);
                        lil lil2 = mtu.a(this.EDB, string, cur2);
                        mtu.g(this.EDB).put(cur2, lil2);
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
        this.EiD = new DefaultMutableTreeNode("Weapons");
        les les2 = lea.enW();
        ler ler2 = les2.eqq();
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), cug.fkd);
            if (bl) {
                this.c(this.EiD, les2, ler3);
                break;
            }
            ler3 = les2.h(ler3);
        }
    }

    private void c(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            boolean bl = les2.isDescendant(ler3.getType(), cug.fiL);
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

    static /* synthetic */ void a(mtu mtu2) {
        mtu2.ePg();
    }

    static /* synthetic */ void b(mtu mtu2) {
        mtu2.eOq();
    }

    static /* synthetic */ void c(mtu mtu2) {
        mtu2.eiV();
    }

    static /* synthetic */ void a(mtu mtu2, float f2) {
        mtu2.oE(f2);
    }

    static /* synthetic */ void a(mtu mtu2, int n) {
        mtu2.afC(n);
    }

    static /* synthetic */ Map d(mtu mtu2) {
        return mtu2.rho;
    }

    static /* synthetic */ void a(mtu mtu2, JSlider jSlider, float f2) {
        mtu2.b(jSlider, f2);
    }

    static /* synthetic */ void b(mtu mtu2, JSlider jSlider, float f2) {
        mtu2.c(jSlider, f2);
    }

    static /* synthetic */ void c(mtu mtu2, JSlider jSlider, float f2) {
        mtu2.a(jSlider, f2);
    }

    static /* synthetic */ JTaskPaneGroup e(mtu mtu2) {
        return mtu2.EDk;
    }

    static /* synthetic */ JTree f(mtu mtu2) {
        return mtu2.Eix;
    }

    static /* synthetic */ lil a(mtu mtu2, String string, cur cur2) {
        return mtu2.a(string, cur2);
    }

    static /* synthetic */ Map g(mtu mtu2) {
        return mtu2.EDn;
    }
}

