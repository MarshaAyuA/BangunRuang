
package bangunruang;

public class Balok extends BangunRuang {
    float p;
    float l;
    float t;
    
    @Override
    float volume(){
        float volume = (float) (p * l * t);
        System.out.println("volume balok: " + volume);
        return volume;
    }
    @Override
    float luaspermukaan(){
        float luaspermukaan = (float) (2 * p * l + 2 * l * t + 2 * p * t);
        System.out.println("luaspermukaan balok: " + luaspermukaan);
                return luaspermukaan;
    
    
}
}
