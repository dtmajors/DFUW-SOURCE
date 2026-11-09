/*
 * Decompiled with CFR.
 */
public class lyl
extends lyk {
    private static final lyl tGa = new lyl();
    @lok(value="Clan Overview")
    @lpl(value="Tooltip of the clan overview button")
    public static final lox tGb = tGa.BC("ClanInformationTitle");
    @lok(value="Displays more information about the clan")
    @lpl(value="Tooltip of the clan overview button")
    public static final lox tGc = tGa.BC("ClanInformationDescription");
    @lok(value="Kill-on-Sight")
    @lpl(value="Title to display in the tooltip of the player politics indicator 'Kill-on-Sight'")
    public static final lox tGd = tGa.BC("StanceToPlayerKOSTitle");
    @lok(value="You are on this clan's kill-on-sight list")
    @lpl(value="Description to display in the tooltip of the player politics indicator 'Kill-on-Sight'")
    public static final lox tGe = tGa.BC("StanceToPlayerKOSDescription");
    @lok(value="Banned")
    @lpl(value="Title to display in the tooltip of th player politics indicator 'Banned'")
    public static final lox tGf = tGa.BC("StanceToPlayerBannedTitle");
    @lok(value="You are banned from joining this clan")
    @lpl(value="Description to display in the tooltip of the player politics indicator 'Banned'")
    public static final lox tGg = tGa.BC("StanceToPlayerBannedDescription");
    @lok(value="Allowed to Bind")
    @lpl(value="Title to display in the tooltip of th player politics indicator 'Allowed to Bind'")
    public static final lox tGh = tGa.BC("StanceToPlayerBindTitle");
    @lok(value="You are allowed to bind to the bind-stones in the clan's holdings")
    @lpl(value="Description to display in the tooltip of the player politics indicator 'Allowed to Bind'")
    public static final lox tGi = tGa.BC("StanceToPlayerBindDescription");
    @lok(value="Filter for Recruiting Clans")
    @lpl(value="Tool-tip for the recruiting filter check-box")
    public static final lox tGj = tGa.BC("RecruitingFilterTitle");
    @lok(value="Displays only those clans who are currently accepting new membership applications from your race")
    @lpl(value="Tool-tip for the recruiting filter check-box")
    public static final lox tGk = tGa.BC("RecruitingFilterDescription");

    protected lyl(String string) {
        super("Browser." + string);
    }

    private lyl() {
        super("Browser");
    }
}

