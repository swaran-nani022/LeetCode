/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (arr, target) {
    let i = 0;
    let j = arr.length - 1;

    while (arr[i] + arr[j] !== target) {
        let sum = arr[i] + arr[j];
        if (sum > target) {
            j--;
        }
        else {
            i++;
        }

    }
    return [i + 1, j + 1]
};
