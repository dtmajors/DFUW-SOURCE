/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
public class anh {
    public static void a(ldg[] ldgArray, ldv ldv2, dxr dxr2, ldv ldv3) {
        ldg[] ldgArray2 = new ldg[ldgArray.length];
        for (int i = 0; i < ldgArray2.length; ++i) {
            ldgArray2[i] = new ldg();
            ldgArray2[i].mx = new ljq(ldgArray[i].mx);
            ldgArray2[i].cck = ldgArray[i].cck;
            ldgArray2[i].Position = new ljq(ldgArray[i].Position);
            ldgArray2[i].fXV = ldgArray[i].fXV;
        }
        gjt gjt2 = (gjt)dxr2.h(4617, ldv3, ldv2);
        gjt2.aZF = 64;
        gjt2.dcp = ldgArray2;
        gjt2.SkillType = cxd.fHt;
        dxr2.F(gjt2);
    }

    public static void a(ldv ldv2, dxr dxr2, ldv ldv3) {
        gjv gjv2 = (gjv)dxr2.h(4618, ldv3, ldv2);
        gjv2.SkillType = cxd.fHt;
        dxr2.F(gjv2);
    }

    public static void a(float f, ldv ldv2, dxr dxr2, ldv ldv3) {
        if (ldv2 == null) {
            return;
        }
        ftw ftw2 = (ftw)dxr2.h(1039, ldv3, ldv2);
        ftw2.imk = 2;
        ftw2.Rotation = new lgl(0.0f, f, 0.0f);
        dxr2.F(ftw2);
    }
}

