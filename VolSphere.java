import java.util.Scanner;

/**

* The HelloWorld program implements an application that

* simply displays "Hello World!" to the standard output.

*

* @author  Tony Tran

* @version 1.0

* @since   2025-02-10

*/

final class VolSphere {
    /**
     * @exception IllegalStateException
     * @see IllegalStateException
     */
    private VolSphere() {
        throw new IllegalStateException("Utility class");
    }

    public static void main(final String[] args) {
        System.out.println("What is the Radius?");
        Scanner s = new Scanner(System.in);
        double radius = s.nextFloat();
        double pi = Math.PI;
        double volumeSphere = ((4f / 3f) * pi) * Math.pow(radius, 3f);
        System.out.format("The Sphere Volume is: %.2f \n", volumeSphere);
    }
}
