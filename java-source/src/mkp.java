/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class mkp
extends JPanel
implements ActionListener {
    private Color DFz = null;
    private JButton DFA = null;
    private mkx DFB = null;
    private mkt DFC = null;
    private mkt DFD = null;
    private mkt DFE = null;
    private mkt DFF = null;
    protected mjp DFG;

    public mkp(mkx mkx2, mjp mjp2, String string, Color color) {
        this(mkx2, mjp2, string, color, true);
    }

    public mkp(mkx mkx2, mjp mjp2, String string, Color color, boolean bl) {
        this.DFB = mkx2;
        this.DFz = color;
        this.setLayout(new FlowLayout());
        if (bl) {
            this.setBorder(new EtchedBorder());
        }
        this.DFG = mjp2;
        float f = (float)this.DFz.getAlpha() / 255.0f;
        float f2 = (float)this.DFz.getRed() / 255.0f;
        float f3 = (float)this.DFz.getGreen() / 255.0f;
        float f4 = (float)this.DFz.getBlue() / 255.0f;
        JLabel jLabel = new JLabel(string);
        this.add(jLabel);
        this.DFA = new JButton();
        Dimension dimension = new Dimension(40, 20);
        this.DFA.setSize(dimension);
        this.DFA.setPreferredSize(dimension);
        this.DFA.setBackground(this.DFz);
        this.DFA.addActionListener(this);
        this.add(this.DFA);
        this.DFC = new mkt("A", Float.toString(f));
        this.DFC.aeD(4);
        this.add(this.DFC);
        this.DFD = new mkt("R", Float.toString(f2));
        this.DFD.aeD(4);
        this.add(this.DFD);
        this.DFE = new mkt("G", Float.toString(f3));
        this.DFE.aeD(4);
        this.add(this.DFE);
        this.DFF = new mkt("B", Float.toString(f4));
        this.DFF.aeD(4);
        this.add(this.DFF);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object = actionEvent.getSource();
        if (object == this.DFA) {
            this.B(actionEvent);
        }
    }

    private void B(ActionEvent actionEvent) {
        if (this.DFG.getDesktopPane() == null) {
            this.DFB.getDesktopPane().add(this.DFG);
        }
        if (!this.DFG.isVisible()) {
            this.DFG.setVisible(true);
        }
        if (this.DFG.isIcon()) {
            try {
                this.DFG.setIcon(false);
            }
            catch (PropertyVetoException propertyVetoException) {
                System.out.println("SFLabelAndTextColorPanel Exception: " + propertyVetoException);
                propertyVetoException.printStackTrace();
            }
        }
    }

    public Color getColor() {
        float f = Float.parseFloat(this.DFC.eCU());
        float f2 = Float.parseFloat(this.DFD.eCU());
        float f3 = Float.parseFloat(this.DFE.eCU());
        float f4 = Float.parseFloat(this.DFF.eCU());
        this.DFz = new Color(f2, f3, f4, f);
        return this.DFz;
    }

    public void setColor(Color color) {
        this.DFz = color;
        float f = (float)this.DFz.getAlpha() / 255.0f;
        float f2 = (float)this.DFz.getRed() / 255.0f;
        float f3 = (float)this.DFz.getGreen() / 255.0f;
        float f4 = (float)this.DFz.getBlue() / 255.0f;
        this.DFC.Cf(Float.toString(f));
        this.DFD.Cf(Float.toString(f2));
        this.DFE.Cf(Float.toString(f3));
        this.DFF.Cf(Float.toString(f4));
        this.DFA.setBackground(this.DFz);
    }

    public boolean hasChanged() {
        return this.DFC.hasChanged() || this.DFD.hasChanged() || this.DFE.hasChanged() || this.DFF.hasChanged();
    }
}

