/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcy
 */
public class avm
extends aul {
    private static final int clk = 0;
    private static final int cll = 1;
    private static final int clm = 2;
    private static final int cdu = 3;
    private static final egg[] cln = new egg[]{new egg("r", egg.a.ipp, false, lcy.qRr), new egg("g", egg.a.ipp, false, lcy.qRr), new egg("b", egg.a.ipp, false, lcy.qRr), new egg("a", egg.a.ipp, false, lcy.qRr)};
    private static final egg[] clo = new egg[]{new egg("r", egg.a.ipp, false, lcy.qRr), new egg("g", egg.a.ipp, false, lcy.qRr), new egg("b", egg.a.ipp, false, lcy.qRr), new egg("a", egg.a.ipp, false, lcy.qRr)};
    private static final egg[] clp = new egg[]{new egg("r", egg.a.ipp, false, lcy.qRr), new egg("g", egg.a.ipp, false, lcy.qRr), new egg("b", egg.a.ipp, false, lcy.qRr), new egg("a", egg.a.ipp, false, lcy.qRr)};
    private static final int clq = 0;
    private static final int clr = 1;
    private static final int cls = 2;
    private static final int clt = 3;
    private static final int clu = 4;
    private static final int clv = 5;
    private static final int clw = 6;
    private static final int clx = 7;
    private static final int cly = 8;
    private static final int clz = 9;
    private static final int clA = 10;
    private static final int clB = 11;
    private static final int clC = 12;
    private static final int clD = 13;
    private static final int clE = 14;
    private static final int clF = 15;
    private static final int clG = 16;
    private static final int clH = 17;
    private static final int clI = 18;
    private static final int clJ = 19;
    private static final int clK = 20;
    private static final int clL = 21;
    private static final int clM = 22;
    private static final int clN = 23;
    private static final int clO = 24;
    protected static final int cdY = 25;
    private static final cqi[] bui = new cqi[]{new cqj(hc.aaP, 0, "shape_mesh_objects", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 1, "shape_mesh_objects_visual_sg_sphere", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 2, "shape_mesh_objects_visual_sg_box", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 3, "shape_mesh_objects_visual_sg_sub_spheres", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 4, "shape_mesh_objects_collision_sg_sphere", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 5, "shape_mesh_objects_collision_dynamic_spheres", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 6, "shape_mesh_objects_collision_static_spheres", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 7, "shape_mesh_objects_collision_animated_influence_spheres", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 8, "shape_mesh_objects_collision_dynamic_box", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 9, "shape_mesh_objects_collision_static_box", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 10, "shape_mesh_objects_collision_animated_influence_box", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 11, "shape_animated_mesh_objects", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 12, "shape_animated_mesh_objects_visual_sg_sphere", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 13, "shape_animated_mesh_objects_visual_sg_box", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 14, "shape_animated_mesh_objects_collision_sg_sphere", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 15, "shape_animated_mesh_objects_collision_dynamic_spheres", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 16, "shape_animated_mesh_objects_collision_static_spheres", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 17, "shape_animated_mesh_objects_collision_animated_influence_spheres", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 18, "shape_animated_mesh_objects_collision_dynamic_box", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 19, "shape_animated_mesh_objects_collision_static_box", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 20, "shape_animated_mesh_objects_collision_animated_influence_box", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 21, "shape_linemesh_objects_visual_sg_sphere", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 22, "shape_particle_objects_visual_sg_sphere", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 23, "shape_renderbox_objects_visual_sg_sphere", false, new lch(false), lcy.qRr), new cqj(hc.aaP, 24, "shape_3d_audio_objects", false, new lch(false), lcy.qRr)};
    private boolean Initialized;
    public static final amd clP = new amd(avm.class, aul.cdc, "ChatProxyShapeObjects", bui, null);

    public avm() {
        super(clP);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "shape_modify_sphere_shape_color", lcy.qRr, cln);
        this.a(hc.aaP, 1, "shape_modify_box_shape_color", lcy.qRr, clo);
        this.a(hc.aaP, 2, "shape_modify_3d_audio_shape_color", lcy.qRr, clp);
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
                float f2 = ((ldq)objectArray[0]).floatValue();
                float f3 = ((ldq)objectArray[1]).floatValue();
                float f4 = ((ldq)objectArray[2]).floatValue();
                float f5 = ((ldq)objectArray[3]).floatValue();
                lcq lcq2 = new lcq(f2, f3, f4, f5);
                kgo kgo2 = this.WM();
                kgo2.ppm = lcq2;
                kgo2.WX(0x1000000);
                this.MessageDelegator.b(kgo2);
                return;
            }
            case 1: {
                float f6 = ((ldq)objectArray[0]).floatValue();
                float f7 = ((ldq)objectArray[1]).floatValue();
                float f8 = ((ldq)objectArray[2]).floatValue();
                float f9 = ((ldq)objectArray[3]).floatValue();
                lcq lcq3 = new lcq(f6, f7, f8, f9);
                kgo kgo3 = this.WM();
                kgo3.ppn = lcq3;
                kgo3.WX(0x2000000);
                this.MessageDelegator.b(kgo3);
                return;
            }
            case 2: {
                float f10 = ((ldq)objectArray[0]).floatValue();
                float f11 = ((ldq)objectArray[1]).floatValue();
                float f12 = ((ldq)objectArray[2]).floatValue();
                float f13 = ((ldq)objectArray[3]).floatValue();
                lcq lcq4 = new lcq(f10, f11, f12, f13);
                kfv kfv2 = this.WN();
                kfv2.pkb = lcq4;
                kfv2.Wy(2);
                this.MessageDelegator.b(kfv2);
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    @Override
    protected void b(int n, Object object) {
        switch (n) {
            case 0: {
                boolean bl = ((lch)this.gG(0)).booleanValue();
                kgo kgo2 = this.WM();
                kgo2.poO = bl;
                kgo2.WX(1);
                this.MessageDelegator.b(kgo2);
                break;
            }
            case 1: {
                boolean bl = ((lch)this.gG(1)).booleanValue();
                kgo kgo3 = this.WM();
                kgo3.poP = bl;
                kgo3.WX(2);
                this.MessageDelegator.b(kgo3);
                break;
            }
            case 2: {
                boolean bl = ((lch)this.gG(2)).booleanValue();
                kgo kgo4 = this.WM();
                kgo4.poQ = bl;
                kgo4.WX(4);
                this.MessageDelegator.b(kgo4);
                break;
            }
            case 3: {
                boolean bl = ((lch)this.gG(3)).booleanValue();
                kgo kgo5 = this.WM();
                kgo5.poR = bl;
                kgo5.WX(8);
                this.MessageDelegator.b(kgo5);
                break;
            }
            case 4: {
                boolean bl = ((lch)this.gG(4)).booleanValue();
                kgo kgo6 = this.WM();
                kgo6.poS = bl;
                kgo6.WX(16);
                this.MessageDelegator.b(kgo6);
                break;
            }
            case 5: {
                boolean bl = ((lch)this.gG(5)).booleanValue();
                kgo kgo7 = this.WM();
                kgo7.poT = bl;
                kgo7.WX(32);
                this.MessageDelegator.b(kgo7);
                break;
            }
            case 6: {
                boolean bl = ((lch)this.gG(6)).booleanValue();
                kgo kgo8 = this.WM();
                kgo8.poU = bl;
                kgo8.WX(64);
                this.MessageDelegator.b(kgo8);
                break;
            }
            case 7: {
                boolean bl = ((lch)this.gG(7)).booleanValue();
                kgo kgo9 = this.WM();
                kgo9.poV = bl;
                kgo9.WX(128);
                this.MessageDelegator.b(kgo9);
                break;
            }
            case 8: {
                boolean bl = ((lch)this.gG(8)).booleanValue();
                kgo kgo10 = this.WM();
                kgo10.poW = bl;
                kgo10.WX(256);
                this.MessageDelegator.b(kgo10);
                break;
            }
            case 9: {
                boolean bl = ((lch)this.gG(9)).booleanValue();
                kgo kgo11 = this.WM();
                kgo11.poX = bl;
                kgo11.WX(512);
                this.MessageDelegator.b(kgo11);
                break;
            }
            case 10: {
                boolean bl = ((lch)this.gG(10)).booleanValue();
                kgo kgo12 = this.WM();
                kgo12.poY = bl;
                kgo12.WX(1024);
                this.MessageDelegator.b(kgo12);
                break;
            }
            case 11: {
                boolean bl = ((lch)this.gG(11)).booleanValue();
                kgo kgo13 = this.WM();
                kgo13.poZ = bl;
                kgo13.WX(2048);
                this.MessageDelegator.b(kgo13);
                break;
            }
            case 12: {
                boolean bl = ((lch)this.gG(12)).booleanValue();
                kgo kgo14 = this.WM();
                kgo14.ppa = bl;
                kgo14.WX(4096);
                this.MessageDelegator.b(kgo14);
                break;
            }
            case 13: {
                boolean bl = ((lch)this.gG(13)).booleanValue();
                kgo kgo15 = this.WM();
                kgo15.ppb = bl;
                kgo15.WX(8192);
                this.MessageDelegator.b(kgo15);
                break;
            }
            case 14: {
                boolean bl = ((lch)this.gG(14)).booleanValue();
                kgo kgo16 = this.WM();
                kgo16.ppc = bl;
                kgo16.WX(16384);
                this.MessageDelegator.b(kgo16);
                break;
            }
            case 15: {
                boolean bl = ((lch)this.gG(15)).booleanValue();
                kgo kgo17 = this.WM();
                kgo17.ppd = bl;
                kgo17.WX(32768);
                this.MessageDelegator.b(kgo17);
                break;
            }
            case 16: {
                boolean bl = ((lch)this.gG(16)).booleanValue();
                kgo kgo18 = this.WM();
                kgo18.ppe = bl;
                kgo18.WX(65536);
                this.MessageDelegator.b(kgo18);
                break;
            }
            case 17: {
                boolean bl = ((lch)this.gG(17)).booleanValue();
                kgo kgo19 = this.WM();
                kgo19.ppf = bl;
                kgo19.WX(131072);
                this.MessageDelegator.b(kgo19);
                break;
            }
            case 18: {
                boolean bl = ((lch)this.gG(18)).booleanValue();
                kgo kgo20 = this.WM();
                kgo20.ppg = bl;
                kgo20.WX(262144);
                this.MessageDelegator.b(kgo20);
                break;
            }
            case 19: {
                boolean bl = ((lch)this.gG(19)).booleanValue();
                kgo kgo21 = this.WM();
                kgo21.pph = bl;
                kgo21.WX(524288);
                this.MessageDelegator.b(kgo21);
                break;
            }
            case 20: {
                boolean bl = ((lch)this.gG(20)).booleanValue();
                kgo kgo22 = this.WM();
                kgo22.ppi = bl;
                kgo22.WX(0x100000);
                this.MessageDelegator.b(kgo22);
                break;
            }
            case 21: {
                boolean bl = ((lch)this.gG(21)).booleanValue();
                kgo kgo23 = this.WM();
                kgo23.ppj = bl;
                kgo23.WX(0x200000);
                this.MessageDelegator.b(kgo23);
                break;
            }
            case 22: {
                boolean bl = ((lch)this.gG(22)).booleanValue();
                kgo kgo24 = this.WM();
                kgo24.ppk = bl;
                kgo24.WX(0x400000);
                this.MessageDelegator.b(kgo24);
                break;
            }
            case 23: {
                boolean bl = ((lch)this.gG(23)).booleanValue();
                kgo kgo25 = this.WM();
                kgo25.ppl = bl;
                kgo25.WX(0x800000);
                this.MessageDelegator.b(kgo25);
                break;
            }
            case 24: {
                boolean bl = ((lch)this.gG(23)).booleanValue();
                kfv kfv2 = this.WN();
                kfv2.pka = bl;
                kfv2.Wy(1);
                this.MessageDelegator.b(kfv2);
                break;
            }
            default: {
                super.b(n, object);
            }
        }
    }

    private kgo WM() {
        kgo kgo2 = new kgo();
        kgo2.tr(this.getGUID());
        kgo2.ts(this.getGUID());
        return kgo2;
    }

    private kfv WN() {
        kfv kfv2 = new kfv();
        kfv2.tr(this.getGUID());
        kfv2.ts(this.getGUID());
        return kfv2;
    }
}

