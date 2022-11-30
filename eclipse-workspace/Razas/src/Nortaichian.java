
public class Nortaichian extends Raza{
           
        
    
    public Nortaichian(int posicion) {
        this.saludActual = 198;
        this.saludMaxima = 198;
        this.rangoMaximo = 17;
        this.rangoMinimo = 0;
        this.danioActual = 116;
        this.danioBasico = 116;
        this.posicion = posicion;
        
        
    }
    
    
    public void atacar(Raza raza) {
        
            if(this.equals(raza))
                throw new RuntimeException();
            if(Math.abs(raza.posicion - this.posicion) > this.rangoMaximo )
                throw new RuntimeException();
            raza.recibirAtaque(this.danioActual);
            
    }
    
    public void recibirAtaque(int danio) {
        saludActual -= danio;
        if(saludActual <= 0)
            throw new RuntimeException();
        saludActual += ((int) saludActual * 1.1);
        if(saludActual > saludMaxima)
            saludActual = saludMaxima;
            
            }
    
    
    public void descansar() {
        saludActual +=(int) (saludActual * 1.75);
        if(saludActual >(int) saludMaxima * 1.75)
            saludActual = (int) (saludMaxima * 0.75);
        
    }

}