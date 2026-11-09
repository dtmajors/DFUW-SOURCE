/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  mnl
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class mxe
extends JInternalFrame
implements ActionListener,
InternalFrameListener,
mnn {
    private aux DCH = null;
    private mnl ESj = null;
    private mnt ESk = null;
    private mnq ESl = null;
    private Map<mnt, Set<mny>> ESm = null;
    private Map<mny, Set<mnt>> ESn = null;
    private boolean ESo = false;
    private JPanel ESp = null;
    private JPanel ESq = null;
    private JCheckBox ESr = null;
    private JLabel ESs = null;
    private JPanel ESt = null;
    private JLabel ESu = null;
    private JLabel ESv = null;
    private JLabel ESw = null;
    private JLabel ESx = null;
    private JLabel ESy = null;
    private JLabel ESz = null;
    private JLabel ESA = null;
    private JLabel ESB = null;
    private JLabel ESC = null;
    private JLabel ESD = null;
    private JLabel ESE = null;
    private JLabel ESF = null;
    private JPanel ESG = null;
    private JButton ESH = null;
    private JButton ESI = null;

    public void w(aux aux2) {
        this.DCH = aux2;
    }

    public mxe() {
        super("Territory Editor");
        this.eSG();
        this.ESm = lcn.emw();
        this.ESn = lcn.emw();
    }

    private void a(mnt mnt2) {
        if (mnt2 == null) {
            return;
        }
        if (this.ESk == mnt2) {
            this.b(mnt2);
            return;
        }
        this.b(this.ESk);
        this.ESk = mnt2;
        this.ESk.zE(true);
        Set<mny> set = this.ESm.get(this.ESk);
        if (set == null) {
            set = lcn.emx();
            this.ESm.put(this.ESk, set);
        }
        for (mny mny2 : set) {
            mny2.zE(true);
        }
    }

    private void b(mnt mnt2) {
        if (mnt2 == null) {
            return;
        }
        mnt2.zE(false);
        if (mnt2 == this.ESk) {
            this.ESk = null;
        }
        Set<mny> set = this.ESm.get(mnt2);
        for (mny mny2 : set) {
            mny2.zE(false);
        }
    }

    private void a(mny mny2) {
        if (mny2 == null) {
            return;
        }
        if (this.ESk == null) {
            return;
        }
        if (mny2.isSelected()) {
            this.b(mny2);
            return;
        }
        Set<mny> set = this.ESm.get(this.ESk);
        if (set == null) {
            set = lcn.emx();
            this.ESm.put(this.ESk, set);
        }
        set.add(mny2);
        mny2.zE(true);
        Set<mnt> set2 = this.ESn.get(mny2);
        if (set2 == null) {
            set2 = lcn.emx();
            this.ESn.put(mny2, set2);
        }
        set2.add(this.ESk);
        this.ESo = true;
        this.ESH.setEnabled(true);
        this.ESI.setEnabled(true);
        if (!this.getTitle().endsWith("*")) {
            this.setTitle(this.getTitle() + " *");
        }
    }

    private void b(mny mny2) {
        Set<mnt> set;
        if (mny2 == null) {
            return;
        }
        if (this.ESk == null) {
            return;
        }
        mny2.zE(false);
        Set<mny> set2 = this.ESm.get(this.ESk);
        if (set2 != null) {
            set2.remove(mny2);
        }
        if ((set = this.ESn.get(mny2)) != null) {
            set.remove(this.ESk);
        }
        this.ESo = true;
        this.ESH.setEnabled(true);
        this.ESI.setEnabled(true);
        if (!this.getTitle().endsWith("*")) {
            this.setTitle(this.getTitle() + " *");
        }
    }

    private void eSG() {
        this.setClosable(true);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(2);
        this.getContentPane().setLayout(new BorderLayout());
        this.addInternalFrameListener(this);
        mnm mnm2 = new mnm();
        mnm2.a(mnp.DQq);
        mnm2.setShowGrid(false);
        mnm2.zy(false);
        mnm2.zz(false);
        mnm2.w(true, true);
        mnm2.x(true, true);
        this.ESj = new mnl((mnn)this, mnm2);
        this.ESp = new JPanel(true);
        this.ESp.setBorder(new EtchedBorder());
        this.ESp.setLayout(new BoxLayout(this.ESp, 1));
        this.ESp.setSize(150, this.ESj.getHeight());
        this.ESp.setPreferredSize(new Dimension(150, this.ESj.getHeight()));
        this.ESp.setMinimumSize(new Dimension(150, this.ESj.getHeight()));
        this.ESq = new JPanel(true);
        this.ESq.setBorder(BorderFactory.createTitledBorder("Map Controls"));
        this.ESq.setLayout(new GridLayout(2, 1, 0, 5));
        this.ESt = new JPanel(true);
        this.ESt.setBorder(BorderFactory.createTitledBorder("Statistics"));
        this.ESt.setLayout(new GridLayout(14, 1, 0, 5));
        this.ESG = new JPanel(true);
        this.ESG.setBorder(BorderFactory.createTitledBorder("Controls"));
        this.ESG.setLayout(new GridLayout(2, 1, 0, 5));
        this.ESr = new JCheckBox("Show Grid", mnm2.eGt());
        this.ESr.addActionListener(this);
        this.ESs = new JLabel("TileID: ---");
        this.ESu = new JLabel("Villages (per City)");
        this.ESu.setFont(new Font(this.ESu.getFont().getFontName(), 1, this.ESu.getFont().getSize()));
        this.ESv = new JLabel("Min: 0");
        this.ESw = new JLabel("Max: 0");
        this.ESx = new JLabel("Avg: 0");
        this.ESy = new JLabel("Villages (per Hamlet)");
        this.ESy.setFont(new Font(this.ESy.getFont().getFontName(), 1, this.ESy.getFont().getSize()));
        this.ESz = new JLabel("Min: 0");
        this.ESA = new JLabel("Max: 0");
        this.ESB = new JLabel("Avg: 0");
        this.ESC = new JLabel("Holdings (per Village)");
        this.ESC.setFont(new Font(this.ESC.getFont().getFontName(), 1, this.ESC.getFont().getSize()));
        this.ESD = new JLabel("Min: 0");
        this.ESE = new JLabel("Max: 0");
        this.ESF = new JLabel("Avg: 0");
        this.ESH = new JButton("Save Changes");
        this.ESH.addActionListener(this);
        this.ESH.setEnabled(false);
        this.ESI = new JButton("Revert Changes");
        this.ESI.addActionListener(this);
        this.ESI.setEnabled(false);
        this.ESq.add(this.ESr);
        this.ESq.add(this.ESs);
        this.ESt.add(this.ESu);
        this.ESt.add(this.ESv);
        this.ESt.add(this.ESw);
        this.ESt.add(this.ESx);
        this.ESt.add(Box.createVerticalStrut(15));
        this.ESt.add(this.ESy);
        this.ESt.add(this.ESz);
        this.ESt.add(this.ESA);
        this.ESt.add(this.ESB);
        this.ESt.add(Box.createVerticalStrut(15));
        this.ESt.add(this.ESC);
        this.ESt.add(this.ESD);
        this.ESt.add(this.ESE);
        this.ESt.add(this.ESF);
        this.ESG.add(this.ESH);
        this.ESG.add(this.ESI);
        this.ESp.add(this.ESq);
        this.ESp.add(Box.createVerticalStrut(80));
        this.ESp.add(this.ESt);
        this.ESp.add(Box.createVerticalStrut(80));
        this.ESp.add(this.ESG);
        this.add((Component)this.ESj, "Center");
        this.add((Component)this.ESp, "East");
        this.pack();
    }

    private void cdJ() {
        Set<mnq> set;
        int n = 0;
        int n2 = Integer.MIN_VALUE;
        int n3 = Integer.MAX_VALUE;
        int n4 = 0;
        float f2 = 0.0f;
        int n5 = 0;
        int n6 = Integer.MIN_VALUE;
        int n7 = Integer.MAX_VALUE;
        int n8 = 0;
        float f3 = 0.0f;
        int n9 = 0;
        int n10 = Integer.MIN_VALUE;
        int n11 = Integer.MAX_VALUE;
        int n12 = 0;
        float f4 = 0.0f;
        if (this.ESj.eGb() != null) {
            for (mnq mnq2 : this.ESj.eGb()) {
                set = this.ESm.get(mnq2);
                n9 = set == null ? 0 : set.size();
                switch (mnq2.afx()) {
                    case cvj: {
                        ++n;
                        n4 += n9;
                        if (n9 > n2) {
                            n2 = n9;
                        }
                        if (n9 >= n3) break;
                        n3 = n9;
                        break;
                    }
                    case cvk: {
                        ++n5;
                        n8 += n9;
                        if (n9 > n6) {
                            n6 = n9;
                        }
                        if (n9 >= n7) break;
                        n7 = n9;
                    }
                }
            }
            f2 = (float)n4 / (float)n;
            f3 = (float)n8 / (float)n5;
        } else {
            n2 = 0;
            n6 = 0;
            n3 = 0;
            n7 = 0;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        n9 = 0;
        if (this.ESj.eGc() != null) {
            for (mnq mnq2 : this.ESj.eGc()) {
                set = this.ESn.get(mnq2);
                int n13 = set == null ? 0 : set.size();
                ++n9;
                n12 += n13;
                if (n13 > n10) {
                    n10 = n13;
                }
                if (n13 >= n11) continue;
                n11 = n13;
            }
            f4 = (float)n12 / (float)n9;
        } else {
            n10 = 0;
            n11 = 0;
            f4 = 0.0f;
        }
        this.ESv.setText("Min: " + n3);
        this.ESw.setText("Max: " + n2);
        this.ESx.setText("Avg: " + f2);
        this.ESz.setText("Min: " + n7);
        this.ESA.setText("Max: " + n6);
        this.ESB.setText("Avg: " + f3);
        this.ESD.setText("Min: " + n11);
        this.ESE.setText("Max: " + n10);
        this.ESF.setText("Avg: " + f4);
    }

    @Override
    public void eGS() {
        this.eSH();
    }

    @Override
    public void CF(String string) {
        this.ESs.setText("TileID: " + (string == null ? "---" : string));
    }

    @Override
    public void a(mnq mnq2, int n) {
        if (n != 1) {
            return;
        }
        if (mnq2 == null) {
            if (this.ESk != null) {
                this.b(this.ESk);
            }
            return;
        }
        switch (mnq2.eGT()) {
            case DRh: {
                this.a((mnt)mnq2);
                break;
            }
            case DRi: {
                this.a((mny)mnq2);
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void b(mnq mnq2) {
        Set<mnq> set;
        if (this.ESl != null) {
            switch (this.ESl.eGT()) {
                case DRh: {
                    set = this.ESm.get(this.ESl);
                    if (set != null) {
                        for (mnq mnq3 : set) {
                            mnq3.zE(false);
                        }
                    }
                    if (this.ESk == null || (set = this.ESm.get(this.ESk)) == null) break;
                    for (mnq mnq3 : set) {
                        mnq3.zE(true);
                    }
                    break;
                }
                case DRi: {
                    set = this.ESn.get(this.ESl);
                    if (set != null) {
                        for (mnq mnq3 : set) {
                            mnq3.zE(false);
                        }
                    }
                    if (this.ESk == null) break;
                    this.ESk.zE(true);
                    break;
                }
            }
            this.ESl.lo(false);
            this.ESl = null;
        }
        this.ESl = mnq2;
        if (this.ESl != null) {
            switch (this.ESl.eGT()) {
                case DRh: {
                    if (this.ESk != null && (set = this.ESm.get(this.ESk)) != null) {
                        for (mnq mnq3 : set) {
                            mnq3.zE(false);
                        }
                    }
                    if ((set = this.ESm.get(this.ESl)) == null) break;
                    for (mnq mnq3 : set) {
                        mnq3.zE(true);
                    }
                    break;
                }
                case DRi: {
                    set = this.ESn.get(this.ESl);
                    if (set == null) break;
                    for (mnq mnq3 : set) {
                        mnq3.zE(true);
                    }
                    break;
                }
            }
            this.ESl.lo(true);
        }
    }

    @Override
    public void T(int n, int n2, int n3) {
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.ESr) {
            this.ESj.setShowGrid(this.ESr.isSelected());
        } else if (actionEvent.getSource() == this.ESH) {
            this.ESo = false;
            this.ESH.setEnabled(false);
            this.ESI.setEnabled(false);
            this.setTitle("Territory Editor");
            this.eSI();
        } else if (actionEvent.getSource() == this.ESI) {
            mnt mnt2 = this.ESk;
            this.b(mnt2);
            this.eSH();
            this.a(mnt2);
            this.ESo = false;
            this.ESH.setEnabled(false);
            this.ESI.setEnabled(false);
            this.setTitle("Territory Editor");
        }
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent internalFrameEvent) {
        Object[] objectArray;
        int n;
        if (this.ESo && (n = JOptionPane.showOptionDialog(this, "Save Changes Before Close?", "Unsaved Changes Made!", 0, 3, null, objectArray = new String[]{"Save Changes", "Discard Changes"}, objectArray[0])) == 0) {
            this.eSI();
        }
        this.hide();
    }

    @Override
    public void internalFrameOpened(InternalFrameEvent internalFrameEvent) {
        this.ESj.eGk();
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent internalFrameEvent) {
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent internalFrameEvent) {
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent internalFrameEvent) {
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent internalFrameEvent) {
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent internalFrameEvent) {
    }

    private void eSH() {
        try {
            this.ESm.clear();
            this.ESn.clear();
            jud.dTp();
            for (Map.Entry<String, Set<String>> entry : jud.getMap().entrySet()) {
                mnt mnt2 = (mnt)this.ESj.a(entry.getKey(), mnx.DRh);
                if (mnt2 == null) continue;
                Set<mny> set = this.ESm.get(mnt2);
                if (set == null) {
                    set = lcn.emx();
                    this.ESm.put(mnt2, set);
                }
                for (String string : entry.getValue()) {
                    mny mny2 = (mny)this.ESj.a(string, mnx.DRi);
                    if (mny2 == null) continue;
                    set.add(mny2);
                    Set<mnt> set2 = this.ESn.get(mny2);
                    if (set2 == null) {
                        set2 = lcn.emx();
                        this.ESn.put(mny2, set2);
                    }
                    set2.add(mnt2);
                }
            }
            this.cdJ();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void eSI() {
        Map<String, Set<String>> map = lcn.emw();
        for (Map.Entry<mnt, Set<mny>> entry : this.ESm.entrySet()) {
            if (entry.getValue().isEmpty()) continue;
            Set<String> set = lcn.emx();
            for (mny mny2 : entry.getValue()) {
                set.add(mny2.bsp());
            }
            map.put(entry.getKey().afw(), set);
        }
        jud.M(map);
    }
}

