package org.gaborbalazs.kazakhify;

import static org.junit.jupiter.api.Assertions.*;

import org.gaborbalazs.kipchakify.KipchakifyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KazakhifyServiceTest {

    private KazakhifyService underTest;

    @BeforeEach
    void setUp() {
        underTest = new KazakhifyService();
    }

    @Test
    void testKipchakify() {
        // GIVEN
        String textToKipchakify = "Nem azért dolgozott-e az elmúlt nyolc évben a társadalom, hogy soha többé ne legyen olyan kormányfője Magyarországnak, aki nyugodtan kijelentheti: rajta kívül nincs más alternatíva. Aki ezt állítja, az nem kormányozni, hanem uralkodni akar.";
        String expected = "Nöm özört dölgözött-ö öz ölmölt nyölc övbön ö törsödölöm, högy söhö többö nö lögyön ölyön körmönyföjö Mögyörörszögnök, ökö nyögödtön köjölönthötö: röjtö kövöl nöncs mös öltörnötövö. Ökö özt öllötjö, öz nöm körmönyöznö, hönöm örölködnö ökör.";

        // WHEN
        String actual = underTest.kipchakify(textToKipchakify);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void testKipchakifyWhenInputIsNull() {
        // GIVEN
        String textToKipchakify = null;
        Class expectedException = KipchakifyException.class;

        // WHEN
        // THEN
        assertThrows(expectedException, () -> underTest.kipchakify(textToKipchakify));
    }

    @Test
    void testKipchakifyWhenInputLengthIsLessThanOne() {
        // GIVEN
        String textToKipchakify = "";
        Class expectedException = KipchakifyException.class;

        // WHEN
        // THEN
        assertThrows(expectedException, () -> underTest.kipchakify(textToKipchakify));
    }
}