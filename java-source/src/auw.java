/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cph
 *  dta
 */
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class auw
extends aul {
    private static final int cfS = 0;
    private static final int cfT = 1;
    private static final int cfU = 2;
    private static final int cfV = 3;
    private static final int cfW = 4;
    private static final int cfX = 5;
    private static final int cfY = 6;
    private static final int cdu = 7;
    private static final egg[] cfZ = new egg[]{new egg("X", egg.a.ipp, false, new ljk("X"))};
    private static final egg[] cga = new egg[]{new egg("Y", egg.a.ipp, false, new ljk("Y"))};
    private static final egg[] cgb = new egg[]{new egg("Z", egg.a.ipp, false, new ljk("Z"))};
    private static final egg[] cgc = new egg[]{new egg("X", egg.a.ipp, false, new ljk("X"))};
    private static final egg[] cgd = new egg[]{new egg("Y", egg.a.ipp, false, new ljk("Y"))};
    private static final egg[] cge = new egg[]{new egg("Z", egg.a.ipp, false, new ljk("Z"))};
    private static final egg[] cgf = new egg[0];
    private static final int cdX = 0;
    private static final int cdY = 0;
    private static final cqi[] bui = new cqi[0];
    private boolean Initialized;
    public static final amd cgg = new amd(avh.class, aul.cdc, "ChatProxyExternalObjects", bui, null);

    public auw() {
        super(cgg);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "external_object_cam_pos_x", new ljk("Modify External CamPos X"), cfZ);
        this.a(hc.aaP, 1, "external_object_cam_pos_y", new ljk("Modify External CamPos Y"), cga);
        this.a(hc.aaP, 2, "external_object_cam_pos_z", new ljk("Modify External CamPos Z"), cgb);
        this.a(hc.aaP, 3, "external_object_cam_rot_x", new ljk("Modify External CamRot X"), cgc);
        this.a(hc.aaP, 4, "external_object_cam_rot_y", new ljk("Modify External CamRot Y"), cgd);
        this.a(hc.aaP, 5, "external_object_cam_rot_z", new ljk("Modify External CamRot Z"), cge);
        this.a(hc.aaP, 6, "external_object_print_campos_camrot", new ljk("Copy to clipboard external campos & camrot"), cgf);
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        switch (n) {
            case 0: {
                cph cph2 = this.Wm();
                if (cph2 == null) {
                    return;
                }
                float f2 = ((ldq)objectArray[0]).floatValue();
                ljq ljq2 = new ljq(cph2.aXJ());
                ljq2.x = f2;
                cph2.by(ljq2);
                return;
            }
            case 1: {
                cph cph3 = this.Wm();
                if (cph3 == null) {
                    return;
                }
                float f3 = ((ldq)objectArray[0]).floatValue();
                ljq ljq3 = new ljq(cph3.aXJ());
                ljq3.y = f3;
                cph3.by(ljq3);
                return;
            }
            case 2: {
                cph cph4 = this.Wm();
                if (cph4 == null) {
                    return;
                }
                float f4 = ((ldq)objectArray[0]).floatValue();
                ljq ljq4 = new ljq(cph4.aXJ());
                ljq4.rlV = f4;
                cph4.by(ljq4);
                return;
            }
            case 3: {
                cph cph5 = this.Wm();
                if (cph5 == null) {
                    return;
                }
                float f5 = ((ldq)objectArray[0]).floatValue();
                ljq ljq5 = cph5.aXK().eqT();
                ljq5.x = f5;
                cph5.x(new lgl(ljq5));
                return;
            }
            case 4: {
                cph cph6 = this.Wm();
                if (cph6 == null) {
                    return;
                }
                float f6 = ((ldq)objectArray[0]).floatValue();
                ljq ljq6 = cph6.aXK().eqT();
                ljq6.y = f6;
                cph6.x(new lgl(ljq6));
                return;
            }
            case 5: {
                cph cph7 = this.Wm();
                if (cph7 == null) {
                    return;
                }
                float f7 = ((ldq)objectArray[0]).floatValue();
                ljq ljq7 = cph7.aXK().eqT();
                ljq7.rlV = f7;
                cph7.x(new lgl(ljq7));
                return;
            }
            case 6: {
                cph cph8 = this.Wm();
                if (cph8 == null) {
                    return;
                }
                ljq ljq8 = cph8.aXK().eqT();
                ljq ljq9 = new ljq(cph8.aXJ());
                this.h(lzj.tWt.bD(ljq9.toString(), ljq8.esA()));
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection("CamPos: " + ljq9.toString() + " CamRot: " + ljq8.esA());
                clipboard.setContents(stringSelection, null);
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    private cph Wm() {
        dsv dsv2 = dsv.byP();
        ldv ldv2 = dsv2.aKS();
        if (ldv2 == null) {
            return null;
        }
        amf amf2 = ((dta)this.MessageDelegator).bzt().d(ldv2);
        if (amf2 == null) {
            return null;
        }
        if (!(amf2 instanceof cph)) {
            return null;
        }
        return (cph)amf2;
    }

    @Override
    protected void b(int n, Object object) {
        switch (n) {
            default: 
        }
        super.b(n, object);
    }
}

