/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

class kzg
extends JPanel {
    private lcq qnH = null;
    private Color qnI = null;
    private JTextField qnJ = null;
    private JButton qnK = null;

    public kzg(lcq lcq2) {
        assert (lcq2 != null);
        this.qnH = lcq2;
        this.qnI = lcq2.getColor();
        this.init();
    }

    public lcq getColor() {
        return this.qnH;
    }

    public void setColor(lcq lcq2) {
        assert (lcq2 != null);
        this.qnH = lcq2;
        this.qnI = lcq2.getColor();
        this.qnJ.setText(lcq2.toString());
    }

    private void xR(String string) {
        if (string == null || string.trim().equals("")) {
            this.qnJ.setText(this.qnH.toString());
            return;
        }
        try {
            lcq lcq2 = lcq.zc(string);
            if (lcq2.r < 0.0f || lcq2.r > 1.0f) {
                return;
            }
            if (lcq2.g < 0.0f || lcq2.g > 1.0f) {
                return;
            }
            if (lcq2.b < 0.0f || lcq2.b > 1.0f) {
                return;
            }
            if (lcq2.a < 0.0f || lcq2.a > 1.0f) {
                return;
            }
            this.qnH = lcq2;
            this.qnI = this.qnH.getColor();
        }
        catch (Exception exception) {
            this.qnJ.setText(this.qnH.toString());
        }
    }

    private void init() {
        this.qnJ = new JTextField(13);
        this.qnJ.setBackground(this.qnI);
        this.qnJ.setEditable(true);
        this.qnJ.setText(this.qnH.toString());
        this.qnJ.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ kzg qnL;
            {
                this.qnL = kzg2;
            }

            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 10) {
                    kzg.a(this.qnL, kzg.a(this.qnL).getText());
                }
            }
        });
        this.qnK = new JButton("Change Color");
        this.qnK.addActionListener(new ActionListener(this){
            final /* synthetic */ kzg qnL;
            {
                this.qnL = kzg2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                Color color = JColorChooser.showDialog(this.qnL, "Choose New Color", kzg.b(this.qnL));
                if (color != null) {
                    kzg.a(this.qnL, color);
                    kzg.a(this.qnL, new lcq(kzg.b(this.qnL)));
                    kzg.a(this.qnL).setText(kzg.c(this.qnL).toString());
                }
            }
        });
        this.setLayout(new FlowLayout());
        this.add(this.qnJ);
        this.add(this.qnK);
    }

    static /* synthetic */ JTextField a(kzg kzg2) {
        return kzg2.qnJ;
    }

    static /* synthetic */ void a(kzg kzg2, String string) {
        kzg2.xR(string);
    }

    static /* synthetic */ Color b(kzg kzg2) {
        return kzg2.qnI;
    }

    static /* synthetic */ Color a(kzg kzg2, Color color) {
        kzg2.qnI = color;
        return kzg2.qnI;
    }

    static /* synthetic */ lcq a(kzg kzg2, lcq lcq2) {
        kzg2.qnH = lcq2;
        return kzg2.qnH;
    }

    static /* synthetic */ lcq c(kzg kzg2) {
        return kzg2.qnH;
    }
}

