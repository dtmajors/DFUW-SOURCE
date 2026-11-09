/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  lcw
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Set;
import java.util.Vector;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class mrv
extends JInternalFrame {
    private static final String EnJ = lcw.qLb + "worldbuilder/" + "icons" + "/" + "ai" + "/";
    private static final auf[] EnK = new auf[0];
    private static final String EnL = lcw.qLb + "xml-files/object/spawnpoint/";
    private auf[] EnM = new auf[0];
    private boolean EnN;
    private auf[] EnO = new auf[0];
    private boolean EnP;
    private auf[] EnQ = new auf[0];
    private boolean EnR;
    private final mrw EnS;
    JTable EnT;
    JMenuItem EnU;
    JMenuItem EnV;
    JTextField EnW;
    JList EnX;
    JMenuItem EnY;
    JMenuItem EnZ;
    JMenuItem Eoa;
    JComboBox Eob;
    JMenuItem Eoc;
    JButton bzN;
    JTable Eod;
    JPopupMenu Eoe;
    JTable Eof;
    JMenuItem Eog;

    public static void main(String[] stringArray) {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mrv().setVisible(true);
            }
        });
    }

    public mrv() {
        try {
            jtp.dSM();
        }
        catch (bg bg2) {
            arw.ct.error("Cannot load chatentryconfig.xml");
            System.exit(1);
        }
        this.b();
        this.EnS = new mrw();
        this.EnS.setLocationRelativeTo(this);
    }

    private void b() {
        this.Eoe = new JPopupMenu();
        this.EnU = new JMenuItem();
        this.Eoc = new JMenuItem();
        this.EnV = new JMenuItem();
        JScrollPane jScrollPane = new JScrollPane();
        this.EnX = new JList();
        this.Eob = new JComboBox();
        JSplitPane jSplitPane = new JSplitPane();
        JScrollPane jScrollPane2 = new JScrollPane();
        this.Eof = new JTable();
        JScrollPane jScrollPane3 = new JScrollPane();
        this.Eod = new JTable();
        this.bzN = new JButton();
        this.EnW = new JTextField();
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu();
        this.EnZ = new JMenuItem();
        this.EnY = new JMenuItem();
        this.Eoa = new JMenuItem();
        JMenu jMenu2 = new JMenu();
        this.Eog = new JMenuItem();
        a a2 = new a(this);
        this.EnU.setText("Add Utterance");
        this.Eoe.add(this.EnU);
        this.EnU.addActionListener(a2);
        this.Eoc.setText("Remove Selected Utterance(s)");
        this.Eoe.add(this.Eoc);
        this.Eoc.addActionListener(a2);
        this.Eoe.addSeparator();
        this.EnV.setText("Close");
        this.Eoe.add(this.EnV);
        this.setClosable(true);
        this.setIconifiable(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(1);
        this.setTitle("AI Notification Tool - God Edition");
        this.EnX.addListSelectionListener(a2);
        jScrollPane.setViewportView(this.EnX);
        for (aud.b b2 : aud.b.values()) {
            if (!b2.name().contains("_AI_") || b2.name().contains("_SYSTEM")) continue;
            this.Eob.addItem(b2);
        }
        this.Eob.addItemListener(a2);
        jSplitPane.setDividerLocation(190);
        jSplitPane.setOrientation(0);
        this.Eof.setModel(new DefaultTableModel(this, new String[][]{null}, new String[]{"Utterances"}){
            Class[] Eoh;
            final /* synthetic */ mrv Eoi;
            {
                this.Eoi = mrv2;
                super(objectArray, objectArray2);
                this.Eoh = new Class[]{String.class};
            }

            public Class getColumnClass(int n) {
                return this.Eoh[n];
            }
        });
        this.Eof.setColumnSelectionAllowed(true);
        this.Eof.getTableHeader().setReorderingAllowed(false);
        this.Eof.addMouseListener(a2);
        this.Eof.addPropertyChangeListener(a2);
        this.Eof.setEnabled(false);
        jScrollPane2.setViewportView(this.Eof);
        this.Eof.getColumnModel().getSelectionModel().setSelectionMode(0);
        jSplitPane.setTopComponent(jScrollPane2);
        this.Eod.setModel(new DefaultTableModel(this, new String[][]{null}, new String[]{"Utterances - Default"}){
            Class[] Eoh;
            final /* synthetic */ mrv Eoi;
            {
                this.Eoi = mrv2;
                super(objectArray, objectArray2);
                this.Eoh = new Class[]{String.class};
            }

            public Class getColumnClass(int n) {
                return this.Eoh[n];
            }
        });
        this.Eod.setColumnSelectionAllowed(true);
        this.Eod.getTableHeader().setReorderingAllowed(false);
        this.Eod.addMouseListener(a2);
        this.Eod.addPropertyChangeListener(a2);
        jScrollPane3.setViewportView(this.Eod);
        this.Eod.getColumnModel().getSelectionModel().setSelectionMode(0);
        jSplitPane.setRightComponent(jScrollPane3);
        this.bzN.setText("SAVE!");
        this.bzN.addActionListener(a2);
        this.EnW.addActionListener(a2);
        jMenu.setText("Load");
        this.EnZ.setAccelerator(KeyStroke.getKeyStroke(77, 3));
        this.EnZ.setIcon(new ImageIcon(EnJ + "monster.png"));
        this.EnZ.setText("Monsters");
        this.EnZ.addActionListener(a2);
        jMenu.add(this.EnZ);
        this.EnY.setAccelerator(KeyStroke.getKeyStroke(77, 10));
        this.EnY.setIcon(new ImageIcon(EnJ + "mothership.png"));
        this.EnY.setText("Monsters' Families");
        this.EnY.addActionListener(a2);
        jMenu.add(this.EnY);
        this.Eoa.setAccelerator(KeyStroke.getKeyStroke(83, 3));
        this.Eoa.setIcon(new ImageIcon(EnJ + "spawnpoint.png"));
        this.Eoa.setText("Spawnpoints");
        this.Eoa.addActionListener(a2);
        jMenu.add(this.Eoa);
        jMenuBar.add(jMenu);
        jMenu2.setText("Help");
        this.Eog.setAccelerator(KeyStroke.getKeyStroke(86, 3));
        this.Eog.setIcon(new ImageIcon(EnJ + "variable.png"));
        this.Eog.setText("Variables List");
        this.Eog.addActionListener(a2);
        jMenu2.add(this.Eog);
        jMenuBar.add(jMenu2);
        this.setJMenuBar(jMenuBar);
        GroupLayout groupLayout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.bzN).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jScrollPane, -1, 157, Short.MAX_VALUE).addComponent(this.EnW, GroupLayout.Alignment.TRAILING, -1, 157, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(jSplitPane, 0, 0, Short.MAX_VALUE).addComponent(this.Eob, 0, 344, Short.MAX_VALUE)))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addComponent(jScrollPane, -1, 287, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EnW, -2, -1, -2)).addGroup(groupLayout.createSequentialGroup().addComponent(this.Eob, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jSplitPane, -1, 287, Short.MAX_VALUE))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bzN).addContainerGap()));
        this.pack();
    }

    private void a(les les2, ler ler2, Set<auf> set, boolean bl) {
        ler ler3 = les2.g(ler2);
        while (ler3 != null) {
            if (les2.g(ler3) == null) {
                auf auf2;
                if (bl) {
                    auf2 = new auf(les2.i(ler3).getName().toLowerCase());
                    set.add(auf2);
                } else {
                    auf2 = new auf(ler3.getName().toLowerCase());
                    set.add(auf2);
                }
            } else {
                this.a(les2, ler3, set, bl);
            }
            ler3 = les2.h(ler3);
        }
    }

    void bU(ActionEvent actionEvent) {
        ((DefaultTableModel)this.EnT.getModel()).addRow(new Object[]{null});
        ((DefaultTableModel)this.EnT.getModel()).fireTableDataChanged();
    }

    void bV(ActionEvent actionEvent) {
        if (actionEvent.getID() == 1001) {
            auf[] aufArray;
            String string = this.EnW.getText();
            auf[] aufArray2 = new auf[]{};
            if (this.EnP) {
                aufArray = this.EnO;
            } else if (this.EnR) {
                aufArray = this.EnQ;
            } else if (this.EnN) {
                aufArray = this.EnM;
            } else {
                return;
            }
            for (auf auf2 : aufArray) {
                if (!auf2.Value.contains(string)) continue;
                auf[] aufArray3 = new auf[aufArray2.length + 1];
                System.arraycopy(aufArray2, 0, aufArray3, 0, aufArray2.length);
                aufArray2 = aufArray3;
                aufArray2[aufArray2.length - 1] = auf2;
            }
            this.EnX.setListData(aufArray2);
        }
    }

    void eMp() {
        Object[] objectArray = this.EnX.getSelectedValues();
        Set<auf> set = lcn.emx();
        for (Object vector2 : objectArray) {
            auf[] aufArray = auj.d(this.Eob.getSelectedItem(), vector2);
            if (aufArray == null) continue;
            set.addAll(Arrays.asList(aufArray));
        }
        Vector<Vector> vector = ((DefaultTableModel)this.Eof.getModel()).getDataVector();
        for (auf auf2 : set) {
            Vector<String> vector2 = new Vector<String>(1);
            vector2.add(auf2.Value);
            vector.add(vector2);
        }
        if (vector.size() == 0) {
            Vector vector3 = new Vector(1);
            vector3.add(null);
            vector.add(vector3);
        }
        ((DefaultTableModel)this.Eof.getModel()).fireTableDataChanged();
    }

    void bW(ActionEvent actionEvent) {
        if (this.EnM.length <= 0) {
            Object object;
            int n = cug.fgG;
            les les2 = lea.enW();
            if (n == 0) {
                object = new juf();
                ((juf)object).a("xml-files/gamelogicinfo/resourcetree.xml", les2);
                cug.anZ();
                n = cug.fgG;
            }
            object = les2.acv(n);
            Set<auf> set = lcn.emx();
            this.a(les2, (ler)object, set, true);
            this.EnM = set.toArray(new auf[set.size()]);
            Arrays.sort(this.EnM);
        }
        this.EnX.setListData(EnK);
        this.EnX.setListData(this.EnM);
        this.EnN = true;
        this.EnP = false;
        this.EnR = false;
        this.EnZ.setEnabled(true);
        this.EnY.setEnabled(false);
        this.Eoa.setEnabled(true);
        if (!this.Eof.isEnabled()) {
            this.Eof.setEnabled(true);
        }
    }

    void bX(ActionEvent actionEvent) {
        if (this.EnO.length <= 0) {
            Object object;
            int n = cug.fgG;
            les les2 = lea.enW();
            if (n == 0) {
                object = new juf();
                ((juf)object).a("xml-files/gamelogicinfo/resourcetree.xml", les2);
                cug.anZ();
                n = cug.fgG;
            }
            object = les2.acv(n);
            Set<auf> set = lcn.emx();
            this.a(les2, (ler)object, set, false);
            this.EnO = set.toArray(new auf[set.size()]);
            Arrays.sort(this.EnO);
        }
        this.EnX.setListData(EnK);
        this.EnX.setListData(this.EnO);
        this.EnN = false;
        this.EnP = true;
        this.EnR = false;
        this.EnZ.setEnabled(false);
        this.EnY.setEnabled(true);
        this.Eoa.setEnabled(true);
        if (!this.Eof.isEnabled()) {
            this.Eof.setEnabled(true);
        }
    }

    void bY(ActionEvent actionEvent) {
        if (this.EnQ.length <= 0) {
            File[] fileArray;
            File file = new File(EnL);
            for (File file2 : fileArray = file.listFiles(new FilenameFilter(this, file){
                final /* synthetic */ File Eoj;
                final /* synthetic */ mrv Eoi;
                {
                    this.Eoi = mrv2;
                    this.Eoj = file;
                }

                public boolean accept(File file, String string) {
                    return file.equals(this.Eoj) && string.contains("_spawns_") && string.endsWith("xml");
                }
            })) {
                if (!file2.isFile()) continue;
                String string = file2.getName();
                auf auf2 = new auf(string.substring(0, string.lastIndexOf(46)));
                auf[] aufArray = new auf[this.EnQ.length + 1];
                System.arraycopy(this.EnQ, 0, aufArray, 0, this.EnQ.length);
                this.EnQ = aufArray;
                this.EnQ[this.EnQ.length - 1] = auf2;
            }
            Arrays.sort(this.EnQ);
        }
        this.EnX.setListData(EnK);
        this.EnX.setListData(this.EnQ);
        this.EnN = false;
        this.EnP = false;
        this.EnR = true;
        this.EnZ.setEnabled(true);
        this.EnY.setEnabled(true);
        this.Eoa.setEnabled(false);
        if (!this.Eof.isEnabled()) {
            this.Eof.setEnabled(true);
        }
    }

    void b(ItemEvent itemEvent) {
        if (itemEvent.getStateChange() == 2) {
            Vector<Vector> vector = ((DefaultTableModel)this.Eod.getModel()).getDataVector();
            vector.clear();
            ((DefaultTableModel)this.Eod.getModel()).fireTableDataChanged();
            vector = ((DefaultTableModel)this.Eof.getModel()).getDataVector();
            vector.clear();
            ((DefaultTableModel)this.Eof.getModel()).fireTableDataChanged();
        } else if (itemEvent.getStateChange() == 1) {
            Object object;
            auf[] aufArray;
            Vector<Vector<Vector<Vector<Vector<String>>>>> vector = ((DefaultTableModel)this.Eod.getModel()).getDataVector();
            if (vector == null) {
                vector = new Vector();
            }
            if ((aufArray = auj.n(this.Eob.getSelectedItem())) != null) {
                for (auf auf2 : aufArray) {
                    Object object2 = new Vector<String>(1);
                    ((Vector)object2).add(auf2.Value);
                    vector.add((Vector<Vector<Vector<Vector<String>>>>)object2);
                }
            }
            if (vector.size() == 0) {
                object = new Vector();
                ((Vector)object).add(null);
                vector.add((Vector<Vector<Vector<Vector<String>>>>)object);
            }
            ((DefaultTableModel)this.Eod.getModel()).fireTableDataChanged();
            vector = ((DefaultTableModel)this.Eof.getModel()).getDataVector();
            if (vector == null) {
                vector = new Vector();
            }
            object = this.EnX.getSelectedValues();
            for (Object object2 : object) {
                aufArray = auj.d(this.Eob.getSelectedItem(), object2);
                if (aufArray == null) continue;
                for (auf auf3 : aufArray) {
                    Vector<String> vector2 = new Vector<String>(1);
                    vector2.add(auf3.Value);
                    vector.add(vector2);
                }
            }
            if (vector.size() == 0) {
                Vector<Object> vector3 = new Vector<Object>();
                vector3.add(null);
                vector.add(vector3);
            }
            ((DefaultTableModel)this.Eof.getModel()).fireTableDataChanged();
        }
    }

    void bZ(ActionEvent actionEvent) {
        int[] nArray = this.EnT.getSelectedRows();
        if (nArray.length < 0) {
            return;
        }
        boolean bl = false;
        if (this.EnT.equals(this.Eod)) {
            bl = true;
        }
        DefaultTableModel defaultTableModel = (DefaultTableModel)this.EnT.getModel();
        Vector<Vector> vector = defaultTableModel.getDataVector();
        for (int i = nArray.length - 1; i >= 0; --i) {
            String string = (String)defaultTableModel.getValueAt(nArray[i], 0);
            if (vector.size() > 1) {
                defaultTableModel.removeRow(nArray[i]);
            } else {
                defaultTableModel.setValueAt(null, nArray[i], 0);
            }
            if (string == null || string.equalsIgnoreCase("")) continue;
            if (bl) {
                auj.c(this.Eob.getSelectedItem(), string);
                continue;
            }
            for (Object object : this.EnX.getSelectedValues()) {
                auj.b(this.Eob.getSelectedItem(), object, string);
            }
        }
        defaultTableModel.fireTableDataChanged();
    }

    void m(ActionEvent actionEvent) {
        Vector<Vector> vector;
        if (this.Eof.isEditing()) {
            this.Eof.getCellEditor().stopCellEditing();
        }
        if (this.Eod.isEditing()) {
            this.Eod.getCellEditor().stopCellEditing();
        }
        if ((vector = ((DefaultTableModel)this.Eod.getModel()).getDataVector()).get(0).get(0) == null) {
            Vector<String> vector2 = new Vector<String>();
            vector2.add("");
            vector.set(0, vector2);
            auj.b(this.Eob.getSelectedItem(), "");
        }
        jtp.dSL();
    }

    void ca(ActionEvent actionEvent) {
        this.EnS.setVisible(!this.EnS.isVisible());
    }
}

