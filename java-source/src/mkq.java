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
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class mkq
extends JPanel
implements ActionListener {
    private boolean DDT = false;
    private Color DFz = null;
    private JButton DFA = null;
    private JInternalFrame DFH = null;
    private mkt DFD = null;
    private mkt DFE = null;
    private mkt DFF = null;
    private Dimension DFx = new Dimension(300, 40);
    private boolean DDW = true;
    protected mjp DFG;

    public mkq() {
        this(null, null, "Color", new Color(1, 1, 1), false);
    }

    public mkq(mkx mkx2, mjp mjp2, String string, Color color) {
        this(mkx2, mjp2, string, color, true);
    }

    public mkq(mkx mkx2, mjp mjp2, String string, Color color, boolean bl) {
        this.DDW = bl;
        this.DFH = mkx2;
        this.DFG = mjp2;
        this.DFz = color;
        this.setLayout(new FlowLayout(2));
        float f = (float)this.DFz.getAlpha() / 255.0f;
        float f2 = (float)this.DFz.getRed() / 255.0f;
        float f3 = (float)this.DFz.getGreen() / 255.0f;
        float f4 = (float)this.DFz.getBlue() / 255.0f;
        JLabel jLabel = new JLabel(string);
        this.add(jLabel);
        this.DFD = new mkt("R", Float.toString(f2), false);
        this.DFD.aeD(4);
        this.add(this.DFD);
        this.DFE = new mkt("G", Float.toString(f3), false);
        this.DFE.aeD(4);
        this.add(this.DFE);
        this.DFF = new mkt("B", Float.toString(f4), false);
        this.DFF.aeD(4);
        this.add(this.DFF);
        this.DFA = new JButton();
        Dimension dimension = new Dimension(40, 20);
        this.DFA.setPreferredSize(dimension);
        this.DFA.setBackground(this.DFz);
        this.DFA.addActionListener(this);
        this.add(this.DFA);
        this.setPreferredSize(this.DFx);
        if (this.DDW) {
            this.setBorder(new EtchedBorder());
        }
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
            this.DFH.getDesktopPane().add(this.DFG);
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
        return this.DFz;
    }

    public void setColor(Color color) {
        this.DFz = color;
        float f = (float)this.DFz.getRed() / 255.0f;
        float f2 = (float)this.DFz.getGreen() / 255.0f;
        float f3 = (float)this.DFz.getBlue() / 255.0f;
        this.DFD.Cf(Float.toString(f));
        this.DFE.Cf(Float.toString(f2));
        this.DFF.Cf(Float.toString(f3));
        this.DFA.setBackground(this.DFz);
        this.DFA.setForeground(this.DFz);
    }

    public boolean hasChanged() {
        boolean bl = this.DDT;
        this.DDT = false;
        return bl;
    }

    public void c(JInternalFrame jInternalFrame) {
        this.DFH = jInternalFrame;
    }

    public void a(mjp mjp2) {
        this.DFG = mjp2;
    }
}

