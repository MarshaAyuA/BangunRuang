
package bangunruang;

public class Kubus extends BangunRuang {
    
    float s;
    
    
    @Override
    float volume(){
        float volume = (float) (s * s * s);
        System.out.println("volume kubus: " + volume);
        return volume;
    }
    @Override
    float luaspermukaan(){
        float luaspermukaan = (float) (6 * s * s);
        System.out.println("luaspermukaan kubus: " + luaspermukaan);
                return luaspermukaan;
}
}