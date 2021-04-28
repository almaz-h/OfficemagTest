package ru.khalitov.FirstTask;

/**
 * Created by almaz-h on 28.04.2021.
 */
public interface MainPage {

    @Selector(xpath = ".//*[@test-attr='input_search']")
    String textInputSearch();

    @Selector(xpath = ".//*[@test-attr='button_search']")
    String buttonSearch();
}
