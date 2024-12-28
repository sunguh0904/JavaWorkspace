// 1. 매개변수와 인수(parameter and arguments)

function hello(name) {
    console.log(name);
    console.log(arguments);
    // [Arguments] { '0': '판다' }; 0 번째의 값은 '판다' 이다.
    // 모든 인수는 암묵적으로 arguments 객체의 프로퍼티로 보관된다.

    return `${name} 님 안녕하세요`;
}

// 매개변수는 함수 몸체 내부에서만 참조할 수 있다.
// console.log(name); ReferenceError: name is not defined

var result = hello('판다');
console.log(result);

result = hello('판다', '다람쥐', '원숭이');
// [Arguments] { '0': '판다', '1': '다람쥐', '2': '원숭이' }
// 매개변수보다 인수가 더 많은 경우, 초과된 인수는 무시된다.
console.log(result);

result = hello();
// undefined, [Arguments] {}; 아무것도 없다. 매개변수는 존재하지만 인자를 적지 않았을 경우
console.log(result);

function hi(name = '홍길동') {
    // 인수를 전달하지 않은, undefined를 전달한 경우, ES6에서 도입된 매개변수 기본값을 사용할 수 있다.
    
    // if (arguments.length !== 1 || typeof name !== 'string' || name.length === 0) {
    //     throw new TypeError('인수는 1개의 문자열 값이어야 하며, 빈 문자열은 허용되지 않습니다.');
    // }
    return `${name} 안녕`;
}
// 매개변수에 기본값을 지정해줄 수 있다.; (name = '홍길동')

result = hi();
console.log(result);

// result = hi(''); 빈 문자열이 들어가서 에러
// result = hi('다람쥐', '원숭이', '판다'); arguments의 길이가 0 이상 이여서 에러
// result = hi(1); 매개변수가 string이 아닌 number로 들어가서 에러