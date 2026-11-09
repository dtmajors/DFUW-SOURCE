/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  dqk
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class mvm
extends mkx
implements ActionListener {
    private dqk gPc = null;
    private aux DEC = null;
    private mkt EGu = null;
    mkn ELc;
    private JPanel EGy = null;
    private mkg EGz = null;
    private JPanel EGA = null;
    private JButton ELd = new JButton("Change ResourceType");
    private mku EGC = null;
    private mku DNu = null;
    private JButton ELe = new JButton("Change Mesh Tint Color");

    public mvm(dqk dqk2) {
        this.gPc = dqk2;
        this.setTitle("Object GUID " + this.gPc.getGUID());
        this.setPreferredSize(new Dimension(550, 280));
        this.setClosable(true);
        this.ePH();
        this.pack();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void ePH() {
        JPanel jPanel = null;
        jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        this.j(jPanel);
        this.DGa.add(jPanel);
    }

    private void j(JPanel jPanel) {
        Object var2_2 = null;
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        jPanel.add(jPanel2);
        mkn mkn2 = new mkn("ObjectType", amh.gL(this.gPc.getObjectType()), false);
        jPanel2.add(mkn2);
        int n = this.gPc.az();
        this.ELc = new mkn("ResourceType", "not set", false);
        this.afL(n);
        jPanel2.add(this.ELc);
        this.ELd.addActionListener(new ActionListener(this){
            final /* synthetic */ mvm ELf;
            {
                this.ELf = mvm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvn mvn2 = new mvn(this.ELf);
                mvn2.setLocation(mvm.a(this.ELf).getX() + 5, mvm.a(this.ELf).getY() + 5);
                mvn2.setVisible(true);
            }
        });
        jPanel2.add(this.ELd);
        mkn mkn3 = new mkn("XML SFFile:", this.gPc.getObjectDescriptionFilename(), false);
        jPanel.add(mkn3);
        this.EGC = new mku("Position", this.gPc.av(), false);
        jPanel.add(this.EGC);
        this.DNu = new mku("Rotation", this.gPc.FX(), false);
        jPanel.add(this.DNu);
        JPanel jPanel3 = new JPanel(new FlowLayout(0));
        jPanel.add(jPanel3);
        this.ELe.addActionListener(new ActionListener(this){
            final /* synthetic */ mvm ELf;
            {
                this.ELf = mvm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                muj muj2 = new muj(mvm.b(this.ELf));
                muj2.p(mvm.a(this.ELf));
                mvm.a(this.ELf).eCu().add(muj2);
                muj2.setVisible(true);
            }
        });
        jPanel3.add(this.ELe);
    }

    public void afL(int n) {
        this.gPc.l(n);
        if (n == 0) {
            this.ELc.Cf("not set");
        } else {
            this.ELc.Cf(lea.enW().getName(n));
        }
        this.ELc.revalidate();
    }

    @Override
    protected void eDD() {
        ftv ftv2;
        boolean bl = false;
        if (this.EGC.hasChanged()) {
            ftv2 = (ftv)this.DEC.d(1025);
            ftv2.on(this.gPc.getGUID());
            ftv2.c(this.EGC.bSh());
            ftv2.a(new lgl(this.DNu.bSh()));
            ftv2.HT(8);
            this.DEC.a((dxq)ftv2);
            lfn.b(0, this.getClass().getName(), "Object Position has changed! New Pos: " + this.EGC.bSh());
        }
        if (this.DNu.hasChanged()) {
            ftv2 = (ftv)this.DEC.d(1025);
            ftv2.on(this.gPc.getGUID());
            ftv2.c(this.EGC.bSh());
            ftv2.a(new lgl(this.DNu.bSh()));
            ftv2.HT(32);
            this.DEC.a((dxq)ftv2);
            lfn.b(0, this.getClass().getName(), "Object Rotation has changed! New Pos: " + this.EGC.bSh());
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }

    static /* synthetic */ aux a(mvm mvm2) {
        return mvm2.DEC;
    }

    static /* synthetic */ dqk b(mvm mvm2) {
        return mvm2.gPc;
    }
}

