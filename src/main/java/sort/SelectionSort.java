package sort;

/*
    分类 -------------- 内部比较排序
    数据结构 ---------- 数组
    最差时间复杂度 ---- O(n^2)
    最优时间复杂度 ---- O(n^2)
    平均时间复杂度 ---- O(n^2)
    所需辅助空间 ------ O(1)
    稳定性 ------------ 不稳定

    初始时在序列中找到最小（大）元素，放到序列的起始位置作为已排序序列；
    然后，再从剩余未排序元素中继续寻找最小（大）元素，放到已排序序列的末尾。
    以此类推，直到所有元素均排序完毕。
 */
public class SelectionSort {

    private static int temp = 0;

    public static void main(String[] args) {
        int array[] = {34, 134, 43, 2, 5, 6, 7, 2, 3, 34, 234};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void swap(int A[], int i, int j) {
        temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private static void selectionSort(int A[]) {
        int len = A.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            // 在未排序的数组成员中找到最小值
            for (int j = i + 1; j < len; j++) {
                // 标记最小值
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(A, min, i);
            }
        }
    }
}
