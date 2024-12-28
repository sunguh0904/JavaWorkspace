/* 스프레드 문법
* 하나로 뭉쳐져 있는 여러 값들의 집합(배열, 객체 등)을 전개해서 개별적인 값들의 목록으로 만든다. */

let arr = [2, 15, 5];
console.log(`가장 큰 값: ${Math.max(arr)}`);    // NaN
console.log(`가장 큰 값: ${Math.max(2, 5, 15)}`);   // 15
/* 함수를 호출할 때 ...arr을 사용하면 arr이 인수 목록으로 확장 된다. */
console.log(`가장 큰 값: ${Math.max(...arr)}`); // 15
/* arr 변수의 값을 펼쳐서 인수 목록으로 확장이 되면서 알맞게 들어간다. */

let arr1 = [5, 8, 22];
let arr2 = [3, 55, 97];

/* 배열 객체 여러 개 전달 가능 */
console.log(`가장 작은 값: ${Math.min(...arr1, ...arr2)}`); // 3

/* 일반 값과 혼합해서 사용 가능 */
console.log(`가장 작은 값: ${Math.min(1, ...arr1, 3, ...arr2, 7)}`);

/* 배열 병합에도 사용 가능 (concat 보다 간결하게 사용 가능) */
let merged = [0, ...arr, 2, ...arr2]
console.log(merged);

/* 문자열 배열 변환 
* 문자 하나하나 펼쳐서 보여준다. */
let str = 'JavaScript';
console.log([...str])