/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcy
 */
public class avs
extends aul {
    private static final int cqn = 0;
    private static final int cqo = 1;
    private static final int cqp = 2;
    private static final int cqq = 3;
    private static final int cqr = 4;
    private static final int cqs = 5;
    private static final int cqt = 6;
    private static final int cqu = 7;
    private static final int cqv = 8;
    private static final int cqw = 9;
    private static final int cqx = 10;
    private static final int cqy = 11;
    private static final int cqz = 12;
    private static final int cqA = 13;
    private static final int cqB = 14;
    private static final int cqC = 15;
    private static final int cqD = 16;
    private static final int cqE = 17;
    private static final int cqF = 18;
    private static final int cqG = 19;
    private static final int cqH = 20;
    private static final int cqI = 21;
    private static final int cqJ = 22;
    private static final int cqK = 23;
    private static final int cqL = 24;
    private static final int cqM = 25;
    private static final int cqN = 26;
    private static final int cdu = 27;
    private boolean Initialized = false;
    private ldv cdD = null;
    private boolean amv = false;
    private ldv amw = null;
    private int amx = 0;
    private String amy = "";
    private int amz = 0;
    private boolean amA = false;
    private boolean amB = false;
    private int amC = 0;
    private static final egg[] cqO = new egg[]{new egg("ParamInteger", egg.a.ipn, false, lcy.qRr)};
    private static final egg[] cqP = new egg[]{new egg("ParamInteger", egg.a.ipn, true, lcy.qRr)};
    private static final egg[] ckF = new egg[]{new egg("ParamBool", egg.a.ipm, false, lcy.qRr)};
    private static final egg[] cqQ = new egg[]{new egg("ParamBool", egg.a.ipm, true, lcy.qRr)};
    private static final egg[] ckC = new egg[]{new egg("ParamString", egg.a.ipq, false, lcy.qRr)};
    private static final egg[] cqR = new egg[]{new egg("NodeID", egg.a.ipn, false, lcy.qRr), new egg("PosX", egg.a.ipp, false, lcy.qRr), new egg("PosY", egg.a.ipp, false, lcy.qRr), new egg("PosZ", egg.a.ipp, false, lcy.qRr)};
    private static final egg[] cqS = new egg[]{new egg("NodeID", egg.a.ipn, true, lcy.qRr), new egg("PhysicsTypeFilter", egg.a.ipn, true, lcy.qRr)};
    private static final egg[] cqT = new egg[]{new egg("NodeID", egg.a.ipn, true, lcy.qRr), new egg("PrintSensedObjects", egg.a.ipm, true, lcy.qRr)};
    private static final cqi[] bui = new cqi[0];
    public static final amd cqU = new amd(avs.class, aul.cdc, "ChatProxySystem", bui, null);

    public avs() {
        super(cqU);
    }

    @Override
    protected final void FF() {
        assert (!this.Initialized);
        super.FF();
        this.Initialized = true;
        this.a(hc.aaP, 0, "sys_print_all_objects", lcy.qRr, cqS);
        this.a(hc.aaP, 1, "sys_print_all_audio_objects", lcy.qRr, cdd);
        this.a(hc.aaP, 2, "sys_print_all_relations", lcy.qRr, cqP);
        this.a(hc.aaP, 3, "sys_print_all_sensors", lcy.qRr, cqP);
        this.a(hc.aaP, 4, "sys_print_all_aoi_sensors", lcy.qRr, cqT);
        this.a(hc.aaP, 5, "sys_print_num_total_objects", lcy.qRr, cqP);
        this.a(hc.aaP, 6, "sys_print_statistics", lcy.qRr, cqP);
        this.a(hc.aaP, 7, "sys_print_engine_distributor", lcy.qRr, cqP);
        this.a(hc.aaP, 8, "sys_print_distributor_containments", lcy.qRr, cqO);
        this.a(hc.aaP, 9, "sys_print_distributor_relations", lcy.qRr, cqO);
        this.a(hc.aaP, 10, "sys_print_distributor_sensors", lcy.qRr, cqO);
        this.a(hc.aaP, 11, "sys_print_distributor_timers", lcy.qRr, cqO);
        this.a(hc.aaP, 12, "sys_print_engine_server", lcy.qRr, cqR);
        this.a(hc.aaP, 13, "iprof_local", lcy.qRr, cdd);
        this.a(hc.aaP, 14, "iprof_client_char_name", lcy.qRr, ckC);
        this.a(hc.aaP, 15, "iprof_client_id", lcy.qRr, cqO);
        this.a(hc.aaP, 16, "iprof_engine_server", lcy.qRr, cqO);
        this.a(hc.aaP, 17, "iprof_ai_client", lcy.qRr, cqO);
        this.a(hc.aaP, 18, "iprof_enable", lcy.qRr, cqQ);
        this.a(hc.aaP, 19, "iprof_pause", lcy.qRr, cqQ);
        this.a(hc.aaP, 20, "iprof_report_mode", lcy.qRr, cqO);
        this.a(hc.aaP, 21, "iprof_move_frame_cursor", lcy.qRr, cqO);
        this.a(hc.aaP, 22, "iprof_move_zone_cursor", lcy.qRr, cqO);
        this.a(hc.aaP, 23, "iprof_select_current_zone", lcy.qRr, cdd);
        this.a(hc.aaP, 24, "iprof_select_parent_zone", lcy.qRr, cdd);
        this.a(hc.aaP, 25, "iprof_save", lcy.qRr, ckC);
        this.a(hc.aaP, 26, "iprof_load", lcy.qRr, ckC);
    }

    @Override
    protected final void FG() {
        assert (this.Initialized);
        this.We();
        super.FG();
        this.Initialized = false;
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 2321: {
                egk egk2 = (egk)dxq2;
                if (egk2.cdD == null) break;
                this.cdD = egk2.cdD;
                break;
            }
            case 16656: {
                this.b((erk)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 6402: {
                kwx kwx2 = (kwx)ktv2;
                erl erl2 = (erl)this.MessageDelegator.h(16657, this.GUID, this.amw);
                erl2.iyB = kwx2.iyB;
                erl2.iyC = kwx2.iyC;
                erl2.iyD = kwx2.iyD;
                this.MessageDelegator.F(erl2);
                return;
            }
        }
        super.receiveResponse(ktv2);
    }

    @Override
    protected final void b(int n, Object[] objectArray, String string) {
        switch (n) {
            case 0: {
                int n2 = 0;
                if (objectArray.length > 0) {
                    n2 = ((lei)objectArray[0]).intValue();
                }
                int n3 = 1048575;
                if (objectArray.length == 2) {
                    n3 = ((lei)objectArray[1]).intValue();
                }
                if (n2 != 0) {
                    if (this.cdD == null) {
                        return;
                    }
                    erj erj2 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                    erj2.Type = 1;
                    erj2.di = n2;
                    erj2.iye = n3;
                    this.MessageDelegator.F(erj2);
                } else {
                    kqb kqb2 = (kqb)this.MessageDelegator.h(3844);
                    kqb2.pVD = 1;
                    kqb2.iyx = 1;
                    kqb2.iye = n3;
                    kqb2.ts(this.getGUID());
                    kqb2.jM(false);
                    kqb2.wD(false);
                    this.a(kqb2);
                }
                return;
            }
            case 1: {
                kqb kqb3 = (kqb)this.MessageDelegator.h(3844);
                kqb3.pVD = 8;
                kqb3.iyx = 1;
                kqb3.ts(this.getGUID());
                kqb3.jM(false);
                kqb3.wD(false);
                this.a(kqb3);
                return;
            }
            case 3: {
                int n4 = 0;
                boolean bl = false;
                if (objectArray.length > 0) {
                    n4 = ((lei)objectArray[0]).intValue();
                }
                if (n4 != 0) {
                    if (this.cdD == null) {
                        return;
                    }
                    erj erj3 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                    erj3.Type = 3;
                    erj3.di = n4;
                    this.MessageDelegator.F(erj3);
                } else {
                    kqb kqb4 = (kqb)this.MessageDelegator.h(3844);
                    kqb4.pVD = 3;
                    kqb4.iyx = 1;
                    kqb4.ts(this.getGUID());
                    kqb4.jM(false);
                    kqb4.wD(false);
                    this.a(kqb4);
                }
                return;
            }
            case 4: {
                int n5 = 0;
                if (objectArray.length > 0) {
                    n5 = ((lei)objectArray[0]).intValue();
                }
                boolean bl = false;
                if (objectArray.length == 2) {
                    bl = ((lch)objectArray[1]).booleanValue();
                }
                if (n5 != 0) {
                    if (this.cdD == null) {
                        return;
                    }
                    erj erj4 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                    erj4.Type = 7;
                    erj4.di = n5;
                    erj4.iyf = bl;
                    this.MessageDelegator.F(erj4);
                } else {
                    kqb kqb5 = (kqb)this.MessageDelegator.h(3844);
                    kqb5.pVD = 7;
                    kqb5.iyx = 1;
                    kqb5.iyf = bl;
                    kqb5.ts(this.getGUID());
                    kqb5.jM(false);
                    kqb5.wD(false);
                    this.a(kqb5);
                }
                return;
            }
            case 2: {
                int n6 = 0;
                if (objectArray.length > 0) {
                    n6 = ((lei)objectArray[0]).intValue();
                }
                if (n6 != 0) {
                    if (this.cdD == null) {
                        return;
                    }
                    erj erj5 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                    erj5.Type = 2;
                    erj5.di = n6;
                    this.MessageDelegator.F(erj5);
                } else {
                    kqb kqb6 = (kqb)this.MessageDelegator.h(3844);
                    kqb6.pVD = 2;
                    kqb6.iyx = 1;
                    kqb6.ts(this.getGUID());
                    kqb6.jM(false);
                    kqb6.wD(false);
                    this.a(kqb6);
                }
                return;
            }
            case 5: {
                int n7 = 0;
                if (objectArray.length > 0) {
                    n7 = ((lei)objectArray[0]).intValue();
                }
                if (n7 != 0) {
                    if (this.cdD == null) {
                        return;
                    }
                    erj erj6 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                    erj6.Type = 4;
                    erj6.di = n7;
                    this.MessageDelegator.F(erj6);
                } else {
                    kqb kqb7 = (kqb)this.MessageDelegator.h(3844);
                    kqb7.pVD = 4;
                    kqb7.iyx = 1;
                    kqb7.ts(this.getGUID());
                    kqb7.jM(false);
                    kqb7.wD(false);
                    this.a(kqb7);
                }
                return;
            }
            case 6: {
                int n8 = 0;
                if (objectArray.length > 0) {
                    n8 = ((lei)objectArray[0]).intValue();
                }
                if (n8 != 0) {
                    if (this.cdD == null) {
                        return;
                    }
                    erj erj7 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                    erj7.Type = 6;
                    erj7.di = n8;
                    this.MessageDelegator.F(erj7);
                } else {
                    kqb kqb8 = (kqb)this.MessageDelegator.h(3844);
                    kqb8.pVD = 6;
                    kqb8.iyx = 1;
                    kqb8.ts(this.getGUID());
                    kqb8.jM(false);
                    kqb8.wD(false);
                    this.a(kqb8);
                }
                return;
            }
            case 7: {
                int n9 = 0;
                if (objectArray.length > 0) {
                    n9 = ((lei)objectArray[0]).intValue();
                }
                if (n9 != 0) {
                    if (this.cdD == null) {
                        return;
                    }
                    erj erj8 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                    erj8.Type = 5;
                    erj8.di = n9;
                    this.MessageDelegator.F(erj8);
                } else {
                    kqb kqb9 = (kqb)this.MessageDelegator.h(3844);
                    kqb9.pVD = 5;
                    kqb9.iyx = 1;
                    kqb9.ts(this.getGUID());
                    kqb9.jM(false);
                    kqb9.wD(false);
                    this.a(kqb9);
                }
                return;
            }
            case 8: {
                if (this.cdD == null) {
                    return;
                }
                erj erj9 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                erj9.Type = 8;
                erj9.di = ((lei)objectArray[0]).intValue();
                this.MessageDelegator.F(erj9);
                return;
            }
            case 9: {
                if (this.cdD == null) {
                    return;
                }
                erj erj10 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                erj10.Type = 9;
                erj10.di = ((lei)objectArray[0]).intValue();
                this.MessageDelegator.F(erj10);
                return;
            }
            case 10: {
                if (this.cdD == null) {
                    return;
                }
                erj erj11 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                erj11.Type = 10;
                erj11.di = ((lei)objectArray[0]).intValue();
                this.MessageDelegator.F(erj11);
                return;
            }
            case 11: {
                if (this.cdD == null) {
                    return;
                }
                erj erj12 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                erj12.Type = 11;
                erj12.di = ((lei)objectArray[0]).intValue();
                this.MessageDelegator.F(erj12);
                return;
            }
            case 12: {
                if (this.cdD == null) {
                    return;
                }
                erj erj13 = (erj)this.MessageDelegator.h(16655, this.GUID, this.cdD);
                erj13.Type = 12;
                erj13.di = ((lei)objectArray[0]).intValue();
                erj13.Position = new ljq();
                erj13.Position.x = ((ldq)objectArray[1]).floatValue();
                erj13.Position.y = ((ldq)objectArray[2]).floatValue();
                erj13.Position.rlV = ((ldq)objectArray[3]).floatValue();
                this.MessageDelegator.F(erj13);
                return;
            }
            case 13: {
                int n10 = this.amx;
                String string2 = this.amy;
                int n11 = this.amz;
                this.amx = 0;
                this.amy = "";
                this.amz = 0;
                this.a(n10, string2, n11);
                return;
            }
            case 14: {
                int n12 = this.amx;
                String string3 = this.amy;
                int n13 = this.amz;
                this.amx = -1;
                this.amy = (String)objectArray[0];
                this.amz = 1;
                if (this.amy.equals(dsv.byP().iU())) {
                    this.amx = 0;
                    this.amy = "";
                    this.amz = 0;
                }
                this.a(n12, string3, n13);
                return;
            }
            case 15: {
                int n14 = this.amx;
                String string4 = this.amy;
                int n15 = this.amz;
                this.amx = ((lei)objectArray[0]).intValue();
                this.amy = "";
                this.amz = this.amx == 0 ? 0 : 1;
                this.a(n14, string4, n15);
                return;
            }
            case 16: {
                int n16 = this.amx;
                String string5 = this.amy;
                int n17 = this.amz;
                this.amx = ((lei)objectArray[0]).intValue();
                this.amy = "";
                this.amz = 3;
                this.a(n16, string5, n17);
                return;
            }
            case 17: {
                int n18 = this.amx;
                String string6 = this.amy;
                int n19 = this.amz;
                this.amx = ((lei)objectArray[0]).intValue();
                this.amy = "";
                this.amz = 2;
                this.a(n18, string6, n19);
                return;
            }
            case 18: {
                if (this.amv) {
                    return;
                }
                if (objectArray.length > 0) {
                    this.amA = ((lch)objectArray[0]).booleanValue();
                } else {
                    boolean bl = this.amA = !this.amA;
                }
                if (this.amx == 0) {
                    this.j(0, this.amA);
                } else {
                    this.a(this.amx, this.amy, this.amz, this.amA);
                }
                return;
            }
            case 19: {
                if (objectArray.length > 0) {
                    this.amB = ((lch)objectArray[0]).booleanValue();
                } else {
                    boolean bl = this.amB = !this.amB;
                }
                if (this.amA) {
                    if (this.amx == 0) {
                        kqf kqf2 = (kqf)this.MessageDelegator.h(3841);
                        kqf2.iyu = 2;
                        kqf2.iyw = this.amB;
                        kqf2.ts(this.getGUID());
                        kqf2.jM(false);
                        kqf2.wD(false);
                        this.a(kqf2);
                    } else {
                        erk erk2 = (erk)this.MessageDelegator.h(16656, this.GUID, this.cdD);
                        erk2.iyu = 2;
                        erk2.iyw = this.amB;
                        erk2.di = this.amx;
                        erk2.iyA = this.amy;
                        erk2.fV = this.amz;
                        this.MessageDelegator.F(erk2);
                    }
                }
                return;
            }
            case 20: {
                this.amC = ((lei)objectArray[0]).intValue();
                if (this.amA) {
                    if (this.amx == 0) {
                        kqf kqf3 = (kqf)this.MessageDelegator.h(3841);
                        kqf3.iyu = 4;
                        kqf3.iyx = this.amC;
                        kqf3.ts(this.getGUID());
                        kqf3.jM(false);
                        kqf3.wD(false);
                        this.a(kqf3);
                    } else {
                        erk erk3 = (erk)this.MessageDelegator.h(16656, this.GUID, this.cdD);
                        erk3.iyu = 4;
                        erk3.iyx = this.amC;
                        erk3.di = this.amx;
                        erk3.iyA = this.amy;
                        erk3.fV = this.amz;
                        this.MessageDelegator.F(erk3);
                    }
                }
                return;
            }
            case 21: {
                if (this.amA) {
                    if (this.amx == 0) {
                        kqf kqf4 = (kqf)this.MessageDelegator.h(3841);
                        kqf4.iyu = 8;
                        kqf4.iyy = ((lei)objectArray[0]).intValue();
                        kqf4.ts(this.getGUID());
                        kqf4.jM(false);
                        kqf4.wD(false);
                        this.a(kqf4);
                    } else {
                        erk erk4 = (erk)this.MessageDelegator.h(16656, this.GUID, this.cdD);
                        erk4.iyu = 8;
                        erk4.iyy = ((lei)objectArray[0]).intValue();
                        erk4.di = this.amx;
                        erk4.iyA = this.amy;
                        erk4.fV = this.amz;
                        this.MessageDelegator.F(erk4);
                    }
                }
                return;
            }
            case 22: {
                if (this.amA) {
                    if (this.amx == 0) {
                        kqf kqf5 = (kqf)this.MessageDelegator.h(3841);
                        kqf5.iyu = 16;
                        kqf5.iyz = ((lei)objectArray[0]).intValue();
                        kqf5.ts(this.getGUID());
                        kqf5.jM(false);
                        kqf5.wD(false);
                        this.a(kqf5);
                    } else {
                        erk erk5 = (erk)this.MessageDelegator.h(16656, this.GUID, this.cdD);
                        erk5.iyu = 16;
                        erk5.iyz = ((lei)objectArray[0]).intValue();
                        erk5.di = this.amx;
                        erk5.iyA = this.amy;
                        erk5.fV = this.amz;
                        this.MessageDelegator.F(erk5);
                    }
                }
                return;
            }
            case 23: {
                if (this.amA) {
                    if (this.amx == 0) {
                        kqf kqf6 = (kqf)this.MessageDelegator.h(3841);
                        kqf6.iyu = 32;
                        kqf6.ts(this.getGUID());
                        kqf6.jM(false);
                        kqf6.wD(false);
                        this.a(kqf6);
                    } else {
                        erk erk6 = (erk)this.MessageDelegator.h(16656, this.GUID, this.cdD);
                        erk6.iyu = 32;
                        erk6.di = this.amx;
                        erk6.iyA = this.amy;
                        erk6.fV = this.amz;
                        this.MessageDelegator.F(erk6);
                    }
                }
                return;
            }
            case 24: {
                if (this.amA) {
                    if (this.amx == 0) {
                        kqf kqf7 = (kqf)this.MessageDelegator.h(3841);
                        kqf7.iyu = 64;
                        kqf7.ts(this.getGUID());
                        kqf7.jM(false);
                        kqf7.wD(false);
                        this.a(kqf7);
                    } else {
                        erk erk7 = (erk)this.MessageDelegator.h(16656, this.GUID, this.cdD);
                        erk7.iyu = 64;
                        erk7.di = this.amx;
                        erk7.iyA = this.amy;
                        erk7.fV = this.amz;
                        this.MessageDelegator.F(erk7);
                    }
                }
                return;
            }
            case 25: 
            case 26: {
                if (this.amA && objectArray.length == 1) {
                    kqf kqf8 = (kqf)this.MessageDelegator.h(3841);
                    kqf8.iyu = n == 25 ? 512 : 1024;
                    kqf8.Filename = (String)objectArray[0];
                    kqf8.ts(this.getGUID());
                    kqf8.jM(false);
                    kqf8.wD(false);
                    this.a(kqf8);
                }
                return;
            }
        }
        super.b(n, objectArray, string);
    }

    private void a(int n, String string, int n2) {
        if (n == this.amx && string.equals(this.amy)) {
            return;
        }
        if (this.amA) {
            if (n == 0) {
                this.j(0, false);
                this.a(this.amx, this.amy, this.amz, true);
            } else if (this.amx == 0) {
                this.a(n, string, n2, false);
                this.j(0, true);
            } else {
                this.a(n, string, n2, false);
                this.a(this.amx, this.amy, this.amz, true);
            }
        } else if (n == 0) {
            this.j(0, false);
        } else if (this.amx == 0) {
            this.a(n, string, n2, false);
        } else {
            this.a(n, string, n2, false);
        }
    }

    private void j(int n, boolean bl) {
        kqf kqf2 = (kqf)this.MessageDelegator.h(3841);
        kqf2.iyu = 385;
        kqf2.iyv = bl;
        kqf2.pVQ = false;
        kqf2.pVR = bl;
        kqf2.ts(this.getGUID());
        kqf2.jM(false);
        kqf2.wD(false);
        this.a(kqf2);
    }

    private void a(int n, String string, int n2, boolean bl) {
        erk erk2 = (erk)this.MessageDelegator.h(16656, this.GUID, this.cdD);
        erk2.iyu = 3;
        erk2.iyv = bl;
        erk2.iyw = !this.amB;
        erk2.di = n;
        erk2.iyA = string;
        erk2.fV = n2;
        this.MessageDelegator.F(erk2);
        this.W(bl);
    }

    private void b(erk erk2) {
        if ((erk2.iyu & 1) != 0) {
            if (erk2.iyv) {
                if (!this.amv) {
                    if (this.amA) {
                        if (this.amx == 0) {
                            this.j(0, false);
                        } else {
                            this.a(this.amx, this.amy, this.amz, false);
                        }
                        this.amA = false;
                    }
                    this.amv = true;
                    this.amw = erk2.aO();
                }
            } else {
                if (!this.amv) {
                    return;
                }
                this.amv = false;
            }
        } else if (!this.amv) {
            return;
        }
        kqf kqf2 = (kqf)this.MessageDelegator.h(3841);
        kqf2.ts(this.getGUID());
        kqf2.jM(false);
        kqf2.wD(false);
        kqf2.iyu = erk2.iyu;
        kqf2.iyv = erk2.iyv;
        kqf2.iyw = erk2.iyw;
        kqf2.iyx = erk2.iyx;
        kqf2.iyy = erk2.iyy;
        kqf2.iyz = erk2.iyz;
        if ((erk2.iyu & 1) == 1) {
            kqf2.iyu |= 0x180;
            kqf2.pVQ = erk2.iyv;
            kqf2.pVR = false;
        }
        this.a(kqf2);
    }

    private void W(boolean bl) {
        kqe kqe2 = (kqe)this.MessageDelegator.h(3848);
        kqe2.iyu = 1;
        kqe2.imB = bl;
        kqe2.ts(this.getGUID());
        kqe2.jM(false);
        kqe2.wD(false);
        this.a(kqe2);
    }

    @Override
    protected void b(int n, Object object) {
        switch (n) {
            default: 
        }
        super.b(n, object);
    }
}

