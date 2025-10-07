public class Methods {

    public double fraction (double x) {
        return x % 1;
    }

    public int charToNum (char x) {
        return x - '0';
    }

    public boolean is2Digits (int x) {
        return (x > 9 && x < 100);
    }

    public boolean isInRange (int a, int b, int num) {
        if (a >= b) {
            if ((num >= b) && (num <= a)) {
                return true;
            }
        } else {
            if ((num >= a) && (num <= b)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEqual(int a, int b, int c) {
        return (a == b && b == c);
    }

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

    public String listNums (int x) {
        String list = "";
        for (int i = 0; i <= x; i++) {
            if(i!=x) {
                list += Integer.toString(i) + " ";
            } else {
                list += Integer.toString(i);
            }
        }
        return list;
    }

    public String chet (int x) {
        String str = "";
        for (int i = 0; i <= x; i+=2) {
            str += i + " ";
        }
        return str;
    }

    public long numLen (long x) {
        long len = 0;
        while (x != 0) {
            x/=10;
            len++;
        }
        return len;
    }

    public void square (int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void rightTriangle (int x) {
        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - k; j++) {
                System.out.print(' ');
            }
            k++;
            for (int j = 0; j < k; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int maxAbs = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxAbs)) {
                maxAbs = arr[i];
            }
        }
        return maxAbs;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] add_arr = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++) {
            add_arr[i] = arr[i];
        }
        for (int i = pos; i < pos + ins.length; i++) {
            add_arr[i] = ins[i - pos];
        }
        for (int i = pos + ins.length; i < add_arr.length; i++) {
            add_arr[i] = arr[i - ins.length];
        }
        return add_arr;
    }

    public int[] reverseBack(int[] arr) {
        int arrLen = arr.length;
        int[] arr2 = new int[arrLen];

        for (int i = 0; i < arrLen; i++) {
            arr2[i] = arr[arrLen-i-1];
        }
        return arr2;
    }

    public int[] findAll (int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        if (count == 0) {
            return new int[0];
        }

        int[] resultArr = new int[count];

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                resultArr[count] = i;
                count++;
            }
        }
        return resultArr;
    }
}
