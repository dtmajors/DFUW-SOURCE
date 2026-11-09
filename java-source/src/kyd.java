/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  ep
 *  kah
 *  lcr
 *  lcw
 */
public class kyd {
    String[] qiA = new String[]{"r_Armor Chain Mail", "r_Armor Scale", "r_Armor Banded Mail", "r_Armor Plate", "r_Armor Full Plate", "r_Armor Dread Plate", "r_Armor Dragon Scale"};
    float[] qiB = new float[]{0.1f, 0.2f, 0.3f, 0.5f, 0.7f, 0.9f, 1.0f};
    a[] qiC = new a[]{new a(this, 3280, 10.0f), new a(this, 4912, 10.0f), new a(this, 4496, 10.0f), new a(this, 1936, 10.0f), new a(this, 3536, 10.0f), new a(this, 1680, 10.0f), new a(this, 2096, 10.0f), new a(this, 2704, 10.0f), new a(this, 3248, 10.0f), new a(this, 5536, 10.0f)};
    String[] qiD = new String[]{"r_Armor Padded Leather", "r_Armor Leather", "r_Armor Hardened Leather", "r_Armor Studded Leather", "r_Armor Spiked Leather", "r_Armor Intricate Leather", "r_Armor Bonescale"};
    float[] qiE = new float[]{0.1f, 0.2f, 0.3f, 0.5f, 0.7f, 0.9f, 1.0f};
    a[] qiF = new a[]{new a(this, 3280, 10.0f), new a(this, 4912, 10.0f), new a(this, 4496, 10.0f), new a(this, 1936, 10.0f), new a(this, 3536, 10.0f), new a(this, 1680, 10.0f), new a(this, 2096, 10.0f), new a(this, 2704, 10.0f), new a(this, 3248, 10.0f), new a(this, 5536, 10.0f)};
    String[] qiG = new String[]{"r_Robes_M Simple", "r_Robes_M Fine", "r_Robes_M Elegant", "r_Robes_M Extravagant", "r_Robes_M Widowsilk"};
    float[] qiH = new float[]{0.2f, 0.4f, 0.6f, 0.8f, 1.0f};
    a[] qiI = new a[]{new a(this, 3280, 10.0f), new a(this, 4912, 10.0f), new a(this, 4496, 10.0f), new a(this, 1936, 10.0f), new a(this, 3536, 10.0f), new a(this, 1680, 10.0f), new a(this, 2096, 10.0f), new a(this, 2704, 10.0f), new a(this, 3248, 10.0f), new a(this, 5536, 10.0f)};
    String[] qiJ = new String[]{"r_Robes_C Simple", "r_Robes_C Fine", "r_Robes_C Elegant", "r_Robes_C Extravagant", "r_Robes_C Widowsilk"};
    float[] qiK = new float[]{0.2f, 0.4f, 0.6f, 0.8f, 1.0f};
    a[] qiL = new a[]{new a(this, 3280, 10.0f), new a(this, 4912, 10.0f), new a(this, 4496, 10.0f), new a(this, 1936, 10.0f), new a(this, 3536, 10.0f), new a(this, 1680, 10.0f), new a(this, 2096, 10.0f), new a(this, 2704, 10.0f), new a(this, 3248, 10.0f), new a(this, 5536, 10.0f)};
    String[] qiM = new String[]{"Arms", "Elbows", "Girdle", "Gloves", "Greaves", "Helmet", "Pants", "Shoes", "Shoulders", "Torso"};
    float[] qiN = new float[]{0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f};
    String[] qiO = new String[]{"Torso", "Pants", "Gloves", "Helmet", "Shoulders"};
    float[] qiP = new float[]{0.2f, 0.2f, 0.2f, 0.2f, 0.2f};

    public static void main(String[] stringArray) {
        lcw.qHF = 3;
        juf juf2 = new juf();
        juf2.uf("xml-files/gamelogicinfo/resourcetree.xml");
        ldx.enG().bN(3);
        lcr.fQ((int)1001, (int)301);
        kyd kyd2 = new kyd();
        kyd2.eiC();
    }

    private void eiC() {
        this.a(this.qiA, this.qiC, this.qiB);
        this.a(this.qiD, this.qiF, this.qiE);
        this.b(this.qiG, this.qiI, this.qiH);
        this.b(this.qiJ, this.qiL, this.qiK);
    }

    private void a(String[] stringArray, a[] aArray, float[] fArray) {
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            float f = fArray[i2];
            a[] aArray2 = new a[aArray.length];
            for (int i3 = 0; i3 < aArray.length; ++i3) {
                aArray2[i3] = aArray[i3].mT(f);
            }
            this.a(stringArray[i2], aArray2);
        }
    }

    private void b(String[] stringArray, a[] aArray, float[] fArray) {
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            float f = fArray[i2];
            a[] aArray2 = new a[aArray.length];
            for (int i3 = 0; i3 < aArray.length; ++i3) {
                aArray2[i3] = aArray[i3].mT(f);
            }
            this.b(stringArray[i2], aArray2);
        }
    }

    private void a(String string, a[] aArray) {
        for (int i2 = 0; i2 < this.qiM.length; ++i2) {
            a[] aArray2 = new a[aArray.length];
            for (int i3 = 0; i3 < aArray.length; ++i3) {
                aArray2[i3] = aArray[i3].mT(this.qiN[i2]);
            }
            this.c(string + " " + this.qiM[i2], aArray2);
        }
    }

    private void b(String string, a[] aArray) {
        for (int i2 = 0; i2 < this.qiO.length; ++i2) {
            a[] aArray2 = new a[aArray.length];
            for (int i3 = 0; i3 < aArray.length; ++i3) {
                aArray2[i3] = aArray[i3].mT(this.qiP[i2]);
            }
            this.c(string + " " + this.qiO[i2], aArray2);
        }
    }

    private void c(String string, a[] aArray) {
        String string2 = "xml-files/server/resource";
        kah kah2 = new kah(new cuh(true), true);
        cbx cbx2 = null;
        try {
            cbx2 = kah2.d(string2, string + ".xml", true);
        }
        catch (bg bg2) {
            // empty catch block
        }
        if (cbx2 == null) {
            assert (false);
            return;
        }
        for (a a2 : aArray) {
            et et2;
            et et3;
            ej ej2 = cbx2.fi().getAttributeMap().get(a2.bnM);
            if (ej2 == null) {
                ej2 = new ez();
                ej2.setType(a2.bnM);
                ej2.setValue(Float.valueOf(a2.Pz));
                cbx2.fi().b(ej2);
                int n = ep.k((int)ej2.getType(), (int)4);
                et et4 = new et();
                et4.setType(n);
                cbx2.fi().b(et4);
                n = ep.k((int)ej2.getType(), (int)2);
                et3 = new ez();
                et3.setType(n);
                cbx2.fi().b(et3);
                n = ep.k((int)ej2.getType(), (int)1);
                et2 = new ez();
                et2.setType(n);
                cbx2.fi().b(et2);
            }
            if (!(ej2 instanceof ez)) {
                assert (false);
                continue;
            }
            ez ez2 = (ez)ej2;
            ez2.setValue(Float.valueOf(this.mS(a2.Pz)));
            int n = ep.k((int)ej2.getType(), (int)4);
            et3 = cbx2.fi().ah(n);
            et3.setValue(Float.valueOf(this.mS(a2.Pz * 1.2f)));
            n = ep.k((int)ej2.getType(), (int)2);
            et2 = cbx2.fi().ah(n);
            et2.setValue(Float.valueOf(this.mS(a2.Pz * 1.2f)));
        }
        kar kar2 = new kar();
        kar2.a(cbx2, string2 + "/", string);
    }

    private float mS(float f) {
        return (float)((int)(f * 100.0f)) / 100.0f;
    }
}

