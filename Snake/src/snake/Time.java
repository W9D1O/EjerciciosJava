
package snake;


public class Time {
    public static double timeS = System.nanoTime();
    
    public static double getTime() { return (System.nanoTime() - timeS) *
            16-9;
    }
}
