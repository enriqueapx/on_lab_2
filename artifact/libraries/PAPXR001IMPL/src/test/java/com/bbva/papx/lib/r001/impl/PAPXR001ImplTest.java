package com.bbva.papx.lib.r001.impl;

import com.bbva.papx.dto.client.ClientDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class PAPXR001ImplTest {

    private PAPXR001Impl papxr001;

    @Before
    public void setup() {
        papxr001 = new PAPXR001Impl();
    }

    @Test
    public void executeGetClientNULL() {
        ClientDTO clientDTO = papxr001.executeGetClient(null);
        Assert.assertNull(clientDTO);
    }

    @Test
    public void executeGetClientOK() {
        ClientDTO clientDTO = papxr001.executeGetClient("12345678");
        Assert.assertNotNull(clientDTO);
    }

    @Test
    public void executeUpdateClientSuccess() {
        ClientDTO client = new ClientDTO();
        client.setClientId("12345678");
        boolean result = papxr001.executeUpdateClient(client);
        Assert.assertTrue(result);
    }

    @Test
    public void executeUpdateClientFailure() {
        boolean result = papxr001.executeUpdateClient(null);
        Assert.assertFalse(result);
    }
}