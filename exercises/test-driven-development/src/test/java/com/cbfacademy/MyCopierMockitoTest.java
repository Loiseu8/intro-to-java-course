package com.cbfacademy;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

    public class MyCopierMockitoTest {
        @Test
        public void testCopyUsingMockito() {
            //Furst creating my mocks
            Source mySource = mock(Source.class);
            Destination myDestination = mock(Destination.class);

            //First, set up the behavior of the mock
            when(mySource.getChar()).thenReturn('h', 'o', 'w', 'd', 'y', '\n');

            //Next, create Copier and copy
            MyCharacterCopier copier = new MyCharacterCopier(mySource, myDestination);
            copier.copy();

            //To check whther my setChar is called with the correct characters
            verify(myDestination, times(1)).setChar('h');
            verify(myDestination, times(1)).setChar('o');
            verify(myDestination, times(1)).setChar('w');
            verify(myDestination, times(1)).setChar('d');
            verify(myDestination, times(1)).setChar('y');
        }
    }

