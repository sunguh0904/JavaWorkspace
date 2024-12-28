/* 함수의 매개변수가 많거나 매개변수 기본값이 피룡한 경우 등 활용된다. */

/* 함수는 넘겨주는 인수의 순서가 고정되어 있어 순서가 바뀌면 문제가 생기고
* 기본 값 사용 시에도 undefined를 이용해야 한다. */
function displayProduct(producer = '아무개', width = 0, height = 0, items = []) {};
displayProduct('신사임당', undefined, undefined, ['Coffee', 'Donut']);

/* 구조 분해 할당을 이용하면 문제 해결 */
function displayProduct({ producer = '아무개', width = 0, height = 0, items = []}) {
    console.log(producer);
    console.log(width);
    console.log(width);
    console.log(height);
    console.log(items);
};

/* 함수에 전달할 객체 */
let exampleProduct = {
    items: ['Coffee', 'Donut'],
    producer: '신사임당'
};

/* 순서도 무관하고 기본 값 화룡ㅇ 시에도 별도의 처리가 불필요하다. */
displayProduct(exampleProduct);