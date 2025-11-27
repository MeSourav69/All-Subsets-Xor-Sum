// All Subsets Xor Sum

class Code {
    int subsetXORSum(int arr[]) {
        int or = 0;
        for (int x : arr) or |= x;
        return or * (1 << (arr.length - 1));
    }
}

