// 1. 비교 연산자

/*
    동등.일치 비교 연산자
    동등 비교(loose equality)와 일치 비교(strict equality)는 엄격성이 다르다.
    동등 비교 (==, !=): 암묵적 타입 변환을 같은 값인지 비교한다.
    일치 비교 (===, !==): 타입과 값이 모두 일치하는지 비교한다.
*/

console.log("===== 숫자 1과 문자 '1', true 비교 ===== ")
console.log(`1 == '1' : ${1 == '1'}`);
console.log(`1 == true : ${1 == true}`);
console.log(`1 === '1' : ${1 === '1'}`);
console.log(`1 === true : ${1 === true}`);

console.log("====== 숫자 0과 빈 문자열 '', 문자 '0', false 비교 =====")
consol.log(`0 == '0' : ${0 == '0'}`);
consol.log(`0 == '' : ${0 == ''}`);
consol.log(`0 == 'false' : ${0 == false}`);
consol.log(`0 === '0' : ${0 === '0'}`);
consol.log(`0 === '' : ${0 === ''}`);
consol.log(`0 === 'false' : ${0 === false}`);