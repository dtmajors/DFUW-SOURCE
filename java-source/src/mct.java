/*
 * Decompiled with CFR.
 */
public class mct
extends lzh {
    private static final mct uCh = new mct();
    @lok(value="You need atleast $(Quantity) $(Resource.Name$(Quantity.Plurality)) in your bank or your backpack to use this slot machine.")
    @lpl(value="Displayed when the player is trying to use the slot machine without having, in his/her backpack or personal bank, the needed resources.")
    public static final lox uhE = uCh.a("NotEnoughResources", mct.Bh("Quantity"), mct.Bl("Resource"));
    @lok(value="The slot machine is currently in use.")
    @lpl(value="Displayed when the player is trying to use an already occupied slot machine.")
    public static final lox uCi = uCh.BC("InUse");
    @lok(value="You got the jackpot! $(Quantity) $(Resource.Name$(Quantity.Plurality)) Won!")
    @lpl(value="Displayed when the player wins the jackpot.")
    @lpk(value="se_gmbl_jackpot")
    public static final lox uCj = uCh.a("JackPot", mct.Bh("Quantity"), mct.Bl("Resource"));
    @lok(value="JACKPOT! $(Quantity) $(Resource.Name$(Quantity.Plurality)) Won.")
    @lpl(value="Displayed to all players when the player wins the jackpot.")
    @lpk(value="se_gmbl_jackpot_global")
    public static final lox uCk = uCh.a("JackPotGlobal", mct.Bh("Quantity"), mct.Bl("Resource"));
    @lok(value="You won $(Quantity) $(Resource.Name$(Quantity.Plurality))!")
    @lpl(value="Displayed when the player wins something.")
    @lpk(value="se_gmbl_normal_win")
    public static final lox uCl = uCh.a("NormalWin", mct.Bh("Quantity"), mct.Bl("Resource"));

    protected mct(String string) {
        super("SlotMachines." + string);
    }

    private mct() {
        super("SlotMachines");
    }
}

