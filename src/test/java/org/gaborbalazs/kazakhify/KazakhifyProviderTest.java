package org.gaborbalazs.kazakhify;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gaborbalazs.kipchakify.KipchakifyServiceFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KazakhifyProviderTest {

    private KazakhifyProvider underTest;

    @BeforeEach
    void setUp() {
        underTest = new KazakhifyProvider();
    }

    @Test
    void createKipchakifyServiceFactory() {
        // GIVEN

        // WHEN
        KipchakifyServiceFactory kipchakifyServiceFactory = underTest.createKipchakifyServiceFactory();

        // THEN
        assertTrue(kipchakifyServiceFactory instanceof KazakhifyServiceFactory);
    }
}
