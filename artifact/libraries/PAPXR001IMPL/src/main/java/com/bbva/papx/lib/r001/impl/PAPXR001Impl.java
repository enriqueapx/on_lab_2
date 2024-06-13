package com.bbva.papx.lib.r001.impl;

import com.bbva.papx.dto.client.ClientDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PAPXR001Impl extends PAPXR001Abstract {

    private static final Logger LOGGER = LoggerFactory.getLogger(PAPXR001Impl.class);

    @Override
    public ClientDTO executeGetClient(String clientId) {
        if (clientId == null) {
            return null;
        }

        ClientDTO clientNuevo = new ClientDTO();
        clientNuevo.setClientId(clientId);
        clientNuevo.setDocumentNumber("70286006");
        clientNuevo.setDocumentType("E");
        clientNuevo.setFirstName("Enrique");
        clientNuevo.setLastName("Enrique Garrido");

        LOGGER.info("****PAPXR001 executeGetClient :: END****");
        LOGGER.debug(clientNuevo.toString());

        return clientNuevo;
    }

    @Override
    public boolean executeUpdateClient(ClientDTO client) {
        if (client == null || client.getClientId() == null) {
            return false;
        }

        // Aquí se realiza la lógica para actualizar el cliente en la base de datos.
        LOGGER.info("****PAPXR001 executeUpdateClient :: END****");
        LOGGER.debug(client.toString());

        return true;
    }
}