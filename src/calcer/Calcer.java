package calcer;

public class Calcer {
	private int a;
	private int b;

	public Calcer(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {// вычисляет сумму двух чисел
		return a+b;
	}

	public int subtract() {// отнимает от первого числа второе
		return a-b;
	}

	public int mult() {// перемножает два числа
		return a * b;
	}

	public int divide() {// считает a/b
		// результат округляется до целого
		return (int) a/b;
	}

	public int power() {// возводит a в степень b
		return (int) Math.pow(a,b); // ай - яй. Это Math детка!
	}

	public int min() {// возвращает минимальное из двух чисел
		return 0;
	}

	public int max() {// возвращает максимальное из двух чисел
		return 0;
	}

	public int middle() {// считает среднее двух чисел
		// результат округляется до целого
		return 0;
	}

	public int distance() {// вычисляет эвклидово расстояние-sqrt(x^2+y^2)
		// результат округляется до целого (int) Math.sqrt(a*a+b*b);
		return 0;
	}
        public int func2a2b(){
            return 2*a+2*b;
        }

	public static void main(String[] args) {
            System.out.println(new Calcer(1,2).add());
	}
}
