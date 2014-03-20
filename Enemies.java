

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.DFECCC1E-CC25-08A9-0BA2-83061F67DEFE]
// </editor-fold> 
public abstract class Enemies implements ITick {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6462962F-E04D-A35E-7AC6-9846F7EFCC32]
    // </editor-fold> 
    protected double speed;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.60075580-2931-7E03-BE6B-4960100C506A]
    // </editor-fold> 
    protected Field position;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AA3D9BBC-10C0-533B-5ED9-B3DA2403B629]
    // </editor-fold> 
    protected double Power;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.89E0DFDD-BAF4-87D7-0738-D791AF881E34]
    // </editor-fold> 
    protected Field destination;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.15EC4153-44E4-C28F-FDF8-A42AF6BB47A4]
    // </editor-fold> 
    protected double power;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F2967DA0-2711-F544-4A08-346BE90B38B7]
    // </editor-fold> 
    public double getPower () {
        return Power;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EFCC8E17-8A7C-CE02-F576-55B72F3FF6EF]
    // </editor-fold> 
    public void setPower (double val) {
        this.Power = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EFD73BCE-6999-6F48-CF84-EA2501DBEE4E]
    // </editor-fold> 
    public Field getDestination () {
        return destination;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.36A8E4C8-C85A-2237-9E1A-DFD889EB4604]
    // </editor-fold> 
    public void setDestination (Field val) {
        this.destination = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ECB50D80-0EB0-81C2-714B-4E7376757DC8]
    // </editor-fold> 
    public Field getPosition () {
        return position;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BA4EE464-1A71-8869-B8A4-91B55875981A]
    // </editor-fold> 
    public void setPosition (Field val) {
        this.position = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EFDA93D0-FA1A-BCE0-FDC4-3C426776FE3D]
    // </editor-fold> 
    public double getSpeed () {
        return speed;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B1F40480-9F9A-CC04-9CB3-A9FFA4CD8F7F]
    // </editor-fold> 
    public void setSpeed (double val) {
        this.speed = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.582AA7D1-4B9C-A14D-6A7B-EAB1117905E3]
    // </editor-fold> 
    public void Move () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BF8E4BC8-EFFC-D3CB-B03B-FCE5C3A0107A]
    // </editor-fold> 
    public class Game {

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.2A00F095-AAE9-01D8-B80A-D0E444E5A898]
        // </editor-fold> 
   

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.56ADF746-1376-DEE7-65E3-FCA5185A5AC1]
        // </editor-fold> 
        private double credit = 1000.0;

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.DCB3BFDC-54B8-CA05-9344-4BF8D36FD566]
        // </editor-fold> 
        private Field[] map;

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.EAA4F634-FE1F-F51C-9E00-31D606379176]
        // </editor-fold> 
        private Enemies[] enemies;

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.5D6B44B0-D8FE-9C1E-125E-AABF4818BB67]
        // </editor-fold> 
        private Timer timer;

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.C47CDEBA-EA79-FB91-B35B-F9607AADA306]
        // </editor-fold> 
        public double getCredit () {
            return 0.0;
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.E1A1239E-930A-48F6-4B22-3E8EB0F04F9B]
        // </editor-fold> 
        public void setObstacle (Road r) {
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.D0A70088-D3AE-0EC1-4380-898CB4698A2B]
        // </editor-fold> 
        public void setTower (Ground g) {
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.A12A2BAA-5D0C-A7DA-D5FF-2D60AADA703A]
        // </editor-fold> 
        public void setRange (Tower t) {
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.CC1BB78B-1800-63D4-3D24-5B445D6EF82B]
        // </editor-fold> 
        public void setFrequency (Tower t) {
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.DC5F2163-E111-A97B-600C-E2209690E9EA]
        // </editor-fold> 
        public void setDamage (Tower t) {
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.D45B2CB1-AF93-F2F2-910B-F6CC78BF28D1]
        // </editor-fold> 
        public void setPower (Woundry w) {
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.7209123C-C230-0608-8F71-D78C1E5CE6F6]
        // </editor-fold> 
        public void setSpeed (Hurdle h) {
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.D86440B7-EF5C-C6F4-8D8E-3C7CF0206B2E]
        // </editor-fold> 
        public Field getField (double x, double y) {
            return null;
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.5D38A1AC-0103-3186-181C-1A073F1227F4]
        // </editor-fold> 
        public Enemies[] getEnemies () {
            return null;
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.07E966AC-1567-C8D0-746C-4D4A931384E8]
        // </editor-fold> 
        public void End () {
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.04838355-1709-DF3E-3193-61166792D393]
        // </editor-fold> 
        public void deleteTower (Tower t) {
        }

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
        // #[regen=yes,id=DCE.EBDC63F6-6E64-A500-72F3-4DA30E98E801]
        // </editor-fold> 
        public void GameStart () {
        }

    }

}

