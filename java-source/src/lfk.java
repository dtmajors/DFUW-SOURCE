/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  dtc
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class lfk {
    public static dtc fy = null;

    public static final String ui(ldv ldv2) {
        if (fy == null) {
            lfn.b(5, "SFObjectKey", "getObjectKey() " + ldv2 + " Objectspacemanager is not set");
            return ldv2.toString();
        }
        dta dta2 = fy.od(new ldv(ldv2.ib(), ldv2.enw(), 0));
        if (dta2 == null) {
            lfn.b(4, "SFObjectKey", "getObjectKey() " + ldv2 + " could not find objectspace");
            return new ldv(0, ldv2.enw(), ldv2.enx()).toString();
        }
        amf amf2 = dta2.d(ldv2);
        if (amf2 == null) {
            lfn.b(4, "SFObjectKey", "getObjectKey() " + ldv2 + " could not find object");
            return new ldv(0, ldv2.enw(), ldv2.enx()).toString();
        }
        if (amf2 instanceof cxc) {
            cxc cxc2 = (cxc)amf2;
            return cxc2.getClass().getName() + "_" + lfk.zz(cxc2.getName());
        }
        lfn.b(4, "SFObjectKey", "getObjectKey() " + ldv2 + " not supporting " + amf2.getClass().getName());
        return new ldv(0, ldv2.enw(), ldv2.enx()).toString();
    }

    private static final String zz(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string.getBytes());
            String string2 = "";
            byte[] byArray = messageDigest.digest();
            for (int i = 0; i < byArray.length; ++i) {
                String string3;
                short s = byArray[i];
                if (s < 0) {
                    s = (short)(s + 256);
                }
                if ((string3 = Integer.toHexString(s)).length() < 2) {
                    string3 = "0" + string3;
                }
                string2 = string2 + string3;
            }
            return string2;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return null;
        }
    }
}

