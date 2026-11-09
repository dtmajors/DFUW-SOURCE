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
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import org.jdesktop.layout.GroupLayout;

public class mkw
extends JDialog {
    private JButton DFU;
    private JButton DFV;
    private JLabel I;
    private JList DFW;
    private JPanel aa;
    private JScrollPane ah;

    public mkw(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.ah = new JScrollPane();
        this.DFW = new JList();
        this.DFV = new JButton();
        this.DFU = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Blacklisted Objects");
        this.I.setText("Blacklisted Objects:");
        this.DFW.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ mkw DFX;
            {
                this.DFX = mkw2;
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
            final /* synthetic */ mkw DFX;
            {
                this.DFX = mkw2;
            }

            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                mkw.a(this.DFX, listSelectionEvent);
            }
        });
        this.ah.setViewportView(this.DFW);
        this.DFV.setText("Remove Object(s)");
        this.DFV.addActionListener(new ActionListener(this){
            final /* synthetic */ mkw DFX;
            {
                this.DFX = mkw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mkw.a(this.DFX, actionEvent);
            }
        });
        this.DFU.setText("Add Object(s)");
        this.DFU.addActionListener(new ActionListener(this){
            final /* synthetic */ mkw DFX;
            {
                this.DFX = mkw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mkw.b(this.DFX, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(2).add(1, (Component)this.ah, -1, 294, Short.MAX_VALUE).add(1, (Component)this.I, -1, 294, Short.MAX_VALUE).add(1, (GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DFV).addPreferredGap(0, 76, Short.MAX_VALUE).add((Component)this.DFU))).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.I).addPreferredGap(0).add((Component)this.ah, -1, 333, Short.MAX_VALUE).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DFV).add((Component)this.DFU)).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    private void a(ListSelectionEvent listSelectionEvent) {
        lfn.b(0, this.getClass().getSimpleName(), "listValueChanged() : Changed!");
    }

    private void C(ActionEvent actionEvent) {
        this.eDA();
    }

    private void D(ActionEvent actionEvent) {
        this.eDB();
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
        String[] stringArray = myz.EUS;
        if (stringArray == null) {
            try {
                myz.eTr();
            }
            catch (bg bg2) {
                bg2.printStackTrace();
                return;
            }
            stringArray = myz.EUS;
        }
        this.DFW.setListData(stringArray);
    }

    private void eDA() {
        jrw[] jrwArray;
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "xml/");
            jrwArray = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter((FileFilter)jrwArray);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setMultiSelectionEnabled(true);
            mkb2.setFileSelectionMode(2);
            n = mkb2.showDialog(this, "Add To Blacklist");
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        jrwArray = mkb2.eDe();
        if (jrwArray != null && n == 0) {
            for (jrw jrw2 : jrwArray) {
                String string = jrw2.getName();
                ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(myz.EUS));
                String string2 = "^" + string + "$";
                arrayList.add(string2);
                myz.EUS = arrayList.toArray(new String[arrayList.size()]);
                myz.eTq();
                this.eDz();
            }
        }
    }

    private void eDB() {
        String string = (String)this.DFW.getSelectedValue();
        if (string == null) {
            return;
        }
        int n = JOptionPane.showConfirmDialog(this, "Remove [" + string + "] from blacklist?", "Remove Object", 0);
        if (n == 1) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(myz.EUS));
        arrayList.remove(string);
        myz.EUS = arrayList.toArray(new String[arrayList.size()]);
        myz.eTq();
    }

    static /* synthetic */ void a(mkw mkw2, ListSelectionEvent listSelectionEvent) {
        mkw2.a(listSelectionEvent);
    }

    static /* synthetic */ void a(mkw mkw2, ActionEvent actionEvent) {
        mkw2.D(actionEvent);
    }

    static /* synthetic */ void b(mkw mkw2, ActionEvent actionEvent) {
        mkw2.C(actionEvent);
    }
}

