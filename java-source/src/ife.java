/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Iterator;
import java.util.Set;

public class ife
extends ifd {
    Set<bsh> lRb = null;

    @Override
    public boolean cRY() {
        return false;
    }

    @Override
    public String cRZ() {
        return "";
    }

    @Override
    public float cSa() {
        return 1.0f;
    }

    ife(bsh bsh2) {
        super(bsh2);
    }

    @Override
    protected boolean cSe() {
        if (this.lQU == null) {
            lfn.b(5, "SFSalvageableItemBroken", "setupItem() : Item is Null!!!");
            return false;
        }
        if (!ife.M(this.lQU)) {
            return false;
        }
        if (!cug.wm((int)this.lQU.az())) {
            return false;
        }
        this.iNh = cug.wn((int)this.lQU.az());
        return super.cSe();
    }

    @Override
    public boolean a(ifd ifd2) {
        if (ifd2 == null) {
            return false;
        }
        if (!(ifd2 instanceof ife)) {
            return false;
        }
        if (this.lQU == null || ifd2.lQU == null) {
            return false;
        }
        if (this.lQU.az() != ifd2.lQU.az()) {
            return false;
        }
        if (this.lRb == null) {
            this.lRb = lcn.emx();
        }
        this.lRb.add(ifd2.lQU);
        this.lQV += ifd2.lQV;
        return true;
    }

    @Override
    public void K(bsh bsh2) {
        if (ldv.au(this.lQU.getGUID(), bsh2.getGUID())) {
            this.lQU = bsh2;
        } else if (this.lRb != null) {
            Iterator<bsh> iterator = this.lRb.iterator();
            boolean bl = false;
            while (iterator.hasNext()) {
                if (!ldv.au(iterator.next().getGUID(), bsh2.getGUID())) continue;
                iterator.remove();
                bl = true;
                break;
            }
            if (bl) {
                this.lRb.add(bsh2);
            }
        }
        this.lQV = this.lQU.vf();
        if (this.lRb != null) {
            for (bsh bsh3 : this.lRb) {
                this.lQV += bsh3.vf();
            }
        }
    }

    @Override
    public boolean L(bsh bsh2) {
        if (bsh2 == null) {
            return true;
        }
        if (!this.equals(bsh2)) {
            return true;
        }
        if (ldv.au(this.lQU == null ? null : this.lQU.getGUID(), bsh2.getGUID())) {
            this.lQU = null;
            if (this.lRb != null && !this.lRb.isEmpty()) {
                Iterator<bsh> iterator = this.lRb.iterator();
                this.lQU = iterator.next();
                iterator.remove();
            }
            if (this.lQU != null) {
                this.lQV = this.lQU.vf();
                if (this.lRb != null) {
                    for (bsh bsh3 : this.lRb) {
                        this.lQV += bsh3.vf();
                    }
                }
                return this.lQV > 0;
            }
            return false;
        }
        if (this.lRb != null) {
            this.lRb.remove(bsh2);
        }
        int n = this.lQV = this.lQU == null ? 0 : this.lQU.vf();
        if (this.lRb != null) {
            for (bsh bsh4 : this.lRb) {
                this.lQV += bsh4.vf();
            }
        }
        return this.lQV > 0;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof ife) {
            ife ife2 = (ife)object;
            if (this.lQU == null && ife2.lQU == null) {
                return true;
            }
            if (this.lQU == null || ife2.lQU == null) {
                return false;
            }
            if (ldv.au(this.lQU.getGUID(), ife2.lQU.getGUID())) {
                return true;
            }
            if (this.lRb != null) {
                for (bsh bsh2 : this.lRb) {
                    if (ldv.au(bsh2.getGUID(), ife2.lQU.getGUID())) {
                        return true;
                    }
                    if (ife2.lRb == null) continue;
                    for (bsh bsh3 : ife2.lRb) {
                        if (!ldv.au(bsh2.getGUID(), bsh3.getGUID())) continue;
                        return true;
                    }
                }
            }
            return false;
        }
        if (object instanceof bsh) {
            bsh bsh4 = (bsh)object;
            if (this.lQU == null && bsh4 == null) {
                return true;
            }
            if (this.lQU == null || bsh4 == null) {
                return false;
            }
            if (ldv.au(this.lQU.getGUID(), bsh4.getGUID())) {
                return true;
            }
            if (this.lRb != null) {
                for (bsh bsh5 : this.lRb) {
                    if (!ldv.au(bsh5.getGUID(), bsh4.getGUID())) continue;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean rz(ldv ldv2) {
        if (this.lRb == null || this.lRb.isEmpty()) {
            return false;
        }
        for (bsh bsh2 : this.lRb) {
            if (!bsh2.getGUID().equals(ldv2)) continue;
            return true;
        }
        return false;
    }
}

