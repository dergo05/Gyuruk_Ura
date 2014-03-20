
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.9222D3C7-38C8-5E8F-5B17-26FD2C631287]
// </editor-fold> 
public class Hurdle extends Obstacle {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B7146A4F-992B-992A-EC5D-E43E0AD70AF0]
    // </editor-fold> 
    private double speed;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.37115742-1642-1E8F-8511-2E1A6ADB1F97]
    // </editor-fold> 
    private Enemies mEnemies;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FBA68747-BA03-5C7B-B7BF-0B05076EE48A]
    // </editor-fold> 
    public double getSpeed () {
        return 0.0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3F344F45-C620-8095-0C17-D30A87012B1D]
    // </editor-fold> 
    public void setSpeed (double s) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3F892C83-3B75-6E61-1EE1-C4F5509AD2FB]
    // </editor-fold> 
    public Enemies getEnemies () {
        return mEnemies;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BBE5F1DF-3F41-0B36-6C8D-23C5A6D60C5F]
    // </editor-fold> 
    public void setEnemies (Enemies val) {
        this.mEnemies = val;
    }

}

