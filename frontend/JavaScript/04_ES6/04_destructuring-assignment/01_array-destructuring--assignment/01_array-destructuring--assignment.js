/* 배열 구조 분해 할당 
* 구조 분해 할당을 사용하면 배열이나 객체를 변수로 분해하여 연결 할 수 있다.*/

let nameArr = ['Gidong', 'Hong'];

// let firstName = nameArr[0];
// let lastName = nameArr[1];
/* nameArr 배열 변수에 담겨 있는 값을 인덱스 순서에 맞게 삽입한다. */
let [firstName, lastName] = nameArr;

console.log(firstName);
console.log(lastName);
console.log();

/* 반환 값이 배열인 split 메서드를 활용 
* split(): 문자열 나누기 */
let [firstName2, lastName2] = 'Saimdang Shin'.split(' ');

console.log(firstName2);
console.log(lastName2);
console.log();

/* 쉼표를 사용해서 필요하지 않은 배열 요소를 버릴 수 있다. */
let arr = ['first', 'middle', 'last']
let [first3, , last3] = arr;

console.log(first3);
console.log(last3);
console.log();
