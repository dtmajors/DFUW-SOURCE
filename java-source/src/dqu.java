/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Map;
import org.w3c.dom.Node;

public class dqu
implements Comparable<dqu> {
    public static final int gPB = 1;
    public static final int gPC = 2;
    public static final int gPD = 4;
    public static final int gPE = 8;
    public static final int gPF = 16;
    public static final int gPG = 32;
    public static final int gPH = 64;
    public int gPI = -1;
    public String DisplayName = null;
    public String jD = "";
    public float gPJ = 4.0f;
    private c gPK = null;
    private final Map<Integer, c> gPL = lcn.emw();

    public String bU(int n, int n2) {
        c c2 = this.bX(n, n2);
        if (c2.gQc == null) {
            return this.gPK.gQc;
        }
        return c2.gQc;
    }

    public int bV(int n, int n2) {
        c c2 = this.bX(n, n2);
        List<b> list = c2.gQf;
        if (list == null) {
            list = this.gPK.gQf;
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int bW(int n, int n2) {
        c c2 = this.bX(n, n2);
        Integer n3 = c2.gQg;
        if (n3 == null) {
            n3 = this.gPK.gQg;
        }
        if (n3 == null) {
            n3 = 0;
        }
        return n3;
    }

    public String s(int n, int n2, int n3) {
        c c2 = this.bX(n2, n3);
        List<b> list = c2.gQf;
        if (list == null) {
            list = this.gPK.gQf;
        }
        if (list == null) {
            return "";
        }
        return list.get((int)n).FileName;
    }

    public float a(double d2, int n, int n2, int n3) {
        float f2;
        c c2 = this.bX(n2, n3);
        List<b> list = c2.gQf;
        if (list == null) {
            list = this.gPK.gQf;
        }
        if (list == null) {
            return 0.0f;
        }
        b b2 = list.get(n);
        if (b2.gPY == 0.0) {
            b2.gPY = d2 + (Math.random() * 2.0 - 1.0) * (double)b2.gPR + (double)b2.gPQ;
        }
        if (d2 > b2.gPY) {
            b2.gPY = d2 + (Math.random() * 2.0 - 1.0) * (double)b2.gPR + (double)b2.gPQ;
            b2.gPX = d2;
            boolean bl = b2.gPW = !b2.gPW;
        }
        if ((f2 = (float)(d2 - b2.gPX) / b2.gPP) < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (!b2.gPW) {
            f2 = 1.0f - f2;
        }
        float f3 = b2.gPN * (1.0f - f2) + b2.gPO * f2;
        if (b2.gPS != -1.0f) {
            float f4;
            if (b2.gQa == 0.0) {
                b2.gQa = d2 + (Math.random() * 2.0 - 1.0) * (double)b2.gPT + (double)b2.gPS;
            }
            if (d2 > b2.gQa) {
                b2.gPZ = !b2.gPZ;
                b2.gQa = b2.gPZ ? d2 + (Math.random() * 2.0 - 1.0) * (double)b2.gPV + (double)b2.gPU : d2 + (Math.random() * 2.0 - 1.0) * (double)b2.gPT + (double)b2.gPS;
                b2.gQb = d2;
            }
            if ((f4 = (float)(d2 - b2.gQb) / 2.0f) < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            if (b2.gPZ) {
                f4 = 1.0f - f4;
            }
            f3 *= f4;
        }
        return f3;
    }

    public float d(float f2, int n, int n2) {
        c c2 = this.bX(n, n2);
        List<lfs<Float, Float>> list = c2.gQd;
        if (list == null) {
            list = this.gPK.gQd;
        }
        if (list == null) {
            return 1.0f;
        }
        for (int i = 0; i < list.size() - 1; ++i) {
            if (!(f2 > ((Float)list.get((int)i).reX).floatValue()) || !(f2 < ((Float)list.get((int)(i + 1)).reX).floatValue())) continue;
            float f3 = (f2 - ((Float)list.get((int)i).reX).floatValue()) / (((Float)list.get((int)(i + 1)).reX).floatValue() - ((Float)list.get((int)i).reX).floatValue());
            return ((Float)list.get((int)i).reY).floatValue() + f3 * (((Float)list.get((int)(i + 1)).reY).floatValue() - ((Float)list.get((int)i).reY).floatValue());
        }
        return 0.0f;
    }

    public d a(double d2, int n, int n2) {
        c c2 = this.bX(n, n2);
        List<d> list = c2.gQe;
        if (list == null) {
            list = this.gPK.gQe;
        }
        if (list == null) {
            return null;
        }
        for (d d3 : list) {
            if (d3.gQm == 0.0) {
                d3.gQm = d2 + (Math.random() * 2.0 - 1.0) * (double)d3.gQh + (double)d3.gqa;
            }
            if (!(d2 > d3.gQm)) continue;
            d3.gQm = d2 + (Math.random() * 2.0 - 1.0) * (double)d3.gQh + (double)d3.gqa;
            return d3;
        }
        return null;
    }

    private c bX(int n, int n2) {
        for (Map.Entry<Integer, c> entry : this.gPL.entrySet()) {
            int n3 = entry.getKey();
            if ((n3 & n) == 0 || (n3 & n2) == 0) continue;
            return entry.getValue();
        }
        return this.gPK;
    }

    public int c(Node node) {
        this.gPI = Integer.parseInt(jsy.h(node, "GlobalId"));
        this.DisplayName = jsy.h(node, "Name");
        this.jD = jsy.h(node, "Description");
        if (this.jD == null) {
            this.jD = "";
        }
        this.gPJ = Float.parseFloat(jsy.h(node, "Dissipation"));
        this.gPK = this.e(node);
        List<Node> list = jsy.c("Preset", node);
        for (Node node2 : list) {
            c c2 = this.e(node2);
            int n = this.d(node2);
            this.gPL.put(n, c2);
        }
        return this.gPI;
    }

    private int d(Node node) {
        int n = 0;
        String string = jsy.h(node, "DayTime");
        String[] stringArray = string.split(",");
        for (int i = 0; i < stringArray.length; ++i) {
            if (stringArray[i].equals("MORNING")) {
                n |= 1;
                continue;
            }
            if (stringArray[i].equals("DAY")) {
                n |= 2;
                continue;
            }
            if (stringArray[i].equals("EVENING")) {
                n |= 4;
                continue;
            }
            if (!stringArray[i].equals("NIGHT")) continue;
            n |= 8;
        }
        String string2 = jsy.h(node, "Weather");
        String[] stringArray2 = string2.split(",");
        for (int i = 0; i < stringArray2.length; ++i) {
            if (stringArray2[i].equals("CLEAR")) {
                n |= 0x10;
                continue;
            }
            if (stringArray2[i].equals("RAIN")) {
                n |= 0x40;
                continue;
            }
            if (!stringArray2[i].equals("SNOW")) continue;
            n |= 0x20;
        }
        return n;
    }

    private c e(Node node) {
        Object object;
        List<Node> list;
        List<Node> list2;
        Object object2;
        Node node2;
        c c2 = new c(this, null);
        Node node3 = jsy.a("Ogg", node);
        if (node3 != null) {
            c2.gQc = jsy.h(node3, "FileName");
        }
        if ((node2 = jsy.a("RandomizerList", node)) != null) {
            c2.gQe = lcn.emv();
            if (node2 != null) {
                object2 = jsy.c("Randomizer", node2);
                list2 = object2.iterator();
                while (list2.hasNext()) {
                    list = (Node)list2.next();
                    object = new d(this);
                    c2.gQe.add((d)object);
                    ((d)object).gqa = Float.parseFloat(jsy.h(list, "Period"));
                    ((d)object).gQh = Float.parseFloat(jsy.h(list, "PeriodDeviation"));
                    ((d)object).gQi = Integer.parseInt(jsy.h(list, "MinAngle"));
                    ((d)object).gQj = Integer.parseInt(jsy.h(list, "MaxAngle"));
                    List<Node> list3 = jsy.c("AudioXml", list);
                    for (Node node4 : list3) {
                        String string = jsy.h(node4, "FileName");
                        float f2 = Float.parseFloat(jsy.h(node4, "Volume"));
                        ((d)object).gQk.add(new a(this, string, f2));
                    }
                }
            }
        }
        if ((object2 = jsy.a("HeightVolumes", node)) != null) {
            c2.gQd = lcn.emv();
            list2 = jsy.c("HeightVolume", (Node)object2);
            list = list2.iterator();
            while (list.hasNext()) {
                object = (Node)list.next();
                float f3 = Float.parseFloat(jsy.h((Node)object, "Height"));
                float f4 = Float.parseFloat(jsy.h((Node)object, "Volume"));
                c2.gQd.add(new lfs<Float, Float>(Float.valueOf(f3), Float.valueOf(f4)));
            }
        }
        if ((list2 = jsy.a("Layers", node)) != null) {
            c2.gQf = lcn.emv();
            list = jsy.c("Layer", list2);
            for (Node node5 : list) {
                b b2 = new b(this);
                c2.gQf.add(b2);
                b2.FileName = jsy.h(node5, "FileName");
                b2.gPN = Float.parseFloat(jsy.h(node5, "VolMin"));
                b2.gPO = Float.parseFloat(jsy.h(node5, "VolMax"));
                b2.gPP = Float.parseFloat(jsy.h(node5, "FadeTime"));
                b2.gPQ = Float.parseFloat(jsy.h(node5, "FadePeriod"));
                b2.gPR = Float.parseFloat(jsy.h(node5, "FadePeriodDeviation"));
                b2.gPS = Float.parseFloat(jsy.h(node5, "SilencePeriod"));
                b2.gPT = Float.parseFloat(jsy.h(node5, "SilencePeriodDeviation"));
                b2.gPU = Float.parseFloat(jsy.h(node5, "SilenceDuration"));
            }
        }
        if ((list = jsy.a("Reverb", node)) != null) {
            c2.gQg = Integer.valueOf(list.getAttributes().getNamedItem("ReverbId").getNodeValue());
        }
        return c2;
    }

    public int a(dqu dqu2) {
        return this.DisplayName.compareTo(dqu2.DisplayName);
    }

    public static int c(ldz.a a2) {
        if (a2 == ldz.a.rgB) {
            return 1;
        }
        if (a2 == ldz.a.rgC) {
            return 2;
        }
        if (a2 == ldz.a.rgD) {
            return 4;
        }
        if (a2 == ldz.a.rgE) {
            return 8;
        }
        return 0;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((dqu)object);
    }
}

