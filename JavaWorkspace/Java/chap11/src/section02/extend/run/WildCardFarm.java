package section02.extend.run;

public class WildCardFarm {
    public void anyType(RabbitFarm<?> farm) {
        // 토끼 농장에 있는 토끼가 어떤 토끼이던 상관 없다.
        farm.getAnimal().cry();
    }

    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        // 토끼농장의 토끼는 Bunny 이거나 그 후손 타입으로 만들어진 토끼농장만 매개변수로 사용 가능
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm) {
        // Bunny 이거나 그 부모타입으로 만들어진 토끼 농장만 매개변수로 사용
        farm.getAnimal().cry();
    }
}
