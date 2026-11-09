/*
 * Decompiled with CFR.
 */
public class mcl
extends lzh {
    private static final mcl uvR = new mcl();
    @lok(value="You can not damage the player because player protection is active.")
    @lpl(value="Displayed to a player when tries to damage a player while target player's protection is active.")
    public static final lox uvS = uvR.BC("SourceProtectionPreventsDamageOnPlayer");
    @lok(value="You can not damage this kind of object because player protection is active.")
    @lpl(value="Displayed to a player when tries to damage an object while player protection is active.")
    public static final lox uvT = uvR.BC("SourceProtectionPreventsDamageOnObject");
    @lok(value="You can not damage another player because player protection is active.")
    @lpl(value="Displayed to a player when tries to damage another player while player protection is active.")
    public static final lox uvU = uvR.BC("SourceProtectionPreventsDamageAnotherPlayer");
    @lok(value="You did not get damaged because player protection is active.")
    @lpl(value="Displayed to a player when avoid to be damaged because player protection is active.")
    public static final lox uvV = uvR.BC("SourceProtectionPreventsDamageFromTarget");
    @lok(value="You can not damage $(Resource.NameSingular) because is in a protected area.")
    @lpl(value="Displayed to a player when tries to damage an object which is in a protected area.")
    public static final lox uvW = uvR.a("AreaProtectionPreventsDamageOnObject", mcl.Bl("Resource"));
    @lok(value="You can not gank another player because player protection is active.")
    @lpl(value="Displayed to a player when tries to gank a player while player protection is active and the player protection activation happened while the gank skill was running.")
    public static final lox uvX = uvR.BC("SourceProtectionPreventsGankingTarget");
    @lok(value="$(Effect) did not affect you because player protection is active.")
    @lpl(value="Displayed to a player when player protection prevents an effect on him.")
    public static final lox uvY = uvR.a("SourceProtectionPreventsEffect", mcl.Bk("Effect"));
    @lok(value="Your player protection has explicitly been stopped by the system.")
    @lpl(value="Displayed to a player when player protection is been disabled by the system.")
    public static final lox uvZ = uvR.BC("ProtectionDisabledSystem");
    @lok(value="Your player protection is now active.")
    @lpl(value="Displayed to a player when player protection is active again.")
    public static final lox uwa = uvR.BC("ProtectionIsActive");
    @lok(value="Your player protection is now inactive.")
    @lpl(value="Displayed to a player when player protection is inactive.")
    public static final lox uwb = uvR.BC("ProtectionLost");
    @lok(value="Beware! You are now in an unprotected area.")
    @lpl(value="Displayed to a player, without player protection, when moves out from the protected area.")
    public static final lox uos = uvR.BC("OutOfAreaWarning");
    @lok(value="Beware! You are now in an unprotected area and in $(Time) your player protection will be deactivated.")
    @lpl(value="Displayed to a player when moves out from the protected area notifying also about the remaining seconds before player protection will be disabled.")
    public static final lox uwc = uvR.a("OutOfAreaWarningTimer", mcl.Bi("Time"));
    @lok(value="You have returned to a protected area.")
    @lpl(value="Displayed to a player,  with player protection, when goes in a protected area.")
    public static final lox uwd = uvR.BC("NotLongerOutOfArea");
    @lok(value="You have returned to a protected area and your player protection will be activated in $(Time).")
    @lpl(value="Displayed to a player,  without player protection, when goes in a protected area notifying also about the remaining seconds before player protection will be enabled.")
    public static final lox uwe = uvR.a("NotLongerOutOfAreaTimer", mcl.Bi("Time"));
    @lok(value="You can not gank this player of your nationality in this area because he has less than $(NumProwessPoints) Prowess Points.")
    @lpl(value="Displayed to a player when tries to gank a player of the same nationality with less that 40000 prowess points.")
    public static final lox uwf = uvR.a("CanNotGankFewPlayerPointsOther", mcl.Bh("NumProwessPoints"));
    @lok(value="You can not gank this player of your nationality in this area because you have less than $(NumProwessPoints) Prowess Points.")
    @lpl(value="Displayed to a player when tries to gank a player of the same nationality and he has less that 40000 prowess points.")
    public static final lox uwg = uvR.a("CanNotGankFewPlayerPointsSelf", mcl.Bh("NumProwessPoints"));
    @lok(value="You can not loot this player's corpse in this area because you have less than $(NumProwessPoints) Prowess Points.")
    @lpl(value="Displayed to a player when tries to loot a player of the same nationality and he has less that 40000 prowess points.")
    public static final lox uwh = uvR.a("CanNotLootFewPlayerPoints", mcl.Bh("NumProwessPoints"));

    protected mcl(String string) {
        super("PlayerProtection." + string);
    }

    private mcl() {
        super("PlayerProtection");
    }
}

