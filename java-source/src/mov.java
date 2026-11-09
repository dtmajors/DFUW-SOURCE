/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 *  skt.swing.SwingUtil
 *  skt.swing.search.ListFindAction
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.AbstractListModel;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.jdesktop.layout.GroupLayout;
import skt.swing.SwingUtil;
import skt.swing.search.ListFindAction;

public class mov
extends JDialog {
    private JButton qtg;
    private JButton DEt;
    private JList DFW;
    private JPanel aa;
    private JScrollPane ah;
    private String[] DTy = null;
    private final String DTz = "AttachPoint_";

    public mov(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.DFW = new JList();
        this.DEt = new JButton();
        this.qtg = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Choose new attachpoint");
        this.DFW.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ mov DTA;
            {
                this.DTA = mov2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.ah.setViewportView(this.DFW);
        this.DEt.setText("Ok");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ mov DTA;
            {
                this.DTA = mov2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mov.a(this.DTA, actionEvent);
            }
        });
        this.qtg.setText("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mov DTA;
            {
                this.DTA = mov2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mov.b(this.DTA, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.ah, -1, 313, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DEt).addPreferredGap(0).add((Component)this.qtg))).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.ah, -1, 562, Short.MAX_VALUE).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DEt).add((Component)this.qtg)).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    private void H(ActionEvent actionEvent) {
        this.DTy = null;
        this.dispose();
    }

    private void I(ActionEvent actionEvent) {
        this.eHW();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mov((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void eHW() {
        String[] stringArray = this.eHX();
        int[] nArray = this.DFW.getSelectedIndices();
        if (nArray != null && nArray.length != 0) {
            this.DTy = new String[nArray.length];
            for (int i = 0; i < nArray.length; ++i) {
                this.DTy[i] = stringArray[nArray[i]];
            }
        } else {
            this.DTy = null;
        }
        this.dispose();
    }

    private void c() {
        String[] stringArray = this.eHX();
        String[] stringArray2 = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            if (string.startsWith("AttachPoint_")) {
                string = string.substring("AttachPoint_".length());
            }
            stringArray2[i] = string;
        }
        this.DFW.setListData(stringArray2);
        SwingUtil.installActions((JComponent)this.DFW, (Action[])new Action[]{new ListFindAction(false), new ListFindAction(true)});
    }

    private String[] eHX() {
        int n;
        String[] stringArray = ei.fe();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (n = 0; n < stringArray.length; ++n) {
            arrayList.add(stringArray[n]);
        }
        Collections.sort(arrayList);
        n = 0;
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            stringArray[n] = (String)iterator.next();
            ++n;
        }
        return stringArray;
    }

    public String[] eHY() {
        return this.DTy;
    }

    static /* synthetic */ void a(mov mov2, ActionEvent actionEvent) {
        mov2.I(actionEvent);
    }

    static /* synthetic */ void b(mov mov2, ActionEvent actionEvent) {
        mov2.H(actionEvent);
    }
}

