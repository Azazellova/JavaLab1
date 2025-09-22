public class Methods {

    public double fraction (double x){
        return x % 1;
    }

    public int charToNum (char x){
        return x - '0';
    }

    public boolean is2Digits (int x){
        return (x > 9 && x < 100);
    }

    public boolean isInRange (int a, int b, int num){
        if (a>=b){
            if ((num >= b) && (num <= a)){
                return true;
            }
        }
        else{
            if ((num >= a) && (num <= b)){
                return true;
            }
        }
        return false;
    }

    public boolean isEqual(int a, int b, int c){
        return (a == b && b == c);
    }

}
