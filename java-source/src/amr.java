/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileFilter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;

public class amr
extends JDialog {
    private Point bAi;
    private File bAj;
    private JComboBox bAk;
    private JSpinner bAl;
    private JLabel bAm;
    private JButton bAn;
    private JTextField bAo;
    private ButtonGroup bAp;
    private JButton bAq;
    private JDialog bAr;
    private JLabel bAs;
    private JTextArea bAt;
    private JRadioButton bAu;
    private JRadioButton bAv;
    private JPanel ad;
    private JPanel bAw;
    private JPanel ae;
    private JScrollPane ah;
    private JSeparator bAx;
    private JRadioButton bAy;
    private JTextField bAz;
    private JLabel bAA;

    public amr(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
    }

    private void b() {
        this.bAp = new ButtonGroup();
        this.bAr = new JDialog();
        this.bAw = new JPanel();
        this.ah = new JScrollPane();
        this.bAt = new JTextArea();
        this.ae = new JPanel();
        this.bAn = new JButton();
        JPanel jPanel = new JPanel();
        JPanel jPanel2 = new JPanel();
        this.bAm = new JLabel();
        this.bAs = new JLabel();
        JPanel jPanel3 = new JPanel();
        this.bAv = new JRadioButton();
        this.bAl = new JSpinner();
        JLabel jLabel = new JLabel();
        this.bAz = new JTextField();
        JLabel jLabel2 = new JLabel();
        this.bAk = new JComboBox();
        this.bAo = new JTextField();
        this.bAy = new JRadioButton();
        this.bAu = new JRadioButton();
        this.bAq = new JButton();
        this.ad = new JPanel();
        this.bAx = new JSeparator();
        this.bAA = new JLabel();
        a a2 = new a(this);
        this.bAr.setMinimumSize(new Dimension(507, 288));
        this.bAr.setModal(true);
        this.bAt.setColumns(20);
        this.bAt.setEditable(false);
        this.bAt.setFont(new Font("Monospaced", 0, 11));
        this.bAt.setRows(5);
        this.ah.setViewportView(this.bAt);
        GroupLayout groupLayout = new GroupLayout(this.bAw);
        this.bAw.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 507, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.ah, -1, 487, Short.MAX_VALUE).addContainerGap())));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 251, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.ah, -1, 229, Short.MAX_VALUE).addContainerGap())));
        this.bAr.getContentPane().add((Component)this.bAw, "Center");
        this.bAn.setText("Dismiss");
        this.bAn.addActionListener(a2);
        GroupLayout groupLayout2 = new GroupLayout(this.ae);
        this.ae.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 507, Short.MAX_VALUE).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGap(0, 220, Short.MAX_VALUE).addComponent(this.bAn).addGap(0, 220, Short.MAX_VALUE))));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 37, Short.MAX_VALUE).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGap(0, 7, Short.MAX_VALUE).addComponent(this.bAn).addGap(0, 7, Short.MAX_VALUE))));
        this.bAr.getContentPane().add((Component)this.ae, "Last");
        this.setDefaultCloseOperation(2);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setUndecorated(true);
        this.addMouseListener(a2);
        this.addMouseMotionListener(a2);
        jPanel.setBackground(new Color(255, 255, 255));
        jPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        jPanel.setLayout(new BorderLayout());
        jPanel2.setBackground(new Color(204, 255, 204));
        jPanel2.setLayout(new BorderLayout());
        this.bAm.setForeground(new Color(255, 51, 51));
        this.bAm.setText("close");
        this.bAm.addMouseListener(a2);
        jPanel2.add((Component)this.bAm, "After");
        this.bAs.setForeground(new Color(0, 0, 255));
        this.bAs.setText("info");
        this.bAs.addMouseListener(a2);
        jPanel2.add((Component)this.bAs, "Before");
        jPanel.add((Component)jPanel2, "First");
        jPanel3.setBackground(new Color(255, 255, 255));
        this.bAv.setBackground(new Color(255, 255, 255));
        this.bAp.add(this.bAv);
        this.bAv.setText("inventory file");
        this.bAv.setToolTipText("A single inventory file");
        this.bAv.addChangeListener(a2);
        this.bAl.setModel(new SpinnerNumberModel((Number)0.0, Double.valueOf(0.0), null, (Number)0.1));
        this.bAl.setToolTipText("Amount to add/remove");
        this.bAl.setEnabled(false);
        jLabel.setText("Amount");
        this.bAz.setHorizontalAlignment(4);
        this.bAz.setToolTipText("Double-click to select a resource");
        this.bAz.addMouseListener(a2);
        jLabel2.setText("Resource");
        this.bAk.setModel(new DefaultComboBoxModel<amq.a>(amq.a.values()));
        this.bAk.setSelectedItem((Object)amq.a.bAd);
        this.bAk.setToolTipText("Choose what action to perform");
        this.bAk.addItemListener(a2);
        this.bAo.setHorizontalAlignment(4);
        this.bAo.setToolTipText("Double-click to select a file");
        this.bAo.setEnabled(false);
        this.bAo.addMouseListener(a2);
        this.bAy.setBackground(new Color(255, 255, 255));
        this.bAp.add(this.bAy);
        this.bAy.setText("load from file");
        this.bAy.setToolTipText("A file listing which inventories should be processed");
        this.bAy.addChangeListener(a2);
        this.bAu.setBackground(new Color(255, 255, 255));
        this.bAp.add(this.bAu);
        this.bAu.setSelected(true);
        this.bAu.setText("all inventories");
        this.bAu.setToolTipText("All monster inventories will be processed");
        this.bAu.addChangeListener(a2);
        this.bAq.setText("FIX!!!");
        this.bAq.addActionListener(a2);
        GroupLayout groupLayout3 = new GroupLayout(jPanel3);
        jPanel3.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.bAu).addGroup(groupLayout3.createSequentialGroup().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bAv).addComponent(this.bAy)).addGap(18, 18, 18).addComponent(this.bAo, -2, 182, -2)).addGroup(groupLayout3.createSequentialGroup().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(groupLayout3.createSequentialGroup().addComponent(jLabel).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bAl)).addComponent(this.bAk, -2, 126, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bAz, -2, 104, -2)).addComponent(this.bAq, GroupLayout.Alignment.TRAILING)).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.bAu).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bAv).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bAy)).addGroup(groupLayout3.createSequentialGroup().addGap(41, 41, 41).addComponent(this.bAo, -2, -1, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.bAk, -2, -1, -2).addComponent(this.bAz, -2, -1, -2).addComponent(jLabel2)).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout3.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel).addComponent(this.bAl, -2, -1, -2)).addContainerGap(16, Short.MAX_VALUE)).addGroup(groupLayout3.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bAq).addContainerGap()))));
        jPanel.add((Component)jPanel3, "Center");
        this.ad.setLayout(new BorderLayout());
        this.ad.add((Component)this.bAx, "First");
        this.bAA.setText("Inventory Fixer v1.0");
        this.ad.add((Component)this.bAA, "Center");
        jPanel.add((Component)this.ad, "Last");
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel, GroupLayout.Alignment.TRAILING, -1, -1, Short.MAX_VALUE));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel, GroupLayout.Alignment.TRAILING, -1, 179, Short.MAX_VALUE));
        this.pack();
    }

    private void c(MouseEvent mouseEvent) {
        this.bAi = mouseEvent.getPoint();
    }

    private void d(MouseEvent mouseEvent) {
        int n = mouseEvent.getX() - this.bAi.x;
        int n2 = mouseEvent.getY() - this.bAi.y;
        this.setLocation(this.getX() + n, this.getY() + n2);
    }

    private void e(MouseEvent mouseEvent) {
        System.exit(0);
    }

    private void f(MouseEvent mouseEvent) {
        this.bAm.setForeground(Color.ORANGE);
    }

    private void g(MouseEvent mouseEvent) {
        this.bAm.setForeground(Color.RED);
    }

    private void e(ChangeEvent changeEvent) {
        if (this.bAv.isSelected()) {
            this.bAo.setEnabled(true);
        }
    }

    private void f(ChangeEvent changeEvent) {
        if (this.bAy.isSelected()) {
            this.bAo.setEnabled(true);
        }
    }

    private void g(ChangeEvent changeEvent) {
        if (this.bAu.isSelected()) {
            this.bAo.setEnabled(false);
        }
    }

    private void h(MouseEvent mouseEvent) {
        if (this.bAo.isEnabled() && mouseEvent.getClickCount() == 2) {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File(amq.bzU));
            int n = jFileChooser.showOpenDialog(this);
            if (n == 0) {
                this.bAj = jFileChooser.getSelectedFile();
                this.bAo.setText(this.bAj.getName());
            }
        }
    }

    private void i(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File(amq.bzV));
            int n = jFileChooser.showOpenDialog(this);
            if (n == 0) {
                String string = jFileChooser.getSelectedFile().getName();
                this.bAz.setText(string.substring(0, string.lastIndexOf(46)));
            }
        }
    }

    private void a(ItemEvent itemEvent) {
        if (this.bAk.getSelectedItem() == amq.a.bAe || this.bAk.getSelectedItem() == amq.a.bAf) {
            this.bAl.setEnabled(true);
        } else {
            this.bAl.setEnabled(false);
        }
    }

    private void r(ActionEvent actionEvent) {
        if ((actionEvent.getModifiers() & 1) == 1) {
            amq.bzW = false;
        }
        this.bAq.setEnabled(false);
        this.bAA.setText("Fixing...");
        mjg mjg2 = new mjg(this){
            final /* synthetic */ amr bAB;
            {
                this.bAB = amr2;
            }

            public Object Hv() {
                double d2;
                String string = amr.f(this.bAB).getText();
                String string2 = string != null && !"".equalsIgnoreCase(string) ? string : null;
                double d3 = d2 = amr.k(this.bAB).isEnabled() ? (Double)amr.k(this.bAB).getValue() : -1.0;
                if (d2 == 0.0) {
                    amr.l(this.bAB).setForeground(Color.RED);
                    return "Amount cannot be 0(zero)";
                }
                amq.a a2 = (amq.a)((Object)amr.c(this.bAB).getSelectedItem());
                if (amr.i(this.bAB).isSelected()) {
                    if (amr.m(this.bAB) == null || "".equalsIgnoreCase(amr.m(this.bAB).getName())) {
                        amr.l(this.bAB).setForeground(Color.RED);
                        return "Missing file name";
                    }
                    amq.b(amr.m(this.bAB), a2, string2, d2);
                } else if (amr.h(this.bAB).isSelected()) {
                    if (amr.m(this.bAB) == null || "".equalsIgnoreCase(amr.m(this.bAB).getName())) {
                        amr.l(this.bAB).setForeground(Color.RED);
                        return "Missing file name";
                    }
                    amq.a(amr.m(this.bAB), a2, string2, d2);
                } else {
                    File[] fileArray = new File[]{};
                    File file = new File(amq.bzU);
                    for (File file2 : fileArray = file.listFiles(new FileFilter(this){
                        final /* synthetic */ 1 bAC;
                        {
                            this.bAC = var1_1;
                        }

                        public boolean accept(File file) {
                            return file.getName().startsWith("inv_");
                        }
                    })) {
                        amq.a(file2, a2, string2, d2);
                    }
                }
                amr.l(this.bAB).setForeground(Color.BLACK);
                return "Done";
            }

            public void finished() {
                amr.a(this.bAB).setEnabled(true);
            }
        };
        mjg2.start();
        this.bAA.setText(mjg2.get().toString());
    }

    private void s(ActionEvent actionEvent) {
        this.bAr.setVisible(false);
    }

    private void j(MouseEvent mouseEvent) {
        this.bAs.setForeground(Color.CYAN);
    }

    private void k(MouseEvent mouseEvent) {
        this.bAs.setForeground(Color.BLUE);
    }

    private void l(MouseEvent mouseEvent) {
        this.bAt.setText(amq.bg(false));
        this.bAr.setLocationByPlatform(true);
        this.bAr.setVisible(true);
    }

    public static void main(String[] stringArray) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException classNotFoundException) {
            Logger.getLogger(amr.class.getName()).log(Level.SEVERE, null, classNotFoundException);
        }
        catch (InstantiationException instantiationException) {
            Logger.getLogger(amr.class.getName()).log(Level.SEVERE, null, instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            Logger.getLogger(amr.class.getName()).log(Level.SEVERE, null, illegalAccessException);
        }
        catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
            Logger.getLogger(amr.class.getName()).log(Level.SEVERE, null, unsupportedLookAndFeelException);
        }
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                amr amr2 = new amr((Frame)new JFrame(), true);
                amr2.addWindowListener(new WindowAdapter(this){
                    final /* synthetic */ 2 bAD;
                    {
                        this.bAD = var1_1;
                    }

                    public void windowClosing(WindowEvent windowEvent) {
                        System.exit(0);
                    }
                });
                amr2.setLocationRelativeTo(null);
                amr2.setVisible(true);
            }
        });
    }

    static /* synthetic */ JButton a(amr amr2) {
        return amr2.bAq;
    }

    static /* synthetic */ void a(amr amr2, ActionEvent actionEvent) {
        amr2.r(actionEvent);
    }

    static /* synthetic */ JButton b(amr amr2) {
        return amr2.bAn;
    }

    static /* synthetic */ void b(amr amr2, ActionEvent actionEvent) {
        amr2.s(actionEvent);
    }

    static /* synthetic */ JComboBox c(amr amr2) {
        return amr2.bAk;
    }

    static /* synthetic */ void a(amr amr2, ItemEvent itemEvent) {
        amr2.a(itemEvent);
    }

    static /* synthetic */ JLabel d(amr amr2) {
        return amr2.bAm;
    }

    static /* synthetic */ void a(amr amr2, MouseEvent mouseEvent) {
        amr2.e(mouseEvent);
    }

    static /* synthetic */ JLabel e(amr amr2) {
        return amr2.bAs;
    }

    static /* synthetic */ void b(amr amr2, MouseEvent mouseEvent) {
        amr2.l(mouseEvent);
    }

    static /* synthetic */ JTextField f(amr amr2) {
        return amr2.bAz;
    }

    static /* synthetic */ void c(amr amr2, MouseEvent mouseEvent) {
        amr2.i(mouseEvent);
    }

    static /* synthetic */ JTextField g(amr amr2) {
        return amr2.bAo;
    }

    static /* synthetic */ void d(amr amr2, MouseEvent mouseEvent) {
        amr2.h(mouseEvent);
    }

    static /* synthetic */ void e(amr amr2, MouseEvent mouseEvent) {
        amr2.f(mouseEvent);
    }

    static /* synthetic */ void f(amr amr2, MouseEvent mouseEvent) {
        amr2.j(mouseEvent);
    }

    static /* synthetic */ void g(amr amr2, MouseEvent mouseEvent) {
        amr2.g(mouseEvent);
    }

    static /* synthetic */ void h(amr amr2, MouseEvent mouseEvent) {
        amr2.k(mouseEvent);
    }

    static /* synthetic */ void i(amr amr2, MouseEvent mouseEvent) {
        amr2.c(mouseEvent);
    }

    static /* synthetic */ void j(amr amr2, MouseEvent mouseEvent) {
        amr2.d(mouseEvent);
    }

    static /* synthetic */ JRadioButton h(amr amr2) {
        return amr2.bAv;
    }

    static /* synthetic */ void a(amr amr2, ChangeEvent changeEvent) {
        amr2.e(changeEvent);
    }

    static /* synthetic */ JRadioButton i(amr amr2) {
        return amr2.bAy;
    }

    static /* synthetic */ void b(amr amr2, ChangeEvent changeEvent) {
        amr2.f(changeEvent);
    }

    static /* synthetic */ JRadioButton j(amr amr2) {
        return amr2.bAu;
    }

    static /* synthetic */ void c(amr amr2, ChangeEvent changeEvent) {
        amr2.g(changeEvent);
    }

    static /* synthetic */ JSpinner k(amr amr2) {
        return amr2.bAl;
    }

    static /* synthetic */ JLabel l(amr amr2) {
        return amr2.bAA;
    }

    static /* synthetic */ File m(amr amr2) {
        return amr2.bAj;
    }
}

