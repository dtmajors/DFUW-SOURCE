/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.HashMap;
import java.util.HashSet;

public class iga
extends ifv
implements htl,
htv {
    private float lSh;
    private ljq lSi;
    private ljq lSj;
    private boolean lSk;

    @Override
    public float a(ljq ljq2, boolean bl, che che2, ljq ljq3) {
        cho cho2 = (cho)che2;
        if (!cho2.ezQ.bZR && !cho2.ezQ.Pp) {
            return -1.0f;
        }
        les les2 = lea.enW();
        float f = Float.MAX_VALUE;
        boolean bl2 = false;
        if (les2.isDescendant(cho2.ResourceType, cug.fgG)) {
            HashMap<Integer, HashSet<igh>> hashMap = !bl ? igj.lSx : igj.lSy;
            HashSet<igh> hashSet = hashMap.get(cho2.ResourceType);
            if (hashSet != null) {
                for (igh igh2 : hashSet) {
                    float f2 = igh2.cY(ljq2);
                    if (!(f2 < f)) continue;
                    f = f2;
                    bl2 = true;
                    ljq3.ex(igh2.av());
                }
            }
        } else if (hso.cxK().cxP().czb().dNh()) {
            ayp[] aypArray;
            if (!cho2.ezV.bZR && cho2.ezV.Pp && (aypArray = hso.cxK().cxP().czb().dNi().abb()) != null) {
                block4: for (ayp ayp2 : aypArray) {
                    switch (ayp2.abi()) {
                        case cvj: 
                        case cvk: {
                            float f3 = iga.o(ljq2, ayp2.av());
                            if (!(f3 < f)) continue block4;
                            f = f3;
                            bl2 = true;
                            ljq3.ex(ayp2.av());
                        }
                    }
                }
            }
            if (!cho2.ezS.bZR && cho2.ezS.Pp || !cho2.ezT.bZR && cho2.ezT.Pp) {
                this.lSi = ljq2;
                this.lSh = Float.MAX_VALUE;
                this.lSk = false;
                this.lSj = ljq3;
                hso.cxK().cxP().czb().a(this);
                if (this.lSk && this.lSh < f) {
                    f = this.lSh;
                    bl2 = true;
                }
            }
        }
        return bl2 ? f : -1.0f;
    }

    @Override
    public void oj() {
    }

    @Override
    public void b(ayq[] ayqArray) {
        bcq[] bcqArray;
        bcq[] bcqArray2 = bcqArray = hso.cxK().cxP().czb().dNh() ? hso.cxK().cxP().czb().dNi().abc() : null;
        if (bcqArray == null) {
            return;
        }
        for (bcq bcq2 : bcqArray) {
            ayq ayq2;
            if (bcq2.ali() != bcr.cXe || (ayq2 = iga.a(ayqArray, bcq2.iG())) == null) continue;
            hso.cxK().cxP().czb().a((htl)this, ayq2);
        }
    }

    @Override
    public void b(aym aym2) {
        ayp[] aypArray;
        ayp[] aypArray2 = aypArray = hso.cxK().cxP().czb().dNh() ? hso.cxK().cxP().czb().dNi().abb() : null;
        if (aypArray == null) {
            return;
        }
        block3: for (ayp ayp2 : aypArray) {
            switch (ayp2.abi()) {
                case cvj: 
                case cvk: {
                    float f = iga.o(this.lSi, ayp2.av());
                    if (!(f < this.lSh)) continue block3;
                    this.lSh = f;
                    this.lSk = true;
                    this.lSj.ex(ayp2.av());
                }
            }
        }
    }

    private static ayq a(ayq[] ayqArray, ldv ldv2) {
        for (ayq ayq2 : ayqArray) {
            if (!ldv.au(ayq2.iG(), ldv2)) continue;
            return ayq2;
        }
        return null;
    }

    private static float o(ljq ljq2, ljq ljq3) {
        boolean bl;
        boolean bl2 = ljq2.y < -1000.0f;
        boolean bl3 = bl = ljq3.y < -1000.0f;
        if (bl2 != bl) {
            return Float.MAX_VALUE;
        }
        float f = ljq2.x - ljq3.x;
        float f2 = -ljq2.rlV - -ljq3.rlV;
        return (float)Math.sqrt(f * f + f2 * f2);
    }
}

