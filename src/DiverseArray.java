public class DiverseArray {
    public static int arraySum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int[] rowSums(int[][] array2d) {
        int[] row = new int[array2d.length];
        for(int i = 0; i < array2d.length; i++){
            int sum = 0;
            for(int j = 0; j < array2d[i].length; j++){
                sum += array2d[i][j];
            }
            row[i] = sum;
        }
        return row;
    }

    public static boolean isDiverse(int[][] array2d) {
        int[] arr = rowSums(array2d);
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j])
                    return false;
            }
        }
        return true;
    }
}
