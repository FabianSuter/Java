private int width; // Geschuetzt

// Getter
public int getWidth(){ return width; }

// Setter, Wert zuerst pruefen
public void setWidth(int width){
    if(wdith < 0){
        throw new IllegalArgumentException();
    }
    this.width = width;
}
