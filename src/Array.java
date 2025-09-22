public class Array {
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) { //метод возвращает наибольший по модулю элемент массива
        if (arr.length == 1){
            return arr[0];
        }

        int max_abs = -1;

        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max_abs)) max_abs = arr[i];
        }
        return max_abs;
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
            if (arr[i]==x) count++;
        }

        if (count == 0) {
            return new int[0];
        }

        int[] resultArr = new int[count];

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                resultArr[count] = i;
                count++;
            }
        }
        return resultArr;
    }
}

