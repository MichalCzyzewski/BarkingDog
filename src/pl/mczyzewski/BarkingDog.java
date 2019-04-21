package pl.mczyzewski;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == false) {
            return false;
        } else if (hourOfDay < 0) {
            return false;
        } else if (hourOfDay <= 7) {
            return true;
        } else if (hourOfDay < 22) {
            return false;
        } else if (hourOfDay > 23) {
            return false;
        }
        return true;
    }

}




