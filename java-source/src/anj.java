/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 */
public class anj {
    public static void a(float f, ldv ldv2, dxr dxr2, ldv ldv3) {
        if (ldv2 == null) {
            return;
        }
        ftw ftw2 = (ftw)dxr2.h(1039, ldv3, ldv2);
        ftw2.imk = 2;
        ftw2.Rotation = new lgl(0.0f, f, 0.0f);
        dxr2.F(ftw2);
    }

    public static void a(ljq ljq2, ldv ldv2, dxr dxr2, ldv ldv3) {
        if (ldv2 == null) {
            return;
        }
        if (dxr2 == null) {
            return;
        }
        if (ldv3 == null) {
            return;
        }
        if (ljq2 == null) {
            return;
        }
        ftw ftw2 = (ftw)dxr2.h(1039, ldv3, ldv2);
        ftw2.imk = 1;
        ftw2.Position = ljq2.esF();
        dxr2.I(ftw2);
    }

    public static void a(ldv ldv2, int n, int n2, boolean bl, dxr dxr2, ldv ldv3) {
        gjt gjt2 = (gjt)dxr2.h(4617, ldv3, ldv2);
        gjt2.aZF = 3;
        gjt2.ecU = new boolean[6];
        gjt2.ecU[n2] = true;
        gjt2.gcv = bl;
        gjt2.SkillType = n;
        dxr2.F(gjt2);
    }

    public static void a(ldv ldv2, int n, dxr dxr2, ldv ldv3) {
        gjv gjv2 = (gjv)dxr2.h(4618, ldv3, ldv2);
        gjv2.SkillType = n;
        dxr2.F(gjv2);
    }

    public static void b(ldv ldv2, dxr dxr2, ldv ldv3) {
        gjt gjt2 = (gjt)dxr2.h(4617, ldv3, ldv2);
        gjt2.SkillType = cxd.fHu;
        dxr2.F(gjt2);
    }

    public static void b(ldv ldv2, int n, int n2, boolean bl, dxr dxr2, ldv ldv3) {
        gjz gjz2 = (gjz)dxr2.h(4619, ldv3, ldv2);
        gjz2.aZF = 3;
        gjz2.ecU = new boolean[6];
        gjz2.ecU[n2] = true;
        gjz2.gcv = bl;
        gjz2.SkillType = n;
        dxr2.F(gjz2);
    }

    public static void c(ldv ldv2, dxr dxr2, ldv ldv3) {
        gjt gjt2 = (gjt)dxr2.h(4617, ldv3, ldv2);
        gjt2.SkillType = cxd.fHy;
        dxr2.F(gjt2);
    }

    public static void d(ldv ldv2, dxr dxr2, ldv ldv3) {
        gjv gjv2 = (gjv)dxr2.h(4618, ldv3, ldv2);
        gjv2.SkillType = cxd.fHy;
        dxr2.F(gjv2);
    }
}

