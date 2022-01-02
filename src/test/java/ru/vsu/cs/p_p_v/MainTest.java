package ru.vsu.cs.p_p_v;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void markLengthOfWords() {
        String input;
        String correct;

        input = "Придумайте сложный пароль вида Az12-67$AF2";
        correct = "Придумайте(10) сложный(7) пароль(6) вида(4) Az12(4)-67(2)$AF2(3)";
        assertEquals(correct, Main.markLengthOfWords(input));

        input = "ABCАБВ123abcабв321";
        correct = "ABCАБВ123abcабв321(18)";
        assertEquals(correct, Main.markLengthOfWords(input));

        input = "тест !!! test ??? 000 $$$ ?*;)(№*?№:";
        correct = "тест(4) !!! test(4) ??? 000(3) $$$ ?*;)(№*?№:";
        assertEquals(correct, Main.markLengthOfWords(input));

        input = "а б в a b c 9";
        correct = "а(1) б(1) в(1) a(1) b(1) c(1) 9(1)";
        assertEquals(correct, Main.markLengthOfWords(input));

        input = "(слово) !!!000!!! word+_)(*&^%%$##@!~";
        correct = "(слово(5)) !!!000(3)!!! word(4)+_)(*&^%%$##@!~";
        assertEquals(correct, Main.markLengthOfWords(input));
    }
}