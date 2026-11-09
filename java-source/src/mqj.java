/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;

public class mqj
extends JInternalFrame {
    private JButton EcZ;
    private JButton Eda;
    private JButton Edb;
    private JButton Edc;
    private JButton Edd;
    private JPanel Ede;
    private JTable Edf;
    private JProgressBar DGk;
    private JScrollPane ah;
    public List<mqi> Edg = lcn.emv();
    private aux DEC = null;
    public static mqj Edh = null;
    private final int Edi = 500;
    private int Edj = 400;
    private int[] Edk = new int[500];
    private b Edl = null;
    private int Edm = 10;
    private int Edn = 100;
    private Vector<Integer> Edo = new Vector();

    public mqj() {
        this.b();
        this.c();
    }

    private void b() {
        this.ah = new JScrollPane();
        this.Edf = new JTable();
        this.EcZ = new JButton();
        this.Edc = new JButton();
        this.DGk = new JProgressBar();
        this.Ede = new JPanel();
        this.Edb = new JButton();
        this.Eda = new JButton();
        this.Edd = new JButton();
        this.setTitle("Mesh Texel Statistics");
        this.Edf.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
        this.ah.setViewportView(this.Edf);
        this.EcZ.setText("Add Mesh Files");
        this.Edc.setText("Process");
        this.Ede.setBorder(BorderFactory.createBevelBorder(0));
        GroupLayout groupLayout = new GroupLayout(this.Ede);
        this.Ede.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 701, Short.MAX_VALUE));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 249, Short.MAX_VALUE));
        this.Edb.setText("Filter");
        this.Eda.setText("Clear");
        this.Edd.setText("ResetSel");
        this.Edd.addActionListener(new ActionListener(this){
            final /* synthetic */ mqj Edp;
            {
                this.Edp = mqj2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqj.a(this.Edp, actionEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.ah, GroupLayout.Alignment.LEADING, -1, 705, Short.MAX_VALUE).addComponent(this.Ede, GroupLayout.Alignment.LEADING, -1, -1, Short.MAX_VALUE).addGroup(GroupLayout.Alignment.LEADING, groupLayout2.createSequentialGroup().addComponent(this.EcZ).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Edb).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Eda).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Edd).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.Edc, -2, 93, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DGk, -2, 290, -2))).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EcZ).addComponent(this.Edb).addComponent(this.Eda).addComponent(this.Edc).addComponent(this.Edd)).addComponent(this.DGk, -2, 23, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ah, -2, 359, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.Ede, -1, -1, Short.MAX_VALUE)));
        this.pack();
    }

    private void bk(ActionEvent actionEvent) {
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void c() {
        Edh = this;
        this.setClosable(true);
        this.Edc.addActionListener(new ActionListener(this){
            final /* synthetic */ mqj Edp;
            {
                this.Edp = mqj2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqj.a(this.Edp);
            }
        });
        this.EcZ.addActionListener(new ActionListener(this){
            final /* synthetic */ mqj Edp;
            {
                this.Edp = mqj2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqj.b(this.Edp);
            }
        });
        this.Edf.setModel(new a(this));
        this.eJj();
        this.Edb.addActionListener(new ActionListener(this){
            final /* synthetic */ mqj Edp;
            {
                this.Edp = mqj2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqj.c(this.Edp);
            }
        });
        this.Edl = new b(this);
        Dimension dimension = this.Ede.getSize();
        this.Ede.setLayout(new BorderLayout());
        this.Ede.add((Component)this.Edl, "Center");
        this.setResizable(true);
        this.Edd.addActionListener(new ActionListener(this){
            final /* synthetic */ mqj Edp;
            {
                this.Edp = mqj2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqj.d(this.Edp);
            }
        });
        this.Eda.addActionListener(new ActionListener(this){
            final /* synthetic */ mqj Edp;
            {
                this.Edp = mqj2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqj.e(this.Edp);
            }
        });
    }

    private void eJb() {
        this.Edo.clear();
        this.Edg.clear();
        this.Edf.updateUI();
    }

    private void eJc() {
        int[] nArray = this.Edf.getSelectedRows();
        for (int i = 0; i < nArray.length; ++i) {
            this.Edg.get((int)this.Edo.get((int)nArray[i]).intValue()).EcY = null;
        }
        this.Edf.updateUI();
    }

    private void eJd() {
        int n = this.Edj * this.Edm / 500;
        int n2 = this.Edj * this.Edn / 500;
        this.Edo.clear();
        for (int i = 0; i < this.Edg.size(); ++i) {
            kte kte2 = this.Edg.get((int)i).EcY;
            if (kte2 != null && (kte2.qbe < (float)n || kte2.qbe > (float)n2)) continue;
            this.Edo.add(i);
        }
        this.Edf.updateUI();
    }

    private void eJe() {
        kte kte2;
        int n;
        for (int i = 0; i < 500; ++i) {
            this.Edk[i] = 0;
        }
        float f = -1.0f;
        for (n = 0; n < this.Edg.size(); ++n) {
            kte2 = this.Edg.get((int)n).EcY;
            if (kte2 == null || !(kte2.qbe < 30000.0f) || f != -1.0f && !(kte2.qbe > f)) continue;
            f = kte2.qbe;
        }
        f = this.Edj;
        for (n = 0; n < this.Edg.size(); ++n) {
            int n2;
            kte2 = this.Edg.get((int)n).EcY;
            if (kte2 == null || (n2 = (int)(500.0f * kte2.qbe / f)) < 0 || n2 >= 500) continue;
            int n3 = n2;
            this.Edk[n3] = this.Edk[n3] + 1;
        }
        if (this.Edl != null) {
            this.Edl.updateUI();
        }
    }

    private void eJf() {
        int n;
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new File(lcw.qLb + "mesh/" + "/"));
        jFileChooser.setMultiSelectionEnabled(true);
        jFileChooser.setFileFilter(new myt("sfm", "sfm mesh files(*.sfm)"));
        if (jFileChooser.showOpenDialog(this) == 0) {
            for (n = 0; n < jFileChooser.getSelectedFiles().length; ++n) {
                File file = jFileChooser.getSelectedFiles()[n];
                String string = file.getName().toLowerCase();
                if (string.startsWith("terrain_") || string.contains("lake") || string.contains("swamp") || string.contains("water")) continue;
                mqi mqi2 = new mqi();
                mqi2.Filename = file.getAbsolutePath();
                this.Edg.add(mqi2);
            }
        }
        for (n = 0; n < this.Edg.size(); ++n) {
            this.Edo.add(n);
        }
        this.Edf.updateUI();
    }

    private void eJg() {
        this.DGk.setMaximum(this.Edg.size() - 1);
        this.EcZ.setEnabled(false);
        this.Edc.setEnabled(false);
        hac hac2 = (hac)this.DEC.d(4097);
        hac2.Lb(50);
        this.DEC.a((dxq)hac2);
    }

    public void eJh() {
        this.EcZ.setEnabled(true);
        this.Edc.setEnabled(true);
        this.eJi();
        this.Edf.updateUI();
    }

    public void a(int n, kte kte2) {
        this.Edg.get((int)n).EcY = kte2;
        this.DGk.setValue(n);
        if (n % 300 == 0) {
            this.eJi();
            this.Edf.updateUI();
        }
    }

    private void eJi() {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        String string = xStream.toXML(this.Edg);
        String string2 = lcw.qLb + "xml-files/worldbuilder/mesh_texel_stats.xml";
        jry.a(new jrw(string2), string);
        this.eJe();
    }

    private void eJj() {
        String string;
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        String string2 = lcw.qLb + "xml-files/worldbuilder/mesh_texel_stats.xml";
        try {
            string = jry.tk(string2);
        }
        catch (Exception exception) {
            return;
        }
        try {
            this.Edg = (List)xStream.fromXML(string);
        }
        catch (Exception exception) {
            lfn.b(5, this.getClass().getName(), "loadStats() :failed to xstream file " + string);
            exception.printStackTrace();
        }
        this.eJe();
        Collections.sort(this.Edg);
        this.Edo.clear();
        for (int i = 0; i < this.Edg.size(); ++i) {
            this.Edo.add(i);
        }
    }

    public String afh(int n) {
        return this.Edg.get((int)n).Filename;
    }

    public boolean afi(int n) {
        return this.Edg.get((int)n).EcY != null;
    }

    static /* synthetic */ void a(mqj mqj2, ActionEvent actionEvent) {
        mqj2.bk(actionEvent);
    }

    static /* synthetic */ void a(mqj mqj2) {
        mqj2.eJg();
    }

    static /* synthetic */ void b(mqj mqj2) {
        mqj2.eJf();
    }

    static /* synthetic */ void c(mqj mqj2) {
        mqj2.eJd();
    }

    static /* synthetic */ void d(mqj mqj2) {
        mqj2.eJc();
    }

    static /* synthetic */ void e(mqj mqj2) {
        mqj2.eJb();
    }

    static /* synthetic */ int a(mqj mqj2, int n) {
        mqj2.Edm = n;
        return mqj2.Edm;
    }

    static /* synthetic */ int b(mqj mqj2, int n) {
        mqj2.Edn = n;
        return mqj2.Edn;
    }

    static /* synthetic */ int f(mqj mqj2) {
        return mqj2.Edm;
    }

    static /* synthetic */ int g(mqj mqj2) {
        return mqj2.Edn;
    }

    static /* synthetic */ int[] h(mqj mqj2) {
        return mqj2.Edk;
    }

    static /* synthetic */ int i(mqj mqj2) {
        return mqj2.Edj;
    }

    static /* synthetic */ Vector j(mqj mqj2) {
        return mqj2.Edo;
    }
}

