

public class MergeSort {

  public static void main(String[] args){

    int [] arr = {12, 21, 40, -5, 40 ,34, 75};

    sort(arr);

    for (int i: arr) System.out.println(i+"");
  }

  public static void sort(int arr[]) {
    if (arr.length < 2) return;

    int mid = arr.length / 2;
    int [] l = new int[mid];
    int [] r = new int[arr.length - mid];

    for (int i = 0; i < mid; i++) l[i] = arr[i];
    for (int i = mid; i < arr.length; i++) r[i - mid] = arr[i];

    sort(l);
    sort(r);

    merge(arr, l, r, mid, arr.length - mid);
  }

  public static void merge(int arr[], int leftArray[], int rightArray[], int left, int right) {

    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left && j < right) {
      if (leftArray[i] <= rightArray[j]) arr[k++] = leftArray[i++];
      else arr[k++] = rightArray[j++];
    }

    while(i < left) arr[k++] = leftArray[i++];
    while(j < right) arr[k++] = rightArray[j++];
  }
}
