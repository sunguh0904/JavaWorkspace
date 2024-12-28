// implicit-corecion(암묵적 타입 변환)

/* 02. 숫자 타입으로 변환 */

/*
    산술 연산자의 피연산자는 모두 숫자여야 하므로
    숫자가 아닌 피연산자를 숫자 타입으로 암묵적 타입 변환
    (문자열 연결 연산 제외)
*/
console.log(1 + '24');
// + 는 문자열 연결 연산자 이므로 124가 나온다.
console.log(1 - '24');
console.log(1 * '24');
console.log(1 / '24');
console.log(1 % 'JavaScript');

/*
    대소 비교 연산자로 크기를 비교할 때도 피연산자는 모두 숫자여야 하므로
    숫자가 아닌 피연산자를 숫자 타입으로 암묵적 타입 변환
*/
console.log(10 > '5');

// + 단항 연산자는 피연산자가 숫자 타입의 값이 아니면 숫자 타입으로 암묵적 타입 변환 수행
console.log(+'');
// 0
console.log(+'1');
// 1
console.log(+'JavaScript');
// NaN
console.log(+true);
// 1
console.log(+false);
// 0
console.log(+null);
// 0
console.log(+undefined);
// NaN
// console.log(+Symbol());
// TypeError: Cannot convert a Symbol value to a number
console.log(+{});
// NaN
console.log(+[]);
// 0
console.log(+function(){});
// NaN

/*
    빈 문자열, 빈 배열, null, false = 0으로 암시적 형변환
    true는 1로 암시적 형변환,
    객체와 undefined, function은 변환되지 않아 NaN
*/