/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  mwn
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.jdesktop.layout.GroupLayout;

public class mwo
extends JDialog {
    private JButton Elw;
    private JButton ERJ;
    private JButton DNJ;
    private JButton EQe;
    private JTextField Eot;
    private JComboBox DGq;
    private JLabel P;
    private JLabel Q;
    private JList DFW;
    private JPanel aa;
    private JScrollPane ah;
    private static final String ERK = "All Quests";
    private List<dtz> aCS = null;
    private aux DEC;
    private dtz ERL;
    private mwl EPo;
    private mwn ERM = null;

    public mwo(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.Eot = new JTextField();
        this.ah = new JScrollPane();
        this.DFW = new JList();
        this.EQe = new JButton();
        this.ERJ = new JButton();
        this.Elw = new JButton();
        this.DGq = new JComboBox();
        this.P = new JLabel();
        this.DNJ = new JButton();
        this.Q = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("New / Edit / Delete Quests");
        this.DFW.addListSelectionListener(new ListSelectionListener(this){
            final /* synthetic */ mwo ERN;
            {
                this.ERN = mwo2;
            }

            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                mwo.a(this.ERN, listSelectionEvent);
            }
        });
        this.DFW.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mwo ERN;
            {
                this.ERN = mwo2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                mwo.a(this.ERN, mouseEvent);
            }
        });
        this.ah.setViewportView(this.DFW);
        this.EQe.setText("New");
        this.EQe.addActionListener(new ActionListener(this){
            final /* synthetic */ mwo ERN;
            {
                this.ERN = mwo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mwo.a(this.ERN, actionEvent);
            }
        });
        this.ERJ.setText("Delete");
        this.ERJ.addActionListener(new ActionListener(this){
            final /* synthetic */ mwo ERN;
            {
                this.ERN = mwo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mwo.b(this.ERN, actionEvent);
            }
        });
        this.Elw.setText("close");
        this.Elw.addActionListener(new ActionListener(this){
            final /* synthetic */ mwo ERN;
            {
                this.ERN = mwo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mwo.c(this.ERN, actionEvent);
            }
        });
        this.DGq.setModel(new DefaultComboBoxModel<String>(new String[]{ERK, "Complex Quests", "Create Object Quests", "Delivery Quests", "Gather Quests", "Kill Quests", "Talk Quests", "Use Skill On Object Quests"}));
        this.DGq.addActionListener(new ActionListener(this){
            final /* synthetic */ mwo ERN;
            {
                this.ERN = mwo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mwo.d(this.ERN, actionEvent);
            }
        });
        this.P.setText("Type :");
        this.DNJ.setText("Edit");
        this.DNJ.addActionListener(new ActionListener(this){
            final /* synthetic */ mwo ERN;
            {
                this.ERN = mwo2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mwo.e(this.ERN, actionEvent);
            }
        });
        this.Q.setText("Name :");
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(2).add(1, (Component)this.ah, -1, 577, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(2).add((Component)this.P).add((Component)this.Q)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.DGq, 0, 350, Short.MAX_VALUE).add((Component)this.Eot, -1, 350, Short.MAX_VALUE)).addPreferredGap(0).add((Component)this.EQe).addPreferredGap(0).add((Component)this.ERJ).add(4, 4, 4).add((GroupLayout.Group)groupLayout.createParallelGroup(2, false).add(1, (Component)this.Elw, -1, -1, Short.MAX_VALUE).add(1, (Component)this.DNJ, -1, -1, Short.MAX_VALUE)))).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.ah, -1, 322, Short.MAX_VALUE).add(6, 6, 6).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DGq, -2, -1, -2).add((Component)this.P).add((Component)this.DNJ).add((Component)this.EQe).add((Component)this.ERJ)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.Eot, -2, -1, -2).add((Component)this.Elw)).add((Component)this.Q)).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    private void A(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2 && mouseEvent.getButton() == 1) {
            this.eAs();
        }
    }

    private void ay(ActionEvent actionEvent) {
        this.eAs();
    }

    private void F(ActionEvent actionEvent) {
        if (this.DGq.getSelectedItem() == null) {
            return;
        }
        this.DN((String)this.DGq.getSelectedItem());
    }

    private void a(ListSelectionEvent listSelectionEvent) {
        lfn.b(0, this.getClass().getSimpleName(), "listValueChanged() : Changed!");
        this.ERL = (dtz)this.DFW.getSelectedValue();
    }

    private void bB(ActionEvent actionEvent) {
        this.dispose();
    }

    private void dy(ActionEvent actionEvent) {
        this.eSo();
    }

    private void dc(ActionEvent actionEvent) {
        this.eRM();
    }

    private void DM(String string) {
        this.aCS = this.EPo.dTv();
        Collections.sort(this.aCS);
        String string2 = (String)this.DGq.getSelectedItem();
        boolean bl = !string2.equals(ERK);
        Iterator<dtz> iterator = this.aCS.iterator();
        while (iterator.hasNext()) {
            boolean bl2;
            dtz dtz2 = iterator.next();
            boolean bl3 = bl2 = bl ? dtz2.Type.name().equals(string2) : true;
            if (dtz2.Filename.toLowerCase().contains(string.toLowerCase()) && bl2) continue;
            iterator.remove();
        }
        this.DFW.setListData(this.aCS.toArray());
    }

    private void c() {
        this.EPo = new mwl();
        boolean bl = this.EPo.ekc();
        if (!bl) {
            JOptionPane.showMessageDialog((Component)this.DEC, "Error Connecting to Database! Check Log!", "Database Error", 0);
            return;
        }
        dud[] dudArray = dud.values();
        String[] stringArray = new String[dudArray.length + 1];
        stringArray[0] = ERK;
        for (int i = 1; i < stringArray.length; ++i) {
            stringArray[i] = dudArray[i - 1].name();
        }
        this.DGq.setModel(new DefaultComboBoxModel<String>(stringArray));
        this.DN(ERK);
        this.Eot.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mwo ERN;
            {
                this.ERN = mwo2;
            }

            public void keyReleased(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10) {
                    mwo.a(this.ERN, mwo.b(this.ERN).getText());
                }
            }
        });
    }

    private void eRM() {
        Object[] objectArray = new String[]{"Complex Quest", "Sub-Quest"};
        Object object = JOptionPane.showInputDialog(this, "Choose Quest type:", "New Quest", -1, null, objectArray, objectArray[0]);
        if (object == null) {
            return;
        }
        dtz dtz2 = null;
        if (object == objectArray[0]) {
            dtz2 = new dty();
            dtz2.Type = dud.hdM;
        } else {
            dtz2 = new due();
            dtz2.Type = dud.hdQ;
        }
        this.ERL = dtz2;
        this.eAs();
    }

    private void eAs() {
        if (this.ERL == null) {
            JOptionPane.showMessageDialog(this, "Selected Quest is NULL!!!");
            return;
        }
        if (this.ERM == null) {
            this.ERM = new mwn(this.ERL, this.EPo);
            this.ERM.p(this.DEC);
            this.ERM.a(this);
            this.DEC.eCu().add((Component)this.ERM);
            this.ERM.setVisible(true);
            this.setVisible(false);
        } else {
            this.ERM.d(this.ERL);
        }
    }

    private void eSo() {
        if (this.ERL == null) {
            return;
        }
        int n = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete [" + this.ERL.Type.name() + "] with name [" + this.ERL.Name + "] ?", "Delete Quest", 0, 3);
        if (n != 0) {
            return;
        }
        int n2 = this.EPo.afR(this.ERL.ID);
        if (n2 < 0) {
            JOptionPane.showMessageDialog(this, "Database Error!", "Delete Quest", 0);
            return;
        }
        JOptionPane.showMessageDialog(this, "[" + this.ERL.Type.name() + "] with name [" + this.ERL.Name + "] has been deleted.", "Delete Quest", 1);
        this.DN(ERK);
    }

    private void DN(String string) {
        this.Eot.setText("");
        this.aCS = this.EPo.dTv();
        Collections.sort(this.aCS);
        if (!string.equals(ERK)) {
            Iterator<dtz> iterator = this.aCS.iterator();
            while (iterator.hasNext()) {
                dtz dtz2 = iterator.next();
                if (dtz2.Type.name().equals(string)) continue;
                iterator.remove();
            }
        }
        this.DFW.setListData(this.aCS.toArray());
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mwo mwo2, ListSelectionEvent listSelectionEvent) {
        mwo2.a(listSelectionEvent);
    }

    static /* synthetic */ void a(mwo mwo2, MouseEvent mouseEvent) {
        mwo2.A(mouseEvent);
    }

    static /* synthetic */ void a(mwo mwo2, ActionEvent actionEvent) {
        mwo2.dc(actionEvent);
    }

    static /* synthetic */ void b(mwo mwo2, ActionEvent actionEvent) {
        mwo2.dy(actionEvent);
    }

    static /* synthetic */ void c(mwo mwo2, ActionEvent actionEvent) {
        mwo2.bB(actionEvent);
    }

    static /* synthetic */ void d(mwo mwo2, ActionEvent actionEvent) {
        mwo2.F(actionEvent);
    }

    static /* synthetic */ void e(mwo mwo2, ActionEvent actionEvent) {
        mwo2.ay(actionEvent);
    }

    static /* synthetic */ JTextField b(mwo mwo2) {
        return mwo2.Eot;
    }

    static /* synthetic */ void a(mwo mwo2, String string) {
        mwo2.DM(string);
    }
}

