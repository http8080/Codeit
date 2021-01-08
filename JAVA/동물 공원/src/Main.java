/*���� ����
���̵��� ���� '���� ����'�̶�� ������ �����Ϸ��� �մϴ�.

�ϴ��� ���̵��� ���� �����ϴ� '�����', '��', '����' Ŭ������ �����ٵ���. �������� ��ҵ��� ����ִ� �θ� Ŭ���� AbstractAnimal�� ���� �ۼ��ϵ��� �ϰڽ��ϴ�.

AbstractAnimal Ŭ�������� ������ ���� �Ҹ��� ����ϴ� cry �޼ҵ尡 �ִµ�, �������� �ٸ��� ��� ������ �߻� �޼ҵ�� �����ؾ� �մϴ�. ���� AbstractAnimal�� �Ϲ� Ŭ������ �ƴ� �߻� Ŭ�����̾�߰���?

AbstractAnimal �߻� Ŭ����
name ����
������ �̸��� ��� String �����Դϴ�. public final���� �������ּ���.

������
�����ڴ� �Ķ���ͷ� �̸��� �ް� name ������ �������ݴϴ�.

cry �޼ҵ�
������ ���� �Ҹ��� ����ϴ� �߻� �޼ҵ��Դϴ�. ����Ÿ���� void�� �� �ּ���.

�ڽ� Ŭ����
Cat Ŭ����
������� ���� �Ҹ��� "�߿�"�Դϴ�.

Dog Ŭ����
���� ���� �Ҹ��� "�п�"�Դϴ�.

Pig Ŭ����
������ ���� �Ҹ��� "�ܲ�"�Դϴ�.

���ø�
Main.java
public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        
        animals.add(new Cat("�ƽ�"));
        animals.add(new Dog("�ɹ�"));
        animals.add(new Pig("ǰ��"));
        
        for (AbstractAnimal animal : animals) {
            System.out.print(animal.name + "�� ���� �Ҹ�: ");
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
�ܼ� ��°�
�ƽ��� ���� �Ҹ�: �߿�
�ɹ��� ���� �Ҹ�: �п�
ǰ���� ���� �Ҹ�: �ܲ�*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        
        animals.add(new Cat("�ƽ�"));
        animals.add(new Dog("�ɹ�"));
        animals.add(new Pig("ǰ��"));
        
        for (AbstractAnimal animal : animals) {
            System.out.print(animal.name + "�� ���� �Ҹ�: ");
            animal.cry();
        }
    }
}
