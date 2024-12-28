// 1. object 프로토타입

/*
    object는 내장 객체 생성자 함수인데 이 생성자 함수의 protorype은
    toString을 비롯한 다양한 메소드가 구현되어 잇는 거대한 객체를 참조한다.
    new Object()를 호출하거나 리터럴 문법 {property...}를 사용해 객체를 만들 때,
    새롭게 생성된 객체의 [[Prototype]]은 Object.prototype을 참조한다.
*/

const obj1 = new Object();
const obj2 = {};

console.log(obj1.__proto__ === Object.prototype);
console.log(obj2.__proto__ === Object.prototype);

console.log(obj2.toString === obj1.__proto__.toString);
console.log(obj2.toString === Object.prototype.toString);