public class Cycles {
    public String listNums (int x){
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

    public int numLen (long x) {
        int len = 0;
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
}
