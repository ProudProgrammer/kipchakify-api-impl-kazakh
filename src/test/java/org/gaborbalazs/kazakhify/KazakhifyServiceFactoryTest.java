package org.gaborbalazs.kazakhify;

import static org.junit.jupiter.api.Assertions.*;

import org.gaborbalazs.kipchakify.KipchakifyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KazakhifyServiceFactoryTest {

    private KazakhifyServiceFactory underTest;

    @BeforeEach
    void setUp() {
        underTest = new KazakhifyServiceFactory();
    }

    @Test
    void createKipchakifyService() {
        // GIVEN

        // WHEN
        KipchakifyService kipchakifyService = underTest.createKipchakifyService();

        // THEN
        assertTrue(kipchakifyService instanceof KazakhifyService);
    }
}