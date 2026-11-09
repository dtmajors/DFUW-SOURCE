/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  lcr
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mvr
extends mkx
implements ActionListener {
    private aux DEC = null;
    private mla ELF = null;
    private mku DNt = null;
    private mku DNu = null;
    private mkg ELG = null;
    private drc ELH = null;

    public mvr(drc drc2) {
        assert (drc2 != null) : "Cannot show dialog for NULL Hemisphere object!";
        this.ELH = drc2;
        this.setTitle("Hemisphere Properties");
        this.setSize(400, 300);
        this.setClosable(true);
        this.ePH();
    }

    private void ePH() {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        this.ELF = new mla("Scale", 0.0f, 1.0f, this.ELH.getScale(), 2);
        this.ELF.a(new ChangeListener(this){
            final /* synthetic */ mvr ELI;
            {
                this.ELI = mvr2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                JSlider jSlider = (JSlider)changeEvent.getSource();
                if (!jSlider.getValueIsAdjusting()) {
                    mvr.a(this.ELI, mvr.a(this.ELI).getValue());
                }
            }
        });
        jPanel.add(this.ELF);
        this.DNt = new mku("Translation", this.ELH.fb());
        jPanel.add(this.DNt);
        this.DNu = new mku("Rotation", this.ELH.getRotation());
        jPanel.add(this.DNu);
        if (this.ELG == null) {
            this.ELG = new mkg(this.ELH.buY(), "Cloud Textures");
            this.ELG.a(new a(this));
        }
        jPanel.add(this.ELG);
        this.DGa.add(jPanel);
    }

    @Override
    protected void eDD() {
        fag fag2 = (fag)this.DEC.d(1796);
        fag2.on(this.ELH.getGUID());
        fag2.f(lcr.qAE);
        if (this.DNt.hasChanged()) {
            fag2.FY(fag2.bNM() | 4);
            fag2.K(this.DNt.bSh());
        }
        if (this.DNu.hasChanged()) {
            fag2.FY(fag2.bNM() | 8);
            fag2.setRotation(this.DNu.bSh());
        }
        if (fag2.bNM() != 0) {
            this.DEC.a((dxq)fag2);
        }
    }

    private void oK(float f2) {
        fag fag2 = (fag)this.DEC.d(1796);
        fag2.FY(16);
        fag2.on(this.ELH.getGUID());
        fag2.f(lcr.qAE);
        fag2.setScale(f2);
        this.DEC.a((dxq)fag2);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }

    public void p(aux aux2) {
        this.DEC = aux2;
    }

    static /* synthetic */ mla a(mvr mvr2) {
        return mvr2.ELF;
    }

    static /* synthetic */ void a(mvr mvr2, float f2) {
        mvr2.oK(f2);
    }
}

