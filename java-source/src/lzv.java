/*
 * Decompiled with CFR.
 */
public class lzv
extends lzq {
    private static final lzv tYI = new lzv();
    @lok(value="Monitor for $(PlayerName): $(MonitorMessage)")
    @lpl(value="Displays an entry from the player monitor list")
    public static final lox tYA = tYI.a("ListEntry", lzv.Bk("PlayerName"), lzv.Bk("MonitorMessage"));
    @lok(value="All monitors removed for $(PlayerName)")
    @lpl(value="Displayed when all player monitors are removed for a player")
    public static final lox tYJ = tYI.a("Removed", lzv.Bk("PlayerName"));
    @lok(value="New monitor for $(PlayerName) is $(MonitorMessage)")
    @lpl(value="Displayed when a new player monitor is created")
    public static final lox tYK = tYI.a("Created", lzv.Bk("PlayerName"), lzv.Bk("MonitorMessage"));
    @lok(value="No monitor found for $(PlayerName)")
    @lpl(value="Displayed when a player monitor could not be located")
    public static final lox tWX = tYI.a("NotFound", lzv.Bk("PlayerName"));
    @lok(value="Invalid monitor types $(MonitorTypes)")
    @lpl(value="Displayed to an admin/GM when a requested player monitor is for an invalid monitor type")
    public static final lox tYL = tYI.a("InvalidMonitorType", lzv.Bk("MonitorTypes"));
    @lok(value="Player info is not yet available")
    @lpl(value="Displayed to an admin/GM when they request a player monitor for a player whose info is not yet available")
    public static final lox tYM = tYI.BC("PlayerInfoNotAvailable");
    @lok(value="Error attaching monitor to player $(PlayerName)!!!... Error Code = $(ErrorCode)")
    @lpl(value="Displayed to an admin/GM when they request a player monitor be attached to a player, but an error occurs")
    public static final lox tYN = tYI.a("AttachError", lzv.Bk("PlayerName"), lzv.Bh("ErrorCode"));
    @lok(value="Error detaching monitor from player!!!... Error Code = $(ErrorCode)")
    @lpl(value="Displayed to an admin/GM when they request a player monitor be detached from a player, but an error occurs")
    public static final lox tYO = tYI.a("DetachError", lzv.Bh("ErrorCode"));
    @lok(value="Already have a monitor with GUID $(MonitorGUID)")
    @lpl(value="Displayed to an admin/GM when they request a player monitor be attached to a player, but a monitor already exists")
    public static final lox tYP = tYI.a("DuplicateGUID", lzv.Bk("MonitorGUID"));
    @lok(value="Already have a monitor with name $(PlayerName)")
    @lpl(value="Displayed to an admin/GM when they request a player monitor be attached to a player, but a monitor already exists for the player")
    public static final lox tYQ = tYI.a("DuplicatePlayerName", lzv.Bk("PlayerName"));

    protected lzv(String string) {
        super("Monitor." + string);
    }

    private lzv() {
        super("Monitor");
    }
}

