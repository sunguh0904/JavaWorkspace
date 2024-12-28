// 1. 엄격 모드 (strict mode)

function test() {
    x = 10;
    // 암묵적으로 전역 변수가 된다.
}

test();

console.log(x);
// 10; 함수 안에서 선언 된 값이 밖에서도 적용된다.