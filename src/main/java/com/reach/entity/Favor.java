package com.reach.entity;/**
 * Created by abc83 on 2017/3/26.
 */

/**
 * @author yangrui
 * @create 2017-03-26 21:24
 **/
public class Favor {

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
}
