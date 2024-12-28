// 2. 내장 객체 프로토타입

const num = new Number(20);

// num은 Number.prototype을 상속 받음
console.log(num.__proto__ === Number.prototype);

console.log(num.__proto__.__proto__ === Object.prototype);
// num은 Objcet의 프로토타입을 상속을 받음

console.log(num.__proto__.__proto__.__proto__ === Object.prototype);
// 프로토타입 체인 최상단에는 null이 있음

// 중복된 메소드가 있는 경우 더 가까운 프로토타입의 메소드를 호출한다.