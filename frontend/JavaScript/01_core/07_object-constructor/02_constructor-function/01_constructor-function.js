// 1. 생성자 함수

// 객체 리터럴 객체 생성

const student1 = {
    name: '성우현',
    hobby: '공부하기',
    getInfo: function() {
        return `${this.name}의 취미는 ${this.hobby} 입니다.`;
    }
}

const student2 = {
    name: '손석현',
    hobby: '복습하기',
    getInfo: function() {
        return `${this.name}의 취미는 ${this.hobby} 입니다.`;
    }
}

const student3 = {
    name: '김동일',
    hobby: '실습문제 풀기',
    getInfo: function() {
        return `${this.name}의 취미는 ${this.hobby} 입니다.`;
    }
}

// 생성자 함수에 의한 객체 생성
function Student(name, hobby) {

    // 생성자 함수 내부의 this는 생성자 함수가 생성할 인스턴스를 가리킨다.
    this.name = name;
    this.hobby = hobby;
    this.getInfo = function() {
        return `${this.name}의 취미는 ${this.hobby} 입니다.`;
    }
}

// 인스턴스 생성
const student4 = new Student('김아연', '코드 짜기');
const student5 = new Student('이유란', '프로젝트 생각하기');
const student6 = new Student('김민준', '열심히 코딩 문제 풀기');

console.log(student1.getInfo());
console.log(student2.getInfo());
console.log(student3.getInfo());
console.log(student4.getInfo());
console.log(student5.getInfo());
console.log(student6.getInfo());