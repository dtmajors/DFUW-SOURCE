/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

class kze
extends JPanel {
    private int qnw = 0;
    private int[] qnx = null;
    private String[] qny = null;
    private boolean qnz = false;
    private boolean[] qnA = null;
    private JComboBox qnB = null;
    private JComboBox qnC = null;
    private JButton qnD = null;
    private Color qnE = new Color(204, 204, 255);
    private Color qnF = new Color(255, 153, 153);

    public kze(int n, int[] nArray, String[] stringArray, boolean bl) {
        assert (n >= 0);
        assert (nArray != null);
        assert (stringArray != null);
        assert (nArray.length == stringArray.length);
        this.qnw = n;
        this.qnx = nArray;
        this.qny = stringArray;
        this.qnz = bl;
        this.init();
    }

    public int ekb() {
        if (this.qnz) {
            return this.qnw;
        }
        return this.qnB.getSelectedIndex();
    }

    public void abn(int n) {
        assert (n >= 0);
        this.qnw = n;
        if (this.qnz) {
            for (int i2 = 0; i2 < this.qnx.length; ++i2) {
                if ((n & i2) <= 0) continue;
                this.qnA[i2] = true;
                return;
            }
        } else {
            this.qnB.setSelectedIndex(n);
        }
    }

    public void abo(int n) {
        assert (this.qnz);
        boolean bl = this.qnA[n] = !this.qnA[n];
        this.qnw = this.qnA[n] ? (this.qnw |= 1 << n) : (this.qnw &= ~(1 << n));
    }

    private void init() {
        this.qnB = new JComboBox<String>(this.qny);
        this.qnB.setBackground(Color.white);
        this.qnB.setEditable(false);
        this.setLayout(new FlowLayout());
        this.add(this.qnB);
        if (this.qnz) {
            this.qnA = new boolean[this.qnx.length];
            this.qnB.setRenderer(new a(this));
            this.qnD = new JButton("Toggle Bit");
            this.qnD.addActionListener(new ActionListener(this){
                final /* synthetic */ kze qnG;
                {
                    this.qnG = kze2;
                }

                public void actionPerformed(ActionEvent actionEvent) {
                    this.qnG.abo(kze.a(this.qnG).getSelectedIndex());
                }
            });
            this.add(this.qnD);
        }
    }

    static /* synthetic */ JComboBox a(kze kze2) {
        return kze2.qnB;
    }

    static /* synthetic */ Color b(kze kze2) {
        return kze2.qnF;
    }

    static /* synthetic */ boolean[] c(kze kze2) {
        return kze2.qnA;
    }

    static /* synthetic */ Color d(kze kze2) {
        return kze2.qnE;
    }
}

