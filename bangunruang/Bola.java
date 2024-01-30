package bangunruang;

public class Bola extends BangunRuang {
    
    float r;
    
    
    @Override
   float volume(){
        float volume = (float) (4/3 * Math.PI * r * r * r);
        System.out.println("volume bola: " + volume);
        return volume;
    }
   @Override
   float luaspermukaan(){
       float luaspermukaan = (float) (4 * Math.PI * r * r);
       System.out.println("luaspermukaan bola: " + luaspermukaan);
       return luaspermukaan;
}
}
