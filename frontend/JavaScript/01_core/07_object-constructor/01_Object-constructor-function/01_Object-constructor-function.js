// 1. Object 생성자 함수

/*
    new 연산자와 함께 Object 생송자 함수를 호출하면 빈 객체를 생성하여 반환한다.
    빈 객체 생성 이후 프로퍼티 또는 메소드를 추가하여 객체를 완성할 수 있다.
*/

// 빈 객체 생성
const teacher = new Object();

// 프로퍼티 or 메소드 추가
teacher.name = '판다';
teacher.age = 20;

console.log(teacher);