/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import java.util.ArrayList;
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class ibi {
    private static int lEQ = 0;

    public static String a(hzk hzk2, hwo hwo2) {
        SFGUIElementDTO sFGUIElementDTO = hwo2.cBj();
        String string = "../" + sFGUIElementDTO.iconName;
        return ibi.a(ibh.lEK, ibi.b(hzk2, hwo2), string);
    }

    public static String a(hyn hyn2, hwv hwv2) {
        SFGUIElementDTO sFGUIElementDTO = hwv2.cBj();
        String string = "../" + sFGUIElementDTO.iconName;
        return ibi.a(ibh.lEL, ibi.b(hyn2, hwv2), string);
    }

    public static String a(ign ign2) {
        String string = "<a href='event:" + ibh.lEM.name() + ':' + ign2.getId() + "'><font color='#888888'>[" + ign2.getTitle() + "]</font></a>";
        return string;
    }

    public static String b(ign ign2) {
        String string = "<a href='event:" + ibh.lEN.name() + ':' + ign2.getId() + "'><font color='#888888'>[+]</font></a>" + " " + "<a href='event:" + ibh.lEO.name() + ':' + ign2.getId() + "'><font color='#888888'>[-]</font></a>";
        return string;
    }

    public static hyn oW(String string) {
        string = string.replace("event:", "");
        String string2 = string.substring(0, string.indexOf(58));
        ibh ibh2 = ibh.valueOf(string2);
        if ((string = string.replace(string2 + ":", "")) == null || string.isEmpty() || string.equalsIgnoreCase("null")) {
            return null;
        }
        switch (ibh2) {
            case lEK: {
                return new iac(hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), iaa.oI(string));
            }
            case lEL: {
                return new iag(hso.cxK().cxP().bpb(), hso.cxK().cxP().bpc(), iaf.oL(string));
            }
            case lEM: {
                return iae.oJ(lvw.tbX.bD(new Object[0]).exA().toUpperCase());
            }
            case lEN: {
                return iae.oJ(lvw.tbY.bD(new Object[0]).exA().toUpperCase());
            }
            case lEO: {
                return iae.oJ(lvw.tbZ.bD(new Object[0]).exA().toUpperCase());
            }
        }
        return null;
    }

    private static String a(ibh ibh2, String string, String string2) {
        return "<img src='img:///dfdata/gui/" + string2 + "' width='18' height='18' id='" + lEQ++ + ':' + ibh2.name() + ":" + string + "'/>";
    }

    private static String b(hzk hzk2, hwo hwo2) {
        iac iac2 = new iac(hwo2, 0, 0, false, false, true);
        if (iac2 != null) {
            iaa iaa2 = iac2.cJX();
            String string = iaa2.cJW();
            return string;
        }
        return null;
    }

    private static String b(hyn hyn2, hwv hwv2) {
        iew iew2;
        iag iag2;
        if (hyn2 instanceof iew && (iag2 = (iew2 = (iew)hyn2).a(hwv2)) != null) {
            iaf iaf2 = iag2.cKe();
            return iaf2.cJW();
        }
        return null;
    }

    private static String d(int n, ej[] ejArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n);
        for (ej ej2 : ejArray) {
            stringBuilder.append(',');
            String string = ej2.fk();
            stringBuilder.append(string);
        }
        String string = stringBuilder.toString();
        return string;
    }

    private static hwo oX(String string) {
        String[] stringArray = string.split(",");
        int n = Integer.parseInt(stringArray[0]);
        ArrayList<ej> arrayList = lcn.emv();
        for (int j = 1; j < stringArray.length; ++j) {
            arrayList.add(ej.ar(stringArray[j]));
        }
        return new hwo(new bru((lgw)lea.enW().acv(n), arrayList.toArray(new ej[arrayList.size()])));
    }
}

