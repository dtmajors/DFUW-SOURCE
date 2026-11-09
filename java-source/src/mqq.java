/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.layout.GroupLayout;

public class mqq
extends JInternalFrame {
    private JButton DFU;
    private JButton Egd;
    private JTextField Ege;
    private JTextField DRQ;
    private JMenuItem Egf;
    private JTextField Egg;
    private JCheckBox Egh;
    private mku Egi;
    private JButton Egj;
    private JButton DFV;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JPopupMenu Egk;
    private JScrollPane ah;
    private JTable Egl;
    private dsh Egm = null;
    private aux DEC;

    public mqq() {
        this.b();
        this.c();
    }

    private void b() {
        this.Egk = new JPopupMenu();
        this.Egf = new JMenuItem();
        this.aa = new JPanel();
        this.Egi = new mku();
        this.bN = new JPanel();
        this.Egh = new JCheckBox();
        this.I = new JLabel();
        this.Egg = new JTextField();
        this.Egd = new JButton();
        this.P = new JLabel();
        this.Q = new JLabel();
        this.DRQ = new JTextField();
        this.Ege = new JTextField();
        this.ac = new JPanel();
        this.ah = new JScrollPane();
        this.Egl = new JTable();
        this.DFU = new JButton();
        this.DFV = new JButton();
        this.Egj = new JButton();
        this.Egf.setText("Go To Object TargetPosition");
        this.Egf.addActionListener(new ActionListener(this){
            final /* synthetic */ mqq Egn;
            {
                this.Egn = mqq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqq.a(this.Egn, actionEvent);
            }
        });
        this.Egk.add(this.Egf);
        this.setClosable(true);
        this.setTitle("Portal Properties");
        this.bN.setBorder(BorderFactory.createTitledBorder("Key Properties"));
        this.Egh.setText("Needs a key");
        this.Egh.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.Egh.setMargin(new Insets(0, 0, 0, 0));
        this.Egh.addActionListener(new ActionListener(this){
            final /* synthetic */ mqq Egn;
            {
                this.Egn = mqq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqq.b(this.Egn, actionEvent);
            }
        });
        this.I.setText("Key Resource Type:");
        this.Egd.setText("Choose..");
        this.Egd.addActionListener(new ActionListener(this){
            final /* synthetic */ mqq Egn;
            {
                this.Egn = mqq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqq.c(this.Egn, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.Egh).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.I).addPreferredGap(0).add((Component)this.Egg, -1, 272, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.Egd))).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.Egh).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.Egd).add((Component)this.Egg, -2, -1, -2)).addContainerGap(-1, Short.MAX_VALUE)));
        this.P.setText("Filename:");
        this.Q.setText("DisplayName:");
        this.DRQ.setEditable(false);
        this.Ege.addFocusListener(new FocusAdapter(this){
            final /* synthetic */ mqq Egn;
            {
                this.Egn = mqq2;
            }

            public void focusLost(FocusEvent focusEvent) {
                mqq.a(this.Egn, focusEvent);
            }
        });
        this.ac.setBorder(BorderFactory.createTitledBorder("Targets"));
        this.Egl.setComponentPopupMenu(this.Egk);
        this.Egl.setModel(new DefaultTableModel(this, new Object[][]{{null, null}, {null, null}, {null, null}, {null, null}}, new String[]{"TargetPosition", "Tile"}){
            boolean[] Ego;
            final /* synthetic */ mqq Egn;
            {
                this.Egn = mqq2;
                super(objectArray, objectArray2);
                this.Ego = new boolean[]{false, false};
            }

            public boolean isCellEditable(int n, int n2) {
                return this.Ego[n2];
            }
        });
        this.Egl.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mqq Egn;
            {
                this.Egn = mqq2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                mqq.a(this.Egn, mouseEvent);
            }
        });
        this.ah.setViewportView(this.Egl);
        this.DFU.setText("Add");
        this.DFU.addActionListener(new ActionListener(this){
            final /* synthetic */ mqq Egn;
            {
                this.Egn = mqq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqq.d(this.Egn, actionEvent);
            }
        });
        this.DFV.setText("Remove");
        this.DFV.addActionListener(new ActionListener(this){
            final /* synthetic */ mqq Egn;
            {
                this.Egn = mqq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqq.e(this.Egn, actionEvent);
            }
        });
        this.Egj.setText("Refresh Target List");
        this.Egj.addActionListener(new ActionListener(this){
            final /* synthetic */ mqq Egn;
            {
                this.Egn = mqq2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqq.f(this.Egn, actionEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.ah, -1, 456, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.DFU).addPreferredGap(0).add((Component)this.DFV).addPreferredGap(1).add((Component)this.Egj))).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.ah, -1, 160, Short.MAX_VALUE).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.DFU).add((Component)this.DFV).add((Component)this.Egj)).addContainerGap()));
        GroupLayout groupLayout3 = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((GroupLayout.Group)groupLayout3.createParallelGroup(1).add(2, (Component)this.P).add(2, (Component)this.Q)).addPreferredGap(0).add((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.DRQ, -1, 223, Short.MAX_VALUE).add((Component)this.Ege, -1, 223, Short.MAX_VALUE)).add(206, 206, 206)).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((Component)this.Egi, -2, -1, -2).addContainerGap(215, Short.MAX_VALUE)).add(2, (GroupLayout.Group)groupLayout3.createSequentialGroup().add((GroupLayout.Group)groupLayout3.createParallelGroup(2).add(1, (Component)this.ac, -1, -1, Short.MAX_VALUE).add((Component)this.bN, -1, -1, Short.MAX_VALUE)).addContainerGap()))));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout3.createParallelGroup(3).add((Component)this.P).add((Component)this.DRQ, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout3.createParallelGroup(3).add((Component)this.Q).add((Component)this.Ege, -2, -1, -2)).addPreferredGap(0).add((Component)this.Egi, -2, -1, -2).addPreferredGap(0).add((Component)this.bN, -2, -1, -2).addPreferredGap(0).add((Component)this.ac, -1, -1, Short.MAX_VALUE).addContainerGap()));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    private void a(FocusEvent focusEvent) {
        this.Egm.setDisplayName(this.Ege.getText());
        lfn.b(0, this.getClass().getSimpleName(), "DisplayNameTextFieldFocusLost() : done");
    }

    private void bl(ActionEvent actionEvent) {
        boolean bl = this.Egh.isSelected();
        this.Egd.setEnabled(bl);
        this.Egg.setEnabled(bl);
        this.Egm.gn(bl);
    }

    private void bm(ActionEvent actionEvent) {
        this.eJy();
    }

    private void D(ActionEvent actionEvent) {
        this.eJA();
    }

    private void C(ActionEvent actionEvent) {
        this.eJz();
    }

    private void bn(ActionEvent actionEvent) {
        this.eJB();
    }

    private void o(MouseEvent mouseEvent) {
    }

    private void bo(ActionEvent actionEvent) {
        this.eJx();
    }

    private void c() {
        this.Egi.setTitle("Position");
        this.Egi.setEditable(false);
    }

    private void eJx() {
        int n = this.Egl.getSelectedRow();
        if (n == -1) {
            return;
        }
        dss dss2 = this.Egm.HP().get(n);
        ldv ldv2 = dss2.getGUID();
        hac hac2 = (hac)this.DEC.d(4097);
        hac2.Lb(115);
        hac2.hC(ldv2);
        this.DEC.a((dxq)hac2);
    }

    private void eJy() {
        mqv mqv2 = new mqv((Frame)this.DEC, true, new lgx(this){
            final /* synthetic */ mqq Egn;
            {
                this.Egn = mqq2;
            }

            public void Ad(String string) {
                mqq.a(this.Egn).setText(string);
                mqq.b(this.Egn).jl(string);
            }
        });
        mqv2.setLocationRelativeTo(this);
        mqv2.setVisible(true);
    }

    private void eJz() {
        this.Egm.cx(new ljq(mje.DBl));
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.eJB();
    }

    private void eJA() {
        int n = this.Egl.getSelectedRow();
        if (n == -1) {
            return;
        }
        dss dss2 = this.Egm.HP().get(n);
        ldv ldv2 = dss2.getGUID();
        fub fub2 = (fub)this.DEC.d(1027);
        fub2.hC(ldv2);
        fub2.HX(fub.iHB);
        fub2.f(lcr.qAE);
        fub2.on(ldv2);
        this.DEC.a((dxq)fub2);
        try {
            Thread.sleep(100L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        this.eJB();
    }

    private void eJB() {
        assert (this.Egm != null);
        Vector<String> vector = new Vector<String>();
        Vector vector2 = new Vector();
        vector.add("Position");
        vector.add("Tile Loc");
        List<dss> list = this.Egm.HP();
        for (dss dss2 : list) {
            Vector<String> vector3 = new Vector<String>();
            vector3.add(dss2.av().toString());
            String string = lcw.dX((ljq)dss2.av());
            vector3.add(string);
            vector2.add(vector3);
        }
        DefaultTableModel defaultTableModel = new DefaultTableModel(vector2, vector);
        this.Egl.setModel(defaultTableModel);
    }

    public dsh eJC() {
        return this.Egm;
    }

    public void a(dsh dsh2) {
        assert (dsh2 != null);
        this.Egm = dsh2;
        this.eJB();
        this.DRQ.setText(dsh2.getObjectDescriptionFilename());
        this.Ege.setText(this.Egm.getDisplayName());
        this.Egi.cL(this.Egm.av());
        boolean bl = this.Egm.aSS();
        this.Egh.setSelected(bl);
        this.Egd.setEnabled(bl);
        this.Egg.setEnabled(bl);
        this.Egg.setText(this.Egm.bxJ());
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mqq mqq2, ActionEvent actionEvent) {
        mqq2.bo(actionEvent);
    }

    static /* synthetic */ void b(mqq mqq2, ActionEvent actionEvent) {
        mqq2.bl(actionEvent);
    }

    static /* synthetic */ void c(mqq mqq2, ActionEvent actionEvent) {
        mqq2.bm(actionEvent);
    }

    static /* synthetic */ void a(mqq mqq2, FocusEvent focusEvent) {
        mqq2.a(focusEvent);
    }

    static /* synthetic */ void a(mqq mqq2, MouseEvent mouseEvent) {
        mqq2.o(mouseEvent);
    }

    static /* synthetic */ void d(mqq mqq2, ActionEvent actionEvent) {
        mqq2.C(actionEvent);
    }

    static /* synthetic */ void e(mqq mqq2, ActionEvent actionEvent) {
        mqq2.D(actionEvent);
    }

    static /* synthetic */ void f(mqq mqq2, ActionEvent actionEvent) {
        mqq2.bn(actionEvent);
    }

    static /* synthetic */ JTextField a(mqq mqq2) {
        return mqq2.Egg;
    }

    static /* synthetic */ dsh b(mqq mqq2) {
        return mqq2.Egm;
    }
}

