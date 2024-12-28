// 04. undefined & null

/*
    undefiend 타입
    var 키워드로 선언한 변수는 암묵적으로 undefiend로 초기화 되므로
    변수를 선언한 이후 값을 할당하지 않은 변수를 참조하면 undefined로 반환된다.
*/

var undef;
console.log(undef);
// 권유는 하지 않는다.

/*
    null 타입
    변수에 값이 없다는 것을 의도적으로 명시할 때 사용한다
*/

var nullval = "hello world";
nullval = null;
// 이전 참조를 제거하여 더 이상 "hello world"를 참조하지 않는다.
console.log(nullval);