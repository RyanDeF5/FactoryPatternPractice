
package factorypatternpractice;


public class ChampionKnife implements Knife{

    @Override
    public void inspectAnimation() {
        System.out.println("Valorant Champions 2024 Animation");
    }

    @Override
    public void Stab() {
        System.out.println("The stab of a champion!");
    }
    
    
}
