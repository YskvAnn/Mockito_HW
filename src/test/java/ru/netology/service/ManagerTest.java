package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    public void findAllTest() {
        Manager manager = new Manager();
        String movie1 = "симсоны 1";
        String movie2 = "симсоны 2";
        String movie3 = "симсоны 3";
        String movie4 = "симсоны 4";
        String movie5 = "симсоны 5";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestLimitEquals() {
        Manager manager = new Manager();
        String movie1 = "симсоны 1";
        String movie2 = "симсоны 2";
        String movie3 = "симсоны 3";
        String movie4 = "симсоны 4";
        String movie5 = "симсоны 5";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestLimitMore() {
        Manager manager = new Manager();
        String movie1 = "симсоны 1";
        String movie2 = "симсоны 2";
        String movie3 = "симсоны 3";
        String movie4 = "симсоны 4";
        String movie5 = "симсоны 5";

        manager.add(movie1);
        manager.add(movie2);

        String[] actual = manager.findLast();
        String[] expected = {movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestLimitLess() {
        Manager manager = new Manager();
        String movie1 = "симсоны 1";
        String movie2 = "симсоны 2";
        String movie3 = "симсоны 3";
        String movie4 = "симсоны 4";
        String movie5 = "симсоны 5";
        String movie6 = "симсоны 6";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] actual = manager.findLast();
        String[] expected = {movie6, movie5, movie4, movie3, movie2};

        Assertions.assertArrayEquals(expected, actual);
    }
}









