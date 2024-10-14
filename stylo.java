public class Pen {
    private Cartridge curCart;

    public Pen(Color col,String brand){
        this.curCart = Cartridge(col);
        this.brand = brand;
    }

    public void write(String s){
        System.out.println(s);
        consume(this.curCart);
    }
    public void changeCart(Color col){
        this.curCart = Cartridge(col);
    }
}

public class Highlighter extends Pen{
    public highlight(String st){
        toUpperCase(st);
    }
}

public class Disposable extends Pen{
    @override public void changeCart(Color col){
        println("Error, this pen is disposable, you can't refill it. What a waste");
        this.curCart.Filling = 0;
    }

}

public class Retractable extends Pen{
    private LeadIsOut bool;
    @override public void write(String s){
        if (LeadIsOut == true)
        {super.write(s)}
        else
        println("Error, the lead isn't out, you can't write");
    }
    public void leadIn(){
        this.LeadIsOut = false;
    }
    public void leadOut(){
        this.LeadIsOut = true;
    }

}

public class SwitchPen extends Pen{
}

public class MultiColorPen extends Pen{
}