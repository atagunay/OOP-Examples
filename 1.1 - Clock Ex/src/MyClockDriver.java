public class MyClockDriver {

    private int hour;
    private int minute;
    private int second;

    //DEFAULT CONSTRUCTOR
    public MyClockDriver(){
        hour = 0;
        minute = 0;
        second = 0;
    }

    //PARAMETRIC CONSTRUCTOR
    public  MyClockDriver(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    //ACCESSOR METHODS

    public void setHour(int h){
        if(h >= 0 && h <= 24){
            hour = h;
        }
        else{
            hour = 0;
        }
    }

    public void setMinute(int m){
        if(m >= 0 && m <= 59){
            minute = m;
        }
        else{
            minute = 0;
        }

    }

    public void setSecond(int s){
        if(s >= 0 && s <= 59){
            second = s;
        }
        else{
            second = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
