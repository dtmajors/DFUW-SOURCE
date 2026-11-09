/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class iwv
extends ipx {
    private loz mAY = null;
    private SFTooltipBaseDTO lzR = null;
    private ipb mAZ = null;

    public iwv(String string, loz loz2) {
        this.a(iqp.dmW());
        this.mAZ = new ipb(string);
        this.W(this.mAZ);
        this.mAY = loz2;
    }

    public iwv(String string, int n, int n2, loz loz2) {
        this.a(iqp.dmW());
        this.mAZ = new ipb(string, n, n2);
        this.W(this.mAZ);
        this.mAY = loz2;
    }

    public iwv(String string, SFTooltipBaseDTO sFTooltipBaseDTO) {
        this.a(iqp.dmW());
        this.mAZ = new ipb(string);
        this.W(this.mAZ);
        this.lzR = sFTooltipBaseDTO;
    }

    public iwv(String string) {
        this.a(iqp.dmW());
        this.mAZ = new ipb(string);
        this.W(this.mAZ);
    }

    public iwv() {
        this(null, (loz)null);
    }

    public void a(String string, loz loz2) {
        this.mAZ.qP(string);
        this.mAY = loz2;
    }

    public void qP(String string) {
        this.mAZ.qP(string);
    }

    @Override
    public hyn dd(int n, int n2) {
        return this.mAY != null ? (this.mAY != null ? iae.oJ(this.mAY.exA()) : iae.b(this.lzR)) : null;
    }
}

