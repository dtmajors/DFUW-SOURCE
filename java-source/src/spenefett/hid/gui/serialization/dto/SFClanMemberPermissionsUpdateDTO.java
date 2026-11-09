/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;

@XStreamAlias(value="SFClanMemberPermissionsUpdateDTO")
public class SFClanMemberPermissionsUpdateDTO
extends SFXMLSerializable {
    public List<Integer> assignedPermissions;
    public List<Integer> removedPermissions;
}

