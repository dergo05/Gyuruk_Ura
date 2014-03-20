
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.D7C65AE8-7BA7-B30F-F4F1-6E074F34B915]
// </editor-fold> 
public class Tower {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A4704C8E-4739-75D0-0152-2DC66F6702D4]
    // </editor-fold> 
    private Field position;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.91616737-FB79-DC8F-885E-C91AF282A9E5]
    // </editor-fold> 
    private boolean inRange;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F5229C01-734E-5DE8-9375-3873C78A5EC1]
    // </editor-fold> 
    private double frequency;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.932FB086-D784-24E0-EEB2-BE7B96AA7DFB]
    // </editor-fold> 
    private double range;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F06EE95B-F423-FE42-F31C-D82751DE2753]
    // </editor-fold> 
    private double damage;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B9AF6DEA-2407-05D2-582B-F9E1704A1A2B]
    // </editor-fold> 
    private Enemies mEnemies;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D1DADB63-06DF-5AED-E994-8C8EC5BC943B]
    // </editor-fold> 
    public double getRange () {
        return 0.0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F32F868D-5AFC-7B91-AE2C-938305936C24]
    // </editor-fold> 
    public double getFrequency () {
        return 0.0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BB4EAEE4-DEBE-16DB-AED2-8DBE0EF7880B]
    // </editor-fold> 
    public double getDamage () {
        return 0.0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.43539FA4-E9E1-0F6C-1F5A-26371A7845FA]
    // </editor-fold> 
    public void setRange (double r) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A2A2E513-B243-6620-A06A-ADBB0F7E75FD]
    // </editor-fold> 
    public void setFrequency (double f) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.87BFF01F-65AA-4838-DE0D-87973F9E3760]
    // </editor-fold> 
    public void setDamage (double d) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BCDA79AB-DD80-BE14-DCCA-FAABE6CE3BDF]
    // </editor-fold> 
    public Field getPosition () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.50F04412-850D-B793-CC84-06E26D3A530F]
    // </editor-fold> 
    public void Fire () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C9B3702A-553C-8511-3638-77B9596EB1F0]
    // </editor-fold> 
    public void Destroy () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.37B6836D-A68D-0ED7-8DB3-AA8F819A5F7E]
    // </editor-fold> 
    public Enemies getEnemies () {
        return mEnemies;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CD51EC9F-8B77-4F85-8537-3E1CD17E4A2F]
    // </editor-fold> 
    public void setEnemies (Enemies val) {
        this.mEnemies = val;
    }

}

