public class Gettersetter{
private int width; // Geschuetzt

// Getter
public int getWidth(){ return width; }

// Setter, Wert zuerst pruefen
public void setWidth(int width){
    if(width < 0){
        throw new IllegalArgumentException();
    }
    this.width = width;
}
}
