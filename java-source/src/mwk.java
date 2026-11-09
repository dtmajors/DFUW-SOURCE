/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 */
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class mwk
extends JDialog {
    private static final Cursor EPt = new Cursor(0);
    private static final Cursor EmW = new Cursor(3);
    protected JScrollPane EPu;
    protected JButton EPv;
    protected JButton Elw;
    protected JPanel EPw;
    protected JPanel EPx;
    protected JButton EPy;
    protected JList EPz;
    protected JScrollPane EPA;
    protected JTextArea EPB;
    protected JPanel EAS;
    protected JTextField EPC;
    protected JComboBox EPD;
    protected JCheckBox EPE;
    protected JPanel EPF;
    private Vector<String> EPG = new Vector();
    private aux DEC;
    private mwj EPH = new mwj();

    private void b() {
        this.EAS = new JPanel();
        this.EPu = new JScrollPane();
        this.EPB = new JTextArea();
        this.EPF = new JPanel();
        this.EPE = new JCheckBox();
        this.EPD = new JComboBox();
        this.EPC = new JTextField();
        this.EPw = new JPanel();
        this.Elw = new JButton();
        this.EPy = new JButton();
        this.EPv = new JButton();
        this.EPx = new JPanel();
        this.EPA = new JScrollPane();
        this.EPz = new JList();
        this.setResizable(true);
        this.setTitle("Quest Reporter");
        this.setName("Form");
        this.EAS.setName("RightPanel");
        this.EPu.setName("CentralScrollPane");
        this.EPB.setColumns(20);
        this.EPB.setRows(5);
        this.EPB.setName("ReportTextArea");
        this.EPu.setViewportView(this.EPB);
        GroupLayout groupLayout = new GroupLayout(this.EAS);
        this.EAS.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.EPu, -1, 395, Short.MAX_VALUE).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.EPu, -1, 380, Short.MAX_VALUE).addContainerGap()));
        this.EPF.setName("UpperPanel");
        this.EPE.setText("Show Warnings");
        this.EPE.setName("ShowWarningsCheckBox");
        this.EPD.setModel(new DefaultComboBoxModel<String>(new String[]{"Complex Quests", "Simple    Quests"}));
        this.EPD.setName("SelectQuestTypeComboBox");
        this.EPC.setText("");
        this.EPC.setName("SearchQuestNameTextField");
        GroupLayout groupLayout2 = new GroupLayout(this.EPF);
        this.EPF.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addGap(20, 20, 20).addComponent(this.EPE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EPD, -2, 110, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EPC, -2, 109, -2).addContainerGap(430, Short.MAX_VALUE)));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EPE).addComponent(this.EPD, -2, -1, -2).addComponent(this.EPC, -2, -1, -2))));
        this.EPw.setName("DownPanel");
        this.Elw.setText("Close");
        this.Elw.setName("CloseButton");
        this.EPy.setText("Open Report File");
        this.EPy.setName("OpenReportFileButton");
        this.EPv.setText("Check Again");
        this.EPv.setName("CheckAgainButton");
        GroupLayout groupLayout3 = new GroupLayout(this.EPw);
        this.EPw.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addContainerGap().addComponent(this.EPv).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 473, Short.MAX_VALUE).addComponent(this.EPy).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Elw).addContainerGap()));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Elw).addComponent(this.EPy)).addComponent(this.EPv, GroupLayout.Alignment.TRAILING)));
        this.EPx.setName("LeftPanel");
        this.EPA.setName("QuestListScrollPane");
        this.EPz.setSelectionMode(0);
        this.EPz.setName("QuestList");
        this.EPA.setViewportView(this.EPz);
        GroupLayout groupLayout4 = new GroupLayout(this.EPx);
        this.EPx.setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addComponent(this.EPA, -1, 325, Short.MAX_VALUE).addContainerGap()));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addComponent(this.EPA, -1, 380, Short.MAX_VALUE).addContainerGap()));
        GroupLayout groupLayout5 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(groupLayout5);
        groupLayout5.setHorizontalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout5.createSequentialGroup().addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.EPF, -1, -1, Short.MAX_VALUE).addGroup(GroupLayout.Alignment.LEADING, groupLayout5.createSequentialGroup().addContainerGap().addComponent(this.EPw, -1, -1, Short.MAX_VALUE)).addGroup(GroupLayout.Alignment.LEADING, groupLayout5.createSequentialGroup().addContainerGap().addComponent(this.EPx, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EAS, -1, -1, Short.MAX_VALUE))).addContainerGap()));
        groupLayout5.setVerticalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addComponent(this.EPF, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EPx, -1, -1, Short.MAX_VALUE).addComponent(this.EAS, -1, -1, Short.MAX_VALUE)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EPw, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    public mwk(JFrame jFrame, boolean bl, aux aux2) {
        super((Frame)jFrame, bl);
        this.DEC = aux2;
        aux2.setCursor(EmW);
        this.b();
        this.EPH.eRp();
        this.eRv();
        aux2.setCursor(EPt);
    }

    private void eRv() {
        this.EPB.setFont(new Font("Arial", 1, 12));
        this.EPB.setEditable(false);
        this.EPE.setSelected(true);
        this.EPE.addActionListener(new ActionListener(this){
            final /* synthetic */ mwk EPI;
            {
                this.EPI = mwk2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mwk.a(this.EPI);
            }
        });
        this.Elw.addActionListener(new ActionListener(this){
            final /* synthetic */ mwk EPI;
            {
                this.EPI = mwk2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.EPI.dispose();
            }
        });
        this.EPy.addActionListener(new ActionListener(this){
            final /* synthetic */ mwk EPI;
            {
                this.EPI = mwk2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = System.getenv("windir");
                String string2 = string + "\\System32\\Notepad.exe ";
                String string3 = mwk.b(this.EPI).eRl();
                try {
                    Runtime.getRuntime().exec(string2 + string3);
                }
                catch (IOException iOException) {
                    JOptionPane.showMessageDialog((Component)mwk.c(this.EPI), "The document doesn't exist!", "Document not found!", 0);
                    iOException.printStackTrace();
                }
            }
        });
        this.EPz.addMouseListener(new MouseAdapter(this){
            final /* synthetic */ mwk EPI;
            {
                this.EPI = mwk2;
            }

            public void mousePressed(MouseEvent mouseEvent) {
                if (mouseEvent.getButton() == 1 && mouseEvent.getClickCount() == 1) {
                    mwk.d(this.EPI);
                }
            }
        });
        this.EPz.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mwk EPI;
            {
                this.EPI = mwk2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 40 || keyEvent.getKeyCode() == 38) {
                    mwk.d(this.EPI);
                }
            }
        });
        this.EPD.addActionListener(new ActionListener(this){
            final /* synthetic */ mwk EPI;
            {
                this.EPI = mwk2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mwk.a(this.EPI);
            }
        });
        this.EPv.addActionListener(new ActionListener(this){
            final /* synthetic */ mwk EPI;
            {
                this.EPI = mwk2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mwk.c(this.EPI).setCursor(mwk.eRy());
                mwk.b(this.EPI).eRp();
                mwk.a(this.EPI);
                mwk.c(this.EPI).setCursor(mwk.eRz());
            }
        });
        this.EPC.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mwk EPI;
            {
                this.EPI = mwk2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10) {
                    mwk.a(this.EPI);
                }
            }
        });
        this.eRw();
    }

    private void eRw() {
        this.EPG.clear();
        List<mwj.a> list = this.EPD.getSelectedIndex() == 0 ? this.EPH.eRq() : this.EPH.eRr();
        for (mwj.a a2 : list) {
            if (!a2.eRt().isEmpty()) {
                if (!this.EPC.getText().trim().equals("") && !a2.Name.toLowerCase().contains(this.EPC.getText().toLowerCase())) continue;
                this.EPG.add(a2.Name);
                continue;
            }
            if (!this.EPE.isSelected() || !this.EPC.getText().trim().equals("") && !a2.Name.toLowerCase().contains(this.EPC.getText().toLowerCase())) continue;
            this.EPG.add(a2.Name);
        }
        this.EPz.setListData(this.EPG);
        this.EPz.revalidate();
    }

    private void eRx() {
        int n = this.EPz.getSelectedIndex();
        if (n != -1) {
            this.EPB.setText("");
            String string = this.EPz.getSelectedValue().toString();
            mwj.a a2 = this.EPH.DI(string);
            assert (a2 != null);
            if (!a2.eRt().isEmpty()) {
                this.EPB.append("Errors\n");
                for (String string2 : a2.eRt()) {
                    this.EPB.append("- [" + string2 + "]\n");
                }
            }
            if (this.EPE.isSelected() && !a2.eRu().isEmpty()) {
                this.EPB.append("Warnings\n");
                for (String string2 : a2.eRu()) {
                    this.EPB.append("- [" + string2 + "]\n");
                }
            }
        }
    }

    static /* synthetic */ void a(mwk mwk2) {
        mwk2.eRw();
    }

    static /* synthetic */ mwj b(mwk mwk2) {
        return mwk2.EPH;
    }

    static /* synthetic */ aux c(mwk mwk2) {
        return mwk2.DEC;
    }

    static /* synthetic */ void d(mwk mwk2) {
        mwk2.eRx();
    }

    static /* synthetic */ Cursor eRy() {
        return EmW;
    }

    static /* synthetic */ Cursor eRz() {
        return EPt;
    }
}

