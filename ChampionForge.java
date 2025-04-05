
package factorypatternpractice;


public class ChampionForge implements WeaponForge{

    @Override
    public Knife createKnife() {
        return new ChampionKnife();
    }

    @Override
    public Vandal createVandal() {
        return new ChampionVandal();
    }

    @Override
    public shotGun createShotGun() {
        return new ChampionShotgun();
        
    }

    
    
}
