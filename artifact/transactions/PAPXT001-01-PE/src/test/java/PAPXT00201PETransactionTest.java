package com.bbva.papx;

import com.bbva.papx.dto.client.ClientDTO;
import com.bbva.papx.lib.r001.PAPXR001;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.*;

public class PAPXT00201PETransactionTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PAPXT00201PETransactionTest.class);

    private PAPXT00201PETransaction transaction;

    @Mock
    private PAPXR001 papxR001;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        transaction = new PAPXT00201PETransaction();
        transaction.setServiceLibrary(papxR001);
    }

    @Test
    public void testExecuteUpdateClientSuccess() {
        ClientDTO client = new ClientDTO();
        client.setClientId("12345678");
        transaction.setClient(client);

        Mockito.when(papxR001.executeUpdateClient(client)).thenReturn(true);

        transaction.execute();

        assertEquals(Severity.OK, transaction.getSeverity());
    }

    @Test
    public void testExecuteUpdateClientFailure() {
        ClientDTO client = new ClientDTO();
        client.setClientId("12345678");
        transaction.setClient(client);

        Mockito.when(papxR001.executeUpdateClient(client)).thenReturn(false);

        transaction.execute();

        assertEquals(Severity.ENR, transaction.getSeverity());
    }
}