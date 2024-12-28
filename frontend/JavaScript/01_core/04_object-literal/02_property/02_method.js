// 2. method
/*
    JS의 함수는 객체이다.
    함수는 값으로 취급할 수 있고, 프로퍼티 값으로 사용할 수 있다.
*/

var dog = {
    name: '뽀삐',
    // 메소드 = 객체에 묶여 있는 함수
    eat: function(food) {
        console.log(`${this.name}(은)는 ${food}를 맛있게 먹었어요`)
    }
};

dog.eat('고구마')