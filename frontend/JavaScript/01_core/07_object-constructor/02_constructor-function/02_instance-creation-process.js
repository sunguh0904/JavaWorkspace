// 2. 인스턴스 생성 과정

function Student(name, hobby) {
    // 1. 암묵적으로 인스턴스가 생성되고 this에 바인딩되는 과정이 런타임 이전에 실행된다.
    console.log(this);

    // 2. this에 바인딩 되어 있는 인스턴스를 초기화 한다.
    this.name = name;
    this.hobby = hobby;
    this.getInfo = function() {
        // return `${this.name}의 취미는 ${this.hobby} 입니다.`;
        // 3. 완성된 인스턴스가 바인딩된 this가 암묵적 반횐된다.

        return {};
        // 만약 명시적으로 객체를 반환하면 암묵적인 this 반환이 무시된다. 

        return 1;
        // 명시적으로 원시값을 반환하면 원시값은 무시되고 this가 반환된다.

        // 생성자 내부에서 retrun은 생략하는 것이 기본이다.
    }
}

const studet = new Student('김우준', 'MyBatis 과제하기');
console.log(studet);