/*
 * Decompiled with CFR.
 */
public class mbx
extends lzh {
    private static final mbx uoy = new mbx();
    @lok(value="Players using trial accounts are not allowed to own houses")
    @lpl(value="Displayed to a player who tries to take ownership of a house, but the player is using a trial account and trial accounts are not allowed to own houses")
    public static final lox uoz = uoy.BC("PlayerIsUsingTrialAccount");
    @lok(value="You already own a house")
    @lpl(value="Displayed to a player who tries to take ownership of a house, but the player already owns another house")
    public static final lox uoA = uoy.BC("PlayerAlreadyOwnsAHouse");
    @lok(value="You do not own a house")
    @lpl(value="Displayed to a player who tries to deploy a house object, but the player does not own a house")
    public static final lox uoB = uoy.BC("PlayerDoesNotOwnAHouse");
    @lok(value="You cannot add an extension to your house at this time... try again later")
    @lpl(value="Displayed to a player who tries to deploy a house object, but another house object is in the process of being deployed")
    public static final lox uoC = uoy.BC("HouseBeingUpgraded");
    @lok(value="You are too far from your house to deploy an upgrade")
    @lpl(value="Displayed to a player who tries to deploya a house object, but the player is too far from their house to deploy an object")
    public static final lox uoD = uoy.BC("TooFarFromHouseToUpgrade");
    @lok(value="You lost your house because you didn't pay the rent")
    @lpl(value="Displayed to the owner of a house when the house is lost because the rent was not paid")
    public static final lox uoE = uoy.BC("HouseLostBecauseOfNonPaymentOfTaxes");
    @lok(value="Your house has been transferred to a new owner")
    @lpl(value="Displayed to the owner of a house when the house is lost because ownership has been transferred to another player")
    public static final lox uoF = uoy.BC("HouseLostBecauseOfTransfer");
    @lok(value="The maximum number of tenants that can live in your house has been changed from $(OldMaximum) to $(NewMaximum)")
    @lpl(value="Displayed to all residents of a house when the maximum number of allowed tenants has been changed")
    public static final lox uoG = uoy.a("HouseTenantCapacityChanged", mbx.Bh("OldMaximum"), mbx.Bh("NewMaximum"));
    @lok(value="Your house is being attacked")
    @lpl(value="Displayed to all residents of a house when the door is being attacked")
    public static final lox uoH = uoy.BC("HouseBeingAttacked");
    @lok(value="The door of your house has been destroyed")
    @lpl(value="Displayed to all residents of a house when the door has been destroyed")
    public static final lox uoI = uoy.BC("HouseDoorDestroyed");
    @lok(value="$(PlayerName) is now a tenant in your house")
    @lpl(value="Displayed to all residents of a house when a new tenant joins the house")
    public static final lox uoJ = uoy.a("NewTenant", mbx.Bk("PlayerName"));
    @lok(value="$(PlayerName) is no longer a tenant in your house")
    @lpl(value="Displayed to all residents of a house when a tenant leaves the house")
    public static final lox uoK = uoy.a("TenantLeft", mbx.Bk("PlayerName"));
    @lok(value="$(KickedName) has been kicked out of your house by $(KickerName)")
    @lpl(value="Displayed to all residents of a house when a tenant is kicked from the house")
    public static final lox uoL = uoy.a("TenantKicked", mbx.Bk("KickedName"), mbx.Bk("KickerName"));
    @lok(value="Your landlord has granted you access to the house safe")
    @lpl(value="Displayed to a house tenant when they are given access to the house safe by the house owner")
    public static final lox uoM = uoy.BC("HouseVaultAccessGranted");
    @lok(value="Your landlord has revoked your access to the house safe")
    @lpl(value="Displayed to a house tenant when their access to the house safe is revoked by the house owner")
    public static final lox uoN = uoy.BC("HouseVaultAccessRevoked");
    @lok(value="Your house owes $(TaxAmount) $(TaxResource.Name$(TaxAmount.Plurality)) in rent")
    @lpl(value="Displayed to all residents of a house when the house rent is due")
    public static final lox uoO = uoy.a("TaxesDue", mbx.Bh("TaxAmount"), mbx.Bl("TaxResource"));
    @lok(value="$(PayerName) has paid $(TaxAmount) $(TaxResource.Name$(TaxAmount.Plurality)) as the rent for your house")
    @lpl(value="Displayed to all residents of a house when the rent for the house has been paid")
    public static final lox uoP = uoy.a("TaxesPaid", mbx.Bk("PayerName"), mbx.Bh("TaxAmount"), mbx.Bl("TaxResource"));
    @lok(value="You can not sell your house due to unpaid rent")
    @lpl(value="Displayed to the house owner when tries to sell it to another player while there are unpaid rent")
    public static final lox uoQ = uoy.BC("UnPaidTaxes");

    protected mbx(String string) {
        super("Housing." + string);
    }

    private mbx() {
        super("Housing");
    }
}

