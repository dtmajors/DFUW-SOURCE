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
import java.util.Map;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.jdesktop.layout.GroupLayout;

public class mun
extends JDialog {
    private JButton ErD;
    private JList EGM;
    private JPanel aa;
    private JScrollPane ah;
    private String[] aDd;
    boolean EGN = true;

    public mun(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.EGM = new JList();
        this.ErD = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Add Skill");
        this.EGM.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ mun EGO;
            {
                this.EGO = mun2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.ah.setViewportView(this.EGM);
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.ah, -1, 435, Short.MAX_VALUE).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.ah, -1, 399, Short.MAX_VALUE).addContainerGap()));
        this.ErD.setText("Add Skill(s)");
        this.ErD.addActionListener(new ActionListener(this){
            final /* synthetic */ mun EGO;
            {
                this.EGO = mun2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mun.a(this.EGO, actionEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.ErD).addContainerGap(360, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addPreferredGap(0).add((Component)this.ErD).addContainerGap()));
        this.pack();
    }

    private void cx(ActionEvent actionEvent) {
        this.ePM();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mun((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void c() {
        if (this.EGN) {
            Map<Integer, cuo> map = cxj.bfS();
            cuo[] cuoArray = map.values().toArray(new cuo[map.size()]);
            this.EGM.setListData(cuoArray);
        }
    }

    private void ePM() {
        Object[] objectArray = this.EGM.getSelectedValues();
        if (objectArray == null || objectArray.length == 0) {
            JOptionPane.showMessageDialog(this, "No Skills Selected", "Error", 0);
            return;
        }
        this.aDd = new String[objectArray.length];
        for (int i = 0; i < objectArray.length; ++i) {
            cuo cuo2 = (cuo)objectArray[i];
            this.aDd[i] = cuo2.Bu();
        }
        this.dispose();
    }

    public String[] ePN() {
        return this.aDd;
    }

    static /* synthetic */ void a(mun mun2, ActionEvent actionEvent) {
        mun2.cx(actionEvent);
    }
}

