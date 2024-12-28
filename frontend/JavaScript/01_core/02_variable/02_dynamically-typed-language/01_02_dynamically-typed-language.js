// 동적 타입 언어 (dynamic / weak type language)

var test;
console.log(typeof test);
// undefined

test = 1;
console.log(typeof test);
// number

test = 'Javascript'
console.log(typeof test);
// string

test = true
console.log(typeof test);
// boolean

test = null
console.log(typeof test);
// Object (자바 스크립트의 버그이지만 기존 코드에 영향을 줄 수 있어 수정x), 원래는 null이 나오는 게 맞다.

test = Symbol();
console.log(typeof test);
// symbol

test = {};
console.log(typeof test);
// Object

test = [];
console.log(typeof test);
// Object

test = function(){};
console.log(typeof test);
// function(함수는 function으로 나온다.)