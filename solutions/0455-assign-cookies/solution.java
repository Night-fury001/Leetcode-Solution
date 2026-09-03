class Solution {
    public int findContentChildren(int[] g, int[] s) {
        sort(g);
        sort(s);
        int child = 0;
        int cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (g[child] <= s[cookie]) {
                child++;
            }
            cookie++;
        }
        return child;

    }

    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        mergeSort(arr, 0, arr.length - 1);
    }

    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            mergeInPlace(arr, left, mid, right);
        }
    }

    public void mergeInPlace(int[] arr, int left, int mid, int right) {
        int n = right - left + 1;
        int gap = (n + 1) / 2;
        while (gap > 0) {
            int i = left;
            while (i + gap <= right) {
                int j = i + gap;
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
            }
            gap = (gap == 1) ? 0 : (gap + 1) / 2;
        }
    }
}
