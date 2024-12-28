// in 연산자
// 프로퍼티 존재 여부 확인

var actor = {
    name: '마동석',
    age: 53,
    gender: 'M',
    company: undefined
};

// 프로퍼티 존재 여부를 쉽게 확인할 수 있으나 완벽하지 않음
console.log(actor.name === undefined);
console.log(actor.age === undefined);
console.log(actor.drama === undefined);
console.log(actor.company === undefined);

// in 연산자 사용
console.log("name" in actor)
console.log("age" in actor)
console.log("drama" in actor)
console.log("company" in actor)
// actor 변수 안에 해당 프로퍼티가 존재하는지 확인