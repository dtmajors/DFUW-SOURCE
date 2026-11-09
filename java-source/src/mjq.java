/*
 * Decompiled with CFR.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mjq
extends JPanel {
    mjo DDO = null;
    JSlider DDP = null;
    lcq aWl = null;
    boolean bdP = false;
    List<ActionListener> DDQ = new ArrayList<ActionListener>();

    public void addActionListener(ActionListener actionListener) {
        this.DDQ.add(actionListener);
    }

    public mjq(lcq lcq2) {
        super(new FlowLayout());
        this.DDO = new mjo();
        this.DDO.setPreferredSize(new Dimension(20, 20));
        mjq mjq2 = this;
        this.DDO.addActionListener(new ActionListener(this, mjq2){
            final /* synthetic */ mjq DDR;
            final /* synthetic */ mjq DDS;
            {
                this.DDS = mjq2;
                this.DDR = mjq3;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                Color color = JColorChooser.showDialog(this.DDR, "Pick a Color ", this.DDS.aWl.getColor());
                if (color != null) {
                    float f = (float)color.getRed() / 255.0f;
                    float f2 = (float)color.getGreen() / 255.0f;
                    float f3 = (float)color.getBlue() / 255.0f;
                    mjq.a(this.DDS, new lcq(f, f2, f3, this.DDS.aWl.a));
                }
            }
        });
        this.add(this.DDO);
        this.add(new JLabel("A:"));
        this.DDP = new JSlider();
        this.DDP.setMinimum(0);
        this.DDP.setMaximum(255);
        this.DDP.setPreferredSize(new Dimension(100, 20));
        this.DDP.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mjq DDS;
            {
                this.DDS = mjq2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                float f = (float)this.DDS.DDP.getValue() / 255.0f;
                mjq.a(this.DDS, new lcq(this.DDS.aWl.r, this.DDS.aWl.g, this.DDS.aWl.b, f));
            }
        });
        this.add(this.DDP);
        this.g(lcq2);
    }

    private void g(lcq lcq2) {
        if (this.bdP) {
            return;
        }
        this.bdP = true;
        lcq lcq3 = this.aWl;
        this.aWl = lcq2;
        Color color = lcq2.getColor();
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
        this.DDO.setBackground(color2);
        this.DDO.setColor(color2);
        this.DDO.updateUI();
        this.DDP.setValue((int)(lcq2.a * 255.0f));
        this.bdP = false;
        if (lcq3 == null || !this.aWl.X(lcq3)) {
            for (ActionListener actionListener : this.DDQ) {
                actionListener.actionPerformed(new ActionEvent(this, 0, ""));
            }
        }
    }

    public lcq eCP() {
        return this.aWl;
    }

    static /* synthetic */ void a(mjq mjq2, lcq lcq2) {
        mjq2.g(lcq2);
    }
}

