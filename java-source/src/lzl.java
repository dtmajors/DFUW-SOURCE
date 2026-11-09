/*
 * Decompiled with CFR.
 */
public class lzl
extends lzk {
    private static final lzl tWK = new lzl();
    @lok(value="No clan holding found with ID $(HoldingID)")
    @lpl(value="Displayed to an admin/GM when a holding-specific command is entered, but no holding can be found with the entered ID")
    public static final lox tWL = tWK.a("InvalidHoldingID", lzl.Bk("HoldingID"));
    @lok(value="Holding Ownership History for $(HoldingName)")
    @lpl(value="Displayed to an admin/GM when they request the history of a clan holding")
    public static final lox tWM = tWK.a("HistoryListHeader", lzl.Bp("HoldingName"));
    @lok(value=" - Ownership Changed to $(NewOwnerClanName), on $(DateTimeString)")
    @lpl(value="Displayed to an admin/GM when they request the history of a clan holding")
    public static final lox tWN = tWK.a("HistoryListOwnerChanged", lzl.Bk("NewOwnerClanName"), lzl.Bk("DateTimeString"));
    @lok(value="No city found with the name $(HoldingName), or the holding has no history and remains a neutral, un-founded holding!")
    @lpl(value="Displayed to an admin/GM when they request the history of a clan holding")
    public static final lox tWO = tWK.a("HistoryListNoHistory", lzl.Bp("HoldingName"));
    @lok(value=" - Founding Owner: $(ClanName)")
    @lpl(value="Displayed to an admin/GM when they request the history of a clan holding")
    public static final lox tWP = tWK.a("HistoryListFoundingOwner", lzl.Bk("ClanName"));
    @lok(value="*History Unknown*")
    @lpl(value="Displayed to an admin/GM when they request the history of a clan holding")
    public static final lox tWQ = tWK.BC("HistoryListHistoryUnknown");

    protected lzl(String string) {
        super("Holdings." + string);
    }

    private lzl() {
        super("Holdings");
    }
}

