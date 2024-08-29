package home_work_5;

import java.util.Random;

public class NameGenerator {
    private static final String ENGLISH_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String RUSSIAN_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String[] HUMAN_NAMES = {
            "Иван", "Петр", "Сергей", "Анна", "Мария", "Ольга", "Дмитрий", "Алексей", "Елена", "Наталья"};
    private static final String[] ANIMAL_NAMES = {
            "Паштет", "Тиша", "Тася", "Фрося", "Рыжик", "Альфа", "Котя", "Мотя", "Люся", "Мухтар"};

    private static final Random random = new Random();

    public static String generateRandomString(int minLength, int maxLength) {
        int length = random.nextInt(maxLength - minLength + 1) + minLength;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(ENGLISH_ALPHABET.length());
            sb.append(ENGLISH_ALPHABET.charAt(index));
        }
        return sb.toString();
    }

    public static String generateRandomRussianString(int minLength, int maxLength) {
        int length = random.nextInt(maxLength - minLength + 1) + minLength;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(RUSSIAN_ALPHABET.length());
            sb.append(RUSSIAN_ALPHABET.charAt(index));
        }
        return sb.toString();
    }

    public static String generateRandomName() {
        int index = random.nextInt(HUMAN_NAMES.length);
        return HUMAN_NAMES[index];
    }

    public static String generateRandomAnimalName() {
        int index = random.nextInt(ANIMAL_NAMES.length);
        return ANIMAL_NAMES[index];
    }
}


