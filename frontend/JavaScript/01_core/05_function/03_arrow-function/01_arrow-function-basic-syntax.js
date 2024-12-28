// 화살표 함수(arrow-function)

/*
    ES6에서 도입된 화살표 함수는 function 키워드 대신 화살표를 사용해 좀 더
    간략하게 함수를 선언할 수 있다.
    화살표 함수는 항상 익명 함수로 정의하며, 본문이 한 줄인 함수를 작성할 때 유용하다.
*/

var message;

// 기존 function 정의
message = function() {
    return "Hello JavaScript World";
}

console.log(message());

// 화살표 함수 정의, function 키워드 생략 가능
message = () => {
    return "Hello JavaScript World (Arrow Function)";
}

console.log(message());

// ★명령문이 하나만 있는 경우 중괄호 생략 가능★
// 이떄, 함수 몸체 내부의 실행문이 값으로 평가될 수 있는 표현식이라면
// 암묵적으로 return 되므로 return 키워드 생략 가능
message = () => "Hello JavaScript World (Arrow Function)";
console.log(message());

// 매개변수가 있는 경우 표현법
message = (val1, val2) => "Arrow " + val1 + val2;
console.log(message('Function ', 'nice'));


// 매개변수가 하나인 경우 소괄호를 생략 가능
message = val1 => "Arrow " + val1;
console.log(message("Function Good"));