/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hdm
 *  lcw
 */
import java.util.List;

public class hit
extends hog {
    private hdm dXw;
    private hjy kvQ;
    private hpa kvR;
    private lhu kvS = new lhu(512, 512, "gui/map/world/512/a01.dds");
    private List<hiu> kvT = lcn.emv();

    public hit(hdm hdm2, String string) {
        super((hnc)hdm2, string, lgg.rlI, hdm2.jYw.kPU.kLY, new hog.a(hdm2.jYw, lgg.rlI, lgg.rlI, hdm2.jYw.kPU.kLY));
        this.dXw = hdm2;
        this.kvQ = ((hec)this.dXw.jWV).kcw;
        this.kvR = new hpa((hnc)hdm2, "Map", lgg.rlI, this.kvS.kLY, this.kvS);
        this.j(this.kvR);
        this.cmu();
    }

    protected void cmu() {
        hem hem2 = this.kvQ.coF();
        for (int i = 0; i < this.kvQ.coE(); ++i) {
            hem hem3 = this.kvQ.Na(i);
            boolean bl = hem2 != null ? hem2.Name.equals(hem3.Name) : false;
            hiu hiu2 = new hiu(this.dXw, "Exit Point " + i, lgg.rlI, lhf.rnv, hem3, this, bl);
            this.kvT.add(hiu2);
            this.j(hiu2);
            this.a(hiu2);
        }
    }

    protected void a(hiu hiu2) {
        float f2 = lcw.fym.x - lcw.fyl.x;
        float f3 = lcw.fym.rlV - lcw.fyl.rlV;
        lhf lhf2 = this.kvR.cqv();
        float f4 = (hiu2.cmv().Position.x - lcw.fyl.x) / f2;
        int n = (int)(f4 * (float)lhf2.rmN);
        n -= hiu2.cqv().rmN / 2;
        n = lew.Q(n, 0, lhf2.rmN - hiu2.cqv().rmN);
        float f5 = 1.0f - (hiu2.cmv().Position.rlV - lcw.fyl.rlV) / f3;
        int n2 = (int)(f5 * (float)lhf2.H);
        n2 -= hiu2.cqv().H / 2;
        n2 = lew.Q(n2, 0, lhf2.H - hiu2.cqv().H);
        hiu2.cB(n, n2);
    }

    void a(hem hem2) {
        if (hem2 == null) {
            this.dXw.jZs.Nc(-1);
            return;
        }
        hem hem3 = this.kvQ.coF();
        if (hem3 == null) {
            return;
        }
        if (hem3.Name.equals(hem2.Name)) {
            this.dXw.jZs.Nc(-1);
            return;
        }
        for (int i = 0; i < this.kvT.size(); ++i) {
            if (hem2 != this.kvT.get(i).cmv()) continue;
            this.dXw.jZs.Nc(i);
        }
    }

    void b(hem hem2) {
        for (hiu object2 : this.kvT) {
            object2.setState(0);
        }
        hem hem3 = this.kvQ.coF();
        if (hem3 == null) {
            return;
        }
        String string = hem3.Name;
        List<cnv> list = lea.ax(string, hem2.Name);
        if (list == null) {
            return;
        }
        for (cnv cnv2 : list) {
            String string2 = cnv2.name;
            for (hiu hiu2 : this.kvT) {
                if (hiu2.cmv().Name.equals(string)) {
                    hiu2.setState(2);
                    continue;
                }
                if (hiu2.cmv().Name.equals(string2) && !hiu2.cmv().Name.equals(hem2.Name) && !hiu2.cmv().Name.equals(string)) {
                    hiu2.setState(1);
                    continue;
                }
                if (!hiu2.cmv().Name.equals(hem2.Name)) continue;
                hiu2.setState(3);
            }
        }
    }
}

