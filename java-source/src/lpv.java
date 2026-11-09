/*
 * Decompiled with CFR.
 */
public class lpv
extends lpq {
    private static final lpv rUp = new lpv();
    @lok(value="Leader")
    @lpl(value="The name of the permissions category containing permissions that only the clan leader possesses")
    public static final lox rUq = rUp.BC("Leader");
    @lok(value="Management")
    @lpl(value="The name of the permissions category containing management permission, that is the permissions to assign/remove permissions from other members")
    public static final lox rUr = rUp.BC("Management");
    @lok(value="Administrative")
    @lpl(value="The name of the permissions category containing permissions to control the organisation and structure of the clan")
    public static final lox rUs = rUp.BC("Administrative");
    @lok(value="Membership")
    @lpl(value="The name of the permissions category containing permissions that relate to membership of the clan")
    public static final lox rUt = rUp.BC("Membership");
    @lok(value="Clan-Vault")
    @lpl(value="The name of the permissions category containing permissions that relate to members' access to the clan-vault")
    public static final lox rUu = rUp.BC("ClanVault");
    @lok(value="Politics")
    @lpl(value="The name of the permissions category containing permissions that relate to the clan's political stance towards other clans")
    public static final lox rUv = rUp.BC("Politics");
    @lok(value="Territory")
    @lpl(value="The name of the permissions category containing permissions that relate to the territory that the clan controls")
    public static final lox rUw = rUp.BC("Territory");
    @lok(value="Conquest")
    @lpl(value="The name of the permissions category containing permissions that relate to the clan's conquest challenges for ownership of territory")
    public static final lox rUx = rUp.BC("Conquest");
    @lok(value="Cities")
    @lpl(value="The name of the permissions category containing permissions that relate to the management of the holdings that the clan controls")
    public static final lox rUy = rUp.BC("Cities");
    @lok(value="Web-Gate")
    @lpl(value="The name of the permissions category containing permissions to view sections of the web-gate... this category and all permissions are hidden from players, and is due to be removed")
    public static final lox rUz = rUp.BC("WebGate");

    protected lpv(String string) {
        super("PermissionCategories." + string);
    }

    private lpv() {
        super("PermissionCategories");
    }
}

