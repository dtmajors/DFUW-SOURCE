/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.MemoryImageSource;
import java.io.File;
import java.io.FileInputStream;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class mqu
extends mkx
implements ActionListener,
KeyListener,
MouseListener,
ListSelectionListener {
    private JTextField DGK;
    private JTable EgH;
    private b EgI;
    private static Vector<File> EgJ = new Vector();
    private a EgK = new a(this, null);
    private static int EgL = 136;
    private static int EgM = 136;
    private aux DEC = null;
    private static jru DEA = new jru();
    private String BasePath = lcw.qLb;
    private Vector<String> EgN = new Vector();
    private JCheckBox EgO = null;

    public mqu(aux aux2) {
        super(false);
        this.DEC = aux2;
        this.setClosable(true);
        this.setTitle("Prop QuickFind");
        this.EgN.add("xml\\special");
        this.EgN.add("xml\\trading_routes");
        this.EgN.add("xml\\temp");
        this.EgN.add("xml\\_newxmlfiles");
        this.EgN.add("xml\\audio");
        this.EgN.add("xml\\creature");
        this.EgN.add("xml\\detailtexture");
        this.EgN.add("xml\\dropitems");
        this.EgN.add("xml\\gizmos");
        this.EgN.add("xml\\item");
        this.EgN.add("xml\\other");
        this.EgN.add("xml\\planets");
        this.EgN.add("xml\\shader");
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        this.EgO = new JCheckBox("Also Use Path");
        this.EgO.setSelected(true);
        this.DGK = new JTextField("");
        jPanel.add((Component)this.DGK, "Center");
        jPanel.add((Component)this.EgO, "East");
        this.DGa.add((Component)jPanel, "First");
        this.DGK.addActionListener(this);
        this.DGK.requestFocus();
        this.EgH = new JTable(this.EgK);
        JScrollPane jScrollPane = new JScrollPane(this.EgH);
        this.DGa.add((Component)jScrollPane, "Center");
        this.EgH.setSelectionMode(0);
        this.EgH.getSelectionModel().addListSelectionListener(this);
        this.EgH.getColumnModel().getSelectionModel().addListSelectionListener(this);
        this.EgI = new b(this, new Dimension(EgL, EgM));
        this.EgI.setBorder(BorderFactory.createBevelBorder(1));
        this.DGa.add((Component)this.EgI, "Last");
        this.setSize(new Dimension(400, 800));
        this.eJM();
        this.EgK.CR("");
        this.EgH.addMouseListener(this);
        this.EgH.getColumnModel().getColumn(0).setHeaderValue("Resource");
        this.EgH.getColumnModel().getColumn(1).setHeaderValue("Relative Path");
        this.addKeyListener(this);
        this.DGK.addKeyListener(this);
        this.EgH.addKeyListener(this);
    }

    public void focus() {
        this.DGK.requestFocus();
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        int n = this.EgH.getSelectedRow();
        if (n == -1 || n >= this.EgK.Edo.size()) {
            this.EgI.a(null);
            this.EgI.repaint();
            return;
        }
        int n2 = this.EgK.afj(n);
        File file = EgJ.get(n2);
        String string = file.getName();
        int n3 = string.lastIndexOf(".");
        if (n3 <= 0) {
            return;
        }
        String string2 = lcw.qLb + "worldbuilder/thumbnails/" + string.substring(0, n3);
        jrw jrw2 = new jrw(string2 + ".jpg");
        Image image = null;
        if (jrw2.exists()) {
            image = Toolkit.getDefaultToolkit().getImage(jrw2.getAbsolutePath());
        } else {
            jrw2 = new jrw(string2 + ".bmp");
            if (jrw2.exists()) {
                FileInputStream fileInputStream = null;
                try {
                    fileInputStream = new FileInputStream(jrw2);
                    DEA.read(fileInputStream);
                }
                catch (Exception exception) {
                    lfn.b(5, this.getClass().getName(), "File [" + jrw2 + "] not found!");
                    exception.printStackTrace();
                }
                MemoryImageSource memoryImageSource = DEA.dRP();
                if (memoryImageSource != null) {
                    image = Toolkit.getDefaultToolkit().createImage(memoryImageSource);
                } else {
                    lfn.b(5, this.getClass().getName(), "Invalid BMP Format: " + jrw2.toString());
                }
            }
        }
        if (image != null) {
            image = image.getScaledInstance(EgL, EgM, 2);
        }
        this.EgI.a(image);
        this.EgI.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.EgK.CR(actionEvent.getActionCommand());
        this.EgH.updateUI();
        this.valueChanged(null);
    }

    private void eJM() {
        if (EgJ.size() > 0) {
            return;
        }
        File file = new File(this.BasePath + "xml/");
        this.g(file);
        file = new File(this.BasePath + "xml-files/object/collection/");
        this.g(file);
        file = new File(this.BasePath + "xml-files/object/elevator/");
        this.g(file);
        file = new File(this.BasePath + "xml-files/object/animation/");
        this.g(file);
    }

    private void g(File file) {
        if (file.isDirectory()) {
            File[] fileArray;
            for (int i = 0; i < this.EgN.size(); ++i) {
                if (!file.getAbsolutePath().toLowerCase().endsWith(this.EgN.get(i))) continue;
                return;
            }
            for (File file2 : fileArray = file.listFiles()) {
                this.g(file2);
            }
        } else if (file.getName().toLowerCase().endsWith(".xml")) {
            EgJ.add(file);
        }
    }

    private void createObject() {
        int n;
        int n2 = this.EgH.getSelectedRow();
        if (n2 == -1 || n2 >= this.EgK.eJO()) {
            return;
        }
        File file = EgJ.get(this.EgK.afj(n2));
        jrw jrw2 = new jrw(file.getAbsolutePath());
        if (myz.an(jrw2) && (n = JOptionPane.showConfirmDialog((Component)this.DEC, "Are you sure you want to load this blacklisted file (" + jrw2.getName() + ")", "Blacklisted file", 0)) == 1) {
            return;
        }
        hac hac2 = (hac)this.DEC.d(4097);
        hac2.on(lcr.qAE);
        hac2.f(lcr.qzr);
        hac2.Lb(1);
        hac2.setFileName(jrw2.getAbsolutePath().toLowerCase());
        this.DEC.a((dxq)hac2);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            this.createObject();
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 32 && keyEvent.getSource() != this.DGK) {
            this.createObject();
            mje.DAv.L();
        }
        if (keyEvent.getKeyCode() == 27) {
            this.setVisible(false);
        }
        if (keyEvent.getKeyCode() == 70 && keyEvent.isControlDown()) {
            this.DGK.requestFocus();
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    static /* synthetic */ Vector eJN() {
        return EgJ;
    }

    static /* synthetic */ JCheckBox a(mqu mqu2) {
        return mqu2.EgO;
    }

    static /* synthetic */ String b(mqu mqu2) {
        return mqu2.BasePath;
    }
}

