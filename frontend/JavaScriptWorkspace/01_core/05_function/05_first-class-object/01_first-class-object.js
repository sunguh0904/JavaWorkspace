// 일급 객체

/*
    함수를 객체와 동일하게 사용할 수 있다는 의미이다.

    1. 무명의 리터럴로 생성할 수 있다.(즉, 런타임 시 생성 가능하다.)
    2. 변수나 자료구조(객체, 배열 등)에 저장할 수 있다.
    3. 함수의 매개변수로 전달할 수 있다.
    4. 함수의 반환 값으로 사용할 수 있다.
*/

// 1. 변수에 저장
var hello = function() {
    return '가나다라마바사';
};

// 2. 객체에 저장
var obj = { hello };

// 3. 함수의 매개변수에 저장
function repeat(func, count) {
    for (var i = 0; i < count; i++) {
        console.log(func());
    }

    // 4. 함수의 반환 값으로 사용할 수 있다.
    return function() {
        console.log(`${ count } 번 반복 완료 했습니다.`);
    }
}

var returnFunc = repeat(obj.hello, 50);
returnFunc();