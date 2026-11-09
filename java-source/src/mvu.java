/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mvu
extends mkx {
    private drl EMa = null;
    private aux DEC = null;
    private JTextField EMb;
    private JTextField EMc;
    private JTextField EMd;
    private JSlider EMe;
    private JSlider EMf;
    private JSlider EMg;
    private JButton EMh;
    private float EMi;
    private float EMj;
    private float EMk;
    private String EMl;
    private JComboBox comboBox;

    public static void main(String[] stringArray) {
        EventQueue.invokeLater(new Runnable(){

            public void run() {
                try {
                    mvu mvu2 = new mvu(null);
                    mvu2.setVisible(true);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
    }

    public mvu(drl drl2) {
        this.qtg.addActionListener(new ActionListener(this){
            final /* synthetic */ mvu EMm;
            {
                this.EMm = mvu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvu.b(this.EMm).setValue((int)(mvu.a(this.EMm) / 1.5f * (float)mvu.b(this.EMm).getMaximum() + 0.5f));
                mvu.d(this.EMm).setValue((int)(mvu.c(this.EMm) / 8.0f * (float)mvu.d(this.EMm).getMaximum() + 0.5f));
                mvu.f(this.EMm).setValue((int)(mvu.e(this.EMm) / 8.0f * (float)mvu.f(this.EMm).getMaximum() + 0.5f));
                this.EMm.eQK().setSelectedItem(new String(mvu.g(this.EMm)));
            }
        });
        this.setResizable(false);
        this.setMaximizable(false);
        this.setTitle("Global PostFX Settings");
        assert (drl2 != null);
        this.EMa = drl2;
        this.setBounds(100, 100, 450, 300);
        this.DGa.setLayout(null);
        this.EMe = new JSlider();
        this.EMe.setBounds(86, 29, 229, 23);
        this.DGa.add(this.EMe);
        JLabel jLabel = new JLabel("Exposure");
        jLabel.setBounds(23, 38, 46, 14);
        this.DGa.add(jLabel);
        this.EMb = new JTextField();
        this.EMb.addActionListener(new ActionListener(this){
            final /* synthetic */ mvu EMm;
            {
                this.EMm = mvu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = mvu.h(this.EMm).getText();
                try {
                    float f2 = Float.valueOf(string.trim()).floatValue() / 1.5f;
                    int n = (int)(f2 * (float)mvu.b(this.EMm).getMaximum() + 0.5f);
                    if (n < 0) {
                        n = 0;
                    }
                    if (n > mvu.b(this.EMm).getMaximum()) {
                        n = mvu.b(this.EMm).getMaximum();
                    }
                    mvu.b(this.EMm).setValue(n);
                    float f3 = 1.5f * ((float)n / (float)mvu.b(this.EMm).getMaximum());
                    mvu.a(this.EMm, f3);
                    mvu.h(this.EMm).setText("" + f3);
                }
                catch (NumberFormatException numberFormatException) {
                    float f4 = 1.5f * (float)mvu.b(this.EMm).getValue() / (float)mvu.b(this.EMm).getMaximum();
                    mvu.h(this.EMm).setText("" + f4);
                }
            }
        });
        this.EMb.setBounds(333, 32, 57, 20);
        this.DGa.add(this.EMb);
        this.EMb.setColumns(10);
        JLabel jLabel2 = new JLabel("BrightPass");
        jLabel2.setBounds(23, 83, 57, 14);
        this.DGa.add(jLabel2);
        this.EMf = new JSlider();
        this.EMf.setBounds(86, 74, 229, 23);
        this.DGa.add(this.EMf);
        this.EMc = new JTextField();
        this.EMc.addActionListener(new ActionListener(this){
            final /* synthetic */ mvu EMm;
            {
                this.EMm = mvu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = mvu.i(this.EMm).getText();
                try {
                    float f2 = Float.valueOf(string.trim()).floatValue() / 8.0f;
                    int n = (int)(f2 * (float)mvu.d(this.EMm).getMaximum() + 0.5f);
                    if (n < 0) {
                        n = 0;
                    }
                    if (n > mvu.d(this.EMm).getMaximum()) {
                        n = mvu.d(this.EMm).getMaximum();
                    }
                    mvu.d(this.EMm).setValue(n);
                    float f3 = 8.0f * ((float)n / (float)mvu.d(this.EMm).getMaximum());
                    mvu.b(this.EMm, f3);
                    mvu.i(this.EMm).setText("" + 8.0f * ((float)n / (float)mvu.d(this.EMm).getMaximum()));
                }
                catch (NumberFormatException numberFormatException) {
                    float f4 = 8.0f * (float)mvu.d(this.EMm).getValue() / (float)mvu.d(this.EMm).getMaximum();
                    mvu.i(this.EMm).setText("" + f4);
                }
            }
        });
        this.EMc.setColumns(10);
        this.EMc.setBounds(333, 80, 57, 20);
        this.DGa.add(this.EMc);
        JLabel jLabel3 = new JLabel("Bloom");
        jLabel3.setBounds(23, 131, 57, 14);
        this.DGa.add(jLabel3);
        this.EMg = new JSlider();
        this.EMg.setBounds(86, 122, 229, 23);
        this.DGa.add(this.EMg);
        this.EMd = new JTextField();
        this.EMd.addActionListener(new ActionListener(this){
            final /* synthetic */ mvu EMm;
            {
                this.EMm = mvu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                String string = mvu.j(this.EMm).getText();
                try {
                    float f2 = Float.valueOf(string.trim()).floatValue() / 8.0f;
                    int n = (int)(f2 * (float)mvu.f(this.EMm).getMaximum() + 0.5f);
                    if (n < 0) {
                        n = 0;
                    }
                    if (n > mvu.f(this.EMm).getMaximum()) {
                        n = mvu.f(this.EMm).getMaximum();
                    }
                    mvu.f(this.EMm).setValue(n);
                    float f3 = 8.0f * ((float)n / (float)mvu.f(this.EMm).getMaximum());
                    mvu.c(this.EMm, f3);
                    mvu.j(this.EMm).setText("" + f3);
                }
                catch (NumberFormatException numberFormatException) {
                    float f4 = 8.0f * (float)mvu.f(this.EMm).getValue() / (float)mvu.f(this.EMm).getMaximum();
                    mvu.j(this.EMm).setText("" + f4);
                }
            }
        });
        this.EMd.setColumns(10);
        this.EMd.setBounds(333, 128, 57, 20);
        this.DGa.add(this.EMd);
        this.comboBox = new JComboBox();
        this.comboBox.addActionListener(new ActionListener(this){
            final /* synthetic */ mvu EMm;
            {
                this.EMm = mvu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvu.a(this.EMm, (String)this.EMm.eQK().getSelectedItem());
            }
        });
        this.comboBox.setBounds(108, 176, 219, 20);
        this.DGa.add(this.comboBox);
        JLabel jLabel4 = new JLabel("Color Grader");
        jLabel4.setBounds(23, 179, 69, 14);
        this.DGa.add(jLabel4);
        this.EMh = new JButton("Defaults");
        this.EMh.addActionListener(new ActionListener(this){
            final /* synthetic */ mvu EMm;
            {
                this.EMm = mvu2;
            }

            public void actionPerformed(ActionEvent actionEvent) {
                mvu.b(this.EMm).setValue((int)(0.4f * (float)mvu.b(this.EMm).getMaximum() + 0.5f));
                mvu.d(this.EMm).setValue((int)(0.125f * (float)mvu.d(this.EMm).getMaximum() + 0.5f));
                mvu.f(this.EMm).setValue((int)(0.125f * (float)mvu.f(this.EMm).getMaximum() + 0.5f));
            }
        });
        this.DGb.add(this.EMh);
        this.eQJ();
        this.EMe.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvu EMm;
            {
                this.EMm = mvu2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                float f2 = 1.5f * (float)jSlider.getValue() / (float)jSlider.getMaximum();
                mvu.h(this.EMm).setText("" + f2);
                mvu.a(this.EMm, f2);
            }
        });
        this.EMf.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvu EMm;
            {
                this.EMm = mvu2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                float f2 = 8.0f * (float)jSlider.getValue() / (float)jSlider.getMaximum();
                mvu.i(this.EMm).setText("" + f2);
                mvu.b(this.EMm, f2);
            }
        });
        this.EMg.addChangeListener(new ChangeListener(this){
            final /* synthetic */ mvu EMm;
            {
                this.EMm = mvu2;
            }

            public void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                float f2 = 8.0f * (float)jSlider.getValue() / (float)jSlider.getMaximum();
                mvu.j(this.EMm).setText("" + f2);
                mvu.c(this.EMm, f2);
            }
        });
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    private void oO(float f2) {
        assert (this.DEC != null);
        fas fas2 = (fas)this.DEC.d(1810);
        fas2.Gg(2);
        fas2.on(this.EMa.getGUID());
        fas2.f(lcr.qzr);
        fas2.hE(f2);
        this.DEC.a((dxq)fas2);
    }

    private void oP(float f2) {
        assert (this.DEC != null);
        fas fas2 = (fas)this.DEC.d(1810);
        fas2.Gg(8);
        fas2.on(this.EMa.getGUID());
        fas2.f(lcr.qzr);
        fas2.hF(f2);
        this.DEC.a((dxq)fas2);
    }

    private void oQ(float f2) {
        assert (this.DEC != null);
        fas fas2 = (fas)this.DEC.d(1810);
        fas2.Gg(16);
        fas2.on(this.EMa.getGUID());
        fas2.f(lcr.qzr);
        fas2.hG(f2);
        this.DEC.a((dxq)fas2);
    }

    private void DH(String string) {
        if (this.DEC == null) {
            return;
        }
        fas fas2 = (fas)this.DEC.d(1810);
        fas2.Gg(32);
        fas2.on(this.EMa.getGUID());
        fas2.f(lcr.qzr);
        fas2.jb(string);
        this.DEC.a((dxq)fas2);
    }

    private void eQJ() {
        assert (this.EMa != null);
        float f2 = 0.0f;
        int n = 0;
        this.EMi = this.EMa.bvS();
        f2 = this.EMi / 1.5f;
        n = (int)(f2 * (float)this.EMe.getMaximum() + 0.5f);
        if (n < 0) {
            n = 0;
        }
        if (n > this.EMe.getMaximum()) {
            n = this.EMe.getMaximum();
        }
        this.EMe.setValue(n);
        this.EMb.setText("" + this.EMi);
        this.EMj = this.EMa.bvT();
        f2 = this.EMj / 8.0f;
        n = (int)(f2 * (float)this.EMf.getMaximum() + 0.5f);
        if (n < 0) {
            n = 0;
        }
        if (n > this.EMf.getMaximum()) {
            n = this.EMf.getMaximum();
        }
        this.EMf.setValue(n);
        this.EMc.setText("" + this.EMj);
        this.EMk = this.EMa.bvU();
        f2 = this.EMk / 8.0f;
        n = (int)(f2 * (float)this.EMg.getMaximum() + 0.5f);
        if (n < 0) {
            n = 0;
        }
        if (n > this.EMg.getMaximum()) {
            n = this.EMg.getMaximum();
        }
        this.EMg.setValue(n);
        this.EMd.setText("" + this.EMk);
        this.EMl = new String(this.EMa.bvP());
        int n2 = -1;
        this.eQK().removeAllItems();
        int n3 = 0;
        for (String string : this.EMa.bvO()) {
            this.eQK().addItem(string);
            if (string.equals(this.EMa.bvP())) {
                n2 = n3;
            }
            ++n3;
        }
        if (n2 >= 0) {
            this.eQK().setSelectedIndex(n2);
        } else {
            this.eQK().setSelectedItem(new String("neutral"));
        }
    }

    public JComboBox eQK() {
        return this.comboBox;
    }

    static /* synthetic */ float a(mvu mvu2) {
        return mvu2.EMi;
    }

    static /* synthetic */ JSlider b(mvu mvu2) {
        return mvu2.EMe;
    }

    static /* synthetic */ float c(mvu mvu2) {
        return mvu2.EMj;
    }

    static /* synthetic */ JSlider d(mvu mvu2) {
        return mvu2.EMf;
    }

    static /* synthetic */ float e(mvu mvu2) {
        return mvu2.EMk;
    }

    static /* synthetic */ JSlider f(mvu mvu2) {
        return mvu2.EMg;
    }

    static /* synthetic */ String g(mvu mvu2) {
        return mvu2.EMl;
    }

    static /* synthetic */ JTextField h(mvu mvu2) {
        return mvu2.EMb;
    }

    static /* synthetic */ void a(mvu mvu2, float f2) {
        mvu2.oO(f2);
    }

    static /* synthetic */ JTextField i(mvu mvu2) {
        return mvu2.EMc;
    }

    static /* synthetic */ void b(mvu mvu2, float f2) {
        mvu2.oP(f2);
    }

    static /* synthetic */ JTextField j(mvu mvu2) {
        return mvu2.EMd;
    }

    static /* synthetic */ void c(mvu mvu2, float f2) {
        mvu2.oQ(f2);
    }

    static /* synthetic */ void a(mvu mvu2, String string) {
        mvu2.DH(string);
    }
}

