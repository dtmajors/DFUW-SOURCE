/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ari
 *  aux
 *  cug
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class mua
extends mkx {
    private static final String EEX = "[--No Tags--]";
    aux DEC = null;
    private List<ler> aGu;
    private List<String> EEY;
    private JSpinner EEZ;
    private JTextArea EFa;
    private JCheckBox EFb;
    private a EFc;
    private mtz EFd;
    private mtz EFe;
    private mtz EFf;
    private JLabel EFg;
    private JCheckBox EFh;
    private JCheckBox EFi;
    private mug EFj;
    private mug EFk;
    private JCheckBox EFl;
    private boolean EFm = false;
    protected Set<Integer> EFn = new HashSet<Integer>();

    public mua(aux aux2) {
        this.setSize(new Dimension(809, 797));
        this.setResizable(false);
        this.setClosable(true);
        this.setTitle("Loot Editor - Alpha Version");
        JTabbedPane jTabbedPane = new JTabbedPane(1);
        this.DGa.add((Component)jTabbedPane, "Center");
        JPanel jPanel = new JPanel();
        jTabbedPane.addTab("Simulation", null, jPanel, null);
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        jPanel3.setBorder(new TitledBorder(null, "Simlute", 4, 2, null, null));
        JPanel jPanel4 = new JPanel();
        jPanel4.setBorder(new TitledBorder(null, "Resources", 4, 2, null, null));
        JPanel jPanel5 = new JPanel();
        jPanel5.setBorder(new TitledBorder(null, "Spawnpoints", 4, 2, null, null));
        JPanel jPanel6 = new JPanel();
        jPanel6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Resource Info", 4, 2, null, new Color(0, 0, 0)));
        this.EFg = new JLabel("Name:");
        JPanel jPanel7 = new JPanel();
        jPanel7.setBorder(new TitledBorder(null, "Selected Item Tags", 4, 2, null, null));
        jPanel7.setLayout(new BoxLayout(jPanel7, 0));
        JScrollPane jScrollPane = new JScrollPane();
        jPanel7.add(jScrollPane);
        this.EFc = new a(this, null);
        this.EFc.setCellRenderer(new b(this));
        jScrollPane.setViewportView(this.EFc);
        this.EFc.setSelectionMode(0);
        this.EFc.setModel(new DefaultListModel());
        this.EFl = new JCheckBox("Include Inherited Tags");
        this.EFl.setSelected(true);
        GroupLayout groupLayout = new GroupLayout(jPanel6);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(10).addComponent(this.EFg, -1, 277, Short.MAX_VALUE).addContainerGap()).addComponent(jPanel7, -1, 297, Short.MAX_VALUE).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.EFl).addContainerGap(194, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.EFg).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EFl).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(jPanel7, -2, 115, -2)));
        this.EFc.addKeyListener(new KeyListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 127) {
                    this.EFo.j(keyEvent);
                }
            }

            public void keyReleased(KeyEvent keyEvent) {
            }

            public void keyTyped(KeyEvent keyEvent) {
            }
        });
        this.EFc.addListSelectionListener(new ListSelectionListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                this.EFo.c(listSelectionEvent);
            }
        });
        jPanel6.setLayout(groupLayout);
        GroupLayout groupLayout2 = new GroupLayout(jPanel2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGap(10).addComponent(jPanel3, -2, 309, Short.MAX_VALUE)).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(jPanel4, -2, 306, -2)).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jPanel6, 0, 0, Short.MAX_VALUE).addGroup(groupLayout2.createSequentialGroup().addComponent(jPanel5, -2, 304, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE))))).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(jPanel4, -2, 134, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel5, -2, 121, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel6, -1, 183, Short.MAX_VALUE).addGap(18).addComponent(jPanel3, -2, 217, -2).addContainerGap()));
        this.EFe = new mtz();
        GroupLayout groupLayout3 = new GroupLayout(jPanel5);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EFe, -1, 292, Short.MAX_VALUE));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addComponent(this.EFe, -2, 93, -2).addContainerGap(207, Short.MAX_VALUE)));
        this.EFe.a(new MouseAdapter(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                this.EFo.w(mouseEvent);
            }
        });
        jPanel5.setLayout(groupLayout3);
        this.EFf = new mtz();
        GroupLayout groupLayout4 = new GroupLayout(jPanel4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EFf, -1, 294, Short.MAX_VALUE));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EFf, -1, 107, Short.MAX_VALUE));
        this.EFf.a(new MouseAdapter(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                this.EFo.v(mouseEvent);
            }
        });
        jPanel4.setLayout(groupLayout4);
        this.EFb = new JCheckBox("Include skinning");
        this.EFb.setSelected(true);
        JLabel jLabel = new JLabel("Count");
        this.EEZ = new JSpinner();
        this.EEZ.setToolTipText("# of loot samplings");
        this.EEZ.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
        JButton jButton = new JButton("Simulate");
        JButton jButton2 = new JButton("Copy CSV");
        this.EFh = new JCheckBox("Use selected spawnpoint");
        this.EFh.setEnabled(false);
        this.EFh.setToolTipText("Check to include the loot tags of a specific spawnpoint in the loot simulation");
        JScrollPane jScrollPane2 = new JScrollPane();
        jScrollPane2.setViewportBorder(new TitledBorder(null, "Sample Loot", 4, 2, null, null));
        this.EFa = new JTextArea();
        jScrollPane2.setViewportView(this.EFa);
        this.EFa.setFont(UIManager.getFont("TextField.font"));
        this.EFa.setRows(5);
        this.EFa.setEditable(false);
        GroupLayout groupLayout5 = new GroupLayout(jPanel3);
        groupLayout5.setHorizontalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addContainerGap().addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jScrollPane2, -2, 277, -2).addGroup(groupLayout5.createSequentialGroup().addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addComponent(this.EFb).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel)).addComponent(this.EFh)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EEZ, -2, 68, -2)).addGroup(groupLayout5.createSequentialGroup().addComponent(jButton).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton2))).addContainerGap()));
        groupLayout5.setVerticalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(groupLayout5.createSequentialGroup().addContainerGap().addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EFb).addComponent(jLabel).addComponent(this.EEZ, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EFh).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jButton).addComponent(jButton2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jScrollPane2, -2, 91, -2).addGap(29)));
        jPanel3.setLayout(groupLayout5);
        jButton2.addActionListener(new ActionListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mua.a(this.EFo);
            }
        });
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mua.b(this.EFo);
            }
        });
        jPanel.setLayout(new BorderLayout(0, 0));
        jPanel2.setLayout(groupLayout2);
        jPanel.add((Component)jPanel2, "West");
        JPanel jPanel8 = new JPanel();
        jPanel8.setBorder(new TitledBorder(null, "Tags", 4, 2, null, null));
        jPanel.add((Component)jPanel8, "Center");
        this.EFd = new mtz();
        this.EFd.a(new d(this));
        JButton jButton3 = new JButton("+");
        jButton3.addActionListener(new ActionListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EFo.co(actionEvent);
            }
        });
        JButton jButton4 = new JButton("-");
        jButton4.addActionListener(new ActionListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EFo.cn(actionEvent);
            }
        });
        this.EFi = new JCheckBox("Filter By Tag");
        this.EFi.addActionListener(new ActionListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EFo.ePx();
            }
        });
        this.EFi.setToolTipText("If checked, only resources & spawnpoints containing the selected tag will be shown");
        JButton jButton5 = new JButton("Modify");
        jButton5.addActionListener(new ActionListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EFo.cm(actionEvent);
            }
        });
        JButton jButton6 = new JButton("Add");
        jButton6.addActionListener(new ActionListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mua.c(this.EFo);
            }
        });
        jButton6.setToolTipText("Add selected tag to selected item (or CTRL+mouse select)");
        JSplitPane jSplitPane = new JSplitPane();
        jSplitPane.setResizeWeight(0.5);
        GroupLayout groupLayout6 = new GroupLayout(jPanel8);
        groupLayout6.setHorizontalGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout6.createSequentialGroup().addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EFd, -2, -1, -2).addGroup(groupLayout6.createSequentialGroup().addComponent(jButton3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton4).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton5).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton6).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EFi))).addGap(148)).addGroup(groupLayout6.createSequentialGroup().addComponent(jSplitPane, -1, 437, Short.MAX_VALUE).addContainerGap()));
        groupLayout6.setVerticalGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout6.createSequentialGroup().addComponent(this.EFd, -2, 152, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout6.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jButton3).addComponent(jButton4).addComponent(jButton5).addComponent(jButton6).addComponent(this.EFi)).addGap(18).addComponent(jSplitPane, -1, 481, Short.MAX_VALUE)));
        jSplitPane.setOrientation(0);
        JPanel jPanel9 = new JPanel();
        jSplitPane.setTopComponent(jPanel9);
        jPanel9.setBorder(new TitledBorder(null, "Tag Contents", 4, 2, null, null));
        jPanel9.setLayout(new BorderLayout(0, 0));
        JPanel jPanel10 = new JPanel();
        jPanel10.setBorder(new TitledBorder(null, "Inventory Contents", 4, 2, null, null));
        jSplitPane.setBottomComponent(jPanel10);
        jPanel10.setLayout(new BorderLayout(0, 0));
        this.EFk = new mug();
        this.EFk.h(new ActionListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EFo.ePv();
            }
        });
        this.EFk.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                String string = (String)mua.d(this.EFo).ePr();
                int n = cug.hV((String)string);
                this.EFo.EFn.add(n);
                mua.a(this.EFo, true);
            }
        });
        jPanel10.add(this.EFk);
        this.EFj = new mug();
        this.EFj.h(new ActionListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EFo.ePu();
            }
        });
        jPanel9.add((Component)this.EFj, "Center");
        this.EFj.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mua.a(this.EFo, true);
            }
        });
        this.EFd.a(new MouseAdapter(this){
            final /* synthetic */ mua EFo;
            {
                this.EFo = mua2;
            }

            public void mouseClicked(MouseEvent mouseEvent) {
                if ((mouseEvent.getModifiers() & 2) != 0) {
                    mua.c(this.EFo);
                } else {
                    this.EFo.x(mouseEvent);
                }
            }
        });
        jPanel8.setLayout(groupLayout6);
        this.ePB();
        for (ler object : this.aGu) {
            this.EFf.aO(object.getName());
        }
        this.ePC();
        for (String string : this.EEY) {
            this.EFe.aO(string);
        }
        this.ePy();
        this.DEC = aux2;
    }

    protected void ePu() {
        Object object;
        try {
            object = new jzx();
            ((jzx)object).dUP();
        }
        catch (bg bg2) {
            JOptionPane.showMessageDialog(this, this.getClass().getSimpleName() + ": Error reloading tags: " + bg2.getMessage(), "Error", 0);
            return;
        }
        object = (String)this.EFf.ePr();
        this.Dp((String)object);
        this.Dt((String)object);
    }

    protected void ePv() {
        kaa kaa2 = new kaa();
        kaa2.dUR();
        String string = (String)this.EFf.ePr();
        this.Dp(string);
        this.Dt(string);
    }

    protected void v(MouseEvent mouseEvent) {
        String string = (String)this.EFf.ePr();
        this.Dp(string);
        this.Dt(string);
    }

    private void Dp(String string) {
        int n = cug.hV((String)string);
        assert (n != -1);
        ctq ctq2 = lea.eoJ().get(n);
        if (ctq2 == null) {
            return;
        }
        this.EFk.a(ctq2.fgc, ctq2.fgg, string);
    }

    protected void w(MouseEvent mouseEvent) {
        String string = (String)this.EFe.ePr();
        this.Dt(string);
    }

    protected void c(ListSelectionEvent listSelectionEvent) {
        if (!(listSelectionEvent.getSource() instanceof JList)) {
            lfn.b(5, this.getClass().getSimpleName(), "handleSelectedItemTagListSelectionChanged: source is not list!");
            return;
        }
        String string = (String)this.EFc.getSelectedValue();
        this.Ds(string);
    }

    protected void cm(ActionEvent actionEvent) {
    }

    protected void cn(ActionEvent actionEvent) {
    }

    protected void co(ActionEvent actionEvent) {
        mub mub2 = new mub((Frame)SwingUtilities.getWindowAncestor(this), null);
        mub2.setModal(true);
        mub2.setVisible(true);
        ctn ctn2 = mub2.ePD();
        if (ctn2 == null) {
            return;
        }
        if (ctn2.fgc == null) {
            ctn2.fgc = lcn.emv();
        }
        Map<String, ctn> map = lea.eoK();
        map.put(ctn2.Name, ctn2);
        this.ePy();
        this.EFd.Do(ctn2.Name);
        this.Ds(ctn2.Name);
        this.Ai(true);
    }

    protected void j(KeyEvent keyEvent) {
    }

    protected void x(MouseEvent mouseEvent) {
        this.ePx();
        String string = (String)this.EFd.ePr();
        this.Ds(string);
    }

    private void ePw() {
    }

    protected void ePx() {
    }

    private void Ai(boolean bl) {
        this.EFm = bl;
        this.setTitle(bl ? "*Loot Editor" : "Loot Editor");
    }

    private void ePy() {
        this.EFd.ePs();
        Map<String, ctn> map = lea.eoK();
        TreeSet<String> treeSet = new TreeSet<String>(map.keySet());
        for (String string : treeSet) {
            this.EFd.aO(string);
        }
    }

    @Override
    protected void z(ActionEvent actionEvent) {
        Object[] objectArray;
        int n;
        if (this.EFm && (n = JOptionPane.showOptionDialog(this, "Data have changed, do you want to save?", "Save before close?", 0, 3, null, objectArray = new Object[]{"Yes", "No"}, objectArray[0])) == 0) {
            this.eDD();
            if (this.EFm) {
                return;
            }
        }
        this.dispose();
    }

    @Override
    protected void eDD() {
    }

    private void ePz() {
        Object object;
        int n = (Integer)this.EEZ.getValue();
        String string = (String)this.EFf.ePr();
        if (string == null || string.equals("")) {
            return;
        }
        int n2 = cug.hV((String)string);
        if (n2 < 0) {
            return;
        }
        List list = null;
        List list2 = null;
        List list3 = null;
        if (lea.enW().isDescendant(n2, cug.fgG)) {
            list = this.afE(n2);
            list2 = this.Dr(string);
            if (this.EFh.isSelected()) {
                object = (String)this.EFe.ePr();
                list3 = this.Dq((String)object);
            }
        } else {
            list = this.afF(n2);
        }
        object = lcn.emw();
        for (int i = 0; i < n; ++i) {
            int n3;
            cte[] cteArray;
            if (list != null && list.size() > 0) {
                for (cte cte2 : cteArray = ctf.a(list, 0.0f)) {
                    n3 = object.containsKey(cte2.pa()) ? (Integer)object.get(cte2.pa()) : 0;
                    object.put(cte2.pa(), n3 + cte2.asi);
                }
            }
            if (list2 != null && list2.size() > 0) {
                for (cte cte3 : cteArray = ctf.a(list2, 0.0f)) {
                    n3 = object.containsKey(cte3.pa()) ? (Integer)object.get(cte3.pa()) : 0;
                    object.put(cte3.pa(), n3 + cte3.asi);
                }
            }
            if (list3 == null || list3.size() <= 0) continue;
            for (cte cte4 : cteArray = ctf.a(list3, 0.0f)) {
                n3 = object.containsKey(cte4.pa()) ? (Integer)object.get(cte4.pa()) : 0;
                object.put(cte4.pa(), n3 + cte4.asi);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : object.entrySet()) {
            stringBuilder.append((String)entry.getKey() + " ," + entry.getValue() + "\r\n");
        }
        this.EFa.setText(stringBuilder.toString());
    }

    private void ePA() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(this.EFa.getText());
        clipboard.setContents(stringSelection, null);
    }

    private List afE(int n) {
        ctq ctq2 = lea.eoJ().get(n);
        assert (ctq2 != null);
        ArrayList arrayList = lcn.emv();
        this.c(arrayList, ctq2.fgc);
        if (this.EFb.isSelected()) {
            this.c(arrayList, ctq2.fgg);
        }
        return arrayList;
    }

    private List Dq(String string) {
        return null;
    }

    private List Dr(String string) {
        ArrayList arrayList = lcn.emv();
        return arrayList;
    }

    private void c(List list, List list2) {
        block0: for (Object e2 : list2) {
            if (e2 instanceof cto) {
                if (!((cto)e2).fez) continue;
                list.add(e2);
                continue;
            }
            if (!(e2 instanceof ArrayList)) continue;
            for (Object e3 : (ArrayList)e2) {
                if (!(e3 instanceof cto) || !((cto)e3).fez) continue;
                list.add(e2);
                continue block0;
            }
        }
    }

    private List afF(int n) {
        csw csw2 = lea.eoT().get(n);
        if (csw2 == null) {
            return null;
        }
        ArrayList arrayList = lcn.emv();
        this.c(arrayList, csw2.fea);
        return arrayList;
    }

    private void ePB() {
        les les2 = lea.enW();
        ler ler2 = les2.acv(cug.fgG);
        this.aGu = les2.a(ler2, true, true);
        ler ler3 = les2.acv(cug.fjJ);
        this.aGu.addAll(les2.a(ler3, true));
    }

    private void ePC() {
        assert (lea.eoL() != null);
        this.EEY = lcn.emv();
        jxl jxl2 = new jxl();
        for (List<bsv> list : fy.TF.values()) {
            for (bsv bsv2 : list) {
                btd btd2 = (btd)bsv2;
                if (btd2 == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "levelObjectSpawnpoint null");
                    continue;
                }
                ari ari2 = jxl2.vk(btd2.axo());
                if (ari2 == null) {
                    lfn.b(5, this.getClass().getSimpleName(), "spawnpoint null for file " + btd2.axo());
                    continue;
                }
                this.EEY.add(ari2.getName());
            }
        }
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode) {
        les les2 = lea.enW();
        ler ler2 = les2.acv(cug.fgG);
        this.aGu = les2.a(ler2, true);
        TreeSet<String> treeSet = new TreeSet<String>();
        for (ler ler3 : this.aGu) {
            treeSet.add(ler3.getName());
        }
        this.a(defaultMutableTreeNode, les2, ler2);
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode, les les2, ler ler2) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            DefaultMutableTreeNode defaultMutableTreeNode2;
            if (les2.g(ler3) == null) {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
            } else {
                defaultMutableTreeNode2 = new DefaultMutableTreeNode(ler3.getName());
                defaultMutableTreeNode.add(defaultMutableTreeNode2);
                this.a(defaultMutableTreeNode2, les2, ler3);
            }
            ler3 = les2.h(ler3);
        }
    }

    private void Ds(String string) {
        if (string == null) {
            return;
        }
        Map<String, ctn> map = lea.eoK();
        assert (map != null) : "LootTagInfoMap is null!!!";
        ctn ctn2 = map.get(string);
        assert (ctn2 != null) : "No tag " + string;
        if (ctn2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "updateTagViewer: No tag with name '" + string + "' exists!!!");
            return;
        }
        this.EFj.a(ctn2.fgc, null, ctn2.Name);
    }

    private void Dt(String string) {
    }

    private boolean am(String string, int n) {
        int n2 = lea.enW().getType(string);
        return lea.enW().isDescendant(n2, n);
    }

    private boolean Du(String string) {
        return this.am(string, cug.fjJ);
    }

    private boolean Dv(String string) {
        return this.am(string, cug.fgG);
    }

    private boolean Dw(String string) {
        return this.EEY.contains(string);
    }

    static /* synthetic */ void a(mua mua2) {
        mua2.ePA();
    }

    static /* synthetic */ void b(mua mua2) {
        mua2.ePz();
    }

    static /* synthetic */ void c(mua mua2) {
        mua2.ePw();
    }

    static /* synthetic */ mtz d(mua mua2) {
        return mua2.EFf;
    }

    static /* synthetic */ void a(mua mua2, boolean bl) {
        mua2.Ai(bl);
    }
}

