/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 *  lcw
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.filechooser.FileFilter;

public class msb
extends JInternalFrame {
    private JButton Epo;
    private JTextField Epp;
    private JComboBox Epq;
    private JButton Epr;
    private JLabel I;
    private JLabel P;
    private JPanel aa;
    private JPanel bN;
    aux DEC;

    public msb() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.Epq = new JComboBox();
        this.P = new JLabel();
        this.Epp = new JTextField();
        this.Epo = new JButton();
        this.bN = new JPanel();
        this.Epr = new JButton();
        this.setTitle("Environment Controller");
        this.I.setText("Cycle Time:");
        this.Epq.setModel(new DefaultComboBoxModel<String>(new String[]{"1", "5", "10"}));
        this.Epq.addActionListener(new ActionListener(this){
            final /* synthetic */ msb Eps;
            {
                this.Eps = msb2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msb.a(this.Eps, actionEvent);
            }
        });
        this.P.setText("Active Config:");
        this.Epp.setEditable(false);
        this.Epo.setText("..");
        this.Epo.addActionListener(new ActionListener(this){
            final /* synthetic */ msb Eps;
            {
                this.Eps = msb2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msb.b(this.Eps, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.P).addComponent(this.I)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Epq, -2, 163, -2).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addComponent(this.Epp, -1, 408, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Epo))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.Epq, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.Epp, -2, -1, -2).addComponent(this.Epo)).addContainerGap(-1, Short.MAX_VALUE)));
        this.Epr.setText("Enable EnvironmentSystem");
        this.Epr.addActionListener(new ActionListener(this){
            final /* synthetic */ msb Eps;
            {
                this.Eps = msb2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                msb.c(this.Eps, actionEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout(this.bN);
        this.bN.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.Epr).addContainerGap(380, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).addComponent(this.Epr).addContainerGap()));
        GroupLayout groupLayout3 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.bN, GroupLayout.Alignment.TRAILING, -1, -1, Short.MAX_VALUE).addComponent(this.aa, GroupLayout.Alignment.TRAILING, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.aa, -1, -1, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.bN, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    private void cc(ActionEvent actionEvent) {
        this.eNe();
    }

    private void cd(ActionEvent actionEvent) {
        this.eNf();
    }

    private void ce(ActionEvent actionEvent) {
        this.eNd();
    }

    private void c() {
        if (lcw.qHg) {
            this.Epr.setEnabled(false);
        }
        this.Epq.setModel(new DefaultComboBoxModel<a>(a.values()));
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void eNd() {
        a a2 = (a)((Object)this.Epq.getSelectedItem());
        if (a2 == null) {
            return;
        }
        int n = 10;
        switch (a2) {
            case Epu: {
                n = 1440;
                break;
            }
            case Epv: {
                n = 288;
                break;
            }
            case Epw: {
                n = 48;
                break;
            }
            case Epx: {
                n = 24;
                break;
            }
            case Epy: {
                n = 4;
                break;
            }
            default: {
                assert (false);
                break;
            }
        }
        lcw.qPM = n;
    }

    private void eNe() {
        Object object;
        jrw jrw2;
        mkb mkb2 = null;
        int n = 0;
        try {
            jrw2 = new jrw(lcw.qLb + "xml-files/object/environment/");
            mkb2 = new mkb(jrw2);
            object = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showOpenDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        jrw2 = mkb2.eDc();
        if (jrw2 == null || n != 0) {
            return;
        }
        object = new ber();
        String string = "xml-files/object/environment/" + jrw2.getName();
        jwo jwo2 = new jwo();
        jwo2.a(string, (ber)object);
        if (((ber)object).anm() == 0) {
            return;
        }
        fap fap2 = (fap)this.DEC.d(1805);
        fap2.on(lcr.qDG);
        fap2.f(lcr.qzr);
        fap2.iHg = object;
        fap2.iHh = 2.0f;
        this.DEC.a((dxq)fap2);
    }

    private void eNf() {
        if (lcw.qHg) {
            return;
        }
        lcw.qHg = true;
        this.Epr.setEnabled(false);
        bex bex2 = new bex();
        bex2.setGUID(lcr.qDG);
        gzw gzw2 = (gzw)this.DEC.d(4124);
        gzw2.on(lcr.qAE);
        gzw2.jvM = bex2;
        this.DEC.a((dxq)gzw2);
    }

    static /* synthetic */ void a(msb msb2, ActionEvent actionEvent) {
        msb2.ce(actionEvent);
    }

    static /* synthetic */ void b(msb msb2, ActionEvent actionEvent) {
        msb2.cc(actionEvent);
    }

    static /* synthetic */ void c(msb msb2, ActionEvent actionEvent) {
        msb2.cd(actionEvent);
    }
}

