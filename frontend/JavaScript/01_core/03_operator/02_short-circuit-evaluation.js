// 2. 단축 평가

// 표현식을 평가하는 도중 평가 결과가 확정 된 경우 나머지 평가 과정을 생략하는 것

/*
    논리 연산자(logical operator)
    - || (OR)
    - && (AND)
    - ! (NOT)
*/

// OR, AND 연산자 표현식의 결과는 boolean이 아닐 수도 있다.
console.log('apple' || 'banana');
// 'apple'이 truthy 값 이기 때문에 true로 평가되어 'apple' 반환
console.log(false || 'banana');
console.log('apple' || false);

console.log('apple' && 'banana');
// apple이 truthy이고 그 다음 banana도 truthy이며 마지막에 결정된 banana가 반환
console.log(false && 'banana');
console.log('apple' && false);

var num = 1;

if(num % 2 == 0) {
    console.log('짝수');
} else {
    console.log('홀수');
}

num % 2 == 0 && console.log('짝수');
num % 2 == 0 || console.log('홀수');
// if문 대신 단축 평가를 사용하여 표현이 가능


// 객체를 가리키기를 기대하는 변수가 null 또는 undefined가 아닌지 확인하고
// 프로퍼티를 참조할 때 단축 평가를 유용하게 활용할 수 있다.
var obj = null;

// var val = obj.value; TypeError: Cannot read properties of null (reading 'value'); null 값의 프로퍼티를 읽어올 수 없다.

// var teacher = {
//     name : '판다',
//     age : 20,
//     // 키와 값으로 객체를 만들고, 객체의 상태를 나타내는 상태를 프로퍼티라고 한다.
// }

var val = obj && obj.value;
console.log(val);
// obj가 Falsy(null, undefined) 값이면 좌항만 실행하며 var <- null
// obj가 Truthy 값이면 var <- obj.value; 단축평가 활용