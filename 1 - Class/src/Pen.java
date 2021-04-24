public class Pen {


    /*
     * CLASS = DATA + METHODS
     * CLASS = ATTRIBUTES + BEHAVIOUR (in oop methodology)
     */



    //color canNOT be reached from outside the Pen class
   private String color;

    //this means it can be accessed from outside the Pen class
    public void SetColor(String clr){
        color = clr;
    }

    public String GetColor(){
        return  color;
    }

}
