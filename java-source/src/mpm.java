/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  con
 *  lcr
 *  lcw
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class mpm
extends JInternalFrame {
    private JTextField DVA;
    private JButton DVB;
    private JButton DIj;
    private JPanel bF;
    private JButton DVC;
    private JButton bI;
    private JTextField DVD;
    private JLabel I;
    private JPanel aa;
    private JPanel ac;
    private JProgressBar DGk;
    private mrq bQ;
    private aux DEC;
    private boolean DVE = false;
    private boolean DVF = false;

    public mpm() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.DIj = new JButton();
        this.DVC = new JButton();
        this.bF = new JPanel();
        this.DVA = new JTextField();
        this.DVD = new JTextField();
        this.I = new JLabel();
        this.DVB = new JButton();
        this.bI = new JButton();
        this.ac = new JPanel();
        this.DGk = new JProgressBar();
        this.setClosable(true);
        this.setIconifiable(true);
        this.setTitle("Convert Dungeon");
        this.DIj.setText("Convert");
        this.DIj.addActionListener(new ActionListener(this){
            final /* synthetic */ mpm DVG;
            {
                this.DVG = mpm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpm.a(this.DVG, actionEvent);
            }
        });
        this.DVC.setText("Move Dungeon to Tile");
        this.DVC.addActionListener(new ActionListener(this){
            final /* synthetic */ mpm DVG;
            {
                this.DVG = mpm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpm.b(this.DVG, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout(this.bF);
        this.bF.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 532, Short.MAX_VALUE));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 525, Short.MAX_VALUE));
        this.DVA.setEditable(false);
        this.DVD.setEditable(false);
        this.I.setText("Selected Tile(s):");
        this.DVB.setText("Clear All");
        this.DVB.addActionListener(new ActionListener(this){
            final /* synthetic */ mpm DVG;
            {
                this.DVG = mpm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpm.c(this.DVG, actionEvent);
            }
        });
        this.bI.setText("Select All");
        this.bI.addActionListener(new ActionListener(this){
            final /* synthetic */ mpm DVG;
            {
                this.DVG = mpm2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpm.d(this.DVG, actionEvent);
            }
        });
        this.ac.setBorder(BorderFactory.createTitledBorder("Progress"));
        GroupLayout groupLayout2 = new GroupLayout(this.ac);
        this.ac.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.DGk, -1, 500, Short.MAX_VALUE).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.DGk, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout3 = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.DVC).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DIj).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE).addComponent(this.DVB).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bI)).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.ac, -1, -1, Short.MAX_VALUE)).addGroup(GroupLayout.Alignment.LEADING, groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.bF, -1, -1, Short.MAX_VALUE)).addGroup(GroupLayout.Alignment.LEADING, groupLayout3.createSequentialGroup().addGap(20, 20, 20).addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DVD, -2, 333, -2).addGap(18, 18, 18).addComponent(this.DVA, -2, 90, -2)))).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.DVD, -2, -1, -2).addComponent(this.DVA, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.bF, -2, -1, -2).addGap(18, 18, 18).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.DVC).addComponent(this.DIj).addComponent(this.bI).addComponent(this.DVB)).addGap(18, 18, 18).addComponent(this.ac, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        GroupLayout groupLayout4 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addComponent(this.aa, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addComponent(this.aa, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        this.pack();
    }

    private void bf(ActionEvent actionEvent) {
        this.eIE();
    }

    private void bg(ActionEvent actionEvent) {
        this.eID();
    }

    private void bh(ActionEvent actionEvent) {
        this.bQ.eLx();
    }

    private void h(ActionEvent actionEvent) {
        this.bQ.selectAll();
    }

    private void c() {
        this.bQ = new mrq();
        this.bF.add((Component)this.bQ, "Center");
        this.bF.repaint();
        new Thread(new a(this, null)).start();
    }

    private synchronized void eIB() {
        Point point = this.bQ.eLz();
        if (point == null) {
            return;
        }
        List<mqm> list = this.bQ.eLA();
        mqm mqm2 = new mqm();
        mqm2.getDefaultSize().height = 10;
        mqm2.getDefaultSize().width = 10;
        mqm2.j(Color.cyan);
        mqm2.h(Color.cyan);
        mqm2.a(mqm.a.Eee);
        mqm2.h(point);
        list.clear();
        list.add(mqm2);
        this.bQ.m(null);
    }

    private List<jrw> eIC() {
        ArrayList<jrw> arrayList = lcn.emv();
        int[][] nArray = this.bQ.eLy();
        for (int i = 0; i < nArray.length; ++i) {
            for (int j = 0; j < nArray[i].length; ++j) {
                jrw[] jrwArray;
                jrw jrw2;
                if (nArray[i][j] == 0 || !(jrw2 = new jrw(lcw.qLb + "xml-files/objectspace/dungeons/" + lcw.f((lej)new lej(i, j)).toLowerCase())).exists()) continue;
                for (jrw jrw3 : jrwArray = jrw2.dRT()) {
                    if (!jrw3.isDirectory() || !jrw3.getName().startsWith("dungeon")) continue;
                    arrayList.add(jrw3);
                }
            }
        }
        return arrayList;
    }

    private void eID() {
        Object object;
        List<jrw> list = this.eIC();
        if (list.isEmpty()) {
            return;
        }
        boolean bl = true;
        for (jrw object22 : list) {
            String string;
            this.DVE = true;
            this.DVF = true;
            if (!this.DVE) {
                string = "No Portal in dungeon: " + object22.getName() + " for Tile [" + object22.dRU().getName() + "]. Can not convert.";
                lfn.b(5, this.getClass().getSimpleName(), "moveDungeon() : " + string);
                JOptionPane.showMessageDialog(this, string, "Error Converting dungeon", 0);
                bl = false;
            }
            if (this.DVF) continue;
            string = "No Sphere in dungeon" + object22.getName() + " for Tile [" + object22.dRU().getName() + "]. Can not convert.";
            lfn.b(5, this.getClass().getSimpleName(), "moveDungeon() : " + string);
            JOptionPane.showMessageDialog(this, string, "Error Converting dungeon", 0);
            bl = false;
        }
        if (!bl) {
            object = "A Dungeon is missing essential files. Not Converting";
            lfn.b(5, this.getClass().getSimpleName(), "moveDungeon() : " + (String)object);
            JOptionPane.showMessageDialog(this, object, "Error Converting dungeon", 0);
            return;
        }
        object = new con();
        object.c(list, true);
        object.Az(true);
        gzw gzw2 = (gzw)this.DEC.d(4124);
        gzw2.on(lcr.qAE);
        gzw2.jvM = object;
        this.DEC.a((dxq)gzw2);
    }

    private void eIE() {
        List<jrw> list = this.eIC();
        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Could not find any files");
            return;
        }
        for (jrw jrw2 : list) {
            this.S(jrw2);
        }
        JOptionPane.showMessageDialog(this, "Moving done. Check log for errors");
    }

    private void S(jrw jrw2) {
        Object object;
        if (!jrw2.exists() || !jrw2.isDirectory()) {
            lfn.b(4, this.getClass().getSimpleName(), "moveDungeon() : File [" + jrw2 + "] is invalid.");
            return;
        }
        String string = jry.tu(jrw2.dRU().getName());
        int n = -1;
        try {
            n = Integer.parseInt(jrw2.getName().substring(jrw2.getName().length() - 1));
        }
        catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        }
        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Dungeon directory name has wrong format. Check the Wiki.  -> " + jrw2, "Error finding dungeon number.", 0);
            return;
        }
        lfn.b(0, this.getClass().getSimpleName(), "moveDungeon() : Level for dungeon = " + string);
        ljq ljq2 = lcw.zh((String)string);
        ljq2.x += 512.0f;
        ljq2.rlV += 512.0f;
        ljq ljq3 = null;
        ArrayList<String> arrayList = lcn.emv();
        jrw[] jrwArray = jrw2.a(new jsl("xml"));
        String string2 = jry.tp(lcw.qLb + "xml-files/objectspace/");
        for (jrw object22 : jrwArray) {
            if (object22.isDirectory()) continue;
            object = jry.tp(object22.getAbsolutePath());
            assert (object.startsWith(string2)) : "OSFilename does not start with Dir filename.";
            object = object.substring(string2.length());
            arrayList.add((String)object);
        }
        Map map = lcn.emw();
        jxd jxd2 = new jxd();
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String string3 : arrayList) {
                map.putAll(jxd2.b(jrw2, string3, false));
            }
        }
        this.DVE = false;
        this.DVF = false;
        for (amf amf2 : map.values()) {
            if (amf2 instanceof dsn) {
                ljq3 = ((dsn)((Object)amf2)).av();
                object = "Got Sphereshape with position = " + ljq3;
                lfn.b(0, this.getClass().getSimpleName(), "convertObjectsToCity() : " + object);
                this.DVF = true;
            } else if (amf2 instanceof dsh) {
                object = (dsh)((Object)amf2);
                lfn.b(0, this.getClass().getSimpleName(), "convertToLevelFormat() : Found SFPortalRepresentationObject in: " + string);
                this.DVE = true;
            }
            if (!this.DVE || !this.DVF) continue;
            break;
        }
        if (ljq3 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "moveDungeon() : SpherePosition is null. Prolly missing Sphere Shape object in dungeon");
            JOptionPane.showMessageDialog(this, "Missing Sphere shape object in Dungeon files!", "Error Moving dungeon", 0);
            return;
        }
        ljq ljq4 = new ljq(ljq2);
        ljq4.et(ljq3);
        ljq4.y = (float)(-2000 * n) - ljq3.y;
        mzh mzh2 = new mzh();
        mzh2.At(true);
        mzh2.a(jrwArray, 1.0, ljq4);
        lfn.b(0, this.getClass().getSimpleName(), "moveDungeon() : Moved file [" + jrw2.getName() + "] this much: " + ljq4);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mpm mpm2, ActionEvent actionEvent) {
        mpm2.bg(actionEvent);
    }

    static /* synthetic */ void b(mpm mpm2, ActionEvent actionEvent) {
        mpm2.bf(actionEvent);
    }

    static /* synthetic */ void c(mpm mpm2, ActionEvent actionEvent) {
        mpm2.bh(actionEvent);
    }

    static /* synthetic */ void d(mpm mpm2, ActionEvent actionEvent) {
        mpm2.h(actionEvent);
    }

    static /* synthetic */ mrq a(mpm mpm2) {
        return mpm2.bQ;
    }

    static /* synthetic */ JTextField b(mpm mpm2) {
        return mpm2.DVD;
    }

    static /* synthetic */ JTextField c(mpm mpm2) {
        return mpm2.DVA;
    }

    static /* synthetic */ void d(mpm mpm2) {
        mpm2.eIB();
    }
}

