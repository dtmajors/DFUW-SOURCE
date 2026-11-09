/*
 * Decompiled with CFR.
 */
public class lwa
extends lvx {
    private static final lwa tcx = new lwa();
    @lok(value="Clan Holding Overview")
    @lpl(value="String to display as the title of the window")
    public static final lox tce = tcx.BC("Title");
    @lok(value="You Can Enter")
    @lpl(value="String to display as the stance when the player can safely enter the city")
    public static final lox tcy = tcx.BC("StancePlayerCanEnter");
    @lok(value="You Cannot Enter")
    @lpl(value="String to display when the player cannot enter the city")
    public static final lox tcz = tcx.BC("StancePlayerCannotEnter");
    @lok(value="You Can Bind")
    @lpl(value="String to display when the player is allowed to bind to the ciy's bind-stone")
    public static final lox tcA = tcx.BC("StancePlayerCanBind");
    @lok(value="You Are Bound")
    @lpl(value="String to display when the player is already bound to the city's bind-stone")
    public static final lox tcB = tcx.BC("StancePlayerIsBound");
    @lok(value="Mayor")
    @lpl(value="String to display as the title of the city mayor component")
    public static final lox tcC = tcx.BC("MayorTitle");
    @lok(value="<No Mayor Appointed>")
    @lpl(value="Text to display in the mayor name label when no clan member has been appointed as the mayor of the city")
    public static final lox tcD = tcx.BC("NoMayorText");
    @lok(value="Guard Policy")
    @lpl(value="String to display as the title of the guard-tower policy component")
    public static final lox tcE = tcx.BC("GuardPolicyTitle");
    @lok(value="Bank Access Policy")
    @lpl(value="String to display as the title of the city bank access policy component")
    public static final lox tcF = tcx.BC("BankAccessPolicyTitle");
    @lok(value="Market Access Policy")
    @lpl(value="String to display as the title of the city market access policy component")
    public static final lox tcG = tcx.BC("MarketAccessPolicyTitle");
    @lok(value="Citizens")
    @lpl(value="String to display as the title of the list of citizens, players who are currently bound, in the city")
    public static final lox tcH = tcx.BC("CitizenListTitle");
    @lok(value="Select New Mayor")
    @lpl(value="Displayed as the title of the clan member selector window, when it is being used to select a new mayor for the city")
    public static final lox lKh = tcx.BC("MayorSelectorTitle");
    @lok(value="Update City Configuration")
    @lpl(value="String to display when the action button will send an update city configuration request to the server")
    public static final lox tcI = tcx.BC("UpdateCityAction");
    @lok(value="Updating City Configuration... Please Wait...")
    @lpl(value="String to display when a request to update the city configuration is being processed by the server")
    public static final lox tcJ = tcx.BC("UpdatingCityAction");
    @lok(value="Conquest")
    @lpl(value="String to display as the title of dynamically generated conquest components")
    public static final lox tcK = tcx.BC("ConquestComponentTitle");
    @lok(value="Gate Control Policy")
    @lpl(value="String to display as the title of the gate control policy component")
    public static final lox tcL = tcx.BC("GateControlPolicyTitle");
    @lok(value="Conquest Protection")
    @lpl(value="String to display as the title of the conquest protection components")
    public static final lox tcM = tcx.BC("ProtectionTitle");
    @lok(value="Dominion Cost to Apply Protection: $(Cost)")
    @lpl(value="Displayed as the cost description for applying a conquest protection that has an associated Dominion cost")
    public static final lox tcN = tcx.a("ProtectionCost", lwa.Bh("Cost"));
    @lok(value="Auto-Renew Selected Protection?")
    @lpl(value="Displayed when the selected protection can be auto-renewed")
    public static final lox tcO = tcx.BC("ProtectionCanBeAutoRenewed");
    @lok(value="Protection Cannot Be Auto-Renewed!")
    @lpl(value="Displayed when the selected protection cannot be auto-renewed")
    public static final lox tcP = tcx.BC("ProtectionCannotBeAutoRenewed");
    @lok(value="Include Asset Damage Protection?")
    @lpl(value="Displayed when the selected protection can include asset damage protection")
    public static final lox tcQ = tcx.BC("ProtectionCanIncludeAssetDamage");
    @lok(value="Asset Damage Cannot Be Protected!")
    @lpl(value="Displayed when the selected protection cannot include asset damage protection")
    public static final lox tcR = tcx.BC("ProtectionCannotIncludeAssetDamage");
    @lok(value="Holding Protected from Conquest for $(ProtectionTimeRemaining)")
    @lpl(value="Displayed as the remaining time that a holding is protected from conquest challenges for")
    public static final lox tcS = tcx.a("ProtectionRemainingTime", lwa.Bi("ProtectionTimeRemaining"));
    @lok(value="Protection Can Be Applied Again In $(CountDown)")
    @lpl(value="Displayed as the time remaining until conquest protection can be applied to the holding again")
    public static final lox tcT = tcx.a("TimeUntilProtectionCanBeApplied", lwa.Bi("CountDown"));
    @lok(value="Protection Will Auto-Renew In $(CountDown), for $(Cost) Dominion")
    @lpl(value="Displayed as the time remaining until auto-renewing conquest protection will be applied again")
    public static final lox tcU = tcx.a("TimeUntilProtectionWillBeApplied", lwa.Bi("CountDown"), lwa.Bh("Cost"));
    @lok(value="Villages In Territory")
    @lpl(value="Displayed as the title of the list of villages that are part of the holding's territory")
    public static final lox tcV = tcx.BC("VillagesTitle");
    @lok(value="Vulnerable In: $(CountDown)")
    @lpl(value="Displayed in the tool-tip of a village that is counting-down to becoming vulnerable")
    public static final lox tcW = tcx.a("VillageVulnerableCountdown", lwa.Bi("CountDown"));
    @lok(value="Structures")
    @lpl(value="Displayed as the title of the holding's build-map")
    public static final lox tcl = tcx.BC("HoldingBuildMapTitle");

    protected lwa(String string) {
        super("CityOverview." + string);
    }

    private lwa() {
        super("CityOverview");
    }
}

