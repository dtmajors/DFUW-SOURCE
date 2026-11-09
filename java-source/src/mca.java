/*
 * Decompiled with CFR.
 */
public class mca
extends mbx {
    private static final mca urk = new mca();
    @lok(value="An error occurred while processing your tax payment request... please wait a moment and try again")
    @lpl(value="Displayed to a player when they attempt to pay the rent for a house, but a non-specific error occurs")
    public static final lox rXy = urk.BC("GenericError");
    @lok(value="There is no outstanding rent to pay for this house")
    @lpl(value="Displayed to a player when they attempt to pay the rent for a house, but the house does not have any rent to pay")
    public static final lox url = urk.BC("NoTaxToPay");
    @lok(value="You need at least $(TaxAmount) $(TaxResource.Name$(TaxAmount.Plurality)) in your backpack to pay the rent for this house")
    @lpl(value="Displayed to a player when they attempt to pay the rent for a house, but the player does not have enough gold in their backpack to pay the rent")
    public static final lox urm = urk.a("NotEnoughGoldInBackpack", mca.Bh("TaxAmount"), mca.Bl("TaxResource"));
    @lok(value="This is not a house that you can pay rent for")
    @lpl(value="Displayed to a player when they attempt to pay the rent for a house, but the house is not a house that requires rent payments")
    public static final lox urn = urk.BC("NotAHouse");
    @lok(value="This house is not owned")
    @lpl(value="Displayed to a player when they attempt to pay the rent for a house, but the house is not owned")
    public static final lox see = urk.BC("HouseNotOwned");
    @lok(value="Only the house owner, or a tenant, can pay the rent for this house")
    @lpl(value="Displayed to a player when they attempt to pay the rent for a house, but the player is not the owner of the house, or a tenant in it")
    public static final lox uro = urk.BC("PlayerNotOwnerOrTenant");
    @lok(value="You successfully paid $(TaxAmount) $(TaxResource.Name$(TaxAmount.Plurality)) as the rent for the house")
    @lpl(value="Displayed to a player when they attempt to pay the rent for a house, and the rent is successfully paid")
    public static final lox scW = urk.a("Success", mca.Bh("TaxAmount"), mca.Bl("TaxResource"));

    protected mca(String string) {
        super("TaxPaymentResults." + string);
    }

    private mca() {
        super("TaxPaymentResults");
    }
}

