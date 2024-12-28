// 3. optional chaining operator

/*
    ES11(ECMAScirpt2020)에서 도입된 연산자로
    좌항의 피연산자가 null 또는 undefind인 경우 undefined를 반환하고
    그렇지 않으면 우항의 프로퍼티 참조를 이어간다.
*/

var obj = 1;

// let val = obj.value; TypeError: Cannot read properties of null (reading 'value')

var val = obj?.value;
// ?. << 이게 있다면 optional chaining operator을 사용하겠다는 의미
console.log(val);

var str = "안녕하세요";

// var len = str && str.length;
// 0; str을 빈 문자열이라 falsy한 값으로 취급해서 빈 문자열이 len에 담긴다.

len = str?.length;

console.log(len);