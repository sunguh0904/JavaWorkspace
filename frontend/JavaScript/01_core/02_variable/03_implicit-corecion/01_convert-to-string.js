// implicit-corecion(암묵적 타입 변환)

/*
    01. 문자열 타입으로 변환
    문자열 연결 연산자로 동적
*/

console.log(10 + '20');
// 문자열 타입이 아닌 피연산자를 문자열 타입으로 암묵적으로 변환
// 10을 문자열 타입으로 변환

console.log(`10 + 20: ${10 + 20}`);
// 템플릿 리터럴 표현식 삽입은 표현식의 결과를 문자열 타입으로 암묵적으로 변환

/*  문자열 타입이 아닌 값을 문자열 타입으로 암묵적으로 변환하는 결과    */
console.log(1 + '');
// 정수가 아닌 문자열의 "1" ... undefined 까지
console.log(NaN + '');
console.log(Infinity + '');
console.log(true + '');
console.log(null + '');
console.log(undefined + '');
// console.assert(Symbol() + '');
// TypeError: Cannot convert a Symbol value to a string, 심볼 타입은 문자열로 형변환을 할 수가 없다.
console.log({} + '');
console.log([] + '');
// 배열 안에 아무런 값도 없어 빈 문자열을 반환한다.
console.log(function(){} + '');