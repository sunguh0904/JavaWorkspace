// 출력문, java의 System.out.printl
// 자바스크립트의 콘솔창은 Ctrl + `(~)
// 실행은 Ctrl + Alt + N

// 01. 숫자 타입

// 정수, 실수, 음수 모두 숫자 타입니다.
var integer = 10;
var double = 5.5;
var negative = - 10;
// 자바스크립트는 하나의 숫자 타입만 정의하고 모두 실수로 처리한다

console.log(10 === 10.0);
// ===: 값과 타입이 같은지 확인하는 연산자

console.log(typeof(integer));
console.log(typeof(double));
console.log(typeof(negative));
// 타입 확인: number 라는 타입 하나만 가지고 있다.

console.log(10 / 4);
// 숫자 타입은 모두 실수로 처리가 되기 때문에 2.5가 나온다.

console.log(10 / 0);
// Infinity: 양의 무한대

console.log(10 / -0);
// -Infinity: 음의 무한대

console.log(1 * '문자열');
// NaN: 산술 연산 불가(Not-a-Number: 숫자가 아니다)