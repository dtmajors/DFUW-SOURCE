/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcr
 */
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class dle
extends dlf {
    protected ljq Position = new ljq(0.0f, 0.0f, 0.0f);
    protected lgl Rotation = new lgl();
    private float gFD = 0.0f;
    private float gFE = 1.0f;
    private float gFF = 1.0f;
    private ljq gFG = new ljq(0.0f, 1.0f, 0.0f);
    private ljq gFH = new ljq(0.0f, 0.0f, 1.0f);
    private ljq Qe = new ljq(0.0f, 0.0f, 0.0f);
    private ldv doP = null;
    private ldv gFI = null;
    private int gFJ = 128;
    private float gFK = 150.0f;
    private float gFL = 1.0f;

    public dle() {
        this.ObjectType = 25;
    }

    public float bpl() {
        return this.gFD;
    }

    public void hg(float f) {
        this.gFD = f;
    }

    public float bpm() {
        return this.gFE;
    }

    public void hh(float f) {
        this.gFE = f;
    }

    public float bpn() {
        return this.gFF;
    }

    public void hi(float f) {
        this.gFF = f;
    }

    public ljq bpo() {
        return this.gFG;
    }

    public void ce(ljq ljq2) {
        this.gFG = ljq2;
    }

    public ljq bpp() {
        return this.gFH;
    }

    public void cf(ljq ljq2) {
        this.gFH = ljq2;
    }

    public ljq Up() {
        return this.Qe;
    }

    public void bi(ljq ljq2) {
        this.Qe = ljq2;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            assert (this.GUID != null);
            this.ju(this.GUID);
            this.bpq();
            this.bpr();
            this.Initialized = true;
            this.bps();
        }
    }

    public void m(ljq ljq2, ljq ljq3) {
        this.c(ljq2);
        this.d(ljq3);
        this.Aw(24);
    }

    private void bpq() {
        kik kik2 = (kik)this.MessageDelegator.h(1285);
        kik2.ts(this.GUID);
        kik2.tB(this.GUID);
        kik2.XQ(1);
        kik2.setActive(true);
        kik2.c(this.Position);
        kik2.hg(this.gFD);
        kik2.hh(this.gFE);
        kik2.hi(this.gFF);
        kik2.ce(this.gFG);
        kik2.cf(this.gFH);
        kik2.bi(this.Qe);
        kik2.XR(this.gFJ);
        kik2.mb(this.gFK);
        kik2.mc(this.gFL);
        this.MessageDelegator.a(kik2);
    }

    private void bpr() {
        boolean bl = true;
        this.doP = this.MessageDelegator.bzv();
        kna kna2 = (kna)this.MessageDelegator.h(774);
        kna2.ts(this.GUID);
        kna2.lQ(false);
        kna2.kX(this.doP);
        kna2.qj(lcr.rg);
        kna2.qk(this.GUID);
        kna2.Zl(69);
        kna2.setEnabled(bl);
        kna2.du(new ljq(0.0f, 0.2f, -0.2f));
        kna2.U(new lgl());
        this.MessageDelegator.a(kna2);
    }

    public void I(ldv ldv2, boolean bl) {
        this.gFI = this.MessageDelegator.bzv();
        knh knh2 = (knh)this.MessageDelegator.h(784);
        knh2.Zr(0);
        knh2.ts(this.GUID);
        knh2.jM(false);
        knh2.wD(false);
        knh2.kX(this.gFI);
        knh2.qk(this.GUID);
        knh2.qj(ldv2);
        knh2.setEnabled(bl);
        knh2.setDeltaPos(new ljq(0.0f, 2.0f, 0.0f));
        knh2.setDeltaRot(new lgl(new ljq(0.0f, 3.1415f, 0.0f)));
        this.MessageDelegator.a(knh2);
    }

    public void mN(ldv ldv2) {
        if (this.gFI == null) {
            return;
        }
        knh knh2 = (knh)this.MessageDelegator.h(784);
        knh2.Zr(1);
        knh2.ts(this.GUID);
        knh2.jM(false);
        knh2.wD(false);
        knh2.kX(this.gFI);
        knh2.qk(this.GUID);
        knh2.qj(ldv2);
        this.MessageDelegator.a(knh2);
        this.MessageDelegator.oa(this.gFI);
        this.gFI = null;
    }

    public void ik(boolean bl) {
        knm knm2;
        if (this.doP != null) {
            knm2 = (kna)this.MessageDelegator.h(774);
            knm2.ts(this.GUID);
            knm2.lQ(false);
            knm2.kX(this.doP);
            knm2.qj(lcr.rg);
            knm2.qk(this.GUID);
            ((kna)knm2).Zl(64);
            ((kna)knm2).setEnabled(bl);
            this.MessageDelegator.a(knm2);
        }
        if (this.gFI != null) {
            knm2 = (knh)this.MessageDelegator.h(784);
            ((knh)knm2).Zr(2);
            knm2.ts(this.GUID);
            knm2.jM(false);
            knm2.wD(false);
            knm2.kX(this.gFI);
            knm2.qk(this.GUID);
            knm2.qj(new ldv(0L));
            ((knh)knm2).setEnabled(!bl);
            ((knh)knm2).setDeltaPos(new ljq(0.0f, 2.0f, 0.0f));
            this.MessageDelegator.a(knm2);
        }
    }

    private void Aw(int n) {
        kil kil2 = (kil)this.MessageDelegator.h(1284);
        kil2.ts(this.GUID);
        kil2.tB(this.GUID);
        kil2.XS(n);
        kil2.c(this.Position);
        kil2.setRotation(this.FX());
        this.MessageDelegator.a(kil2);
    }

    public ljq av() {
        return new ljq(this.Position);
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public ljq FX() {
        if (this.Rotation == null) {
            return null;
        }
        return this.Rotation.eqT();
    }

    public void d(ljq ljq2) {
        if (this.Rotation == null) {
            this.Rotation = new lgl(ljq2);
        } else {
            this.Rotation.ep(ljq2);
        }
    }

    public lgl aw() {
        if (this.Rotation == null) {
            return null;
        }
        return new lgl(this.Rotation);
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    private void bps() {
        block3: {
            try {
                Document document = jsy.tJ("xml-files/zones/audio_emitter_presets.xml");
                Node node = jsy.d("SFEmitterPresets", document);
                List<Node> list = jsy.c("SFEmitterPreset", node);
                for (Node node2 : list) {
                    kie kie2 = (kie)this.MessageDelegator.h(1290);
                    kie2.tB(new ldv(0L));
                    kie2.ts(this.GUID);
                    kie2.wD(false);
                    kie2.jM(false);
                    kie2.setId(Integer.parseInt(node2.getAttributes().getNamedItem("Id").getNodeValue()));
                    kie2.setMinDistance(Float.parseFloat(node2.getAttributes().getNamedItem("MinDistance").getNodeValue()));
                    kie2.setMaxDistance(Float.parseFloat(node2.getAttributes().getNamedItem("MaxDistance").getNodeValue()));
                    kie2.XM(Integer.parseInt(node2.getAttributes().getNamedItem("RollOff").getNodeValue()));
                    kie2.XK(Integer.parseInt(node2.getAttributes().getNamedItem("PitchRandomization").getNodeValue()));
                    kie2.XL(Integer.parseInt(node2.getAttributes().getNamedItem("PitchRandomizationOffset").getNodeValue()));
                    kie2.lZ(Float.parseFloat(node2.getAttributes().getNamedItem("VolumeRandomization").getNodeValue()));
                    this.MessageDelegator.a(kie2);
                }
            }
            catch (Exception exception) {
                lfn.b(5, "SFMicrophoneObject", "parseEmitterPresets() : failed to parse sound emitter preset document!");
                if ($assertionsDisabled) break block3;
                throw new AssertionError();
            }
        }
    }
}

