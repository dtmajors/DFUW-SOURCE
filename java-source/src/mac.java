/*
 * Decompiled with CFR.
 */
public class mac
extends mab {
    private static final mac uar = new mac();
    @lok(value="An error occurred while processing the bind request")
    @lpl(value="Displayed as the bind opertion result, when an unhandled non-specific error occurs")
    public static final lox rXy = uar.BC("GenericError");
    @lok(value="Bindstone bind request succeeded")
    @lpl(value="Displayed as the bind operation result, when the bind request succeeds")
    public static final lox uas = uar.BC("BindSuccess");
    @lok(value="Bindstone is full")
    @lpl(value="Displayed as the bind operation result, when the bindstone is full")
    public static final lox uat = uar.BC("BindstoneFull");
    @lok(value="You are already bound to the bindstone")
    @lpl(value="Displayed as the bind operation result, when the player is already bound to the bindstone")
    public static final lox uau = uar.BC("AlreadyBound");
    @lok(value="Holding has changed clan owners")
    @lpl(value="Displayed as the bind operation result, when the owner clan of the holding has been changed")
    public static final lox uav = uar.BC("NewCityOwners");
    @lok(value="You are not allowed to bind at this bindstone")
    @lpl(value="Displayed as the bind operation result, when the player is not allowed to bind to the bindstone")
    public static final lox uaw = uar.BC("NotAllowed");
    @lok(value="Bindstone is disabled")
    @lpl(value="Displayed as the bind operation result, when the bindstone is not currently active")
    public static final lox uax = uar.BC("BindstoneNotActive");
    @lok(value="You were kicked from the bindstone")
    @lpl(value="Displayed as the bind operation result, when the player has been kicked from the bindstone")
    public static final lox uay = uar.BC("PlayerKicked");
    @lok(value="Your clan is not allowed to bind at this bindstone")
    @lpl(value="Displayed as the bind operation result, when the player's clan is not allowed to bind to the bindstone")
    public static final lox uaz = uar.BC("ClanNotAllowed");
    @lok(value="You were removed from the owner clan's allowed-to-bind list")
    @lpl(value="Displayed as the bind operation result, when the player has been removed from the owner clan's allowed-to-bind list")
    public static final lox uaA = uar.BC("PlayerRemovedFromAllowedToBindList");
    @lok(value="Clan does not own the holding")
    @lpl(value="Displayed as the bind operation result, when the indicated clan does not own the holding")
    public static final lox uaB = uar.BC("ClanDoesNotOwnHolding");
    @lok(value="Player is not bound to this bindstone")
    @lpl(value="Displayed as the bind operation result, when the player is not currently bound to the bindstone")
    public static final lox uaC = uar.BC("TargetPlayerNotBound");
    @lok(value="Your clan is no longer allied with the owners of the holding")
    @lpl(value="Displayed as the bind operation result, when the player's clan and the owner clan are no longer allied")
    public static final lox uaD = uar.BC("ClanRemovedFromAllies");
    @lok(value="You are on the owner clan's kill-on-sight list")
    @lpl(value="Displayed as the bind operation result, when the player is on the owner clan's kill-on-sight list")
    public static final lox uaE = uar.BC("PlayerOnKillOnSightList");
    @lok(value="No members of the clan are bound to this bindstone")
    @lpl(value="Displayed as the bind operation result, when there are no members of the indicated clan bound to the bindstone")
    public static final lox uaF = uar.BC("NoClanPlayerBound");
    @lok(value="All members of the clan have been removed from the bindstone")
    @lpl(value="Displayed as the bind operation result, when the members from a clan have been successfully kicked from the bindstone")
    public static final lox uaG = uar.BC("ClanPlayersRemovedFromBindstone");
    @lok(value="Your clan is not allied with the owner clan")
    @lpl(value="Displayed as the bind operation result, when the players clan and the owner clan are not allied")
    public static final lox uaH = uar.BC("NotAllies");
    @lok(value="Bind operation failed")
    @lpl(value="Displayed as the bind operation result, when the bind operation fails for a non-specific reason")
    public static final lox uaI = uar.BC("Unsuccessful");

    protected mac(String string) {
        super("BindstoneOperationResults." + string);
    }

    private mac() {
        super("BindstoneOperationResults");
    }
}

