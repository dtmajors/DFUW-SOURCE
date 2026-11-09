/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  eg
 *  lcr
 *  lcw
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.Timer;

public class mqz
extends JInternalFrame {
    private JButton DTJ;
    private JButton Ehx;
    private JTextField Ehy;
    private JLabel I;
    private JPanel aa;
    aux DEC = null;
    float Ehz = 215.0f;
    int fb = 0;

    public mqz(aux aux2) {
        this.DEC = aux2;
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.Ehx = new JButton();
        this.DTJ = new JButton();
        this.I = new JLabel();
        this.Ehy = new JTextField();
        this.setTitle("Screenshot Dialog");
        this.aa.setBorder(BorderFactory.createTitledBorder("ScreenShot Parameters"));
        this.Ehx.setText("Take");
        this.DTJ.setText("Cancel");
        this.I.setText("Width(meters):");
        this.Ehy.setText("512");
        GroupLayout groupLayout = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.I, -2, 93, -2).addGap(18, 18, 18).addComponent(this.Ehy, -2, 74, -2)).addGroup(groupLayout.createSequentialGroup().addGap(111, 111, 111).addComponent(this.Ehx).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DTJ))).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.Ehy, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Ehx).addComponent(this.DTJ))));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        this.pack();
    }

    private void c() {
        this.DTJ.addActionListener(new ActionListener(this){
            final /* synthetic */ mqz EhA;
            {
                this.EhA = mqz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EhA.setVisible(false);
            }
        });
        this.Ehx.addActionListener(new ActionListener(this){
            final /* synthetic */ mqz EhA;
            {
                this.EhA = mqz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqz.a(this.EhA);
            }
        });
    }

    private void eJY() {
        this.fb = Integer.parseInt(this.Ehy.getText());
        this.DEC.b(new aux.a(this){
            final /* synthetic */ mqz EhA;
            {
                this.EhA = mqz2;
            }

            public void a(eg eg2) {
                ldv ldv2 = eg2.dU();
                dld dld2 = (dld)eg2.getMessageDelegator().bzx().bzt().d(ldv2);
                ljq ljq2 = dld2.av();
                this.EhA.Ehz = ljq2.getY();
                edc edc2 = (edc)eg2.getMessageDelegator().h(2049, eg2.getGUID(), eg2.dU());
                edc2.DH(12);
                edc2.c(new ljq(ljq2.getX(), 2500.0f, ljq2.bdV()));
                edc2.a(new lgl(new ljq(1.5707963267948966, Math.PI, 0.0)));
                eg2.getMessageDelegator().H(edc2);
            }
        });
        kir kir2 = (kir)this.DEC.ii(2054);
        kir2.wD(true);
        kir2.jM(false);
        kir2.oG(lcr.rg);
        kir2.Ya(this.fb);
        kir2.Yb(this.fb);
        kir2.ha(5000.0f);
        kir2.XZ(2050);
        haa.a a2 = new haa.a(this){
            final /* synthetic */ mqz EhA;
            {
                this.EhA = mqz2;
            }

            public void a(ktv ktv2, Object object) {
                mqz.b(this.EhA);
            }
        };
        this.DEC.a((khd)kir2, a2, null);
    }

    private void eJZ() {
        String string = "yyyyMMddHHmmss";
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string);
        String string2 = simpleDateFormat.format(calendar.getTime());
        kgm kgm2 = new kgm();
        kgm2.setType(2);
        kgm2.tr(ldv.rfe);
        kgm2.ts(ldv.rfe);
        kgm2.setPrefix("village" + string2 + ".bmp");
        kgm2.setDirectory(lcw.qLb + "/" + "screenshots/");
        kgm2.vB(true);
        this.DEC.f((kgh)kgm2);
        Timer timer = new Timer(1, new ActionListener(this){
            final /* synthetic */ mqz EhA;
            {
                this.EhA = mqz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqz.c(this.EhA);
            }
        });
        timer.setInitialDelay(1500);
        timer.setRepeats(false);
        timer.start();
    }

    private void eKa() {
        kir kir2 = (kir)this.DEC.ii(2054);
        kir2.wD(true);
        kir2.jM(false);
        kir2.oG(lcr.rg);
        kir2.gZ(mje.DBo);
        kir2.ha(mje.DBn);
        kir2.XZ(1039);
        kir2.As(this.fb);
        kir2.At(this.fb);
        this.DEC.a((khd)kir2, null, null);
        this.DEC.b(new aux.a(this){
            final /* synthetic */ mqz EhA;
            {
                this.EhA = mqz2;
            }

            public void a(eg eg2) {
                ldv ldv2 = eg2.dU();
                dld dld2 = (dld)eg2.getMessageDelegator().bzx().bzt().d(ldv2);
                ljq ljq2 = dld2.av();
                edc edc2 = (edc)eg2.getMessageDelegator().h(2049, eg2.getGUID(), eg2.dU());
                edc2.DH(12);
                edc2.c(new ljq(ljq2.getX(), this.EhA.Ehz, ljq2.bdV()));
                edc2.a(new lgl(new ljq(0.0f, 0.0f, 0.0f)));
                eg2.getMessageDelegator().H(edc2);
            }
        });
    }

    static /* synthetic */ void a(mqz mqz2) {
        mqz2.eJY();
    }

    static /* synthetic */ void b(mqz mqz2) {
        mqz2.eJZ();
    }

    static /* synthetic */ void c(mqz mqz2) {
        mqz2.eKa();
    }
}

