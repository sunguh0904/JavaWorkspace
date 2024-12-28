// 2. 반환문(retrun)

function hello(name) {
    console.log(name);

    return `${name} 님 안녕하세요`;

    // 반환문 이후의 실행구문은 무시된다.
    console.log('나는 return 뒤에 나오지~~');
}

console.log(hello('판다'));

function func() {
    console.log('함수 호출');

    return;
    // 반환 값을 명시하지 않거나 생략할 수 있지만 undefined가 반환된다.
    // return을 적지 않아도 undefined가 반환된다.
}

console.log(func());