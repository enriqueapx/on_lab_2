package com.bbva.papx.lib.r001;

import com.bbva.papx.dto.client.ClientDTO;

public interface PAPXR001 {

    ClientDTO executeGetClient(String clientId);

    boolean executeUpdateClient(ClientDTO client);
}