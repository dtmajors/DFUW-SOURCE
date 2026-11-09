/*
 * Decompiled with CFR.
 */
public class kxz
extends kxv {
    private boolean qiz = true;

    public boolean eiA() {
        return this.qiz;
    }

    public void xQ(boolean bl) {
        this.qiz = bl;
    }

    @Override
    public String getFunctionName() {
        return cbs.oK(this.bst);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof kxz) {
            return super.equals(object);
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFGamelogicFunctionCode: Function='");
        stringBuilder.append(this.getFunctionName());
        stringBuilder.append(" SimpleFunction=");
        stringBuilder.append(this.qiz);
        stringBuilder.append("' ");
        stringBuilder.append(this.ein());
        return stringBuilder.toString();
    }
}

