package com.reach.entity;/**
 * Created by abc83 on 2017/3/26.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;


import javax.annotation.Resources;

import static org.apache.naming.SelectorContext.prefix;

/**
 * @author yangrui
 * @create 2017-03-26 19:28
 **/
@ConfigurationProperties(prefix = "person")
@Component
public class PersonProperties {

    private String name;

    private Integer age;

    private String desc;

    @NestedConfigurationProperty
    private Favor favor;

    public Favor getFavor() {
        return favor;
    }

    public void setFavor(Favor favor) {
        this.favor = favor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /*public static class Favor {

        private String book;
        private String play;

        public String getBook() {
            return book;
        }

        public void setBook(String book) {
            this.book = book;
        }

        public String getPlay() {
            return play;
        }

        public void setPlay(String play) {
            this.play = play;
        }

        @Override
        public String toString() {
            return "Favor{" +
                    "book='" + book + '\'' +
                    ", play='" + play + '\'' +
                    '}';
        }
    }*/
}
