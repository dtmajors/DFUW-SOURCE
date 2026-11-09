/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public final class ckh
extends Enum<ckh> {
    public static final /* enum */ ckh eGx = new ckh();
    public static final /* enum */ ckh eGy = new ckh();
    public static final /* enum */ ckh eGz = new ckh();
    public static final /* enum */ ckh eGA = new ckh();
    private static final /* synthetic */ ckh[] eGB;

    public static ckh[] values() {
        return (ckh[])eGB.clone();
    }

    public static ckh valueOf(String string) {
        return Enum.valueOf(ckh.class, string);
    }

    public static ckh getWeaponType(int n) {
        bqm.d d2 = bqm.d.getWeaponType(n);
        if (d2 == null) {
            return null;
        }
        if (bqm.d.isTwoHandedWeapon(d2)) {
            return eGx;
        }
        if (bqm.d.isOneHandedWeapon(d2) || lea.enW().isDescendant(n, cug.fkF)) {
            return eGy;
        }
        if (d2 == bqm.d.MAGIC_STAFF) {
            return eGz;
        }
        if (d2 == bqm.d.BOW || d2 == bqm.d.KNIVES) {
            return eGA;
        }
        return null;
    }

    public static ckh getWeaponType(jev jev2) {
        if (jev2 == null) {
            assert (false);
            return null;
        }
        switch (jev2) {
            case mWg: {
                return eGA;
            }
            case mWh: {
                return eGy;
            }
            case mWi: {
                return eGz;
            }
            case mWj: {
                return eGx;
            }
        }
        assert (false) : "Invalid Type : " + (Object)((Object)jev2);
        return null;
    }

    public static int getWeaponTypeConnectedAttribute(int n) {
        if (!bsi.mz(n) && !bsi.my(n)) {
            return -1;
        }
        if (bsi.mz(n)) {
            bqm.d d2 = bqm.d.getWeaponType(n);
            if (d2 == null) {
                return -1;
            }
            if (bqm.d.isTwoHandedWeapon(d2) && d2 != bqm.d.KNIVES) {
                return 13376;
            }
            if (bqm.d.isOneHandedWeapon(d2)) {
                return 13392;
            }
            if (d2 == bqm.d.MAGIC_STAFF) {
                return 13408;
            }
            if (d2 == bqm.d.BOW || d2 == bqm.d.KNIVES) {
                return 13424;
            }
        }
        if (lea.enW().isDescendant(n, cug.fkF)) {
            return 13392;
        }
        return -1;
    }

    public static int getWeaponTypeConnectedAttribute(ckh ckh2) {
        if (ckh2 == null) {
            return -1;
        }
        switch (ckh2) {
            case eGx: {
                return 13376;
            }
            case eGy: {
                return 13392;
            }
            case eGz: {
                return 13408;
            }
            case eGA: {
                return 13424;
            }
        }
        assert (false) : "Invalid Type : " + (Object)((Object)ckh2);
        return -1;
    }

    public static int getWeaponTypeConnectedAttribute(jev jev2) {
        if (jev2 == null) {
            assert (false);
            return -1;
        }
        switch (jev2) {
            case mWg: {
                return 13424;
            }
            case mWh: {
                return 13392;
            }
            case mWi: {
                return 13408;
            }
            case mWj: {
                return 13376;
            }
        }
        assert (false) : "Invalid Type : " + (Object)((Object)jev2);
        return -1;
    }

    static {
        eGB = new ckh[]{eGx, eGy, eGz, eGA};
    }
}

