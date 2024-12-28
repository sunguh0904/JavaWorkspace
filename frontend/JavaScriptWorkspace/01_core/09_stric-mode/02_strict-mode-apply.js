// 엄격모드 적용

/*
    전역의 선두 또는 함수 몸체의 선두에 'use strict'를 추가한다.
*/

// 'use strict';
// 스크립트 전체에 엄격모드가 적용된다.

function test() {
    'use strict';
    x = 10;
    // 'use strict';
    // 코드의 선두에 위치시키지 않으면 strict mode가 제대로 동작하지 않는다.
}

test();
console.log(x);

(function(){
    'use strict';
})();
// 즉시실행 함수