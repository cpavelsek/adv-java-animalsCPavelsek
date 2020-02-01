package us.mattgreen;

import java.io.FileNotFoundException;

public class InputTypeVerifier {
    public static int verification(String input) throws BadInput {

        try {
            int result = Integer.parseInt(input);

            return result;

        } catch (NumberFormatException e) {
            throw new BadInput("Not a valid entry.");
        }


    }

    public static boolean verificationBool(String input) throws BadInput {

        try {
            if (!(input.equals("y") || input.equals("n"))) {
                throw new BadInput("Not a valid entry.");
            }
            boolean result = Boolean.parseBoolean(input);
            return result;

        } catch (NumberFormatException e) {
            throw new BadInput("Not a valid entry.");
        }


    }
}
