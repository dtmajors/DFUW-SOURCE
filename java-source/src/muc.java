/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle;
import javax.swing.text.NumberFormatter;

public class muc
extends JDialog
implements ActionListener {
    private static final String EFG = "MaxRankChkBox";
    private static final String EFH = "MinRankChkBox";
    private static final String EFy = "Cancel";
    private static final String EFx = "OK";
    private static final String EFI = "Min-Max Quantity";
    private static final String EFJ = "Resource Item";
    private static final String EFK = "Random Item";
    private static final String EFL = "Absolute Quantity";
    List<ler> aGu;
    private final ButtonGroup EFM = new ButtonGroup();
    private JFormattedTextField EFN;
    private final ButtonGroup EFO = new ButtonGroup();
    private JLabel EFP;
    private JFormattedTextField EFQ;
    private JFormattedTextField EFR;
    private JFormattedTextField EFS;
    private JLabel EFT;
    private JLabel EFU;
    private JComboBox EFV;
    private JPanel EFW;
    private JPanel EFX;
    private JButton EFY;
    private JButton EFZ;
    private Object _item;

    public muc(Frame frame, Object object) {
        super(frame);
        this._item = object;
        this.setTitle("Add/Edit Item");
        this.setSize(new Dimension(300, 289));
        this.getContentPane().setLayout(new BorderLayout(0, 0));
        JPanel jPanel = new JPanel();
        FlowLayout flowLayout = (FlowLayout)jPanel.getLayout();
        flowLayout.setAlignment(0);
        this.getContentPane().add((Component)jPanel, "North");
        JRadioButton jRadioButton = new JRadioButton(EFJ);
        jRadioButton.setActionCommand(EFJ);
        jRadioButton.setSelected(true);
        jRadioButton.addActionListener(this);
        this.EFM.add(jRadioButton);
        jPanel.add(jRadioButton);
        JRadioButton jRadioButton2 = new JRadioButton(EFK);
        jRadioButton2.setActionCommand(EFK);
        jRadioButton2.addActionListener(this);
        this.EFM.add(jRadioButton2);
        jPanel.add(jRadioButton2);
        this.EFW = new JPanel();
        this.getContentPane().add((Component)this.EFW, "Center");
        JLabel jLabel = new JLabel("Resource:");
        this.EFV = new JComboBox();
        JLabel jLabel2 = new JLabel("Probability:");
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMinimumFractionDigits(1);
        numberFormat.setMaximumFractionDigits(4);
        NumberFormatter numberFormatter = new NumberFormatter();
        numberFormatter.setFormat(numberFormat);
        numberFormatter.setMaximum(Double.valueOf(1.0));
        numberFormatter.setMinimum(Double.valueOf(0.0));
        this.EFN = new JFormattedTextField(numberFormatter);
        this.EFN.addPropertyChangeListener(new PropertyChangeListener(this){
            final /* synthetic */ muc EGa;
            {
                this.EGa = muc2;
            }

            public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
            }
        });
        this.EFN.setColumns(10);
        JRadioButton jRadioButton3 = new JRadioButton(EFL);
        jRadioButton3.setActionCommand(EFL);
        jRadioButton3.addActionListener(this);
        jRadioButton3.setSelected(true);
        this.EFO.add(jRadioButton3);
        JRadioButton jRadioButton4 = new JRadioButton(EFI);
        jRadioButton4.setActionCommand(EFI);
        jRadioButton4.addActionListener(this);
        this.EFO.add(jRadioButton4);
        this.EFT = new JLabel("Quantity:");
        NumberFormat numberFormat2 = NumberFormat.getNumberInstance();
        this.EFS = new JFormattedTextField(numberFormat2);
        this.EFS.setValue(new Integer(0));
        this.EFS.setColumns(10);
        this.EFU = new JLabel("Min Quantity:");
        this.EFU.setEnabled(false);
        this.EFR = new JFormattedTextField(numberFormat2);
        this.EFR.setEnabled(false);
        this.EFR.setValue(new Integer(0));
        this.EFR.setColumns(10);
        this.EFP = new JLabel("Max Quantity:");
        this.EFP.setEnabled(false);
        this.EFQ = new JFormattedTextField(numberFormat2);
        this.EFQ.setEnabled(false);
        this.EFQ.setValue(new Integer(0));
        this.EFQ.setColumns(10);
        GroupLayout groupLayout = new GroupLayout(this.EFW);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EFT).addComponent(this.EFU).addComponent(this.EFP)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.EFS, -2, -1, -2).addComponent(this.EFR, -2, -1, -2).addComponent(this.EFQ, -2, -1, -2)).addContainerGap(105, Short.MAX_VALUE)).addGroup(groupLayout.createSequentialGroup().addGap(10).addComponent(jLabel2, -2, 54, -2).addGap(18).addComponent(this.EFN, -2, -1, -2).addGap(116)).addGroup(groupLayout.createSequentialGroup().addGap(10).addComponent(jRadioButton3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(jRadioButton4).addGap(50)).addGroup(groupLayout.createSequentialGroup().addGap(10).addComponent(jLabel, -2, 49, -2).addGap(23).addComponent(this.EFV, -2, 193, -2).addGap(9)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(3).addComponent(jLabel)).addComponent(this.EFV, -2, -1, -2)).addGap(6).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(3).addComponent(jLabel2)).addComponent(this.EFN, -2, -1, -2)).addGap(18).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jRadioButton3).addComponent(jRadioButton4)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EFT).addComponent(this.EFS, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.EFU).addComponent(this.EFR, -2, -1, -2)).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.EFP)).addGroup(groupLayout.createSequentialGroup().addGap(7).addComponent(this.EFQ, -2, -1, -2))).addContainerGap(117, Short.MAX_VALUE)));
        this.EFW.setLayout(groupLayout);
        new mtx().a(this.EFV);
        this.EFX = new JPanel();
        FlowLayout flowLayout2 = (FlowLayout)this.EFX.getLayout();
        flowLayout2.setAlignment(0);
        this.getContentPane().add((Component)this.EFX, "South");
        this.EFY = new JButton(EFx);
        this.EFY.setActionCommand(EFx);
        this.EFY.addActionListener(this);
        this.EFX.add(this.EFY);
        this.EFZ = new JButton(EFy);
        this.EFZ.setActionCommand(EFy);
        this.EFZ.addActionListener(this);
        this.EFX.add(this.EFZ);
        this.ePB();
        for (ler object2 : this.aGu) {
            this.EFV.addItem(object2.getName());
        }
        if (this._item == null) {
            this.a(jPanel, true);
        } else {
            this.a(jPanel, false);
            if (this._item instanceof cto) {
                jRadioButton.setSelected(true);
                this.EFW.setEnabled(true);
                cto cto2 = (cto)this._item;
                String string = lea.enW().getName(cto2.ResourceType);
                this.EFV.setSelectedItem(string);
                this.EFN.setText(String.valueOf(cto2.Probability));
                if (cto2.asi > 0) {
                    jRadioButton3.setSelected(true);
                    this.EFS.setText(String.valueOf(cto2.asi));
                    this.EFS.setEnabled(true);
                    this.EFR.setEnabled(false);
                    this.EFQ.setEnabled(false);
                } else {
                    jRadioButton4.setSelected(true);
                    this.EFR.setText(String.valueOf(cto2.dpS));
                    this.EFQ.setText(String.valueOf(cto2.dpT));
                    this.EFS.setEnabled(false);
                    this.EFR.setEnabled(true);
                    this.EFQ.setEnabled(true);
                }
            } else {
                jRadioButton2.setSelected(true);
                this.a(this.EFW, false);
            }
        }
    }

    public void a(Container container, boolean bl) {
        Component[] componentArray;
        for (Component component : componentArray = container.getComponents()) {
            component.setEnabled(bl);
            if (!(component instanceof Container)) continue;
            this.a((Container)component, bl);
        }
    }

    private void ePB() {
        les les2 = lea.enW();
        ler ler2 = les2.acv(cug.fkd);
        this.aGu = les2.a(ler2, true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand() == EFK) {
            this.EFW.setEnabled(false);
        } else if (actionEvent.getActionCommand() == EFJ) {
            this.EFW.setEnabled(true);
        } else if (actionEvent.getActionCommand() == EFL) {
            this.EFS.setEnabled(true);
            this.EFT.setEnabled(true);
            this.EFU.setEnabled(false);
            this.EFR.setEnabled(false);
            this.EFP.setEnabled(false);
            this.EFQ.setEnabled(false);
        } else if (actionEvent.getActionCommand() == EFI) {
            this.EFS.setEnabled(false);
            this.EFT.setEnabled(false);
            this.EFU.setEnabled(true);
            this.EFR.setEnabled(true);
            this.EFP.setEnabled(true);
            this.EFQ.setEnabled(true);
        } else if (actionEvent.getActionCommand() == EFx) {
            if (this.EFW.isEnabled()) {
                int n;
                int n2;
                int n3;
                int n4 = -1;
                float f2 = 0.0f;
                try {
                    n4 = cug.hV((String)((String)this.EFV.getSelectedItem()));
                    f2 = Float.parseFloat(this.EFN.getText());
                    if (this.EFS.isEnabled()) {
                        n3 = Integer.parseInt(this.EFS.getText());
                        n2 = 0;
                        n = 0;
                    } else {
                        n3 = 0;
                        n2 = Integer.parseInt(this.EFR.getText());
                        n = Integer.parseInt(this.EFQ.getText());
                        if (n2 != -1 && n != -1 && n2 >= n) {
                            JOptionPane.showMessageDialog(null, "Min quantity cannot be more than max quantity", "Quantity Error", 0);
                            lfn.b(5, this.getClass().getSimpleName(), "Min quantity cannot be more than max quantity");
                            return;
                        }
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    JOptionPane.showMessageDialog(null, "Invalid numeric value", "Error", 0);
                    lfn.b(5, this.getClass().getSimpleName(), "Invalid numeric value: " + numberFormatException.getMessage());
                    return;
                }
                this._item = new cto();
                ((cto)this._item).ResourceType = n4;
                ((cto)this._item).Probability = f2;
                ((cto)this._item).asi = n3;
                ((cto)this._item).dpS = n2;
                ((cto)this._item).dpT = n;
            } else {
                this._item = lcn.emv();
            }
            this.setVisible(false);
            this.dispose();
        } else if (actionEvent.getActionCommand() == EFy) {
            this._item = null;
            this.setVisible(false);
            this.dispose();
        }
    }

    Object getItem() {
        return this._item;
    }
}

