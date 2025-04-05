
package factorypatternpractice;


public class FactoryPatternPractice {

    
    public static void main(String[] args) {
        
        var nf = new SentinelsOfLightForge();
        Knife k = nf.createKnife();
        Vandal v = nf.createVandal();
        shotGun sg = nf.createShotGun();
        
        k.inspectAnimation();
        k.Stab();
        v.shoot();
        sg.spreadFire();
        
    }
    
}
