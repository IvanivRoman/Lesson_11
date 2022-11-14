package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AppTest {

    static int[] arr, arr1, arr2, arr3, arr4, arr5, arr6, arr7, arr8, arr9;

    @BeforeAll
    static void createAndSortArrays() {
        arr = new int[0];

        arr1 = new int[]{-42, -26, 37, -39, -29};
        arr2 = new int[]{-30, -9, 28, 47, 15};
        arr3 = new int[]{34, -36, 11, 42, -5};
        arr4 = new int[]{-1, 4, -48, -41, -6};
        arr5 = new int[]{26, 12, -27, 20, 49};

        arr6 = new int[]{-42, -26, 37, -39};
        arr7 = new int[]{-30, -9, 28, 47};
        arr8 = new int[]{34, -36, 11, 42};
        arr9 = new int[]{-1, 4, -48, -41};

        App.bubbleSorting(arr1);
        App.bubbleSorting(arr2);
        App.bubbleSorting(arr3);
        App.bubbleSorting(arr4);
        App.bubbleSorting(arr5);
        App.bubbleSorting(arr6);
        App.bubbleSorting(arr7);
        App.bubbleSorting(arr8);
        App.bubbleSorting(arr9);
    }

    @Test
    void testBubbleSortingWorksWell() {

        assertThat(arr1).containsExactly(-42, -39, -29, -26, 37);
        assertThat(arr2).containsExactly(-30, -9, 15, 28, 47);
        assertThat(arr3).containsExactly(-36, -5, 11, 34, 42);
        assertThat(arr4).containsExactly(-48, -41, -6, -1, 4);
        assertThat(arr5).containsExactly(-27, 12, 20, 26, 49);
        assertThat(arr6).containsExactly(-42, -39, -26, 37);
        assertThat(arr7).containsExactly(-30, -9, 28, 47);
        assertThat(arr8).containsExactly(-36, 11, 34, 42);
        assertThat(arr9).containsExactly(-48, -41, -1, 4);
    }

    @Test
    void testBubbleSortingWorksWell2() {
        assertThat(arr1).isSorted();
        assertThat(arr2).isSorted();
        assertThat(arr3).isSorted();
        assertThat(arr4).isSorted();
        assertThat(arr5).isSorted();
        assertThat(arr6).isSorted();
        assertThat(arr7).isSorted();
        assertThat(arr8).isSorted();
        assertThat(arr9).isSorted();
    }

    @Test
    void testBubbleSortingIsNotEmpty() {
        assertThat(arr1).isNotEmpty();
        assertThat(arr2).isNotEmpty();
        assertThat(arr3).isNotEmpty();
        assertThat(arr4).isNotEmpty();
        assertThat(arr5).isNotEmpty();
        assertThat(arr6).isNotEmpty();
        assertThat(arr7).isNotEmpty();
        assertThat(arr8).isNotEmpty();
        assertThat(arr9).isNotEmpty();
    }

    @Test
    void shouldBinarySearchReturnNegativeIfArrayIsEmpty() {
        assertThat(App.binarySearch(arr, 2)).isNegative();
    }

    @Test
    void shouldBinarySearchReturnNegativeIfNotFoundInSortedOddArray() {
        assertThat(App.binarySearch(arr1, 2)).isNegative();
        assertThat(App.binarySearch(arr2, 2)).isNegative();
        assertThat(App.binarySearch(arr3, 2)).isNegative();
        assertThat(App.binarySearch(arr4, 2)).isNegative();
        assertThat(App.binarySearch(arr5, 2)).isNegative();
    }

    @Test
    void shouldBinarySearchReturnNegativeIfNotFoundInSortedEvenArray() {
        assertThat(App.binarySearch(arr6, 2)).isNegative();
        assertThat(App.binarySearch(arr7, 2)).isNegative();
        assertThat(App.binarySearch(arr8, 2)).isNegative();
        assertThat(App.binarySearch(arr9, 2)).isNegative();
    }

    @Test
    void shouldBinarySearchReturnPositiveIfFoundAsFirstInSortedArray() {
        assertThat(App.binarySearch(arr1, -42)).isZero();
        assertThat(App.binarySearch(arr2, -30)).isZero();
        assertThat(App.binarySearch(arr3, -36)).isZero();
        assertThat(App.binarySearch(arr4, -48)).isZero();
        assertThat(App.binarySearch(arr5, -27)).isZero();
        assertThat(App.binarySearch(arr6, -42)).isZero();
        assertThat(App.binarySearch(arr7, -30)).isZero();
        assertThat(App.binarySearch(arr8, -36)).isZero();
        assertThat(App.binarySearch(arr9, -48)).isZero();
    }

    @Test
    void shouldBinarySearchReturnPositiveIfFoundAtEndInSortedArray() {
        assertThat(App.binarySearch(arr1, 37)).isEqualTo(4);
        assertThat(App.binarySearch(arr2, 47)).isEqualTo(4);
        assertThat(App.binarySearch(arr3, 42)).isEqualTo(4);
        assertThat(App.binarySearch(arr4, 4)).isEqualTo(4);
        assertThat(App.binarySearch(arr5, 49)).isEqualTo(4);
        assertThat(App.binarySearch(arr6, 37)).isEqualTo(3);
        assertThat(App.binarySearch(arr7, 47)).isEqualTo(3);
        assertThat(App.binarySearch(arr8, 42)).isEqualTo(3);
        assertThat(App.binarySearch(arr9, 4)).isEqualTo(3);
    }

    @Test
    void shouldReturnTrueIfFoundInMiddleInSortedArray() {
        assertThat(App.binarySearch(arr1, -29)).isEqualTo(2);
        assertThat(App.binarySearch(arr2, 15)).isEqualTo(2);
        assertThat(App.binarySearch(arr3, 11)).isEqualTo(2);
        assertThat(App.binarySearch(arr4, -6)).isEqualTo(2);
        assertThat(App.binarySearch(arr5, 20)).isEqualTo(2);
    }

}