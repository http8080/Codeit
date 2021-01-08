/*동물 공원
아이들을 위해 '동물 공원'이라는 게임을 개발하려고 합니다.

일단은 아이들이 가장 좋아하는 '고양이', '개', '돼지' 클래스를 만들텐데요. 공통적인 요소들을 모아주는 부모 클래스 AbstractAnimal을 먼저 작성하도록 하겠습니다.

AbstractAnimal 클래스에는 동물의 울음 소리를 출력하는 cry 메소드가 있는데, 동물마다 다르게 울기 때문에 추상 메소드로 선언해야 합니다. 따라서 AbstractAnimal은 일반 클래스가 아닌 추상 클래스이어야겠죠?

AbstractAnimal 추상 클래스
name 변수
동물의 이름을 담는 String 변수입니다. public final으로 설정해주세요.

생성자
생성자는 파라미터로 이름을 받고 name 변수에 지정해줍니다.

cry 메소드
동물의 울음 소리를 출력하는 추상 메소드입니다. 리턴타입은 void로 해 주세요.

자식 클래스
Cat 클래스
고양이의 울음 소리는 "야옹"입니다.

Dog 클래스
개의 울음 소리는 "왈왈"입니다.

Pig 클래스
돼지의 울음 소리는 "꿀꿀"입니다.

템플릿
Main.java
public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        
        animals.add(new Cat("맥스"));
        animals.add(new Dog("심바"));
        animals.add(new Pig("품바"));
        
        for (AbstractAnimal animal : animals) {
            System.out.print(animal.name + "의 울음 소리: ");
            animal.cry()
        }
    }
}
AbstractAnimal.java
public abstract class AbstractAnimal {

}
Cat.java
public class Cat extends AbstractAnimal {

}
Dog.java
public class Dog extends AbstractAnimal {

}
Pig.java
public class Pig extends AbstractAnimal {

}
콘솔 출력값
맥스의 울음 소리: 야옹
심바의 울음 소리: 왈왈
품바의 울음 소리: 꿀꿀*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        
        animals.add(new Cat("맥스"));
        animals.add(new Dog("심바"));
        animals.add(new Pig("품바"));
        
        for (AbstractAnimal animal : animals) {
            System.out.print(animal.name + "의 울음 소리: ");
            animal.cry();
        }
    }
}
