/*
 * Decompiled with CFR.
 */
import java.util.List;

public class dfk
extends dey {
    kkv goy = null;
    private int dcq = 0;

    dfk() {
        this.gnv = 9;
        this.goy = (kkv)gnw.h(1031);
        this.gnx = false;
        this.gny = false;
    }

    @Override
    public void initialize() {
        if (!this.Initialized) {
            this.createLineMesh();
            this.Initialized = true;
        }
    }

    @Override
    public void cleanUp() {
        if (this.Initialized) {
            this.bmi();
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        super.doTick(ldz2);
        this.updateObject();
    }

    private void updateObject() {
        if (this.dcq == 0) {
            return;
        }
        this.goy.YG(this.dcq);
        this.MessageDelegator.a(this.goy);
        this.dcq = 0;
    }

    private void createLineMesh() {
        this.goy.jM(false);
        this.goy.wD(false);
        this.goy.lQ(false);
        this.goy.ts(this.GUID);
        this.goy.hC(this.GUID);
        this.goy.YG(1);
        kkv kkv2 = (kkv)gnw.h(1031);
        kkv2.a(this.goy);
        kkv2.wD(true);
        this.MessageDelegator.a(kkv2);
        this.dcq = 0;
    }

    private void bmi() {
        if (!this.gny) {
            return;
        }
        kkv kkv2 = (kkv)gnw.h(1031);
        kkv2.YG(256);
        kkv2.jM(false);
        kkv2.wD(false);
        kkv2.lQ(false);
        kkv2.ts(this.GUID);
        kkv2.hC(this.GUID);
        this.MessageDelegator.a(kkv2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 1024) {
            this.gnx = true;
            kux kux2 = (kux)ktv2;
            if (kux2.getResult() == 0) {
                this.gny = true;
            }
        } else {
            super.receiveResponse(ktv2);
        }
    }

    public boolean isConstantSize() {
        return this.goy.isConstantSize();
    }

    public void setConstantSize(boolean bl) {
        this.goy.setConstantSize(bl);
        this.dcq |= 4;
    }

    public lcq bmj() {
        return this.goy.bmj();
    }

    public void m(lcq lcq2) {
        this.goy.m(lcq2);
        this.dcq |= 0x10;
    }

    public boolean isHasTexture() {
        return this.goy.isHasTexture();
    }

    public void setHasTexture(boolean bl) {
        this.goy.setHasTexture(bl);
    }

    public float getLineWidth() {
        return this.goy.getLineWidth();
    }

    public void setLineWidth(float f2) {
        this.goy.setLineWidth(f2);
        this.dcq |= 2;
    }

    public ljq[] bmk() {
        return this.goy.ecs();
    }

    public void aD(List list) {
        this.goy.l(list.toArray(new ljq[list.size()]));
        this.dcq |= 8;
    }

    public void e(ljq[] ljqArray) {
        this.goy.l(ljqArray);
        this.dcq |= 8;
    }

    public ljq av() {
        return this.goy.av();
    }

    public void c(ljq ljq2) {
        this.goy.c(ljq2);
        this.dcq |= 0x40;
    }

    public lgl aw() {
        return this.goy.aw();
    }

    public void a(lgl lgl2) {
        this.goy.a(lgl2);
        this.dcq |= 0x80;
    }

    public String getTextureName() {
        return this.goy.getTextureName();
    }

    public void setTextureName(String string) {
        this.goy.setTextureName(string);
        this.dcq |= 0x20;
    }

    public boolean isTransformPoints() {
        return this.goy.isTransformPoints();
    }

    public void setTransformPoints(boolean bl) {
        this.goy.setTransformPoints(bl);
    }

    public void gW(String string) {
        this.goy.gW(string);
    }

    public void i(ljp ljp2) {
        this.goy.i(ljp2);
    }

    public void b(ljr ljr2) {
        this.goy.b(ljr2);
    }
}

