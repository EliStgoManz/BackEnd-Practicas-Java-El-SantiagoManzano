package semana1;

public class bicileta {




//atributos o características del objeto bicicleta
public int pins,rodada;
public double velocidad;
public String color;

public int getPins() {
return pins;
}

public int getRodada(){
    return rodada;
}

public double getVelocidad(){
    return velocidad;}


    public String getColor(){
    return color;
    }


    public boolean setPins(int pins){
        if(pins>0){
            this.pins=pins;
            return true;
        }else
            return false;
    }


public boolean setRodada(int rodada){
    if(rodada>0){
        this.rodada=rodada;
        return true;
    }else
        return false;
}


public boolean setVelocidad(double velocidad){
    if(velocidad>=0){
        this.velocidad=velocidad;
        return true;
    }else
        return false;

}

public boolean setColor(String color){
    if(!color.isEmpty()){
        this.color=color;
        return true;
    }
    return false;
}


public String printState(){
    return "pins: "+pins+"\n"+
            "rodada: "+rodada+"\n"+
            "Velocidad: "+velocidad+"\n"+
            "Color: "+color;
}


}
