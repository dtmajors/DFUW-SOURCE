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

public class biu
extends bgk {
    @Override
    public void initialize() {
        Object object;
        super.initialize();
        this.Active = true;
        String string = (String)this.dlm.get("nodeid");
        String string2 = (String)this.dlm.get("ms");
        if (string == null || string2 == null) {
            this.fw("Required parameters: nodeid=regex ms=milliseconds");
            return;
        }
        int n = -1;
        try {
            n = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            this.fw("Invalid ms value '" + string2 + "' - not an integer");
            return;
        }
        if (n < 0 || n > 1000) {
            this.fw("ms value " + n + " out of range, [0-1000> accepted");
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
            if (object2 == null || !pattern.matcher((CharSequence)(object = "" + object2.di)).matches()) continue;
            treeSet.add(object2.di);
        }
        if (pattern.matcher("" + this.getGUID().ib()).matches()) {
            treeSet.add(this.getGUID().ib());
        }
        if (treeSet.isEmpty()) {
            this.fw("No node IDs matches expression '" + string + "'");
            return;
        }
        String string3 = null;
        for (Integer n2 : treeSet) {
            object = (kdm)this.MessageDelegator.i(279, this.getGUID(), new ldv(n2, 1800, 2));
            ((kdm)object).jnP = 1;
            ((kdm)object).per = n;
            this.MessageDelegator.b((kcz)object);
            if (string3 == null) {
                string3 = "" + n2;
                continue;
            }
            string3 = string3 + "," + n2;
        }
        TreeMap treeMap = lcn.emG();
        treeMap.put("affected", string3);
        this.t(treeMap);
        this.aoU();
    }
}

