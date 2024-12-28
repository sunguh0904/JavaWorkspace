/* 객체 구조 분해 할당 */

let toy = {
    productName: '티니핑',
    color: '노랑',
    price: 2500
};

/* 이름을 동일 시켜줘야 매핑이 된다. */
let { productName, color, price } = toy;

console.log(productName);
console.log(color);
console.log(price);
console.log();

/* 다른 변수명을 사용 시 기존 이름과 매핑을 동일하게 맞춰준 후 사용한다. 
* 각 변수의 서술 순서는 무관하며 { 객체 프로퍼티: 목표 변수 } 형식으로 작성할 수 있다.*/
let {color: co, price: pr, productName: pn} = toy;

console.log(pn);
console.log(co);
console.log(pr);
console.log();