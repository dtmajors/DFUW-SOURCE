/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  gg
 *  lcr
 */
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class bim
extends bgk {
    private int dmy = 0;

    private Float fA(String string) {
        String string2 = (String)this.dlm.get(string);
        if (string2 == null) {
            return null;
        }
        Float f = null;
        try {
            f = Float.valueOf(Float.parseFloat(string2));
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg("Invalid value for " + string + " parameter - must be a float");
        }
        return f;
    }

    private Integer fB(String string) {
        String string2 = (String)this.dlm.get(string);
        if (string2 == null) {
            return null;
        }
        Integer n = null;
        try {
            n = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new bg("Invalid value for " + string + " parameter - must be an integer");
        }
        return n;
    }

    private Boolean fC(String string) {
        String string2 = (String)this.dlm.get(string);
        if (string2 == null) {
            return null;
        }
        if (string2.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (string2.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        throw new bg("Invalid value for " + string + " parameter - must be true or false");
    }

    @Override
    public void initialize() {
        Object object;
        super.initialize();
        this.Active = true;
        String string = (String)this.dlm.get("nodeid");
        if (string == null) {
            this.fw("Parameters: nodeid=regex [NodeEnabled=false/true] [NodeMinFPS=F] [NodeHysteresisFPS=F] [NodeObjectCountMin=F] [NodeObjectCountMax=F] [NodeObjectCountReductionPerMinute=F] [NodeObjectCountIncreasePerMinute=F] [NodeMinObjectCountChangePerRun=F] [NodeMaxObjectCountChangePerRun=F] [ClientEnabled=true/false] [ClientInnerAOIMin=F] [ClientInnerAOIMax=F] [ClientAOIReductionPerMinute=F] [ClientAOIIncreasePerMinute=F] [ClientObjectCountHysteresis=F] [ClientMinAOIChangePerRun=F] [ClientMaxAOIChangePerRun=F]");
            return;
        }
        gof gof2 = (gof)this.MessageDelegator.h(21770, this.getGUID(), this.getGUID());
        try {
            Float f;
            Boolean bl2 = this.fC("NodeEnabled");
            if (bl2 != null) {
                gof2.jnO = true;
                gof2.jnP |= 1;
                gof2.Xy = bl2;
            }
            if ((f = this.fA("NodeTargetFPS")) != null) {
                if (f.floatValue() < 5.0f || f.floatValue() > 50.0f) {
                    this.fw("valid range for NodeTargetFPS is [5,50]");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 2;
                gof2.Xz = f.floatValue();
            }
            if ((f = this.fA("NodeHysteresisFPS")) != null) {
                if (f.floatValue() < 0.0f || f.floatValue() > 10.0f) {
                    this.fw("valid range for NodeHysteresisFPS is [0.0, 10.0]");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 4;
                gof2.XA = f.floatValue();
            }
            if ((f = this.fA("NodeObjectCountMin")) != null) {
                if (f.floatValue() < 10.0f || f.floatValue() > 300.0f) {
                    this.fw("valid range for NodeObjectCountMin is [10.0, 300.0]!");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 8;
                gof2.XB = f.floatValue();
            }
            if ((f = this.fA("UseNodeObjectCountMax")) != null) {
                if (f.floatValue() < 10.0f || f.floatValue() > 500.0f) {
                    this.fw("valid range for NodeObjectCountMax is [10.0, 500.0]!");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x10;
                gof2.XC = f.floatValue();
            }
            if ((f = this.fA("NodeObjectCountReductionPerMinute")) != null) {
                if (f.floatValue() < 10.0f || f.floatValue() > 1000.0f) {
                    this.fw("valid range for NodeObjectCountReductionPerMinute is [10.0f, 1000.0f]");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x20;
                gof2.XD = f.floatValue();
            }
            if ((f = this.fA("NodeObjectCountIncreasePerMinute")) != null) {
                if (f.floatValue() < 10.0f || f.floatValue() > 1000.0f) {
                    this.fw("valid range for NodeObjectCountIncreasePerMinute is [10.0f, 1000.0]");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x40;
                gof2.XE = f.floatValue();
            }
            if ((f = this.fA("NodeMinObjectCountChangePerRun")) != null) {
                if (f.floatValue() < 0.0f || f.floatValue() > 10.0f) {
                    this.fw("valid range for NodeMinObjectCountChangePerRun is [0.0, 10.0]!");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x80;
                gof2.XF = f.floatValue();
            }
            if ((f = this.fA("NodeMaxObjectCountChangePerRun")) != null) {
                if (f.floatValue() < 10.0f || f.floatValue() > 200.0f) {
                    this.fw("valid range for NodeMaxObjectCountChangePerRun is [10.0, 200.0]!");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x100;
                gof2.XG = f.floatValue();
            }
            if ((bl2 = this.fC("ClientEnabled")) != null) {
                gof2.jnO = true;
                gof2.jnP |= 0x200;
                gof2.XH = bl2;
            }
            if ((f = this.fA("ClientInnerAOIMin")) != null) {
                if (f.floatValue() < 10.0f || f.floatValue() > 100.0f) {
                    this.fw("valid range for ClientInnerAOIMin is [10.0, 100.0]!");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x400;
                gof2.XI = f.floatValue();
            }
            if ((f = this.fA("ClientInnerAOIMax")) != null) {
                if (f.floatValue() < 20.0f || f.floatValue() > 300.0f) {
                    this.fw("valid range for ClientInnerAOIMax is [20.0, 300.0]!");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x800;
                gof2.XJ = f.floatValue();
            }
            if ((f = this.fA("ClientAOIReductionPerMinute")) != null) {
                if (f.floatValue() < 10.0f || f.floatValue() > 600.0f) {
                    this.fw("valid range for ClientAOIReductionPerMinute is [10.0, 600.0]");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x1000;
                gof2.XK = f.floatValue();
            }
            if ((f = this.fA("ClientAOIIncreasePerMinute")) != null) {
                if (f.floatValue() < 10.0f || f.floatValue() > 600.0f) {
                    this.fw("valid range for ClientAOIIncreasePerMinute is [10.0, 600.0]");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x2000;
                gof2.XL = f.floatValue();
            }
            if ((f = this.fA("ClientObjectCountHysteresis")) != null) {
                if (f.floatValue() < 0.0f || f.floatValue() > 30.0f) {
                    this.fw("valid range for ClientObjectCountHysteresis is [0.0, 30.0]!");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x4000;
                gof2.XM = f.floatValue();
            }
            if ((f = this.fA("ClientMinAOIChangePerRun")) != null) {
                if (f.floatValue() < 0.0f || f.floatValue() > 10.0f) {
                    this.fw("valid range for ClientMinAOIChangePerRun is [0.0, 10.0]!");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x8000;
                gof2.XN = f.floatValue();
            }
            if ((f = this.fA("ClientMaxAOIChangePerRun")) != null) {
                if (f.floatValue() < 10.0f || f.floatValue() > 200.0f) {
                    this.fw("valid range for ClientMaxAOIChangePerRun is [10.0, 200.0]!");
                    return;
                }
                gof2.jnO = true;
                gof2.jnP |= 0x10000;
                gof2.XO = f.floatValue();
            }
        }
        catch (bg bg2) {
            this.fw(bg2.getMessage());
            return;
        }
        if ((gof2.jnP & 0x400) != 0 && (gof2.jnP & 0x800) != 0 && gof2.XI > gof2.XJ) {
            this.fw("ClientInnerAOIMin must be less than or equal to ClientInnerAOIMax!");
            return;
        }
        Pattern pattern = null;
        try {
            pattern = Pattern.compile(string);
        }
        catch (PatternSyntaxException patternSyntaxException) {
            this.fw("nodeid regular expression '" + string + "' is invalid");
            return;
        }
        amf amf2 = ((dta)this.MessageDelegator).bzt().d(lcr.hac);
        if (amf2 == null || !(amf2 instanceof gg)) {
            this.fw("Could not find SFGamelogicDistributor");
            return;
        }
        gg gg2 = (gg)amf2;
        gr[] grArray = gg2.hS();
        if (grArray == null) {
            this.fw("Could not get node info array");
            return;
        }
        TreeSet<Integer> treeSet = lcn.emH();
        for (gr object2 : grArray) {
            if (object2 == null || object2.eO == null || !object2.eO.equals("GameLogic") || !pattern.matcher((CharSequence)(object = "" + object2.di)).matches()) continue;
            treeSet.add(object2.di);
        }
        if (treeSet.isEmpty()) {
            this.fw("No node IDs matches expression '" + string + "'");
            return;
        }
        String string2 = null;
        for (Integer n : treeSet) {
            object = (gof)this.MessageDelegator.h(21770, this.getGUID(), lcr.ak((ldv)lcr.qAJ, (int)n));
            gof2.b((gof)object);
            this.MessageDelegator.E((dxq)object);
            if (string2 == null) {
                string2 = "" + n;
                continue;
            }
            string2 = string2 + "," + n;
        }
        TreeMap treeMap = lcn.emG();
        treeMap.put("affectednodes", string2);
        this.t(treeMap);
        this.dmy = treeSet.size();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 21770: {
                this.a((gof)dxq2);
                return;
            }
        }
    }

    private final void a(gof gof2) {
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("nodeid", "" + gof2.aO().ib());
        treeMap.put("NodeEnabled", "" + gof2.Xy);
        treeMap.put("NodeTargetFPS", "" + gof2.Xz);
        treeMap.put("NodeHysteresisFPS", "" + gof2.XA);
        treeMap.put("NodeObjectCountMin", "" + gof2.XB);
        treeMap.put("NodeObjectCountMax", "" + gof2.XC);
        treeMap.put("NodeObjectCountReductionPerMinute", "" + gof2.XD);
        treeMap.put("NodeObjectCountIncreasePerMinute", "" + gof2.XE);
        treeMap.put("NodeMinObjectCountChangePerRun", "" + gof2.XF);
        treeMap.put("NodeMaxObjectCountChangePerRun", "" + gof2.XG);
        treeMap.put("ClientEnabled", "" + gof2.XH);
        treeMap.put("ClientInnerAOIMin", "" + gof2.XI);
        treeMap.put("ClientInnerAOIMax", "" + gof2.XJ);
        treeMap.put("ClientAOIReductionPerMinute", "" + gof2.XK);
        treeMap.put("ClientAOIIncreasePerMinute", "" + gof2.XL);
        treeMap.put("ClientObjectCountHysteresis", "" + gof2.XM);
        treeMap.put("ClientMinAOIChangePerRun", "" + gof2.XN);
        treeMap.put("ClientMaxAOIChangePerRun", "" + gof2.XO);
        this.t(treeMap);
        --this.dmy;
        if (this.dmy == 0) {
            this.aoU();
        }
    }
}

