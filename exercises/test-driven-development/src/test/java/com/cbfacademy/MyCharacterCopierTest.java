package com.cbfacademy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Creating my test doubles manually using spies
    //my SpySource and SpyDestination classes can both be here as they are not declared public
    class SpySource implements Source {
        private final String input;
        private int index = 0;

        public SpySource(String input) {
            this.input = input;
        }

        @Override
        public char getChar() {
            return index < input.length() ? input.charAt(index++) : '\n';
        }
    }

    class SpyDestination implements Destination {
        private final StringBuilder capturedChars = new StringBuilder();

        @Override
        public void setChar(char c) {
            capturedChars.append(c);
        }

        public String getCapturedChars() {
            return capturedChars.toString();
        }
    }

    public class MyCharacterCopierTest {
        @Test
        public void testCopyUsingSpies() {
            // Create spies
            SpySource mySource = new SpySource("hello\n");
            SpyDestination myDestination = new SpyDestination();

            // Create Copier and copy
            MyCharacterCopier copier = new MyCharacterCopier(mySource, myDestination);
            copier.copy();

            // Assert that the destination received the correct characters
            assertEquals("hello", myDestination.getCapturedChars());
        }
    }

