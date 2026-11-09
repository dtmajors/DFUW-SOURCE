/*
 * Decompiled with CFR.
 */
public class mcb
extends mbx {
    private static final mcb urp = new mcb();
    @lok(value="An error occurred while processing your house tenant operation request... please wait a moment and try again")
    @lpl(value="Displayed to a player when they attempt to perform an operation on a house tenant, but a non-specific error occurs")
    public static final lox rXy = urp.BC("GenericError");
    @lok(value="You could not become a tenant in the house because the house is full")
    @lpl(value="Displayed to a player when they attempt to register as a tenant in a house, but the house already has the maximum number of tenants")
    public static final lox urq = urp.BC("HouseFull");
    @lok(value="You could not become a tenant in the house because the house is not owned by anyone")
    @lpl(value="Displayed to a player when they attempt to register as a tenant in a house, but the house is not owned by any players")
    public static final lox see = urp.BC("HouseNotOwned");
    @lok(value="You are already a tenant in this house")
    @lpl(value="Displayed to a player when they attempt to register as a tenant in a house, but they are already a tenant in the house")
    public static final lox urr = urp.BC("PlayerIsAlreadyATenant");
    @lok(value="Congratulations!... You are now a tenant in the house!")
    @lpl(value="Displayed to a player when they attempt to register as a tenant in a house, and they successfully become a tenant")
    public static final lox urs = urp.BC("TenantAddedSuccessfully");
    @lok(value="You successfully left the house")
    @lpl(value="Displayed to a player when they end their tenancy of a house")
    public static final lox urt = urp.BC("TenancySuccessfullyEnded");
    @lok(value="You have lost access to the house where you were a tenant because the owner has kicked you")
    @lpl(value="Displayed to a player when they are kicked from the house where they were a tenant because the owner of the house kicked them")
    public static final lox uru = urp.BC("TenantKickedBecauseOfOwnerAction");
    @lok(value="You have lost access to the house where you were a tenant because a required upgrade was removed")
    @lpl(value="Displayed to a player when they are kicked from the house where they were a tenant because a required house upgrade was removed")
    public static final lox urv = urp.BC("TenantKickedBecauseOfUpgradeRemoval");
    @lok(value="You have lost access to the house where you were a tenant because the house has been transferred to a new owner")
    @lpl(value="Displayed to a player when they are kicked from the house where they were a tenant because the house was tranferred to a new owner")
    public static final lox urw = urp.BC("TenantKickedBecauseOfHouseOwnershipTransfer");
    @lok(value="You have lost access to the house where you were a tenant because the house rent was not paid")
    @lpl(value="Displayed to a player when they are kicked from the house where they were a tenant because the house rent was not paid")
    public static final lox urx = urp.BC("TenantKickedBecauseOfNonPaymentOfTaxes");
    @lok(value="A tenant inviatation is already being processed")
    @lpl(value="Displayed to a player when they try to invite a player to be a tenant in their house, but another invitation is already being processed")
    public static final lox ury = urp.BC("TenantInvitationAlreadyBeingProcessed");
    @lok(value="You already have the maximum number of tenants in your house, you cannot invite any more tenants to live in the house")
    @lpl(value="Displayed to a player when they try to invite a player to be a tenant in their house, but the house already has the maximum number of tenants")
    public static final lox urz = urp.BC("TenantInvitationHouseFull");
    @lok(value="You no longer own a house to invite anyone to be a tenant in")
    @lpl(value="Displayed to a player when they try to invite a player to be a tenant in their house, but the house is no longer owned by the player")
    public static final lox urA = urp.BC("TenantInvitationHouseNotOwned");
    @lok(value="The player is already resident in a house")
    @lpl(value="Displayed to a player when they try to invite a player to be a tenant in their house, but the player already lives in another house")
    public static final lox urB = urp.BC("TenantInvitationPlayerAlreadyHasHouse");
    @lok(value="The player declined your invitation to live in your house")
    @lpl(value="Displayed to a player when they try to invite a player to be a tenant in their house, but the player declines the invitation")
    public static final lox urC = urp.BC("TenantInvitationPlayerDeclinedInvitation");
    @lok(value="The player cannot accept your invitation to live in your house as they are not logged-in")
    @lpl(value="Displayed to a player when they try to invite a player to be a tenant in their house, but the player is not on-line")
    public static final lox urD = urp.BC("TenantInvitationPlayerNotOnline");
    @lok(value="The player accepted your invitation to live in your house")
    @lpl(value="Displayed to a player when they try to invite a player to be a tenant in their house, and the player accepts the invitation")
    public static final lox urE = urp.BC("TenantInvitationPlayerAccepted");

    protected mcb(String string) {
        super("TenantOperationResults." + string);
    }

    private mcb() {
        super("TenantOperationResults");
    }
}

