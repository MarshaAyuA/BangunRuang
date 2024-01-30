
package bangunruang;

/**
 *
 * @author ARMELIOTA
 */
public class LimasSegitiga extends BangunRuang {
    
   float a;
   float tS;
   float tL;
   float t;
   float tST;
   
   @Override
    float volume(){
        float volume = (float) 1/6 * (1/2 * a * tS) * tL;
        System.out.println("volume LimasSegitiga: " + volume);
        return volume;
    }
    @Override
    float luaspermukaan(){
        float luaspermukaan = (float) (1/2 * a * t + (3 * (1/2 * a * tS)));
        System.out.println("luaspermukaan LimasSegitiga: " + luaspermukaan);
                return luaspermukaan;
          
    
}
}
