package HW;

import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {

        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0, answer = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        // TODO: Массив вопросов (вместо null надо написать определение массива)
        String[] questions = {"В файл с каким расширением компилируется java-файл?", "С помощью какой команды git можно получить полную копию удаленного репозитория", "Какой применяется цикл, когда не известно количество итераций?"};

        // TODO: Массив вариантов ответов
        String[][] answerOptions = {{"1. cs", "2. java", "3. class", "4. exe"},{"1. commit", "2. push", "3. clone", "4. copy"},{"1. while", "2. for", "3. loop"}};

        // TODO: Массив правильных ответов
        int[] correctAnswers = {2, 3, 1};

        // Примечание - можете придумать как хранить всю информацию в одном массиве
    
        Scanner scanner = new Scanner(System.in);
        // TODO: Цикл по всем вопросам - исправить, написать правильно
        for(int i = 0; i < questions.length; i++) {
            // TODO: Вывод вопроса на экран
            System.out.print("Вопрос: " + questions[i] + "\r\n");
            // TODO: Вывод вариантов ответов на экран
            for(int j = 0; j < answerOptions[i].length; j++) {
            System.out.print(answerOptions[i][j] + "\r\n") ;
            }
            
            System.out.print("Ваш ответ, выберите номер пункта: ");
            //TODO: Считываем с консоли ответ пользователя
            answer = Integer.parseInt(scanner.nextLine());

            //TODO: Проверяем ответ и выводим результат
            // а также увеличиваем счетчики правильных и неправильных ответов

            if (answer == correctAnswers[i]) {
            System.out.print("Правильно: " + "\r\n");
            correctCount++;
            }
            else {
            System.out.print("Не правильно: " + "\r\n");
            wrongCount++;
            }


            System.out.println();
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);


    } 

}
