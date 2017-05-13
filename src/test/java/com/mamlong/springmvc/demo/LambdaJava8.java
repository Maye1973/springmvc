package com.mamlong.springmvc.demo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * ************************************************
 * .java <br/>
 * 功能描述: <br/>
 * <p>
 * Copyright: Copyright (c) 2016-2017<br/>
 * Company: 深圳市欧瑞博电子有限公司 <br/>
 *
 * @author MaMingLong
 * @version 1.0
 * @date 2017/4/22 17:48
 * ************************************************
 */
public class LambdaJava8 {

    public static Random random = new Random(10);

    public static void main(String[] args){

        // 1.初始化Person
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            personList.add(new Person("name" + i,random.nextInt(120),(i%2 == 0 ? "0" : "1" )));
        }

        System.out.println("1.打印 personList 集合信息：");
        personList.forEach((person ->
            System.out.println(person.toString())
        ));

        System.out.println("2.personList 按照 age 降序 gender 升序 排序:");
        personList.sort((o1, o2) -> o2.getAge() - o1.getAge());
        personList.sort(Comparator.comparing(Person::getGender));
        personList.forEach((person ->
                System.out.println(person.toString())
        ));

        System.out.println("3.age 小于 60 的person:");
        personList.stream().filter(person -> person.getAge() < 60).
                collect(Collectors.toCollection(ArrayList :: new)).forEach((person ->
                System.out.println(person.toString())
        ));
    }


    static class Person{

        private String name;
        private int age;
        private String gender;

        public Person(){
            super();
        }

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
}