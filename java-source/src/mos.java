/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 *  org.jdesktop.layout.GroupLayout
 *  org.jdesktop.layout.GroupLayout$Group
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.jdesktop.layout.GroupLayout;
import org.w3c.dom.Document;

public class mos
extends JDialog {
    private JCheckBox DTh;
    private JButton qtg;
    private JButton DTi;
    private JComboBox DTj;
    private mku DTk;
    private JButton DEt;
    private JButton DTl;
    private JLabel I;
    private JList DFW;
    private JPanel aa;
    private JPanel bN;
    private JScrollPane ah;
    private XStream DTm = null;
    private Vector<lcd> DTn = new Vector();
    private ljq Offset;
    private boolean DTo;
    private String byk;

    public mos(Frame frame, boolean bl) {
        super(frame, bl);
        this.b();
        this.c();
    }

    private void b() {
        this.aa = new JPanel();
        this.DEt = new JButton();
        this.qtg = new JButton();
        this.ah = new JScrollPane();
        this.DFW = new JList();
        this.bN = new JPanel();
        this.DTh = new JCheckBox();
        this.DTj = new JComboBox();
        this.DTk = new mku();
        this.DTi = new JButton();
        this.DTl = new JButton();
        this.I = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Copy Attachpoint");
        this.DEt.setText("Ok");
        this.DEt.addActionListener(new ActionListener(this){
            final /* synthetic */ mos DTp;
            {
                this.DTp = mos2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mos.a(this.DTp, actionEvent);
            }
        });
        this.qtg.setText("Cancel");
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mos DTp;
            {
                this.DTp = mos2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mos.b(this.DTp, actionEvent);
            }
        });
        this.DFW.setModel(new AbstractListModel(this){
            String[] qos;
            final /* synthetic */ mos DTp;
            {
                this.DTp = mos2;
                this.qos = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
            }

            public int getSize() {
                return this.qos.length;
            }

            public Object getElementAt(int n) {
                return this.qos[n];
            }
        });
        this.ah.setViewportView(this.DFW);
        this.bN.setBorder(BorderFactory.createTitledBorder("Extra Offset"));
        this.DTh.setText("Use Attachpoint Direction");
        this.DTh.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.DTh.setMargin(new Insets(0, 0, 0, 0));
        this.DTj.setModel(new DefaultComboBoxModel<String>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        this.DTj.addActionListener(new ActionListener(this){
            final /* synthetic */ mos DTp;
            {
                this.DTp = mos2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mos.c(this.DTp, actionEvent);
            }
        });
        this.DTi.setText("Clear Offset");
        this.DTi.addActionListener(new ActionListener(this){
            final /* synthetic */ mos DTp;
            {
                this.DTp = mos2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mos.d(this.DTp, actionEvent);
            }
        });
        this.DTl.setText("Save Offset");
        this.DTl.addActionListener(new ActionListener(this){
            final /* synthetic */ mos DTp;
            {
                this.DTp = mos2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mos.e(this.DTp, actionEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout((Container)this.bN);
        this.bN.setLayout((LayoutManager)groupLayout);
        groupLayout.setHorizontalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout.createParallelGroup(1).add((Component)this.DTh).add((Component)this.DTk, -2, -1, -2).add((GroupLayout.Group)groupLayout.createSequentialGroup().add((Component)this.DTi).addPreferredGap(0).add((Component)this.DTl)).add((Component)this.DTj, 0, 392, Short.MAX_VALUE)).addContainerGap()));
        groupLayout.setVerticalGroup((GroupLayout.Group)groupLayout.createParallelGroup(1).add((GroupLayout.Group)groupLayout.createSequentialGroup().addContainerGap().add((Component)this.DTh).addPreferredGap(0).add((Component)this.DTj, -2, -1, -2).addPreferredGap(0).add((Component)this.DTk, -2, -1, -2).addPreferredGap(0, -1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout.createParallelGroup(3).add((Component)this.DTi).add((Component)this.DTl)).addContainerGap()));
        this.I.setText("Choose attachpoint:");
        GroupLayout groupLayout2 = new GroupLayout((Container)this.aa);
        this.aa.setLayout((LayoutManager)groupLayout2);
        groupLayout2.setHorizontalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add(2, (GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((GroupLayout.Group)groupLayout2.createParallelGroup(2).add(1, (Component)this.bN, -1, -1, Short.MAX_VALUE).add(1, (GroupLayout.Group)groupLayout2.createSequentialGroup().add((Component)this.DEt).addPreferredGap(0).add((Component)this.qtg)).add(1, (Component)this.I).add(1, (Component)this.ah, -1, 428, Short.MAX_VALUE)).addContainerGap()));
        groupLayout2.setVerticalGroup((GroupLayout.Group)groupLayout2.createParallelGroup(1).add((GroupLayout.Group)groupLayout2.createSequentialGroup().addContainerGap().add((Component)this.I).addPreferredGap(0).add((Component)this.ah, -2, 308, -2).addPreferredGap(0).add((Component)this.bN, -2, -1, -2).addPreferredGap(0, -1, Short.MAX_VALUE).add((GroupLayout.Group)groupLayout2.createParallelGroup(3).add((Component)this.DEt).add((Component)this.qtg)).addContainerGap()));
        GroupLayout groupLayout3 = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)groupLayout3);
        groupLayout3.setHorizontalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((GroupLayout.Group)groupLayout3.createSequentialGroup().add((Component)this.aa, -1, -1, Short.MAX_VALUE).addContainerGap()));
        groupLayout3.setVerticalGroup((GroupLayout.Group)groupLayout3.createParallelGroup(1).add((Component)this.aa, -1, -1, Short.MAX_VALUE));
        this.pack();
    }

    private void aP(ActionEvent actionEvent) {
        this.eHQ();
    }

    private void aQ(ActionEvent actionEvent) {
        this.eHR();
    }

    private void H(ActionEvent actionEvent) {
        this.eHO();
    }

    private void I(ActionEvent actionEvent) {
        this.p();
    }

    private void aR(ActionEvent actionEvent) {
        this.eHP();
    }

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                new mos((Frame)new JFrame(), true).setVisible(true);
            }
        });
    }

    private void c() {
        this.DTk.setTitle("Offset Position");
        this.m();
        this.DFW.setListData(ei.fe());
        this.DFW.setSelectedIndex(0);
    }

    private void m() {
        this.DTn.clear();
        lcd lcd2 = new lcd();
        lcd2.Filename = "new";
        lcd2.Offset = new ljq();
        this.DTn.add(lcd2);
        File file = new File(lcw.qLb + "xml-files/worldbuilder/attachpoint-offsets/");
        File[] fileArray = file.listFiles();
        for (int i = 0; i < fileArray.length; ++i) {
            File file2 = fileArray[i];
            if (!file2.isFile()) continue;
            try {
                lcd lcd3 = this.e(file2);
                this.DTn.add(lcd3);
                continue;
            }
            catch (bg bg2) {
                lfn.b(5, this.getClass().getSimpleName(), "setupComboBox() : Could not load file [" + file2 + "] !");
                bg2.printStackTrace();
            }
        }
        this.DTj.setModel(new DefaultComboBoxModel<lcd>(this.DTn));
        this.DTj.setSelectedIndex(0);
    }

    private void eHO() {
        this.dispose();
    }

    private void p() {
        this.DTo = this.DTh.isSelected();
        this.Offset = this.DTk.bSh();
        this.byk = (String)this.DFW.getSelectedValue();
        this.dispose();
    }

    private void eHP() {
        this.DTk.cL(new ljq());
        this.DTj.setSelectedItem(null);
    }

    private void eHQ() {
        lcd lcd2 = (lcd)this.DTj.getSelectedItem();
        if (lcd2 == null) {
            return;
        }
        this.DTk.cL(lcd2.Offset);
    }

    private void eHR() {
        Object object;
        XStream xStream = new XStream(new DomDriver());
        this.a(xStream);
        int n = this.DTj.getSelectedIndex();
        if (n == 0) {
            object = JOptionPane.showInputDialog(this, (Object)"Filename for new AttachpointOffset:");
            if (object == null || ((String)object).equals("")) {
                return;
            }
            if (!((String)(object = ((String)object).toLowerCase())).endsWith(".xml")) {
                object = object + ".xml";
            }
            lcd lcd2 = this.DTn.get(0);
            lcd2.Filename = object;
            lcd2.Offset = new ljq(this.DTk.bSh());
        } else {
            if (this.DTj.getSelectedIndex() > 0) {
                object = this.DTn.get(n);
                ((lcd)object).Offset = new ljq(this.DTk.bSh());
            }
            this.DTn.remove(0);
        }
        for (lcd lcd2 : this.DTn) {
            String string = xStream.toXML(lcd2);
            Document document = jsy.tL(string);
            String string2 = lcw.qLb + "xml-files/worldbuilder/attachpoint-offsets/" + lcd2.Filename;
            jsz.a(document, new jrw(string2));
        }
        this.m();
    }

    private void a(XStream xStream) {
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, lcd.class);
    }

    private lcd e(File file) {
        XStream xStream = new XStream(new DomDriver());
        this.a(xStream);
        String string = "";
        try {
            string = jry.tk(file.getAbsolutePath());
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new bg(fileNotFoundException);
        }
        catch (IOException iOException) {
            throw new bg(iOException);
        }
        Object object = xStream.fromXML(string);
        assert (object instanceof lcd);
        return (lcd)object;
    }

    public ljq getOffset() {
        return this.Offset;
    }

    public boolean eHS() {
        return this.DTo;
    }

    public String getAttachPointName() {
        return this.byk;
    }

    static /* synthetic */ void a(mos mos2, ActionEvent actionEvent) {
        mos2.I(actionEvent);
    }

    static /* synthetic */ void b(mos mos2, ActionEvent actionEvent) {
        mos2.H(actionEvent);
    }

    static /* synthetic */ void c(mos mos2, ActionEvent actionEvent) {
        mos2.aP(actionEvent);
    }

    static /* synthetic */ void d(mos mos2, ActionEvent actionEvent) {
        mos2.aR(actionEvent);
    }

    static /* synthetic */ void e(mos mos2, ActionEvent actionEvent) {
        mos2.aQ(actionEvent);
    }
}

