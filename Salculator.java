//package ru.lessons.lesson_4;

//import ru.lessons.lesson_8.UserException;

/**
 * Класс реализует калькулятор.
 */
public class Salculator {
	/**
	 Результат вычисления.
	 */
	private int result;

	/**
	 * Суммируем аргументы.
	 * @param params Аргументы суммирования.
	 */
	public void add(int ... params) {
		for (int param : params) {
			this.result += param;
		}
	}

	/**
	 * Получить результат.
	 * @return результат вычисления.
	 */
	public int getResult() {
		return this.result;
	}

	/**
	 * Очистить результат вычисления.
	 */
	public void cleanResult() {
		this.result = 0;
	}
}