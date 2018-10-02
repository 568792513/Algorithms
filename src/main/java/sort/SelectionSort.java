package sort;

/*
    ���� -------------- �ڲ��Ƚ�����
    ���ݽṹ ---------- ����
    ���ʱ�临�Ӷ� ---- O(n^2)
    ����ʱ�临�Ӷ� ---- O(n^2)
    ƽ��ʱ�临�Ӷ� ---- O(n^2)
    ���踨���ռ� ------ O(1)
    �ȶ��� ------------ ���ȶ�

    ��ʼʱ���������ҵ���С����Ԫ�أ��ŵ����е���ʼλ����Ϊ���������У�
    Ȼ���ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ��ŵ����������е�ĩβ��
    �Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�
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
            // ��δ����������Ա���ҵ���Сֵ
            for (int j = i + 1; j < len; j++) {
                // �����Сֵ
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
