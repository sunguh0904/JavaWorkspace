// 함수 선언문(function declaration)

function hello(name) {
    return `${name} 님 안녕하세요 :)`;
};

/*
    JS 엔진은 생성된 함수를 호출하기 위해 함수 이름과 동일한 식별자를 암묵적으로 생성하고
    거기에 함수 객체를 할당한다.
    이렇게 할당된 함수 객체를 호출할 수 있다.

    var hello = function hello(name) {
        return `${name} 님 안녕하세요 :)`;
    }
*/

console.log(hello('판다'));
// 함수를 호출한 것이 아닌, 함수가 담겨있는 식별자를 호출한 것이다. var hello << 이녀석