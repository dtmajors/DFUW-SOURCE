/*
 * Decompiled with CFR.
 */
public class ljl
extends lip {
    private final String rkd;
    private final lip[] ipJ;

    protected ljl() {
        this.rkd = null;
        this.ipJ = null;
    }

    public ljl(String string, lip[] lipArray) {
        for (int i = 0; i < lipArray.length; ++i) {
            assert (lipArray[i] != null);
        }
        this.rkd = string;
        this.ipJ = lipArray;
    }

    @Override
    public String esy() {
        String[] stringArray = new String[this.ipJ.length];
        for (int i = 0; i < this.ipJ.length; ++i) {
            stringArray[i] = this.ipJ[i].esy();
        }
        return hbd.jAL.b(this.rkd, stringArray);
    }

    public boolean a(ljl ljl2) {
        if (!this.rkd.equals(ljl2.rkd)) {
            return false;
        }
        if (this.ipJ.length != ljl2.ipJ.length) {
            return false;
        }
        for (int i = 0; i < this.ipJ.length; ++i) {
            if (this.ipJ[i].i(ljl2.ipJ[i])) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ljl) {
            return this.a((ljl)object);
        }
        return super.equals(object);
    }
}

