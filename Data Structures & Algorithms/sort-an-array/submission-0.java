class Solution {

    public void mergeSort(int a[], int b[], int lb, int ub, int mid) {
        int i = lb;
        int j = mid + 1;
        int k = lb;

        while(i <= mid && j <= ub) {
            if(a[i] < a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }

        while(i <= mid) {
            b[k++] = a[i++];
        }

        while(j <= ub) {
            b[k++] = a[j++];
        }

        for (k = lb; k <= ub; k++) {
            a[k] = b[k];
        }
    }

    public void merge(int a[], int b[], int lb, int ub) {
        if(lb < ub) {
            int mid = (lb + ub) / 2;
            merge(a, b, lb, mid);
            merge(a, b, mid + 1, ub);
            mergeSort(a, b, lb, ub, mid);
        }
    } 

    public int[] sortArray(int[] nums) {
        int b[] = new int[nums.length];
        merge(nums, b, 0, nums.length - 1);
        return nums;
    }
}