/*
 * Decompiled with CFR.
 */
public class cnc
extends cna {
    private btn eHi = null;

    public cnc() {
        super(true);
    }

    public void receiveMessage(dxq dxq2) {
        if (this.eHi != null && this.eHi.a(dxq2, (btk)((Object)this))) {
            return;
        }
        super.receiveMessage(dxq2);
    }

    public void hC(String string) {
        ej ej2 = this.jm().ae(10432);
        if (ej2 == null) {
            return;
        }
        if (!(ej2 instanceof ff)) {
            return;
        }
        if (string == null) {
            string = "";
        }
        ff ff2 = (ff)ej2;
        ff2.av(string);
    }

    public void c(btn btn2) {
        this.eHi = btn2;
    }

    public void d(btn btn2) {
        this.eHi = null;
    }

    public void Hy() {
        this.aIw();
    }
}

