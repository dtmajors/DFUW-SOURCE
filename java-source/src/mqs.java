/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 */
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.filechooser.FileFilter;

public class mqs
extends JInternalFrame
implements lgx {
    private JButton Egw;
    private JTextField Egx;
    private JButton DJG;
    private JButton Egy;
    private JTextField Egz;
    private JLabel I;
    private JLabel P;
    private JPanel aa;
    private aux DEC;
    private jxa EgA = new jxa();

    public mqs() {
        this.b();
    }

    private void b() {
        this.aa = new JPanel();
        this.Egz = new JTextField();
        this.Egy = new JButton();
        this.I = new JLabel();
        this.P = new JLabel();
        this.Egx = new JTextField();
        this.Egw = new JButton();
        this.DJG = new JButton();
        this.setClosable(true);
        this.setTitle("Quest Target Tool");
        this.Egz.setEditable(false);
        this.Egy.setText("..");
        this.Egy.setToolTipText("Choose the source file");
        this.Egy.addActionListener(new ActionListener(this){
            final /* synthetic */ mqs EgB;
            {
                this.EgB = mqs2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqs.a(this.EgB, actionEvent);
            }
        });
        this.I.setText("Source File:");
        this.P.setText("ResourceType:");
        this.Egw.setText("..");
        this.Egw.setToolTipText("Choose Resource Type");
        this.Egw.addActionListener(new ActionListener(this){
            final /* synthetic */ mqs EgB;
            {
                this.EgB = mqs2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqs.b(this.EgB, actionEvent);
            }
        });
        this.DJG.setText("Save As..");
        this.DJG.setToolTipText("Save as new Quest Target file");
        this.DJG.addActionListener(new ActionListener(this){
            final /* synthetic */ mqs EgB;
            {
                this.EgB = mqs2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqs.c(this.EgB, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout(this.aa);
        this.aa.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.I).addComponent(this.P).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.Egx, GroupLayout.Alignment.LEADING).addComponent(this.Egz, GroupLayout.Alignment.LEADING, -1, 332, Short.MAX_VALUE)).addGap(18, 18, 18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Egw).addComponent(this.Egy)))).addContainerGap(-1, Short.MAX_VALUE)).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(322, Short.MAX_VALUE).addComponent(this.DJG).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.I).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Egz, -2, -1, -2).addComponent(this.Egy)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.P).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Egx, -2, -1, -2).addComponent(this.Egw)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE).addComponent(this.DJG).addContainerGap()));
        GroupLayout groupLayout2 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.aa, -2, -1, -2).addContainerGap(-1, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.aa, -2, -1, -2).addContainerGap(15, Short.MAX_VALUE)));
        this.pack();
    }

    private void bq(ActionEvent actionEvent) {
        this.eJJ();
    }

    private void br(ActionEvent actionEvent) {
        this.eJL();
    }

    private void bs(ActionEvent actionEvent) {
        this.eJK();
    }

    private void eJJ() {
        Object object;
        jrw jrw2 = new jrw(this.Egz.getText());
        String string = this.Egx.getText();
        if (!jrw2.exists()) {
            JOptionPane.showMessageDialog(this, "Source file does not exist: " + jrw2.getAbsolutePath(), "Source file not found", 0);
            return;
        }
        if (!lea.enW().contains(string)) {
            JOptionPane.showMessageDialog(this, "Resource does not exist: " + jrw2.getAbsolutePath(), "Resource  name invalid", 0);
            return;
        }
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "xml-files/object/questtarget/");
            object = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            mkb2.setApproveButtonText("Save Quest target");
            mkb2.setSelectedFile(new jrw(jrw2.getName()));
            n = mkb2.showSaveDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        object = mkb2.eDc();
        if (object == null || n != 0) {
            return;
        }
        lfn.b(0, this.getClass().getSimpleName(), "saveFile() : SaveFile = " + object);
        jry.a((jrw)object, jrw2);
        this.EgA.e((jrw)object, string);
        jrw jrw3 = new jrw(lcw.qLb + "xml/prop/all/quest_targets/" + ((File)object).getName());
        jry.a(jrw3, (jrw)object);
        lfn.b(0, this.getClass().getSimpleName(), "saveFile() : DONE. SaveFile = " + object + ", ResourceName = " + string);
        JOptionPane.showMessageDialog(this, "New File saved. Remember to add & commit file:" + ((File)object).getAbsolutePath(), "New quest target created", 1);
    }

    private void eJK() {
        mqv mqv2 = new mqv((Frame)this.DEC, false, this);
        mqv2.zO(true);
        mqv2.setLocationRelativeTo(this);
        mqv2.setVisible(true);
    }

    private void eJL() {
        Object object;
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "xml/");
            object = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showOpenDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            return;
        }
        object = mkb2.eDc();
        if (object == null || n != 0) {
            lfn.b(0, this.getClass().getSimpleName(), "chooseSourceFile() : No File Selected.");
            return;
        }
        String string = this.EgA.v((jrw)object).toLowerCase();
        if (string == null) {
            JOptionPane.showMessageDialog(this, "Collision file is NULL. Choose another object.", "Error in Source File", 0);
            return;
        }
        this.Egz.setText(((File)object).getAbsolutePath());
    }

    @Override
    public void Ad(String string) {
        this.Egx.setText(string);
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ void a(mqs mqs2, ActionEvent actionEvent) {
        mqs2.br(actionEvent);
    }

    static /* synthetic */ void b(mqs mqs2, ActionEvent actionEvent) {
        mqs2.bs(actionEvent);
    }

    static /* synthetic */ void c(mqs mqs2, ActionEvent actionEvent) {
        mqs2.bq(actionEvent);
    }
}

