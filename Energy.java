/*
* This program calculates the energy
* with given lengths of the logs
*
* @author  Jenoe Balote
* @version 1.0
* @since   2020-11-20
*/

import java.io.IOException;
import java.util.Scanner;

/**
 * This class has the calculations necessary for figuring out how much energy
 * would be produced by a specific amount of mass.
 */
final class Energy {
    // Constant
    /**
     * The speed of light.
     */
    public static final double SPEED_OF_LIGHT = 2.998 * Math.pow(10, 8);

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Variables
        final double massOfObject;
        final double energyProduced;

        try {

            final Scanner myObj = new Scanner(System.in);
            // Input
            System.out.println("This program calculates energy released when"
                             + " the mass of an object is converted to energy.");
            System.out.print("Enter the mass of an object (kg): ");

            final float mass = myObj.nextFloat();

            // Calculate energy
            energyProduced = mass * Math.pow(SPEED_OF_LIGHT, 2);

            // Output
            System.out.println("");
            System.out.println("" + mass + "kg of mass would produce "
                               + energyProduced + "J of energy.");
        }
        catch (IOException exception) {
            System.out.println("\nThat's not a number!");
        }
        finally {
            System.out.println("\nThanks for using the program!");
        }
    }
}
