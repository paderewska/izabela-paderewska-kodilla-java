package com.kodilla.lotto;

import com.kodilla.testing.library.LibraryDatabase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MaszynaLosujacaTestSuite {

    @Test
    public void testMiniLotto(){
        //Given
        Database dataBaseMock = mock(Database.class);
        MaszynaLosujaca maszynaLosujaca = new MaszynaLosujaca(dataBaseMock);

        ArrayList<Integer> uzytkownik = new ArrayList<>();
        uzytkownik.add(1);
        uzytkownik.add(2);
        uzytkownik.add(3);
        uzytkownik.add(4);
        uzytkownik.add(5);

        ArrayList<Integer> wylosowane = new ArrayList<>();
        wylosowane.add(3);
        wylosowane.add(4);
        wylosowane.add(5);
        wylosowane.add(6);
        wylosowane.add(7);

        when(dataBaseMock.wylosuj(5)).thenReturn(wylosowane);

        //When
        int ileLiczb = maszynaLosujaca.miniLotto(uzytkownik);

        //Then
        Assert.assertEquals(3, ileLiczb);
        }



}
