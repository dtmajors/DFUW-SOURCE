/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mtw
extends JDialog
implements ActionListener {
    private String title;
    private String resourceName;
    private String EEu;
    private String EEv;
    private static Vector values = new Vector();
    private JPanel EEw = new JPanel();
    private static JLabel EEx = new JLabel();
    private JPanel EEy = new JPanel();
    private BorderLayout DGc = new BorderLayout();
    private static JTextField EEz = new JTextField();
    private static JSlider EEA = new JSlider();
    private JPanel EEB = new JPanel();
    private BorderLayout DGd = new BorderLayout();
    private static JSlider EEC = new JSlider();
    private static JTextField EED = new JTextField();
    private GridLayout EEE = new GridLayout();
    private Border EEF = BorderFactory.createEtchedBorder(Color.white, new Color(178, 178, 178));
    private Border EEG = new TitledBorder(this.EEF, "  %");
    private Border EEH = BorderFactory.createEtchedBorder(Color.white, new Color(178, 178, 178));
    private Border EEI = new TitledBorder(this.EEH, " Gold ");
    private JPanel EEJ = new JPanel();
    private JButton EEK = new JButton();
    private JButton EEL = new JButton();
    private FlowLayout DDV = new FlowLayout();

    public mtw(String string, String string2, String string3, String string4) {
        this.setTitle(string);
        this.setModal(true);
        this.setResizable(false);
        this.setSize(460, 250);
        this.setLayout(new GridLayout(1, 1));
        this.title = string;
        this.resourceName = string2;
        this.EEu = string3;
        this.EEv = string4;
        this.r();
    }

    private void r() {
        this.EEw.setBackground(UIManager.getColor("CheckBox.highlight"));
        this.EEw.setBorder(BorderFactory.createEtchedBorder(0, Color.white, new Color(178, 178, 178)));
        this.EEw.setMaximumSize(new Dimension(460, 200));
        this.EEw.setMinimumSize(new Dimension(460, 200));
        this.EEw.setPreferredSize(new Dimension(460, 200));
        this.EEw.setBounds(new Rectangle(4, 4, 456, 201));
        this.EEw.setLayout(this.EEE);
        EEx.setFont(new Font("Dialog", 1, 12));
        EEx.setOpaque(true);
        this.EEy.setLayout(this.DGc);
        EEz.setBorder(this.EEI);
        EEz.setMaximumSize(new Dimension(65, 34));
        EEz.setMinimumSize(new Dimension(65, 34));
        EEz.setOpaque(false);
        EEz.setPreferredSize(new Dimension(65, 34));
        EEz.setText("0");
        EEz.setHorizontalAlignment(0);
        EEz.setBounds(new Rectangle(365, 56, 65, 34));
        EEz.addActionListener(new ActionListener(this){
            final /* synthetic */ mtw EEM;
            {
                this.EEM = mtw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = mtw.ePm().getText();
                try {
                    int n = Integer.parseInt(string);
                    mtw.ePn().setValue(n);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        });
        EEA.setMaximum(200000);
        EEA.setMinimum(0);
        EEA.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(0, Color.white, new Color(165, 163, 151)), "Cost"));
        EEA.setOpaque(false);
        EEA.setBounds(new Rectangle(2, 47, 363, 46));
        EEA.setPaintTicks(true);
        EEA.setPaintLabels(true);
        EEA.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtw EEM;
            {
                this.EEM = mtw2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mtw.ePm().setText(String.valueOf(mtw.ePn().getValue()));
            }
        });
        this.EEB.setLayout(this.DGd);
        EEC.setMaximum(100);
        EEC.setMinimum(0);
        EEC.setValue(0);
        EEC.setBorder(new TitledBorder(BorderFactory.createEtchedBorder(0, Color.white, new Color(165, 163, 151)), "Drop Chance (%)"));
        EEC.setOpaque(false);
        EEC.setBounds(new Rectangle(2, 94, 362, 45));
        EEC.setPaintTicks(true);
        EEC.setPaintLabels(true);
        EEC.setPaintTrack(true);
        EEC.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mtw EEM;
            {
                this.EEM = mtw2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                mtw.ePp().setText(String.valueOf(mtw.ePo().getValue()));
            }
        });
        EED.setBorder(this.EEG);
        EED.setMinimumSize(new Dimension(65, 34));
        EED.setOpaque(false);
        EED.setPreferredSize(new Dimension(65, 34));
        EED.setText("0");
        EED.setHorizontalAlignment(0);
        EED.setBounds(new Rectangle(364, 102, 66, 35));
        EED.addActionListener(new ActionListener(this){
            final /* synthetic */ mtw EEM;
            {
                this.EEM = mtw2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = mtw.ePp().getText();
                try {
                    int n = Integer.parseInt(string);
                    mtw.ePo().setValue(n);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        });
        this.EEE.setColumns(1);
        this.EEE.setRows(4);
        EEx.setText("resourceNameLabel");
        this.EEK.setFont(new Font("Dialog", 1, 12));
        this.EEK.setToolTipText("");
        this.EEK.setText("     Ok     ");
        this.EEL.setFont(new Font("Dialog", 1, 12));
        this.EEL.setText("   Cancel   ");
        this.EEJ.setLayout(this.DDV);
        this.DDV.setAlignment(2);
        this.DDV.setVgap(10);
        this.EEw.add(EEx);
        this.EEw.add(this.EEy);
        this.EEy.add((Component)EEz, "East");
        this.EEy.add((Component)EEA, "Center");
        this.EEw.add(this.EEB);
        this.EEw.add(this.EEJ);
        this.EEJ.add(this.EEK);
        this.EEJ.add(this.EEL);
        this.EEL.addActionListener(this);
        this.EEK.addActionListener(this);
        this.EEB.add((Component)EEC, "Center");
        this.EEB.add((Component)EED, "East");
        this.getContentPane().add(this.EEw);
    }

    public static Vector g(String string, String string2, String string3, String string4) {
        mtw mtw2 = new mtw(string, string2, string3, string4);
        EEA.setValue(Integer.parseInt(string3));
        EEz.setText(string3);
        EEx.setText(string2);
        EEx.setHorizontalAlignment(0);
        if (string4 != null && !string4.equals("")) {
            if (string4.indexOf(".") != -1) {
                EEC.setValue(Integer.parseInt(string4.substring(0, string4.indexOf("."))));
                EED.setText(string4);
            }
        } else {
            EEC.setValue(0);
            EED.setText("0.0");
        }
        mtw2.setVisible(true);
        return values;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        values = new Vector();
        if (actionEvent.getSource() == this.EEL) {
            values.add(this.EEu);
            if (this.EEv.indexOf(".") == -1) {
                values.add(this.EEv + ".0");
            } else {
                values.add(this.EEv);
            }
            this.dispose();
        } else {
            this.EEv = String.valueOf(EEC.getValue());
            this.EEu = String.valueOf(EEA.getValue());
            values.add(this.EEu);
            if (this.EEv.indexOf(".") == -1) {
                values.add(this.EEv + ".0");
            } else {
                values.add(this.EEv);
            }
            this.dispose();
        }
    }

    static /* synthetic */ JTextField ePm() {
        return EEz;
    }

    static /* synthetic */ JSlider ePn() {
        return EEA;
    }

    static /* synthetic */ JSlider ePo() {
        return EEC;
    }

    static /* synthetic */ JTextField ePp() {
        return EED;
    }
}

