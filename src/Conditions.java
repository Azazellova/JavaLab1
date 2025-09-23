public class Conditions {
    public int abs (int x) {
        if (x < 0) {
            return x * (-1);
        }
        return x;
    }

    public boolean is35 (int x) {
        if ((x%3 == 0) || (x%5 == 0)) {
            if ((x%3 == 0) && (x%5 == 0)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public int max3 (int x, int y, int z){
        if ((x > z) && (x > y)){
            return x;
        } else if ((y > z) && (y > x)) {
            return y;
        }
        return z;
    }

    public int sum2 (int x, int y) {
        int sum;
        sum = x + y;
        if ((sum >= 10) && (sum < 20)) {
            return 20;
        } else {
            return sum;
        }
    }

    public String day (int x) {
        switch (x) {
            case 1: {
                return "Понедельник";
            }
            case 2: {
                return "Вторник";
            }
            case 3: {
                return "Среда";
            }
            case 4: {
                return "Четверг";
            }
            case 5: {
                return "Пятница";
            }
            case 6: {
                return "Суббота";
            }
            case 7: {
                return "Воскресенье";
            }
            default: {
                return "Это не день недели";
            }
        }
    }
}
