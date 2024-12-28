// 함수 호이스팅(function hoisting)


/*
    함수 선언문은 런타임 이전 자바스크립트 엔진에 의해 먼저 실해오딘다.
    따라서 함수 얼마
    이렇게 함수선언문이 코드의 선두로 끌어올려진 것처럼 동작하는 것은
    자바 스크립트의 고유의 특징, 함수 호이스팅이라고 한다.
*/
console.log(hello);
// console.log();

console.log(hello('판다'));
// console.log(hi('판다'));
// ReferenceError: ih is not defined

// 함수 선언문
function hello(name) {
    return `${name} 님 안녕하세요 :)`;
}

// 함수 표현식
var hi = function(name) {
    return`${name} 안녕`;
}

/*
    변수 할당문의 값은 할당문이 실행되는 시점, 러나임에 평가되므로
    함수 표현식의 함수 리터럴도 할당문이 실행되는 시점에 평가되어 함수 객체가 된다.
    따라서 함수 표현식으로 정의한 함수는 반드시 함수 표현식 이후에 참조 또는 호출해야 한다.
*/

console.log(hello('다람쥐'));
console.log(hi('판다'));