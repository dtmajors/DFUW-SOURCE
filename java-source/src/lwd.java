/*
 * Decompiled with CFR.
 */
public class lwd
extends lvx {
    private static final lwd tdz = new lwd();
    @lok(value="Create Mercenary Contract")
    @lpl(value="Title of the clan conquest create contract window")
    public static final lox tce = tdz.BC("Title");
    @lok(value="Clan Name")
    @lpl(value="Displayed as the header of the clan name column for the list of clans")
    public static final lox tcf = tdz.BC("ClanNameColumnHeader");
    @lok(value="Members")
    @lpl(value="Displayed as the header of the clan size column for the list of clans")
    public static final lox tcg = tdz.BC("ClanSizeColumnHeader");
    @lok(value="Filters")
    @lpl(value="Title of the filters section")
    public static final lox tch = tdz.BC("FiltersTitle");
    @lok(value="Search...")
    @lpl(value="Default text to display in the clan name search text input box, when nothing has been typed by the player")
    public static final lox tcj = tdz.BC("NameFilterDefaultText");
    @lok(value="Issue Contracts")
    @lpl(value="Displayed nex to the action button when it will issue the selected contracts")
    public static final lox tdA = tdz.BC("IssueContractsText");
    @lok(value="Sending Contracts... Please Wait...")
    @lpl(value="Displayed nex to the action button when the issue of the selected contracts is being processed")
    public static final lox tdB = tdz.BC("IssuingContracsText");

    protected lwd(String string) {
        super("ConquestCreateContract." + string);
    }

    private lwd() {
        super("ConquestCreateContract");
    }
}

