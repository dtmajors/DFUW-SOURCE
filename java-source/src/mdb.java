/*
 * Decompiled with CFR.
 */
public class mdb
extends lzh {
    private static final mdb uEx = new mdb();
    @lok(value="You are too far away to perform a trade")
    @lpl(value="Notification displayed to the player when the distance from the trader is too far")
    public static final lox uEy = uEx.BC("DistanceTooFar");
    @lok(value="Your trade request was rejected")
    @lpl(value="Notification displayed to the player when the trading request is rejected")
    public static final lox uEz = uEx.BC("RequestRejected");
    @lok(value="$(PlayerName) ignored your request. Further requests will also be ignored.")
    @lpl(value="Notification displayed when a player added another player in the ignore list")
    public static final lox uEA = uEx.a("RequestAddInIgnoreList", mdb.Bk("PlayerName"));
    @lok(value="All your requests are being ignored by $(PlayerName).")
    @lpl(value="Notification displayed when all trading requests are being ignored by the other player")
    public static final lox uEB = uEx.a("RequestInIgnoreList", mdb.Bk("PlayerName"));
    @lok(value="Player didn't respond to your request.")
    @lpl(value="Notification displayed when player's trading request to another player timed-out")
    public static final lox uEC = uEx.BC("RequestTimedOut");
    @lok(value="Trade canceled cause player died")
    @lpl(value="Notification displayed when player's trading request was canceled because the other player is dead")
    public static final lox uED = uEx.BC("RequestTradingPlayerDead");
    @lok(value="You can not initiate another trade. You have reached maximum trades.")
    @lpl(value="Notification displayed when player cannot initiate another trading session because has reached max allowed number")
    public static final lox uEE = uEx.BC("RequestMaxSimultaneousTradingSession");
    @lok(value="Target player has reached the maximum trades.")
    @lpl(value="Notification displayed when target player cannot initiate another trading session because has reached max allowed number")
    public static final lox uEF = uEx.BC("RequestMaxSimultaneousTradingSessionTarget");
    @lok(value="You cannot initiate a trade with a player shielded by invulnerability. Please wait a few moments and try again.")
    @lpl(value="Notification displayed when player cannot initiate a trading session because the other player is shielded")
    public static final lox uEG = uEx.BC("PlayerIsShielded");
    @lok(value="You cannot initiate a trade while you are using the market.")
    @lpl(value="Notification displayed when player cannot initiate a trading session while is using the market")
    public static final lox uEH = uEx.BC("MarketSessionIsOpen");
    @lok(value="You cannot use the market while you have a trading session open or a pending trading request.")
    @lpl(value="Notification displayed when player cannot use the market while there is a trading session open.")
    public static final lox uEI = uEx.BC("TradeSessionIsOpen");
    @lok(value="Target player has an open market session.")
    @lpl(value="Notification displayed when target player cannot initiate a trading session because has a non view mode market session open")
    public static final lox uEJ = uEx.BC("TargetPlayerMarketSessionIsOpen");
    @lok(value="Target player is steering a boat, therefore is unable to trade with you")
    @lpl(value="Notification displayed when target player cannot initiate a trading session because is steering a boat")
    public static final lox uEK = uEx.BC("TargetPlayerOnSteeringWheel");

    protected mdb(String string) {
        super("Trading." + string);
    }

    private mdb() {
        super("Trading");
    }
}

