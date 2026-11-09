/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.plaf.ComponentUI;
import sun.swing.FilePane;

public class mkb
extends JFileChooser
implements ActionListener {
    jru DEA = new jru();
    jrw DEB = null;
    private aux DEC = null;
    private mke DED = null;
    private jtd nVI = new jtd();
    private String DEE = null;
    private boolean DEF = true;
    private mkc DEG;
    private e DEH = null;
    private JComboBox DEI = null;
    private static Map<String, TreeMap<String, File>> DEJ = lcn.emw();
    private List<String> DDG = lcn.emv();
    private b DEK = null;
    List<String> DEL = lcn.emv();
    private static Map<String, ImageIcon> DEM = lcn.emw();
    private static Font DEN = new Font("Tahoma", 0, 11);
    private int Size = 96;

    public List<String> eCV() {
        return this.DDG;
    }

    public void cn(List<String> list) {
        this.DDG = list;
    }

    public int eCW() {
        return this.DEI.getSelectedIndex();
    }

    public void aeE(int n) {
        this.DEI.setSelectedIndex(n);
    }

    private static <T> Component a(Container container, Class<T> clazz) {
        for (int i = 0; i < container.getComponentCount(); ++i) {
            Component component;
            Component component2 = container.getComponent(i);
            if (component2.getClass() == clazz) {
                return component2;
            }
            if (!(component2 instanceof Container) || (component = mkb.a((Container)component2, clazz)) == null) continue;
            return component;
        }
        return null;
    }

    public mkb(String string, boolean bl) {
        this(string, bl, 5);
    }

    @Override
    public void updateUI() {
        super.updateUI();
        this.eCX();
    }

    public mkb(String string, boolean bl, int n) {
        super(string);
        this.DEF = bl;
        if (this.DEF) {
            this.DEK = new b(this, this, n);
            this.setAccessory(this.DEK);
        }
        this.setDragEnabled(true);
        this.setFileSelectionMode(2);
        this.DED = new mke(this);
        this.DEH = new e(this);
        if (n != 5) {
            this.setFileView(this.DEH);
        }
        this.eCZ();
        this.eCX();
    }

    private void eCX() {
        FilePane filePane = (FilePane)mkb.a((Container)this, FilePane.class);
        JScrollPane jScrollPane = (JScrollPane)mkb.a(filePane, JScrollPane.class);
        Component component = jScrollPane.getViewport().getView();
        component.addKeyListener(new KeyListener(this){
            final /* synthetic */ mkb DEO;
            {
                this.DEO = mkb2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 127) {
                    jrw[] jrwArray = this.DEO.eDe();
                    int n = 0;
                    for (jrw jrw2 : jrwArray) {
                        if (!jrw2.getName().toLowerCase().endsWith(".xlk")) continue;
                        jrw2.delete();
                        ++n;
                    }
                    if (n > 0) {
                        this.DEO.updateUI();
                    }
                }
            }

            public void keyReleased(KeyEvent keyEvent) {
            }

            public void keyTyped(KeyEvent keyEvent) {
            }
        });
        component.setDropTarget(new DropTarget(this, new DropTargetListener(this){
            final /* synthetic */ mkb DEO;
            {
                this.DEO = mkb2;
            }

            public void dragEnter(DropTargetDragEvent dropTargetDragEvent) {
            }

            public void dragExit(DropTargetEvent dropTargetEvent) {
            }

            public void dragOver(DropTargetDragEvent dropTargetDragEvent) {
            }

            public void drop(DropTargetDropEvent dropTargetDropEvent) {
                Transferable transferable = dropTargetDropEvent.getTransferable();
                try {
                    Object object = dropTargetDropEvent.getTransferable().getTransferData(DataFlavor.stringFlavor);
                    if (object != null && object instanceof String) {
                        String string = (String)object;
                        String[] stringArray = string.split("\n");
                        for (int i = 0; i < stringArray.length; ++i) {
                            String string2;
                            String string3 = stringArray[i];
                            File file = new File(string3);
                            String string4 = file.getName().toLowerCase();
                            if (!string4.contains(".xml")) {
                                return;
                            }
                            String string5 = file.getParent().toLowerCase();
                            if (string5.equals(string2 = this.DEO.eDd().toString().toLowerCase())) {
                                return;
                            }
                            string4 = string4.replace(".xml", ".xlk");
                            String string6 = this.DEO.eDd() + "\\" + string4;
                            jrw jrw2 = new jrw(string6);
                            jry.a(jrw2, string3);
                        }
                        this.DEO.updateUI();
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }

            public void dropActionChanged(DropTargetDragEvent dropTargetDragEvent) {
            }
        }));
    }

    public void eCY() {
        this.DEK.eCY();
    }

    private void eCZ() {
        FilePane filePane = (FilePane)mkb.a((Container)this, FilePane.class);
        JScrollPane jScrollPane = (JScrollPane)mkb.a(filePane, JScrollPane.class);
        Component component = jScrollPane.getViewport().getView();
        if (this.DEI != null && this.DEI.getSelectedIndex() != 5) {
            component.setForeground(Color.white);
        } else {
            component.setForeground(Color.black);
        }
    }

    private void Cg(String string) {
        TreeMap<String, File> treeMap = DEJ.get(this.eDd().getAbsolutePath());
        if (treeMap == null) {
            return;
        }
        for (File file : treeMap.values()) {
            if (!file.getName().toLowerCase().startsWith(string.toLowerCase())) continue;
            this.setSelectedFile(file);
            break;
        }
    }

    public mkb(String string) {
        this(string, true, 5);
    }

    public mkb(jrw jrw2) {
        super(jrw2);
    }

    public mkb() {
        this(null, false, 5);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    @Override
    protected void setUI(ComponentUI componentUI) {
        super.setUI(new d(this, this));
    }

    @Override
    public void approveSelection() {
        int n;
        jrw jrw2 = this.eDc();
        if (jrw2 == null) {
            return;
        }
        jrw2 = new jrw(this.Ch(jrw2.getAbsolutePath()));
        this.setSelectedFile(jrw2);
        if (jrw2.exists() && this.getDialogType() == 1 && (n = JOptionPane.showConfirmDialog(this, "Overwrite existing file?", "File save Dialog", 0)) == 1) {
            this.repaint();
            return;
        }
        mje.DBM = this.eDd();
        super.approveSelection();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Edit")) {
            lfn.b(0, this.getClass().getName(), "Edit file. Check if file is XML file");
            jrw jrw2 = this.eDc();
            String string = jry.tr(jrw2.getAbsolutePath());
            if (this.nVI.tP(string)) {
                mxm mxm2 = new mxm(jrw2);
                if (this.DEC != null) {
                    this.DEC.eCu().add(mxm2);
                    mxm2.setVisible(true);
                } else {
                    lfn.b(5, this.getClass().getName(), "ContentPane is null!");
                }
            }
        }
    }

    private String Ch(String string) {
        if (this.DEE != null) {
            int n = string.lastIndexOf(".");
            if (n != -1) {
                if (!string.substring(n).equalsIgnoreCase(this.DEE)) {
                    string = string + this.DEE;
                }
            } else {
                string = string + this.DEE;
            }
        }
        return string;
    }

    public String eDa() {
        return this.DEE;
    }

    public void Ci(String string) {
        this.DEE = string;
    }

    public boolean eDb() {
        return this.DEF;
    }

    public void zh(boolean bl) {
        this.DEF = bl;
    }

    public jrw eDc() {
        File file = super.getSelectedFile();
        if (file == null) {
            return null;
        }
        return new jrw(file.getAbsolutePath());
    }

    public jrw eDd() {
        File file = super.getCurrentDirectory();
        if (file == null) {
            return null;
        }
        return new jrw(file.getAbsolutePath());
    }

    public jrw[] eDe() {
        File[] fileArray = super.getSelectedFiles();
        jrw[] jrwArray = new jrw[fileArray.length];
        for (int i = 0; i < fileArray.length; ++i) {
            jrwArray[i] = new jrw(fileArray[i].getAbsolutePath());
        }
        return jrwArray;
    }

    public void a(mkc mkc2) {
        this.DEG = mkc2;
    }

    @Override
    public /* synthetic */ File getCurrentDirectory() {
        return this.eDd();
    }

    @Override
    public /* synthetic */ File[] getSelectedFiles() {
        return this.eDe();
    }

    @Override
    public /* synthetic */ File getSelectedFile() {
        return this.eDc();
    }

    static /* synthetic */ mkc a(mkb mkb2) {
        return mkb2.DEG;
    }

    static /* synthetic */ aux b(mkb mkb2) {
        return mkb2.DEC;
    }

    static /* synthetic */ mke c(mkb mkb2) {
        return mkb2.DED;
    }

    static /* synthetic */ JComboBox a(mkb mkb2, JComboBox jComboBox) {
        mkb2.DEI = jComboBox;
        return mkb2.DEI;
    }

    static /* synthetic */ int d(mkb mkb2) {
        return mkb2.Size;
    }

    static /* synthetic */ int a(mkb mkb2, int n) {
        mkb2.Size = n;
        return mkb2.Size;
    }

    static /* synthetic */ void e(mkb mkb2) {
        mkb2.eCZ();
    }

    static /* synthetic */ e f(mkb mkb2) {
        return mkb2.DEH;
    }

    static /* synthetic */ List g(mkb mkb2) {
        return mkb2.DDG;
    }

    static /* synthetic */ jtd h(mkb mkb2) {
        return mkb2.nVI;
    }

    static /* synthetic */ Map eDf() {
        return DEM;
    }

    static /* synthetic */ Font eDg() {
        return DEN;
    }
}

