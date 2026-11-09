/*
 * Decompiled with CFR.
 */
public class lqe
extends lqd {
    private static final lqe rXz = new lqe();
    @lok(value="Requests clan holding history... Params: [String:ClanCity]")
    @lpl(value="Help text for the console command gm_clan_holding_history")
    public static final lox rXA = rXz.BC("HelpClanHoldingHistory");
    @lok(value="Changes the name of a clan... Params: [String:NewName] [String:OldName]... If OldName is not supplied, command issuer's clan is assumed")
    @lpl(value="Help text for the console command adm_clan_name_change")
    public static final lox rXB = rXz.BC("HelpClanNameChange");
    @lok(value="A clan name change request is already being processed... please wait for it to complete before issuing another request!")
    @lpl(value="Console command output when a request to change a clan name overlaps an in-progress request")
    public static final lox rXC = rXz.BC("ClanNameChangeRequestInProgress");
    @lok(value="No clan found with the name '$(ClanName)'!!!")
    @lpl(value="Console command output when a request to change another clan's name is received, but the other clan cannot be located")
    public static final lox rXD = rXz.a("ClanNotFound", lqe.Bk("ClanName"));
    @lok(value="You are not a member of a clan!!!")
    @lpl(value="Console command output when a request to change the player's own clan's name is received, but the player is not a clan member")
    public static final lox NotClanMember = rXz.BC("NotClanMember");
    @lok(value="Fetches clan vault log information... Params: [Boolean:NewSession] (Optional, Default 'false')")
    @lpl(value="Help text for the console command adm_clan_vault_fetch")
    public static final lox rXE = rXz.BC("HelpClanVaultFetch");
    @lok(value="$(String)")
    @lol(value="Debugging Text Output")
    public static final lox rXF = rXz.a("ClanVaultLogError", lqe.Bk("String"));
    @lok(value="Clan-Vault Log Size = $(Count)")
    @lol(value="Debugging Text Output")
    public static final lox rXG = rXz.a("ClanVaultEntriesCount", lqe.Bh("Count"));
    @lok(value="$(String)")
    @lol(value="Debugging Text Output")
    public static final lox rXH = rXz.a("ClanVaultLogEntry", lqe.Bk("String"));

    private lqe() {
        super("Clan");
    }

    protected lqe(String string) {
        super("Clan." + string);
    }
}

