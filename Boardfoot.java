/*
*
* This program tells you the length
* required for a board foot
*
* @author  Sydney Kuhn
* @version 1.0
* @since   2020-10-10
*
* This program tells you the length
* required for a board foot.
*/

import java.util.Scanner;

/**
 * This is a board foot calculator program.
 */

final class Boardfoot {

    /**
     * The minimum number for height and width.
     */
    public static final double MIN = 0;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Boardfoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Calculates the length.
     *
     * @param width width of the wood
     * @param height height of the wood
     * @return returns length of the wood
     */

    public static double boardFootCalculator(
                final double width, final double height) {
        final double boardFootVolume = 144.0;
        final double length = Math.round(
                        boardFootVolume / (width * height));
        return length;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // Input.
        System.out.println("1 Board Foot is equal to 144³ inches of wood.");
        System.out.println("This program calculates the length of a board "
                        + "foot based on the width and height.\n");

        final Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the width of the wood in inches : ");
        final String firstInput = myObj.nextLine();
        System.out.print("Enter the height of the wood in inches : ");
        final String secondInput = myObj.nextLine();

        // Process and Output.
        try {
            // This is where it checks the inputs.
            final double userWidth = Double.parseDouble(firstInput);
            final double userHeight = Double.parseDouble(secondInput);

            if (userWidth <= MIN || userHeight <= MIN) {
                System.out.println("\nImpossible Solution.");
            } else {
                final double length = boardFootCalculator(
                                userWidth, userHeight);
                System.out.println("\nThe length of the wood should be "
                                + length + " inch(es) long.");
            }
            // This catches invalid inputs.
        } catch (NumberFormatException nfe) {
            System.out.println("\nInvalid Input Entered.");
        }
        System.out.println("\nDone.");
    }
}
