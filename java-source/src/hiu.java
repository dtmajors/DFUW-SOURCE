/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  hdm
 *  lcw
 */
import java.util.ArrayList;

public class hiu
extends hmt {
    public static final int NORMAL = 0;
    public static final int kvU = 1;
    public static final int START = 2;
    public static final int END = 3;
    private final hem kvV;
    private final hpa kgb;
    private final hit kvW;
    private final hdm dXw;
    private final lhu kvX = new lhu(32, 32, "gui/mapindicator/mm_marker_teleportation_pad.dds");
    private final lhu kvY = new lhu(64, 64, "gui/mapindicator/mm_marker_teleportation_pad_64.dds");
    private final lhu kvZ = new lhu(64, 64, "gui/mapindicator/mm_marker_teleportation_pad_start.dds");
    private final lhu kwa = new lhu(64, 64, "gui/mapindicator/mm_marker_teleportation_pad_end.dds");
    private boolean kwb = false;

    public hiu(hdm hdm2, String string, lgg lgg2, lhf lhf2, hem hem2, hit hit2, boolean bl) {
        super((hnc)hdm2, string, lgg2, hdw.LW((int)hem2.ResourceType).atw().kLY);
        this.kvV = hem2;
        this.kvW = hit2;
        this.dXw = hdm2;
        this.kwb = bl;
        if (this.kwb) {
            this.kgb = new hpa((hnc)hdm2, "Exit Point " + this.kvV.Name, lgg.rlI, this.kvZ.kLY, this.kvZ);
            this.d(this.kvZ.kLY);
            this.kvW.a(this);
        } else {
            this.kgb = new hpa((hnc)hdm2, "Exit Point " + this.kvV.Name, lgg.rlI, this.kvX.kLY, this.kvX);
            this.d(this.kvX.kLY);
            this.kvW.a(this);
        }
        this.j(this.kgb);
    }

    public void setState(int n) {
        if (this.kwb) {
            return;
        }
        switch (n) {
            case 0: {
                this.kgb.a(this.kvX);
                this.kgb.d(this.kvX.kLY);
                this.d(this.kvX.kLY);
                this.kvW.a(this);
                break;
            }
            case 1: {
                this.kgb.a(this.kvY);
                this.kgb.d(this.kvY.kLY);
                this.d(this.kvY.kLY);
                this.kvW.a(this);
                break;
            }
            case 2: {
                this.kgb.a(this.kvZ);
                this.kgb.d(this.kvZ.kLY);
                this.d(this.kvZ.kLY);
                this.kvW.a(this);
                break;
            }
            case 3: {
                this.kgb.a(this.kwa);
                this.kgb.d(this.kwa.kLY);
                this.d(this.kwa.kLY);
                this.kvW.a(this);
            }
        }
    }

    @Override
    public void ccc() {
        ArrayList<hnt> arrayList = lcn.emv();
        ljk ljk2 = new ljk(cug.uG((int)cug.bbP()));
        arrayList.add(new hnt(this.dXw.kKo, this.kvV.Name));
        arrayList.add(new hnt(this.dXw.jGU, lcw.ed((ljq)this.kvV.Position)));
        arrayList.add(new hnt(this.dXw.jGU, ljk2.esy() + " : " + String.valueOf(this.kvV.Cost)));
        hdw hdw2 = hdw.LW(this.kvV.ResourceType);
        this.dXw.a(hdw2.atw(), arrayList, null);
    }

    @Override
    public void cbM() {
        if (!this.isInitialized()) {
            return;
        }
        if (this.kLu.csd()) {
            this.kvW.a(this.kvV);
        } else {
            this.kvW.b(this.kvV);
        }
    }

    public final hem cmv() {
        return this.kvV;
    }
}

