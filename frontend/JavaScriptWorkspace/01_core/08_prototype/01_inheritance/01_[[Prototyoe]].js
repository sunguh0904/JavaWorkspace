// 1. [[Prototype]]

const user = {
    active: true,
    login: function() {
        console.log('로그인 되었습니다');
    }
};

const student = {
    passion: true
};

// __proto__sms [[Prototype]]의 getter, setter 이다.
// Object.getPrototypeOf, Object.setPrototypeOf를 써서 prototype을 get, set 하는 것이 좋다.
student.__proto__ = user;

console.log(student.passion);
console.log(student.active);
student.login();

// 프로토타입 체인
const class8Student = {
    classNo: 8,
    __proto__:student
};


// 프로토타입 체이닝은 순환 참조가 허용되지 않는다.
user.__proto__ = class8Student; // TypeError: Cyclic __proto__ value

console.log(class8Student.passion);
// student에서 상속

console.log(class8Student.active);
// user에서 상속