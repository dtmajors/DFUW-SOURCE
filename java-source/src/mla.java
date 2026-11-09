/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mla
extends JPanel {
    private boolean DDT = false;
    private JSlider DGv = null;
    private JLabel DGw = new JLabel("title");
    private JTextField DGx = new JTextField(6);
    private float aXs = 10.0f;
    private float bnT = 0.0f;
    private float DGy = 1.0f;
    private float DGz = 0.0f;
    private float DGA = 2.0f;
    private boolean DDW = false;
    private long DGB = 0L;
    private boolean DGC = false;
    private mjg DGD;

    public mla() {
    }

    public mla(String string, float f2, float f3, float f4, int n) {
        this.DDW = true;
        this.DGA = n;
        this.aXs = f3;
        this.bnT = f2;
        this.DGz = f4;
        this.DGw.setText(string);
        this.eDs();
    }

    public mla(String string, float f2, float f3, float f4, int n, boolean bl) {
        this.DGA = n;
        this.DDW = bl;
        this.aXs = f3;
        this.bnT = f2;
        this.DGz = f4;
        this.DGw.setText(string);
        this.eDs();
    }

    public void eDs() {
        this.DGy = (float)Math.pow(10.0, this.DGA);
        int n = (int)(this.bnT * this.DGy);
        int n2 = (int)(this.aXs * this.DGy);
        if (this.DGz > this.aXs) {
            lfn.b(4, "SFSliderPanel", "SFSliderPanel() : CurrentValue [" + this.DGz + "] is bigger than MaxValue [" + this.aXs + "]. Setting CurrentValue to Max!");
            this.DGz = this.aXs;
        }
        this.setLayout(new FlowLayout(2, 4, 4));
        this.DGv = new JSlider(n, n2);
        this.DGv.setValue((int)(this.DGz * this.DGy));
        this.DGv.setBorder(new EtchedBorder());
        this.DGx.setText(Float.toString(this.DGz));
        this.DGx.setBackground(Color.WHITE);
        this.DGx.setOpaque(true);
        this.add(this.DGw);
        this.add(this.DGv);
        this.add(this.DGx);
        this.DGv.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mla DGE;
            {
                this.DGE = mla2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                float f2 = (float)((double)mla.a(this.DGE).getValue() / (double)mla.b(this.DGE));
                mla.c(this.DGE).setText(Float.toString(f2));
            }
        });
        this.DGx.addKeyListener(new KeyAdapter(this){
            final /* synthetic */ mla DGE;
            {
                this.DGE = mla2;
            }

            public void keyReleased(KeyEvent keyEvent) {
                this.DGE.d(keyEvent);
            }
        });
        if (this.DDW) {
            this.setBorder(new EtchedBorder());
        }
    }

    public void a(ChangeListener changeListener) {
        this.DGv.addChangeListener(changeListener);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        Object object = actionEvent.getSource();
        if (object == this.DGv) {
            this.DDT = true;
        }
    }

    public boolean hasChanged() {
        boolean bl = this.DDT;
        this.DDT = false;
        return bl;
    }

    public float getValue() {
        return (float)this.DGv.getValue() / this.DGy;
    }

    public void or(float f2) {
        this.DGv.setValue((int)(f2 * this.DGy));
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.DGv.setEnabled(bl);
        this.DGx.setEnabled(bl);
    }

    public void d(KeyEvent keyEvent) {
        if (!this.DGC) {
            this.DGB = System.currentTimeMillis();
            this.DGD = new mjg(this){
                final /* synthetic */ mla DGE;
                {
                    this.DGE = mla2;
                }

                public Object Hv() {
                    mla.d(this.DGE);
                    return "done";
                }

                public void finished() {
                    System.out.println("finished");
                }
            };
            this.DGD.start();
        } else {
            this.DGB = System.currentTimeMillis();
        }
    }

    private void eDG() {
        this.DGC = true;
        while (System.currentTimeMillis() < this.DGB + 500L) {
            try {
                Thread.sleep(50L);
            }
            catch (Exception exception) {}
        }
        float f2 = 0.0f;
        try {
            f2 = Float.parseFloat(this.DGx.getText());
        }
        catch (NumberFormatException numberFormatException) {
            f2 = (float)((double)this.DGv.getMinimum() / (double)this.DGy);
            lfn.b(0, "SFSliderPanel", "applyLabelChange() : Not a valid number: " + this.DGx.getText());
            Toolkit.getDefaultToolkit().beep();
        }
        int n = (int)(f2 * this.DGy);
        this.DGv.setValue(n);
        this.DDT = true;
        System.out.println("Changed value to " + f2);
        this.DGC = false;
    }

    public void ah(float f2) {
        this.aXs = f2;
        int n = (int)(f2 * this.DGy);
        this.DGv.setMaximum(n);
    }

    public void ai(float f2) {
        this.bnT = f2;
        int n = (int)(f2 * this.DGy);
        this.DGv.setMinimum(n);
    }

    public void H(float f2) {
        this.DGz = f2;
        if (this.DGz > this.aXs) {
            lfn.b(4, "SFSliderPanel", "SFSliderPanel() : CurrentValue [" + this.DGz + "] is bigger than MaxValue [" + this.aXs + "]. Setting CurrentValue to Max!");
            this.DGz = this.aXs;
        }
        this.DGv.setValue((int)(this.DGz * this.DGy));
    }

    public void Cp(String string) {
        this.DGw.setText(string);
    }

    public boolean getValueIsAdjusting() {
        return this.DGv.getValueIsAdjusting();
    }

    public void zj(boolean bl) {
        this.DGv.setPaintTicks(bl);
        if (bl) {
            this.DGv.setMajorTickSpacing((int)((double)(this.DGy * this.aXs) / 4.0));
            this.DGv.setMinorTickSpacing((int)((double)(this.DGy * this.bnT) / 10.0));
        }
    }

    static /* synthetic */ JSlider a(mla mla2) {
        return mla2.DGv;
    }

    static /* synthetic */ float b(mla mla2) {
        return mla2.DGy;
    }

    static /* synthetic */ JTextField c(mla mla2) {
        return mla2.DGx;
    }

    static /* synthetic */ void d(mla mla2) {
        mla2.eDG();
    }
}

