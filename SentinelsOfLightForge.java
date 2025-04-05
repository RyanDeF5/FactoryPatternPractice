
package factorypatternpractice;


public class SentinelsOfLightForge implements WeaponForge{

    @Override
    public Knife createKnife() {
        return new SentinelsOfLightKnife();
    }

    @Override
    public Vandal createVandal() {
        return new SentinelsOfLightVandal();
    }

    @Override
    public shotGun createShotGun() {
        return new SentinelsOfLightShotgun();
    }
    
}
