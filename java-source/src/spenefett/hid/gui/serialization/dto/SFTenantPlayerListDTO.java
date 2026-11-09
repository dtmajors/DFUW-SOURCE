/*
 * Decompiled with CFR.
 */
package spenefett.hid.gui.serialization.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;
import spenefett.hid.gui.serialization.SFXMLSerializable;
import spenefett.hid.gui.serialization.dto.SFTenantPlayerDTO;

@XStreamAlias(value="SFTenantPlayerListDTO")
public class SFTenantPlayerListDTO
extends SFXMLSerializable {
    public List<SFTenantPlayerDTO> list = lcn.emv();
}

