
package factorypatternpractice;


public class SentinelsOfLightKnife implements Knife{

    @Override
    public void inspectAnimation() {
        System.out.println("Sentinals Inspect Animation");
    }

    @Override
    public void Stab() {
        System.out.println("Sentinal Stab");
    }
    
}
