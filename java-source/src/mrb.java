/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  dgj
 *  lcr
 *  lcw
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import org.w3c.dom.Document;

public class mrb
extends JInternalFrame {
    private JButton EhD;
    private JButton EhE;
    private JList EhF;
    private JLabel EhG;
    private JLabel EhH;
    private JButton EhI;
    private JButton EhJ;
    private JTextField EhK;
    private JList EhL;
    private JLabel I;
    private JScrollPane ah;
    private JScrollPane ai;
    private aux DEC = null;
    private static int EhM = 0;
    private static Map<String, Set<String>> EhN = lcn.emw();
    private Map<String, Set<String>> EhO = lcn.emw();
    private Map<String, Set<String>> EhP = lcn.emw();

    public mrb(aux aux2) {
        this.DEC = aux2;
        this.b();
        this.c();
    }

    private void b() {
        this.EhK = new JTextField();
        this.ah = new JScrollPane();
        this.EhF = new JList();
        this.EhG = new JLabel();
        this.I = new JLabel();
        this.EhH = new JLabel();
        this.EhD = new JButton();
        this.ai = new JScrollPane();
        this.EhL = new JList();
        this.EhE = new JButton();
        this.EhI = new JButton();
        this.EhJ = new JButton();
        this.setClosable(true);
        this.setTitle("Shader/Texture Usage");
        this.EhK.setText("treepineshader2.teq");
        this.EhF.setSelectionMode(0);
        this.ah.setViewportView(this.EhF);
        this.EhG.setText("jLabel1");
        this.I.setText("Search for:");
        this.EhH.setText("Results:");
        this.EhD.setText("Create Selected Mesh");
        this.ai.setViewportView(this.EhL);
        this.EhE.setText("Find Audio xmls unreferenced by the SFXSystem");
        this.EhI.setText("Shader(teq)");
        this.EhJ.setText("Texture");
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ai, -1, 423, Short.MAX_VALUE).addComponent(this.ah, -1, 423, Short.MAX_VALUE).addComponent(this.EhG, -1, 423, Short.MAX_VALUE).addGroup(groupLayout.createSequentialGroup().addComponent(this.I, -2, 63, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EhK, -2, 176, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EhI).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EhJ, -1, 77, Short.MAX_VALUE)).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addComponent(this.EhH, -2, 212, -2).addGap(31, 31, 31).addComponent(this.EhD, -1, 180, Short.MAX_VALUE)).addComponent(this.EhE, -2, 273, -2)).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.EhK, -2, -1, -2).addComponent(this.EhI).addComponent(this.EhJ)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ah, -2, 288, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EhH).addComponent(this.EhD)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ai, -2, 158, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EhG).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EhE).addContainerGap(16, Short.MAX_VALUE)));
        this.pack();
    }

    private void c() {
        this.eKe();
        if (EhN.isEmpty()) {
            Thread thread = new Thread(this){
                final /* synthetic */ mrb EhQ;
                {
                    this.EhQ = mrb2;
                }

                public void run() {
                    mrb.a(this.EhQ, new File(lcw.qLb + "xml/"));
                }
            };
            thread.start();
        } else {
            this.EhG.setText(EhM + " mesh xml files have been parsed...");
        }
        this.EhK.addActionListener(new ActionListener(this){
            final /* synthetic */ mrb EhQ;
            {
                this.EhQ = mrb2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrb.a(this.EhQ);
            }
        });
        this.EhD.addActionListener(new ActionListener(this){
            final /* synthetic */ mrb EhQ;
            {
                this.EhQ = mrb2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrb.b(this.EhQ);
            }
        });
        this.EhE.addActionListener(new ActionListener(this){
            final /* synthetic */ mrb EhQ;
            {
                this.EhQ = mrb2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EhQ.eKf();
            }
        });
        this.EhI.addActionListener(new ActionListener(this){
            final /* synthetic */ mrb EhQ;
            {
                this.EhQ = mrb2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrb.a(this.EhQ);
            }
        });
        this.EhJ.addActionListener(new ActionListener(this){
            final /* synthetic */ mrb EhQ;
            {
                this.EhQ = mrb2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mrb.c(this.EhQ);
            }
        });
    }

    private void eKb() {
        int n = this.EhF.getSelectedIndex();
        if (n == -1) {
            return;
        }
        String string = (String)this.EhF.getSelectedValue();
        if (string == null) {
            return;
        }
        hac hac2 = (hac)this.DEC.d(4097);
        hac2.on(lcr.qAE);
        hac2.f(lcr.qzr);
        hac2.Lb(1);
        hac2.setFileName(lcw.qLb + string);
        this.DEC.a((dxq)hac2);
    }

    private void eKc() {
        String string = this.EhK.getText();
        Vector<String> vector = new Vector<String>(200);
        Set<String> set = this.EhP.get(string.toLowerCase());
        if (set != null) {
            for (String string2 : set) {
                vector.add(string2);
            }
        }
        Collections.sort(vector);
        this.EhF.setListData(vector);
        this.EhF.updateUI();
        this.EhH.setText("Results Count: " + vector.size());
        if (vector.size() == 0) {
            JOptionPane.showMessageDialog(this, "no results were found...");
        }
    }

    private void eKd() {
        String string = this.EhK.getText();
        Set<String> set = this.EhO.get(string);
        Vector<String> vector = new Vector<String>(200);
        Vector<String> vector2 = new Vector<String>(200);
        if (set != null) {
            for (String string2 : set) {
                vector2.add(string2);
                Set<String> set2 = EhN.get(string2);
                if (set2 == null) continue;
                for (String string3 : set2) {
                    vector.add(string3);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "teq file " + string + " is not referenced by any shader xmls...");
        }
        Collections.sort(vector);
        this.EhF.setListData(vector);
        this.EhF.updateUI();
        this.EhH.setText("Results Count: " + vector.size());
        this.EhL.setListData(vector2);
        this.EhL.updateUI();
        if (vector.size() == 0) {
            JOptionPane.showMessageDialog(this, "no results were found...");
        }
    }

    private void eKe() {
        File[] fileArray;
        File file = new File(lcw.qLb + "xml/shader/");
        for (File file2 : fileArray = file.listFiles()) {
            jxa jxa2;
            String string;
            if (!file2.getName().toLowerCase().contains(".xml")) continue;
            Document document = null;
            try {
                document = jsy.n(new jrw(file2.getAbsolutePath()));
            }
            catch (bo bo2) {
                bo2.printStackTrace();
            }
            if (document == null || (string = (jxa2 = new jxa()).m(document)) == null) continue;
            string = string.toLowerCase();
            String string2 = file2.getName().toLowerCase();
            string2 = string2.replace("2.xml", ".xml");
            string2 = string2.replace("3.xml", ".xml");
            Set<String> set = this.EhO.get(string);
            if (set == null) {
                set = lcn.emx();
                this.EhO.put(string, set);
            }
            set.add(string2);
        }
    }

    private void h(File file) {
        File[] fileArray;
        for (File file2 : fileArray = file.listFiles()) {
            Set<String> set;
            String string;
            if (file2.isDirectory()) {
                this.h(file2);
                continue;
            }
            if (!file2.getName().toLowerCase().endsWith(".xml")) continue;
            Document document = null;
            try {
                document = jsy.n(new jrw(file2.getAbsolutePath()));
            }
            catch (bo bo2) {
                bo2.printStackTrace();
                continue;
            }
            int n = lcw.qLb.length();
            String string2 = file2.getAbsolutePath();
            string2 = string2.substring(n, string2.length());
            List<String> list = jxa.k(document);
            if (list == null) continue;
            for (String string3 : list) {
                string = string3.toLowerCase();
                set = EhN.get(string);
                if (set == null) {
                    set = lcn.emx();
                    EhN.put(string, set);
                }
                set.add(string2);
            }
            ++EhM;
            String[] stringArray = jxa.q(document);
            if (stringArray != null) {
                for (int i = 0; i < stringArray.length; ++i) {
                    if (stringArray[i] == null || stringArray[i].length() == 0) continue;
                    string = stringArray[i].toLowerCase();
                    set = this.EhP.get(string = jry.tu(string));
                    if (set == null) {
                        set = lcn.emx();
                        this.EhP.put(string, set);
                    }
                    set.add(string2);
                }
            }
            if (EhM % 10 != 0) continue;
            int n2 = EhM;
            SwingUtilities.invokeLater(new Runnable(this, n2){
                final /* synthetic */ int EhR;
                final /* synthetic */ mrb EhQ;
                {
                    this.EhQ = mrb2;
                    this.EhR = n;
                }

                public void run() {
                    if (mrb.d(this.EhQ).getParent().isVisible()) {
                        mrb.d(this.EhQ).setText("(" + this.EhR + " files parsed out of aproximately 20000...)");
                    }
                }
            });
        }
    }

    private void a(dgj dgj2, List<String> list) {
    }

    public void eKf() {
    }

    void a(File file, List<String> list, List<String> list2) {
        File[] fileArray;
        for (File file2 : fileArray = file.listFiles()) {
            if (file2.isDirectory()) {
                if (file2.getName().contains(".")) continue;
                this.a(file2, list, list2);
                continue;
            }
            boolean bl = false;
            for (String string : list2) {
                File file3 = new File(lcw.qLb + "xml/" + string);
                if (!file3.getPath().equals(file2.getPath())) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            list.add(file2.getPath());
        }
    }

    static /* synthetic */ void a(mrb mrb2, File file) {
        mrb2.h(file);
    }

    static /* synthetic */ void a(mrb mrb2) {
        mrb2.eKd();
    }

    static /* synthetic */ void b(mrb mrb2) {
        mrb2.eKb();
    }

    static /* synthetic */ void c(mrb mrb2) {
        mrb2.eKc();
    }

    static /* synthetic */ JLabel d(mrb mrb2) {
        return mrb2.EhG;
    }
}

