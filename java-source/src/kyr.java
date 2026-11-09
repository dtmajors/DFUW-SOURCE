/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class kyr
extends JFrame
implements ActionListener,
ItemListener,
ChangeListener {
    private kyp qmk = null;
    private kyq qml = null;
    private kyi qmm = null;
    private kyl qmn = null;
    private kyn qmo = null;
    private kyw qmp = null;
    private CardLayout qmq = null;
    private JPanel qmr = null;
    private JTabbedPane qms = null;
    private List qmt = lcn.abH(2);
    private List qmu = lcn.abH(1);
    private JMenu qmv;
    private JMenu qmw;
    private JMenu qmx;
    private JMenuItem qmy;
    private JMenuItem qmz;
    private JMenuItem qmA;
    private JMenuItem qmB;
    private JMenuItem qmC;
    private JMenuItem qmD;
    private JMenuItem qmE;
    private JMenuItem qmF;
    private JMenuItem qmG;
    private JCheckBoxMenuItem qmH;
    private JCheckBoxMenuItem qmI;
    private JCheckBoxMenuItem qmJ;
    private JCheckBoxMenuItem qmK;
    private boolean nvK = false;
    private boolean nvL = false;

    public kyr() {
        this.init();
    }

    public kyp eiZ() {
        return this.qmk;
    }

    public kyi eja() {
        return this.qmm;
    }

    public void a(kyk[] kykArray) {
        assert (kykArray != null);
        this.qmm.qjx = kykArray;
        if (this.qmt.isEmpty()) {
            return;
        }
        for (kyy kyy2 : this.qmt) {
            if (!(kyy2 instanceof kys)) continue;
            kys kys2 = (kys)kyy2;
            kys2.ejx();
        }
    }

    public void b(kyy kyy2) {
        assert (kyy2 != null);
        int n = this.qms.indexOfComponent(kyy2.ejO());
        if (n < 0) {
            lfn.b(5, "SFLogViewer", "updateViewSessionTabTitle() Could not find index of component.");
            return;
        }
        String string = kyy2.cgO();
        this.qms.setTitleAt(n, string);
    }

    public void xS(boolean bl) {
        if (this.qmu.isEmpty()) {
            return;
        }
        for (kyy kyy2 : this.qmu) {
            if (!(kyy2 instanceof kyt)) continue;
            kyt kyt2 = (kyt)kyy2;
            kyt2.xS(bl);
        }
    }

    private void ejb() {
        JMenuBar jMenuBar = new JMenuBar();
        this.setJMenuBar(jMenuBar);
        this.qmv = this.ejd();
        this.qmw = this.eje();
        this.qmx = this.ejf();
        jMenuBar.add(this.ejg());
        jMenuBar.add(this.qmw);
        jMenuBar.add(this.qmx);
        jMenuBar.add(this.qmv);
        jMenuBar.add(this.ejc());
    }

    private JMenu ejc() {
        JMenu jMenu = new JMenu("Help");
        JMenuItem jMenuItem = new JMenuItem("Keyboard Shortcuts");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenu.addSeparator();
        jMenuItem = new JMenuItem("About SFLogViewer");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        return jMenu;
    }

    private JMenu ejd() {
        JMenu jMenu = new JMenu("Layout");
        this.qmB = new JMenuItem("Show TabView");
        this.qmB.addActionListener(this);
        jMenu.add(this.qmB);
        this.qmF = new JMenuItem("Set Horizontal Split");
        this.qmF.addActionListener(this);
        jMenu.add(this.qmF);
        this.qmG = new JMenuItem("Set Vertical Split");
        this.qmG.addActionListener(this);
        jMenu.add(this.qmG);
        jMenu.addSeparator();
        this.qmC = new JMenuItem("Show SplitView");
        this.qmC.addActionListener(this);
        jMenu.add(this.qmC);
        this.qmD = new JMenuItem("Select ViewPaneA");
        this.qmD.addActionListener(this);
        jMenu.add(this.qmD);
        this.qmE = new JMenuItem("Select ViewPaneB");
        this.qmE.addActionListener(this);
        jMenu.add(this.qmE);
        jMenu.addSeparator();
        JMenuItem jMenuItem = new JMenuItem("Remove SplitViewPanes");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        return jMenu;
    }

    private JMenu eje() {
        JMenu jMenu = new JMenu("Logfile");
        jMenu.setEnabled(false);
        JMenuItem jMenuItem = new JMenuItem("Open Logfile...");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Open Directory...");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Refresh Logfile");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenu.addSeparator();
        jMenuItem = new JMenuItem("Add Directory");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Remove Directory");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Save Logfile...");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        return jMenu;
    }

    private JMenu ejf() {
        JMenu jMenu = new JMenu("Logger");
        jMenu.setEnabled(false);
        JMenuItem jMenuItem = new JMenuItem("Select PortNumber");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Select Reserved PortNumber");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        this.qmz = new JMenuItem("Create Socket");
        this.qmz.addActionListener(this);
        this.qmz.setEnabled(false);
        jMenu.add(this.qmz);
        jMenuItem = new JMenuItem("Log Separator");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Save Log...");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenu.addSeparator();
        jMenuItem = new JMenuItem("Clear View");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        this.qmA = new JMenuItem("Remove Socket");
        this.qmA.addActionListener(this);
        this.qmA.setEnabled(false);
        jMenu.add(this.qmA);
        jMenu.addSeparator();
        this.qmH = new JCheckBoxMenuItem("Autoscroll");
        this.qmH.setSelected(this.qmm.qjp);
        this.qmH.addItemListener(this);
        jMenu.add(this.qmH);
        jMenuItem = new JMenuItem("Set SleepLength");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Set Max SleepCount");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        return jMenu;
    }

    private JMenu ejg() {
        JMenu jMenu = new JMenu("ViewSession");
        JMenuItem jMenuItem = new JMenuItem("Create Logfile ViewSession");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Create Logger ViewSession");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenu.addSeparator();
        this.qmy = new JMenuItem("Close ViewSession");
        this.qmy.addActionListener(this);
        this.qmy.setEnabled(false);
        jMenu.add(this.qmy);
        jMenu.addSeparator();
        jMenuItem = new JMenuItem("Edit Filters...");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        jMenuItem = new JMenuItem("Search...");
        jMenuItem.addActionListener(this);
        jMenu.add(jMenuItem);
        JMenu jMenu2 = new JMenu("Set LogLevel");
        ButtonGroup buttonGroup = new ButtonGroup();
        for (int i2 = 0; i2 < lfn.rkl.length; ++i2) {
            switch (i2) {
                case 0: {
                    jMenuItem = new JRadioButtonMenuItem("Debug");
                    break;
                }
                case 1: {
                    jMenuItem = new JRadioButtonMenuItem("Verbose");
                    break;
                }
                case 2: {
                    jMenuItem = new JRadioButtonMenuItem("Info");
                    break;
                }
                case 3: {
                    jMenuItem = new JRadioButtonMenuItem("Notice");
                    break;
                }
                case 4: {
                    jMenuItem = new JRadioButtonMenuItem("Warning");
                    break;
                }
                case 5: {
                    jMenuItem = new JRadioButtonMenuItem("Error");
                    break;
                }
                case 6: {
                    jMenuItem = new JRadioButtonMenuItem("Fatal");
                }
            }
            if (i2 == this.qmm.qjt) {
                jMenuItem.setSelected(true);
            }
            jMenuItem.addActionListener(this);
            buttonGroup.add(jMenuItem);
            jMenu2.add(jMenuItem);
        }
        jMenu.add(jMenu2);
        this.qmI = new JCheckBoxMenuItem("Show LineNumbers");
        this.qmI.setSelected(this.qmm.qjq);
        this.qmI.addItemListener(this);
        this.qmI.setEnabled(false);
        jMenu.add(this.qmI);
        this.qmJ = new JCheckBoxMenuItem("Show Time");
        this.qmJ.setSelected(this.qmm.qjr);
        this.qmJ.addItemListener(this);
        this.qmJ.setEnabled(false);
        jMenu.add(this.qmJ);
        this.qmK = new JCheckBoxMenuItem("Show ExtraTime");
        this.qmK.setSelected(this.qmm.qjs);
        this.qmK.addItemListener(this);
        this.qmK.setEnabled(false);
        jMenu.add(this.qmK);
        return jMenu;
    }

    private void b(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 18: {
                this.nvK = true;
                break;
            }
            case 17: {
                this.nvL = true;
                break;
            }
            case 115: {
                if (!this.nvL) {
                    return;
                }
                kyy kyy2 = this.ejq();
                if (kyy2 == null) break;
                this.d(kyy2);
                break;
            }
            case 116: {
                if (this.nvL) {
                    return;
                }
                kyy kyy3 = this.ejq();
                if (kyy3 == null) {
                    return;
                }
                if (kyy3 instanceof kys) {
                    kys kys2 = (kys)this.ejq();
                    kys2.ejx();
                    break;
                }
                kyt kyt2 = (kyt)this.ejq();
                if (kyt2.ejA()) break;
                kyt2.ejB();
                this.ejn();
                break;
            }
            case 68: {
                if (!this.nvL) {
                    return;
                }
                kyy kyy4 = this.ejq();
                if (kyy4 == null || !(kyy4 instanceof kys)) break;
                kys kys3 = (kys)kyy4;
                kys3.ejv();
                break;
            }
            case 69: {
                if (!this.nvL) break;
                this.ejk();
                break;
            }
            case 70: {
                if (this.nvK) {
                    this.ejo();
                    break;
                }
                if (!this.nvL) break;
                this.ejl();
                break;
            }
            case 76: {
                if (!this.nvK) break;
                this.ejp();
                break;
            }
            case 79: {
                if (!this.nvL) {
                    return;
                }
                kyy kyy5 = this.ejq();
                if (kyy5 == null || !(kyy5 instanceof kys)) break;
                kys kys4 = (kys)kyy5;
                kys4.ejw();
                break;
            }
            case 83: {
                if (!this.nvL) break;
                this.xU(false);
                break;
            }
            case 84: {
                if (!this.nvL) break;
                this.xU(true);
                break;
            }
            case 9: {
                if (!this.nvL) {
                    return;
                }
                int n = this.qms.getSelectedIndex();
                if (++n >= this.qms.getTabCount()) {
                    n = 0;
                }
                this.qms.setSelectedIndex(n);
                break;
            }
        }
    }

    private void c(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 18: {
                this.nvK = false;
                break;
            }
            case 17: {
                this.nvL = false;
            }
        }
    }

    private void init() {
        this.qmk = new kyp(this);
        this.ejh();
        this.ejb();
        this.qms = new JTabbedPane();
        this.qms.addChangeListener(this);
        this.qmr = (JPanel)this.getContentPane();
        this.qmr.setBackground(this.qmm.qjm);
        JPanel jPanel = new JPanel();
        jPanel.setBackground(this.qmm.qjm);
        jPanel.setLayout(new BorderLayout());
        jPanel.add((Component)this.qms, "Center");
        this.qmp = new kyw(this);
        this.qmq = new CardLayout();
        this.qmr.setLayout(this.qmq);
        this.qmr.add((Component)jPanel, "TabView");
        this.qmr.add((Component)this.qmp, "SplitView");
        this.setTitle("SFLogViewer");
        this.setSize(new Dimension(this.qmm.qje.pgr, this.qmm.qje.pgs));
        this.setLocation(new Point(this.qmm.qje.lnR, this.qmm.qje.lnS));
        this.xU(true);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter(this){
            final /* synthetic */ kyr qmL;
            {
                this.qmL = kyr2;
            }

            public void windowClosing(WindowEvent windowEvent) {
                if (kyr.a(this.qmL) != null) {
                    kyr.a(this.qmL).xR(false);
                }
                kyr.a(this.qmL, kyr.b(this.qmL).isEnabled());
                kyr.c(this.qmL);
                kyr.d(this.qmL).eiW();
                System.exit(0);
            }
        });
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher(this){
            final /* synthetic */ kyr qmL;
            {
                this.qmL = kyr2;
            }

            public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                kyr.a(this.qmL, keyEvent);
                return false;
            }
        });
        this.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ kyr qmL;
            {
                this.qmL = kyr2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                kyr.b(this.qmL, keyEvent);
            }

            public void keyReleased(KeyEvent keyEvent) {
                kyr.c(this.qmL, keyEvent);
            }
        });
        if (this.qmm.qjy != null) {
            kyz kyz2 = null;
            kyy kyy2 = null;
            for (int i2 = 0; i2 < this.qmm.qjy.length; ++i2) {
                kyy kyy3;
                kyz2 = this.qmm.qjy[i2];
                if (kyz2.qns) {
                    kyy3 = new kys(this);
                    ((kys)kyy3).xN(kyz2.pnB);
                    ((kys)kyy3).xO(kyz2.FileName);
                    this.c(kyy3);
                    kyy2 = kyy3;
                } else {
                    kyy3 = new kyt(this);
                    ((kyt)kyy3).setPortNumber(kyz2.qmV);
                    this.c(kyy3);
                    kyy2 = kyy3;
                }
                if (!kyz2.qnt) continue;
                kyy2.ejW();
                if (kyz2.qnp) {
                    this.qmp.a(kyy2.ejX().ejO());
                    kyy2.xW(true);
                    continue;
                }
                this.qmp.b(kyy2.ejX().ejO());
                kyy2.xW(false);
            }
        }
    }

    private void ejh() {
        String string = System.getProperty("user.dir") + "/" + kyj.qjz;
        kym kym2 = new kym();
        this.qmm = kym2.xJ(string);
    }

    private void eji() {
        Object object;
        Object object2;
        this.qmm.qjp = this.qmH.isSelected();
        this.qmm.qjq = this.qmI.isSelected();
        this.qmm.qjr = this.qmJ.isSelected();
        this.qmm.qjs = this.qmK.isSelected();
        if (this.qmt.isEmpty()) {
            this.qmm.qjy = null;
        } else {
            object2 = new kyz[this.qmt.size()];
            object = null;
            for (int i2 = 0; i2 < ((kyz[])object2).length; ++i2) {
                kyy kyy2;
                object = (kyy)this.qmt.get(i2);
                object2[i2] = new kyz();
                if (object instanceof kys) {
                    kyy2 = (kys)object;
                    object2[i2].qns = true;
                    ((kyz)object2[i2]).pnB = ((kys)kyy2).ejs();
                    ((kyz)object2[i2]).FileName = ((kys)kyy2).ejt();
                } else {
                    kyy2 = (kyt)object;
                    object2[i2].qns = false;
                    ((kyz)object2[i2]).qmV = ((kyt)kyy2).getPortNumber();
                }
                if (object == null || ((kyy)object).ejX() == null) continue;
                ((kyz)object2[i2]).qnt = true;
                ((kyz)object2[i2]).qnp = ((kyy)object).ejP();
            }
            this.qmm.qjy = object2;
        }
        object2 = new kym();
        object = System.getProperty("user.dir") + "/" + kyj.qjz;
        String string = System.getProperty("user.dir") + "/" + kyj.qjA;
        ((kym)object2).ak((String)object, string);
        ((kym)object2).a((String)object, this.qmm);
    }

    private void xT(boolean bl) {
        if (bl) {
            this.qmm.qje.lnR = this.getLocation().x;
            this.qmm.qje.lnS = this.getLocation().y;
            this.qmm.qje.pgs = this.getSize().height;
            this.qmm.qje.pgr = this.getSize().width;
        } else {
            this.qmm.qjd.lnR = this.getLocation().x;
            this.qmm.qjd.lnS = this.getLocation().y;
            this.qmm.qjd.pgs = this.getSize().height;
            this.qmm.qjd.pgr = this.getSize().width;
        }
    }

    private void ejj() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFLogViewer version 2\n\n");
        stringBuilder.append("Author:  Lars Erik Liljeb\u00e4ck\n\n");
        JOptionPane.showMessageDialog(this, stringBuilder.toString(), "About SFLogViewer", -1, null);
    }

    private void ejk() {
        if (this.qmn == null) {
            this.qmn = new kyl(this, this.qmm.qjx);
            this.qmn.setLocation(40, 40);
        }
        this.qmn.setVisible(true);
    }

    private void ejl() {
        kyy kyy2 = this.ejq();
        if (kyy2 == null) {
            return;
        }
        if (this.qmo == null) {
            this.qmo = new kyn(this);
            this.qmo.setTitle("Search Dialog for: " + kyy2.cgO());
            this.qmo.setLocation(40, 40);
        }
        if (this.qmo.isVisible()) {
            return;
        }
        this.qmo.a(kyy2);
    }

    private void ejm() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Alt + F       - Create LogfileViewSession\n");
        stringBuilder.append("Alt + L       - Create LoggerViewSession\n");
        stringBuilder.append("Ctrl + F4     - Close current ViewSession\n");
        stringBuilder.append("Ctrl + F5     - Refresh current LogfileViewSession\n");
        stringBuilder.append("Ctrl + F5     - Create socket for current LoggerViewSession\n");
        stringBuilder.append("Ctrl + D      - Open Directory\n");
        stringBuilder.append("Ctrl + E      - Edit Filters\n");
        stringBuilder.append("Ctrl + F      - Show search dialog\n");
        stringBuilder.append("Ctrl + O      - Open Logfile\n");
        stringBuilder.append("Ctrl + S      - Show SplitView\n");
        stringBuilder.append("Ctrl + T      - Show TabView\n");
        stringBuilder.append("Ctrl + Tab - Select next ViewSession\n");
        JOptionPane.showMessageDialog(this, stringBuilder.toString(), "Keyboard Shortcuts", -1, null);
    }

    private void xU(boolean bl) {
        if (bl) {
            this.xT(true);
            this.setSize(new Dimension(this.qmm.qjd.pgr, this.qmm.qjd.pgs));
            this.setLocation(new Point(this.qmm.qjd.lnR, this.qmm.qjd.lnS));
            this.validate();
            this.qmq.show(this.qmr, "TabView");
            kyy kyy2 = this.ejq();
            if (kyy2 != null) {
                if (kyy2 instanceof kys) {
                    this.qmw.setEnabled(true);
                    this.qmx.setEnabled(false);
                } else {
                    this.qmw.setEnabled(false);
                    this.qmx.setEnabled(true);
                }
            }
        } else {
            this.xT(false);
            this.setSize(new Dimension(this.qmm.qje.pgr, this.qmm.qje.pgs));
            this.setLocation(new Point(this.qmm.qje.lnR, this.qmm.qje.lnS));
            this.validate();
            this.qmq.show(this.qmr, "SplitView");
            this.qmw.setEnabled(false);
            this.qmx.setEnabled(false);
        }
        this.qmB.setEnabled(!bl);
        this.qmC.setEnabled(bl);
        this.qmD.setEnabled(bl);
        this.qmE.setEnabled(bl);
        this.qmF.setEnabled(!bl);
        this.qmG.setEnabled(!bl);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        if (actionEvent.getActionCommand().equals("Keyboard Shortcuts")) {
            this.ejm();
        } else if (actionEvent.getActionCommand().equals("About SFLogViewer")) {
            this.ejj();
        } else if (actionEvent.getActionCommand().equals("Show TabView")) {
            this.xU(true);
        } else if (actionEvent.getActionCommand().equals("Show SplitView")) {
            this.xU(false);
        } else if (actionEvent.getActionCommand().equals("Select ViewPaneA")) {
            object = this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(SELECT_VIEWPANEA) Current ViewSession is null.");
                return;
            }
            if (((kyy)object).ejX() == null) {
                ((kyy)object).ejW();
                this.qmp.a(((kyy)object).ejX().ejO());
                ((kyy)object).xW(true);
            }
        } else if (actionEvent.getActionCommand().equals("Select ViewPaneB")) {
            object = this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(SELECT_VIEWPANEB) Current ViewSession is null.");
                return;
            }
            if (((kyy)object).ejX() == null) {
                ((kyy)object).ejW();
                this.qmp.b(((kyy)object).ejX().ejO());
                ((kyy)object).xW(false);
            }
        } else if (actionEvent.getActionCommand().equals("Set Horizontal Split")) {
            this.qmp.xV(true);
        } else if (actionEvent.getActionCommand().equals("Set Vertical Split")) {
            this.qmp.xV(false);
        } else if (actionEvent.getActionCommand().equals("Remove SplitViewPanes")) {
            this.ejr();
        } else if (actionEvent.getActionCommand().equals("Open Logfile...")) {
            object = (kys)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(OPEN_LOGFILE) Current ViewSession is null.");
                return;
            }
            ((kys)object).ejw();
        } else if (actionEvent.getActionCommand().equals("Open Directory...")) {
            object = (kys)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(OPEN_DIRECTORY) Current ViewSession is null.");
                return;
            }
            ((kys)object).ejv();
        } else if (actionEvent.getActionCommand().equals("Refresh Logfile")) {
            object = (kys)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(REFRESH_LOGFILE) Current ViewSession is null.");
                return;
            }
            ((kys)object).ejx();
        } else if (actionEvent.getActionCommand().equals("Add Directory")) {
            object = (kys)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(ADD_DIRECTORY) Current ViewSession is null.");
                return;
            }
            String string = ((kys)object).ejs();
            if (string == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(ADD_DIRECTORY) Directory is null.");
                return;
            }
            this.qmm.xD(string);
        } else if (actionEvent.getActionCommand().equals("Remove Directory")) {
            object = (kys)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(REMOVE_DIRECTORY) Current ViewSession is null.");
                return;
            }
            String string = ((kys)object).ejs();
            if (string == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(REMOVE_DIRECTORY) Directory is null.");
                return;
            }
            this.qmm.xE(string);
        } else if (actionEvent.getActionCommand().equals("Save Logfile...")) {
            object = (kys)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(SAVE_LOGFILE) Current ViewSession is null.");
                return;
            }
            ((kys)object).ejy();
        } else if (actionEvent.getActionCommand().equals("Select PortNumber")) {
            object = (kyt)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(SELECT_PORTNUMBER) Current ViewSession is null.");
                return;
            }
            ((kyt)object).ejF();
        } else if (actionEvent.getActionCommand().equals("Select Reserved PortNumber")) {
            object = (kyt)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(SELECT_RESERVED_PORTNUMBER) Current ViewSession is null.");
                return;
            }
            ((kyt)object).ejG();
        } else if (actionEvent.getActionCommand().equals("Create Socket")) {
            object = (kyt)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(CREATE_SOCKET) Current ViewSession is null.");
                return;
            }
            ((kyt)object).ejB();
            this.ejn();
        } else if (actionEvent.getActionCommand().equals("Log Separator")) {
            object = (kyt)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(LOG_SEPARATOR) Current ViewSession is null.");
                return;
            }
            ((kyt)object).ejC();
        } else if (actionEvent.getActionCommand().equals("Save Log...")) {
            object = (kyt)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(SAVE_LOG) Current ViewSession is null.");
                return;
            }
            ((kyt)object).ejE();
        } else if (actionEvent.getActionCommand().equals("Clear View")) {
            object = (kyt)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(CLEAR_VIEW) Current ViewSession is null.");
                return;
            }
            ((kyy)object).ejU();
        } else if (actionEvent.getActionCommand().equals("Remove Socket")) {
            object = (kyt)this.ejq();
            if (object == null) {
                lfn.b(3, "SFLogViewer", "actionPerformed(REMOVE_SOCKET) Current ViewSession is null.");
                return;
            }
            ((kyt)object).ejD();
            this.ejn();
        } else if (actionEvent.getActionCommand().equals("Set SleepLength")) {
            assert (this.qml != null);
            object = JOptionPane.showInputDialog(this, "Set SleepLength", new Long(this.qmm.qju));
            if (object == null) {
                return;
            }
            long l2 = Long.parseLong((String)object);
            if (l2 < 100L) {
                lfn.b(5, "SFLogViewer", "actionPerformed() New SleepLength is invalid. Must be >= 100");
                return;
            }
            this.qmm.qju = l2;
            if (this.qml != null) {
                this.qml.av(l2);
            }
        } else if (actionEvent.getActionCommand().equals("Set Max SleepCount")) {
            object = JOptionPane.showInputDialog(this, "Set Max SleepCount", new Long(this.qmm.qjv));
            if (object == null) {
                return;
            }
            int n = Integer.parseInt((String)object);
            if (n <= 0) {
                lfn.b(5, "SFLogViewer", "actionPerformed() New MaxSleepCount is invalid. Must be > 0");
                return;
            }
            this.qmm.qjv = n;
            if (this.qml != null) {
                this.qml.abl(n);
            }
        }
        if (actionEvent.getActionCommand().equals("Create Logfile ViewSession")) {
            this.ejo();
        } else if (actionEvent.getActionCommand().equals("Create Logger ViewSession")) {
            this.ejp();
        } else if (actionEvent.getActionCommand().equals("Close ViewSession")) {
            object = this.ejq();
            if (object == null) {
                lfn.b(5, "SFLogViewer", "actionPerformed() Current ViewSession is null.");
                return;
            }
            this.d((kyy)object);
        } else if (actionEvent.getActionCommand().equals("Edit Filters...")) {
            this.ejk();
        } else if (actionEvent.getActionCommand().equals("Search...")) {
            this.ejl();
        } else if (actionEvent.getActionCommand().equals("Debug")) {
            this.qmm.qjt = 0;
        } else if (actionEvent.getActionCommand().equals("Verbose")) {
            this.qmm.qjt = 1;
        } else if (actionEvent.getActionCommand().equals("Info")) {
            this.qmm.qjt = 2;
        } else if (actionEvent.getActionCommand().equals("Notice")) {
            this.qmm.qjt = 3;
        } else if (actionEvent.getActionCommand().equals("Warning")) {
            this.qmm.qjt = 4;
        } else if (actionEvent.getActionCommand().equals("Error")) {
            this.qmm.qjt = 5;
        } else if (actionEvent.getActionCommand().equals("Fatal")) {
            this.qmm.qjt = 6;
        }
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)itemEvent.getItem();
        String string = jCheckBoxMenuItem.getActionCommand();
        if (string.equals("Autoscroll")) {
            this.qmm.qjp = jCheckBoxMenuItem.isSelected();
        } else if (string.equals("Show LineNumbers")) {
            this.qmm.qjq = jCheckBoxMenuItem.isSelected();
        } else if (string.equals("Show Time")) {
            this.qmm.qjr = jCheckBoxMenuItem.isSelected();
        } else if (string.equals("Show ExtraTime")) {
            this.qmm.qjs = jCheckBoxMenuItem.isSelected();
        } else {
            System.out.println("ERROR: SFLogViewer: itemStateChanged() Invalid ActionCommand provided: '" + string + "'");
        }
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.ejn();
    }

    private void ejn() {
        kyy kyy2 = this.ejq();
        if (kyy2 instanceof kys) {
            this.qmw.setEnabled(true);
            this.qmx.setEnabled(false);
            this.qmy.setEnabled(true);
            this.qmI.setEnabled(true);
            this.qmJ.setEnabled(true);
            this.qmK.setEnabled(true);
        } else if (kyy2 instanceof kyt) {
            this.qmw.setEnabled(false);
            this.qmx.setEnabled(true);
            this.qmy.setEnabled(true);
            boolean bl = ((kyt)kyy2).ejA();
            this.qmz.setEnabled(!bl);
            this.qmA.setEnabled(bl);
            this.qmI.setEnabled(true);
            this.qmJ.setEnabled(true);
            this.qmK.setEnabled(true);
        } else {
            this.qmw.setEnabled(false);
            this.qmx.setEnabled(false);
            this.qmy.setEnabled(false);
            this.qmI.setEnabled(false);
            this.qmJ.setEnabled(false);
            this.qmK.setEnabled(false);
        }
    }

    private void c(kyy kyy2) {
        assert (kyy2 != null);
        this.qmt.add(kyy2);
        if (kyy2 instanceof kys) {
            this.qms.add("Logfile", kyy2.ejO());
        } else if (kyy2 instanceof kyt) {
            this.qms.add("Logger", kyy2.ejO());
            this.qmu.add(kyy2);
            if (this.qml == null) {
                this.qml = new kyq(this);
                this.qml.av(this.qmm.qju);
                this.qml.abl(this.qmm.qjv);
                this.qml.start();
            }
        } else {
            lfn.b(5, "SFLogViewer", "getCurrentViewSession() Invalid viewsession provided: " + kyy2.getClass().getName());
            return;
        }
        this.qms.setSelectedComponent(kyy2.ejO());
        this.b(kyy2);
    }

    private void ejo() {
        kys kys2 = new kys(this);
        kys2.xN(kyj.qjB);
        kys2.xO(kyj.qjC);
        this.c(kys2);
    }

    private void ejp() {
        kyt kyt2 = new kyt(this);
        kyt2.setPortNumber(10000);
        this.c(kyt2);
    }

    private kyy ejq() {
        if (this.qmt.isEmpty()) {
            return null;
        }
        kyx kyx2 = (kyx)this.qms.getSelectedComponent();
        return kyx2.ejH();
    }

    private void ejr() {
        kyy kyy22 = null;
        for (kyy kyy22 : this.qmt) {
            if (kyy22.ejX() == null) continue;
            if (kyy22.ejP()) {
                this.qmp.a(null);
                kyy22.ejY();
                kyy22.xW(true);
                continue;
            }
            this.qmp.b(null);
            kyy22.ejY();
            kyy22.xW(true);
        }
    }

    private void d(kyy kyy2) {
        assert (kyy2 != null);
        this.qmt.remove(kyy2);
        this.qms.remove(kyy2.ejO());
        if (kyy2 instanceof kyt) {
            this.qmu.remove(kyy2);
            if (this.qmu.isEmpty()) {
                this.qml.xR(false);
            }
        }
        this.ejn();
    }

    public static void main(String[] stringArray) {
        new kyr();
    }

    static /* synthetic */ kyq a(kyr kyr2) {
        return kyr2.qml;
    }

    static /* synthetic */ JMenuItem b(kyr kyr2) {
        return kyr2.qmB;
    }

    static /* synthetic */ void a(kyr kyr2, boolean bl) {
        kyr2.xT(bl);
    }

    static /* synthetic */ void c(kyr kyr2) {
        kyr2.eji();
    }

    static /* synthetic */ kyp d(kyr kyr2) {
        return kyr2.qmk;
    }

    static /* synthetic */ void a(kyr kyr2, KeyEvent keyEvent) {
        kyr2.processKeyEvent(keyEvent);
    }

    static /* synthetic */ void b(kyr kyr2, KeyEvent keyEvent) {
        kyr2.b(keyEvent);
    }

    static /* synthetic */ void c(kyr kyr2, KeyEvent keyEvent) {
        kyr2.c(keyEvent);
    }
}

