/* 동일한 종류의 객체를 여러 개 생성해야 하는 경우 객체 리터럴을 여러 개 생성하기 보다
클래스 문법을 통해 동일한 조율의 객체를 재생성 할 수 있다.  */
class Student {
    /* 생성자를 통해 인스턴스 생성 및 초기화 
    생성자는 1개 이상 정의 될 수 없으며 생략할 경우 암묵적으로 정의된다.
    암묵적으로 this를 반환하므로 반환문은 작성하지 않는다. */
    constructor(name) {
        this.name = name;       // 인수로 인스턴스 초기화
        this.group = 1;         // 고정 값으로 인스턴스 초기화
    }

    introduce() {
        console.log(`안녕하세요 저는 ${this.group}반 대장 ${this.name} 입니다.`);
    }
}

let student = new Student('판다');  // 인수로 초기값 전달하며 객체 생성
student.introduce();

/*  function: 클래스는 함수의 한 종류이다. */
console.log(typeof Student);
/* 생성자 메소드와 동일하다. true */
console.log(Student === Student.prototype.constructor);
/* 클래스 내부에 정의한 메소드는 클래스.prototype에 저장된다. */
console.log(Student.prototype.introduce);
/* Student에 prototype의 이름을 가지고 온다.
['constructor', 'introuduce'] */
console.log(Object.getOwnPropertyNames(Student.prototype));

/* 클래스 문법과 유사하게 기능하는 것처럼 보이는 생성자 함수를 사용할 수도 있다. */
function Teacher(name) {
    this.group = 1;
    this.name = name;
}

Teacher.prototype.introduce = function () {
    console.log(`안녕하세요 저는 ${this.group}반 선생님 ${this.name} 입니다.`)
}

let teacher = new Teacher('홍길동');
teacher.introduce();

/* 클래스 생성자를 new와 함께 호출하지 않으면 에러 발생 */
// Student();  // 에러 발생 - TypeError: Class constructor Student cannot be invoked without 'new'
Teacher();  // 에러 발생하지 않음

/* 클래스에 정의 된 메소드는 열거 불가능하다.
따라서 for..in 으로 객체 순회 시 메소드 순회 대상에서 제외된다. */
for (method in student) {
    console.log(`반복문 student: ${method}`);   // introduce 출력되지 않음
}
for (method in teacher) {
    console.log(`반복문 teacher: ${method}`);
}