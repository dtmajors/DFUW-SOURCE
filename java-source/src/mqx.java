/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
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
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class mqx
extends JInternalFrame
implements lgx {
    private JButton Ehf;
    private JTextField Ehg;
    private JTextField Egx;
    private JButton DIO;
    private JButton Ehh;
    private JButton Ehi;
    private JCheckBox Ehj;
    private JLabel I;
    private JLabel P;
    private JPanel aa;
    private aux DEC;
    private jrw[] Ehk = null;

    public mqx() {
        this.b();
    }

    private void b() {
        this.I = new JLabel();
        this.P = new JLabel();
        this.Ehg = new JTextField();
        this.Egx = new JTextField();
        this.Ehi = new JButton();
        this.Ehh = new JButton();
        this.DIO = new JButton();
        this.aa = new JPanel();
        this.Ehf = new JButton();
        this.Ehj = new JCheckBox();
        this.setClosable(true);
        this.setTitle("Change Resource for file");
        this.I.setText("Mesh filename:");
        this.P.setText("Resource type name:");
        this.Ehi.setText("Select ResourceType");
        this.Ehi.addActionListener(new ActionListener(this){
            final /* synthetic */ mqx Ehl;
            {
                this.Ehl = mqx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqx.a(this.Ehl, actionEvent);
            }
        });
        this.Ehh.setText("Select file");
        this.Ehh.addActionListener(new ActionListener(this){
            final /* synthetic */ mqx Ehl;
            {
                this.Ehl = mqx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqx.b(this.Ehl, actionEvent);
            }
        });
        this.DIO.setText("Save file");
        this.DIO.addActionListener(new ActionListener(this){
            final /* synthetic */ mqx Ehl;
            {
                this.Ehl = mqx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqx.c(this.Ehl, actionEvent);
            }
        });
        this.aa.setBorder(BorderFactory.createTitledBorder("Super-user options"));
        this.Ehf.setText("Generate mesh resourcetypes");
        this.Ehf.setToolTipText("Sets the ResourceType for meshes that match types in the resource tree");
        this.Ehf.addActionListener(new ActionListener(this){
            final /* synthetic */ mqx Ehl;
            {
                this.Ehl = mqx2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqx.d(this.Ehl, actionEvent);
            }
        });
        this.Ehj.setSelected(true);
        this.Ehj.setText("Test-run");
        this.Ehj.setToolTipText("If checked, then the Results of the \"Generate mesh resourcetypes\" button will not be saved");
        this.Ehj.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.Ehj.setMargin(new Insets(0, 0, 0, 0));
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.Ehf).addPreferredGap(0).add((Component)this.Ehj).addContainerGap(182, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.Ehf).add((Component)this.Ehj)).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (Component)this.aa, -1, -1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.I).add((Component)this.P)).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(1, false).add(2, (Component)this.Ehg, -1, 203, Short.MAX_VALUE).add(2, (Component)this.Egx)).add((GroupLayout.Group)groupLayout2.createParallelGroup(1, false).add((GroupLayout.Group)groupLayout2.createSequentialGroup().add(7, 7, 7).add((Component)this.Ehi)).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addPreferredGap(0).add((Component)this.Ehh, -1, -1, Short.MAX_VALUE)))).add((Component)this.DIO))).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.I).add((Component)this.Ehg, -2, -1, -2).add((Component)this.Ehh)).addPreferredGap(0).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.P).add((Component)this.Ehi).add((Component)this.Egx, -2, -1, -2)).addPreferredGap(0).add((Component)this.DIO).addPreferredGap(0, -1, Short.MAX_VALUE).add((Component)this.aa, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    private void bu(ActionEvent actionEvent) {
        this.eJS();
    }

    private void bv(ActionEvent actionEvent) {
        this.eJJ();
    }

    private void bw(ActionEvent actionEvent) {
        this.selectFile();
    }

    private void bx(ActionEvent actionEvent) {
        this.eJR();
    }

    private void eJJ() {
        if (this.Ehk == null) {
            JOptionPane.showMessageDialog(this, "Nothing to save");
            return;
        }
        jxa jxa2 = new jxa();
        if (this.Egx.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No Resource Selected");
            return;
        }
        String string = this.Egx.getText();
        int n = 0;
        for (int i = 0; i < this.Ehk.length; ++i) {
            jrw jrw2 = this.Ehk[i];
            if (!jrw2.exists()) {
                JOptionPane.showMessageDialog(this, "SFFile [" + jrw2 + "] does not exist!");
                continue;
            }
            if (jrw2.isDirectory()) {
                ArrayList<jrw> arrayList = lcn.emv();
                jry.a(jrw2, (FileFilter)new jsl("xml"), arrayList, true);
                for (jrw jrw3 : arrayList) {
                    if (!jrw3.isFile()) continue;
                    jxa2.e(jrw3, string);
                    ++n;
                }
                continue;
            }
            ++n;
            jxa2.e(jrw2, string);
        }
        JOptionPane.showMessageDialog(this, "Saved " + n + " file(s) with ResourceType: " + string);
        this.Ehk = null;
    }

    private void selectFile() {
        jrw[] jrwArray = this.CT(lcw.qLb + "xml/");
        if (jrwArray == null || jrwArray.length == 0) {
            return;
        }
        this.Ehk = jrwArray;
        if (this.Ehk.length == 1) {
            this.Ehg.setText(this.Ehk[0].getAbsolutePath());
        } else {
            this.Ehg.setText(this.Ehk[0].getAbsolutePath() + "...");
        }
        if (this.Ehk.length == 1 && this.Ehk[0].isFile()) {
            jxa jxa2 = new jxa();
            String string = jxa2.y(this.Ehk[0]);
            if (string == null) {
                lfn.b(5, this.getClass().getSimpleName(), "selectFile() : No ResourceType for Mesh!");
                return;
            }
            this.Egx.setText(string);
        } else {
            this.Egx.setText("");
        }
    }

    private void eJR() {
        if (this.Ehg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No SFFile(s) Selected");
            return;
        }
        mqv mqv2 = new mqv((Frame)this.DEC, false, this);
        mqv2.setLocationRelativeTo(this);
        mqv2.setVisible(true);
    }

    private jrw[] CT(String string) {
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(string);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(2);
            mkb2.setDialogType(0);
            mkb2.setMultiSelectionEnabled(true);
            n = mkb2.showOpenDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return null;
        }
        jrw[] jrwArray = mkb2.eDe();
        if (jrwArray != null && n == 0) {
            return jrwArray;
        }
        return null;
    }

    @Override
    public void Ad(String string) {
        this.Egx.setText(string);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void eJS() {
        String string;
        String string22;
        les les2 = lea.enW();
        Map<String, ler> map = les2.eqm();
        Map<String, String> map2 = lcn.emw();
        ArrayList<String> arrayList = lcn.emv();
        ArrayList arrayList2 = lcn.emv();
        for (ler object2 : map.values()) {
            assert (object2 instanceof lgw);
            string22 = object2.getName().toLowerCase();
            string = ((lgw)object2).bBt().toLowerCase();
            if ((string = string.replace("//", "/")).equals("smallcube.xml") || string.equals("mesh_of_doom.xml")) continue;
            if (map2.containsKey(string)) {
                arrayList.add("Mesh [" + string + "] mapped to [" + string22 + "] ALREADY --> *WARNING*");
            }
            map2.put(string, string22);
            arrayList.add("Mesh [" + string + "] mapped to [" + string22 + "]");
        }
        Object object3 = "";
        Collections.sort(arrayList);
        for (String string22 : arrayList) {
            object3 = (String)object3 + "\n" + string22;
        }
        object3 = (String)object3 + "\n------------------Check for file existance ------------------------";
        String string3 = lcw.qLb + "xml" + "/";
        string22 = string3 + "animations" + "/";
        string = "C:\\dump\\dfdata/";
        arrayList.clear();
        Iterator<Object> iterator = map2.keySet().iterator();
        while (iterator.hasNext()) {
            boolean string5 = false;
            String string4 = (String)iterator.next();
            if (!string4.endsWith(".xml")) {
                arrayList.add("ERROR: SFFile [" + string4 + "] is not an xml mesh file! FIX THIS");
                continue;
            }
            jrw jrw2 = new jrw(string3 + string4);
            if (jrw2.exists()) {
                arrayList.add("SFFile Found = [" + jrw2 + "]");
            } else {
                jrw2 = new jrw(string22 + string4);
                if (jrw2.exists()) {
                    arrayList.add("Animation SFFile Found = [" + jrw2 + "]");
                    string5 = true;
                } else {
                    jrw2 = null;
                }
            }
            if (jrw2 == null) {
                arrayList.add("ERROR: SFFile does not exist: [" + string4 + "]");
                continue;
            }
            arrayList.add("xCopying SFFile to Dump Dir: [" + string4 + "]");
            if (this.Ehj.isSelected()) continue;
            jxa jxa2 = new jxa();
            jxa2.e(jrw2, (String)map2.get(string4));
            String string6 = "C:\\dump\\dfdata/" + string4;
            if (string5) {
                string6 = "C:\\dump\\dfdata/animations/" + string4;
            }
            jrw jrw3 = new jrw(string6);
            jry.a(jrw3, jrw2);
        }
        Collections.sort(arrayList);
        for (String string7 : arrayList) {
            object3 = (String)object3 + "\n" + string7;
        }
        object3 = (String)object3 + "\n------------------done ------------------------";
        this.aM("Checked ResourceTree!", (String)object3);
    }

    private void aM(String string, String string2) {
        mky mky2 = new mky(null, true);
        mky2.setLocationRelativeTo((Component)this.DEC);
        mky2.Co(string);
        mky2.Cn(string2);
        mky2.setVisible(true);
    }

    static /* synthetic */ void a(mqx mqx2, ActionEvent actionEvent) {
        mqx2.bx(actionEvent);
    }

    static /* synthetic */ void b(mqx mqx2, ActionEvent actionEvent) {
        mqx2.bw(actionEvent);
    }

    static /* synthetic */ void c(mqx mqx2, ActionEvent actionEvent) {
        mqx2.bv(actionEvent);
    }

    static /* synthetic */ void d(mqx mqx2, ActionEvent actionEvent) {
        mqx2.bu(actionEvent);
    }
}

