/*
 * Decompiled with CFR.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class kyw
extends JPanel {
    private kyr qkM;
    private JSplitPane qnc;
    private JPanel qnd;
    private JPanel qne;
    private kyx qnf = null;
    private kyx qng = null;

    public kyw(kyr kyr2) {
        this.qkM = kyr2;
        this.init();
    }

    public void xV(boolean bl) {
        if (bl) {
            this.qnc.setOrientation(1);
        } else {
            this.qnc.setOrientation(0);
        }
    }

    public void a(kyx kyx2) {
        this.qnf = kyx2;
        if (this.qnf == null) {
            this.qnc.setTopComponent(this.qnd);
        } else {
            this.qnc.setTopComponent(this.qnf);
        }
    }

    public void b(kyx kyx2) {
        this.qng = kyx2;
        if (this.qng == null) {
            this.qnc.setBottomComponent(this.qne);
        } else {
            this.qnc.setBottomComponent(this.qng);
        }
    }

    private void init() {
        this.setBackground(this.qkM.eja().qjm);
        this.qnc = new JSplitPane(0);
        this.qnd = new JPanel();
        this.qnd.setBackground(Color.BLUE);
        this.qne = new JPanel();
        this.qne.setBackground(Color.RED);
        this.a(null);
        this.b(null);
        this.qnc.setContinuousLayout(true);
        this.qnc.setDividerLocation(0.5);
        this.qnc.setResizeWeight(0.5);
        this.setLayout(new BorderLayout());
        this.add((Component)this.qnc, "Center");
        this.setMinimumSize(new Dimension(50, 50));
    }
}

