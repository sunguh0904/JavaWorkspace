// 3. 중첩 함수

/*
    함수 내부에 정의된 함수를 중첩 함수 또는 내부 함수라고 한다.
    중첩 함수를 포함하는 함수는 외부 함수라고 한다.
    일반적으로 중첩 함수는 자신을 포함하는 외부 함수를 돕는 헬퍼 함수의 역할을 한다.
*/

function outer() {
    var outerVal = '외부 함수';

    function inner() {
        var innerVal = '내부 함수';
        console.log(outerVal, innerVal);
    }

    inner();
    // 내부 함수를 호출한 것
}

outer();
// 외부 함수를 호출한 것

/*
    문이 있는 곳이면 중첩 함수 사용이 가능하나 if, for문에서 사용할 경우 호이스팅 에러가 발생할 수 있어 권장x
*/