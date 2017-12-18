package zajecia7cwiczenie4;

public class Wiatr {
    private double predkoscWiatruKmH=0.0;


    public Wiatr(double predkoscWiatruKmH){
        this.predkoscWiatruKmH = predkoscWiatruKmH;
    }
    public double getPredkoscWiatruKmH(){
        return predkoscWiatruKmH;
    }

    public double predkoscMile(){
        return predkoscWiatruKmH * 0.6213711922;
    }
    public double predkoscWezly(){
        return predkoscWiatruKmH/1.852;
    }
   public void predkosc(double predkoscWiatruKmH){
       if(this.predkoscWiatruKmH<2){
            System.out.println("lekki wiatr");
        }else (this.predkoscWiatruKmH>120){
        System.out.println("huragan");
    }public int getBeaufort(){
            int beaufort
    }
       }
    }

