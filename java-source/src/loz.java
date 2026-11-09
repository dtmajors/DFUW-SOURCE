/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 *  lcw
 */
import java.util.ArrayList;
import java.util.StringTokenizer;

public class loz {
    private lox rGE;
    private String rHk;
    private String[] rHl;

    private loz() {
    }

    public final String exz() {
        return this.rHk;
    }

    loz(lox lox2, Object[] objectArray) {
        this.rGE = lox2;
        this.rHk = lox2.Identifier;
        int n = lox2.rHh == null ? 0 : lox2.rHh.length;
        int n2 = objectArray == null ? 0 : objectArray.length;
        this.rHl = new String[n];
        block25: for (int i = 0; i < n; ++i) {
            if (i >= n2) {
                lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + " expected argument '" + lox2.rHh[i].Name + "' at index " + i);
                this.rHl[i] = "<UNDEFINED>";
                assert (false);
                continue;
            }
            switch (lox2.rHh[i].rHj) {
                case rGJ: {
                    if (objectArray[i] instanceof Boolean) {
                        this.rHl[i] = ((Boolean)objectArray[i]).toString();
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = Boolean.FALSE.toString();
                    continue block25;
                }
                case rGG: {
                    if (objectArray[i] instanceof Integer) {
                        this.rHl[i] = ((Integer)objectArray[i]).toString();
                        continue block25;
                    }
                    if (objectArray[i] instanceof Long) {
                        this.rHl[i] = ((Long)objectArray[i]).toString();
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "0";
                    continue block25;
                }
                case rGH: {
                    int n3 = lox2.rHh[i].kte;
                    if (objectArray[i] instanceof Integer) {
                        this.rHl[i] = ((Integer)objectArray[i]).toString();
                        continue block25;
                    }
                    if (objectArray[i] instanceof Long) {
                        this.rHl[i] = lpd.f((Long)objectArray[i], n3);
                        continue block25;
                    }
                    if (objectArray[i] instanceof Float) {
                        this.rHl[i] = lpd.f((Float)objectArray[i], n3);
                        continue block25;
                    }
                    if (objectArray[i] instanceof Double) {
                        this.rHl[i] = lpd.f((Double)objectArray[i], n3);
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "0";
                    continue block25;
                }
                case rGI: {
                    if (objectArray[i] instanceof String) {
                        this.rHl[i] = (String)objectArray[i];
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rGM: {
                    if (lox2.rHh[i].rFD.getName().equals(objectArray[i].getClass().getName())) {
                        this.rHl[i] = Integer.toString(((Enum)objectArray[i]).ordinal());
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = lox2.rHh[i].rFD.getEnumConstants()[0].toString();
                    continue block25;
                }
                case rGN: {
                    if (objectArray[i] instanceof Integer) {
                        this.rHl[i] = ((Integer)objectArray[i]).toString();
                        continue block25;
                    }
                    if (objectArray[i] instanceof Long) {
                        this.rHl[i] = ((Long)objectArray[i]).toString();
                        continue block25;
                    }
                    if (objectArray[i] instanceof Float) {
                        this.rHl[i] = ((Float)objectArray[i]).toString();
                        continue block25;
                    }
                    if (objectArray[i] instanceof Double) {
                        this.rHl[i] = ((Double)objectArray[i]).toString();
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "0";
                    continue block25;
                }
                case rGO: {
                    if (objectArray[i] instanceof lov) {
                        this.rHl[i] = ((lov)objectArray[i]).cJW();
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rGK: {
                    Object object;
                    if (objectArray[i] instanceof Integer) {
                        object = (lgw)lea.enW().acv((Integer)objectArray[i]);
                        if (object == null) {
                            lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is not a valid resource ID");
                            assert (false);
                            this.rHl[i] = "";
                            continue block25;
                        }
                        this.rHl[i] = ((ler)object).getName();
                        continue block25;
                    }
                    if (objectArray[i] instanceof Long) {
                        object = (lgw)lea.enW().acv((int)((Long)objectArray[i]).longValue());
                        if (object == null) {
                            lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is not a valid resource ID");
                            assert (false);
                            this.rHl[i] = "";
                            continue block25;
                        }
                        this.rHl[i] = ((ler)object).getName();
                        continue block25;
                    }
                    if (objectArray[i] instanceof String) {
                        object = (lgw)lea.enW().zx((String)objectArray[i]);
                        if (object == null) {
                            lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is not a valid resource ID");
                            this.rHl[i] = "";
                            continue block25;
                        }
                        this.rHl[i] = ((ler)object).getName();
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rGL: {
                    Object object;
                    if (objectArray[i] instanceof Integer) {
                        object = (lhg)lea.enZ().acv((Integer)objectArray[i]);
                        if (object == null) {
                            lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is not a valid skill ID");
                            assert (false);
                            this.rHl[i] = "";
                            continue block25;
                        }
                        this.rHl[i] = ((ler)object).getName();
                        continue block25;
                    }
                    if (objectArray[i] instanceof Long) {
                        object = (lhg)lea.enZ().acv((int)((Long)objectArray[i]).longValue());
                        if (object == null) {
                            lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is not a valid skill ID");
                            assert (false);
                            this.rHl[i] = "";
                            continue block25;
                        }
                        this.rHl[i] = ((ler)object).getName();
                        continue block25;
                    }
                    if (objectArray[i] instanceof String) {
                        object = (lhg)lea.enZ().zx((String)objectArray[i]);
                        if (object == null) {
                            lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is not a valid skill ID");
                            assert (false);
                            this.rHl[i] = "";
                            continue block25;
                        }
                        this.rHl[i] = ((ler)object).getName();
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rGP: {
                    Object object;
                    if (objectArray[i] instanceof Integer) {
                        object = ep.aM((int)((Integer)objectArray[i]));
                        if (object == null) {
                            lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is not a valid attribute type");
                            assert (false);
                            this.rHl[i] = "";
                            continue block25;
                        }
                        this.rHl[i] = ((String)object).replace(" ", "");
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rHc: {
                    if (objectArray[i] instanceof String) {
                        this.rHl[i] = (String)objectArray[i];
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: Special Event '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rGQ: {
                    if (objectArray[i] instanceof String) {
                        this.rHl[i] = (String)objectArray[i];
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: Holding '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rGR: {
                    if (objectArray[i] instanceof String) {
                        this.rHl[i] = (String)objectArray[i];
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: Village '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rGS: {
                    Object object;
                    if (objectArray[i] instanceof ljq) {
                        object = (ljq)objectArray[i];
                        String string = lcw.dZ((ljq)object);
                        this.rHl[i] = string != null ? string.toLowerCase() + "_DisplayName" : "a01_DisplayName";
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: Tile '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rGT: {
                    if (!(objectArray[i] instanceof Integer)) continue block25;
                    if (lea.epx().qU((Integer)objectArray[i]) == null) {
                        lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is not a valid role index");
                        assert (false);
                        this.rHl[i] = "";
                        continue block25;
                    }
                    this.rHl[i] = lea.epx().qU((Integer)objectArray[i]).getDisplayName().toLowerCase();
                    continue block25;
                }
                case rGU: {
                    if (!(objectArray[i] instanceof Integer)) continue block25;
                    if (lea.epN().qe((Integer)objectArray[i]) == null) {
                        lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is not a valid perk index");
                        assert (false);
                        this.rHl[i] = "";
                        continue block25;
                    }
                    this.rHl[i] = lea.epN().qe((Integer)objectArray[i]).aOL().name().toLowerCase();
                    continue block25;
                }
                case rGV: {
                    if (objectArray[i] instanceof Integer) {
                        if (cg.m((Integer)objectArray[i])) {
                            this.rHl[i] = cg.n((Integer)objectArray[i]).toLowerCase();
                            continue block25;
                        }
                        lfn.b(5, "SFStringInstance", "SFStringInstance: String '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is not a valid race identifier");
                        assert (false);
                        this.rHl[i] = "";
                        continue block25;
                    }
                    if (!(objectArray[i] instanceof String)) continue block25;
                    this.rHl[i] = ((String)objectArray[i]).toLowerCase();
                    continue block25;
                }
                case rGW: {
                    if (objectArray[i] instanceof String) {
                        this.rHl[i] = (String)objectArray[i];
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: Vendor '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rGX: {
                    if (objectArray[i] instanceof lop) {
                        this.rHl[i] = ((lop)objectArray[i]).toString();
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: Quest '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rGY: {
                    if (objectArray[i] instanceof los) {
                        this.rHl[i] = ((los)objectArray[i]).toString();
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: Quest Node '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rGZ: {
                    if (objectArray[i] instanceof lot) {
                        this.rHl[i] = ((lot)objectArray[i]).toString();
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: Quest Task '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rHa: {
                    if (objectArray[i] instanceof lor) {
                        this.rHl[i] = ((lor)objectArray[i]).toString();
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: Quest Line '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                case rHb: {
                    if (objectArray[i] instanceof loq) {
                        this.rHl[i] = ((loq)objectArray[i]).toString();
                        continue block25;
                    }
                    lfn.b(5, "SFStringInstance", "SFStringInstance: Quest Item '" + this.rHk + "' Argument '" + lox2.rHh[i].Name + "' at index " + i + " is a " + (objectArray[i] == null ? "null value" : objectArray[i].getClass().getSimpleName()) + " and can't be used as a " + lox2.rHh[i].rHj.toString() + " argument");
                    assert (false);
                    this.rHl[i] = "";
                    continue block25;
                }
                default: {
                    lfn.b(5, "SFStringInstance", "SFStringInstance: Unhandled SFArgumentType " + (Object)((Object)lox2.rHh[i].rHj));
                    assert (false);
                    this.rHl[i] = "";
                }
            }
        }
    }

    public String exA() {
        return lpd.rHs.c(this.rHk, this.rHl);
    }

    public String exB() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.rHk);
        stringBuilder.append("[");
        for (int i = 0; i < this.rHl.length; ++i) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            if (this.rGE != null) {
                stringBuilder.append(this.rGE.rHh[i].Name);
                stringBuilder.append("=");
            }
            stringBuilder.append("'");
            stringBuilder.append(this.rHl[i]);
            stringBuilder.append("'");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public String toString() {
        return this.exA();
    }

    public static loz Bg(String string) {
        if (string == null) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(string, ":VAR:");
        if (stringTokenizer.countTokens() == 0) {
            return null;
        }
        String string2 = stringTokenizer.nextToken();
        ArrayList<String> arrayList = lcn.emv();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        loz loz2 = new loz();
        loz2.rGE = lpd.rHs.BE(string2);
        loz2.rHk = string2;
        loz2.rHl = arrayList.toArray(new String[arrayList.size()]);
        return loz2;
    }
}

