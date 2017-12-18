package cwiczenia1811wzorce_projektowe.facade;

public class Facade {
    private Light light = new Light();
    private Windows windows = new Windows();

    public void activate(){
        light.on();
        windows.open();
    }
    public void deactivate(){
        windows.close();
        light.off();
    }
}
