/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;

public class mor
extends JPanel {
    private JButton DTa;
    private JButton DTb;
    private JButton DNZ;
    private JList DTc;
    private JList DTd;
    private JLabel I;
    private JLabel P;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JScrollPane ah;
    private JScrollPane ai;
    private JTextField DEo;
    Vector<String> DTe = null;
    String DTf = null;

    public mor() {
        this.b();
    }

    private void b() {
        this.I = new JLabel();
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.DTc = new JList();
        this.bN = new JPanel();
        this.DTa = new JButton();
        this.DEo = new JTextField();
        this.P = new JLabel();
        this.DTb = new JButton();
        this.DNZ = new JButton();
        this.ac = new JPanel();
        this.ai = new JScrollPane();
        this.DTd = new JList();
        this.I.setText("<HTML>Attachpoint mass-copying. Press the \"Browse..\" button to select files. Only files with attachpoints will be show. Then you can change the common prefix to generate a new set of attachpoints based on the first set.</HTML>");
        this.aa.setBorder(BorderFactory.createTitledBorder("Original Attachpoints"));
        this.ah.setViewportView(this.DTc);
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.ah, -1, 309, Short.MAX_VALUE));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.ah, -1, 320, Short.MAX_VALUE));
        this.DTa.setText("Browse..");
        this.DTa.addActionListener(new ActionListener(this){
            final /* synthetic */ mor DTg;
            {
                this.DTg = mor2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mor.a(this.DTg, actionEvent);
            }
        });
        this.DEo.setEditable(false);
        this.P.setText("Common pattern:");
        this.DTb.setText("Create New Attachpoints");
        this.DTb.addActionListener(new ActionListener(this){
            final /* synthetic */ mor DTg;
            {
                this.DTg = mor2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mor.b(this.DTg, actionEvent);
            }
        });
        this.DNZ.setText("Save");
        this.DNZ.addActionListener(new ActionListener(this){
            final /* synthetic */ mor DTg;
            {
                this.DTg = mor2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mor.c(this.DTg, actionEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.DTa).addPreferredGap(0).add((Component)this.P).addPreferredGap(0).add((Component)this.DEo, -1, 335, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.DTb).addPreferredGap(0).add((Component)this.DNZ).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.DTa).add((Component)this.DTb).add((Component)this.DNZ).add((Component)this.P).add((Component)this.DEo, -2, -1, -2)).addContainerGap()));
        this.ac.setBorder(BorderFactory.createTitledBorder("New Attachpoints"));
        this.ai.setViewportView(this.DTd);
        GroupLayout groupLayout3 = new GroupLayout((Container)this.ac);
        this.ac.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.ai, -1, 387, Short.MAX_VALUE));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.ai, -1, 320, Short.MAX_VALUE));
        GroupLayout groupLayout4 = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().add((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.ac, -1, -1, Short.MAX_VALUE)).add((GroupLayout.Group)groupLayout4.createSequentialGroup().add((Component)this.I, -2, 509, -2).addPreferredGap(0, 225, Short.MAX_VALUE)))).add((Component)this.bN, -1, -1, Short.MAX_VALUE)).addContainerGap()));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((Component)this.I, -2, 47, -2).addPreferredGap(0).add((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((Component)this.ac, -1, -1, Short.MAX_VALUE).add((Component)this.aa, -1, -1, Short.MAX_VALUE)).addPreferredGap(0).add((Component)this.bN, -2, -1, -2).addContainerGap()));
    }

    private void aB(ActionEvent actionEvent) {
        this.eHN();
    }

    private void aN(ActionEvent actionEvent) {
        this.eHM();
    }

    private void aO(ActionEvent actionEvent) {
        this.eHK();
    }

    private void eHK() {
        if (this.DTf == null) {
            this.DTf = lcw.qLb + "xml/";
        }
        this.DTf = jry.tp(this.DTf.toLowerCase());
        mkb mkb2 = new mkb(this.DTf);
        myr myr2 = new myr("xml", "XML Files");
        mkb2.setMultiSelectionEnabled(true);
        mkb2.Ci(".xml");
        mkb2.addChoosableFileFilter(myr2);
        mkb2.setAcceptAllFileFilterUsed(false);
        mkb2.setFileSelectionMode(0);
        int n = mkb2.showDialog(this, "Choose Files");
        if (n != 0) {
            return;
        }
        jrw[] jrwArray = mkb2.eDe();
        if (jrwArray == null || jrwArray.length <= 0) {
            return;
        }
        Vector<String> vector = new Vector<String>();
        for (int i = 0; i < jrwArray.length; ++i) {
            String string = jry.tp(jrwArray[i].getAbsolutePath().toLowerCase());
            assert (string.startsWith(this.DTf));
            string = string.substring(this.DTf.length());
            string.replace("/", "/");
            lfn.b(0, this.getClass().getSimpleName(), "browseForFiles() : aFile = " + string);
            Map<String, eh> map = ei.ao(string);
            if (map != null) {
                vector.add(string);
                continue;
            }
            lfn.b(4, this.getClass().getSimpleName(), "browseForFiles() : SFFile [" + string + "] has no attachpoints!");
        }
        this.DTc.setListData(vector);
        this.DTe = vector;
        this.eHL();
    }

    private void eHL() {
        if (this.DTe == null || this.DTe.isEmpty()) {
            lfn.b(5, this.getClass().getSimpleName(), "findPattern() : No source files!");
            return;
        }
        String string = "";
        String string2 = this.DTe.get(0);
        boolean bl = true;
        int n = 0;
        block0: for (int i = 0; i < string2.length() && bl; ++i) {
            string = string + string2.charAt(n);
            ++n;
            for (String string3 : this.DTe) {
                if (string3.startsWith(string)) continue;
                bl = false;
                continue block0;
            }
        }
        if (!bl) {
            string = string.substring(0, string.length() - 1);
        }
        lfn.b(0, this.getClass().getSimpleName(), "findPattern() : Pattern = " + string);
        this.DEo.setText(string);
    }

    private void eHM() {
        String string = this.DEo.getText();
        if (string.length() == 0) {
            JOptionPane.showMessageDialog(this, "No Common Prefix for the files!");
            return;
        }
        if (this.DTe == null || this.DTe.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No source files!");
            return;
        }
        String string2 = JOptionPane.showInputDialog(this, "Enter new Prefix:", string);
        if (string2 == null) {
            return;
        }
        Vector<String> vector = new Vector<String>();
        Iterator<String> iterator = this.DTe.iterator();
        while (iterator.hasNext()) {
            String string3;
            String string4 = string3 = iterator.next();
            string3 = string3.substring(string.length());
            String string5 = string2 + string3;
            jrw jrw2 = new jrw(this.DTf + "/" + string5);
            if (!jrw2.exists()) {
                lfn.b(5, this.getClass().getSimpleName(), "massCopy() : TargetFile does not exist: " + jrw2);
                continue;
            }
            vector.add(string5);
            this.aJ(string4, string5);
        }
        if (this.DTe.size() != vector.size()) {
            JOptionPane.showMessageDialog(this, "Some of the target files do not exist! Will not be copied! Check the output.");
        }
        this.DTd.setListData(vector);
    }

    private void aJ(String string, String string2) {
        assert (string2 != null);
        Map<String, eh> map = ei.ao(string2);
        if (map != null) {
            lfn.b(4, this.getClass().getSimpleName(), "copyAttachpointsForFile() : Attachpoints already exist for file [" + string2 + "]. Not overwriting!");
            return;
        }
        map = lcn.emw();
        ei.a(string2, map);
        ArrayList<String> arrayList = new ArrayList<String>(lea.eor().keySet());
        Collections.sort(arrayList);
        String[] stringArray = arrayList.toArray(new String[arrayList.size()]);
        int n = 0;
        lfn.b(0, this.getClass().getSimpleName(), "attachPointCopyButton_ActionPerformed() : This is teh AttachPoints: ");
        n = 0;
        Map<String, eh> map2 = ei.ao(string);
        if (map2 == null) {
            JOptionPane.showMessageDialog(this, "Could not get attachpoints from Mesh [" + string + "]!", "Error Copying Attachpoints", 0);
            return;
        }
        for (eh eh2 : map2.values()) {
            try {
                eh2 = (eh)eh2.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                lfn.b(5, this.getClass().getSimpleName(), "attachPointCopyButton_ActionPerformed() : Clone not supported for this object! [" + eh2 + "]");
            }
            map.put(eh2.getName(), eh2);
            lfn.b(0, this.getClass().getSimpleName(), "attachPointCopyButton_ActionPerformed() : AttachPoint[" + n + "]  = " + eh2);
            ++n;
        }
    }

    private void eHN() {
        kak kak2 = new kak();
        kak2.X(lea.eor());
        JOptionPane.showMessageDialog(this, "AttachPoints SFFile Saved!");
    }

    static /* synthetic */ void a(mor mor2, ActionEvent actionEvent) {
        mor2.aO(actionEvent);
    }

    static /* synthetic */ void b(mor mor2, ActionEvent actionEvent) {
        mor2.aN(actionEvent);
    }

    static /* synthetic */ void c(mor mor2, ActionEvent actionEvent) {
        mor2.aB(actionEvent);
    }
}

