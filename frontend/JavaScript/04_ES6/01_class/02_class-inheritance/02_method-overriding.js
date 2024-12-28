class Animal {
    constructor(name, weight) {
        this.name = name;
        this.weight = weight;
    }

    eat(foodWeight) {
        this.weight += foodWeight;
        console.log(`${this.name}(은)는 ${foodWeight}kg의 식사를 하고 ${this.weight}kg이 되었습니다.`)
    }

    move(lostWeight) {
        if (this.weight > lostWeight)
            this.weight -= lostWeight;
        console.log(`${this.name}(은)는 움직임으로 인해 ${lostWeight}kg 감량되어 ${this.weight}kg이 되었습니다.`);
    }
}

class Tiger extends Animal {
    attack(target) {
        console.log(`${this.name}(은)는 ${target}(을)를 공격합니다.`);
    }

    move(target) {
        /* super.을 통해 부모 클래스의 메서드를 참조한다.
        자신의 메서드면 this.을 사용 */
        super.move(0.1);
        this.attack(target);
    }
}

let tiger = new Tiger('백두산 호랭이', 90);
tiger.move('슬픈 눈망울의 사슴');