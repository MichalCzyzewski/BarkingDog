package pl.mczyzewski;

public class BarkingDog {

    public static boolean hourOfDay(boolean barking, int hourOfDay) {


        if (barking == true) {
            if (hourOfDay >= 8 && hourOfDay <= 22) {
                return true;
            } else if (hourOfDay <= 0 && hourOfDay > 23) {
                return false;
            }
        }
        return false;
    }
    }
