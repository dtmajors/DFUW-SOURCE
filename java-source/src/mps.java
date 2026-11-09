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
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import org.jdesktop.layout.GroupLayout;

public class mps
extends JInternalFrame {
    private JTextField DTB;
    private JButton qtg;
    private JButton DEt;
    private JButton DTD;
    private JTextField DTE;
    private JTextField DTF;
    private JLabel I;
    private JLabel Q;
    private JLabel R;
    private JPanel aa;
    private aux DEC;
    private ljq DTG;

    public mps() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.DTB = new JTextField();
        this.DTD = new JButton();
        this.DEt = new JButton();
        this.qtg = new JButton();
        this.Q = new JLabel();
        this.DTF = new JTextField();
        this.R = new JLabel();
        this.DTE = new JTextField();
        this.setClosable(true);
        this.setTitle("Add Guard Tower");
        this.I.setText("Guard Tower file:");
        this.DTD.setText("..");
        this.DTD.addActionListener(new ActionListener(this){
            final /* synthetic */ mps DWY;
            {
                this.DWY = mps2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mps.a(this.DWY, actionEvent);
            }
        });
        this.DEt.setText("Ok");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ mps DWY;
            {
                this.DWY = mps2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mps.b(this.DWY, actionEvent);
            }
        });
        this.qtg.setText("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mps DWY;
            {
                this.DWY = mps2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mps.c(this.DWY, actionEvent);
            }
        });
        this.Q.setText("Tile Location:");
        this.DTF.setEditable(false);
        this.R.setText("ResourceType:");
        this.DTE.setEditable(false);
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.DEt).addPreferredGap(0, 265, Short.MAX_VALUE).add((Component)this.qtg)).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.I).add((Component)this.R).add((Component)this.Q)).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DTB, -1, 255, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.DTD)).add((Component)this.DTF, -2, 46, -2).add((Component)this.DTE, -1, 302, Short.MAX_VALUE)))).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.DTD).add((Component)this.DTB, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DTE, -2, -1, -2).add((Component)this.R)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DTF, -2, -1, -2).add((Component)this.Q)).addContainerGap(47, Short.MAX_VALUE)).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap(86, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DEt).add((Component)this.qtg)).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        this.pack();
    }

    private void aS(ActionEvent actionEvent) {
        this.eHZ();
    }

    private void H(ActionEvent actionEvent) {
        this.eHI();
    }

    private void I(ActionEvent actionEvent) {
        this.eHH();
    }

    private void c() {
        this.DTG = new ljq(mje.DBl);
        lej lej2 = lcw.dW((ljq)this.DTG);
        assert (lej2 != null);
        String string = lcw.f((lej)lej2);
        assert (string != null);
        this.DTF.setText(string);
        if (lea.eoS() == null || lea.eoS().isEmpty()) {
            jxp jxp2 = new jxp();
            try {
                String string2 = "xml-files/gamelogicinfo/tileinfomap.xml";
                jxp2.vs(string2);
            }
            catch (bg bg2) {
                bg2.printStackTrace();
            }
        }
    }

    private void eHZ() {
        Object object;
        String string = lcw.qLb + "xml/" + "/prop/all/starting_village_props";
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(string);
            object = new myr("xml", "XML Files");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(2);
            n = mkb2.showDialog(this, "Choose Guard Tower");
        }
        catch (Exception exception) {
            return;
        }
        if (n != 0) {
            return;
        }
        object = mkb2.eDc();
        if (object == null) {
            return;
        }
        this.DTB.setText(((File)object).getAbsolutePath());
        jxa jxa2 = new jxa();
        String string2 = jxa2.y((jrw)object);
        this.DTE.setText(string2);
        int n2 = lea.enW().getType(string2);
        if (n2 < 0) {
            JOptionPane.showMessageDialog(this, "ResourceType [" + string2 + "] is invalid!", "ResourceType Error", 0);
            return;
        }
    }

    private void eHH() {
        assert (this.DTG != null);
        String string = this.DTE.getText();
        int n = lea.enW().getType(string);
        if (n < 0) {
            JOptionPane.showMessageDialog(this, "ResourceType [" + string + "] is invalid! Not Adding!", "ResourceType Error", 0);
            return;
        }
        if (!string.contains("Guard Tower")) {
            JOptionPane.showMessageDialog(this, "ResourceType [" + string + "] is not a guard tower! Not Adding!", "ResourceType Error", 0);
            return;
        }
        String string2 = this.DTB.getText();
        if (string2.equals("")) {
            JOptionPane.showMessageDialog(this, "No guard tower selected! Not Adding!", "ResourceType Error", 0);
            return;
        }
        if (mje.DAS == null) {
            JOptionPane.showMessageDialog(this, "No objectspace selected! Not Adding!", "ObjectSpace Error", 0);
            return;
        }
        String string3 = lcw.qLb + "xml/";
        if (!(string2 = jry.tp(string2).toLowerCase()).startsWith(string3 = jry.tp(string3).toLowerCase())) {
            JOptionPane.showMessageDialog(this, "SFFile is not in dfdata/xml directory! Not Adding!", "Filename Error", 0);
            return;
        }
        string2 = string2.substring(string3.length());
        assert (this.DEC != null);
        if (mje.DAS == null) {
            JOptionPane.showMessageDialog(this, "No ObjectSpace Selected! Not inserting Gaurd Tower.", "Error", 0);
            return;
        }
        dse dse2 = new dse();
        dse2.setGUID(this.DEC.lL(mje.DAS));
        dse2.setObjectType(120);
        dse2.c(mje.DBl);
        dse2.a(new lgl());
        dse2.setObjectDescriptionFilename(string2);
        gzw gzw2 = (gzw)this.DEC.d(4124);
        gzw2.on(lcr.qAE);
        gzw2.on(lcr.qAE);
        gzw2.jvM = dse2;
        this.DEC.a((dxq)gzw2);
        this.dispose();
    }

    private void eHI() {
        this.dispose();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mps mps2, ActionEvent actionEvent) {
        mps2.aS(actionEvent);
    }

    static /* synthetic */ void b(mps mps2, ActionEvent actionEvent) {
        mps2.I(actionEvent);
    }

    static /* synthetic */ void c(mps mps2, ActionEvent actionEvent) {
        mps2.H(actionEvent);
    }
}

