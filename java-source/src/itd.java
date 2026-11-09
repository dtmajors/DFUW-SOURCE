/*
 * Decompiled with CFR.
 */
public abstract class itd {
    public abstract String getText();

    public static itd ry(String string) {
        return new itd(string){
            final /* synthetic */ String lWu;
            {
                this.lWu = string;
            }

            public String getText() {
                return this.lWu;
            }
        };
    }

    public static itd b(lox lox2, boolean bl) {
        return new itd(lox2, bl){
            final /* synthetic */ lox myD;
            final /* synthetic */ boolean mxo;
            {
                this.myD = lox2;
                this.mxo = bl;
            }

            public String getText() {
                String string = this.myD.bD(new Object[0]).exA();
                return this.mxo ? string.toUpperCase() : string;
            }
        };
    }

    public static itd h(lox lox2) {
        return itd.b(lox2, false);
    }
}

