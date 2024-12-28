// for in 반복문
// 객체의 모든 키를 순회

var teacher = {
    name: '판다',
    age: 20,
    work(subject) {
        return `${this.name} 선생님이 ${subject}를 열심히 가르쳐요`;
    }
};

for (var key in teacher) {
    console.log(`key : ${key}`);
    // 프로퍼트의 키

    console.log(`teacher[key] : ${teacher[key]}`);
    // key에 해당하는 프로퍼티 값
}