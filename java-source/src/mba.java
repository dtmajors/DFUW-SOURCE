/*
 * Decompiled with CFR.
 */
public class mba
extends may {
    private static final mba uhs = new mba();
    @lok(value="An error occurred while processing the clan city configuration update request")
    @lpl(value="Text to display when a clan city update request fails because an unhandled, non-specific, error occurred")
    public static final lox rXy = uhs.BC("GenericError");
    @lok(value="You cannot update the configuration because you are not a member of the clan that owns the holding")
    @lpl(value="Text to display when a clan city update request fails because the requesting player is not, or is no longer, a member of the clan")
    public static final lox ubl = uhs.BC("RequestingPlayerNotClanMember");
    @lok(value="You do not have permission to update the configuration of the holding")
    @lpl(value="Text to display when a clan city update request fails because the requesting player does not have the required permissions")
    public static final lox ubr = uhs.BC("PermissionDenied");
    @lok(value="You cannot update the configuration because your clan does not own the holding")
    @lpl(value="Text to display when a clan city update request fails because the holding is not, or is no longer, owned by the player's clan")
    public static final lox uht = uhs.BC("HoldingNotOwnedByClan");
    @lok(value="The indicated mayor cannot be set as they are not a member of the clan")
    @lpl(value="Text to display when a clan city update request fails because the indicated player to set as the holding's mayor is not a member of the clan")
    public static final lox uhu = uhs.BC("IndicatedMayorNotClanMember");
    @lok(value="Invalid guard policy!")
    @lpl(value="Text to display when a clan city update request fails because the received guard policy is invalid")
    public static final lox uhv = uhs.BC("InvalidGuardPolicy");
    @lok(value="Invalid bank access policy!")
    @lpl(value="Text to display when a clan city update request fails because the received bank access policy is invalid")
    public static final lox uhw = uhs.BC("InvalidBankAccessPolicy");
    @lok(value="Invalid gate control policy!")
    @lpl(value="Text to display when a clan city update request fails because the received gate control policy is invalid")
    public static final lox uhx = uhs.BC("InvalidGateControlPolicy");
    @lok(value="Configuration updated successfully")
    @lpl(value="Text to display when a clan city update request completes successfully")
    public static final lox uhy = uhs.BC("ConfigurationUpdatedSuccessfully");
    @lok(value="Your clan does not have enough Dominion to perform this action!")
    @lpl(value="Text to display when a clan city update request fails because the update action incurs a Dominion, clan-points, cost and the clan does not have enough available")
    public static final lox uhz = uhs.BC("NotEnoughDominion");
    @lok(value="The holding is already protected from conquest")
    @lpl(value="Text to display when a clan city update request fails because the holding is already protected from conquest challenges")
    public static final lox uhA = uhs.BC("HoldingAlreadyProtected");
    @lok(value="The holding is currently involved in a conquest challenge and cannot be protected")
    @lpl(value="Text to display when a clan city update request fails because the holding is involved in an active conquest challenge")
    public static final lox uhB = uhs.BC("HoldingInConquestChallenge");

    protected mba(String string) {
        super("ConfigurationUpdateResults." + string);
    }

    private mba() {
        super("ConfigurationUpdateResults");
    }
}

