/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  aux
 *  bvf
 *  lcr
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class mmf
extends mkx {
    private bvf DJS;
    private lkw DKX;
    private lkr DKY;
    private mla DMb;
    private mla DMc;
    private Dimension DJA = new Dimension(500, 450);
    private aux DEC = null;
    private float DJD = 0.0f;
    private float DJE = 5.0f;

    public mmf(aux aux2, bvf bvf2, lkr lkr2) {
        this.DEC = aux2;
        this.DJS = bvf2;
        this.DKY = lkr2;
        List<lkw> list = this.DJS.azH().eum();
        lkw lkw2 = list.get(0);
        if (this.DKY.isPartial() && list.size() > 1) {
            lfn.b(0, this.getClass().getSimpleName(), "SFAnimationSpecialEffectDialog() : Getting partial track");
            lkw2 = list.get(1);
        }
        this.DKX = lkw2;
        assert (this.DKX != null);
        this.setTitle("Specialeffect editor");
        this.setPreferredSize(this.DJA);
        this.setMinimumSize(this.DJA);
        this.setClosable(true);
        this.eEl();
        Box box = Box.createVerticalBox();
        JScrollPane jScrollPane = new JScrollPane(box);
        this.DGa.add((Component)jScrollPane, "Center");
        JPanel jPanel = null;
        jPanel = this.d(list.get(0));
        box.add(jPanel);
        this.pack();
    }

    private void eEl() {
        JPanel jPanel = new JPanel(new FlowLayout());
        JLabel jLabel = new JLabel("Animation State: " + this.DKY.getSetName());
        jPanel.add(jLabel);
        this.DGa.add((Component)jPanel, "North");
    }

    private JPanel d(lkw lkw2) {
        JPanel jPanel = new JPanel(new FlowLayout(2));
        jPanel.setBorder(new EtchedBorder(1, Color.white, Color.black));
        jPanel.setPreferredSize(new Dimension(480, 150));
        if (lkw2 == null) {
            lfn.b(5, "SFAnimationBlendingDialog", "createTrackPane() : AnimationTrack is null!");
            return jPanel;
        }
        JPanel jPanel2 = new JPanel(new FlowLayout());
        jPanel2.setBorder(new EtchedBorder());
        this.DMb = new mla("Speed", this.DJD, this.DJE, 0.0f, 2);
        this.DMb.a(new ChangeListener(this){
            final /* synthetic */ mmf DMd;
            {
                this.DMd = mmf2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmf.a(this.DMd, mmf.a(this.DMd).getValue());
            }
        });
        jPanel2.add(this.DMb);
        jPanel.add(jPanel2);
        this.DMc = new mla("Track Position (secs)", 0.0f, this.DKY.etP(), (float)lkw2.bEZ(), 2);
        this.DMc.a(new ChangeListener(this){
            final /* synthetic */ mmf DMd;
            {
                this.DMd = mmf2;
            }

            public final void stateChanged(ChangeEvent changeEvent) {
                mmf.b(this.DMd, mmf.b(this.DMd).getValue());
            }
        });
        jPanel.add(this.DMc);
        return jPanel;
    }

    private void ot(float f2) {
        dzy dzy2 = (dzy)this.DEC.d(7428);
        dzy2.Dn(8);
        dzy2.Do(this.DKX.bEU());
        dzy2.on(this.DJS.getGUID());
        dzy2.f(lcr.qAE);
        dzy2.cb(f2);
        this.DEC.a((dxq)dzy2);
    }

    private void ou(float f2) {
        dzy dzy2 = (dzy)this.DEC.d(7428);
        dzy2.Dn(2);
        dzy2.Do(this.DKX.bEU());
        dzy2.on(this.DJS.getGUID());
        dzy2.f(lcr.qAE);
        dzy2.iF(f2);
        this.DEC.a((dxq)dzy2);
    }

    static /* synthetic */ mla a(mmf mmf2) {
        return mmf2.DMb;
    }

    static /* synthetic */ void a(mmf mmf2, float f2) {
        mmf2.ou(f2);
    }

    static /* synthetic */ mla b(mmf mmf2) {
        return mmf2.DMc;
    }

    static /* synthetic */ void b(mmf mmf2, float f2) {
        mmf2.ot(f2);
    }
}

