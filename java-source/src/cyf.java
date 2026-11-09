/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  cyt
 */
public class cyf
extends cye {
    public final cxd.c fGa;
    private static les aqN = lea.enZ();

    public cyf(int n2, cxd.c c2) {
        super(n2);
        this.fGa = c2;
    }

    public boolean a(int n2, cyt cyt2) {
        assert (n2 > 0);
        assert (cyt2 != null);
        switch (this.fGa) {
            case fQu: {
                return true;
            }
            case fQv: {
                return n2 != cxd.fJY && n2 != cxd.fKc && n2 != cxd.fKd;
            }
            case fQx: 
            case fQy: {
                if (cxd.xA((int)n2)) {
                    if (n2 != cxd.fHu) {
                        return false;
                    }
                    if (lea.enZ().isDescendant(this.SkillType, cxd.fIe)) {
                        return false;
                    }
                    if (lea.enZ().isDescendant(this.SkillType, cxd.fIs)) {
                        return false;
                    }
                    if (lea.enZ().isDescendant(this.SkillType, cxd.fJq)) {
                        return false;
                    }
                    if (lea.enZ().isDescendant(this.SkillType, cxd.fJi)) {
                        return false;
                    }
                }
                return true;
            }
            case fQz: {
                return true;
            }
            case fQw: {
                return n2 != cxd.fJV;
            }
            case fQB: {
                return this.SkillType == n2;
            }
        }
        lfn.b(5, "SFBlockingItemSession", "isSkillBlocked() Invalid blockingtype found.");
        lfn.b(5, "SFBlockingItemSession", "isSkillBlocked() " + this.toString());
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" ");
        stringBuilder.append((Object)this.fGa);
        return stringBuilder.toString();
    }
}

