// 메소드 단축

/* ES5 */
// 메소드를 정의하려면 프로퍼티 값으로 함수를 할당한다.
var panda = {
    name: '푸바오',
    eat: function(food) {
        console.log('${this.name}은(는) ${food}를 맛있게 먹어요')
    }
};

panda.eat('대나무');

/* ES6 */
// 메소드를 정의할 때 function 키워드를 생략한 축약 표현을 사용할 수 있다.
var panda2 = {
    name: '아이바오',
    // play: function(touy){}
    play(toy) {
        console.log(`${this.name}은(는) ${toy}를 타고 놀아요`)
    }
}

panda2.play('그네');