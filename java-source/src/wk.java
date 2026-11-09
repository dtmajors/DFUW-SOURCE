/*
 * Decompiled with CFR.
 */
public class wk
extends wf {
    public wj aYK;

    public wk() {
        super((byte)11);
    }

    @Override
    protected void d(uk uk2) {
        super.d(uk2);
        vk vk2 = (vk)uk2;
        if (this.aYK == null) {
            vk2.aXW = null;
        } else {
            vk2.aXW = new alu();
            this.aYK.d(vk2.aXW);
        }
    }

    @Override
    protected void c(uk uk2) {
        super.c(uk2);
        vk vk2 = (vk)uk2;
        if (vk2.aXW == null) {
            this.aYK = null;
        } else {
            this.aYK = new wj();
            this.aYK.c(vk2.aXW);
        }
    }

    @Override
    public boolean e(uk uk2) {
        if (!super.e(uk2)) {
            return false;
        }
        vk vk2 = (vk)uk2;
        if (this.aYK == null != (vk2.aXW == null)) {
            return false;
        }
        if (this.aYK == null) {
            return true;
        }
        return this.aYK.e(vk2.aXW);
    }
}

