package ch3;

import java.util.LinkedList;

/**
 * Created by apple on 9/21/15.
 */
public class Solution06 {


    static class Animal{
        private String name;
        private int priory;
        public static int order=0;

        String s;
        public Animal(String s){
            name= s;
        }
        public boolean isOlder(Animal a){
        return this.priory < a.priory;
    }
    }

    public class animalQueue {
        public LinkedList<Cat> Cats = new LinkedList<>();
        public LinkedList<Dog> Dogs = new LinkedList<>();
        public void enqueue(Animal a){
            a.priory = Animal.order;
            Animal.order++;
            if (a instanceof Dog) Dogs.addLast((Dog) a);
            else if(a instanceof Cat) Cats.addLast((Cat)a);
        }
        public Animal dequeueAny(){
            if (Dogs.size()==0 && Cats.size()==0) return null;
            if (Dogs.size()==0) return dequeueCat();
            else if(Cats.size()==0) return dequeueDog();
            if (Dogs.peek().isOlder(Cats.peek())){
                return dequeueDog();
            }else return dequeueCat();
        }
        public Dog dequeueDog(){
            return Dogs.poll();
        }
        public Cat dequeueCat(){
            return Cats.poll();
        }


    }



    class Cat extends Animal{
        public Cat(String s){
            super(s);
        }
    }
    class Dog extends Animal{
        public Dog(String s){
            super(s);
        }
    }




}
