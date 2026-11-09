/*
 * Decompiled with CFR.
 */
public class iya
extends iry {
    private ipk lGR;
    private ipb mcc;
    private static iqz mdv = new irl(){

        public void e(ipf ipf2) {
            iya iya2 = (iya)ipf2;
            if (iya2.djZ()) {
                iya2.setSize(29, 29);
            } else {
                iya2.setSize(24, 24);
            }
        }
    };

    public static iya rD(String string) {
        return string != null && string.length() > 0 ? new iya(string) : null;
    }

    public iya(String string) {
        this.a(mdv);
        this.lGR = new ipk(0x232323);
        this.lGR.setVisible(false);
        this.W(this.lGR);
        this.mcc = new ipb(string);
        this.W(this.mcc);
    }

    public iya() {
        this((String)null);
    }

    public ipk dsH() {
        return this.lGR;
    }

    public ipb drt() {
        return this.mcc;
    }

    @Override
    public void kh(float f2) {
        if (this.lGR != null) {
            this.lGR.hz(f2);
        }
    }

    @Override
    public void cPw() {
        this.lGR.setVisible(this.djZ());
        this.pack();
    }
}

