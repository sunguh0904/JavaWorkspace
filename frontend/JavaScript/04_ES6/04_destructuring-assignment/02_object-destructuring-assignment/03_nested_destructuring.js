/* 중첩 구조 분해 할당 
* 배열도 있고, 객체도 있을 경우 */

let lunchSet = {
    burger: {
        main: '소고기',
        sub: '치즈',
        vegetable: '토마토'
    },
    side: ['치즈스틱', '감자튀김'],
    price: 9000
}

let { 
    burger: {
        main, 
        sub, 
        vegetable
    }, 
    side: [
        side1, 
        side2
    ], 
    price, 
    orderNo = 'order-001'
} = lunchSet;

console.log(`buger: ${main} + ${sub} + ${vegetable}`);
console.log(`side: ${side1} + ${side2}`);
console.log(price);
console.log(orderNo);