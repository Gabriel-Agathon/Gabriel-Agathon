public class Cartridge {
    private Color color;
    private Filling int;
    private final FillMax int;
    private final DEFAULTFillMax int;

    public Cartridge(Color col){
        this.Color = col;
        this.FillMax = DEFAULTFillMax;
        this.Filling = DEFAULTFillMax;
    }

    public Color getColor(){
        return this.color;
    }
    public int actualFill(){
        return this.Filling;
    }
    public bool isEmpty(){
        this.Filling == 0;
    }
    public void consume(){
        this.Filling --;
    }
    
}