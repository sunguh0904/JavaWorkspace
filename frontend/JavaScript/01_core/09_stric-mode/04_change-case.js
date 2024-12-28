// 엄격 모드 활용(변화 상황)

// 1. 일반 함수의 this

(function(){
    'use strict';
    function test() {
        console.log(this);
    }
    test();

    new test();
})();
// 생성자 함수가아닌 일반 함수 내부에서는 this를 사용할 필요가 없으므로
// strict mode에서는 일반 함수로서 호출하면 this에 undefiden가 바인딩 된다.

// 2. arguments 객체
(function(x){
    'use strict';
    x = 2;

    console.log(arguments);
})(1);
// strict mode에서는 매개변수에 전달된 인수를 재할당하여 변경해도
// arguments 객체에는 반영되지 않는다.