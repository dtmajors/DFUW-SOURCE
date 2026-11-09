/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.basic.BasicFileChooserUI;
import sun.awt.shell.ShellFolder;
import sun.swing.FilePane;

public class mpd
extends BasicFileChooserUI {
    private FilePane DUx;
    private JToggleButton DUy;
    private JToggleButton DUz;
    private boolean DUA;
    private JPanel DUB = new JPanel(new BorderLayout(11, 0));
    private JPanel DUC = new JPanel();
    private static final Dimension DUD = new Dimension(5, 1);
    private static final Insets DUE = new Insets(0, 0, 0, 0);
    private JLabel DUF = new JLabel("Name :");
    private JTextField DUG = new JTextField("");
    private JPanel DUH = new JPanel(new GridLayout(1, 0, 2, 2));
    private JButton DUI = new JButton("New");
    private JButton DUJ = new JButton("Rename");
    private JButton DUK = new JButton("Copy");
    private JButton DUL = new JButton("Delete");
    private JButton bzN = new JButton("Save");
    private JButton DUM = new JButton("Show Resource Tree");
    private String oFS = "Default Title";
    private TitledBorder DUN = BorderFactory.createTitledBorder(this.oFS);

    public mpd(JFileChooser jFileChooser) {
        super(jFileChooser);
    }

    @Override
    public void installComponents(JFileChooser jFileChooser) {
        FileSystemView fileSystemView = jFileChooser.getFileSystemView();
        jFileChooser.setBorder(new TitledBorder(""));
        jFileChooser.setOpaque(false);
        jFileChooser.setLayout(new BorderLayout(0, 11));
        this.DUx = new FilePane(new a(this, null));
        jFileChooser.addPropertyChangeListener(this.DUx);
        this.eIi();
        this.DUC.setLayout(new BoxLayout(this.DUC, 2));
        this.DUB.add((Component)this.DUC, "After");
        this.DUB.setPreferredSize(new Dimension(200, 20));
        jFileChooser.add((Component)this.DUB, "North");
        this.DUF.setPreferredSize(new Dimension(35, 30));
        this.DUB.add((Component)this.DUF, "West");
        this.DUG.setEditable(false);
        this.DUG.setOpaque(true);
        this.DUG.setBackground(Color.WHITE);
        this.DUG.setCursor(new Cursor(0));
        this.DUB.add((Component)this.DUG, "Center");
        JButton jButton = new JButton(this.getChangeToParentDirectoryAction());
        jButton.setText(null);
        jButton.setIcon(this.upFolderIcon);
        jButton.setAlignmentX(0.0f);
        jButton.setAlignmentY(0.5f);
        jButton.setMargin(DUE);
        this.DUC.add(jButton);
        this.DUC.add(Box.createRigidArea(DUD));
        File file = fileSystemView.getHomeDirectory();
        JButton jButton2 = new JButton(this.homeFolderIcon);
        jButton2.setAlignmentX(0.0f);
        jButton2.setAlignmentY(0.5f);
        jButton2.setMargin(DUE);
        jButton2.addActionListener(this.getGoHomeAction());
        this.DUC.add(jButton2);
        this.DUC.add(Box.createRigidArea(DUD));
        if (!UIManager.getBoolean("FileChooser.readOnly")) {
            jButton2 = new JButton(this.DUx.getNewFolderAction());
            jButton2.setText(null);
            jButton2.setIcon(this.newFolderIcon);
            jButton2.setAlignmentX(0.0f);
            jButton2.setAlignmentY(0.5f);
            jButton2.setMargin(DUE);
        }
        this.DUC.add(jButton2);
        this.DUC.add(Box.createRigidArea(DUD));
        ButtonGroup buttonGroup = new ButtonGroup();
        this.DUy = new JToggleButton(this.listViewIcon);
        this.DUy.setSelected(true);
        this.DUy.setAlignmentX(0.0f);
        this.DUy.setAlignmentY(0.5f);
        this.DUy.setMargin(DUE);
        this.DUy.addActionListener(this.DUx.getViewTypeAction(0));
        this.DUC.add(this.DUy);
        buttonGroup.add(this.DUy);
        this.DUz = new JToggleButton(this.detailsViewIcon);
        this.DUz.setAlignmentX(0.0f);
        this.DUz.setAlignmentY(0.5f);
        this.DUz.setMargin(DUE);
        this.DUz.addActionListener(this.DUx.getViewTypeAction(1));
        this.DUC.add(this.DUz);
        buttonGroup.add(this.DUz);
        this.DUx.addPropertyChangeListener(new PropertyChangeListener(this){
            final /* synthetic */ mpd DUO;
            {
                this.DUO = mpd2;
            }

            public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
                if ("viewType".equals(propertyChangeEvent.getPropertyName())) {
                    int n = mpd.c(this.DUO).getViewType();
                    switch (n) {
                        case 0: {
                            mpd.d(this.DUO).setSelected(true);
                            break;
                        }
                        case 1: {
                            mpd.e(this.DUO).setSelected(true);
                        }
                    }
                }
            }
        });
        jFileChooser.add((Component)this.getAccessoryPanel(), "After");
        JComponent jComponent = jFileChooser.getAccessory();
        if (jComponent != null) {
            this.getAccessoryPanel().add(jComponent);
        }
        jFileChooser.add((Component)this.DUx, "Center");
        this.DUx.setBorder(this.DUN);
        this.DUH.add(this.DUI);
        this.DUI.setMargin(new Insets(0, 0, 0, 0));
        this.DUI.setName("newButton");
        this.DUH.add(this.DUJ);
        this.DUJ.setMargin(new Insets(0, 0, 0, 0));
        this.DUJ.setName("renameButton");
        this.DUH.add(this.DUK);
        this.DUK.setMargin(new Insets(0, 0, 0, 0));
        this.DUK.setName("copyButton");
        this.DUH.add(this.DUL);
        this.DUL.setMargin(new Insets(0, 0, 0, 0));
        this.DUL.setName("deleteButton");
        this.DUH.add(this.bzN);
        this.bzN.setMargin(new Insets(0, 0, 0, 0));
        this.bzN.setName("saveButton");
        this.DUH.add(this.DUM);
        this.DUM.setMargin(new Insets(0, 0, 0, 0));
        this.DUM.setName("resourceButton");
        this.DUH.setPreferredSize(new Dimension(200, 40));
        this.DUH.setBorder(BorderFactory.createTitledBorder(""));
        jFileChooser.add((Component)this.DUH, "South");
        if (jFileChooser.isMultiSelectionEnabled()) {
            this.setFileName(this.b(jFileChooser.getSelectedFiles()));
        } else {
            this.setFileName(this.f(jFileChooser.getSelectedFile()));
        }
    }

    private void eIi() {
        JFileChooser jFileChooser = this.getFileChooser();
        Boolean bl = (Boolean)jFileChooser.getClientProperty("FileChooser.useShellFolder");
        if (bl != null) {
            this.DUA = bl;
        } else {
            File[] fileArray;
            this.DUA = false;
            File[] fileArray2 = jFileChooser.getFileSystemView().getRoots();
            if (fileArray2 != null && fileArray2.length == 1 && (fileArray = (File[])ShellFolder.get("fileChooserComboBoxFolders")) != null && fileArray.length > 0 && fileArray2[0] == fileArray[0]) {
                this.DUA = true;
            }
        }
    }

    protected JPanel createList(JFileChooser jFileChooser) {
        return this.DUx.createList();
    }

    protected JPanel createDetailsView(JFileChooser jFileChooser) {
        return this.DUx.createDetailsView();
    }

    @Override
    public ListSelectionListener createListSelectionListener(JFileChooser jFileChooser) {
        return super.createListSelectionListener(jFileChooser);
    }

    private String f(File file) {
        if (file == null) {
            return null;
        }
        JFileChooser jFileChooser = this.getFileChooser();
        if (jFileChooser.isDirectorySelectionEnabled() && !jFileChooser.isFileSelectionEnabled()) {
            return file.getPath();
        }
        return file.getName();
    }

    private String b(File[] fileArray) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; fileArray != null && i < fileArray.length; ++i) {
            if (i > 0) {
                stringBuffer.append(" ");
            }
            if (fileArray.length > 1) {
                stringBuffer.append("\"");
            }
            stringBuffer.append(this.f(fileArray[i]));
            if (fileArray.length <= 1) continue;
            stringBuffer.append("\"");
        }
        return stringBuffer.toString();
    }

    private void doSelectedFileChanged(PropertyChangeEvent propertyChangeEvent) {
        File file = (File)propertyChangeEvent.getNewValue();
        JFileChooser jFileChooser = this.getFileChooser();
        if (file != null && (jFileChooser.isFileSelectionEnabled() && !file.isDirectory() || file.isDirectory() && jFileChooser.isDirectorySelectionEnabled())) {
            this.setFileName(this.f(file));
        } else {
            this.setFileName(null);
        }
    }

    private void doSelectedFilesChanged(PropertyChangeEvent propertyChangeEvent) {
        File[] fileArray = (jrw[])propertyChangeEvent.getNewValue();
        JFileChooser jFileChooser = this.getFileChooser();
        if (fileArray != null && fileArray.length > 0 && (fileArray.length > 1 || jFileChooser.isDirectorySelectionEnabled() || !fileArray[0].isDirectory())) {
            this.setFileName(this.b(fileArray));
        }
    }

    private void doDirectoryChanged(PropertyChangeEvent propertyChangeEvent) {
    }

    private void a(PropertyChangeEvent propertyChangeEvent) {
        this.clearIconCache();
    }

    private void doFileSelectionModeChanged(PropertyChangeEvent propertyChangeEvent) {
        this.clearIconCache();
        JFileChooser jFileChooser = this.getFileChooser();
        if (jFileChooser != null) {
            File file = jFileChooser.getCurrentDirectory();
            if (file != null && jFileChooser.isDirectorySelectionEnabled() && !jFileChooser.isFileSelectionEnabled() && jFileChooser.getFileSystemView().isFileSystem(file)) {
                this.setFileName(file.getPath());
            } else {
                this.setFileName(null);
            }
        }
    }

    @Override
    public PropertyChangeListener createPropertyChangeListener(JFileChooser jFileChooser) {
        return new PropertyChangeListener(this){
            final /* synthetic */ mpd DUO;
            {
                this.DUO = mpd2;
            }

            public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
                String string = propertyChangeEvent.getPropertyName();
                if (string.equals("SelectedFileChangedProperty")) {
                    mpd.a(this.DUO, propertyChangeEvent);
                } else if (string.equals("SelectedFilesChangedProperty")) {
                    mpd.b(this.DUO, propertyChangeEvent);
                } else if (string.equals("directoryChanged")) {
                    mpd.c(this.DUO, propertyChangeEvent);
                } else if (string.equals("fileFilterChanged")) {
                    mpd.d(this.DUO, propertyChangeEvent);
                } else if (string.equals("fileSelectionChanged")) {
                    mpd.e(this.DUO, propertyChangeEvent);
                } else if (string == "FileChooser.useShellFolder") {
                    mpd.f(this.DUO);
                    mpd.c(this.DUO, propertyChangeEvent);
                }
            }
        };
    }

    @Override
    public void rescanCurrentDirectory(JFileChooser jFileChooser) {
        this.DUx.rescanCurrentDirectory();
    }

    @Override
    public void setFileName(String string) {
        if (string != null) {
            this.DUG.setText(string);
        } else {
            this.DUG.setText("");
        }
    }

    @Override
    protected void setDirectorySelected(boolean bl) {
        super.setDirectorySelected(bl);
        JFileChooser jFileChooser = this.getFileChooser();
    }

    public JButton eIj() {
        return this.DUL;
    }

    public JButton eIk() {
        return this.DUJ;
    }

    public JButton eIl() {
        return this.DUK;
    }

    public JButton eIm() {
        return this.DUI;
    }

    public JButton eIn() {
        return this.bzN;
    }

    public JTextField eIo() {
        return this.DUG;
    }

    public void zH(boolean bl) {
        this.DUH.setVisible(bl);
    }

    public void zI(boolean bl) {
        this.DUB.setVisible(bl);
    }

    public void CI(String string) {
        this.DUN.setTitle(string);
    }

    public String eIp() {
        return this.DUN.getTitle();
    }

    public void zJ(boolean bl) {
        if (!bl) {
            this.DUH.remove(this.DUM);
        }
    }

    public void e(ActionListener actionListener) {
        this.DUM.addActionListener(actionListener);
    }

    public void zK(boolean bl) {
        this.DUI.setVisible(false);
        this.DUH.remove(this.DUI);
    }

    public void zL(boolean bl) {
        this.DUC.setVisible(bl);
    }

    public void f(ActionListener actionListener) {
        this.bzN.addActionListener(actionListener);
    }

    public void g(ActionListener actionListener) {
        this.DUI.addActionListener(actionListener);
    }

    static /* synthetic */ boolean a(mpd mpd2) {
        return mpd2.isDirectorySelected();
    }

    static /* synthetic */ File b(mpd mpd2) {
        return mpd2.getDirectory();
    }

    static /* synthetic */ FilePane c(mpd mpd2) {
        return mpd2.DUx;
    }

    static /* synthetic */ JToggleButton d(mpd mpd2) {
        return mpd2.DUy;
    }

    static /* synthetic */ JToggleButton e(mpd mpd2) {
        return mpd2.DUz;
    }

    static /* synthetic */ void a(mpd mpd2, PropertyChangeEvent propertyChangeEvent) {
        mpd2.doSelectedFileChanged(propertyChangeEvent);
    }

    static /* synthetic */ void b(mpd mpd2, PropertyChangeEvent propertyChangeEvent) {
        mpd2.doSelectedFilesChanged(propertyChangeEvent);
    }

    static /* synthetic */ void c(mpd mpd2, PropertyChangeEvent propertyChangeEvent) {
        mpd2.doDirectoryChanged(propertyChangeEvent);
    }

    static /* synthetic */ void d(mpd mpd2, PropertyChangeEvent propertyChangeEvent) {
        mpd2.a(propertyChangeEvent);
    }

    static /* synthetic */ void e(mpd mpd2, PropertyChangeEvent propertyChangeEvent) {
        mpd2.doFileSelectionModeChanged(propertyChangeEvent);
    }

    static /* synthetic */ void f(mpd mpd2) {
        mpd2.eIi();
    }
}

