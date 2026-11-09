/*
 * Decompiled with CFR.
 */
import java.util.TreeMap;

public class bhe
extends bgk {
    public static final String dlV = "announce_server_down_time_patch";

    @Override
    public void initialize() {
        super.initialize();
        String string = (String)this.dlm.get("count_down");
        if (string == null) {
            this.fw("'count_down' parameter required");
            return;
        }
        String string2 = (String)this.dlm.get("down_time");
        if (string2 == null) {
            this.fw("'down_time' parameter required");
            return;
        }
        int n = 0;
        try {
            n = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFExternalCommandHandlerDownTimeMessagePatch", "initialise() : CountDownString is not a parsable integer... CountDownString = " + string);
            this.fw("'count_down' parsing to integer failed");
            return;
        }
        if (n <= 0) {
            lfn.b(5, "SFExternalCommandHandlerDownTimeMessagePatch", "initialise() : CountDown is less-than (or equal-to) zero... CountDown = " + string);
            this.fw("'count_down' is invalid");
            return;
        }
        int n2 = 0;
        try {
            n2 = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFExternalCommandHandlerDownTimeMessagePatch", "initialise() : DownTimeString is not a parsable integer... DownTimeString = " + string2);
            this.fw("'down_time' parsing to integer failed");
            return;
        }
        if (n2 <= 0) {
            lfn.b(5, "SFExternalCommandHandlerDownTimeMessagePatch", "initialise() : DownTime is less-than (or equal-to) zero... DownTime = " + string2);
            this.fw("'down_time' is invalid");
            return;
        }
        this.a(lzj.tWF.bD(n, n2), 0);
        TreeMap<String, String> treeMap = lcn.emG();
        treeMap.put("Result", "OK");
        this.t(treeMap);
        this.aoU();
    }
}

