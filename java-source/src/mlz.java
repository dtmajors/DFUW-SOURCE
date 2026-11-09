/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  cug
 *  lcr
 *  lcw
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.SoftBevelBorder;
import javax.swing.filechooser.FileFilter;

public class mlz
extends JInternalFrame {
    private JTextField DLq;
    private JList DLr;
    private JCheckBox DLs;
    private JButton DEp;
    private JButton DLt;
    private JButton DLu;
    private JButton DLv;
    private JTextField DLw;
    private JTextField DLx;
    private JTextField DLy;
    private JList DLz;
    private JButton DLA;
    private JTextField DLB;
    private JButton DLC;
    private JButton DLD;
    private JButton DLE;
    private JButton DLF;
    private JButton DLG;
    private JLabel I;
    private JLabel P;
    private JLabel Q;
    private JLabel R;
    private JLabel S;
    private JLabel T;
    private JPanel aa;
    private JPanel bN;
    private JPanel ac;
    private JPanel ad;
    private JScrollPane ah;
    private JScrollPane ai;
    private JSlider DLH;
    private aux DEC;
    private jyg fxA = new jyg(false);
    private bvf DLI;
    private bvf DLJ;
    bzt eik;
    private String[] DLK;
    private boolean DLL = false;
    private List<mmz> DLM = lcn.emv();
    private ljq DLN = null;
    private String DLO = null;
    private String DLP = null;
    private static ldv DLQ = null;
    private static ldv DLR = null;
    private static ljq DLS = null;
    private static ljq DLT = null;

    public mlz() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.ah = new JScrollPane();
        this.DLr = new JList();
        this.bN = new JPanel();
        this.I = new JLabel();
        this.DLH = new JSlider();
        this.DLu = new JButton();
        this.P = new JLabel();
        this.DLq = new JTextField();
        this.DEp = new JButton();
        this.DLG = new JButton();
        this.DLt = new JButton();
        this.DLs = new JCheckBox();
        this.ac = new JPanel();
        this.ai = new JScrollPane();
        this.DLz = new JList();
        this.ad = new JPanel();
        this.Q = new JLabel();
        this.DLB = new JTextField();
        this.R = new JLabel();
        this.DLy = new JTextField();
        this.DLv = new JButton();
        this.DLD = new JButton();
        this.DLE = new JButton();
        this.DLA = new JButton();
        this.DLC = new JButton();
        this.DLF = new JButton();
        this.S = new JLabel();
        this.DLw = new JTextField();
        this.T = new JLabel();
        this.DLx = new JTextField();
        this.setClosable(true);
        this.setMaximizable(true);
        this.setResizable(true);
        this.setTitle("Animation Player");
        this.aa.setBorder(BorderFactory.createTitledBorder("Animation File List"));
        this.DLr.setFont(new Font("DialogInput", 0, 11));
        this.ah.setViewportView(this.DLr);
        GroupLayout groupLayout = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.ah, -1, 284, Short.MAX_VALUE).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ah, -2, 294, -2));
        this.bN.setBorder(BorderFactory.createTitledBorder("*"));
        this.I.setText("Pause (secs)");
        this.DLH.setMajorTickSpacing(1);
        this.DLH.setMaximum(20);
        this.DLH.setPaintLabels(true);
        this.DLH.setPaintTicks(true);
        this.DLH.setSnapToTicks(true);
        this.DLH.setToolTipText("Seconds to pause between animations");
        this.DLH.setValue(4);
        this.DLu.setText("Play");
        this.DLu.addActionListener(new ActionListener(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlz.a(this.DLU, actionEvent);
            }
        });
        this.P.setText("Anim:");
        this.DLq.setEditable(false);
        this.DEp.setText("Load Anim");
        this.DEp.addActionListener(new ActionListener(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlz.b(this.DLU, actionEvent);
            }
        });
        this.DLG.setText("Stop");
        this.DLG.addActionListener(new ActionListener(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlz.c(this.DLU, actionEvent);
            }
        });
        this.DLt.setText("Load Multiple Anims From Config");
        this.DLt.addActionListener(new ActionListener(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlz.d(this.DLU, actionEvent);
            }
        });
        this.DLs.setText("Big Animated objects");
        GroupLayout groupLayout2 = new GroupLayout(this.bN);
        this.bN.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.LEADING, groupLayout2.createSequentialGroup().addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DLH, -1, 314, Short.MAX_VALUE)).addGroup(GroupLayout.Alignment.LEADING, groupLayout2.createSequentialGroup().addComponent(this.P).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.DLq, -1, 261, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DEp))).addGap(10, 10, 10)).addGroup(groupLayout2.createSequentialGroup().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGap(16, 16, 16).addComponent(this.DLs)).addGroup(groupLayout2.createSequentialGroup().addComponent(this.DLu, -2, 53, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DLG).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DLt))).addContainerGap(88, Short.MAX_VALUE)))));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.I)).addComponent(this.DLH, -2, -1, -2)).addGap(18, 18, 18).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.P).addComponent(this.DEp).addComponent(this.DLq, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.DLs).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DLu).addComponent(this.DLG).addComponent(this.DLt)).addContainerGap(150, Short.MAX_VALUE)));
        this.ac.setBorder(BorderFactory.createTitledBorder("Special Effect List"));
        this.DLz.setBorder(BorderFactory.createBevelBorder(0));
        this.DLz.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.ai.setViewportView(this.DLz);
        this.ad.setBorder(new SoftBevelBorder(0));
        this.Q.setText("SFX");
        this.R.setText("Duration");
        this.DLv.setText("Add");
        this.DLv.addActionListener(new ActionListener(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlz.e(this.DLU, actionEvent);
            }
        });
        this.DLD.setText("Remove");
        this.DLD.addActionListener(new ActionListener(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlz.f(this.DLU, actionEvent);
            }
        });
        this.DLE.setText("Save List");
        this.DLE.addActionListener(new ActionListener(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlz.g(this.DLU, actionEvent);
            }
        });
        this.DLA.setText("Load List");
        this.DLA.addActionListener(new ActionListener(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlz.h(this.DLU, actionEvent);
            }
        });
        this.DLC.setText("Play");
        this.DLC.addActionListener(new ActionListener(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlz.i(this.DLU, actionEvent);
            }
        });
        this.DLF.setText("Stop");
        this.DLF.addActionListener(new ActionListener(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mlz.j(this.DLU, actionEvent);
            }
        });
        this.S.setText("Name");
        this.T.setText("Dist");
        GroupLayout groupLayout3 = new GroupLayout(this.ad);
        this.ad.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addComponent(this.Q).addGap(27, 27, 27).addComponent(this.DLB, -1, 156, Short.MAX_VALUE)).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addComponent(this.S).addGap(18, 18, 18).addComponent(this.DLw, -1, 156, Short.MAX_VALUE)).addGroup(groupLayout3.createSequentialGroup().addComponent(this.DLv).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DLD)).addGroup(groupLayout3.createSequentialGroup().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.DLC, -1, -1, Short.MAX_VALUE).addComponent(this.DLE, GroupLayout.Alignment.LEADING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.DLF, -1, -1, Short.MAX_VALUE).addComponent(this.DLA))).addGroup(groupLayout3.createSequentialGroup().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.R).addComponent(this.T)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.DLx, -1, 156, Short.MAX_VALUE).addComponent(this.DLy, -1, 156, Short.MAX_VALUE)))).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Q).addComponent(this.DLB, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.S, -2, 12, -2).addComponent(this.DLw, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.R).addComponent(this.DLy, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.T).addComponent(this.DLx, -2, -1, -2)).addGap(15, 15, 15).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DLv).addComponent(this.DLD)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DLE).addComponent(this.DLA)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DLC).addComponent(this.DLF)).addGap(46, 46, 46)));
        GroupLayout groupLayout4 = new GroupLayout(this.ac);
        this.ac.setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout4.createSequentialGroup().addContainerGap().addComponent(this.ai, -1, 486, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ad, -2, -1, -2)));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout4.createSequentialGroup().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.ai, -1, 257, Short.MAX_VALUE).addComponent(this.ad, -1, 257, Short.MAX_VALUE)).addContainerGap()));
        GroupLayout groupLayout5 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout5);
        groupLayout5.setHorizontalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addGap(12, 12, 12).addComponent(this.aa, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bN, -1, -1, Short.MAX_VALUE)).addGroup(groupLayout5.createSequentialGroup().addContainerGap().addComponent(this.ac, -1, -1, Short.MAX_VALUE)));
        groupLayout5.setVerticalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.bN, -1, -1, Short.MAX_VALUE).addComponent(this.aa, -1, 329, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ac, -1, -1, Short.MAX_VALUE)));
        this.pack();
    }

    private void aj(ActionEvent actionEvent) {
        this.eEU();
    }

    private void ak(ActionEvent actionEvent) {
        this.DLL = false;
    }

    private void al(ActionEvent actionEvent) {
        this.eEW();
    }

    private void am(ActionEvent actionEvent) {
        this.eEX();
    }

    private void an(ActionEvent actionEvent) {
        this.eEY();
    }

    private void ao(ActionEvent actionEvent) {
        this.eEZ();
    }

    private void ap(ActionEvent actionEvent) {
        this.eFa();
    }

    private void aq(ActionEvent actionEvent) {
        this.eFb();
    }

    private void ar(ActionEvent actionEvent) {
        this.eFc();
    }

    private void as(ActionEvent actionEvent) {
        this.eFd();
    }

    private void c() {
        this.DLH.setValue(1);
        this.DLH.setMaximum(20);
        this.DLz.setModel(new AbstractListModel(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public Object getElementAt(int n) {
                return mlz.a(this.DLU).get(n);
            }

            public int getSize() {
                return mlz.a(this.DLU).size();
            }
        });
        this.DLy.setText("0");
        this.DLx.setText("0");
    }

    private void eEU() {
        Object object;
        Object object2;
        if (this.DLI != null) {
            this.DLL = false;
            object2 = (fub)this.DEC.d(1027);
            ((fub)object2).Rs = this.DLI.getGUID();
            ((dxq)object2).on(this.DLI.getGUID());
            ((fub)object2).iWE = fub.iHB;
            this.DEC.a((dxq)object2);
            this.DLI = null;
        }
        if (this.eik != null) {
            object2 = (fub)this.DEC.d(1027);
            ((fub)object2).Rs = this.eik.getGUID();
            ((dxq)object2).on(this.eik.getGUID());
            ((fub)object2).iWE = fub.iHB;
            this.DEC.a((dxq)object2);
            this.eik = null;
        }
        object2 = lcw.qLb + "xml-files/object/animation/";
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb((String)object2);
            object = new myr("xml", "XML Files");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(2);
            n = mkb2.showDialog(this, "Load Animation");
        }
        catch (Exception exception) {
            lfn.print("FileChooser exception: " + exception);
            return;
        }
        if (n != 0) {
            return;
        }
        object = mkb2.eDc();
        if (object == null) {
            return;
        }
        this.DLr.setListData(new String[]{((File)object).getName()});
        this.DLq.setText(((File)object).getName());
    }

    private void eEV() {
        this.DLJ = (bvf)this.fxA.d("hum_f.xml", bve.a.dQu);
        if (this.DLJ == null) {
            return;
        }
        this.DLJ.setGUID(this.DEC.bzv());
        this.DLJ.c(new ljq(0.0f, 0.0f, 0.0f));
        this.DLJ.a(new lgl(0.0f, 0.0f, 0.0f));
        gzw gzw2 = (gzw)this.DEC.d(4124);
        gzw2.on(lcr.qAE);
        gzw2.jvM = this.DLJ;
        this.DEC.a((dxq)gzw2);
        this.e(this.DLJ);
    }

    private void Cx(String string) {
        bvf bvf2 = (bvf)this.fxA.d(string, bve.a.dQu);
        if (bvf2 == null) {
            return;
        }
        bvf2.setGUID(this.DEC.bzv());
        bvf2.c(new ljq(0.0f, 0.0f, 0.0f));
        bvf2.d(new ljq(0.0f, 0.5233334f, 0.0f));
        gzw gzw2 = (gzw)this.DEC.d(4124);
        gzw2.on(lcr.qAE);
        gzw2.jvM = bvf2;
        this.DEC.a((dxq)gzw2);
        this.DLI = bvf2;
        int n = cug.id((String)this.DLI.ayY());
        boolean bl = lea.enW().isDescendant(n, cug.fgJ);
        if (bl) {
            this.e(this.DLI);
        }
        this.zl(bl);
    }

    private void h(bvd bvd2) {
        ldv ldv2 = bvd2.axa();
        if (ldv2 == null) {
            lfn.b(5, this.getClass().getName(), "getObjectSize() : Engine guid is null!!");
            return;
        }
        kmm kmm2 = (kmm)this.DEC.ii(3343);
        kmm2.hC(ldv2);
        kmm2.Zg(1);
        haa.a a2 = new haa.a(this){
            final /* synthetic */ mlz DLU;
            {
                this.DLU = mlz2;
            }

            public void a(ktv ktv2, Object object) {
                if (!(ktv2 instanceof kvk)) {
                    lfn.b(5, this.getClass().getName(), "handleResponse() : response is no ObjectInfoResponse!!!");
                    return;
                }
                kvk kvk2 = (kvk)ktv2;
                ljq ljq2 = new ljq(mje.DBl);
                ljq ljq3 = kvk2.ehe();
                float f2 = kvk2.ehf();
                float f3 = 5.0f;
                if (f2 > 7.0f) {
                    f3 = 15.0f;
                }
                if (f2 == 0.0f) {
                    f2 = 7.0f;
                }
                ljq2.et(ljq3);
                ljq2.es(new ljq(0.0f, 0.0f, f3 * f2));
                if (!(object instanceof bvf)) {
                    lfn.b(5, this.getClass().getName(), "handleResponse() : response data not an SFAnimatedMeshObjectClient");
                    return;
                }
                bvf bvf2 = (bvf)object;
                bvf2.c(ljq2);
                if (mlz.b(this.DLU) != null) {
                    ljq2.es(new ljq((double)f2 * 1.5, 0.0, -0.5));
                    mlz.b(this.DLU).c(ljq2);
                }
            }
        };
        this.DEC.a((khd)kmm2, a2, (Object)bvd2);
    }

    private void e(bvf bvf2) {
        this.eik = new bzt();
        this.eik.b(bvf2);
        this.eik.setGUID(this.DEC.bzv());
        gzw gzw2 = (gzw)this.DEC.d(4124);
        gzw2.on(lcr.qAE);
        gzw2.jvM = this.eik;
        this.DEC.a((dxq)gzw2);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
        this.eEV();
    }

    private void eEW() {
        if (this.DLL) {
            lfn.b(0, this.getClass().getSimpleName(), "playAnimations() Already playing.");
            return;
        }
        this.DLL = true;
        Thread thread = new Thread(new a(this));
        thread.start();
    }

    public void zl(boolean bl) {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        String string = lcw.qLb + "xml-files/worldbuilder/animation_player_states_monster.xml";
        if (bl) {
            string = lcw.qLb + "xml-files/worldbuilder/animation_player_states_char.xml";
        }
        string = string.toLowerCase();
        String string2 = "";
        try {
            string2 = jry.tk(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
        assert (string2.length() > 0);
        Object object = xStream.fromXML(string2);
        assert (object instanceof String[]);
        this.DLK = (String[])object;
    }

    public void eEX() {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        String string = "";
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new File(lcw.qLb + "xml-files/" + "worldbuilder" + "/"));
        jFileChooser.setFileFilter(new myt("xml", "xml files(*.xml)"));
        if (jFileChooser.showOpenDialog(this) == 0) {
            string = jFileChooser.getSelectedFile().getAbsolutePath().toLowerCase();
            String string2 = "";
            try {
                string2 = jry.tk(string);
            }
            catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return;
            }
            assert (string2.length() > 0);
            Object object = xStream.fromXML(string2);
            assert (object instanceof String[]);
            String[] stringArray = (String[])object;
            this.DLr.setListData(stringArray);
            this.DLP = jFileChooser.getSelectedFile().getName();
        }
    }

    private void eEY() {
        String string = this.DLB.getText();
        if (string.trim().length() == 0) {
            return;
        }
        try {
            float f2 = Float.parseFloat(this.DLy.getText());
            float f3 = Float.parseFloat(this.DLx.getText());
            this.DLM.add(new mmz(string, f2, this.DLw.getText(), f3));
            this.DLz.updateUI();
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    private void eEZ() {
        int n = this.DLz.getSelectedIndex();
        if (n < 0 || n >= this.DLM.size()) {
            return;
        }
        this.DLM.remove(n);
        this.DLz.updateUI();
    }

    private void eFa() {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new File(lcw.qLb + "xml-files/" + "worldbuilder" + "/"));
        jFileChooser.setFileFilter(new myt("xml", "xml files(*.xml)"));
        if (jFileChooser.showSaveDialog(this) == 0) {
            XStream xStream = new XStream(new DomDriver());
            xStream.setClassLoader(r.cr);
            String string = xStream.toXML(this.DLM);
            jry.a(new jrw(jFileChooser.getSelectedFile().getAbsolutePath()), string);
            this.DLO = jFileChooser.getSelectedFile().getName();
        }
    }

    private void eFb() {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new File(lcw.qLb + "xml-files/" + "worldbuilder" + "/"));
        jFileChooser.setFileFilter(new myt("xml", "xml files(*.xml)"));
        if (jFileChooser.showOpenDialog(this) == 0) {
            jFileChooser.getSelectedFile();
            XStream xStream = new XStream(new DomDriver());
            xStream.setClassLoader(r.cr);
            String string = null;
            try {
                string = jry.tk(jFileChooser.getSelectedFile().getAbsolutePath());
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.DLO = jFileChooser.getSelectedFile().getName();
            if (string != null) {
                this.DLM = (List)xStream.fromXML(string);
                this.DLz.updateUI();
            }
        }
    }

    private void eFc() {
        if (this.DLL) {
            return;
        }
        this.DLL = true;
        if (DLQ == null) {
            DLS = mje.DBl.esF();
            DLS.es(new ljq(-1.5, -1.0, 7.0));
            DLQ = this.c("npc_mahirim_m_guard_01.xml", DLS);
            DLT = mje.DBl.esF();
            DLT.es(new ljq(1.5f, -1.0f, 7.0f));
            DLR = this.c("npc_mahirim_m_guard_01.xml", DLT);
        }
        if (this.DLN == null) {
            this.DLN = mje.DBl.esF();
        }
        Thread thread = new Thread(new b(this));
        thread.start();
    }

    private void eFd() {
        this.DLL = false;
    }

    ldv c(String string, ljq ljq2) {
        bvf bvf2 = (bvf)this.fxA.d(string, bve.a.dQu);
        if (bvf2 == null) {
            return null;
        }
        bvf2.setGUID(this.DEC.bzv());
        bvf2.c(ljq2);
        bvf2.a(new lgl(0.0f, 0.0f, 0.0f));
        gzw gzw2 = (gzw)this.DEC.d(4124);
        gzw2.on(lcr.qAE);
        gzw2.jvM = bvf2;
        this.DEC.a((dxq)gzw2);
        String string2 = lcw.qLb + "xml-files/worldbuilder/animation_player_time_markers.txt";
        jrw jrw2 = new jrw(string2);
        return bvf2.getGUID();
    }

    static /* synthetic */ void a(mlz mlz2, ActionEvent actionEvent) {
        mlz2.al(actionEvent);
    }

    static /* synthetic */ void b(mlz mlz2, ActionEvent actionEvent) {
        mlz2.aj(actionEvent);
    }

    static /* synthetic */ void c(mlz mlz2, ActionEvent actionEvent) {
        mlz2.ak(actionEvent);
    }

    static /* synthetic */ void d(mlz mlz2, ActionEvent actionEvent) {
        mlz2.am(actionEvent);
    }

    static /* synthetic */ void e(mlz mlz2, ActionEvent actionEvent) {
        mlz2.an(actionEvent);
    }

    static /* synthetic */ void f(mlz mlz2, ActionEvent actionEvent) {
        mlz2.ao(actionEvent);
    }

    static /* synthetic */ void g(mlz mlz2, ActionEvent actionEvent) {
        mlz2.ap(actionEvent);
    }

    static /* synthetic */ void h(mlz mlz2, ActionEvent actionEvent) {
        mlz2.aq(actionEvent);
    }

    static /* synthetic */ void i(mlz mlz2, ActionEvent actionEvent) {
        mlz2.ar(actionEvent);
    }

    static /* synthetic */ void j(mlz mlz2, ActionEvent actionEvent) {
        mlz2.as(actionEvent);
    }

    static /* synthetic */ List a(mlz mlz2) {
        return mlz2.DLM;
    }

    static /* synthetic */ bvf b(mlz mlz2) {
        return mlz2.DLJ;
    }

    static /* synthetic */ JList c(mlz mlz2) {
        return mlz2.DLz;
    }

    static /* synthetic */ aux d(mlz mlz2) {
        return mlz2.DEC;
    }

    static /* synthetic */ ljq e(mlz mlz2) {
        return mlz2.DLN;
    }

    static /* synthetic */ ldv eFe() {
        return DLR;
    }

    static /* synthetic */ ldv eFf() {
        return DLQ;
    }

    static /* synthetic */ ljq eFg() {
        return DLT;
    }

    static /* synthetic */ ljq eFh() {
        return DLS;
    }

    static /* synthetic */ JSlider f(mlz mlz2) {
        return mlz2.DLH;
    }

    static /* synthetic */ boolean g(mlz mlz2) {
        return mlz2.DLL;
    }

    static /* synthetic */ boolean a(mlz mlz2, boolean bl) {
        mlz2.DLL = bl;
        return mlz2.DLL;
    }

    static /* synthetic */ String h(mlz mlz2) {
        return mlz2.DLO;
    }

    static /* synthetic */ JList i(mlz mlz2) {
        return mlz2.DLr;
    }

    static /* synthetic */ void a(mlz mlz2, String string) {
        mlz2.Cx(string);
    }

    static /* synthetic */ String[] j(mlz mlz2) {
        return mlz2.DLK;
    }

    static /* synthetic */ bvf k(mlz mlz2) {
        return mlz2.DLI;
    }

    static /* synthetic */ void a(mlz mlz2, bvd bvd2) {
        mlz2.h(bvd2);
    }

    static /* synthetic */ bvf a(mlz mlz2, bvf bvf2) {
        mlz2.DLI = bvf2;
        return mlz2.DLI;
    }

    static /* synthetic */ String l(mlz mlz2) {
        return mlz2.DLP;
    }
}

