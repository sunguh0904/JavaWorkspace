// 4. 콜백 함수

/*
    함수의 매개변수를 통해 다른 함수의 내부로 전달되는 함수를 말한다.
    매개변수를 통해 함수의 외부에서 콜백 함수를 전달받은 함수를 고차 함수라고 한다.
    콜백 함수는 고차 함수에 전달되어 헬퍼 함수의 역할을 한다.
    즉, 고차 함수는 콜백 함수를 자신의 일부분으로 합성한다.
*/

function increase(value) {
    return value + 1;
}

function decrease(value) {
    return value - 1;
}

// 전달받은 함수에 전달받은 값을 적용시키는 고차 함수
function apply(func, value) {
    // 고차 함수는 매개변수를 통해 전달받을 콜백 함수의 호출 시점을 결정해서 호출한다.
    // 콜백 함수는 고차 함수에 의해 호출되며, 이때 고차 함수는 필요에 따라 콜백 함수에 인자를 전달할 수 있다.
    return func(value);
}

console.log(apply(increase, 5));
console.log(apply(decrease, 25));

// 익명 함수를 통해 고차 함수를 생성 및 호출
// 콜백 함수가 고차 함수 내부에서만 호출 된다면, 콜백 함수를 익명 함수 리터럴로 정의해
// 곧바로 고차 함수에 전달하는 것이 일반적이다.
console.log(apply(function(value) {return value ** 2;}, 7));
// **: 거듭 제곱을 의미, 7의 2제곱 = 49

/*
function(value) {
    return value ** 2;
}
*/

console.log([3, 2, 1, 5, 4].sort(function(left, right) {return right - left}));
// 뭔지는 모르겠지만 일단 내림차순 정렬 표현법이다.