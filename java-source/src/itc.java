/*
 * Decompiled with CFR.
 */
public class itc
extends ipz {
    private static final String myz = "/";
    private String myA;

    public itc(String string) {
        this.a(iqo.dmS());
        this.sa(true);
        this.setPath(string);
    }

    public void setPath(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        if (lhn.equal(string, this.myA)) {
            return;
        }
        this.myA = string;
        String[] stringArray = string.split(myz);
        this.removeAllChildren();
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            if (this.bfn() > 0) {
                this.W(ipx.d(new ist(isf.mwN, 12, 0xABABAB, myz)));
            }
            if (i < stringArray.length - 1) {
                this.W(ipx.d(new ism(this, isf.mwN, 12, 0xABABAB, string2, string2){
                    final /* synthetic */ String myB;
                    final /* synthetic */ itc myC;
                    {
                        this.myC = itc2;
                        this.myB = string2;
                        super(isf2, n, n2, string);
                    }

                    public boolean du(int n, int n2) {
                        this.myC.qE(this.myB);
                        return true;
                    }

                    public void cND() {
                        super.cND();
                        this.Rk(this.dkb() ? 0xC0C0C0 : 0xABABAB);
                    }
                }));
                continue;
            }
            this.W(ipx.d(new ist(isf.mwN, 12, 0xABABAB, string2)));
        }
    }

    public void qE(String string) {
    }
}

