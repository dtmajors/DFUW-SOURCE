/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 *  lcw
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class mpy
extends JInternalFrame {
    private JTextField DVA;
    private JButton DEp;
    private JPanel bF;
    private JTextField DVD;
    private JLabel I;
    private JPanel aa;
    private mrq bQ;
    private aux DEC;

    public mpy() {
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.I = new JLabel();
        this.DVD = new JTextField();
        this.DVA = new JTextField();
        this.bF = new JPanel();
        this.DEp = new JButton();
        this.setClosable(true);
        this.I.setText("Selected Tile(s):");
        this.DVD.setEditable(false);
        this.DVA.setEditable(false);
        GroupLayout groupLayout = new GroupLayout(this.bF);
        this.bF.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 629, Short.MAX_VALUE));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 523, Short.MAX_VALUE));
        this.DEp.setText("Load");
        this.DEp.addActionListener(new ActionListener(this){
            final /* synthetic */ mpy DXs;
            {
                this.DXs = mpy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpy.a(this.DXs, actionEvent);
            }
        });
        GroupLayout groupLayout2 = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.DVD, -2, 333, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE).addComponent(this.DVA, -2, 90, -2)).addComponent(this.bF, GroupLayout.Alignment.TRAILING, -1, -1, Short.MAX_VALUE).addComponent(this.DEp)).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.I).addComponent(this.DVD, -2, -1, -2).addComponent(this.DVA, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.bF, -1, -1, Short.MAX_VALUE).addGap(27, 27, 27).addComponent(this.DEp).addContainerGap()));
        GroupLayout groupLayout3 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.aa, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        this.pack();
    }

    private void aj(ActionEvent actionEvent) {
        this.eDL();
    }

    private void c() {
        this.bQ = new mrq();
        this.bF.add((Component)this.bQ, "Center");
        this.bF.repaint();
        this.setLayer(JLayeredPane.MODAL_LAYER);
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

    private void eDL() {
        Object object;
        ArrayList<Object> arrayList = lcn.emv();
        int[][] nArray = this.bQ.eLy();
        for (int i = 0; i < nArray.length; ++i) {
            for (int j = 0; j < nArray[i].length; ++j) {
                Object object2;
                if (nArray[i][j] == 0 || !((File)(object2 = new jrw(lcw.qLb + "xml-files/objectspace/built_tiles/" + lcw.f((lej)new lej(i, j)).toLowerCase()))).exists()) continue;
                arrayList.add(object2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        jxd jxd2 = new jxd();
        Map<ldv, String> map = lcn.emw();
        for (jrw comparable : arrayList) {
            object = comparable.dRT();
            if (object == null || ((jrw[])object).length == 0) {
                return;
            }
            for (jrw jrw2 : object) {
                String string;
                if (jrw2.isDirectory() || !(string = jrw2.getAbsolutePath().toLowerCase()).endsWith(".xml")) continue;
                ldv ldv2 = jxd2.A(jrw2);
                if (ldv2 == null) {
                    lfn.b(4, this.getClass().getSimpleName(), "loadLevels() : File is not an ObjectSpace: " + jrw2);
                    continue;
                }
                if (map.containsKey(ldv2)) {
                    String string2 = "[" + jrw2.getName() + "] has the same GUID [" + ldv2 + "] as file [" + (String)map.get(ldv2) + "] that is already loaded. Fix this GUID conflict. Aborting load.";
                    lfn.b(5, this.getClass().getSimpleName(), "loadLevels() : " + string2);
                    JOptionPane.showMessageDialog(this, string2, "Error loading tile", 0);
                    return;
                }
                map.put(ldv2, string);
            }
        }
        lfn.b(0, this.getClass().getSimpleName(), "loadLevels() : GUIDs are ok. Lets actually load stuff.");
        for (ldv ldv3 : map.keySet()) {
            object = (String)map.get(ldv3);
            hac hac2 = (hac)this.DEC.d(4097);
            hac2.on(lcr.qAE);
            hac2.f(lcr.qzr);
            hac2.Lb(1);
            hac2.setFileName((String)object);
            this.DEC.a((dxq)hac2);
        }
        map.clear();
        this.dispose();
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mpy mpy2, ActionEvent actionEvent) {
        mpy2.aj(actionEvent);
    }

    static /* synthetic */ mrq a(mpy mpy2) {
        return mpy2.bQ;
    }

    static /* synthetic */ JTextField b(mpy mpy2) {
        return mpy2.DVD;
    }

    static /* synthetic */ JTextField c(mpy mpy2) {
        return mpy2.DVA;
    }

    static /* synthetic */ void d(mpy mpy2) {
        mpy2.eIB();
    }
}

