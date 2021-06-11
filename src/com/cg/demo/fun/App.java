package com.cg.demo.fun;
import java.util.function.*;

public class App {
	public static void main(String[] args) {
		Function<Integer, Integer> function = num1 -> num1 * num1;
		
		System.out.println(function.apply(10));
		
		Predicate<Integer> predicate = num -> {
			if (num % 2 == 0)
				return true;
				return false;
		};
		System.out.println(predicate.test(22));
		
		Consumer<String> consumer = name ->
		System.out.println( name );
		consumer.accept("Mr.Abc");
		
		Supplier<String> supplier = () -> "Mr.Abc";
		System.out.println(supplier.get());
		}
	}



