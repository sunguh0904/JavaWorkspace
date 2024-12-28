// 2. 계산된 프로퍼티 이름

// ES5
// 계산된 프로퍼티 이름으로 프로퍼티 키를 동적 생성하려면
// 객체 리터럴 외부에서 대괄호 표기법으 사용해야 한다.
var prefix = 'key';
var index = 0;

var obj = {};

obj[prefix + '-' + index++] = "게시글 1";
obj[prefix + '-' + index++] = "게시글 2";
obj[prefix + '-' + index++] = "게시글 3";

console.log(obj);

// ES6에서는 객체 리터럴 내부에서도 계산된 프로퍼티 이름으로 프로퍼티 키를 동적 생성할 수 잇다.
var prefix2 = "B";
var index2 = 1;

var obj2 = {
    [`${prefix2} - ${index2++}`] : "게시물 1",
    [`${prefix2} - ${index2++}`] : "게시물 2",
    [`${prefix2} - ${index2++}`] : "게시물 3",
};

console.log(obj2);