// 2. 재귀 함수

/*
    함수가 자기 자신을호출하는 것을 재귀 호출이라고 한다.
    재귀 호출을 수행하는 함수인 재귀 함수는 반복되는 처리를 위해 사용한다.
*/

// 5! = 5 × 4 × 3 × 2 × 1 = 120
function factorial(n) {
    
    if(n <= 1) return 1;
    return n * factorial(n-1);
}

console.log(factorial(1));
console.log(factorial(2));
console.log(factorial(3));
console.log(factorial(4));
console.log(factorial(5));

/*
    반복문 없이 구현할 수 있다는 장점이 있지만
    무한 반복에 빠질 위험이 있고, 이로 인한 stack overflow 에러를
    발생시킬 수 있으므로 주의해야 한다.
    반복문보다 재귀 함수 사용이 직관적으로 이해하기 쉬울 때만 한정적으로
    사용하는 것이 좋다.
*/