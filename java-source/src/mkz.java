/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.jdesktop.layout.GroupLayout;

public class mkz
extends JDialog {
    private JButton qtg;
    private JButton DGp;
    private JButton DEt;
    private JComboBox DGq;
    private JLabel I;
    private JList DFW;
    private JPanel aa;
    private JScrollPane ah;
    private final String DGr = "shader";
    private String DGs;
    private boolean DGt;

    public mkz(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.ah = new JScrollPane();
        this.DFW = new JList();
        this.DEt = new JButton();
        this.qtg = new JButton();
        this.DGp = new JButton();
        this.DGq = new JComboBox();
        this.setDefaultCloseOperation(2);
        this.setTitle("Change Shader for object");
        this.I.setText("Choose new Shader:");
        this.DFW.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ mkz DGu;
            {
                this.DGu = mkz2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.DFW.addListSelectionListener(new ListSelectionListener(this){
            final /* synthetic */ mkz DGu;
            {
                this.DGu = mkz2;
            }

            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                mkz.a(this.DGu, listSelectionEvent);
            }
        });
        this.ah.setViewportView(this.DFW);
        this.DEt.setText("Ok");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ mkz DGu;
            {
                this.DGu = mkz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mkz.a(this.DGu, actionEvent);
            }
        });
        this.qtg.setText("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mkz DGu;
            {
                this.DGu = mkz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mkz.b(this.DGu, actionEvent);
            }
        });
        this.DGp.setText("Exclude");
        this.DGp.addActionListener(new ActionListener(this){
            final /* synthetic */ mkz DGu;
            {
                this.DGu = mkz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mkz.c(this.DGu, actionEvent);
            }
        });
        this.DGq.setModel(new DefaultComboBoxModel<String>(new String[]{"Show Normal Mesh Shaders", "Show Animated Mesh Shaders"}));
        this.DGq.addActionListener(new ActionListener(this){
            final /* synthetic */ mkz DGu;
            {
                this.DGu = mkz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mkz.d(this.DGu, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(2).add(1, (Component)this.ah, -1, 294, Short.MAX_VALUE).add(1, (Component)this.I, -1, 294, Short.MAX_VALUE).add(1, (GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DEt).addPreferredGap(0).add((Component)this.qtg).addPreferredGap(0, 109, Short.MAX_VALUE).add((Component)this.DGp)).add(1, (Component)this.DGq, 0, 294, Short.MAX_VALUE)).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.I).addPreferredGap(0).add((Component)this.ah, -1, 305, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.DGq, -2, -1, -2).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DEt).add((Component)this.qtg).add((Component)this.DGp)).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    private void F(ActionEvent actionEvent) {
        if (this.DGq.getSelectedIndex() < 0) {
            return;
        }
        this.DGt = this.DGq.getSelectedIndex() != 0;
        this.eDz();
    }

    private void a(ListSelectionEvent listSelectionEvent) {
        lfn.b(0, this.getClass().getSimpleName(), "listValueChanged() : Changed!");
        this.DGs = "shader" + (String)this.DFW.getSelectedValue();
    }

    private void G(ActionEvent actionEvent) {
        this.eDE();
    }

    private void H(ActionEvent actionEvent) {
        this.DGs = null;
        this.dispose();
    }

    private void I(ActionEvent actionEvent) {
        this.dispose();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mkz((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void c() {
        this.eDz();
    }

    private void eDz() {
        List<String> list = mzn.eTv();
        ArrayList<String> arrayList = lcn.abH(list.size());
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next().toLowerCase();
            if (!string.startsWith("shader")) {
                assert (false);
                continue;
            }
            string = string.substring("shader".length());
            if (this.DGt) {
                if (!string.startsWith("anim")) continue;
                arrayList.add(string);
                continue;
            }
            if (string.startsWith("anim")) continue;
            arrayList.add(string);
        }
        this.DFW.setListData(arrayList.toArray());
    }

    private void eDE() {
        String string = "shader" + (String)this.DFW.getSelectedValue();
        int n = JOptionPane.showConfirmDialog(this, "Exclude [" + string + "] from shader list?", "Exclude shader", 0);
        if (n == 1) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(mzn.EUS));
        String string2 = "^" + string + "$";
        arrayList.add(string2);
        mzn.EUS = arrayList.toArray(new String[arrayList.size()]);
        mzn.eTw();
        this.eDz();
    }

    public String eDF() {
        return this.DGs;
    }

    static /* synthetic */ void a(mkz mkz2, ListSelectionEvent listSelectionEvent) {
        mkz2.a(listSelectionEvent);
    }

    static /* synthetic */ void a(mkz mkz2, ActionEvent actionEvent) {
        mkz2.I(actionEvent);
    }

    static /* synthetic */ void b(mkz mkz2, ActionEvent actionEvent) {
        mkz2.H(actionEvent);
    }

    static /* synthetic */ void c(mkz mkz2, ActionEvent actionEvent) {
        mkz2.G(actionEvent);
    }

    static /* synthetic */ void d(mkz mkz2, ActionEvent actionEvent) {
        mkz2.F(actionEvent);
    }
}

