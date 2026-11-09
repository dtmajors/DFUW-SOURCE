/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  cug
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jdesktop.layout.GroupLayout;

public class mvh
extends JPanel {
    private JButton EKt;
    private JButton EKu;
    private JButton EKv;
    private JButton DON;
    private JButton EKw;
    private JButton EKx;
    private JTextField DTE;
    private JButton EKy;
    private JLabel I;
    private JPanel aa;
    private bvf EKz;
    private aux DEC;
    private int EKA = -1;
    protected static Map<ldv, bzt> EKB = lcn.emw();

    public mvh() {
        this.b();
    }

    private void b() {
        this.aa = new JPanel();
        this.EKw = new JButton();
        this.I = new JLabel();
        this.DTE = new JTextField();
        this.EKt = new JButton();
        this.DON = new JButton();
        this.EKv = new JButton();
        this.EKu = new JButton();
        this.EKx = new JButton();
        this.EKy = new JButton();
        this.EKw.setText("Dress Character");
        this.EKw.addActionListener(new ActionListener(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvh.a(this.EKC, actionEvent);
            }
        });
        this.I.setText("ResourceType:");
        this.DTE.setEditable(false);
        this.EKt.setText("Add Apparel");
        this.EKt.addActionListener(new ActionListener(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvh.b(this.EKC, actionEvent);
            }
        });
        this.DON.setText("Clear");
        this.DON.addActionListener(new ActionListener(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvh.c(this.EKC, actionEvent);
            }
        });
        this.EKv.setText("Add Weapon");
        this.EKv.addActionListener(new ActionListener(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvh.d(this.EKC, actionEvent);
            }
        });
        this.EKu.setText("Add Feature");
        this.EKu.addActionListener(new ActionListener(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvh.e(this.EKC, actionEvent);
            }
        });
        this.EKx.setText("HairColor");
        this.EKx.addActionListener(new ActionListener(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvh.f(this.EKC, actionEvent);
            }
        });
        this.EKy.setText("SkinColor");
        this.EKy.addActionListener(new ActionListener(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvh.g(this.EKC, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.I).addPreferredGap(0).add((Component)this.DTE)).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(1, false).add((Component)this.EKw, -2, 1, Short.MAX_VALUE).add((Component)this.EKt, -1, -1, Short.MAX_VALUE)).addPreferredGap(1).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.EKv).add((Component)this.EKx)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.EKy).add((Component)this.EKu)).add(0, 15, Short.MAX_VALUE))).addContainerGap()).add((GroupLayout.Group)groupLayout.createSequentialGroup().add(131, 131, 131).add((Component)this.DON).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.DTE, -2, -1, -2)).add(18, 31, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.EKw).add((Component)this.EKx).add((Component)this.EKy)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.EKt).add((Component)this.EKv).add((Component)this.EKu)).addPreferredGap(0).add((Component)this.DON)));
        GroupLayout groupLayout2 = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.aa, -2, -1, -2).addContainerGap(433, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.aa, -2, -1, -2).addContainerGap(269, Short.MAX_VALUE)));
    }

    private void cS(ActionEvent actionEvent) {
        this.eQB();
    }

    private void cT(ActionEvent actionEvent) {
        mph mph2 = new mph(3, this);
        mph2.setSize(new Dimension(200, 500));
        mph2.eIs();
        mph2.l(lea.enW().acv(cug.fjk));
        this.DEC.eCu().add(mph2);
        mph2.a(new mpi(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void x(lgw lgw2) {
                this.EKC.y(lgw2);
            }
        });
        mph2.s();
        mph2.show();
    }

    private void cf(ActionEvent actionEvent) {
        this.eJb();
    }

    private void cU(ActionEvent actionEvent) {
        mph mph2 = new mph(3, this);
        mph2.setSize(new Dimension(200, 500));
        mph2.eIs();
        mph2.l(lea.enW().acv(cug.fkd));
        this.DEC.eCu().add(mph2);
        mph2.a(new mpi(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void x(lgw lgw2) {
                this.EKC.z(lgw2);
            }
        });
        mph2.s();
        mph2.show();
    }

    private void cV(ActionEvent actionEvent) {
        mph mph2 = new mph(3, this);
        mph2.setSize(new Dimension(200, 500));
        mph2.eIs();
        mph2.l(lea.enW().acv(cug.fkO));
        this.DEC.eCu().add(mph2);
        mph2.a(new mpi(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void x(lgw lgw2) {
                this.EKC.A(lgw2);
            }
        });
        mph2.s();
        mph2.show();
    }

    private void cW(ActionEvent actionEvent) {
        JColorChooser jColorChooser = new JColorChooser(Color.white);
        jColorChooser.getSelectionModel().addChangeListener(new ChangeListener(this, jColorChooser){
            final /* synthetic */ JColorChooser EKD;
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
                this.EKD = jColorChooser;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                this.EKC.l(this.EKD.getColor());
            }
        });
        JDialog jDialog = JColorChooser.createDialog(this, "select Hair Color", false, jColorChooser, new ActionListener(this, jColorChooser){
            final /* synthetic */ JColorChooser EKD;
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
                this.EKD = jColorChooser;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EKC.l(this.EKD.getColor());
            }
        }, new ActionListener(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
            }
        });
        jDialog.setVisible(true);
    }

    private void cX(ActionEvent actionEvent) {
        JColorChooser jColorChooser = new JColorChooser(Color.white);
        jColorChooser.getSelectionModel().addChangeListener(new ChangeListener(this, jColorChooser){
            final /* synthetic */ JColorChooser EKD;
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
                this.EKD = jColorChooser;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                this.EKC.m(this.EKD.getColor());
            }
        });
        JDialog jDialog = JColorChooser.createDialog(this, "select Hair Color", false, jColorChooser, new ActionListener(this, jColorChooser){
            final /* synthetic */ JColorChooser EKD;
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
                this.EKD = jColorChooser;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EKC.m(this.EKD.getColor());
            }
        }, new ActionListener(this){
            final /* synthetic */ mvh EKC;
            {
                this.EKC = mvh2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
            }
        });
        jDialog.setVisible(true);
    }

    bzt eQA() {
        bzt bzt2 = EKB.get(this.EKz.getGUID());
        if (bzt2 == null || bzt2.isCleanedUp()) {
            bzt2 = new bzt();
            bzt2.b(this.EKz);
            bzt2.setGUID(this.EKz.getMessageDelegator().bzv());
            this.EKz.getMessageDelegator().a(bzt2);
            EKB.put(this.EKz.getGUID(), bzt2);
        }
        return bzt2;
    }

    private void eQB() {
        this.eQA();
    }

    public void f(bvf bvf2) {
        this.EKz = bvf2;
        this.EKA = cug.id((String)this.EKz.ayY());
        if (this.EKA < 0) {
            this.DTE.setText("no a dressable object!");
            return;
        }
        String string = lea.enW().getName(this.EKA);
        this.DTE.setText(string);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    protected void y(lgw lgw2) {
        this.eQA().a(lgw2.getType(), lgw2.auO());
    }

    protected void z(lgw lgw2) {
        this.eQA().t(lgw2.getType(), false);
    }

    protected void A(lgw lgw2) {
        this.eQA().c(lgw2.getType(), lgw2.auO());
    }

    protected void eJb() {
        bzt bzt2 = this.eQA();
        for (bzs bzy2 : bzt2.aFA().values()) {
            bzt2.b(bzy2.ResourceType, bzy2.auO());
        }
        for (cad cad2 : bzt2.aFB().values()) {
            bzt2.d(cad2.ResourceType, cad2.auO());
        }
    }

    protected void l(Color color) {
        this.eQA().b(new lcq(color));
    }

    protected void m(Color color) {
        this.eQA().a(new lcq(color));
    }

    static /* synthetic */ void a(mvh mvh2, ActionEvent actionEvent) {
        mvh2.cS(actionEvent);
    }

    static /* synthetic */ void b(mvh mvh2, ActionEvent actionEvent) {
        mvh2.cT(actionEvent);
    }

    static /* synthetic */ void c(mvh mvh2, ActionEvent actionEvent) {
        mvh2.cf(actionEvent);
    }

    static /* synthetic */ void d(mvh mvh2, ActionEvent actionEvent) {
        mvh2.cU(actionEvent);
    }

    static /* synthetic */ void e(mvh mvh2, ActionEvent actionEvent) {
        mvh2.cV(actionEvent);
    }

    static /* synthetic */ void f(mvh mvh2, ActionEvent actionEvent) {
        mvh2.cW(actionEvent);
    }

    static /* synthetic */ void g(mvh mvh2, ActionEvent actionEvent) {
        mvh2.cX(actionEvent);
    }
}

