int arr[] = {6, 2, 9, 8, 1, 4, 17, 5};
public int max(int[] arr, int low, int high)
{
    int m, left, right;
    m = (low + high) / 2;
    if(low == high)
        return arr[low];
    left = max(arr, low, m);
    right = max(arr, m + 1, high);
    return (left > right)?left:right;
}

