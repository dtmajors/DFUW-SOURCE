/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.filechooser.FileFilter;

public class mpr
extends mkx {
    private dsd DWK = null;
    private JCheckBox DWL = null;
    private JTextField DWM = null;
    private JTextField DWN = null;
    private JSpinner DWO = null;
    private JSpinner DWP = null;
    private JTextField DWQ = null;
    private JTextField DWR = null;
    private JTextField DWS = null;
    private JTextField DWT = null;
    private JCheckBox DWU = null;
    private Vector<JCheckBox> DWV = null;
    private JPanel DWW = null;

    public mpr(dsd dsd2) {
        super(true);
        this.setTitle("Global Event Properties");
        this.setSize(new Dimension(200, 400));
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        this.DWK = dsd2;
        jPanel.add(this.eIN());
        if (dsd2.bxB() instanceof bfz) {
            jPanel.add(this.eIO());
        }
        this.DWW = jPanel;
        this.DGa.add((Component)this.eIM(), "North");
        this.DGa.add((Component)this.DWW, "Center");
        this.pack();
        this.setClosable(true);
        this.eIP();
    }

    private JPanel eIM() {
        JPanel jPanel = new JPanel(new FlowLayout(0));
        JLabel jLabel = new JLabel(this.DWK.bxz());
        jLabel.setHorizontalTextPosition(4);
        jLabel.setPreferredSize(new Dimension(240, 20));
        jLabel.setSize(new Dimension(240, 20));
        jLabel.setMinimumSize(new Dimension(240, 20));
        jLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.DWU = new JCheckBox("Overide");
        this.DWU.setSelected(this.DWK.bxA());
        if (this.DWK.bxz().length() == 0) {
            this.DWU.setEnabled(false);
        }
        this.DWU.addActionListener(new ActionListener(this){
            final /* synthetic */ mpr DWX;
            {
                this.DWX = mpr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpr.a(this.DWX);
            }
        });
        JButton jButton = new JButton("Save as template");
        jButton.addActionListener(new ActionListener(this){
            final /* synthetic */ mpr DWX;
            {
                this.DWX = mpr2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mpr.b(this.DWX);
            }
        });
        jPanel.add(new JLabel("Template:"));
        jPanel.add(jLabel);
        jPanel.add(this.DWU);
        jPanel.add(jButton);
        return jPanel;
    }

    private JPanel eIN() {
        bfw bfw2 = this.DWK.bxB();
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Global Event Properties "));
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        Date date = null;
        date = bfw2.aol() > 0L ? new Date(bfw2.aol()) : new Date();
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        JSpinner jSpinner = new JSpinner();
        jSpinner.setModel(new SpinnerDateModel());
        jSpinner.setValue(date);
        jSpinner.setPreferredSize(new Dimension(120, 20));
        jSpinner.setMinimumSize(new Dimension(120, 20));
        jSpinner.setSize(new Dimension(120, 20));
        jPanel2.add(new JLabel("Start Time"));
        jPanel2.add(jSpinner);
        this.DWO = jSpinner;
        Date date2 = null;
        date2 = bfw2.aok() > 0L ? new Date(bfw2.aok()) : new Date();
        JPanel jPanel3 = new JPanel(new FlowLayout(0));
        JSpinner jSpinner2 = new JSpinner();
        jSpinner2.setModel(new SpinnerDateModel());
        jSpinner2.setValue(date2);
        jSpinner2.setPreferredSize(new Dimension(120, 20));
        jSpinner2.setMinimumSize(new Dimension(120, 20));
        jSpinner2.setSize(new Dimension(120, 20));
        jPanel3.add(new JLabel("End Time"));
        jPanel3.add(jSpinner2);
        this.DWP = jSpinner2;
        JPanel jPanel4 = new JPanel(new FlowLayout(0));
        this.DWN = new JTextField();
        this.DWN.setSize(new Dimension(120, 20));
        this.DWN.setPreferredSize(new Dimension(120, 20));
        this.DWN.setText(String.valueOf(bfw2.getInterval() / 1000L));
        jPanel4.add(new JLabel("Interval(sec):"));
        jPanel4.add(this.DWN);
        jPanel.add(jPanel2);
        jPanel.add(jPanel3);
        jPanel.add(jPanel4);
        this.DWL = new JCheckBox("One Off");
        jPanel.add(this.DWL);
        this.DWL.setSelected(bfw2.aoi());
        jPanel.add(new JLabel("Allowed Game Times:"));
        this.DWV = new Vector();
        ldz.a[] aArray = bfw2.aoj();
        for (int i = 0; i < ldz.a.values().length; ++i) {
            JCheckBox jCheckBox = new JCheckBox(ldz.a.values()[i].toString());
            boolean bl = false;
            for (int j = 0; j < aArray.length; ++j) {
                if (aArray[j] == null || !aArray[j].equals((Object)ldz.a.values()[i])) continue;
                bl = true;
                break;
            }
            jCheckBox.setSelected(bl);
            jPanel.add(jCheckBox);
            this.DWV.add(jCheckBox);
        }
        return jPanel;
    }

    private JPanel eIO() {
        bfz bfz2 = (bfz)this.DWK.bxB();
        JPanel jPanel = new JPanel();
        jPanel.setBorder(BorderFactory.createTitledBorder("Global Event SFX Properties "));
        jPanel.setLayout(new BoxLayout(jPanel, 1));
        JPanel jPanel2 = new JPanel(new FlowLayout(0));
        jPanel2.add(new JLabel("SFX to Play:"));
        this.DWM = new JTextField();
        this.DWM.setSize(new Dimension(120, 20));
        this.DWM.setPreferredSize(new Dimension(120, 20));
        this.DWM.setText(del.zU(bfz2.getSpecialEffectType()));
        jPanel2.add(this.DWM);
        JPanel jPanel3 = new JPanel(new FlowLayout(0));
        this.DWQ = new JTextField();
        this.DWQ.setSize(new Dimension(120, 20));
        this.DWQ.setPreferredSize(new Dimension(120, 20));
        this.DWQ.setText(String.valueOf(bfz2.getDuration() / 1000L));
        jPanel3.add(new JLabel("Duration(sec):"));
        jPanel3.add(this.DWQ);
        JPanel jPanel4 = new JPanel(new FlowLayout(0));
        this.DWR = new JTextField();
        this.DWR.setSize(new Dimension(120, 20));
        this.DWR.setPreferredSize(new Dimension(120, 20));
        this.DWR.setText(String.valueOf(bfz2.aos() / 1000L));
        jPanel4.add(new JLabel("Frequency(sec):"));
        jPanel4.add(this.DWR);
        JPanel jPanel5 = new JPanel(new FlowLayout(0));
        jPanel5.add(new JLabel("Rotation(radians) Yaw:"));
        this.DWS = new JTextField();
        this.DWS.setPreferredSize(new Dimension(100, 20));
        this.DWS.setSize(new Dimension(100, 20));
        jPanel5.add(this.DWS);
        jPanel5.add(new JLabel("Pitch:"));
        this.DWT = new JTextField();
        this.DWT.setPreferredSize(new Dimension(100, 20));
        this.DWT.setSize(new Dimension(100, 20));
        jPanel5.add(this.DWT);
        ljq ljq2 = bfz2.aw().eqT();
        String string = String.valueOf(ljq2.x);
        this.DWS.setText(string);
        this.DWT.setText(String.valueOf(ljq2.y));
        jPanel.add(jPanel2);
        jPanel.add(jPanel5);
        jPanel.add(jPanel3);
        jPanel.add(jPanel4);
        return jPanel;
    }

    @Override
    public void eDD() {
        bfw bfw2 = this.DWK.bxB();
        this.DWK.jk(this.DWU.isSelected());
        Date date = (Date)this.DWO.getValue();
        bfw2.K(date.getTime());
        Date date2 = (Date)this.DWP.getValue();
        bfw2.J(date2.getTime());
        bfw2.setInterval(Long.parseLong(this.DWN.getText()) * 1000L);
        bfw2.dd(this.DWL.isSelected());
        ArrayList<ldz.a> arrayList = lcn.emv();
        for (int i = 0; i < this.DWV.size(); ++i) {
            if (!this.DWV.get(i).isSelected()) continue;
            arrayList.add(ldz.a.Values.get(i));
        }
        ldz.a[] aArray = new ldz.a[arrayList.size()];
        arrayList.toArray(aArray);
        bfw2.b(aArray);
        if (bfw2 instanceof bfz) {
            bfz bfz2 = (bfz)bfw2;
            int n = del.dr(this.DWM.getText());
            if (n != -1) {
                bfz2.setSpecialEffectType(n);
            }
            bfz2.L(Long.parseLong(this.DWQ.getText()) * 1000L);
            bfz2.M(Long.parseLong(this.DWR.getText()) * 1000L);
            ljq ljq2 = bfz2.aw().eqT();
            ljq2.x = Float.parseFloat(this.DWS.getText());
            ljq2.y = Float.parseFloat(this.DWT.getText());
            lgl lgl2 = new lgl();
            lgl2.ep(ljq2);
            bfz2.a(lgl2);
        }
    }

    private void eIK() {
        Object object;
        mkb mkb2 = null;
        int n = 0;
        try {
            mkb2 = new mkb(lcw.qLb + "xml-files/object/globalevent/");
            object = new myr("xml", "XML Files");
            mkb2.Ci(".xml");
            mkb2.addChoosableFileFilter((FileFilter)object);
            mkb2.setAcceptAllFileFilterUsed(false);
            mkb2.setFileSelectionMode(0);
            n = mkb2.showSaveDialog(this);
        }
        catch (Exception exception) {
            System.out.println("FileChooser exception: " + exception);
            throw new bs(exception);
        }
        object = mkb2.eDc();
        this.eDD();
        this.DWK.b((jrw)object);
    }

    private void eIP() {
        if (this.DWW != null && this.DWU != null) {
            this.a(this.DWW, this.DWU.isSelected());
        }
    }

    private void a(JComponent jComponent, boolean bl) {
        jComponent.setEnabled(bl);
        for (Component component : jComponent.getComponents()) {
            if (!(component instanceof JComponent)) continue;
            this.a((JComponent)component, bl);
        }
    }

    static /* synthetic */ void a(mpr mpr2) {
        mpr2.eIP();
    }

    static /* synthetic */ void b(mpr mpr2) {
        mpr2.eIK();
    }
}

