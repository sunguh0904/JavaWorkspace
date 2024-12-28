// 2. let
// 1. 변수 중복 선언 금지
// let, const 키워드로 선언된 변수는 같은 스코프 내에서 중복 선언을 허용하지 않음
let msg = "hello";
// let msg = "bye";

// 2. 블록 레벨 스코프
// let 키워드로 선언한 변수는 모든 코드 블록(함수, if, for, while, try/catch문 등)을 지역 스코프로 가진다.
let i = 0;

for (let i = 0; i < 10; i++) {
    console.log(`for의 지역 변수 i: ${i}`);
}

console.log(i);

// 3. 변수 호이스팅
// let 키워드로 선언한 변수는 변수 호이스팅이 발생하지 않는 것처럼 동작한다.
// var 키워드는 선언 단계와 초기화 단계가 함께 진행되지만
// let 키워드는 선언 단계와 초기화 단계가 분리되어 진행된다.
// 따라서 선언은 되었지만 초기화가 되지 않아 참조 시 오류가 발생한다.
// console.log(x);
let x;
// ReferenceError: Cannot access 'x' before initialization; 초기화가 되기 전에는 x에 접근할 수 없다.
let y = 1;

if(true) {
    // 변수 호이스팅으로 아래의 지역변수 y의 선언이 먼저 일어났기 때문에 전역 변수 y를 참조하지 않고 오류가 발생
    console.log(y);
    // ReferenceError: Cannot access 'y' before initialization

    let y = 2;
}