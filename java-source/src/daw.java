/*
 * Decompiled with CFR.
 */
public class daw
extends czb {
    private float fXg = 0.0f;

    public float xo(int n2) {
        switch (n2) {
            case 2: {
                return this.fXg;
            }
        }
        return super.xo(n2);
    }

    public String bfB() {
        return "SFEvadeSkill";
    }

    public float bgc() {
        return this.fXg;
    }

    public void fn(float f2) {
        this.fXg = f2;
    }

    @Override
    protected void e(cxc cxc2) {
        super.e(cxc2);
        daw daw2 = (daw)((Object)cxc2);
        daw2.fn(this.fXg);
    }

    protected void beA() {
        if (this.aJz().bgR().aJD() == null) {
            return;
        }
        boolean[] blArray = this.aJz().bgR().aJD().aEM();
        this.emI.bgQ().aJD().aEi();
        int n2 = -1;
        boolean bl = false;
        block3: for (int i2 = 0; i2 < 4; ++i2) {
            boolean bl2 = blArray[i2];
            if (!bl2) continue;
            bl = true;
            switch (i2) {
                case 0: 
                case 2: 
                case 3: {
                    n2 = 590246;
                    continue block3;
                }
                default: {
                    n2 = 590247;
                }
            }
        }
        if (!bl) {
            n2 = 590247;
        }
        if (this.aJz().bgR().aJD().aDc() != null) {
            this.aJz().bgQ().aJD().aDc().nG(n2);
        }
        this.bhq();
    }
}

