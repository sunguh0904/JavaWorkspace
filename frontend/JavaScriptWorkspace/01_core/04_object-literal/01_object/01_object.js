// 1. object
// 객체 리터럴을 통해 객체 생성(중괄호 내의 0개 이상의 프로퍼티 정의)

var teacher = {
    // 키: 값 쌍으로 구성된 프로퍼티
    // 프로퍼티 = 객체의 상태를 나타내는 값(data)
    name: '다람쥐',
    age: 900,

    //  메소드: 프로퍼티를 참조하고 조작할 수 있는 동작
    getInfo: function () {
        return '${this.name]은(는) ${this.age}세의 선생님 입니다.';
    }
};

console.log(typeof teacher);
console.log(teacher);

var teacher2 = {};
console.log(typeof teacher2);
console.log(teacher2);