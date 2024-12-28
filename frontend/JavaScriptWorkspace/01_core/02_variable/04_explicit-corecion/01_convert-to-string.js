/* explicit corecion(명시적 타입 변환) */

// 1. 문자열 타입으로 변환

// 1. String 생성자 함수를 new 연산자 없이 호출
console.log(String(10));
console.log(String(NaN));
console.log(String(Infinity));
console.log(String(true));
// 문자열로 명시적 형변환이 일어난다.

// 2. Object.prototype.toString 메소드 사용
console.log((10).toString());
console.log((NaN).toString);
console.log((Infinity).toString);
console.log((true).toString);

// 3. 문자열 연결 연산자(+) 이용; 암묵적 변환