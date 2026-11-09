/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dgj
 */
import java.lang.reflect.Field;
import javax.swing.tree.DefaultMutableTreeNode;

public class lae
extends DefaultMutableTreeNode
implements Comparable {
    public static final int ACTION = 1;
    public static final int qqW = 2;
    public static final int qqX = 3;
    public static final int Go = 4;
    public static final int qqY = 5;
    public static final int FUNCTION = 6;
    public static final int qqZ = 7;
    public static final int qra = 8;
    public static final int OBJECT = 9;
    public static final int qrb = 10;
    public static final int qrc = 11;
    public static final int qrd = 12;
    public static final int qre = 13;
    public static final int qrf = 14;
    public static final int qrg = 15;
    public static final int ROOT = 16;
    public static final int auF = 17;
    public static final int qrh = 18;
    public static final int qri = 19;
    public static final int qrj = 20;
    public static final int qrk = 21;
    public static final int qrl = 22;
    public static boolean qoh = false;
    private int fV = -1;
    private int Type = -1;
    private String Name = null;
    private Object qrm = null;

    public lae(int n, int n2, String string) {
        this.fV = n;
        this.Type = n2;
        this.Name = string;
    }

    public lae(int n, Object object) {
        this(n, -1, null, object);
    }

    public lae(int n, int n2, String string, Object object) {
        this.fV = n;
        this.Type = n2;
        this.Name = string;
        if (this.Name == null) {
            switch (this.fV) {
                case 2: {
                    this.Name = "AttachedMesh";
                    break;
                }
                case 3: {
                    this.Name = "DummyMesh";
                    break;
                }
                case 8: {
                    this.Name = "MaterialShaderPair";
                    break;
                }
                case 22: {
                    this.Name = "SubsetMesh";
                    break;
                }
                default: {
                    this.Name = "Unknown nodetype";
                }
            }
        }
        this.qrm = object;
    }

    public int getNodeType() {
        return this.fV;
    }

    public void k(int n) {
        this.fV = n;
    }

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public String getName() {
        if (this.Name == null) {
            return this.toString();
        }
        if (this.Name.endsWith(" *")) {
            return this.Name.substring(0, this.Name.length() - 2);
        }
        return this.Name;
    }

    public void setName(String string) {
        this.Name = string;
    }

    public Object getValue() {
        return this.qrm;
    }

    public void setValue(Object object) {
        this.qrm = object;
    }

    @Override
    public String toString() {
        if (this.qrm != null) {
            switch (this.fV) {
                case 2: {
                    return "AttachedMesh: '" + ((bzu)this.qrm).aGc() + "'   '" + ((bzu)this.qrm).getFileName() + "'";
                }
                case 3: {
                    return "DummyMesh: '" + ((caa)this.qrm).aGc() + "'";
                }
                case 5: {
                    String string = ((all)this.qrm).DJ();
                    return "EnchantmentConfiguration: '" + string.substring(17, string.length()) + "'";
                }
                case 7: {
                    return "Ingredient: '" + ((ctm)this.qrm).pa() + "'";
                }
                case 8: {
                    return "MaterialShaderPair: MaterialID=" + ((cah)this.qrm).aFO();
                }
                case 10: {
                    return "PaperDollItem: '" + this.Name + "'";
                }
                case 11: {
                    return "PaperDollItemNPC: '" + this.Name + "'";
                }
                case 12: {
                    return "Crafting: '" + ((ctu)this.qrm).pa() + "'";
                }
                case 13: {
                    return "Enchanting: " + ((ctv)this.qrm).fJ();
                }
                case 14: {
                    return "RequiredSkill: " + ((ctz)this.qrm).Bu();
                }
                case 19: {
                    return del.zU(this.Type);
                }
                case 20: {
                    return "Group:  " + this.Name;
                }
                case 21: {
                    return ((dgj)this.qrm).getEffectClassName() + "  (Sub)";
                }
                case 22: {
                    return "SubsetMesh: '" + ((cax)this.qrm).aGc() + "'   '" + ((cax)this.qrm).getFileName() + "'";
                }
            }
            return this.qrm.toString();
        }
        return this.Name;
    }

    public ler dHM() {
        switch (this.fV) {
            case 1: {
                return lea.enS().acv(this.Type);
            }
            case 4: {
                return lea.enT().acv(this.Type);
            }
            case 6: {
                return lea.enU().acv(this.Type);
            }
            case 15: {
                return lea.enW().acv(this.Type);
            }
            case 17: {
                return lea.enZ().acv(this.Type);
            }
        }
        return null;
    }

    public les elc() {
        switch (this.fV) {
            case 1: {
                return lea.enS();
            }
            case 4: {
                return lea.enT();
            }
            case 6: {
                return lea.enU();
            }
            case 15: {
                return lea.enW();
            }
            case 17: {
                return lea.enZ();
            }
        }
        return null;
    }

    public String getToolTipText() {
        ler ler2 = this.dHM();
        if (ler2 != null) {
            return this.c(ler2);
        }
        if (this.qrm != null) {
            return this.qrm.toString();
        }
        return null;
    }

    private String c(ler ler2) {
        Class<?> clazz = ler2.getClass();
        Field[] fieldArray = clazz.getDeclaredFields();
        StringBuilder stringBuilder = new StringBuilder("<html>");
        Object object = null;
        for (int i2 = 0; i2 < fieldArray.length; ++i2) {
            fieldArray[i2].setAccessible(true);
            if (fieldArray[i2].getModifiers() == 1 || fieldArray[i2].getModifiers() == 16) continue;
            try {
                object = fieldArray[i2].get(ler2);
            }
            catch (Exception exception) {
                lfn.b(0, "SFXMLNode", "createToolTip() Exception: " + exception);
                object = "??";
            }
            stringBuilder.append(fieldArray[i2].getName());
            stringBuilder.append("=");
            if (object != null) {
                stringBuilder.append(object.toString());
            } else {
                stringBuilder.append("null");
            }
            stringBuilder.append("<br>");
        }
        stringBuilder.append("</html>");
        return stringBuilder.toString();
    }

    public int compareTo(Object object) {
        if (object instanceof lae) {
            lae lae2 = (lae)object;
            if (this.fV != lae2.getNodeType()) {
                if (qoh) {
                    return lae2.getNodeType() - this.fV;
                }
                return this.fV - lae2.getNodeType();
            }
            if (this.fV == 19) {
                // empty if block
            }
            return this.getName().toLowerCase().compareTo(lae2.getName().toLowerCase());
        }
        lfn.b(5, "SFXMLNode", "compareTo() Object is not a SFXMLNode! It's a " + object.getClass().getName());
        assert (false);
        return -1;
    }
}

