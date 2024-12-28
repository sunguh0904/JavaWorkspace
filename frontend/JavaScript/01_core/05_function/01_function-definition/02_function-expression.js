// 함수 표현식


// 함수 표현식에서는 함수명을 생략할 수 있다.
var hello = function(name) {
    return `${name} 님 안녕하세요 :)`;
};

console.log(hello('판다'));

var calc = function add (a, b) {
    return a + b;
};

console.log(calc(3, 12));
// 함수 호출은 식별자로 이루어진다.

// console.log(add(3, 12));
// 함수명으로 호출은 불가능하다.; ReferenceError: add is not defined