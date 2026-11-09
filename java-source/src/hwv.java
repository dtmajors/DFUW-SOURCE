/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hvy
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class hwv
extends hwm {
    protected bsj liR = null;
    protected bsn liS = null;
    protected ldy liT = null;
    protected float liI = -1.0f;
    private int liL = -1;
    private boolean liU = false;

    private hwv() {
    }

    public int zg() {
        return this.liS.getType();
    }

    protected hwv(String[] stringArray) {
        if (stringArray.length > 1) {
            int n = Integer.valueOf(stringArray[1]);
            this.liS = (bsn)((Object)lea.enZ().acv(n));
            this.liR = hso.cxK().cxP().cyZ().ht(n);
            if (this.liR != null) {
                this.avz = hso.cxK().cxP().cyZ().cj((cxc)this.liR);
            }
            this.liT = (ldy)lea.eob().acv(n);
        }
    }

    public hwv(bsj bsj2) {
        this.liR = bsj2;
        this.liS = (bsn)bsj2.awE();
        this.avz = hso.cxK().cxP().cyZ().cj((cxc)bsj2);
        this.liT = (ldy)lea.eob().acv(this.liS.getType());
    }

    public hwv(bsn bsn2) {
        this.liS = bsn2;
        this.avz = true;
        ldy ldy2 = this.liT = bsn2 != null && lea.eob() != null ? (ldy)lea.eob().acv(this.liS.getType()) : null;
        if (this.liT == null) {
            // empty if block
        }
    }

    public hwv(ldy ldy2) {
        this.liS = (bsn)((Object)lea.enZ().acv(ldy2.getType()));
        this.avz = true;
    }

    @Override
    public SFGUIElementDTO cBj() {
        String string;
        SFGUIElementDTO sFGUIElementDTO = new SFGUIElementDTO();
        sFGUIElementDTO.iconName = string = "texture/dds/" + this.liS.atw().Name;
        sFGUIElementDTO.quantity = 1;
        sFGUIElementDTO.text = lya.tCp.bD(this.liS.getName()).exA();
        if (this.liT != null) {
            sFGUIElementDTO.progressColor = this.liT.Hr();
            sFGUIElementDTO.progressTrackColor = this.liT.enL();
        }
        sFGUIElementDTO.progressShape = this.liT != null && this.liT.cCr() == ldy.a.CATEGORY ? 12 : 2;
        sFGUIElementDTO.state = this.getState();
        if (this.liI >= 0.0f) {
            sFGUIElementDTO.progress = this.liI;
            sFGUIElementDTO.progressShape = 2;
            sFGUIElementDTO.progressColor = 0xFF0000;
            sFGUIElementDTO.progressTrackColor = 0xFFFFFF;
        }
        if (this.liT == null || this.liT.cCr() == ldy.a.FOLDER || !this.liU) {
            sFGUIElementDTO.skillUpButton = 0;
        } else {
            hvy hvy2 = hso.cxK().cxP().cyZ();
            if (hvy2 != null) {
                sFGUIElementDTO.skillUpButton = hvy2.Ou(this.liS.getType());
            }
        }
        return sFGUIElementDTO;
    }

    public ldy.a cCr() {
        return this.liT != null ? this.liT.cCr() : null;
    }

    @Override
    public String getName() {
        return this.liS.getName();
    }

    @Override
    public String getDescription() {
        return this.liS.getDescription();
    }

    public bsj cCs() {
        return this.liR;
    }

    public void setProgress(float f2) {
        this.liI = f2;
    }

    @Override
    public boolean a(cxc cxc2, float f2, int n) {
        if (this.liR == null) {
            return false;
        }
        if (cxc2.getGUID().equals(this.liR.getGUID())) {
            if (f2 <= 0.0f) {
                this.liI = -1.0f;
                return true;
            }
            int n2 = this.getState();
            float f3 = this.liI;
            this.liI = f2;
            if (this.getState() != n2) {
                return true;
            }
            this.liI = f3;
            float f4 = Math.abs(f2 - this.liI);
            if (f4 < 0.027777778f && this.liL != n && n - this.liL < 20) {
                return false;
            }
            this.liL = n;
            this.liI = f2;
            return true;
        }
        return false;
    }

    @Override
    public boolean d(cxc cxc2, boolean bl) {
        if (this.liR == null) {
            return false;
        }
        if (!cxc2.getGUID().equals(this.liR.getGUID())) {
            return false;
        }
        this.avz = bl;
        return true;
    }

    public bsn awK() {
        return this.liS;
    }

    public String toString() {
        return "skill;" + this.liS.getType();
    }

    public void a(bsj bsj2) {
        this.liR = bsj2;
    }

    @Override
    public float cBk() {
        return this.liI;
    }

    @Override
    public int getState() {
        int n = 0;
        n = this.avz ? ((double)this.liI >= 0.01 && (double)this.liI <= 0.99 ? 3 : 0) : 1;
        return n;
    }

    public void setEnabled(boolean bl) {
        this.avz = bl;
    }

    public boolean cCt() {
        return this.avz;
    }

    @Override
    public boolean b(hwm hwm2) {
        if (!(hwm2 instanceof hwv)) {
            return false;
        }
        hwv hwv2 = (hwv)hwm2;
        return hwv2.liS.getType() == this.liS.getType();
    }

    @Override
    public hwm cBl() {
        hwv hwv2 = new hwv();
        hwv2.liR = this.liR;
        hwv2.liS = this.liS;
        hwv2.liT = this.liT;
        hwv2.liI = this.liI;
        hwv2.avz = this.avz;
        return hwv2;
    }

    public void oW(boolean bl) {
        this.liU = bl;
    }

    public boolean cCo() {
        if (this.cCs() == null) {
            return false;
        }
        return jfd.Uo(this.zg());
    }
}

