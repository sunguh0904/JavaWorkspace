// 4. property 값 변경, 추가, 삭제

var kitty = {
    name: '나비'
};

// 프로퍼티 동적 추가
// 존재하지 않는 프로퍼티에 값을 할당하면
// 프로퍼티가 동적으로 생성 및 추가되고 프로퍼티 값이 할당된다.
kitty.age = 3;
kitty['like'] = '츄르';
console.log(kitty);

// 프로퍼티 수정
kitty.name = '애옹이'
kitty['age'] = 4;
console.log(kitty);

// 프로퍼티 삭제
// delete 연산자를 이용하여 프로퍼티를 삭제할 수 있다.
delete kitty.age;
delete kitty['like'];
delete kitty.zipsa;
// 존재하지 않는 프로퍼티를 삭제할 경우 아무런 에러게 안 뜬다.
console.log(kitty);