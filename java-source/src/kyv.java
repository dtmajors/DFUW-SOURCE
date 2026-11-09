/*
 * Decompiled with CFR.
 */
class kyv {
    public String mHf = null;
    public boolean qmZ = false;
    public boolean qna = false;
    public boolean qnb = false;

    kyv() {
    }

    public boolean a(kyv kyv2) {
        if (this.qmZ != kyv2.qmZ) {
            return false;
        }
        if (this.qna != kyv2.qna) {
            return false;
        }
        if (this.qnb != kyv2.qnb) {
            return false;
        }
        if (this.qna) {
            return this.mHf.equals(kyv2.mHf);
        }
        return this.mHf.equalsIgnoreCase(kyv2.mHf);
    }
}

