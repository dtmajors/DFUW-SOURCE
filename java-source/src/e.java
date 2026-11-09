/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdesktop.layout.GroupLayout;
import org.w3c.dom.Document;

public class e
extends JDialog {
    private JTextField bD;
    private JComboBox bE;
    private JPanel bF;
    private JPanel bG;
    private JButton bH;
    private JButton bI;
    private JButton bJ;
    private JTextField bK;
    private JTextField bL;
    private JButton bM;
    private JLabel I;
    private JLabel P;
    private JLabel R;
    private JPanel aa;
    private JPanel bN;
    private Vector<String> bO = new Vector();
    private String bP = "[a-zA-Z][a-fA-F]{0,1}[0-9]{2}$";
    private b av;
    private Map<String, btg> ax;
    private mrq bQ;
    private String bR;
    private a bS;

    public e(Frame frame, boolean bl, Map<String, btg> map) {
        super(frame, bl);
        this.ax = map;
        this.b();
        this.c();
    }

    public e(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.R = new JLabel();
        this.bK = new JTextField();
        this.bD = new JTextField();
        this.P = new JLabel();
        this.bL = new JTextField();
        this.bF = new JPanel();
        this.bN = new JPanel();
        this.bE = new JComboBox();
        this.bM = new JButton();
        this.bH = new JButton();
        this.bI = new JButton();
        this.bJ = new JButton();
        this.bG = new JPanel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Darkfall Launcher World Map");
        this.setResizable(false);
        this.addWindowListener(new WindowAdapter(this){
            final /* synthetic */ e bT;
            {
                this.bT = e2;
            }

            public void windowClosing(WindowEvent windowEvent) {
                e.a(this.bT, windowEvent);
            }
        });
        this.aa.setBorder(BorderFactory.createTitledBorder("Tile Info"));
        this.I.setText("Current:");
        this.R.setText("Selected Tiles:");
        this.bK.setEditable(false);
        this.bD.setEditable(false);
        this.P.setText("Selected ZONE:");
        this.bL.setEditable(false);
        GroupLayout groupLayout = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(2).add((Component)this.P).add((Component)this.I).add((Component)this.R)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.bD, -1, 429, Short.MAX_VALUE).add((Component)this.bK, -1, 429, Short.MAX_VALUE).add((Component)this.bL, -1, 429, Short.MAX_VALUE)).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.I).add((Component)this.bD, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.R).add((Component)this.bK, -2, -1, -2)).addPreferredGap(0).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.P).add((Component)this.bL, -2, -1, -2)).addContainerGap(-1, Short.MAX_VALUE)));
        this.bF.setBorder(BorderFactory.createTitledBorder("World Map"));
        this.bF.setFocusable(false);
        this.bF.setOpaque(false);
        this.bF.setLayout(new BorderLayout());
        this.bN.setBorder(BorderFactory.createTitledBorder("Custom Zones"));
        this.bE.setModel(new DefaultComboBoxModel<String>(new String[]{"no extra zones"}));
        this.bE.addActionListener(new ActionListener(this){
            final /* synthetic */ e bT;
            {
                this.bT = e2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                e.a(this.bT, actionEvent);
            }
        });
        this.bM.setText("Create Zone From Selected Levels");
        this.bM.addActionListener(new ActionListener(this){
            final /* synthetic */ e bT;
            {
                this.bT = e2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                e.b(this.bT, actionEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((Component)this.bE, 0, 508, Short.MAX_VALUE).add((Component)this.bM)).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.bE, -2, -1, -2).addPreferredGap(0, 10, Short.MAX_VALUE).add((Component)this.bM).addContainerGap()));
        this.bH.setText("OK");
        this.bH.addActionListener(new ActionListener(this){
            final /* synthetic */ e bT;
            {
                this.bT = e2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                e.c(this.bT, actionEvent);
            }
        });
        this.bI.setText("Select All");
        this.bI.addActionListener(new ActionListener(this){
            final /* synthetic */ e bT;
            {
                this.bT = e2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                e.d(this.bT, actionEvent);
            }
        });
        this.bJ.setText("Clear Selection");
        this.bJ.addActionListener(new ActionListener(this){
            final /* synthetic */ e bT;
            {
                this.bT = e2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                e.e(this.bT, actionEvent);
            }
        });
        this.bG.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder("Tile minimap")));
        GroupLayout groupLayout3 = new GroupLayout((Container)this.bG);
        this.bG.setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add(0, 329, Short.MAX_VALUE));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add(0, 327, Short.MAX_VALUE));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout4);
        groupLayout4.setHorizontalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().add((Component)this.bI).addPreferredGap(0).add((Component)this.bJ).addPreferredGap(0, 738, Short.MAX_VALUE).add((Component)this.bH)).add((GroupLayout.Group)groupLayout4.createSequentialGroup().add((GroupLayout.Group)groupLayout4.createParallelGroup(2, false).add(1, (Component)this.aa, -1, -1, Short.MAX_VALUE).add(1, (Component)this.bN, -1, -1, Short.MAX_VALUE).add(1, (Component)this.bF, -1, 540, Short.MAX_VALUE)).add(18, 18, 18).add((Component)this.bG, -2, -1, -2))).addContainerGap()));
        groupLayout4.setVerticalGroup((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((GroupLayout.Group)groupLayout4.createSequentialGroup().addContainerGap().add((Component)this.aa, -2, -1, -2).addPreferredGap(0).add((Component)this.bN, -2, -1, -2).addPreferredGap(0).add((GroupLayout.Group)groupLayout4.createParallelGroup(1).add((Component)this.bG, -2, -1, -2).add((GroupLayout.Group)groupLayout4.createSequentialGroup().add((Component)this.bF, -2, 546, -2).addPreferredGap(0).add((GroupLayout.Group)groupLayout4.createParallelGroup(3).add((Component)this.bI).add((Component)this.bJ).add((Component)this.bH)))).addContainerGap(-1, Short.MAX_VALUE)));
        this.pack();
    }

    private void h(ActionEvent actionEvent) {
        this.bQ.selectAll();
    }

    private void i(ActionEvent actionEvent) {
        this.bQ.eLx();
    }

    private void j(ActionEvent actionEvent) {
        this.p();
    }

    private void k(ActionEvent actionEvent) {
        this.o();
    }

    private void l(ActionEvent actionEvent) {
        this.n();
    }

    private void a(WindowEvent windowEvent) {
        this.bS.bU = false;
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new e((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void c() {
        this.bQ = new mrq();
        this.bF.add((Component)this.bQ, "Center");
        this.bF.repaint();
        this.m();
        this.bS = new a(this, null);
        new Thread(this.bS).start();
    }

    private void m() {
        Set<Map.Entry<String, btg>> set = this.ax.entrySet();
        for (Map.Entry<String, btg> entry : set) {
            if (Pattern.matches(this.bP, entry.getKey()) || entry.getKey().endsWith("_empty")) continue;
            this.bO.add(entry.getKey());
        }
        if (!this.bO.isEmpty()) {
            this.bE.removeAllItems();
            Collections.sort(this.bO);
            for (String string : this.bO) {
                this.bE.addItem(string);
            }
        }
    }

    private void n() {
        String string = (String)this.bE.getSelectedItem();
        if (string == null || this.av == null) {
            return;
        }
        this.bQ.eLx();
        this.bL.setText(string.toLowerCase());
        this.bK.setText("ExtraZone");
        this.bD.setText(string.toLowerCase());
        this.bR = string.toLowerCase();
        this.av.bb = this.bK.getText();
        this.av.TileLocation = this.bD.getText();
        this.q();
    }

    private void o() {
        int n2;
        ArrayList<String> arrayList = lcn.emv();
        int[][] nArray = this.bQ.eLy();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            for (int i3 = 0; i3 < nArray[i2].length; ++i3) {
                if (nArray[i2][i3] == 0) continue;
                String string = lcw.f((lej)new lej(i2, i3)).toLowerCase();
                arrayList.add(string);
            }
        }
        if (arrayList.size() < 2) {
            JOptionPane.showMessageDialog(this, "Only one Tile selected. Use existing Zone for Tile", "Error", 0);
            return;
        }
        ArrayList<bst> arrayList2 = lcn.emv();
        for (String string : arrayList) {
            int n3 = 0;
            if (Pattern.matches(this.bP, string)) {
                n3 = lcw.g((lej)lcw.zf((String)string));
            }
            bst bst2 = new bst(string + ".lvl", n3);
            arrayList2.add(bst2);
            ljq ljq2 = null;
            if (Pattern.matches(this.bP, string) && (ljq2 = lcw.zh((String)string)) != null) {
                ljq2.x += 512.0f;
                ljq2.rlV += 512.0f;
            }
            if (ljq2 == null) {
                ljq2 = new ljq();
            }
            bss bss2 = new bss();
            float f2 = lcw.qGD.x / 2.0f;
            bss2.dJw = ljq2.x - f2;
            bss2.dJx = ljq2.y - 2000.0f;
            bss2.dJy = ljq2.rlV - f2;
            bss2.dJz = ljq2.x + f2;
            bss2.dJA = ljq2.y + 2000.0f;
            bss2.dJB = ljq2.rlV + f2;
            bst2.a(bss2);
        }
        Object object = JOptionPane.showInputDialog(this, (Object)"Enter Name of new Zone: ");
        assert (this.ax != null);
        if (this.ax.containsKey(object = ((String)object).toLowerCase()) && (n2 = JOptionPane.showConfirmDialog(this, "Zone already exists. Overwrite?", "Zone exists", 0)) != 0) {
            return;
        }
        btg btg2 = new btg();
        btg2.gl((String)object);
        btg2.an(arrayList2);
        this.ax.put((String)object, btg2);
        jzd jzd2 = new jzd();
        jzd2.V(this.ax);
        this.m();
        this.bE.setSelectedItem(object);
    }

    private int a(String string, jxd jxd2) {
        int n2 = 0;
        String string2 = lcw.qLb + "xml-files/objectspace/" + "built_tiles/";
        String string3 = string2 + string + "/" + string + ".xml";
        Document document = null;
        try {
            document = jsy.n(new jrw(string3));
        }
        catch (bo bo2) {
            // empty catch block
        }
        if (document != null) {
            ldv ldv2 = jxd2.t(document);
            n2 = ldv2.enw();
        }
        return n2;
    }

    private void p() {
        int n2;
        this.bS.bU = false;
        ArrayList<String> arrayList = lcn.emv();
        int[][] nArray = this.bQ.eLy();
        for (n2 = 0; n2 < nArray.length; ++n2) {
            for (int i2 = 0; i2 < nArray[n2].length; ++i2) {
                if (nArray[n2][i2] == 0) continue;
                String string = lcw.f((lej)new lej(n2, i2)).toLowerCase();
                arrayList.add(string);
            }
        }
        if (arrayList.isEmpty()) {
            if (this.bR == null || this.bR.equals("")) {
                this.dispose();
                return;
            }
            this.dispose();
            return;
        }
        if (arrayList.size() == 1) {
            if (this.bR == null || this.bR.equals("")) {
                this.bR = (String)arrayList.get(0);
                this.av.bb = this.bK.getText();
                this.av.TileLocation = this.bR;
                this.dispose();
                return;
            }
            n2 = JOptionPane.showConfirmDialog(this, "1 Tile Selected and Zone selected. Click YES to choose Tile, NO to choose Zone, or CANCEL to cancel.", "Choose Tile or Zone?", 1);
            if (n2 == 0) {
                this.bR = (String)arrayList.get(0);
                this.dispose();
                return;
            }
            if (n2 == 1) {
                this.dispose();
                return;
            }
            return;
        }
        if (this.bR == null || this.bR.equals("")) {
            n2 = JOptionPane.showConfirmDialog(this, "No Zone selected, but multiple Tiles Selected. Generate a Zone for the tiles?", "Create new Zone?", 0);
            if (n2 != 0) {
                this.bR = null;
                this.dispose();
                return;
            }
            this.o();
            this.dispose();
            return;
        }
        if (this.bR != null && !this.bR.equals("")) {
            n2 = JOptionPane.showConfirmDialog(this, "Zone selected, and multiple Tiles Selected. Use Zone?", "Use Chosen Zone?", 0);
            if (n2 != 0) {
                return;
            }
            this.dispose();
            return;
        }
    }

    public void q() {
        String string = this.av.TileLocation;
        if (string == null || string.equals("")) {
            return;
        }
        btg btg2 = this.ax.get(string);
        if (btg2 == null) {
            return;
        }
        assert (this.bQ != null);
        int[][] nArray = this.bQ.eLy();
        try {
            for (bst bst2 : btg2.axy()) {
                int n2 = bst2.axf().lastIndexOf(".lvl");
                if (n2 == -1) {
                    return;
                }
                ljq ljq2 = lcw.zh((String)bst2.axf().substring(0, n2));
                if (ljq2 == null) continue;
                lej lej2 = lcw.dW((ljq)ljq2);
                nArray[lej2.getX()][lej2.getY() - 1] = 1;
            }
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    public void b(b b2) {
        this.av = b2;
    }

    public void a(Map<String, btg> map) {
        this.ax = map;
    }

    static /* synthetic */ void a(e e2, WindowEvent windowEvent) {
        e2.a(windowEvent);
    }

    static /* synthetic */ void a(e e2, ActionEvent actionEvent) {
        e2.l(actionEvent);
    }

    static /* synthetic */ void b(e e2, ActionEvent actionEvent) {
        e2.k(actionEvent);
    }

    static /* synthetic */ void c(e e2, ActionEvent actionEvent) {
        e2.j(actionEvent);
    }

    static /* synthetic */ void d(e e2, ActionEvent actionEvent) {
        e2.h(actionEvent);
    }

    static /* synthetic */ void e(e e2, ActionEvent actionEvent) {
        e2.i(actionEvent);
    }

    static /* synthetic */ mrq a(e e2) {
        return e2.bQ;
    }

    static /* synthetic */ JTextField b(e e2) {
        return e2.bD;
    }

    static /* synthetic */ JTextField c(e e2) {
        return e2.bK;
    }

    static /* synthetic */ JTextField d(e e2) {
        return e2.bL;
    }
}

