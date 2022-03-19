public class Testat
{
    public static int [] apply ( int[] arr , int x)
    {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++){
            if (i % 2 != 0){
                newArr[i] = x;
            }
            else{
                newArr[i] = arr[i] * x;
            }
        }
    return newArr;
    }
}