/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcw
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Collections;
import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class mqy
extends mkx {
    public static mqy Ehm = null;
    private aux DEC = null;
    private JList Ehn = null;
    private dsj Eho = null;
    private JTextField Ehp = null;
    private JTextField Ehq = null;
    private JTextField Ehr = null;
    private JCheckBox Ehs = null;
    private JCheckBox Eht = null;
    private JTextField Ehu = null;
    private String DVw = null;

    public mqy(aux aux2, dsj dsj2) {
        super(false);
        this.DEC = aux2;
        this.setTitle("Road Tool...");
        this.setClosable(true);
        this.setSize(new Dimension(400, 600));
        this.Eho = dsj2;
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        jPanel.add(this.eJU());
        jPanel.add(this.eJT());
        this.DGa.add((Component)jPanel, "Center");
        Ehm = this;
    }

    public JPanel a(String string, a a2) {
        JPanel jPanel = new JPanel(new FlowLayout(0));
        jPanel.add(new JLabel(string));
        JTextField jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(200, 20));
        jTextField.setEnabled(false);
        jTextField.setText(a2.getTextureName());
        jPanel.add(jTextField);
        a a3 = a2;
        JButton jButton = new JButton("...");
        jButton.addActionListener(new ActionListener(this, a3, jTextField){
            final /* synthetic */ a Ehv;
            final /* synthetic */ JTextField DDz;
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
                this.Ehv = a2;
                this.DDz = jTextField;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = mqy.a(this.Ehw);
                if (string != null) {
                    this.Ehv.setTextureName(string);
                    this.DDz.setText(string);
                    mqy.b(this.Ehw);
                }
            }
        });
        jPanel.add(jButton);
        return jPanel;
    }

    public JPanel eJT() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        jPanel2.add(new JLabel("Road Name:"));
        JTextField jTextField = new JTextField();
        jTextField.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                JTextField jTextField = (JTextField)actionEvent.getSource();
                mqy.c(this.Ehw).jq(jTextField.getText());
            }
        });
        jTextField.setText(this.Eho.bxX());
        jTextField.setPreferredSize(new Dimension(150, 20));
        jPanel2.add(jTextField);
        jPanel.add(jPanel2);
        jPanel.add(this.a("Road Texture", new a(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public String getTextureName() {
                return mqy.c(this.Ehw).bxO();
            }

            public void setTextureName(String string) {
                mqy.c(this.Ehw).jm(string);
            }
        }));
        jPanel.add(this.a("Road End Texture", new a(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public String getTextureName() {
                return mqy.c(this.Ehw).bxR();
            }

            public void setTextureName(String string) {
                mqy.c(this.Ehw).jp(string);
            }
        }));
        this.Ehs = new JCheckBox("Snap To Terrain");
        this.Ehs.setSelected(this.Eho.bxY());
        jPanel.add(this.Ehs);
        this.Ehs.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqy.c(this.Ehw).jq(mqy.d(this.Ehw).isSelected());
                mqy.b(this.Ehw);
            }
        });
        this.Eht = new JCheckBox("Waves");
        this.Eht.setSelected(this.Eho.bye());
        jPanel.add(this.Eht);
        this.Eht.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqy.c(this.Ehw).jr(mqy.e(this.Ehw).isSelected());
                mqy.b(this.Ehw);
            }
        });
        JPanel jPanel3 = new JPanel(new FlowLayout(0));
        jPanel3.add(new JLabel("Wave Angle:"));
        this.Ehp = new JTextField();
        this.Ehp.setText(String.valueOf(this.Eho.byf()));
        this.Ehp.setPreferredSize(new Dimension(100, 20));
        this.Ehp.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqy.c(this.Ehw).BO(Integer.parseInt(mqy.f(this.Ehw).getText()));
                mqy.b(this.Ehw);
            }
        });
        jPanel3.add(this.Ehp);
        jPanel.add(jPanel3);
        JPanel jPanel4 = new JPanel(new FlowLayout(0));
        jPanel4.add(new JLabel("Road Width:"));
        this.Ehq = new JTextField();
        this.Ehq.setText(String.valueOf(this.Eho.bxS()));
        this.Ehq.setPreferredSize(new Dimension(100, 20));
        this.Ehq.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqy.c(this.Ehw).ir(Float.parseFloat(mqy.g(this.Ehw).getText()));
                mqy.b(this.Ehw);
            }
        });
        jPanel4.add(this.Ehq);
        JPanel jPanel5 = new JPanel(new FlowLayout(0));
        jPanel5.add(new JLabel("End Width:"));
        this.Ehr = new JTextField();
        this.Ehr.setText(String.valueOf(this.Eho.bxT()));
        this.Ehr.setPreferredSize(new Dimension(100, 20));
        this.Ehr.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqy.c(this.Ehw).is(Float.parseFloat(mqy.h(this.Ehw).getText()));
                mqy.b(this.Ehw);
            }
        });
        jPanel5.add(this.Ehr);
        jPanel.add(jPanel4);
        JCheckBox jCheckBox = new JCheckBox("Create Sides");
        jCheckBox.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                JCheckBox jCheckBox = (JCheckBox)actionEvent.getSource();
                mqy.c(this.Ehw).jp(jCheckBox.isSelected());
                mqy.b(this.Ehw);
            }
        });
        jCheckBox.setSelected(this.Eho.bxW());
        jCheckBox = new JCheckBox("Create Start");
        jCheckBox.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                JCheckBox jCheckBox = (JCheckBox)actionEvent.getSource();
                mqy.c(this.Ehw).jn(jCheckBox.isSelected());
                mqy.b(this.Ehw);
            }
        });
        jCheckBox.setSelected(this.Eho.bxU());
        jPanel.add(jCheckBox);
        jCheckBox = new JCheckBox("Create End");
        jCheckBox.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                JCheckBox jCheckBox = (JCheckBox)actionEvent.getSource();
                mqy.c(this.Ehw).jo(jCheckBox.isSelected());
                mqy.b(this.Ehw);
            }
        });
        jCheckBox.setSelected(this.Eho.bxV());
        jPanel.add(jCheckBox);
        return jPanel;
    }

    public JPanel eJU() {
        JPanel jPanel = new JPanel(new BorderLayout());
        this.Ehn = new JList();
        this.Ehn.setModel(new ListModel(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void addListDataListener(ListDataListener listDataListener) {
            }

            public Object getElementAt(int n) {
                return "Point #" + (n + 1);
            }

            public int getSize() {
                return mqy.c(this.Ehw).byb().size();
            }

            public void removeListDataListener(ListDataListener listDataListener) {
            }
        });
        this.Ehn.addListSelectionListener(new ListSelectionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                int n = mqy.i(this.Ehw).getSelectedIndex();
                if (n < 0 || n >= mqy.c(this.Ehw).byb().size()) {
                    return;
                }
                mqy.j(this.Ehw).setText(String.valueOf(mqy.c(this.Ehw).byb().get(n).bxK()));
                mqy.k(this.Ehw).nG(mqy.c(this.Ehw).byb().get(n).getGUID());
            }
        });
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        JButton jButton = new JButton("Add");
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.Ehw.a(false, null);
            }
        });
        JButton jButton2 = new JButton("Insert");
        jButton2.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.Ehw.a(true, null);
            }
        });
        JButton jButton3 = new JButton("Delete");
        jButton3.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqy.l(this.Ehw);
            }
        });
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
        jPanel2.add(jButton3);
        JTextField jTextField = new JTextField("1.0");
        jPanel2.add(jTextField);
        jTextField.addActionListener(new ActionListener(this){
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                JTextField jTextField = (JTextField)actionEvent.getSource();
                int n = mqy.i(this.Ehw).getSelectedIndex();
                if (n != -1) {
                    mqy.c(this.Ehw).byb().get(n).iq(Float.parseFloat(jTextField.getText()));
                    mqy.c(this.Ehw).bxN();
                }
            }
        });
        this.Ehu = jTextField;
        jPanel.add((Component)new JScrollPane(this.Ehn), "Center");
        jPanel.add((Component)jPanel2, "South");
        return jPanel;
    }

    public void a(boolean bl, ljq ljq2) {
        ljq ljq3;
        int n = -1;
        if (bl) {
            int n2 = this.Ehn.getSelectedIndex();
            if (n2 < 0 || n2 >= this.Eho.byb().size()) {
                JOptionPane.showMessageDialog(this, "You need to select a point to insert the new control point before it");
                return;
            }
            n = n2;
        }
        if (ljq2 == null) {
            if (n > 0) {
                ljq3 = this.Eho.byb().get(n - 1).av().esF();
                ljq3.es(this.Eho.byb().get(n).av());
                ljq3.nm(0.5f);
            } else {
                ljq3 = mje.DBl.esF();
            }
        } else {
            ljq3 = ljq2;
        }
        this.Eho.c(ljq3, n);
        this.Ehn.updateUI();
        this.eJX();
    }

    private void eJV() {
        int n = this.Ehn.getSelectedIndex();
        if (n >= 0 && n < this.Eho.byb().size()) {
            this.Eho.BN(n);
        }
        this.Ehn.updateUI();
        this.eJX();
    }

    private String eIA() {
        String string = lcw.qLb + "Texture/dds";
        File file = new File(string);
        File[] fileArray = file.listFiles();
        aux aux2 = this.DEC;
        JDialog jDialog = new JDialog((Frame)aux2, true);
        jDialog.setTitle("Please Pick a texture");
        jDialog.setSize(new Dimension(300, 700));
        JPanel jPanel = new JPanel(new BorderLayout());
        Vector<String> vector = new Vector<String>();
        for (File file2 : fileArray) {
            if (!file2.getName().toLowerCase().contains("road") && !file2.getName().toLowerCase().contains("surf")) continue;
            vector.add(file2.getName());
        }
        Collections.sort(vector);
        JList jList = new JList(vector);
        JScrollPane jScrollPane = new JScrollPane(jList);
        JPanel jPanel2 = new JPanel(new FlowLayout(1));
        JButton jButton = new JButton("Ok");
        jButton.addActionListener(new ActionListener(this, jList, jDialog){
            final /* synthetic */ JList DVy;
            final /* synthetic */ JDialog DVz;
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
                this.DVy = jList;
                this.DVz = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mqy.a(this.Ehw, (String)this.DVy.getSelectedValue());
                this.DVz.dispose();
            }
        });
        JButton jButton2 = new JButton("Cancel");
        jButton2.addActionListener(new ActionListener(this, jDialog){
            final /* synthetic */ JDialog DVz;
            final /* synthetic */ mqy Ehw;
            {
                this.Ehw = mqy2;
                this.DVz = jDialog;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                this.DVz.dispose();
            }
        });
        jPanel2.add(jButton);
        jPanel2.add(jButton2);
        jPanel.add((Component)jScrollPane, "Center");
        jPanel.add((Component)jPanel2, "South");
        jDialog.add(jPanel);
        this.DVw = null;
        jDialog.setVisible(true);
        return this.DVw;
    }

    public dsj eJW() {
        return this.Eho;
    }

    private void eJX() {
        this.Eho.bxN();
    }

    static /* synthetic */ String a(mqy mqy2) {
        return mqy2.eIA();
    }

    static /* synthetic */ void b(mqy mqy2) {
        mqy2.eJX();
    }

    static /* synthetic */ dsj c(mqy mqy2) {
        return mqy2.Eho;
    }

    static /* synthetic */ JCheckBox d(mqy mqy2) {
        return mqy2.Ehs;
    }

    static /* synthetic */ JCheckBox e(mqy mqy2) {
        return mqy2.Eht;
    }

    static /* synthetic */ JTextField f(mqy mqy2) {
        return mqy2.Ehp;
    }

    static /* synthetic */ JTextField g(mqy mqy2) {
        return mqy2.Ehq;
    }

    static /* synthetic */ JTextField h(mqy mqy2) {
        return mqy2.Ehr;
    }

    static /* synthetic */ JList i(mqy mqy2) {
        return mqy2.Ehn;
    }

    static /* synthetic */ JTextField j(mqy mqy2) {
        return mqy2.Ehu;
    }

    static /* synthetic */ aux k(mqy mqy2) {
        return mqy2.DEC;
    }

    static /* synthetic */ void l(mqy mqy2) {
        mqy2.eJV();
    }

    static /* synthetic */ String a(mqy mqy2, String string) {
        mqy2.DVw = string;
        return mqy2.DVw;
    }
}

